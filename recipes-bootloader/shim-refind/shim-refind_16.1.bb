SUMMARY = "shim modified to boot refind"
LICENSE = "CLOSED"
#LICENSE = "MIT"
#LIC_FILES_CHKSUM = "file://LICENSE;md5=0123456789abcdef0123456789abcdef"

SRC_URI = "gitsm://github.com/rhboot/shim.git;protocol=https;nobranch=1;tag=${PV}"

S = "${WORKDIR}/git"

DEPENDS += "elfutils elfutils-native pkgconfig-native"

RDEPENDS${PN} += "elfutils"

EXTRA_OEMAKE = " PREFIX=${prefix} EFIDIR=${prefix}/efi "

inherit pkgconfig autotools-brokensep

#do_configure[noexec] = "1"

do_compile() {
    # ensure target cross-compiler is used for target objects
    export CC="${CC}"
    export CXX="${CXX}"
    export LD="${LDFLAGS:+${CC} }"

    # ensure host compiler for host tools built during the recipe
    # use SDK-provided host compiler (ccache wrapper if present)
    export HOSTCC="${HOSTCC:-${STAGING_BINDIR_NATIVE}/ccache ${STAGING_BINDIR_NATIVE}/gcc || true}"
    # fallback to native CC if HOSTCC not present
    if [ -z "${HOSTCC:-}" ] || [ ! -x "${HOSTCC%% *}" ]; then
        export HOSTCC="${CC_NATIVE:-gcc}"
    fi

    export CFLAGS="${CFLAGS} -I${STAGING_INCDIR}"
    export LDFLAGS="${LDFLAGS} -L${STAGING_LIBDIR}"

    if [ ! -f "${STAGING_DIR_TARGET}${includedir}/libelf.h" ] && [ ! -f "${STAGING_DIR_TARGET}${includedir}/libelf/libelf.h" ]; then
        bberror "FUCKIT: libelf.h not found in ${STAGING_DIR_TARGET}${includedir}"
        false
    fi

    oe_runmake CC="${CC}" CXX="${CXX}" HOSTCC="${HOSTCC}" CFLAGS="${CFLAGS} -I${STAGING_INCDIR}/libelf -I${STAGING_INCDIR} -I${STAGING_DIR_TARGET}${includedir} -I${STAGING_DIR_TARGET}${includedir}/libelf" LDFLAGS="${LDFLAGS} -L${STAGING_LIBDIR} -L${libdir}"
}

#do_install() {
#    install -d ${D}${bindir}
#    install -m 0755 myprog ${D}${bindir}/myprog
#}
#
#FILES_${PN} = "${bindir}/myprog"

COMPATIBLE_MACHINE = "(intel-corei7-64)|(intel-skylake-64)"
