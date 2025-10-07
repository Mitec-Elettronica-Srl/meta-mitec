SUMMARY = "ZeroTier network virtualization service"
DESCRIPTION = "ZeroTier is a smart programmable Ethernet switch for planet Earth. It allows \
all networked devices, VMs, containers, and applications to communicate as if they all reside \
in the same physical data center or cloud region. This is accomplished by combining a \
cryptographically addressed and secure peer to peer network (termed VL1) with an Ethernet \
emulation layer somewhat similar to VXLAN (termed VL2). Our VL2 Ethernet virtualization layer \
includes advanced enterprise SDN features like fine grained access control rules for network \
micro-segmentation and security monitoring. All ZeroTier traffic is encrypted end-to-end using \
secret keys that only you control. Most traffic flows peer to peer, though we offer free (but \
slow) relaying for users who cannot establish peer to peer connections."
HOMEPAGE = "https://www.zerotier.com/"
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
#
# The following license files were not able to be identified and are
# represented as "Unknown" below, you will need to check them yourself:
#   COPYING -  ZeroTier BSL 1.1
#   LICENSE.txt -  ZeroTier BSL 1.1
#   debian/copyright -  ZeroTier BSL 1.1
#   ext/hiredis-0.14.1/COPYING - not included
#   ext/http-parser/LICENSE-MIT - MIT
#   ext/json/LICENSE.MIT - MIT
#   ext/libnatpmp/LICENSE - MIT
#   ext/miniupnpc/LICENSE - MIT
#   ext/redis-plus-plus-1.1.1/LICENSE - not included
#
# NOTE: multiple licenses have been detected; they have been separated with &
# in the LICENSE value for now since it is a reasonable assumption that all
# of the licenses apply. If instead there is a choice between the multiple
# licenses then you should change the value to separate the licenses with |
# instead of &. If there is any doubt, check the accompanying documentation
# to determine which situation is applicable.
LICENSE = "ZeroTier_BSL_1.1 & MIT"
# Note: COPYING has been removed
LIC_FILES_CHKSUM = " \
    file://LICENSE.txt;md5=10a2f6efeb9fb6ee1dd67b697c8cbc56 \
    file://attic/historic/anode/LICENSE.txt;md5=d32239bcb673463ab874e80d47fae504 \
    file://debian/copyright;md5=f4a6ffbe72aad9cedd587bcb18904813 \
    file://ext/http-parser/LICENSE-MIT;md5=20d989143ee48a92dacde4f06bbcb59a \
    file://ext/libnatpmp/LICENSE;md5=63b8bf0fd09f4909d823a94c6e6fc06b \
    file://ext/miniupnpc/LICENSE;md5=4a95d5317ee6dac993b7598848c72c1e \
"

# detected but not included license
# file://ext/hiredis-0.14.1/COPYING;md5=d84d659a35c666d23233e54503aaea51
# file://ext/redis-plus-plus-1.1.1/LICENSE;md5=86d3f3a95c324c9479bd8986968f4327

FILESEXTRAPATHS:prepend := "${THISDIR}/files/:"

# file://0001-systemd-fix-zerotier-hanging-on-shutdown.patch
SRC_URI = " \
    git://github.com/zerotier/ZeroTierOne;protocol=https;nobranch=1 \
"

# Modify these as desired
PV = "1.16.0+git${SRCPV}"
SRCREV = "7b7d39becc4a775d33e8c0f673856fb91dea7f31"

S = "${WORKDIR}/git"

# NOTE: spec file indicates the license may be "ZeroTier BSL 1.1"

EXTRA_OEMAKE = " \
    DESTDIR=${D} \
    STRIP=echo \
"

do_compile[network] = "1"

do_install() {
	oe_runmake install
    	# install service file
	install -d ${D}${systemd_unitdir}/system
	install -c -m 0644 ${S}/debian/zerotier-one.service ${D}${systemd_unitdir}/system
}

inherit cargo_common
inherit rust-target-config

# the binary we will use
CARGO = "cargo"

# We need cargo to compile for the target
BASEDEPENDS:append = " cargo-native"

# Ensure we get the right rust variant
DEPENDS:append:class-target = " rust-native ${RUSTLIB_DEP}"
DEPENDS:append:class-nativesdk = " rust-native ${RUSTLIB_DEP}"
DEPENDS:append:class-native = " rust-native"

# In case something fails in the build process, give a bit more feedback on
# where the issue occured
export RUST_BACKTRACE = "1"

RUSTFLAGS ??= ""
BUILD_MODE = "${@['--release', ''][d.getVar('DEBUG_BUILD') == '1']}"
# --frozen flag will prevent network access (which is required since only
# the do_fetch step is authorized to access network)
# and will require an up to date Cargo.lock file.
# This force the package being built to already ship a Cargo.lock, in the end
# this is what we want, at least, for reproducibility of the build.
CARGO_BUILD_FLAGS = "-v --frozen --target ${RUST_HOST_SYS} ${BUILD_MODE} --manifest-path=${CARGO_MANIFEST_PATH}"

inherit systemd
SYSTEMD_SERVICE_${PN} = "zerotier-one.service"

# Do not enable by default. zerotier requires manual setup anyway
# Before setting up systemctl enable zerotier-one ; systemctl start zerotier-one
SYSTEMD_AUTO_ENABLE = "disable"
