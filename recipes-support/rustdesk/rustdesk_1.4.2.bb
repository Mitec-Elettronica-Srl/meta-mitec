SUMMARY = "RustDesk - Remote Desktop Software"
DESCRIPTION = "RustDesk is a remote desktop software that is open-source and easy to use."
HOMEPAGE = "https://rustdesk.com/"

#LICENSE = "AGPL-3.0-or-later"

# The license is NOT closed, but yocto refuses to build the software
LICENSE = "CLOSED"

#rustdesk-1.4.1-r0 do_populate_lic: QA Issue: rustdesk: LIC_FILES_CHKSUM points to an invalid file
#LIC_FILES_CHKSUM = "file://LICENCE;md5=4ae09d45eac4aa08d013b5f2e01c67f6"

# Updated download URL for the ARM 64-bit AppImage
SRC_URI = "https://github.com/NeroReflex/${PN}/releases/download/${PV}/${PN}-${PV}-aarch64.AppImage"
SRC_URI[md5sum] = "06f76316d2fd8b14a84e581c9f9ad7ad"
SRC_URI[sha256sum] = "817ad39f7d1e0723fea71c15f1cd6381fae5f43936dbc45a0c39b1aa38c1d270"

S = "${WORKDIR}"

RDEPENDS${PN}=" xwayland"

# Specify the target architecture
#TARGET_ARCH = "arm64"

# Set the version of RustDesk you want to use
#PV = "1.4.1"  # Updated version

do_install() {
    install -d ${D}/usr/bin
    install -m 0755 ${S}/${PN}-${PV}-aarch64.AppImage ${D}/usr/bin/rustdesk
}

# Add any additional dependencies if required
# libglib-2.0-0
# libgtk-3-0
#RDEPENDS:${PN} = " glib"

INSANE_SKIP:${PN} += "already-stripped"

# Specify the package name
PACKAGES = "${PN}"

# Ensure the package is built for i.MX8MM
COMPATIBLE_MACHINE = "arm64|(imx-nxp-bsp)"
