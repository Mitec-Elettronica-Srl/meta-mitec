#
# Copyright (C) 2024 Robert Berger - Reliable Embedded Systems e.U.
# Copyright (C) 2019 SHIMADA Hirofumi - dejiko
# SPDX-License-Identifier: MIT
#

DESCRIPTION = "An Open-Source Cross-platform Multi-protocol VPN Program"
AUTHOR = "SoftEther Project at University of Tsukuba, Japan."
HOMEPAGE = "https://github.com/SoftEtherVPN/"
SECTION = "net"
PRIORITY = "optional"
LICENSE = "GPL-2.0-only"

SRC_URI = "gitsm://github.com/SoftEtherVPN/SoftEtherVPN.git;protocol=https;nobranch=1"

S = "${WORKDIR}/git"

inherit cmake pkgconfig

EXTRA_OECMAKE:append:class-target:arm = " ${@bb.utils.contains("TUNE_FEATURES", "neon", "-DBUILD_BLAKE2_WITH_NEON=yes", "", d)}"
EXTRA_OECMAKE:append:class-target:arm64 = " -DBUILD_BLAKE2_WITH_NEON=yes  "
#EXTRA_OECMAKE:append = " -DCMAKE_C_FLAGS='${@d.getVar('CFLAGS', True)} -msse2' -DCMAKE_CXX_FLAGS='${@d.getVar('CXXFLAGS', True)} -msse2' "
