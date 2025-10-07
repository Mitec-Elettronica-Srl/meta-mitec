#
# Copyright (C) 2024 Robert Berger - Reliable Embedded Systems e.U.
# Copyright (C) 2019 SHIMADA Hirofumi - dejiko
# SPDX-License-Identifier: MIT
#

# to build native hamcorebuiler (not full softether)

require softether.inc

# sca checks which apply to this recipe
inherit sca-c-checks

inherit native

# only inherit sca if set in DISTRO_FEATURES
# inherit ${@bb.utils.contains('DISTRO_FEATURES', 'sca', 'sca', '', d)}

# in case we have forcecompile defined in DISTRO_FEATURES include a file, which enforces compile -> sca
require ${@ bb.utils.contains("DISTRO_FEATURES", "forcecompile", "conf/distro/include/force-compile.inc" , "", d)}

DEPENDS += "zlib-native ncurses-native openssl-native readline-native"
DEPENDS += "libsodium-native pkgconfig-native"

do_install() {
        # let's add the native hamcorebuilder + shared libs to native sysroot
        install -d ${D}${bindir}/
        install -m 0755    ${B}/src/hamcorebuilder/hamcorebuilder    ${D}${bindir}/hamcorebuilder
        # the hamcorebulider is dynamically linked, so we also need the .so files
        install -d ${D}${libdir}/
        install -m 0755    ${B}/libcedar.so      ${D}${libdir}/libcedar.so
        install -m 0755    ${B}/libmayaqua.so    ${D}${libdir}/libmayaqua.so
}
