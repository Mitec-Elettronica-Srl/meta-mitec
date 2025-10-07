#
# Copyright (C) 2019 Robert Berger - Reliable Embedded Systems e.U.
# Copyright (C) 2019 SHIMADA Hirofumi - dejiko
# SPDX-License-Identifier: MIT
#

require softether.inc

# in case we have forcecompile defined in DISTRO_FEATURES include a file, which enforces compile -> sca
require ${@ bb.utils.contains("DISTRO_FEATURES", "forcecompile", "conf/distro/include/force-compile.inc" , "", d)}

# this would be the right dependency:
do_compile[depends] = "softether-hamcorebuilder-native:do_populate_sysroot"

# this should put the softether-hamcorebuilder-native into our native-sysroot
#DEPENDS += " zlib ncurses softether-hamcorebuilder-native virtual/libiconv readline openssl "
DEPENDS += " zlib ncurses virtual/libiconv readline openssl libsodium"

# ERROR: Nothing RPROVIDES 'glibc-locale'
# ERROR: Nothing RPROVIDES 'virtual/libiconv'
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

do_install() {
	oe_runmake install
  
  # install service files
	install -d ${D}${systemd_unitdir}/system
	install -c -m 0644 ${S}/systemd/softether-vpnbridge.service ${D}${systemd_unitdir}/system
  install -c -m 0644 ${S}/systemd/softether-vpnclient.service ${D}${systemd_unitdir}/system
  install -c -m 0644 ${S}/systemd/softether-vpnserver.service ${D}${systemd_unitdir}/system
}

FILES:${PN} += " \
  ${bindir}/vpnbridge \
  ${libexecdir}/softether/vpnbridge/vpnbridge \
  ${libexecdir}/softether/vpnbridge/hamcore.se2 \
  ${systemd_unitdir}/system/softether-vpnbridge.service \
  ${bindir}/vpnclient \
  ${libexecdir}/softether/vpnclient/vpnclient \
  ${libexecdir}/softether/vpnclient/hamcore.se2 \
  ${systemd_unitdir}/system/softether-vpnclient.service \
  ${bindir}/vpncmd \
  ${libexecdir}/softether/vpncmd/vpncmd \
  ${libexecdir}/softether/vpncmd/hamcore.se2 \
  ${bindir}/vpnserver \
  ${libexecdir}/softether/vpnserver/vpnserver \
  ${libexecdir}/softether/vpnserver/hamcore.se2 \
  ${systemd_unitdir}/system/softether-vpnserver.service \
"

SYSTEMD_AUTO_ENABLE = "disable"
