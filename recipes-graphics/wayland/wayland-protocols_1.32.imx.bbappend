SRC_URI = "${WAYLAND_PROTOCOLS_SRC};branch=${SRCBRANCH}"
WAYLAND_PROTOCOLS_SRC ?= "git://github.com/nxp-imx/wayland-protocols-imx.git;protocol=https"
SRCBRANCH = "wayland-protocols-imx-1.37"
SRCREV = "831a5389062e56dcb1aac4a5419e55e3002aafaf"