SUMMARY = "RustDesk - Remote Desktop Software"
DESCRIPTION = "RustDesk is a remote desktop software that is open-source and easy to use."
HOMEPAGE = "https://rustdesk.com/"
LICENSE = "AGPL-3.0-or-later"
#LIC_FILES_CHKSUM = "file://LICENSE;md5=YOUR_LICENSE_MD5"

# Updated download URL for the ARM 64-bit AppImage
SRC_URI = "https://github.com/rustdesk/${PN}/releases/download/${PV}/${PN}-${PV}-aarch64.AppImage"
SRC_URI[md5sum] = "YOUR_APPIMAGE_MD5"
SRC_URI[sha256sum] = "YOUR_APPIMAGE_SHA256"

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

# Ensure the AppImage is executable
do_configure() {
    chmod +x ${D}/usr/bin/rustdesk
}

# Add any additional dependencies if required
RDEPENDS:${PN} = "libgtk-3-0 libglib-2.0-0"

# Specify the package name
PACKAGES = "${PN}"

# Ensure the package is built for i.MX8MM
COMPATIBLE_MACHINE = "arm64|(imx-nxp-bsp)"