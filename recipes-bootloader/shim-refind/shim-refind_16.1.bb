SUMMARY = "shim modified to boot refind"
LICENSE = "CLOSED"
#LICENSE = "MIT"
#LIC_FILES_CHKSUM = "file://LICENSE;md5=0123456789abcdef0123456789abcdef"

SRC_URI = "git://github.com/rhboot/shim.git;protocol=https;nobranch=1;tag=${PV}"

#S = "${WORKDIR}/mypkg-1.0"

EXTRA_OEMAKE = " PREFIX=${prefix} "

inherit autotools-brokensep

do_configure[noexec] = "1"

#do_compile() {
#    oe_runmake
#}
#
#do_install() {
#    install -d ${D}${bindir}
#    install -m 0755 myprog ${D}${bindir}/myprog
#}
#
#FILES_${PN} = "${bindir}/myprog"

COMPATIBLE_MACHINE = "(intel-corei7-64)|(intel-skylake-64)"
