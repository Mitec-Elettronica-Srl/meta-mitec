SUMMARY = "RustDesk - Remote Desktop Software"
DESCRIPTION = "RustDesk is a remote desktop software that is open-source and easy to use."
HOMEPAGE = "https://rustdesk.com/"

#LICENSE = "AGPL-3.0-or-later"
#LIC_FILES_CHKSUM = "file://rustdesk/LICENCE;md5=4ae09d45eac4aa08d013b5f2e01c67f6"
LICENSE = "CLOSED"

SRC_URI = " \
    git://github.com/rustdesk/rustdesk.git;protocol=https;nobranch=1 \
    file://vckpg.tar.gz;name=vcpkg \
    file://vendor.tar.xz;name=vendor \
"

SRCREV = "317639169359936f7f9f85ef445ec9774218772d"

SRC_URI[vcpkg.sha256sum] = "f9977705bd29970e38d3d52af6475ec1de03de0d613f37191394b12345349d14"
SRC_URI[vendor.sha256sum] = "9ac8b3406019b47ffb5e4f1315a781379666b8d332451f5ad476fda25f2c31ee"

S = "${WORKDIR}"

inherit cargo

# tell cargo class where vendor dir will be
CARGO_VENDOR_DIR = "${WORKDIR}/vendor"

# Add any additional dependencies if required
# libglib-2.0-0
# libgtk-3-0
# glib
RDEPENDS:${PN} = "  xwayland libvpx aom yuv libopus alsa-lib gtk+3 libx11 openssl pulseaudio zlib "

# libvpx-staticdev
# aom-staticdev
# yuv-staticdev
# libopus-staticdev
DEPENDS += " alsa-lib gtk+3 libx11 openssl pulseaudio zlib bindgen-cli-native clang-native pkgconfig-native yasm zip "

# Specify the target architecture
#TARGET_ARCH = "arm64"

do_compile[env] = "VCPKG=${S}/vcpkg"

do_install() {
    install -d ${D}/${libdir}
    install -m 0755 ${WORKDIR}/arm64/libsciter-gtk.so ${D}/${libdir}
}

FILES:${PN} += " \
    ${libdir}/libsciter-gtk.so \
"

INSANE_SKIP:${PN} += "already-stripped"

# Specify the package name
PACKAGES = "${PN}"

# Ensure the package is built for i.MX8MM
COMPATIBLE_MACHINE = "arm64|(imx-nxp-bsp)"
