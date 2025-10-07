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
RDEPENDS:${PN} = " readline openssl glibc-gconv-utf-16 glibc-gconv-euc-jp systemd "

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

do_install:append() {
  # we have merged usr
  rm -rf ${D}/lib

  # install service files
	install -d ${D}${systemd_unitdir}/system
	install -c -m 0644 ${S}/systemd/softether-vpnbridge.service ${D}${systemd_unitdir}/system
  install -c -m 0644 ${S}/systemd/softether-vpnclient.service ${D}${systemd_unitdir}/system
  install -c -m 0644 ${S}/systemd/softether-vpnserver.service ${D}${systemd_unitdir}/system

  # If library installs /usr/lib/libcedar.so as a real file, replace it with a symlink
  if [ -f ${D}/${libdir}/libcedar.so ] && [ ! -L ${D}/${libdir}/libcedar.so ]; then
      # detect the versioned soname file (common patterns)
      soname_file=$(readelf -a ${D}/${libdir}/libcedar.so 2>/dev/null | sed -n 's/.*SONAME.*$$\$.*\$$$.*/\\1/p' | head -n1)
      if [ -n "${soname_file}" ] && [ -f "${D}/${libdir}/${soname_file}" ]; then
          rm -f ${D}/${libdir}/libcedar.so
          ln -s ${soname_file} ${D}/${libdir}/libcedar.so
      else
          # fallback: if there is a libcedar.so.X or libcedar.so.X.Y, point to the highest match
          target=$(ls ${D}/${libdir}/libcedar.so.* 2>/dev/null | sort -V | tail -n1 || true)
          if [ -n "${target}" ]; then
              target=$(basename ${target})
              rm -f ${D}/${libdir}/libcedar.so
              ln -s ${target} ${D}/${libdir}/libcedar.so
          else
              mv ${D}/${libdir}/libcedar.so ${D}/${libdir}/libcedar.so.1
              ln -s libcedar.so.1 ${D}/${libdir}/libcedar.so
          fi
      fi
  fi

  # If library installs /usr/lib/libmayaqua.so as a real file, replace it with a symlink
  if [ -f ${D}/${libdir}/libmayaqua.so ] && [ ! -L ${D}/${libdir}/libmayaqua.so ]; then
      # detect the versioned soname file (common patterns)
      soname_file=$(readelf -a ${D}/${libdir}/libmayaqua.so 2>/dev/null | sed -n 's/.*SONAME.*$$\$.*\$$$.*/\\1/p' | head -n1)
      if [ -n "${soname_file}" ] && [ -f "${D}/${libdir}/${soname_file}" ]; then
          rm -f ${D}/${libdir}/libmayaqua.so
          ln -s ${soname_file} ${D}/${libdir}/libmayaqua.so
      else
          # fallback: if there is a libmayaqua.so.X or libmayaqua.so.X.Y, point to the highest match
          target=$(ls ${D}/${libdir}/libmayaqua.so.* 2>/dev/null | sort -V | tail -n1 || true)
          if [ -n "${target}" ]; then
              target=$(basename ${target})
              rm -f ${D}/${libdir}/libmayaqua.so
              ln -s ${target} ${D}/${libdir}/libmayaqua.so
          else
              mv ${D}/${libdir}/libmayaqua.so ${D}/${libdir}/libmayaqua.so.1
              ln -s libmayaqua.so.1 ${D}/${libdir}/libmayaqua.so
          fi
      fi
  fi
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
