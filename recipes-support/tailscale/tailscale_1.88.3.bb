SUMMARY = "Tailscale client and daemon for Linux"
HOMEPAGE = "github.com/tailscale/tailscale"
SECTION = "net"
LICENSE = "CLOSED"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=d995c1c44529856a0f35a5ad43e51cc5"

SRC_URI = "git://github.com/tailscale/tailscale.git;nobranch=1;tag=v${PV}"

inherit go-mod systemd

GO_IMPORT = "tailscale.com"
GO_WORKDIR = "${GO_IMPORT}"
GO_INSTALL = "${GO_IMPORT}/cmd/tailscale ${GO_IMPORT}/cmd/tailscaled"

FILES_${PN} += "${systemd_unitdir}/*"

do_install() {
    install -d ${D}/${bindir}
    install -d ${D}/${sbindir}
    install ${B}/bin/tailscale ${D}/${bindir}/tailscale
    install ${B}/bin/tailscaled ${D}/${sbindir}/tailscaled

    if ${@bb.utils.contains('DISTRO_FEATURES', 'systemd', 'true', 'false', d)}; then
        install -d ${D}${sysconfdir}/default/
        install -m 0644 ${WORKDIR}/build/src/${GO_IMPORT}/cmd/tailscaled/tailscaled.defaults ${D}${sysconfdir}/default/tailscaled

        install -d ${D}${systemd_unitdir}/system
        install -m 0644 ${WORKDIR}/build/src/${GO_IMPORT}/cmd/tailscaled/tailscaled.service ${D}${systemd_unitdir}/system/tailscaled.service

        install -d ${D}${sysconfdir}/systemd/system/multi-user.target.wants/

        ln -s ${systemd_unitdir}/system/tailscaled.service ${D}${sysconfdir}/systemd/system/multi-user.target.wants/tailscaled.service
    fi
}

SYSTEMD_PACKAGES = "${PN}"
SYSTEMD_SERVICE_${PN} = "tailscaled.service"
SYSTEMD_AUTO_ENABLE = "enable"
