#
# Copyright (C) 2024 Robert Berger - Reliable Embedded Systems e.U.
# SPDX-License-Identifier: MIT
#

SRCREV = "9378c341f70fca50687cd4f515a3d80bef190a8e"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a50d0469eb02a4651c9625d696b22a69"

SRC_URI:append:class-target = " file://0001-BLAKE2-use-Yocto-flags-dont-try-to-run-the-tests.patch"
SRC_URI:append:class-target = " file://0002-Cedar-hack-CMakeLists.txt.patch"
