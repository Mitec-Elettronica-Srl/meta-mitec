#
# Copyright (C) 2019 Robert Berger - Reliable Embedded Systems e.U.
# Copyright (C) 2019 SHIMADA Hirofumi - dejiko
# SPDX-License-Identifier: MIT
#

require softether.inc

# only inherit sca if set in DISTRO_FEATURES
# inherit ${@bb.utils.contains('DISTRO_FEATURES', 'sca', 'sca', '', d)}

# in case we have forcecompile defined in DISTRO_FEATURES include a file, which enforces compile -> sca
require ${@ bb.utils.contains("DISTRO_FEATURES", "forcecompile", "conf/distro/include/force-compile.inc" , "", d)}

# this would be the right dependency:
do_compile[depends] = "softether-hamcorebuilder-native:do_populate_sysroot"

# this should put the softether-hamcorebuilder-native into our native-sysroot
#DEPENDS += " zlib ncurses softether-hamcorebuilder-native virtual/libiconv readline openssl "
DEPENDS += " zlib ncurses virtual/libiconv readline openssl libsodium"

#RDEPENDS:${PN} += " virtual/libiconv readline openssl "
RDEPENDS:${PN} += " readline openssl glibc-gconv-utf-16 glibc-gconv-euc-jp systemd "

# !!!! Make sure that in your image recipe at least you add !!!!
# glibc-gconv-utf-16
# otherwise you get funny/misleading errors like these:
# -- Alert: SoftEther VPN Kernel --
# String Library Init Failed.
# Please check your locale settings and iconv() libraries.

# get rid of "useless-rpaths" sanity errors:
EXTRA_OECMAKE += "\
  -DCMAKE_SKIP_RPATH=ON \
"
# I also tried to get rid of rpaths with something like this:
# find ${S}/build/vpnclient -type f -print0 | xargs -0 chrpath --delete
# but cmake magic requires to have rpaths and is unhappy without them
# it does:
#   file(RPATH_CHECK
#         FILE "$ENV{DESTDIR}${CMAKE_INSTALL_PREFIX}/libexec/softether/vpnclient/vpnclient"
#         RPATH "/usr/lib")

PACKAGES += " \
   ${PN}-vpnbridge \
   ${PN}-vpnclient \
   ${PN}-vpncmd \
   ${PN}-vpnserver \
   ${PN}-libs \
"
# ${PN}-dbg 
# ${PN}-list-cpu-features
# ${PN}-list-cpu-features-dev
# ${PN}-list-cpu-features-staticdev
# ${PN}-libs 

# we need to remopve the .so files from -dev
# so we can put them into -libs
FILES_SOLIBSDEV = ""

FILES:${PN}-libs = "\
  ${libdir}/libmayaqua.so \
  ${libdir}/libcedar.so \
"

# this RDEPENDS does not quite seem to work for some reason
# I added glibc-gconv-utf-16 to my image recipe, which seems to work
# otherwise you get funny/misleading errors like these:
# -- Alert: SoftEther VPN Kernel --
# String Library Init Failed.
# Please check your locale settings and iconv() libraries.
RDEPENDS:pn_${PN}-libs += "glibc-locale glibc-gconv-utf-16 glibc-gconv-euc-jp"

#INSANE_SKIP:${PN}-libs = "useless-rpaths"

FILES:${PN}-vpnbridge = "\
  ${bindir}/vpnbridge \
  ${libexecdir}/softether/vpnbridge/vpnbridge \
  ${libexecdir}/softether/vpnbridge/hamcore.se2 \
  ${systemd_unitdir}/systemd/system/softether-vpnbridge.service \
"

RDEPENDS:pn_${PN}-vpnbridge = "FILES:${PN}-libs"

#INSANE_SKIP:${PN}-vpnbridge = "useless-rpaths"

FILES:${PN}-vpnclient = "\
  ${bindir}/vpnclient \
  ${libexecdir}/softether/vpnclient/vpnclient \
  ${libexecdir}/softether/vpnclient/hamcore.se2 \
  ${systemd_unitdir}/systemd/system/softether-vpnclient.service \
"

RDEPENDS:pn_${PN}-vpnclient = "FILES:${PN}-libs"

#INSANE_SKIP:${PN}-vpnclient = "useless-rpaths"

FILES:${PN}-vpncmd = "\
  ${bindir}/vpncmd \
  ${libexecdir}/softether/vpncmd/vpncmd \
  ${libexecdir}/softether/vpncmd/hamcore.se2 \
"

RDEPENDS:pn_${PN}-vpncmd = "FILES:${PN}-libs"

#INSANE_SKIP:${PN}-vpncmd = "useless-rpaths"

FILES:${PN}-vpnserver = "\
  ${bindir}/vpnserver \
  ${libexecdir}/softether/vpnserver/vpnserver \
  ${libexecdir}/softether/vpnserver/hamcore.se2 \
  ${systemd_unitdir}/systemd/system/softether-vpnserver.service \
"
RDEPENDS:pn_${PN}-vpnserver = "FILES:${PN}-libs"

#INSANE_SKIP:${PN}-vpnserver = "useless-rpaths"

#FILES:${PN}-list-cpu-features = "\
#  ${bindir}/list_cpu_features- \
#"

#INSANE_SKIP:${PN}-list-cpu-features = "useless-rpaths"

#FILES:${PN}-hamcore = "\
#  ${libdir}/softether/hamcore.se2 \
#  ${libexecdir}/softether/vpnbridge/hamcore.se2 \
#  ${libexecdir}/softether/vpnclient/hamcore.se2 \
#  ${libexecdir}/softether/vpncmd/hamcore.se2 \
#  ${libexecdir}/softether/vpnserver/hamcore.se2 \
#"

#FILES:${PN}-list-cpu-features-dev = "\
#  ${includedir}/cpu_features/* \
#  ${libdir}/cmake/* \
#"

#FILES:${PN}-list-cpu-features-staticdev = "\
#  ${libdir}/libcpu_features.a \
#"

#!!!!
FILES:${PN}-dbg += "\
  ${exec_prefix}/lib/debug/* \
"

FILES:${PN}-src += "\
  ${exec_prefix}/src/debug/* \
"

#FILES:${PN}-dev_remnove = "/usr/lib/libmayaqua.so"
#FILES:${PN}-dev_remnove = "/usr/lib/libcedar.so"
