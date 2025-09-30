SUMMARY = "RustDesk - Remote Desktop Software"
DESCRIPTION = "RustDesk is a remote desktop software that is open-source and easy to use."
HOMEPAGE = "https://rustdesk.com/"

#LICENSE = "AGPL-3.0-or-later"
#LIC_FILES_CHKSUM = "file://rustdesk/LICENCE;md5=4ae09d45eac4aa08d013b5f2e01c67f6"
LICENSE = "CLOSED"

SRC_URI = " \
    gitsm://github.com/rustdesk/rustdesk.git;protocol=https;nobranch=1;name=rustdesk \
    file://vckpg.tar.gz;name=vcpkg \
    file://vendor.tar.xz;name=vendor \
"

SRCREV = "317639169359936f7f9f85ef445ec9774218772d"

SRC_URI[vcpkg.sha256sum] = "f9977705bd29970e38d3d52af6475ec1de03de0d613f37191394b12345349d14"
SRC_URI[vendor.sha256sum] = "9ac8b3406019b47ffb5e4f1315a781379666b8d332451f5ad476fda25f2c31ee"

SRC_URI += " \
    crate://crates.io/ab_glyph/0.2.31 \
    crate://crates.io/ab_glyph_rasterizer/0.1.10 \
    crate://crates.io/addr2line/0.22.0 \
    crate://crates.io/adler/1.0.2 \
    crate://crates.io/aes/0.8.4 \
    crate://crates.io/ahash/0.8.12 \
    crate://crates.io/ahash/0.7.8 \
    crate://crates.io/aho-corasick/1.1.3 \
    crate://crates.io/alloc-no-stdlib/2.0.4 \
    crate://crates.io/alloc-stdlib/0.2.2 \
    crate://crates.io/alsa/0.9.0 \
    crate://crates.io/alsa-sys/0.3.1 \
    crate://crates.io/android-activity/0.6.0 \
    crate://crates.io/android-properties/0.2.2 \
    crate://crates.io/android-tzdata/0.1.1 \
    crate://crates.io/android-wakelock/0.1.0 \
    crate://crates.io/android_log-sys/0.3.1 \
    crate://crates.io/android_logger/0.13.3 \
    crate://crates.io/android_system_properties/0.1.5 \
    crate://crates.io/ansi_term/0.12.1 \
    crate://crates.io/anstream/0.6.14 \
    crate://crates.io/anstyle/1.0.7 \
    crate://crates.io/anstyle-parse/0.2.4 \
    crate://crates.io/anstyle-query/1.1.0 \
    crate://crates.io/anstyle-wincon/3.0.3 \
    crate://crates.io/anyhow/1.0.98 \
    crate://crates.io/arboard/3.4.0 \
    crate://crates.io/arrayref/0.3.9 \
    crate://crates.io/arrayvec/0.7.6 \
    crate://crates.io/as-raw-xcb-connection/1.0.1 \
    crate://crates.io/associative-cache/1.0.1 \
    crate://crates.io/async-broadcast/0.5.1 \
    crate://crates.io/async-channel/2.3.1 \
    crate://crates.io/async-compression/0.4.11 \
    crate://crates.io/async-executor/1.12.0 \
    crate://crates.io/async-fs/1.6.0 \
    crate://crates.io/async-io/2.3.3 \
    crate://crates.io/async-io/1.13.0 \
    crate://crates.io/async-lock/2.8.0 \
    crate://crates.io/async-lock/3.4.0 \
    crate://crates.io/async-process/1.8.1 \
    crate://crates.io/async-recursion/1.1.1 \
    crate://crates.io/async-signal/0.2.8 \
    crate://crates.io/async-task/4.7.1 \
    crate://crates.io/async-trait/0.1.80 \
    crate://crates.io/atk/0.18.0 \
    crate://crates.io/atk-sys/0.18.0 \
    crate://crates.io/atomic-waker/1.1.2 \
    crate://crates.io/atty/0.2.14 \
    crate://crates.io/auto_impl/1.3.0 \
    crate://crates.io/autocfg/0.1.8 \
    crate://crates.io/autocfg/1.3.0 \
    crate://crates.io/backtrace/0.3.73 \
    crate://crates.io/base32/0.4.0 \
    crate://crates.io/base64/0.22.1 \
    crate://crates.io/base64/0.21.7 \
    crate://crates.io/base64ct/1.6.0 \
    crate://crates.io/bindgen/0.69.4 \
    crate://crates.io/bindgen/0.71.1 \
    crate://crates.io/bindgen/0.65.1 \
    crate://crates.io/bindgen/0.59.2 \
    crate://crates.io/bit_field/0.10.2 \
    crate://crates.io/bitflags/1.3.2 \
    crate://crates.io/bitflags/2.9.1 \
    crate://crates.io/bitvec/1.0.1 \
    crate://crates.io/block/0.1.6 \
    crate://crates.io/block-buffer/0.10.4 \
    crate://crates.io/block2/0.5.1 \
    crate://crates.io/blocking/1.6.1 \
    crate://crates.io/brotli/3.5.0 \
    crate://crates.io/brotli-decompressor/2.5.1 \
    crate://crates.io/bumpalo/3.16.0 \
    crate://crates.io/bytecodec/0.4.15 \
    crate://crates.io/bytemuck/1.23.2 \
    crate://crates.io/bytemuck_derive/1.10.1 \
    crate://crates.io/byteorder/1.5.0 \
    crate://crates.io/bytes/1.10.1 \
    crate://crates.io/bzip2/0.4.4 \
    crate://crates.io/bzip2-sys/0.1.11+1.0.8 \
    crate://crates.io/cairo-rs/0.18.5 \
    crate://crates.io/cairo-sys-rs/0.18.2 \
    crate://crates.io/calloop/0.13.0 \
    crate://crates.io/calloop-wayland-source/0.3.0 \
    crate://crates.io/cc/1.2.13 \
    crate://crates.io/cesu8/1.1.0 \
    crate://crates.io/cexpr/0.6.0 \
    crate://crates.io/cfg-expr/0.15.8 \
    crate://crates.io/cfg-if/1.0.0 \
    crate://crates.io/cfg-if/0.1.10 \
    crate://crates.io/cfg_aliases/0.1.1 \
    crate://crates.io/cfg_aliases/0.2.1 \
    crate://crates.io/chrono/0.4.41 \
    crate://crates.io/cidr-utils/0.5.11 \
    crate://crates.io/cipher/0.4.4 \
    crate://crates.io/clang-sys/1.8.1 \
    crate://crates.io/clap/2.34.0 \
    crate://crates.io/clap/4.5.8 \
    crate://crates.io/clap_builder/4.5.8 \
    crate://crates.io/clap_lex/0.7.1 \
    crate://crates.io/clipboard/0.1.0 \
    crate://crates.io/clipboard-master/4.0.0-beta.6 \
    crate://crates.io/clipboard-win/5.4.0 \
    crate://crates.io/cloudabi/0.0.3 \
    crate://crates.io/cocoa/0.25.0 \
    crate://crates.io/cocoa/0.24.1 \
    crate://crates.io/cocoa/0.20.2 \
    crate://crates.io/cocoa-foundation/0.1.2 \
    crate://crates.io/color_quant/1.1.0 \
    crate://crates.io/colorchoice/1.0.1 \
    crate://crates.io/combine/4.6.7 \
    crate://crates.io/concurrent-queue/2.5.0 \
    crate://crates.io/confy/0.4.0 \
    crate://crates.io/const_fn/0.4.10 \
    crate://crates.io/const_format/0.2.32 \
    crate://crates.io/const_format_proc_macros/0.2.32 \
    crate://crates.io/constant_time_eq/0.1.5 \
    crate://crates.io/constant_time_eq/0.2.6 \
    crate://crates.io/core-foundation/0.9.4 \
    crate://crates.io/core-foundation/0.7.0 \
    crate://crates.io/core-foundation/0.10.1 \
    crate://crates.io/core-foundation-sys/0.7.0 \
    crate://crates.io/core-foundation-sys/0.8.7 \
    crate://crates.io/core-graphics/0.22.3 \
    crate://crates.io/core-graphics/0.19.2 \
    crate://crates.io/core-graphics/0.23.2 \
    crate://crates.io/core-graphics-types/0.1.3 \
    crate://crates.io/core-media-sys/0.1.2 \
    crate://crates.io/core-text/19.2.0 \
    crate://crates.io/core-video-sys/0.1.4 \
    crate://crates.io/core_maths/0.1.1 \
    crate://crates.io/coreaudio-rs/0.11.3 \
    crate://crates.io/coreaudio-sys/0.2.15 \
    crate://crates.io/cpal/0.15.3 \
    crate://crates.io/cpufeatures/0.2.12 \
    crate://crates.io/crc/3.3.0 \
    crate://crates.io/crc-catalog/2.4.0 \
    crate://crates.io/crc32fast/1.4.2 \
    crate://crates.io/crossbeam-channel/0.5.13 \
    crate://crates.io/crossbeam-deque/0.8.5 \
    crate://crates.io/crossbeam-epoch/0.9.18 \
    crate://crates.io/crossbeam-queue/0.3.11 \
    crate://crates.io/crossbeam-utils/0.8.20 \
    crate://crates.io/crunchy/0.2.2 \
    crate://crates.io/crypto-common/0.1.6 \
    crate://crates.io/ctor-lite/0.1.0 \
    crate://crates.io/ctrlc/3.4.4 \
    crate://crates.io/cursor-icon/1.2.0 \
    crate://crates.io/dashmap/6.1.0 \
    crate://crates.io/dashmap/5.5.3 \
    crate://crates.io/dasp/0.11.0 \
    crate://crates.io/dasp_envelope/0.11.0 \
    crate://crates.io/dasp_frame/0.11.0 \
    crate://crates.io/dasp_interpolate/0.11.0 \
    crate://crates.io/dasp_peak/0.11.0 \
    crate://crates.io/dasp_ring_buffer/0.11.0 \
    crate://crates.io/dasp_rms/0.11.0 \
    crate://crates.io/dasp_sample/0.11.0 \
    crate://crates.io/dasp_signal/0.11.0 \
    crate://crates.io/dasp_slice/0.11.0 \
    crate://crates.io/dasp_window/0.11.1 \
    crate://crates.io/data-encoding/2.9.0 \
    crate://crates.io/dbus/0.9.7 \
    crate://crates.io/dbus-crossroads/0.5.2 \
    crate://crates.io/debug-helper/0.3.13 \
    crate://crates.io/default-net/0.14.1 \
    crate://crates.io/default-net/0.1.0 \
    crate://crates.io/deranged/0.3.11 \
    crate://crates.io/derivative/2.2.0 \
    crate://crates.io/digest/0.10.7 \
    crate://crates.io/directories-next/2.0.0 \
    crate://crates.io/dirs/5.0.1 \
    crate://crates.io/dirs/2.0.2 \
    crate://crates.io/dirs/4.0.0 \
    crate://crates.io/dirs-next/2.0.0 \
    crate://crates.io/dirs-sys/0.3.7 \
    crate://crates.io/dirs-sys/0.4.1 \
    crate://crates.io/dirs-sys-next/0.1.2 \
    crate://crates.io/dispatch/0.2.0 \
    crate://crates.io/dlib/0.5.2 \
    crate://crates.io/dlopen/0.1.8 \
    crate://crates.io/dlopen2/0.4.1 \
    crate://crates.io/dlopen2_derive/0.2.0 \
    crate://crates.io/dlopen_derive/0.1.4 \
    crate://crates.io/dlv-list/0.3.0 \
    crate://crates.io/docopt/1.1.1 \
    crate://crates.io/downcast-rs/1.2.1 \
    crate://crates.io/dpi/0.1.1 \
    crate://crates.io/drm/0.12.0 \
    crate://crates.io/drm-ffi/0.8.0 \
    crate://crates.io/drm-fourcc/2.2.0 \
    crate://crates.io/drm-sys/0.7.0 \
    crate://crates.io/dtoa/0.4.8 \
    crate://crates.io/dunce/1.0.5 \
    crate://crates.io/ed25519/1.5.3 \
    crate://crates.io/either/1.13.0 \
    crate://crates.io/enigo/0.0.14 \
    crate://crates.io/enquote/1.1.0 \
    crate://crates.io/enum-map/2.7.3 \
    crate://crates.io/enum-map-derive/0.17.0 \
    crate://crates.io/enumflags2/0.7.10 \
    crate://crates.io/enumflags2_derive/0.7.10 \
    crate://crates.io/env_filter/0.1.3 \
    crate://crates.io/env_logger/0.10.2 \
    crate://crates.io/env_logger/0.11.6 \
    crate://crates.io/env_logger/0.9.3 \
    crate://crates.io/epoll/4.3.3 \
    crate://crates.io/equivalent/1.0.1 \
    crate://crates.io/errno/0.3.9 \
    crate://crates.io/error-code/3.2.0 \
    crate://crates.io/evdev/0.11.5 \
    crate://crates.io/event-listener/3.1.0 \
    crate://crates.io/event-listener/2.5.3 \
    crate://crates.io/event-listener/5.3.1 \
    crate://crates.io/event-listener-strategy/0.5.2 \
    crate://crates.io/exr/1.72.0 \
    crate://crates.io/fastrand/1.9.0 \
    crate://crates.io/fastrand/2.1.0 \
    crate://crates.io/fdeflate/0.3.4 \
    crate://crates.io/field-offset/0.3.6 \
    crate://crates.io/filedescriptor/0.8.2 \
    crate://crates.io/filetime/0.2.23 \
    crate://crates.io/fixedbitset/0.4.2 \
    crate://crates.io/flate2/1.0.30 \
    crate://crates.io/flexi_logger/0.27.4 \
    crate://crates.io/flume/0.11.0 \
    crate://crates.io/fnv/1.0.7 \
    crate://crates.io/fon/0.6.0 \
    crate://crates.io/fontconfig-parser/0.5.8 \
    crate://crates.io/fontdb/0.23.0 \
    crate://crates.io/foreign-types/0.3.2 \
    crate://crates.io/foreign-types/0.5.0 \
    crate://crates.io/foreign-types-macros/0.2.3 \
    crate://crates.io/foreign-types-shared/0.1.1 \
    crate://crates.io/foreign-types-shared/0.3.1 \
    crate://crates.io/form_urlencoded/1.2.1 \
    crate://crates.io/fruitbasket/0.10.0 \
    crate://crates.io/fsevent/2.1.2 \
    crate://crates.io/fsevent-sys/4.1.0 \
    crate://crates.io/fuchsia-cprng/0.1.1 \
    crate://crates.io/funty/2.0.0 \
    crate://crates.io/futures/0.3.30 \
    crate://crates.io/futures-channel/0.3.31 \
    crate://crates.io/futures-core/0.3.31 \
    crate://crates.io/futures-executor/0.3.30 \
    crate://crates.io/futures-io/0.3.31 \
    crate://crates.io/futures-lite/2.3.0 \
    crate://crates.io/futures-lite/1.13.0 \
    crate://crates.io/futures-macro/0.3.31 \
    crate://crates.io/futures-sink/0.3.31 \
    crate://crates.io/futures-task/0.3.31 \
    crate://crates.io/futures-util/0.3.31 \
    crate://crates.io/fuser/0.15.1 \
    crate://crates.io/gdk/0.18.0 \
    crate://crates.io/gdk-pixbuf/0.18.5 \
    crate://crates.io/gdk-pixbuf-sys/0.18.0 \
    crate://crates.io/gdk-sys/0.18.0 \
    crate://crates.io/gdkwayland-sys/0.18.0 \
    crate://crates.io/gdkx11-sys/0.18.0 \
    crate://crates.io/generic-array/0.14.7 \
    crate://crates.io/gethostname/0.4.3 \
    crate://crates.io/getrandom/0.3.2 \
    crate://crates.io/getrandom/0.2.15 \
    crate://crates.io/gif/0.13.1 \
    crate://crates.io/gimli/0.29.0 \
    crate://crates.io/gio/0.18.4 \
    crate://crates.io/gio-sys/0.18.1 \
    crate://crates.io/git2/0.16.1 \
    crate://crates.io/glib/0.18.5 \
    crate://crates.io/glib/0.10.3 \
    crate://crates.io/glib-macros/0.10.1 \
    crate://crates.io/glib-macros/0.18.5 \
    crate://crates.io/glib-sys/0.10.1 \
    crate://crates.io/glib-sys/0.18.1 \
    crate://crates.io/glob/0.3.1 \
    crate://crates.io/gobject-sys/0.10.0 \
    crate://crates.io/gobject-sys/0.18.0 \
    crate://crates.io/gstreamer/0.16.7 \
    crate://crates.io/gstreamer-app/0.16.5 \
    crate://crates.io/gstreamer-app-sys/0.9.1 \
    crate://crates.io/gstreamer-base/0.16.5 \
    crate://crates.io/gstreamer-base-sys/0.9.1 \
    crate://crates.io/gstreamer-sys/0.9.1 \
    crate://crates.io/gstreamer-video/0.16.7 \
    crate://crates.io/gstreamer-video-sys/0.9.1 \
    crate://crates.io/gtk/0.18.1 \
    crate://crates.io/gtk-sys/0.18.0 \
    crate://crates.io/gtk3-macros/0.18.0 \
    crate://crates.io/half/2.4.1 \
    crate://crates.io/hashbrown/0.12.3 \
    crate://crates.io/hashbrown/0.14.5 \
    crate://crates.io/hashbrown/0.15.4 \
    crate://crates.io/heck/0.4.1 \
    crate://crates.io/heck/0.3.3 \
    crate://crates.io/heck/0.5.0 \
    crate://crates.io/hermit-abi/0.3.9 \
    crate://crates.io/hermit-abi/0.5.0 \
    crate://crates.io/hermit-abi/0.4.0 \
    crate://crates.io/hermit-abi/0.1.19 \
    crate://crates.io/hex/0.4.3 \
    crate://crates.io/hmac/0.12.1 \
    crate://crates.io/home/0.5.9 \
    crate://crates.io/hound/3.5.1 \
    crate://crates.io/html-escape/0.2.13 \
    crate://crates.io/http/1.3.1 \
    crate://crates.io/http-body/1.0.1 \
    crate://crates.io/http-body-util/0.1.3 \
    crate://crates.io/httparse/1.10.1 \
    crate://crates.io/humantime/2.1.0 \
    crate://crates.io/hyper/1.6.0 \
    crate://crates.io/hyper-rustls/0.27.6 \
    crate://crates.io/hyper-tls/0.6.0 \
    crate://crates.io/hyper-util/0.1.12 \
    crate://crates.io/iana-time-zone/0.1.60 \
    crate://crates.io/iana-time-zone-haiku/0.1.2 \
    crate://crates.io/idna/0.5.0 \
    crate://crates.io/image/0.25.1 \
    crate://crates.io/image/0.24.9 \
    crate://crates.io/include_dir/0.7.4 \
    crate://crates.io/include_dir_macros/0.7.4 \
    crate://crates.io/indexmap/2.2.6 \
    crate://crates.io/inotify/0.10.2 \
    crate://crates.io/inotify-sys/0.1.5 \
    crate://crates.io/inout/0.1.3 \
    crate://crates.io/instant/0.1.13 \
    crate://crates.io/io-lifetimes/1.0.11 \
    crate://crates.io/ioctl-rs/0.1.6 \
    crate://crates.io/ipnet/2.9.0 \
    crate://crates.io/is-terminal/0.4.16 \
    crate://crates.io/is_debug/1.0.1 \
    crate://crates.io/is_terminal_polyfill/1.70.0 \
    crate://crates.io/itertools/0.12.1 \
    crate://crates.io/itertools/0.9.0 \
    crate://crates.io/itoa/1.0.11 \
    crate://crates.io/itoa/0.3.4 \
    crate://crates.io/jni/0.21.1 \
    crate://crates.io/jni-sys/0.3.0 \
    crate://crates.io/jobserver/0.1.31 \
    crate://crates.io/jpeg-decoder/0.3.1 \
    crate://crates.io/js-sys/0.3.77 \
    crate://crates.io/kcp-sys/0.1.0 \
    crate://crates.io/keepawake/0.4.3 \
    crate://crates.io/kernel32-sys/0.2.2 \
    crate://crates.io/keyboard-types/0.7.0 \
    crate://crates.io/kurbo/0.9.5 \
    crate://crates.io/lazy_static/1.5.0 \
    crate://crates.io/lazycell/1.3.0 \
    crate://crates.io/lebe/0.5.2 \
    crate://crates.io/libappindicator/0.9.0 \
    crate://crates.io/libappindicator-sys/0.9.0 \
    crate://crates.io/libc/0.2.171 \
    crate://crates.io/libdbus-sys/0.2.5 \
    crate://crates.io/libgit2-sys/0.14.2+1.5.1 \
    crate://crates.io/libloading/0.7.4 \
    crate://crates.io/libloading/0.8.4 \
    crate://crates.io/libm/0.2.8 \
    crate://crates.io/libpulse-binding/2.28.1 \
    crate://crates.io/libpulse-simple-binding/2.28.1 \
    crate://crates.io/libpulse-simple-sys/1.21.1 \
    crate://crates.io/libpulse-sys/1.21.0 \
    crate://crates.io/libredox/0.1.3 \
    crate://crates.io/libsodium-sys/0.2.7 \
    crate://crates.io/libxdo/0.6.0 \
    crate://crates.io/libxdo-sys/0.11.0 \
    crate://crates.io/libz-sys/1.1.18 \
    crate://crates.io/line-wrap/0.2.0 \
    crate://crates.io/linux-raw-sys/0.3.8 \
    crate://crates.io/linux-raw-sys/0.6.5 \
    crate://crates.io/linux-raw-sys/0.4.14 \
    crate://crates.io/lock_api/0.4.12 \
    crate://crates.io/log/0.4.22 \
    crate://crates.io/lru-slab/0.1.2 \
    crate://crates.io/mac_address/1.1.7 \
    crate://crates.io/mach2/0.4.2 \
    crate://crates.io/machine-uid/0.3.0 \
    crate://crates.io/malloc_buf/0.0.6 \
    crate://crates.io/matches/0.1.10 \
    crate://crates.io/md5/0.7.0 \
    crate://crates.io/memalloc/0.1.0 \
    crate://crates.io/memchr/2.7.4 \
    crate://crates.io/memmap2/0.9.8 \
    crate://crates.io/memoffset/0.9.1 \
    crate://crates.io/memoffset/0.7.1 \
    crate://crates.io/memoffset/0.6.5 \
    crate://crates.io/metal/0.18.0 \
    crate://crates.io/mime/0.3.17 \
    crate://crates.io/minimal-lexical/0.2.1 \
    crate://crates.io/miniz_oxide/0.7.4 \
    crate://crates.io/mio/0.8.11 \
    crate://crates.io/mio/1.0.3 \
    crate://crates.io/mozjpeg/0.10.11 \
    crate://crates.io/mozjpeg-sys/2.2.2 \
    crate://crates.io/muda/0.13.5 \
    crate://crates.io/muldiv/0.2.1 \
    crate://crates.io/nanorand/0.7.0 \
    crate://crates.io/nasm-rs/0.3.0 \
    crate://crates.io/native-tls/0.2.12 \
    crate://crates.io/native-windows-gui/1.0.13 \
    crate://crates.io/ndk/0.7.0 \
    crate://crates.io/ndk/0.9.0 \
    crate://crates.io/ndk/0.8.0 \
    crate://crates.io/ndk-context/0.1.1 \
    crate://crates.io/ndk-sys/0.4.1+23.1.7779620 \
    crate://crates.io/ndk-sys/0.6.0+11769913 \
    crate://crates.io/ndk-sys/0.5.0+25.2.9519653 \
    crate://crates.io/netlink-packet-core/0.5.0 \
    crate://crates.io/netlink-packet-route/0.15.0 \
    crate://crates.io/netlink-packet-utils/0.5.2 \
    crate://crates.io/netlink-sys/0.8.6 \
    crate://crates.io/nix/0.25.1 \
    crate://crates.io/nix/0.28.0 \
    crate://crates.io/nix/0.23.2 \
    crate://crates.io/nix/0.29.0 \
    crate://crates.io/nix/0.26.4 \
    crate://crates.io/nokhwa/0.10.7 \
    crate://crates.io/nokhwa-bindings-linux/0.1.1 \
    crate://crates.io/nokhwa-bindings-macos/0.2.2 \
    crate://crates.io/nokhwa-bindings-windows/0.4.2 \
    crate://crates.io/nokhwa-core/0.1.5 \
    crate://crates.io/nom/7.1.3 \
    crate://crates.io/ntapi/0.4.1 \
    crate://crates.io/nu-ansi-term/0.49.0 \
    crate://crates.io/nu-ansi-term/0.46.0 \
    crate://crates.io/num-bigint/0.4.6 \
    crate://crates.io/num-conv/0.1.0 \
    crate://crates.io/num-derive/0.3.3 \
    crate://crates.io/num-derive/0.4.2 \
    crate://crates.io/num-integer/0.1.46 \
    crate://crates.io/num-rational/0.3.2 \
    crate://crates.io/num-traits/0.1.43 \
    crate://crates.io/num-traits/0.2.19 \
    crate://crates.io/num_cpus/1.16.0 \
    crate://crates.io/num_enum/0.5.11 \
    crate://crates.io/num_enum/0.7.2 \
    crate://crates.io/num_enum_derive/0.7.2 \
    crate://crates.io/num_enum_derive/0.5.11 \
    crate://crates.io/num_threads/0.1.7 \
    crate://crates.io/objc/0.2.7 \
    crate://crates.io/objc-foundation/0.1.1 \
    crate://crates.io/objc-sys/0.3.5 \
    crate://crates.io/objc2/0.5.2 \
    crate://crates.io/objc2-app-kit/0.2.2 \
    crate://crates.io/objc2-cloud-kit/0.2.2 \
    crate://crates.io/objc2-contacts/0.2.2 \
    crate://crates.io/objc2-core-data/0.2.2 \
    crate://crates.io/objc2-core-image/0.2.2 \
    crate://crates.io/objc2-core-location/0.2.2 \
    crate://crates.io/objc2-encode/4.0.3 \
    crate://crates.io/objc2-foundation/0.2.2 \
    crate://crates.io/objc2-link-presentation/0.2.2 \
    crate://crates.io/objc2-metal/0.2.2 \
    crate://crates.io/objc2-quartz-core/0.2.2 \
    crate://crates.io/objc2-symbols/0.2.2 \
    crate://crates.io/objc2-ui-kit/0.2.2 \
    crate://crates.io/objc2-uniform-type-identifiers/0.2.2 \
    crate://crates.io/objc2-user-notifications/0.2.2 \
    crate://crates.io/objc_exception/0.1.2 \
    crate://crates.io/objc_id/0.1.1 \
    crate://crates.io/object/0.36.1 \
    crate://crates.io/oboe/0.6.1 \
    crate://crates.io/oboe-sys/0.6.1 \
    crate://crates.io/once_cell/1.19.0 \
    crate://crates.io/openssl/0.10.68 \
    crate://crates.io/openssl-macros/0.1.1 \
    crate://crates.io/openssl-probe/0.1.5 \
    crate://crates.io/openssl-sys/0.9.104 \
    crate://crates.io/option-ext/0.2.0 \
    crate://crates.io/orbclient/0.3.48 \
    crate://crates.io/ordered-multimap/0.4.3 \
    crate://crates.io/ordered-stream/0.2.0 \
    crate://crates.io/os-version/0.2.0 \
    crate://crates.io/os_pipe/1.2.0 \
    crate://crates.io/osascript/0.3.0 \
    crate://crates.io/overload/0.1.1 \
    crate://crates.io/owned_ttf_parser/0.25.1 \
    crate://crates.io/pam/0.7.0 \
    crate://crates.io/pam-macros/0.0.3 \
    crate://crates.io/pam-sys/1.0.0-alpha4 \
    crate://crates.io/pango/0.18.3 \
    crate://crates.io/pango-sys/0.18.0 \
    crate://crates.io/parking/2.2.0 \
    crate://crates.io/parking_lot/0.12.3 \
    crate://crates.io/parking_lot_core/0.9.10 \
    crate://crates.io/password-hash/0.4.2 \
    crate://crates.io/paste/1.0.15 \
    crate://crates.io/pbkdf2/0.11.0 \
    crate://crates.io/peeking_take_while/0.1.2 \
    crate://crates.io/percent-encoding/2.3.1 \
    crate://crates.io/petgraph/0.6.5 \
    crate://crates.io/phf/0.7.24 \
    crate://crates.io/phf/0.11.3 \
    crate://crates.io/phf_codegen/0.11.3 \
    crate://crates.io/phf_codegen/0.7.24 \
    crate://crates.io/phf_generator/0.11.3 \
    crate://crates.io/phf_generator/0.7.24 \
    crate://crates.io/phf_shared/0.11.3 \
    crate://crates.io/phf_shared/0.7.24 \
    crate://crates.io/piet/0.6.2 \
    crate://crates.io/piet-coregraphics/0.6.2 \
    crate://crates.io/pin-project/1.1.5 \
    crate://crates.io/pin-project-internal/1.1.5 \
    crate://crates.io/pin-project-lite/0.2.14 \
    crate://crates.io/pin-utils/0.1.0 \
    crate://crates.io/piper/0.2.3 \
    crate://crates.io/pkg-config/0.3.30 \
    crate://crates.io/plist/1.6.1 \
    crate://crates.io/png/0.17.13 \
    crate://crates.io/polling/3.7.2 \
    crate://crates.io/polling/2.8.0 \
    crate://crates.io/portable-pty/0.8.1 \
    crate://crates.io/powerfmt/0.2.0 \
    crate://crates.io/ppv-lite86/0.2.17 \
    crate://crates.io/pretty-hex/0.2.1 \
    crate://crates.io/prettyplease/0.2.20 \
    crate://crates.io/proc-macro-crate/0.1.5 \
    crate://crates.io/proc-macro-crate/2.0.2 \
    crate://crates.io/proc-macro-crate/1.3.1 \
    crate://crates.io/proc-macro-error/1.0.4 \
    crate://crates.io/proc-macro-error-attr/1.0.4 \
    crate://crates.io/proc-macro2/0.4.30 \
    crate://crates.io/proc-macro2/1.0.93 \
    crate://crates.io/protobuf/3.7.2 \
    crate://crates.io/protobuf-codegen/3.7.2 \
    crate://crates.io/protobuf-parse/3.7.2 \
    crate://crates.io/protobuf-support/3.7.2 \
    crate://crates.io/qoi/0.4.1 \
    crate://crates.io/qrcode-generator/4.1.9 \
    crate://crates.io/qrcodegen/1.8.0 \
    crate://crates.io/quest/0.3.0 \
    crate://crates.io/quick-xml/0.31.0 \
    crate://crates.io/quick-xml/0.34.0 \
    crate://crates.io/quick-xml/0.30.0 \
    crate://crates.io/quinn/0.11.8 \
    crate://crates.io/quinn-proto/0.11.12 \
    crate://crates.io/quinn-udp/0.5.12 \
    crate://crates.io/quote/1.0.36 \
    crate://crates.io/quote/0.6.13 \
    crate://crates.io/r-efi/5.2.0 \
    crate://crates.io/radium/0.7.0 \
    crate://crates.io/rand/0.6.5 \
    crate://crates.io/rand/0.9.0 \
    crate://crates.io/rand/0.8.5 \
    crate://crates.io/rand_chacha/0.9.0 \
    crate://crates.io/rand_chacha/0.3.1 \
    crate://crates.io/rand_chacha/0.1.1 \
    crate://crates.io/rand_core/0.6.4 \
    crate://crates.io/rand_core/0.3.1 \
    crate://crates.io/rand_core/0.4.2 \
    crate://crates.io/rand_core/0.9.3 \
    crate://crates.io/rand_hc/0.1.0 \
    crate://crates.io/rand_isaac/0.1.1 \
    crate://crates.io/rand_jitter/0.1.4 \
    crate://crates.io/rand_os/0.1.3 \
    crate://crates.io/rand_pcg/0.1.2 \
    crate://crates.io/rand_xorshift/0.1.1 \
    crate://crates.io/raw-window-handle/0.5.2 \
    crate://crates.io/raw-window-handle/0.6.2 \
    crate://crates.io/rayon/1.10.0 \
    crate://crates.io/rayon-core/1.12.1 \
    crate://crates.io/rdev/0.5.0 \
    crate://crates.io/rdrand/0.4.0 \
    crate://crates.io/redox_syscall/0.4.1 \
    crate://crates.io/redox_syscall/0.5.2 \
    crate://crates.io/redox_users/0.4.5 \
    crate://crates.io/regex/1.11.1 \
    crate://crates.io/regex-automata/0.4.9 \
    crate://crates.io/regex-syntax/0.8.5 \
    crate://crates.io/repng/0.2.2 \
    crate://crates.io/reqwest/0.12.15 \
    crate://crates.io/rgb/0.8.50 \
    crate://crates.io/ring/0.17.14 \
    crate://crates.io/ringbuf/0.3.3 \
    crate://crates.io/roxmltree/0.20.0 \
    crate://crates.io/rpassword/2.1.0 \
    crate://crates.io/rpassword/7.3.1 \
    crate://crates.io/rtoolbox/0.0.2 \
    crate://crates.io/runas/1.2.0 \
    crate://crates.io/rust-ini/0.18.0 \
    crate://crates.io/rustc-demangle/0.1.24 \
    crate://crates.io/rustc-hash/2.1.1 \
    crate://crates.io/rustc-hash/1.1.0 \
    crate://crates.io/rustc_version/0.4.0 \
    crate://crates.io/rustix/0.38.34 \
    crate://crates.io/rustix/0.37.27 \
    crate://crates.io/rustls/0.23.26 \
    crate://crates.io/rustls-native-certs/0.8.1 \
    crate://crates.io/rustls-pemfile/2.2.0 \
    crate://crates.io/rustls-pki-types/1.11.0 \
    crate://crates.io/rustls-platform-verifier/0.5.1 \
    crate://crates.io/rustls-platform-verifier-android/0.1.0 \
    crate://crates.io/rustls-webpki/0.103.1 \
    crate://crates.io/rustversion/1.0.17 \
    crate://crates.io/ryu/1.0.18 \
    crate://crates.io/same-file/1.0.6 \
    crate://crates.io/schannel/0.1.23 \
    crate://crates.io/sciter-rs/0.5.57 \
    crate://crates.io/scoped-tls/1.0.1 \
    crate://crates.io/scopeguard/1.2.0 \
    crate://crates.io/scrap/0.5.0 \
    crate://crates.io/sctk-adwaita/0.10.1 \
    crate://crates.io/security-framework/3.2.0 \
    crate://crates.io/security-framework/2.10.0 \
    crate://crates.io/security-framework-sys/2.14.0 \
    crate://crates.io/semver/1.0.23 \
    crate://crates.io/serde/1.0.203 \
    crate://crates.io/serde/0.9.15 \
    crate://crates.io/serde_derive/1.0.203 \
    crate://crates.io/serde_json/0.9.10 \
    crate://crates.io/serde_json/1.0.118 \
    crate://crates.io/serde_repr/0.1.19 \
    crate://crates.io/serde_spanned/0.6.6 \
    crate://crates.io/serde_urlencoded/0.7.1 \
    crate://crates.io/serial/0.4.0 \
    crate://crates.io/serial-core/0.4.0 \
    crate://crates.io/serial-unix/0.4.0 \
    crate://crates.io/serial-windows/0.4.0 \
    crate://crates.io/sha1/0.10.6 \
    crate://crates.io/sha2/0.10.8 \
    crate://crates.io/shadow-rs/0.21.0 \
    crate://crates.io/sharded-slab/0.1.7 \
    crate://crates.io/shared_library/0.1.9 \
    crate://crates.io/shared_memory/0.12.4 \
    crate://crates.io/shell-words/1.1.0 \
    crate://crates.io/shlex/1.3.0 \
    crate://crates.io/shutdown_hooks/0.1.0 \
    crate://crates.io/signal-hook-registry/1.4.2 \
    crate://crates.io/signature/1.6.4 \
    crate://crates.io/simd-adler32/0.3.7 \
    crate://crates.io/siphasher/1.0.1 \
    crate://crates.io/siphasher/0.2.3 \
    crate://crates.io/slab/0.4.9 \
    crate://crates.io/slotmap/1.0.7 \
    crate://crates.io/smallvec/1.15.1 \
    crate://crates.io/smithay-client-toolkit/0.19.2 \
    crate://crates.io/smol_str/0.2.2 \
    crate://crates.io/socket2/0.3.19 \
    crate://crates.io/socket2/0.4.10 \
    crate://crates.io/socket2/0.5.10 \
    crate://crates.io/sodiumoxide/0.2.7 \
    crate://crates.io/softbuffer/0.4.5 \
    crate://crates.io/spin/0.9.8 \
    crate://crates.io/static_assertions/1.1.0 \
    crate://crates.io/strict-num/0.1.1 \
    crate://crates.io/strsim/0.8.0 \
    crate://crates.io/strsim/0.10.0 \
    crate://crates.io/strsim/0.11.1 \
    crate://crates.io/strum/0.24.1 \
    crate://crates.io/strum/0.18.0 \
    crate://crates.io/strum_macros/0.24.3 \
    crate://crates.io/strum_macros/0.18.0 \
    crate://crates.io/stun_codec/0.3.5 \
    crate://crates.io/stunclient/0.4.1 \
    crate://crates.io/subtle/2.6.1 \
    crate://crates.io/syn/1.0.109 \
    crate://crates.io/syn/0.15.44 \
    crate://crates.io/syn/2.0.98 \
    crate://crates.io/sync_wrapper/1.0.2 \
    crate://crates.io/sys-locale/0.3.1 \
    crate://crates.io/sysinfo/0.29.10 \
    crate://crates.io/system-configuration/0.5.1 \
    crate://crates.io/system-configuration-sys/0.5.0 \
    crate://crates.io/system-deps/6.2.2 \
    crate://crates.io/system-deps/1.3.2 \
    crate://crates.io/system_shutdown/4.0.1 \
    crate://crates.io/tao/0.25.0 \
    crate://crates.io/tao-macros/0.1.2 \
    crate://crates.io/tap/1.0.1 \
    crate://crates.io/target-lexicon/0.12.14 \
    crate://crates.io/target_build_utils/0.3.1 \
    crate://crates.io/tauri-winrt-notification/0.1.3 \
    crate://crates.io/tempfile/3.10.1 \
    crate://crates.io/termcolor/1.4.1 \
    crate://crates.io/terminfo/0.8.0 \
    crate://crates.io/termios/0.2.2 \
    crate://crates.io/termios/0.3.3 \
    crate://crates.io/textwrap/0.11.0 \
    crate://crates.io/tfc/0.7.0 \
    crate://crates.io/thiserror/2.0.11 \
    crate://crates.io/thiserror/1.0.61 \
    crate://crates.io/thiserror-impl/2.0.11 \
    crate://crates.io/thiserror-impl/1.0.61 \
    crate://crates.io/thread_local/1.1.8 \
    crate://crates.io/tiff/0.9.1 \
    crate://crates.io/time/0.3.36 \
    crate://crates.io/time/0.1.45 \
    crate://crates.io/time-core/0.1.2 \
    crate://crates.io/time-macros/0.2.18 \
    crate://crates.io/tiny-skia/0.11.4 \
    crate://crates.io/tiny-skia-path/0.11.4 \
    crate://crates.io/tiny-xlib/0.2.4 \
    crate://crates.io/tinyvec/1.6.1 \
    crate://crates.io/tinyvec_macros/0.1.1 \
    crate://crates.io/tokio/1.44.2 \
    crate://crates.io/tokio-macros/2.5.0 \
    crate://crates.io/tokio-native-tls/0.3.1 \
    crate://crates.io/tokio-rustls/0.26.0 \
    crate://crates.io/tokio-socks/0.5.2 \
    crate://crates.io/tokio-tungstenite/0.26.2 \
    crate://crates.io/tokio-util/0.7.15 \
    crate://crates.io/toml/0.7.8 \
    crate://crates.io/toml/0.8.2 \
    crate://crates.io/toml/0.5.11 \
    crate://crates.io/toml_datetime/0.6.3 \
    crate://crates.io/toml_edit/0.19.15 \
    crate://crates.io/toml_edit/0.20.2 \
    crate://crates.io/totp-rs/5.5.1 \
    crate://crates.io/tower/0.5.2 \
    crate://crates.io/tower-layer/0.3.3 \
    crate://crates.io/tower-service/0.3.3 \
    crate://crates.io/tracing/0.1.41 \
    crate://crates.io/tracing-attributes/0.1.29 \
    crate://crates.io/tracing-core/0.1.34 \
    crate://crates.io/tracing-log/0.2.0 \
    crate://crates.io/tracing-subscriber/0.3.19 \
    crate://crates.io/trackable/0.2.24 \
    crate://crates.io/trackable/1.3.0 \
    crate://crates.io/trackable_derive/1.0.0 \
    crate://crates.io/tray-icon/0.14.3 \
    crate://crates.io/tree_magic_mini/3.1.5 \
    crate://crates.io/try-lock/0.2.5 \
    crate://crates.io/ttf-parser/0.25.1 \
    crate://crates.io/tungstenite/0.26.2 \
    crate://crates.io/typenum/1.17.0 \
    crate://crates.io/tz-rs/0.6.14 \
    crate://crates.io/tzdb/0.5.10 \
    crate://crates.io/tzdb/0.6.1 \
    crate://crates.io/tzdb_data/0.1.2 \
    crate://crates.io/uds_windows/1.1.0 \
    crate://crates.io/uname/0.1.1 \
    crate://crates.io/unic-bidi/0.9.0 \
    crate://crates.io/unic-char-property/0.9.0 \
    crate://crates.io/unic-char-range/0.9.0 \
    crate://crates.io/unic-common/0.9.0 \
    crate://crates.io/unic-ucd-bidi/0.9.0 \
    crate://crates.io/unic-ucd-version/0.9.0 \
    crate://crates.io/unicode-bidi/0.3.15 \
    crate://crates.io/unicode-ident/1.0.12 \
    crate://crates.io/unicode-normalization/0.1.23 \
    crate://crates.io/unicode-segmentation/1.11.0 \
    crate://crates.io/unicode-width/0.1.13 \
    crate://crates.io/unicode-xid/0.1.0 \
    crate://crates.io/unicode-xid/0.2.4 \
    crate://crates.io/untrusted/0.9.0 \
    crate://crates.io/url/2.5.2 \
    crate://crates.io/urlencoding/2.1.3 \
    crate://crates.io/users/0.11.0 \
    crate://crates.io/users/0.10.0 \
    crate://crates.io/utf-8/0.7.6 \
    crate://crates.io/utf8-width/0.1.7 \
    crate://crates.io/utf8parse/0.2.2 \
    crate://crates.io/utf16string/0.2.0 \
    crate://crates.io/uuid/1.16.0 \
    crate://crates.io/v4l/0.14.0 \
    crate://crates.io/v4l2-sys-mit/0.3.0 \
    crate://crates.io/valuable/0.1.1 \
    crate://crates.io/vcpkg/0.2.15 \
    crate://crates.io/vec_map/0.8.2 \
    crate://crates.io/version-compare/0.0.10 \
    crate://crates.io/version-compare/0.2.0 \
    crate://crates.io/version_check/0.9.4 \
    crate://crates.io/waker-fn/1.2.0 \
    crate://crates.io/walkdir/2.5.0 \
    crate://crates.io/wallpaper/3.2.0 \
    crate://crates.io/want/0.3.1 \
    crate://crates.io/wasi/0.10.0+wasi-snapshot-preview1 \
    crate://crates.io/wasi/0.11.0+wasi-snapshot-preview1 \
    crate://crates.io/wasi/0.14.2+wasi-0.2.4 \
    crate://crates.io/wasite/0.1.0 \
    crate://crates.io/wasm-bindgen/0.2.100 \
    crate://crates.io/wasm-bindgen-backend/0.2.100 \
    crate://crates.io/wasm-bindgen-futures/0.4.50 \
    crate://crates.io/wasm-bindgen-macro/0.2.100 \
    crate://crates.io/wasm-bindgen-macro-support/0.2.100 \
    crate://crates.io/wasm-bindgen-shared/0.2.100 \
    crate://crates.io/wayland-backend/0.3.6 \
    crate://crates.io/wayland-client/0.31.5 \
    crate://crates.io/wayland-csd-frame/0.3.0 \
    crate://crates.io/wayland-cursor/0.31.5 \
    crate://crates.io/wayland-protocols/0.32.3 \
    crate://crates.io/wayland-protocols-plasma/0.3.3 \
    crate://crates.io/wayland-protocols-wlr/0.3.3 \
    crate://crates.io/wayland-scanner/0.31.4 \
    crate://crates.io/wayland-sys/0.31.4 \
    crate://crates.io/web-sys/0.3.77 \
    crate://crates.io/web-time/1.1.0 \
    crate://crates.io/webm/1.1.0 \
    crate://crates.io/webm-sys/1.0.4 \
    crate://crates.io/webpki-root-certs/0.26.8 \
    crate://crates.io/webpki-roots/0.26.9 \
    crate://crates.io/webpki-roots/1.0.0 \
    crate://crates.io/weezl/0.1.8 \
    crate://crates.io/which/4.4.2 \
    crate://crates.io/whoami/1.6.0 \
    crate://crates.io/widestring/1.1.0 \
    crate://crates.io/win-sys/0.3.1 \
    crate://crates.io/winapi/0.3.9 \
    crate://crates.io/winapi/0.2.8 \
    crate://crates.io/winapi-build/0.1.1 \
    crate://crates.io/winapi-i686-pc-windows-gnu/0.4.0 \
    crate://crates.io/winapi-util/0.1.8 \
    crate://crates.io/winapi-x86_64-pc-windows-gnu/0.4.0 \
    crate://crates.io/windows/0.61.1 \
    crate://crates.io/windows/0.34.0 \
    crate://crates.io/windows/0.48.0 \
    crate://crates.io/windows/0.43.0 \
    crate://crates.io/windows/0.44.0 \
    crate://crates.io/windows/0.32.0 \
    crate://crates.io/windows/0.52.0 \
    crate://crates.io/windows/0.51.1 \
    crate://crates.io/windows/0.54.0 \
    crate://crates.io/windows-collections/0.2.0 \
    crate://crates.io/windows-core/0.52.0 \
    crate://crates.io/windows-core/0.51.1 \
    crate://crates.io/windows-core/0.54.0 \
    crate://crates.io/windows-core/0.61.0 \
    crate://crates.io/windows-future/0.2.0 \
    crate://crates.io/windows-implement/0.60.0 \
    crate://crates.io/windows-implement/0.52.0 \
    crate://crates.io/windows-interface/0.59.1 \
    crate://crates.io/windows-interface/0.52.0 \
    crate://crates.io/windows-link/0.1.1 \
    crate://crates.io/windows-numerics/0.2.0 \
    crate://crates.io/windows-registry/0.4.0 \
    crate://crates.io/windows-result/0.1.2 \
    crate://crates.io/windows-result/0.3.2 \
    crate://crates.io/windows-service/0.6.0 \
    crate://crates.io/windows-strings/0.3.1 \
    crate://crates.io/windows-strings/0.4.0 \
    crate://crates.io/windows-sys/0.45.0 \
    crate://crates.io/windows-sys/0.52.0 \
    crate://crates.io/windows-sys/0.48.0 \
    crate://crates.io/windows-targets/0.48.5 \
    crate://crates.io/windows-targets/0.52.5 \
    crate://crates.io/windows-targets/0.53.0 \
    crate://crates.io/windows-targets/0.42.2 \
    crate://crates.io/windows-version/0.1.1 \
    crate://crates.io/windows-win/3.0.0 \
    crate://crates.io/windows_aarch64_gnullvm/0.53.0 \
    crate://crates.io/windows_aarch64_gnullvm/0.52.5 \
    crate://crates.io/windows_aarch64_gnullvm/0.42.2 \
    crate://crates.io/windows_aarch64_gnullvm/0.48.5 \
    crate://crates.io/windows_aarch64_msvc/0.52.5 \
    crate://crates.io/windows_aarch64_msvc/0.53.0 \
    crate://crates.io/windows_aarch64_msvc/0.42.2 \
    crate://crates.io/windows_aarch64_msvc/0.48.5 \
    crate://crates.io/windows_aarch64_msvc/0.34.0 \
    crate://crates.io/windows_aarch64_msvc/0.32.0 \
    crate://crates.io/windows_i686_gnu/0.48.5 \
    crate://crates.io/windows_i686_gnu/0.34.0 \
    crate://crates.io/windows_i686_gnu/0.32.0 \
    crate://crates.io/windows_i686_gnu/0.52.5 \
    crate://crates.io/windows_i686_gnu/0.42.2 \
    crate://crates.io/windows_i686_gnu/0.53.0 \
    crate://crates.io/windows_i686_gnullvm/0.53.0 \
    crate://crates.io/windows_i686_gnullvm/0.52.5 \
    crate://crates.io/windows_i686_msvc/0.42.2 \
    crate://crates.io/windows_i686_msvc/0.48.5 \
    crate://crates.io/windows_i686_msvc/0.34.0 \
    crate://crates.io/windows_i686_msvc/0.32.0 \
    crate://crates.io/windows_i686_msvc/0.52.5 \
    crate://crates.io/windows_i686_msvc/0.53.0 \
    crate://crates.io/windows_x86_64_gnu/0.53.0 \
    crate://crates.io/windows_x86_64_gnu/0.32.0 \
    crate://crates.io/windows_x86_64_gnu/0.52.5 \
    crate://crates.io/windows_x86_64_gnu/0.42.2 \
    crate://crates.io/windows_x86_64_gnu/0.48.5 \
    crate://crates.io/windows_x86_64_gnu/0.34.0 \
    crate://crates.io/windows_x86_64_gnullvm/0.52.5 \
    crate://crates.io/windows_x86_64_gnullvm/0.53.0 \
    crate://crates.io/windows_x86_64_gnullvm/0.42.2 \
    crate://crates.io/windows_x86_64_gnullvm/0.48.5 \
    crate://crates.io/windows_x86_64_msvc/0.53.0 \
    crate://crates.io/windows_x86_64_msvc/0.48.5 \
    crate://crates.io/windows_x86_64_msvc/0.34.0 \
    crate://crates.io/windows_x86_64_msvc/0.32.0 \
    crate://crates.io/windows_x86_64_msvc/0.52.5 \
    crate://crates.io/windows_x86_64_msvc/0.42.2 \
    crate://crates.io/winit/0.30.9 \
    crate://crates.io/winnow/0.5.40 \
    crate://crates.io/winreg/0.10.1 \
    crate://crates.io/winreg/0.11.0 \
    crate://crates.io/winres/0.1.12 \
    crate://crates.io/wit-bindgen-rt/0.39.0 \
    crate://crates.io/wl-clipboard-rs/0.9.0 \
    crate://crates.io/wol-rs/1.0.1 \
    crate://crates.io/wyz/0.5.1 \
    crate://crates.io/x11/2.19.0 \
    crate://crates.io/x11/2.21.0 \
    crate://crates.io/x11-clipboard/0.9.2 \
    crate://crates.io/x11-dl/2.21.0 \
    crate://crates.io/x11rb/0.12.0 \
    crate://crates.io/x11rb/0.13.1 \
    crate://crates.io/x11rb-protocol/0.13.1 \
    crate://crates.io/x11rb-protocol/0.12.0 \
    crate://crates.io/xattr/1.4.0 \
    crate://crates.io/xcursor/0.3.10 \
    crate://crates.io/xdg-home/1.2.0 \
    crate://crates.io/xkbcommon-dl/0.4.2 \
    crate://crates.io/xkeysym/0.2.1 \
    crate://crates.io/zbus/3.15.2 \
    crate://crates.io/zbus_macros/3.15.2 \
    crate://crates.io/zbus_names/2.6.1 \
    crate://crates.io/zerocopy/0.7.34 \
    crate://crates.io/zerocopy/0.8.26 \
    crate://crates.io/zerocopy-derive/0.7.34 \
    crate://crates.io/zerocopy-derive/0.8.26 \
    crate://crates.io/zeroize/1.8.1 \
    crate://crates.io/zip/0.6.6 \
    crate://crates.io/zstd/0.13.1 \
    crate://crates.io/zstd/0.11.2+zstd.1.5.2 \
    crate://crates.io/zstd-safe/5.0.2+zstd.1.5.2 \
    crate://crates.io/zstd-safe/7.1.0 \
    crate://crates.io/zstd-sys/2.0.11+zstd.1.5.6 \
    crate://crates.io/zune-inflate/0.2.54 \
    crate://crates.io/zvariant/3.15.2 \
    crate://crates.io/zvariant_derive/3.15.2 \
    crate://crates.io/zvariant_utils/1.0.1 \
    crate://crates.io/flutter_rust_bridge/1.80.1 \
    crate://crates.io/flutter_rust_bridge_macros/1.82.6 \
    crate://crates.io/rubato/0.12.0 \
    crate://crates.io/samplerate/0.2.4 \
    crate://crates.io/libsamplerate-sys/0.1.12 \
    crate://crates.io/page_size/0.6.0 \
    crate://crates.io/gethostname/0.3.0 \
    crate://crates.io/winapi-wsapoll/0.1.2 \
    crate://crates.io/bitmask-enum/2.2.4 \
    crate://crates.io/block2/0.2.0-alpha.6 \
"

SRC_URI[flutter_rust_bridge-1.80.1.sha256sum] = "fd0305ebc9f097d9826530a55fc2acd63222e912c663f7adce3ab641ecc0f346"
SRC_URI[flutter_rust_bridge_macros-1.82.6.sha256sum] ="a7fe743d921bedf4578b9472346d03a9643a01cd565ca7df7961baebad534ba5"
SRC_URI[rubato-0.12.0.sha256sum] = "cd70209c27d5b08f5528bdc779ea3ffb418954e28987f9f9775c6eac41003f9c"
SRC_URI[samplerate-0.2.4.sha256sum] = "e032b2b24715c4f982f483ea3abdb3c9ba444d9f63e87b2843d6f998f5ba2698"
SRC_URI[libsamplerate-sys-0.1.12.sha256sum] = "28853b399f78f8281cd88d333b54a63170c4275f6faea66726a2bea5cca72e0d"
SRC_URI[page_size-0.6.0.sha256sum] = "30d5b2194ed13191c1999ae0704b7839fb18384fa22e49b57eeaa97d79ce40da"
SRC_URI[gethostname-0.3.0.sha256sum] = "bb65d4ba3173c56a500b555b532f72c42e8d1fe64962b518897f8959fae2c177"
SRC_URI[winapi-wsapoll-0.1.2.sha256sum] = "1eafc5f679c576995526e81635d0cf9695841736712b4e892f87abbe6fed3f28"
SRC_URI[bitmask-enum-2.2.4.sha256sum] = "afb15541e888071f64592c0b4364fdff21b7cb0a247f984296699351963a8721"
#SRC_URI[block2-0.2.0-alpha.6.sha256sum] = ""

SRC_URI[ab_glyph-0.2.31.sha256sum] = "e074464580a518d16a7126262fffaaa47af89d4099d4cb403f8ed938ba12ee7d"
SRC_URI[ab_glyph_rasterizer-0.1.10.sha256sum] = "366ffbaa4442f4684d91e2cd7c5ea7c4ed8add41959a31447066e279e432b618"
SRC_URI[addr2line-0.22.0.sha256sum] = "6e4503c46a5c0c7844e948c9a4d6acd9f50cccb4de1c48eb9e291ea17470c678"
SRC_URI[adler-1.0.2.sha256sum] = "f26201604c87b1e01bd3d98f8d5d9a8fcbb815e8cedb41ffccbeb4bf593a35fe"
SRC_URI[aes-0.8.4.sha256sum] = "b169f7a6d4742236a0a00c541b845991d0ac43e546831af1249753ab4c3aa3a0"
SRC_URI[ahash-0.8.12.sha256sum] = "5a15f179cd60c4584b8a8c596927aadc462e27f2ca70c04e0071964a73ba7a75"
SRC_URI[ahash-0.7.8.sha256sum] = "891477e0c6a8957309ee5c45a6368af3ae14bb510732d2684ffa19af310920f9"
SRC_URI[aho-corasick-1.1.3.sha256sum] = "8e60d3430d3a69478ad0993f19238d2df97c507009a52b3c10addcd7f6bcb916"
SRC_URI[alloc-no-stdlib-2.0.4.sha256sum] = "cc7bb162ec39d46ab1ca8c77bf72e890535becd1751bb45f64c597edb4c8c6b3"
SRC_URI[alloc-stdlib-0.2.2.sha256sum] = "94fb8275041c72129eb51b7d0322c29b8387a0386127718b096429201a5d6ece"
SRC_URI[alsa-0.9.0.sha256sum] = "37fe60779335388a88c01ac6c3be40304d1e349de3ada3b15f7808bb90fa9dce"
SRC_URI[alsa-sys-0.3.1.sha256sum] = "db8fee663d06c4e303404ef5f40488a53e062f89ba8bfed81f42325aafad1527"
SRC_URI[android-activity-0.6.0.sha256sum] = "ef6978589202a00cd7e118380c448a08b6ed394c3a8df3a430d0898e3a42d046"
SRC_URI[android-properties-0.2.2.sha256sum] = "fc7eb209b1518d6bb87b283c20095f5228ecda460da70b44f0802523dea6da04"
SRC_URI[android-tzdata-0.1.1.sha256sum] = "e999941b234f3131b00bc13c22d06e8c5ff726d1b6318ac7eb276997bbb4fef0"
SRC_URI[android-wakelock-0.1.0.sha256sum] = "296e5b7c23adb32743194b1810604b772f2be10f0b0387365cb3ba09cd5c1851"
SRC_URI[android_log-sys-0.3.1.sha256sum] = "5ecc8056bf6ab9892dcd53216c83d1597487d7dacac16c8df6b877d127df9937"
SRC_URI[android_logger-0.13.3.sha256sum] = "c494134f746c14dc653a35a4ea5aca24ac368529da5370ecf41fe0341c35772f"
SRC_URI[android_system_properties-0.1.5.sha256sum] = "819e7219dbd41043ac279b19830f2efc897156490d7fd6ea916720117ee66311"
SRC_URI[ansi_term-0.12.1.sha256sum] = "d52a9bb7ec0cf484c551830a7ce27bd20d67eac647e1befb56b0be4ee39a55d2"
SRC_URI[anstream-0.6.14.sha256sum] = "418c75fa768af9c03be99d17643f93f79bbba589895012a80e3452a19ddda15b"
SRC_URI[anstyle-1.0.7.sha256sum] = "038dfcf04a5feb68e9c60b21c9625a54c2c0616e79b72b0fd87075a056ae1d1b"
SRC_URI[anstyle-parse-0.2.4.sha256sum] = "c03a11a9034d92058ceb6ee011ce58af4a9bf61491aa7e1e59ecd24bd40d22d4"
SRC_URI[anstyle-query-1.1.0.sha256sum] = "ad186efb764318d35165f1758e7dcef3b10628e26d41a44bc5550652e6804391"
SRC_URI[anstyle-wincon-3.0.3.sha256sum] = "61a38449feb7068f52bb06c12759005cf459ee52bb4adc1d5a7c4322d716fb19"
SRC_URI[anyhow-1.0.98.sha256sum] = "e16d2d3311acee920a9eb8d33b8cbc1787ce4a264e85f964c2404b969bdcd487"
SRC_URI[arboard-3.4.0.sha256sum] = "9fb4009533e8ff8f1450a5bcbc30f4242a1d34442221f72314bea1f5dc9c7f89"
SRC_URI[arrayref-0.3.9.sha256sum] = "76a2e8124351fda1ef8aaaa3bbd7ebbcb486bbcd4225aca0aa0d84bb2db8fecb"
SRC_URI[arrayvec-0.7.6.sha256sum] = "7c02d123df017efcdfbd739ef81735b36c5ba83ec3c59c80a9d7ecc718f92e50"
SRC_URI[as-raw-xcb-connection-1.0.1.sha256sum] = "175571dd1d178ced59193a6fc02dde1b972eb0bc56c892cde9beeceac5bf0f6b"
SRC_URI[associative-cache-1.0.1.sha256sum] = "46016233fc1bb55c23b856fe556b7db6ccd05119a0a392e04f0b3b7c79058f16"
SRC_URI[async-broadcast-0.5.1.sha256sum] = "7c48ccdbf6ca6b121e0f586cbc0e73ae440e56c67c30fa0873b4e110d9c26d2b"
SRC_URI[async-channel-2.3.1.sha256sum] = "89b47800b0be77592da0afd425cc03468052844aff33b84e33cc696f64e77b6a"
SRC_URI[async-compression-0.4.11.sha256sum] = "cd066d0b4ef8ecb03a55319dc13aa6910616d0f44008a045bb1835af830abff5"
SRC_URI[async-executor-1.12.0.sha256sum] = "c8828ec6e544c02b0d6691d21ed9f9218d0384a82542855073c2a3f58304aaf0"
SRC_URI[async-fs-1.6.0.sha256sum] = "279cf904654eeebfa37ac9bb1598880884924aab82e290aa65c9e77a0e142e06"
SRC_URI[async-io-2.3.3.sha256sum] = "0d6baa8f0178795da0e71bc42c9e5d13261aac7ee549853162e66a241ba17964"
SRC_URI[async-io-1.13.0.sha256sum] = "0fc5b45d93ef0529756f812ca52e44c221b35341892d3dcc34132ac02f3dd2af"
SRC_URI[async-lock-2.8.0.sha256sum] = "287272293e9d8c41773cec55e365490fe034813a2f172f502d6ddcf75b2f582b"
SRC_URI[async-lock-3.4.0.sha256sum] = "ff6e472cdea888a4bd64f342f09b3f50e1886d32afe8df3d663c01140b811b18"
SRC_URI[async-process-1.8.1.sha256sum] = "ea6438ba0a08d81529c69b36700fa2f95837bfe3e776ab39cde9c14d9149da88"
SRC_URI[async-recursion-1.1.1.sha256sum] = "3b43422f69d8ff38f95f1b2bb76517c91589a924d1559a0e935d7c8ce0274c11"
SRC_URI[async-signal-0.2.8.sha256sum] = "794f185324c2f00e771cd9f1ae8b5ac68be2ca7abb129a87afd6e86d228bc54d"
SRC_URI[async-task-4.7.1.sha256sum] = "8b75356056920673b02621b35afd0f7dda9306d03c79a30f5c56c44cf256e3de"
SRC_URI[async-trait-0.1.80.sha256sum] = "c6fa2087f2753a7da8cc1c0dbfcf89579dd57458e36769de5ac750b4671737ca"
SRC_URI[atk-0.18.0.sha256sum] = "b4af014b17dd80e8af9fa689b2d4a211ddba6eb583c1622f35d0cb543f6b17e4"
SRC_URI[atk-sys-0.18.0.sha256sum] = "251e0b7d90e33e0ba930891a505a9a35ece37b2dd37a14f3ffc306c13b980009"
SRC_URI[atomic-waker-1.1.2.sha256sum] = "1505bd5d3d116872e7271a6d4e16d81d0c8570876c8de68093a09ac269d8aac0"
SRC_URI[atty-0.2.14.sha256sum] = "d9b39be18770d11421cdb1b9947a45dd3f37e93092cbf377614828a319d5fee8"
SRC_URI[auto_impl-1.3.0.sha256sum] = "ffdcb70bdbc4d478427380519163274ac86e52916e10f0a8889adf0f96d3fee7"
SRC_URI[autocfg-0.1.8.sha256sum] = "0dde43e75fd43e8a1bf86103336bc699aa8d17ad1be60c76c0bdfd4828e19b78"
SRC_URI[autocfg-1.3.0.sha256sum] = "0c4b4d0bd25bd0b74681c0ad21497610ce1b7c91b1022cd21c80c6fbdd9476b0"
SRC_URI[backtrace-0.3.73.sha256sum] = "5cc23269a4f8976d0a4d2e7109211a419fe30e8d88d677cd60b6bc79c5732e0a"
SRC_URI[base32-0.4.0.sha256sum] = "23ce669cd6c8588f79e15cf450314f9638f967fc5770ff1c7c1deb0925ea7cfa"
SRC_URI[base64-0.22.1.sha256sum] = "72b3254f16251a8381aa12e40e3c4d2f0199f8c6508fbecb9d91f575e0fbb8c6"
SRC_URI[base64-0.21.7.sha256sum] = "9d297deb1925b89f2ccc13d7635fa0714f12c87adce1c75356b39ca9b7178567"
SRC_URI[base64ct-1.6.0.sha256sum] = "8c3c1a368f70d6cf7302d78f8f7093da241fb8e8807c05cc9e51a125895a6d5b"
SRC_URI[bindgen-0.69.4.sha256sum] = "a00dc851838a2120612785d195287475a3ac45514741da670b735818822129a0"
SRC_URI[bindgen-0.71.1.sha256sum] = "5f58bf3d7db68cfbac37cfc485a8d711e87e064c3d0fe0435b92f7a407f9d6b3"
SRC_URI[bindgen-0.65.1.sha256sum] = "cfdf7b466f9a4903edc73f95d6d2bcd5baf8ae620638762244d3f60143643cc5"
SRC_URI[bindgen-0.59.2.sha256sum] = "2bd2a9a458e8f4304c52c43ebb0cfbd520289f8379a52e329a38afda99bf8eb8"
SRC_URI[bit_field-0.10.2.sha256sum] = "dc827186963e592360843fb5ba4b973e145841266c1357f7180c43526f2e5b61"
SRC_URI[bitflags-1.3.2.sha256sum] = "bef38d45163c2f1dde094a7dfd33ccf595c92905c8f8f4fdc18d06fb1037718a"
SRC_URI[bitflags-2.9.1.sha256sum] = "1b8e56985ec62d17e9c1001dc89c88ecd7dc08e47eba5ec7c29c7b5eeecde967"
SRC_URI[bitvec-1.0.1.sha256sum] = "1bc2832c24239b0141d5674bb9174f9d68a8b5b3f2753311927c172ca46f7e9c"
SRC_URI[block-0.1.6.sha256sum] = "0d8c1fef690941d3e7788d328517591fecc684c084084702d6ff1641e993699a"
SRC_URI[block-buffer-0.10.4.sha256sum] = "3078c7629b62d3f0439517fa394996acacc5cbc91c5a20d8c658e77abd503a71"
SRC_URI[block2-0.5.1.sha256sum] = "2c132eebf10f5cad5289222520a4a058514204aed6d791f1cf4fe8088b82d15f"
SRC_URI[blocking-1.6.1.sha256sum] = "703f41c54fc768e63e091340b424302bb1c29ef4aa0c7f10fe849dfb114d29ea"
SRC_URI[brotli-3.5.0.sha256sum] = "d640d25bc63c50fb1f0b545ffd80207d2e10a4c965530809b40ba3386825c391"
SRC_URI[brotli-decompressor-2.5.1.sha256sum] = "4e2e4afe60d7dd600fdd3de8d0f08c2b7ec039712e3b6137ff98b7004e82de4f"
SRC_URI[bumpalo-3.16.0.sha256sum] = "79296716171880943b8470b5f8d03aa55eb2e645a4874bdbb28adb49162e012c"
SRC_URI[bytecodec-0.4.15.sha256sum] = "adf4c9d0bbf32eea58d7c0f812058138ee8edaf0f2802b6d03561b504729a325"
SRC_URI[bytemuck-1.23.2.sha256sum] = "3995eaeebcdf32f91f980d360f78732ddc061097ab4e39991ae7a6ace9194677"
SRC_URI[bytemuck_derive-1.10.1.sha256sum] = "4f154e572231cb6ba2bd1176980827e3d5dc04cc183a75dea38109fbdd672d29"
SRC_URI[byteorder-1.5.0.sha256sum] = "1fd0f2584146f6f2ef48085050886acf353beff7305ebd1ae69500e27c67f64b"
SRC_URI[bytes-1.10.1.sha256sum] = "d71b6127be86fdcfddb610f7182ac57211d4b18a3e9c82eb2d17662f2227ad6a"
SRC_URI[bzip2-0.4.4.sha256sum] = "bdb116a6ef3f6c3698828873ad02c3014b3c85cadb88496095628e3ef1e347f8"
SRC_URI[bzip2-sys-0.1.11+1.0.8.sha256sum] = "736a955f3fa7875102d57c82b8cac37ec45224a07fd32d58f9f7a186b6cd4cdc"
SRC_URI[cairo-rs-0.18.5.sha256sum] = "8ca26ef0159422fb77631dc9d17b102f253b876fe1586b03b803e63a309b4ee2"
SRC_URI[cairo-sys-rs-0.18.2.sha256sum] = "685c9fa8e590b8b3d678873528d83411db17242a73fccaed827770ea0fedda51"
SRC_URI[calloop-0.13.0.sha256sum] = "b99da2f8558ca23c71f4fd15dc57c906239752dd27ff3c00a1d56b685b7cbfec"
SRC_URI[calloop-wayland-source-0.3.0.sha256sum] = "95a66a987056935f7efce4ab5668920b5d0dac4a7c99991a67395f13702ddd20"
SRC_URI[cc-1.2.13.sha256sum] = "c7777341816418c02e033934a09f20dc0ccaf65a5201ef8a450ae0105a573fda"
SRC_URI[cesu8-1.1.0.sha256sum] = "6d43a04d8753f35258c91f8ec639f792891f748a1edbd759cf1dcea3382ad83c"
SRC_URI[cexpr-0.6.0.sha256sum] = "6fac387a98bb7c37292057cffc56d62ecb629900026402633ae9160df93a8766"
SRC_URI[cfg-expr-0.15.8.sha256sum] = "d067ad48b8650848b989a59a86c6c36a995d02d2bf778d45c3c5d57bc2718f02"
SRC_URI[cfg-if-1.0.0.sha256sum] = "baf1de4339761588bc0619e3cbc0120ee582ebb74b53b4efbf79117bd2da40fd"
SRC_URI[cfg-if-0.1.10.sha256sum] = "4785bdd1c96b2a846b2bd7cc02e86b6b3dbf14e7e53446c4f54c92a361040822"
SRC_URI[cfg_aliases-0.1.1.sha256sum] = "fd16c4719339c4530435d38e511904438d07cce7950afa3718a84ac36c10e89e"
SRC_URI[cfg_aliases-0.2.1.sha256sum] = "613afe47fcd5fac7ccf1db93babcb082c5994d996f20b8b159f2ad1658eb5724"
SRC_URI[chrono-0.4.41.sha256sum] = "c469d952047f47f91b68d1cba3f10d63c11d73e4636f24f08daf0278abf01c4d"
SRC_URI[cidr-utils-0.5.11.sha256sum] = "2315f7119b7146d6a883de6acd63ddf96071b5f79d9d98d2adaa84d749f6abf1"
SRC_URI[cipher-0.4.4.sha256sum] = "773f3b9af64447d2ce9850330c473515014aa235e6a783b02db81ff39e4a3dad"
SRC_URI[clang-sys-1.8.1.sha256sum] = "0b023947811758c97c59bf9d1c188fd619ad4718dcaa767947df1cadb14f39f4"
SRC_URI[clap-2.34.0.sha256sum] = "a0610544180c38b88101fecf2dd634b174a62eef6946f84dfc6a7127512b381c"
SRC_URI[clap-4.5.8.sha256sum] = "84b3edb18336f4df585bc9aa31dd99c036dfa5dc5e9a2939a722a188f3a8970d"
SRC_URI[clap_builder-4.5.8.sha256sum] = "c1c09dd5ada6c6c78075d6fd0da3f90d8080651e2d6cc8eb2f1aaa4034ced708"
SRC_URI[clap_lex-0.7.1.sha256sum] = "4b82cf0babdbd58558212896d1a4272303a57bdb245c2bf1147185fb45640e70"
SRC_URI[clipboard-0.1.0.sha256sum] = "deec24c8a1931588c7e1dc122014320081ccc51cbc75edc129ac6da56ffe6d14"
SRC_URI[clipboard-master-4.0.0-beta.6.sha256sum] = "d6f92c701334be4db48f481a077f8eb763b60e001bf1b76c7fc5dca5fe178864"
SRC_URI[clipboard-win-5.4.0.sha256sum] = "15efe7a882b08f34e38556b14f2fb3daa98769d06c7f0c1b076dfd0d983bc892"
SRC_URI[cloudabi-0.0.3.sha256sum] = "ddfc5b9aa5d4507acaf872de71051dfd0e309860e88966e1051e462a077aac4f"
SRC_URI[cocoa-0.25.0.sha256sum] = "f6140449f97a6e97f9511815c5632d84c8aacf8ac271ad77c559218161a1373c"
SRC_URI[cocoa-0.24.1.sha256sum] = "f425db7937052c684daec3bd6375c8abe2d146dca4b8b143d6db777c39138f3a"
SRC_URI[cocoa-0.20.2.sha256sum] = "0c49e86fc36d5704151f5996b7b3795385f50ce09e3be0f47a0cfde869681cf8"
SRC_URI[cocoa-foundation-0.1.2.sha256sum] = "8c6234cbb2e4c785b456c0644748b1ac416dd045799740356f8363dfe00c93f7"
SRC_URI[color_quant-1.1.0.sha256sum] = "3d7b894f5411737b7867f4827955924d7c254fc9f4d91a6aad6b097804b1018b"
SRC_URI[colorchoice-1.0.1.sha256sum] = "0b6a852b24ab71dffc585bcb46eaf7959d175cb865a7152e35b348d1b2960422"
SRC_URI[combine-4.6.7.sha256sum] = "ba5a308b75df32fe02788e748662718f03fde005016435c444eea572398219fd"
SRC_URI[concurrent-queue-2.5.0.sha256sum] = "4ca0197aee26d1ae37445ee532fefce43251d24cc7c166799f4d46817f1d3973"
SRC_URI[confy-0.4.0.sha256sum] = "2913470204e9e8498a0f31f17f90a0de801ae92c8c5ac18c49af4819e6786697"
SRC_URI[const_fn-0.4.10.sha256sum] = "373e9fafaa20882876db20562275ff58d50e0caa2590077fe7ce7bef90211d0d"
SRC_URI[const_format-0.2.32.sha256sum] = "e3a214c7af3d04997541b18d432afaff4c455e79e2029079647e72fc2bd27673"
SRC_URI[const_format_proc_macros-0.2.32.sha256sum] = "c7f6ff08fd20f4f299298a28e2dfa8a8ba1036e6cd2460ac1de7b425d76f2500"
SRC_URI[constant_time_eq-0.1.5.sha256sum] = "245097e9a4535ee1e3e3931fcfcd55a796a44c643e8596ff6566d68f09b87bbc"
SRC_URI[constant_time_eq-0.2.6.sha256sum] = "21a53c0a4d288377e7415b53dcfc3c04da5cdc2cc95c8d5ac178b58f0b861ad6"
SRC_URI[core-foundation-0.9.4.sha256sum] = "91e195e091a93c46f7102ec7818a2aa394e1e1771c3ab4825963fa03e45afb8f"
SRC_URI[core-foundation-0.7.0.sha256sum] = "57d24c7a13c43e870e37c1556b74555437870a04514f7685f5b354e090567171"
SRC_URI[core-foundation-0.10.1.sha256sum] = "b2a6cd9ae233e7f62ba4e9353e81a88df7fc8a5987b8d445b4d90c879bd156f6"
SRC_URI[core-foundation-sys-0.7.0.sha256sum] = "b3a71ab494c0b5b860bdc8407ae08978052417070c2ced38573a9157ad75b8ac"
SRC_URI[core-foundation-sys-0.8.7.sha256sum] = "773648b94d0e5d620f64f280777445740e61fe701025087ec8b57f45c791888b"
SRC_URI[core-graphics-0.22.3.sha256sum] = "2581bbab3b8ffc6fcbd550bf46c355135d16e9ff2a6ea032ad6b9bf1d7efe4fb"
SRC_URI[core-graphics-0.19.2.sha256sum] = "b3889374e6ea6ab25dba90bb5d96202f61108058361f6dc72e8b03e6f8bbe923"
SRC_URI[core-graphics-0.23.2.sha256sum] = "c07782be35f9e1140080c6b96f0d44b739e2278479f64e02fdab4e32dfd8b081"
SRC_URI[core-graphics-types-0.1.3.sha256sum] = "45390e6114f68f718cc7a830514a96f903cccd70d02a8f6d9f643ac4ba45afaf"
SRC_URI[core-media-sys-0.1.2.sha256sum] = "273bf3fc5bf51fd06a7766a84788c1540b6527130a0bce39e00567d6ab9f31f1"
SRC_URI[core-text-19.2.0.sha256sum] = "99d74ada66e07c1cefa18f8abfba765b486f250de2e4a999e5727fc0dd4b4a25"
SRC_URI[core-video-sys-0.1.4.sha256sum] = "34ecad23610ad9757664d644e369246edde1803fcb43ed72876565098a5d3828"
SRC_URI[core_maths-0.1.1.sha256sum] = "77745e017f5edba1a9c1d854f6f3a52dac8a12dd5af5d2f54aecf61e43d80d30"
SRC_URI[coreaudio-rs-0.11.3.sha256sum] = "321077172d79c662f64f5071a03120748d5bb652f5231570141be24cfcd2bace"
SRC_URI[coreaudio-sys-0.2.15.sha256sum] = "7f01585027057ff5f0a5bf276174ae4c1594a2c5bde93d5f46a016d76270f5a9"
SRC_URI[cpal-0.15.3.sha256sum] = "873dab07c8f743075e57f524c583985fbaf745602acbe916a01539364369a779"
SRC_URI[cpufeatures-0.2.12.sha256sum] = "53fe5e26ff1b7aef8bca9c6080520cfb8d9333c7568e1829cef191a9723e5504"
SRC_URI[crc-3.3.0.sha256sum] = "9710d3b3739c2e349eb44fe848ad0b7c8cb1e42bd87ee49371df2f7acaf3e675"
SRC_URI[crc-catalog-2.4.0.sha256sum] = "19d374276b40fb8bbdee95aef7c7fa6b5316ec764510eb64b8dd0e2ed0d7e7f5"
SRC_URI[crc32fast-1.4.2.sha256sum] = "a97769d94ddab943e4510d138150169a2758b5ef3eb191a9ee688de3e23ef7b3"
SRC_URI[crossbeam-channel-0.5.13.sha256sum] = "33480d6946193aa8033910124896ca395333cae7e2d1113d1fef6c3272217df2"
SRC_URI[crossbeam-deque-0.8.5.sha256sum] = "613f8cc01fe9cf1a3eb3d7f488fd2fa8388403e97039e2f73692932e291a770d"
SRC_URI[crossbeam-epoch-0.9.18.sha256sum] = "5b82ac4a3c2ca9c3460964f020e1402edd5753411d7737aa39c3714ad1b5420e"
SRC_URI[crossbeam-queue-0.3.11.sha256sum] = "df0346b5d5e76ac2fe4e327c5fd1118d6be7c51dfb18f9b7922923f287471e35"
SRC_URI[crossbeam-utils-0.8.20.sha256sum] = "22ec99545bb0ed0ea7bb9b8e1e9122ea386ff8a48c0922e43f36d45ab09e0e80"
SRC_URI[crunchy-0.2.2.sha256sum] = "7a81dae078cea95a014a339291cec439d2f232ebe854a9d672b796c6afafa9b7"
SRC_URI[crypto-common-0.1.6.sha256sum] = "1bfb12502f3fc46cca1bb51ac28df9d618d813cdc3d2f25b9fe775a34af26bb3"
SRC_URI[ctor-lite-0.1.0.sha256sum] = "1f791803201ab277ace03903de1594460708d2d54df6053f2d9e82f592b19e3b"
SRC_URI[ctrlc-3.4.4.sha256sum] = "672465ae37dc1bc6380a6547a8883d5dd397b0f1faaad4f265726cc7042a5345"
SRC_URI[cursor-icon-1.2.0.sha256sum] = "f27ae1dd37df86211c42e150270f82743308803d90a6f6e6651cd730d5e1732f"
SRC_URI[dashmap-6.1.0.sha256sum] = "5041cc499144891f3790297212f32a74fb938e5136a14943f338ef9e0ae276cf"
SRC_URI[dashmap-5.5.3.sha256sum] = "978747c1d849a7d2ee5e8adc0159961c48fb7e5db2f06af6723b80123bb53856"
SRC_URI[dasp-0.11.0.sha256sum] = "7381b67da416b639690ac77c73b86a7b5e64a29e31d1f75fb3b1102301ef355a"
SRC_URI[dasp_envelope-0.11.0.sha256sum] = "8ec617ce7016f101a87fe85ed44180839744265fae73bb4aa43e7ece1b7668b6"
SRC_URI[dasp_frame-0.11.0.sha256sum] = "b2a3937f5fe2135702897535c8d4a5553f8b116f76c1529088797f2eee7c5cd6"
SRC_URI[dasp_interpolate-0.11.0.sha256sum] = "7fc975a6563bb7ca7ec0a6c784ead49983a21c24835b0bc96eea11ee407c7486"
SRC_URI[dasp_peak-0.11.0.sha256sum] = "5cf88559d79c21f3d8523d91250c397f9a15b5fc72fbb3f87fdb0a37b79915bf"
SRC_URI[dasp_ring_buffer-0.11.0.sha256sum] = "07d79e19b89618a543c4adec9c5a347fe378a19041699b3278e616e387511ea1"
SRC_URI[dasp_rms-0.11.0.sha256sum] = "a6c5dcb30b7e5014486e2822537ea2beae50b19722ffe2ed7549ab03774575aa"
SRC_URI[dasp_sample-0.11.0.sha256sum] = "0c87e182de0887fd5361989c677c4e8f5000cd9491d6d563161a8f3a5519fc7f"
SRC_URI[dasp_signal-0.11.0.sha256sum] = "aa1ab7d01689c6ed4eae3d38fe1cea08cba761573fbd2d592528d55b421077e7"
SRC_URI[dasp_slice-0.11.0.sha256sum] = "4e1c7335d58e7baedafa516cb361360ff38d6f4d3f9d9d5ee2a2fc8e27178fa1"
SRC_URI[dasp_window-0.11.1.sha256sum] = "99ded7b88821d2ce4e8b842c9f1c86ac911891ab89443cc1de750cae764c5076"
SRC_URI[data-encoding-2.9.0.sha256sum] = "2a2330da5de22e8a3cb63252ce2abb30116bf5265e89c0e01bc17015ce30a476"
SRC_URI[dbus-0.9.7.sha256sum] = "1bb21987b9fb1613058ba3843121dd18b163b254d8a6e797e144cbac14d96d1b"
SRC_URI[dbus-crossroads-0.5.2.sha256sum] = "3a4c83437187544ba5142427746835061b330446ca8902eabd70e4afb8f76de0"
SRC_URI[debug-helper-0.3.13.sha256sum] = "f578e8e2c440e7297e008bb5486a3a8a194775224bbc23729b0dbdfaeebf162e"
SRC_URI[default-net-0.14.1.sha256sum] = "a4898b43aed56499fad6b294d15b3e76a51df68079bf492e5daae38ca084e003"
SRC_URI[default-net-0.1.0.sha256sum] = "c5969aafb23c94a94b916f94ab1c3b4101a4995062a2c5e1166c6d3b97686c35"
SRC_URI[deranged-0.3.11.sha256sum] = "b42b6fa04a440b495c8b04d0e71b707c585f83cb9cb28cf8cd0d976c315e31b4"
SRC_URI[derivative-2.2.0.sha256sum] = "fcc3dd5e9e9c0b295d6e1e4d811fb6f157d5ffd784b8d202fc62eac8035a770b"
SRC_URI[digest-0.10.7.sha256sum] = "9ed9a281f7bc9b7576e61468ba615a66a5c8cfdff42420a70aa82701a3b1e292"
SRC_URI[directories-next-2.0.0.sha256sum] = "339ee130d97a610ea5a5872d2bbb130fdf68884ff09d3028b81bec8a1ac23bbc"
SRC_URI[dirs-5.0.1.sha256sum] = "44c45a9d03d6676652bcb5e724c7e988de1acad23a711b5217ab9cbecbec2225"
SRC_URI[dirs-2.0.2.sha256sum] = "13aea89a5c93364a98e9b37b2fa237effbb694d5cfe01c5b70941f7eb087d5e3"
SRC_URI[dirs-4.0.0.sha256sum] = "ca3aa72a6f96ea37bbc5aa912f6788242832f75369bdfdadcb0e38423f100059"
SRC_URI[dirs-next-2.0.0.sha256sum] = "b98cf8ebf19c3d1b223e151f99a4f9f0690dca41414773390fc824184ac833e1"
SRC_URI[dirs-sys-0.3.7.sha256sum] = "1b1d1d91c932ef41c0f2663aa8b0ca0342d444d842c06914aa0a7e352d0bada6"
SRC_URI[dirs-sys-0.4.1.sha256sum] = "520f05a5cbd335fae5a99ff7a6ab8627577660ee5cfd6a94a6a929b52ff0321c"
SRC_URI[dirs-sys-next-0.1.2.sha256sum] = "4ebda144c4fe02d1f7ea1a7d9641b6fc6b580adcfa024ae48797ecdeb6825b4d"
SRC_URI[dispatch-0.2.0.sha256sum] = "bd0c93bb4b0c6d9b77f4435b0ae98c24d17f1c45b2ff844c6151a07256ca923b"
SRC_URI[dlib-0.5.2.sha256sum] = "330c60081dcc4c72131f8eb70510f1ac07223e5d4163db481a04a0befcffa412"
SRC_URI[dlopen-0.1.8.sha256sum] = "71e80ad39f814a9abe68583cd50a2d45c8a67561c3361ab8da240587dda80937"
SRC_URI[dlopen2-0.4.1.sha256sum] = "b121caccfc363e4d9a4589528f3bef7c71b83c6ed01c8dc68cbeeb7fd29ec698"
SRC_URI[dlopen2_derive-0.2.0.sha256sum] = "3a09ac8bb8c16a282264c379dffba707b9c998afc7506009137f3c6136888078"
SRC_URI[dlopen_derive-0.1.4.sha256sum] = "f236d9e1b1fbd81cea0f9cbdc8dcc7e8ebcd80e6659cd7cb2ad5f6c05946c581"
SRC_URI[dlv-list-0.3.0.sha256sum] = "0688c2a7f92e427f44895cd63841bff7b29f8d7a1648b9e7e07a4a365b2e1257"
SRC_URI[docopt-1.1.1.sha256sum] = "7f3f119846c823f9eafcf953a8f6ffb6ed69bf6240883261a7f13b634579a51f"
SRC_URI[downcast-rs-1.2.1.sha256sum] = "75b325c5dbd37f80359721ad39aca5a29fb04c89279657cffdda8736d0c0b9d2"
SRC_URI[dpi-0.1.1.sha256sum] = "f25c0e292a7ca6d6498557ff1df68f32c99850012b6ea401cf8daf771f22ff53"
SRC_URI[drm-0.12.0.sha256sum] = "98888c4bbd601524c11a7ed63f814b8825f420514f78e96f752c437ae9cbb5d1"
SRC_URI[drm-ffi-0.8.0.sha256sum] = "97c98727e48b7ccb4f4aea8cfe881e5b07f702d17b7875991881b41af7278d53"
SRC_URI[drm-fourcc-2.2.0.sha256sum] = "0aafbcdb8afc29c1a7ee5fbe53b5d62f4565b35a042a662ca9fecd0b54dae6f4"
SRC_URI[drm-sys-0.7.0.sha256sum] = "fd39dde40b6e196c2e8763f23d119ddb1a8714534bf7d77fa97a65b0feda3986"
SRC_URI[dtoa-0.4.8.sha256sum] = "56899898ce76aaf4a0f24d914c97ea6ed976d42fec6ad33fcbb0a1103e07b2b0"
SRC_URI[dunce-1.0.5.sha256sum] = "92773504d58c093f6de2459af4af33faa518c13451eb8f2b5698ed3d36e7c813"
SRC_URI[ed25519-1.5.3.sha256sum] = "91cff35c70bba8a626e3185d8cd48cc11b5437e1a5bcd15b9b5fa3c64b6dfee7"
SRC_URI[either-1.13.0.sha256sum] = "60b1af1c220855b6ceac025d3f6ecdd2b7c4894bfe9cd9bda4fbb4bc7c0d4cf0"
SRC_URI[enigo-0.0.14.sha256sum] = "95ce8d7672e87b3155fd5e8a9226276da5c833e15bc879c7b98a78f743b67814"
SRC_URI[enquote-1.1.0.sha256sum] = "06c36cb11dbde389f4096111698d8b567c0720e3452fd5ac3e6b4e47e1939932"
SRC_URI[enum-map-2.7.3.sha256sum] = "6866f3bfdf8207509a033af1a75a7b08abda06bbaaeae6669323fd5a097df2e9"
SRC_URI[enum-map-derive-0.17.0.sha256sum] = "f282cfdfe92516eb26c2af8589c274c7c17681f5ecc03c18255fe741c6aa64eb"
SRC_URI[enumflags2-0.7.10.sha256sum] = "d232db7f5956f3f14313dc2f87985c58bd2c695ce124c8cdd984e08e15ac133d"
SRC_URI[enumflags2_derive-0.7.10.sha256sum] = "de0d48a183585823424a4ce1aa132d174a6a81bd540895822eb4c8373a8e49e8"
SRC_URI[env_filter-0.1.3.sha256sum] = "186e05a59d4c50738528153b83b0b0194d3a29507dfec16eccd4b342903397d0"
SRC_URI[env_logger-0.10.2.sha256sum] = "4cd405aab171cb85d6735e5c8d9db038c17d3ca007a4d2c25f337935c3d90580"
SRC_URI[env_logger-0.11.6.sha256sum] = "dcaee3d8e3cfc3fd92428d477bc97fc29ec8716d180c0d74c643bb26166660e0"
SRC_URI[env_logger-0.9.3.sha256sum] = "a12e6657c4c97ebab115a42dcee77225f7f482cdd841cf7088c657a42e9e00e7"
SRC_URI[epoll-4.3.3.sha256sum] = "74351c3392ea1ff6cd2628e0042d268ac2371cb613252ff383b6dfa50d22fa79"
SRC_URI[equivalent-1.0.1.sha256sum] = "5443807d6dff69373d433ab9ef5378ad8df50ca6298caf15de6e52e24aaf54d5"
SRC_URI[errno-0.3.9.sha256sum] = "534c5cf6194dfab3db3242765c03bbe257cf92f22b38f6bc0c58d59108a820ba"
SRC_URI[error-code-3.2.0.sha256sum] = "a0474425d51df81997e2f90a21591180b38eccf27292d755f3e30750225c175b"
SRC_URI[evdev-0.11.5.sha256sum] = "cb04d90ec17561fda28364616cb7708d2ab3dc7f72597ef4d3ae557eb2eb1007"
SRC_URI[event-listener-3.1.0.sha256sum] = "d93877bcde0eb80ca09131a08d23f0a5c18a620b01db137dba666d18cd9b30c2"
SRC_URI[event-listener-2.5.3.sha256sum] = "0206175f82b8d6bf6652ff7d71a1e27fd2e4efde587fd368662814d6ec1d9ce0"
SRC_URI[event-listener-5.3.1.sha256sum] = "6032be9bd27023a771701cc49f9f053c751055f71efb2e0ae5c15809093675ba"
SRC_URI[event-listener-strategy-0.5.2.sha256sum] = "0f214dc438f977e6d4e3500aaa277f5ad94ca83fbbd9b1a15713ce2344ccc5a1"
SRC_URI[exr-1.72.0.sha256sum] = "887d93f60543e9a9362ef8a21beedd0a833c5d9610e18c67abe15a5963dcb1a4"
SRC_URI[fastrand-1.9.0.sha256sum] = "e51093e27b0797c359783294ca4f0a911c270184cb10f85783b118614a1501be"
SRC_URI[fastrand-2.1.0.sha256sum] = "9fc0510504f03c51ada170672ac806f1f105a88aa97a5281117e1ddc3368e51a"
SRC_URI[fdeflate-0.3.4.sha256sum] = "4f9bfee30e4dedf0ab8b422f03af778d9612b63f502710fc500a334ebe2de645"
SRC_URI[field-offset-0.3.6.sha256sum] = "38e2275cc4e4fc009b0669731a1e5ab7ebf11f469eaede2bab9309a5b4d6057f"
SRC_URI[filedescriptor-0.8.2.sha256sum] = "7199d965852c3bac31f779ef99cbb4537f80e952e2d6aa0ffeb30cce00f4f46e"
SRC_URI[filetime-0.2.23.sha256sum] = "1ee447700ac8aa0b2f2bd7bc4462ad686ba06baa6727ac149a2d6277f0d240fd"
SRC_URI[fixedbitset-0.4.2.sha256sum] = "0ce7134b9999ecaf8bcd65542e436736ef32ddca1b3e06094cb6ec5755203b80"
SRC_URI[flate2-1.0.30.sha256sum] = "5f54427cfd1c7829e2a139fcefea601bf088ebca651d2bf53ebc600eac295dae"
SRC_URI[flexi_logger-0.27.4.sha256sum] = "469e584c031833564840fb0cdbce99bdfe946fd45480a188545e73a76f45461c"
SRC_URI[flume-0.11.0.sha256sum] = "55ac459de2512911e4b674ce33cf20befaba382d05b62b008afc1c8b57cbf181"
SRC_URI[fnv-1.0.7.sha256sum] = "3f9eec918d3f24069decb9af1554cad7c880e2da24a9afd88aca000531ab82c1"
SRC_URI[fon-0.6.0.sha256sum] = "ad46a0e6c9bc688823a742aa969b5c08fdc56c2a436ee00d5c6fbcb5982c55c4"
SRC_URI[fontconfig-parser-0.5.8.sha256sum] = "bbc773e24e02d4ddd8395fd30dc147524273a83e54e0f312d986ea30de5f5646"
SRC_URI[fontdb-0.23.0.sha256sum] = "457e789b3d1202543297a350643cf459f836cade38934e7a4cf6a39e7cde2905"
SRC_URI[foreign-types-0.3.2.sha256sum] = "f6f339eb8adc052cd2ca78910fda869aefa38d22d5cb648e6485e4d3fc06f3b1"
SRC_URI[foreign-types-0.5.0.sha256sum] = "d737d9aa519fb7b749cbc3b962edcf310a8dd1f4b67c91c4f83975dbdd17d965"
SRC_URI[foreign-types-macros-0.2.3.sha256sum] = "1a5c6c585bc94aaf2c7b51dd4c2ba22680844aba4c687be581871a6f518c5742"
SRC_URI[foreign-types-shared-0.1.1.sha256sum] = "00b0228411908ca8685dba7fc2cdd70ec9990a6e753e89b6ac91a84c40fbaf4b"
SRC_URI[foreign-types-shared-0.3.1.sha256sum] = "aa9a19cbb55df58761df49b23516a86d432839add4af60fc256da840f66ed35b"
SRC_URI[form_urlencoded-1.2.1.sha256sum] = "e13624c2627564efccf4934284bdd98cbaa14e79b0b5a141218e507b3a823456"
SRC_URI[fruitbasket-0.10.0.sha256sum] = "898289b8e0528c84fb9b88f15ac9d5109bcaf23e0e49bb6f64deee0d86b6a351"
SRC_URI[fsevent-2.1.2.sha256sum] = "8836d1f147a0a195bf517a5fd211ea7023d19ced903135faf6c4504f2cf8775f"
SRC_URI[fsevent-sys-4.1.0.sha256sum] = "76ee7a02da4d231650c7cea31349b889be2f45ddb3ef3032d2ec8185f6313fd2"
SRC_URI[fuchsia-cprng-0.1.1.sha256sum] = "a06f77d526c1a601b7c4cdd98f54b5eaabffc14d5f2f0296febdc7f357c6d3ba"
SRC_URI[funty-2.0.0.sha256sum] = "e6d5a32815ae3f33302d95fdcb2ce17862f8c65363dcfd29360480ba1001fc9c"
SRC_URI[futures-0.3.30.sha256sum] = "645c6916888f6cb6350d2550b80fb63e734897a8498abe35cfb732b6487804b0"
SRC_URI[futures-channel-0.3.31.sha256sum] = "2dff15bf788c671c1934e366d07e30c1814a8ef514e1af724a602e8a2fbe1b10"
SRC_URI[futures-core-0.3.31.sha256sum] = "05f29059c0c2090612e8d742178b0580d2dc940c837851ad723096f87af6663e"
SRC_URI[futures-executor-0.3.30.sha256sum] = "a576fc72ae164fca6b9db127eaa9a9dda0d61316034f33a0a0d4eda41f02b01d"
SRC_URI[futures-io-0.3.31.sha256sum] = "9e5c1b78ca4aae1ac06c48a526a655760685149f0d465d21f37abfe57ce075c6"
SRC_URI[futures-lite-2.3.0.sha256sum] = "52527eb5074e35e9339c6b4e8d12600c7128b68fb25dcb9fa9dec18f7c25f3a5"
SRC_URI[futures-lite-1.13.0.sha256sum] = "49a9d51ce47660b1e808d3c990b4709f2f415d928835a17dfd16991515c46bce"
SRC_URI[futures-macro-0.3.31.sha256sum] = "162ee34ebcb7c64a8abebc059ce0fee27c2262618d7b60ed8faf72fef13c3650"
SRC_URI[futures-sink-0.3.31.sha256sum] = "e575fab7d1e0dcb8d0c7bcf9a63ee213816ab51902e6d244a95819acacf1d4f7"
SRC_URI[futures-task-0.3.31.sha256sum] = "f90f7dce0722e95104fcb095585910c0977252f286e354b5e3bd38902cd99988"
SRC_URI[futures-util-0.3.31.sha256sum] = "9fa08315bb612088cc391249efdc3bc77536f16c91f6cf495e6fbe85b20a4a81"
SRC_URI[fuser-0.15.1.sha256sum] = "53274f494609e77794b627b1a3cddfe45d675a6b2e9ba9c0fdc8d8eee2184369"
SRC_URI[gdk-0.18.0.sha256sum] = "f5ba081bdef3b75ebcdbfc953699ed2d7417d6bd853347a42a37d76406a33646"
SRC_URI[gdk-pixbuf-0.18.5.sha256sum] = "50e1f5f1b0bfb830d6ccc8066d18db35c487b1b2b1e8589b5dfe9f07e8defaec"
SRC_URI[gdk-pixbuf-sys-0.18.0.sha256sum] = "3f9839ea644ed9c97a34d129ad56d38a25e6756f99f3a88e15cd39c20629caf7"
SRC_URI[gdk-sys-0.18.0.sha256sum] = "31ff856cb3386dae1703a920f803abafcc580e9b5f711ca62ed1620c25b51ff2"
SRC_URI[gdkwayland-sys-0.18.0.sha256sum] = "a90fbf5c033c65d93792192a49a8efb5bb1e640c419682a58bb96f5ae77f3d4a"
SRC_URI[gdkx11-sys-0.18.0.sha256sum] = "fee8f00f4ee46cad2939b8990f5c70c94ff882c3028f3cc5abf950fa4ab53043"
SRC_URI[generic-array-0.14.7.sha256sum] = "85649ca51fd72272d7821adaf274ad91c288277713d9c18820d8499a7ff69e9a"
SRC_URI[gethostname-0.4.3.sha256sum] = "0176e0459c2e4a1fe232f984bca6890e681076abb9934f6cea7c326f3fc47818"
SRC_URI[getrandom-0.3.2.sha256sum] = "73fea8450eea4bac3940448fb7ae50d91f034f941199fcd9d909a5a07aa455f0"
SRC_URI[getrandom-0.2.15.sha256sum] = "c4567c8db10ae91089c99af84c68c38da3ec2f087c3f82960bcdbf3656b6f4d7"
SRC_URI[gif-0.13.1.sha256sum] = "3fb2d69b19215e18bb912fa30f7ce15846e301408695e44e0ef719f1da9e19f2"
SRC_URI[gimli-0.29.0.sha256sum] = "40ecd4077b5ae9fd2e9e169b102c6c330d0605168eb0e8bf79952b256dbefffd"
SRC_URI[gio-0.18.4.sha256sum] = "d4fc8f532f87b79cbc51a79748f16a6828fb784be93145a322fa14d06d354c73"
SRC_URI[gio-sys-0.18.1.sha256sum] = "37566df850baf5e4cb0dfb78af2e4b9898d817ed9263d1090a2df958c64737d2"
SRC_URI[git2-0.16.1.sha256sum] = "ccf7f68c2995f392c49fffb4f95ae2c873297830eb25c6bc4c114ce8f4562acc"
SRC_URI[glib-0.18.5.sha256sum] = "233daaf6e83ae6a12a52055f568f9d7cf4671dabb78ff9560ab6da230ce00ee5"
SRC_URI[glib-0.10.3.sha256sum] = "0c685013b7515e668f1b57a165b009d4d28cb139a8a989bbd699c10dad29d0c5"
SRC_URI[glib-macros-0.10.1.sha256sum] = "41486a26d1366a8032b160b59065a59fb528530a46a49f627e7048fb8c064039"
SRC_URI[glib-macros-0.18.5.sha256sum] = "0bb0228f477c0900c880fd78c8759b95c7636dbd7842707f49e132378aa2acdc"
SRC_URI[glib-sys-0.10.1.sha256sum] = "c7e9b997a66e9a23d073f2b1abb4dbfc3925e0b8952f67efd8d9b6e168e4cdc1"
SRC_URI[glib-sys-0.18.1.sha256sum] = "063ce2eb6a8d0ea93d2bf8ba1957e78dbab6be1c2220dd3daca57d5a9d869898"
SRC_URI[glob-0.3.1.sha256sum] = "d2fabcfbdc87f4758337ca535fb41a6d701b65693ce38287d856d1674551ec9b"
SRC_URI[gobject-sys-0.10.0.sha256sum] = "952133b60c318a62bf82ee75b93acc7e84028a093e06b9e27981c2b6fe68218c"
SRC_URI[gobject-sys-0.18.0.sha256sum] = "0850127b514d1c4a4654ead6dedadb18198999985908e6ffe4436f53c785ce44"
SRC_URI[gstreamer-0.16.7.sha256sum] = "9ff5d0f7ff308ae37e6eb47b6ded17785bdea06e438a708cd09e0288c1862f33"
SRC_URI[gstreamer-app-0.16.5.sha256sum] = "cc80888271338c3ede875d8cafc452eb207476ff5539dcbe0018a8f5b827af0e"
SRC_URI[gstreamer-app-sys-0.9.1.sha256sum] = "813f64275c9e7b33b828b9efcf9dfa64b95996766d4de996e84363ac65b87e3d"
SRC_URI[gstreamer-base-0.16.5.sha256sum] = "bafd01c56f59cb10f4b5a10f97bb4bdf8c2b2784ae5b04da7e2d400cf6e6afcf"
SRC_URI[gstreamer-base-sys-0.9.1.sha256sum] = "a4b7b6dc2d6e160a1ae28612f602bd500b3fa474ce90bf6bb2f08072682beef5"
SRC_URI[gstreamer-sys-0.9.1.sha256sum] = "fc1f154082d01af5718c5f8a8eb4f565a4ea5586ad8833a8fc2c2aa6844b601d"
SRC_URI[gstreamer-video-0.16.7.sha256sum] = "f7bbb1485d87469849ec45c08e03c2f280d3ea20ff3c439d03185be54e3ce98e"
SRC_URI[gstreamer-video-sys-0.9.1.sha256sum] = "92347e46438007d6a2386302125f62cb9df6769cdacb931af5c0f12c1ee21de4"
SRC_URI[gtk-0.18.1.sha256sum] = "93c4f5e0e20b60e10631a5f06da7fe3dda744b05ad0ea71fee2f47adf865890c"
SRC_URI[gtk-sys-0.18.0.sha256sum] = "771437bf1de2c1c0b496c11505bdf748e26066bbe942dfc8f614c9460f6d7722"
SRC_URI[gtk3-macros-0.18.0.sha256sum] = "c6063efb63db582968fb7df72e1ae68aa6360dcfb0a75143f34fc7d616bad75e"
SRC_URI[half-2.4.1.sha256sum] = "6dd08c532ae367adf81c312a4580bc67f1d0fe8bc9c460520283f4c0ff277888"
SRC_URI[hashbrown-0.12.3.sha256sum] = "8a9ee70c43aaf417c914396645a0fa852624801b24ebb7ae78fe8272889ac888"
SRC_URI[hashbrown-0.14.5.sha256sum] = "e5274423e17b7c9fc20b6e7e208532f9b19825d82dfd615708b70edd83df41f1"
SRC_URI[hashbrown-0.15.4.sha256sum] = "5971ac85611da7067dbfcabef3c70ebb5606018acd9e2a3903a0da507521e0d5"
SRC_URI[heck-0.4.1.sha256sum] = "95505c38b4572b2d910cecb0281560f54b440a19336cbbcb27bf6ce6adc6f5a8"
SRC_URI[heck-0.3.3.sha256sum] = "6d621efb26863f0e9924c6ac577e8275e5e6b77455db64ffa6c65c904e9e132c"
SRC_URI[heck-0.5.0.sha256sum] = "2304e00983f87ffb38b55b444b5e3b60a884b5d30c0fca7d82fe33449bbe55ea"
SRC_URI[hermit-abi-0.3.9.sha256sum] = "d231dfb89cfffdbc30e7fc41579ed6066ad03abda9e567ccafae602b97ec5024"
SRC_URI[hermit-abi-0.5.0.sha256sum] = "fbd780fe5cc30f81464441920d82ac8740e2e46b29a6fad543ddd075229ce37e"
SRC_URI[hermit-abi-0.4.0.sha256sum] = "fbf6a919d6cf397374f7dfeeea91d974c7c0a7221d0d0f4f20d859d329e53fcc"
SRC_URI[hermit-abi-0.1.19.sha256sum] = "62b467343b94ba476dcb2500d242dadbb39557df889310ac77c5d99100aaac33"
SRC_URI[hex-0.4.3.sha256sum] = "7f24254aa9a54b5c858eaee2f5bccdb46aaf0e486a595ed5fd8f86ba55232a70"
SRC_URI[hmac-0.12.1.sha256sum] = "6c49c37c09c17a53d937dfbb742eb3a961d65a994e6bcdcf37e7399d0cc8ab5e"
SRC_URI[home-0.5.9.sha256sum] = "e3d1354bf6b7235cb4a0576c2619fd4ed18183f689b12b006a0ee7329eeff9a5"
SRC_URI[hound-3.5.1.sha256sum] = "62adaabb884c94955b19907d60019f4e145d091c75345379e70d1ee696f7854f"
SRC_URI[html-escape-0.2.13.sha256sum] = "6d1ad449764d627e22bfd7cd5e8868264fc9236e07c752972b4080cd351cb476"
SRC_URI[http-1.3.1.sha256sum] = "f4a85d31aea989eead29a3aaf9e1115a180df8282431156e533de47660892565"
SRC_URI[http-body-1.0.1.sha256sum] = "1efedce1fb8e6913f23e0c92de8e62cd5b772a67e7b3946df930a62566c93184"
SRC_URI[http-body-util-0.1.3.sha256sum] = "b021d93e26becf5dc7e1b75b1bed1fd93124b374ceb73f43d4d4eafec896a64a"
SRC_URI[httparse-1.10.1.sha256sum] = "6dbf3de79e51f3d586ab4cb9d5c3e2c14aa28ed23d180cf89b4df0454a69cc87"
SRC_URI[humantime-2.1.0.sha256sum] = "9a3a5bfb195931eeb336b2a7b4d761daec841b97f947d34394601737a7bba5e4"
SRC_URI[hyper-1.6.0.sha256sum] = "cc2b571658e38e0c01b1fdca3bbbe93c00d3d71693ff2770043f8c29bc7d6f80"
SRC_URI[hyper-rustls-0.27.6.sha256sum] = "03a01595e11bdcec50946522c32dde3fc6914743000a68b93000965f2f02406d"
SRC_URI[hyper-tls-0.6.0.sha256sum] = "70206fc6890eaca9fde8a0bf71caa2ddfc9fe045ac9e5c70df101a7dbde866e0"
SRC_URI[hyper-util-0.1.12.sha256sum] = "cf9f1e950e0d9d1d3c47184416723cf29c0d1f93bd8cccf37e4beb6b44f31710"
SRC_URI[iana-time-zone-0.1.60.sha256sum] = "e7ffbb5a1b541ea2561f8c41c087286cc091e21e556a4f09a8f6cbf17b69b141"
SRC_URI[iana-time-zone-haiku-0.1.2.sha256sum] = "f31827a206f56af32e590ba56d5d2d085f558508192593743f16b2306495269f"
SRC_URI[idna-0.5.0.sha256sum] = "634d9b1461af396cad843f47fdba5597a4f9e6ddd4bfb6ff5d85028c25cb12f6"
SRC_URI[image-0.25.1.sha256sum] = "fd54d660e773627692c524beaad361aca785a4f9f5730ce91f42aabe5bce3d11"
SRC_URI[image-0.24.9.sha256sum] = "5690139d2f55868e080017335e4b94cb7414274c74f1669c84fb5feba2c9f69d"
SRC_URI[include_dir-0.7.4.sha256sum] = "923d117408f1e49d914f1a379a309cffe4f18c05cf4e3d12e613a15fc81bd0dd"
SRC_URI[include_dir_macros-0.7.4.sha256sum] = "7cab85a7ed0bd5f0e76d93846e0147172bed2e2d3f859bcc33a8d9699cad1a75"
SRC_URI[indexmap-2.2.6.sha256sum] = "168fb715dda47215e360912c096649d23d58bf392ac62f73919e831745e40f26"
SRC_URI[inotify-0.10.2.sha256sum] = "fdd168d97690d0b8c412d6b6c10360277f4d7ee495c5d0d5d5fe0854923255cc"
SRC_URI[inotify-sys-0.1.5.sha256sum] = "e05c02b5e89bff3b946cedeca278abc628fe811e604f027c45a8aa3cf793d0eb"
SRC_URI[inout-0.1.3.sha256sum] = "a0c10553d664a4d0bcff9f4215d0aac67a639cc68ef660840afe309b807bc9f5"
SRC_URI[instant-0.1.13.sha256sum] = "e0242819d153cba4b4b05a5a8f2a7e9bbf97b6055b2a002b395c96b5ff3c0222"
SRC_URI[io-lifetimes-1.0.11.sha256sum] = "eae7b9aee968036d54dce06cebaefd919e4472e753296daccd6d344e3e2df0c2"
SRC_URI[ioctl-rs-0.1.6.sha256sum] = "f7970510895cee30b3e9128319f2cefd4bde883a39f38baa279567ba3a7eb97d"
SRC_URI[ipnet-2.9.0.sha256sum] = "8f518f335dce6725a761382244631d86cf0ccb2863413590b31338feb467f9c3"
SRC_URI[is-terminal-0.4.16.sha256sum] = "e04d7f318608d35d4b61ddd75cbdaee86b023ebe2bd5a66ee0915f0bf93095a9"
SRC_URI[is_debug-1.0.1.sha256sum] = "06d198e9919d9822d5f7083ba8530e04de87841eaf21ead9af8f2304efd57c89"
SRC_URI[is_terminal_polyfill-1.70.0.sha256sum] = "f8478577c03552c21db0e2724ffb8986a5ce7af88107e6be5d2ee6e158c12800"
SRC_URI[itertools-0.12.1.sha256sum] = "ba291022dbbd398a455acf126c1e341954079855bc60dfdda641363bd6922569"
SRC_URI[itertools-0.9.0.sha256sum] = "284f18f85651fe11e8a991b2adb42cb078325c996ed026d994719efcfca1d54b"
SRC_URI[itoa-1.0.11.sha256sum] = "49f1f14873335454500d59611f1cf4a4b0f786f9ac11f4312a78e4cf2566695b"
SRC_URI[itoa-0.3.4.sha256sum] = "8324a32baf01e2ae060e9de58ed0bc2320c9a2833491ee36cd3b4c414de4db8c"
SRC_URI[jni-0.21.1.sha256sum] = "1a87aa2bb7d2af34197c04845522473242e1aa17c12f4935d5856491a7fb8c97"
SRC_URI[jni-sys-0.3.0.sha256sum] = "8eaf4bc02d17cbdd7ff4c7438cafcdf7fb9a4613313ad11b4f8fefe7d3fa0130"
SRC_URI[jobserver-0.1.31.sha256sum] = "d2b099aaa34a9751c5bf0878add70444e1ed2dd73f347be99003d4577277de6e"
SRC_URI[jpeg-decoder-0.3.1.sha256sum] = "f5d4a7da358eff58addd2877a45865158f0d78c911d43a5784ceb7bbf52833b0"
SRC_URI[js-sys-0.3.77.sha256sum] = "1cfaf33c695fc6e08064efbc1f72ec937429614f25eef83af942d0e227c3a28f"
SRC_URI[kcp-sys-0.1.0.sha256sum] = "e3578f8dce33c9ca3ee96edbcdbd2033c7681dcc79ea39f4ed61ea36949d079c"
SRC_URI[keepawake-0.4.3.sha256sum] = "eeb703cc290b122b0d4b64dfedbe4f58a6800f58e2c0301a49e7107929c34011"
SRC_URI[kernel32-sys-0.2.2.sha256sum] = "7507624b29483431c0ba2d82aece8ca6cdba9382bff4ddd0f7490560c056098d"
SRC_URI[keyboard-types-0.7.0.sha256sum] = "b750dcadc39a09dbadd74e118f6dd6598df77fa01df0cfcdc52c28dece74528a"
SRC_URI[kurbo-0.9.5.sha256sum] = "bd85a5776cd9500c2e2059c8c76c3b01528566b7fcbaf8098b55a33fc298849b"
SRC_URI[lazy_static-1.5.0.sha256sum] = "bbd2bcb4c963f2ddae06a2efc7e9f3591312473c50c6685e1f298068316e66fe"
SRC_URI[lazycell-1.3.0.sha256sum] = "830d08ce1d1d941e6b30645f1a0eb5643013d835ce3779a5fc208261dbe10f55"
SRC_URI[lebe-0.5.2.sha256sum] = "03087c2bad5e1034e8cace5926dec053fb3790248370865f5117a7d0213354c8"
SRC_URI[libappindicator-0.9.0.sha256sum] = "03589b9607c868cc7ae54c0b2a22c8dc03dd41692d48f2d7df73615c6a95dc0a"
SRC_URI[libappindicator-sys-0.9.0.sha256sum] = "6e9ec52138abedcc58dc17a7c6c0c00a2bdb4f3427c7f63fa97fd0d859155caf"
SRC_URI[libc-0.2.171.sha256sum] = "c19937216e9d3aa9956d9bb8dfc0b0c8beb6058fc4f7a4dc4d850edf86a237d6"
SRC_URI[libdbus-sys-0.2.5.sha256sum] = "06085512b750d640299b79be4bad3d2fa90a9c00b1fd9e1b46364f66f0485c72"
SRC_URI[libgit2-sys-0.14.2+1.5.1.sha256sum] = "7f3d95f6b51075fe9810a7ae22c7095f12b98005ab364d8544797a825ce946a4"
SRC_URI[libloading-0.7.4.sha256sum] = "b67380fd3b2fbe7527a606e18729d21c6f3951633d0500574c4dc22d2d638b9f"
SRC_URI[libloading-0.8.4.sha256sum] = "e310b3a6b5907f99202fcdb4960ff45b93735d7c7d96b760fcff8db2dc0e103d"
SRC_URI[libm-0.2.8.sha256sum] = "4ec2a862134d2a7d32d7983ddcdd1c4923530833c9f2ea1a44fc5fa473989058"
SRC_URI[libpulse-binding-2.28.1.sha256sum] = "ed3557a2dfc380c8f061189a01c6ae7348354e0c9886038dc6c171219c08eaff"
SRC_URI[libpulse-simple-binding-2.28.1.sha256sum] = "05fd6b68f33f6a251265e6ed1212dc3107caad7c5c6fdcd847b2e65ef58c308d"
SRC_URI[libpulse-simple-sys-1.21.1.sha256sum] = "ea6613b4199d8b9f0edcfb623e020cb17bbd0bee8dd21f3c7cc938de561c4152"
SRC_URI[libpulse-sys-1.21.0.sha256sum] = "bc19e110fbf42c17260d30f6d3dc545f58491c7830d38ecb9aaca96e26067a9b"
SRC_URI[libredox-0.1.3.sha256sum] = "c0ff37bd590ca25063e35af745c343cb7a0271906fb7b37e4813e8f79f00268d"
SRC_URI[libsodium-sys-0.2.7.sha256sum] = "6b779387cd56adfbc02ea4a668e704f729be8d6a6abd2c27ca5ee537849a92fd"
SRC_URI[libxdo-0.6.0.sha256sum] = "00333b8756a3d28e78def82067a377de7fa61b24909000aeaa2b446a948d14db"
SRC_URI[libxdo-sys-0.11.0.sha256sum] = "db23b9e7e2b7831bbd8aac0bbeeeb7b68cbebc162b227e7052e8e55829a09212"
SRC_URI[libz-sys-1.1.18.sha256sum] = "c15da26e5af7e25c90b37a2d75cdbf940cf4a55316de9d84c679c9b8bfabf82e"
SRC_URI[line-wrap-0.2.0.sha256sum] = "dd1bc4d24ad230d21fb898d1116b1801d7adfc449d42026475862ab48b11e70e"
SRC_URI[linux-raw-sys-0.3.8.sha256sum] = "ef53942eb7bf7ff43a617b3e2c1c4a5ecf5944a7c1bc12d7ee39bbb15e5c1519"
SRC_URI[linux-raw-sys-0.6.5.sha256sum] = "2a385b1be4e5c3e362ad2ffa73c392e53f031eaa5b7d648e64cd87f27f6063d7"
SRC_URI[linux-raw-sys-0.4.14.sha256sum] = "78b3ae25bc7c8c38cec158d1f2757ee79e9b3740fbc7ccf0e59e4b08d793fa89"
SRC_URI[lock_api-0.4.12.sha256sum] = "07af8b9cdd281b7915f413fa73f29ebd5d55d0d3f0155584dade1ff18cea1b17"
SRC_URI[log-0.4.22.sha256sum] = "a7a70ba024b9dc04c27ea2f0c0548feb474ec5c54bba33a7f72f873a39d07b24"
SRC_URI[lru-slab-0.1.2.sha256sum] = "112b39cec0b298b6c1999fee3e31427f74f676e4cb9879ed1a121b43661a4154"
SRC_URI[mac_address-1.1.7.sha256sum] = "8836fae9d0d4be2c8b4efcdd79e828a2faa058a90d005abf42f91cac5493a08e"
SRC_URI[mach2-0.4.2.sha256sum] = "19b955cdeb2a02b9117f121ce63aa52d08ade45de53e48fe6a38b39c10f6f709"
SRC_URI[machine-uid-0.3.0.sha256sum] = "26141aceb9f046065617266f41a4a652e4583da643472a10a89b4b3664d99eb6"
SRC_URI[malloc_buf-0.0.6.sha256sum] = "62bb907fe88d54d8d9ce32a3cceab4218ed2f6b7d35617cafe9adf84e43919cb"
SRC_URI[matches-0.1.10.sha256sum] = "2532096657941c2fea9c289d370a250971c689d4f143798ff67113ec042024a5"
SRC_URI[md5-0.7.0.sha256sum] = "490cc448043f947bae3cbee9c203358d62dbee0db12107a74be5c30ccfd09771"
SRC_URI[memalloc-0.1.0.sha256sum] = "df39d232f5c40b0891c10216992c2f250c054105cb1e56f0fc9032db6203ecc1"
SRC_URI[memchr-2.7.4.sha256sum] = "78ca9ab1a0babb1e7d5695e3530886289c18cf2f87ec19a575a0abdce112e3a3"
SRC_URI[memmap2-0.9.8.sha256sum] = "843a98750cd611cc2965a8213b53b43e715f13c37a9e096c6408e69990961db7"
SRC_URI[memoffset-0.9.1.sha256sum] = "488016bfae457b036d996092f6cb448677611ce4449e970ceaf42695203f218a"
SRC_URI[memoffset-0.7.1.sha256sum] = "5de893c32cde5f383baa4c04c5d6dbdd735cfd4a794b0debdb2bb1b421da5ff4"
SRC_URI[memoffset-0.6.5.sha256sum] = "5aa361d4faea93603064a027415f07bd8e1d5c88c9fbf68bf56a285428fd79ce"
SRC_URI[metal-0.18.0.sha256sum] = "e198a0ee42bdbe9ef2c09d0b9426f3b2b47d90d93a4a9b0395c4cea605e92dc0"
SRC_URI[mime-0.3.17.sha256sum] = "6877bb514081ee2a7ff5ef9de3281f14a4dd4bceac4c09388074a6b5df8a139a"
SRC_URI[minimal-lexical-0.2.1.sha256sum] = "68354c5c6bd36d73ff3feceb05efa59b6acb7626617f4962be322a825e61f79a"
SRC_URI[miniz_oxide-0.7.4.sha256sum] = "b8a240ddb74feaf34a79a7add65a741f3167852fba007066dcac1ca548d89c08"
SRC_URI[mio-0.8.11.sha256sum] = "a4a650543ca06a924e8b371db273b2756685faae30f8487da1b56505a8f78b0c"
SRC_URI[mio-1.0.3.sha256sum] = "2886843bf800fba2e3377cff24abf6379b4c4d5c6681eaf9ea5b0d15090450bd"
SRC_URI[mozjpeg-0.10.11.sha256sum] = "55571bce4f12d80ceb4296526e7614f796df72daaaac85f265ab732fa47b7bc9"
SRC_URI[mozjpeg-sys-2.2.2.sha256sum] = "ad3626d7942d5b56cc6d47b1c59724c0a976b786fca059c5aaa904aef6324d55"
SRC_URI[muda-0.13.5.sha256sum] = "86b959f97c97044e4c96e32e1db292a7d594449546a3c6b77ae613dc3a5b5145"
SRC_URI[muldiv-0.2.1.sha256sum] = "0419348c027fa7be448d2ae7ea0e4e04c2334c31dc4e74ab29f00a2a7ca69204"
SRC_URI[nanorand-0.7.0.sha256sum] = "6a51313c5820b0b02bd422f4b44776fbf47961755c74ce64afc73bfad10226c3"
SRC_URI[nasm-rs-0.3.0.sha256sum] = "12fcfa1bd49e0342ec1d07ed2be83b59963e7acbeb9310e1bb2c07b69dadd959"
SRC_URI[native-tls-0.2.12.sha256sum] = "a8614eb2c83d59d1c8cc974dd3f920198647674a0a035e1af1fa58707e317466"
SRC_URI[native-windows-gui-1.0.13.sha256sum] = "4f7003a669f68deb6b7c57d74fff4f8e533c44a3f0b297492440ef4ff5a28454"
SRC_URI[ndk-0.7.0.sha256sum] = "451422b7e4718271c8b5b3aadf5adedba43dc76312454b387e98fae0fc951aa0"
SRC_URI[ndk-0.9.0.sha256sum] = "c3f42e7bbe13d351b6bead8286a43aac9534b82bd3cc43e47037f012ebfd62d4"
SRC_URI[ndk-0.8.0.sha256sum] = "2076a31b7010b17a38c01907c45b945e8f11495ee4dd588309718901b1f7a5b7"
SRC_URI[ndk-context-0.1.1.sha256sum] = "27b02d87554356db9e9a873add8782d4ea6e3e58ea071a9adb9a2e8ddb884a8b"
SRC_URI[ndk-sys-0.4.1+23.1.7779620.sha256sum] = "3cf2aae958bd232cac5069850591667ad422d263686d75b52a065f9badeee5a3"
SRC_URI[ndk-sys-0.6.0+11769913.sha256sum] = "ee6cda3051665f1fb8d9e08fc35c96d5a244fb1be711a03b71118828afc9a873"
SRC_URI[ndk-sys-0.5.0+25.2.9519653.sha256sum] = "8c196769dd60fd4f363e11d948139556a344e79d451aeb2fa2fd040738ef7691"
SRC_URI[netlink-packet-core-0.5.0.sha256sum] = "7e5cf0b54effda4b91615c40ff0fd12d0d4c9a6e0f5116874f03941792ff535a"
SRC_URI[netlink-packet-route-0.15.0.sha256sum] = "ea993e32c77d87f01236c38f572ecb6c311d592e56a06262a007fd2a6e31253c"
SRC_URI[netlink-packet-utils-0.5.2.sha256sum] = "0ede8a08c71ad5a95cdd0e4e52facd37190977039a4704eb82a283f713747d34"
SRC_URI[netlink-sys-0.8.6.sha256sum] = "416060d346fbaf1f23f9512963e3e878f1a78e707cb699ba9215761754244307"
SRC_URI[nix-0.25.1.sha256sum] = "f346ff70e7dbfd675fe90590b92d59ef2de15a8779ae305ebcbfd3f0caf59be4"
SRC_URI[nix-0.28.0.sha256sum] = "ab2156c4fce2f8df6c499cc1c763e4394b7482525bf2a9701c9d79d215f519e4"
SRC_URI[nix-0.23.2.sha256sum] = "8f3790c00a0150112de0f4cd161e3d7fc4b2d8a5542ffc35f099a2562aecb35c"
SRC_URI[nix-0.29.0.sha256sum] = "71e2746dc3a24dd78b3cfcb7be93368c6de9963d30f43a6a73998a9cf4b17b46"
SRC_URI[nix-0.26.4.sha256sum] = "598beaf3cc6fdd9a5dfb1630c2800c7acd31df7aaf0f565796fba2b53ca1af1b"
SRC_URI[nokhwa-0.10.7.sha256sum] = "726195ba627960de1df8695400807eb929d196cae7194dc1cf7ee06728136168"
SRC_URI[nokhwa-bindings-linux-0.1.1.sha256sum] = "9f1abe593709a177b1a6b87ebbae0bfe5ecc2f8d80d81e89e0a9b68487490a01"
SRC_URI[nokhwa-bindings-macos-0.2.2.sha256sum] = "f12deaea95ab828355b0a86ec0dffde895e4d5d9b79714a3be2caa294d868109"
SRC_URI[nokhwa-bindings-windows-0.4.2.sha256sum] = "21bdd1a21fba66d677559b3e216cdcf23234569853afbf26954d0502c93ff18b"
SRC_URI[nokhwa-core-0.1.5.sha256sum] = "b09efd57b56917acc6bd0edad5111b1d073531f14f8625f980875a1fd78a3644"
SRC_URI[nom-7.1.3.sha256sum] = "d273983c5a657a70a3e8f2a01329822f3b8c8172b73826411a55751e404a0a4a"
SRC_URI[ntapi-0.4.1.sha256sum] = "e8a3895c6391c39d7fe7ebc444a87eb2991b2a0bc718fdabd071eec617fc68e4"
SRC_URI[nu-ansi-term-0.49.0.sha256sum] = "c073d3c1930d0751774acf49e66653acecb416c3a54c6ec095a9b11caddb5a68"
SRC_URI[nu-ansi-term-0.46.0.sha256sum] = "77a8165726e8236064dbb45459242600304b42a5ea24ee2948e18e023bf7ba84"
SRC_URI[num-bigint-0.4.6.sha256sum] = "a5e44f723f1133c9deac646763579fdb3ac745e418f2a7af9cd0c431da1f20b9"
SRC_URI[num-conv-0.1.0.sha256sum] = "51d515d32fb182ee37cda2ccdcb92950d6a3c2893aa280e540671c2cd0f3b1d9"
SRC_URI[num-derive-0.3.3.sha256sum] = "876a53fff98e03a936a674b29568b0e605f06b29372c2489ff4de23f1949743d"
SRC_URI[num-derive-0.4.2.sha256sum] = "ed3955f1a9c7c0c15e092f9c887db08b1fc683305fdf6eb6684f22555355e202"
SRC_URI[num-integer-0.1.46.sha256sum] = "7969661fd2958a5cb096e56c8e1ad0444ac2bbcd0061bd28660485a44879858f"
SRC_URI[num-rational-0.3.2.sha256sum] = "12ac428b1cb17fce6f731001d307d351ec70a6d202fc2e60f7d4c5e42d8f4f07"
SRC_URI[num-traits-0.1.43.sha256sum] = "92e5113e9fd4cc14ded8e499429f396a20f98c772a47cc8622a736e1ec843c31"
SRC_URI[num-traits-0.2.19.sha256sum] = "071dfc062690e90b734c0b2273ce72ad0ffa95f0c74596bc250dcfd960262841"
SRC_URI[num_cpus-1.16.0.sha256sum] = "4161fcb6d602d4d2081af7c3a45852d875a03dd337a6bfdd6e06407b61342a43"
SRC_URI[num_enum-0.5.11.sha256sum] = "1f646caf906c20226733ed5b1374287eb97e3c2a5c227ce668c1f2ce20ae57c9"
SRC_URI[num_enum-0.7.2.sha256sum] = "02339744ee7253741199f897151b38e72257d13802d4ee837285cc2990a90845"
SRC_URI[num_enum_derive-0.7.2.sha256sum] = "681030a937600a36906c185595136d26abfebb4aa9c65701cefcaf8578bb982b"
SRC_URI[num_enum_derive-0.5.11.sha256sum] = "dcbff9bc912032c62bf65ef1d5aea88983b420f4f839db1e9b0c281a25c9c799"
SRC_URI[num_threads-0.1.7.sha256sum] = "5c7398b9c8b70908f6371f47ed36737907c87c52af34c268fed0bf0ceb92ead9"
SRC_URI[objc-0.2.7.sha256sum] = "915b1b472bc21c53464d6c8461c9d3af805ba1ef837e1cac254428f4a77177b1"
SRC_URI[objc-foundation-0.1.1.sha256sum] = "1add1b659e36c9607c7aab864a76c7a4c2760cd0cd2e120f3fb8b952c7e22bf9"
SRC_URI[objc-sys-0.3.5.sha256sum] = "cdb91bdd390c7ce1a8607f35f3ca7151b65afc0ff5ff3b34fa350f7d7c7e4310"
SRC_URI[objc2-0.5.2.sha256sum] = "46a785d4eeff09c14c487497c162e92766fbb3e4059a71840cecc03d9a50b804"
SRC_URI[objc2-app-kit-0.2.2.sha256sum] = "e4e89ad9e3d7d297152b17d39ed92cd50ca8063a89a9fa569046d41568891eff"
SRC_URI[objc2-cloud-kit-0.2.2.sha256sum] = "74dd3b56391c7a0596a295029734d3c1c5e7e510a4cb30245f8221ccea96b009"
SRC_URI[objc2-contacts-0.2.2.sha256sum] = "a5ff520e9c33812fd374d8deecef01d4a840e7b41862d849513de77e44aa4889"
SRC_URI[objc2-core-data-0.2.2.sha256sum] = "617fbf49e071c178c0b24c080767db52958f716d9eabdf0890523aeae54773ef"
SRC_URI[objc2-core-image-0.2.2.sha256sum] = "55260963a527c99f1819c4f8e3b47fe04f9650694ef348ffd2227e8196d34c80"
SRC_URI[objc2-core-location-0.2.2.sha256sum] = "000cfee34e683244f284252ee206a27953279d370e309649dc3ee317b37e5781"
SRC_URI[objc2-encode-4.0.3.sha256sum] = "7891e71393cd1f227313c9379a26a584ff3d7e6e7159e988851f0934c993f0f8"
SRC_URI[objc2-foundation-0.2.2.sha256sum] = "0ee638a5da3799329310ad4cfa62fbf045d5f56e3ef5ba4149e7452dcf89d5a8"
SRC_URI[objc2-link-presentation-0.2.2.sha256sum] = "a1a1ae721c5e35be65f01a03b6d2ac13a54cb4fa70d8a5da293d7b0020261398"
SRC_URI[objc2-metal-0.2.2.sha256sum] = "dd0cba1276f6023976a406a14ffa85e1fdd19df6b0f737b063b95f6c8c7aadd6"
SRC_URI[objc2-quartz-core-0.2.2.sha256sum] = "e42bee7bff906b14b167da2bac5efe6b6a07e6f7c0a21a7308d40c960242dc7a"
SRC_URI[objc2-symbols-0.2.2.sha256sum] = "0a684efe3dec1b305badae1a28f6555f6ddd3bb2c2267896782858d5a78404dc"
SRC_URI[objc2-ui-kit-0.2.2.sha256sum] = "b8bb46798b20cd6b91cbd113524c490f1686f4c4e8f49502431415f3512e2b6f"
SRC_URI[objc2-uniform-type-identifiers-0.2.2.sha256sum] = "44fa5f9748dbfe1ca6c0b79ad20725a11eca7c2218bceb4b005cb1be26273bfe"
SRC_URI[objc2-user-notifications-0.2.2.sha256sum] = "76cfcbf642358e8689af64cee815d139339f3ed8ad05103ed5eaf73db8d84cb3"
SRC_URI[objc_exception-0.1.2.sha256sum] = "ad970fb455818ad6cba4c122ad012fae53ae8b4795f86378bce65e4f6bab2ca4"
SRC_URI[objc_id-0.1.1.sha256sum] = "c92d4ddb4bd7b50d730c215ff871754d0da6b2178849f8a2a2ab69712d0c073b"
SRC_URI[object-0.36.1.sha256sum] = "081b846d1d56ddfc18fdf1a922e4f6e07a11768ea1b92dec44e42b72712ccfce"
SRC_URI[oboe-0.6.1.sha256sum] = "e8b61bebd49e5d43f5f8cc7ee2891c16e0f41ec7954d36bcb6c14c5e0de867fb"
SRC_URI[oboe-sys-0.6.1.sha256sum] = "6c8bb09a4a2b1d668170cfe0a7d5bc103f8999fb316c98099b6a9939c9f2e79d"
SRC_URI[once_cell-1.19.0.sha256sum] = "3fdb12b2476b595f9358c5161aa467c2438859caa136dec86c26fdd2efe17b92"
SRC_URI[openssl-0.10.68.sha256sum] = "6174bc48f102d208783c2c84bf931bb75927a617866870de8a4ea85597f871f5"
SRC_URI[openssl-macros-0.1.1.sha256sum] = "a948666b637a0f465e8564c73e89d4dde00d72d4d473cc972f390fc3dcee7d9c"
SRC_URI[openssl-probe-0.1.5.sha256sum] = "ff011a302c396a5197692431fc1948019154afc178baf7d8e37367442a4601cf"
SRC_URI[openssl-sys-0.9.104.sha256sum] = "45abf306cbf99debc8195b66b7346498d7b10c210de50418b5ccd7ceba08c741"
SRC_URI[option-ext-0.2.0.sha256sum] = "04744f49eae99ab78e0d5c0b603ab218f515ea8cfe5a456d7629ad883a3b6e7d"
SRC_URI[orbclient-0.3.48.sha256sum] = "ba0b26cec2e24f08ed8bb31519a9333140a6599b867dac464bb150bdb796fd43"
SRC_URI[ordered-multimap-0.4.3.sha256sum] = "ccd746e37177e1711c20dd619a1620f34f5c8b569c53590a72dedd5344d8924a"
SRC_URI[ordered-stream-0.2.0.sha256sum] = "9aa2b01e1d916879f73a53d01d1d6cee68adbb31d6d9177a8cfce093cced1d50"
SRC_URI[os-version-0.2.0.sha256sum] = "5a8a1fed76ac765e39058ca106b6229a93c5a60292a1bd4b602ce2be11e1c020"
SRC_URI[os_pipe-1.2.0.sha256sum] = "29d73ba8daf8fac13b0501d1abeddcfe21ba7401ada61a819144b6c2a4f32209"
SRC_URI[osascript-0.3.0.sha256sum] = "38731fa859ef679f1aec66ca9562165926b442f298467f76f5990f431efe87dc"
SRC_URI[overload-0.1.1.sha256sum] = "b15813163c1d831bf4a13c3610c05c0d03b39feb07f7e09fa234dac9b15aaf39"
SRC_URI[owned_ttf_parser-0.25.1.sha256sum] = "36820e9051aca1014ddc75770aab4d68bc1e9e632f0f5627c4086bc216fb583b"
SRC_URI[pam-0.7.0.sha256sum] = "fa2bdc959c201c047004a1420a92aaa1dd1a6b64d5ef333aa3a4ac764fb93097"
SRC_URI[pam-macros-0.0.3.sha256sum] = "c94f3b9b97df3c6d4e51a14916639b24e02c7d15d1dba686ce9b1118277cb811"
SRC_URI[pam-sys-1.0.0-alpha4.sha256sum] = "5e9dfd42858f6a6bb1081079fd9dc259ca3e2aaece6cb689fd36b1058046c969"
SRC_URI[pango-0.18.3.sha256sum] = "7ca27ec1eb0457ab26f3036ea52229edbdb74dee1edd29063f5b9b010e7ebee4"
SRC_URI[pango-sys-0.18.0.sha256sum] = "436737e391a843e5933d6d9aa102cb126d501e815b83601365a948a518555dc5"
SRC_URI[parking-2.2.0.sha256sum] = "bb813b8af86854136c6922af0598d719255ecb2179515e6e7730d468f05c9cae"
SRC_URI[parking_lot-0.12.3.sha256sum] = "f1bf18183cf54e8d6059647fc3063646a1801cf30896933ec2311622cc4b9a27"
SRC_URI[parking_lot_core-0.9.10.sha256sum] = "1e401f977ab385c9e4e3ab30627d6f26d00e2c73eef317493c4ec6d468726cf8"
SRC_URI[password-hash-0.4.2.sha256sum] = "7676374caaee8a325c9e7a2ae557f216c5563a171d6997b0ef8a65af35147700"
SRC_URI[paste-1.0.15.sha256sum] = "57c0d7b74b563b49d38dae00a0c37d4d6de9b432382b2892f0574ddcae73fd0a"
SRC_URI[pbkdf2-0.11.0.sha256sum] = "83a0692ec44e4cf1ef28ca317f14f8f07da2d95ec3fa01f86e4467b725e60917"
SRC_URI[peeking_take_while-0.1.2.sha256sum] = "19b17cddbe7ec3f8bc800887bab5e717348c95ea2ca0b1bf0837fb964dc67099"
SRC_URI[percent-encoding-2.3.1.sha256sum] = "e3148f5046208a5d56bcfc03053e3ca6334e51da8dfb19b6cdc8b306fae3283e"
SRC_URI[petgraph-0.6.5.sha256sum] = "b4c5cc86750666a3ed20bdaf5ca2a0344f9c67674cae0515bec2da16fbaa47db"
SRC_URI[phf-0.7.24.sha256sum] = "b3da44b85f8e8dfaec21adae67f95d93244b2ecf6ad2a692320598dcc8e6dd18"
SRC_URI[phf-0.11.3.sha256sum] = "1fd6780a80ae0c52cc120a26a1a42c1ae51b247a253e4e06113d23d2c2edd078"
SRC_URI[phf_codegen-0.11.3.sha256sum] = "aef8048c789fa5e851558d709946d6d79a8ff88c0440c587967f8e94bfb1216a"
SRC_URI[phf_codegen-0.7.24.sha256sum] = "b03e85129e324ad4166b06b2c7491ae27fe3ec353af72e72cd1654c7225d517e"
SRC_URI[phf_generator-0.11.3.sha256sum] = "3c80231409c20246a13fddb31776fb942c38553c51e871f8cbd687a4cfb5843d"
SRC_URI[phf_generator-0.7.24.sha256sum] = "09364cc93c159b8b06b1f4dd8a4398984503483891b0c26b867cf431fb132662"
SRC_URI[phf_shared-0.11.3.sha256sum] = "67eabc2ef2a60eb7faa00097bd1ffdb5bd28e62bf39990626a582201b7a754e5"
SRC_URI[phf_shared-0.7.24.sha256sum] = "234f71a15de2288bcb7e3b6515828d22af7ec8598ee6d24c3b526fa0a80b67a0"
SRC_URI[piet-0.6.2.sha256sum] = "e381186490a3e2017a506d62b759ea8eaf4be14666b13ed53973e8ae193451b1"
SRC_URI[piet-coregraphics-0.6.2.sha256sum] = "a819b41d2ddb1d8abf3e45e49422f866cba281b4abb5e2fb948bba06e2c3d3f7"
SRC_URI[pin-project-1.1.5.sha256sum] = "b6bf43b791c5b9e34c3d182969b4abb522f9343702850a2e57f460d00d09b4b3"
SRC_URI[pin-project-internal-1.1.5.sha256sum] = "2f38a4412a78282e09a2cf38d195ea5420d15ba0602cb375210efbc877243965"
SRC_URI[pin-project-lite-0.2.14.sha256sum] = "bda66fc9667c18cb2758a2ac84d1167245054bcf85d5d1aaa6923f45801bdd02"
SRC_URI[pin-utils-0.1.0.sha256sum] = "8b870d8c151b6f2fb93e84a13146138f05d02ed11c7e7c54f8826aaaf7c9f184"
SRC_URI[piper-0.2.3.sha256sum] = "ae1d5c74c9876f070d3e8fd503d748c7d974c3e48da8f41350fa5222ef9b4391"
SRC_URI[pkg-config-0.3.30.sha256sum] = "d231b230927b5e4ad203db57bbcbee2802f6bce620b1e4a9024a07d94e2907ec"
SRC_URI[plist-1.6.1.sha256sum] = "d9d34169e64b3c7a80c8621a48adaf44e0cf62c78a9b25dd9dd35f1881a17cf9"
SRC_URI[png-0.17.13.sha256sum] = "06e4b0d3d1312775e782c86c91a111aa1f910cbb65e1337f9975b5f9a554b5e1"
SRC_URI[polling-3.7.2.sha256sum] = "a3ed00ed3fbf728b5816498ecd316d1716eecaced9c0c8d2c5a6740ca214985b"
SRC_URI[polling-2.8.0.sha256sum] = "4b2d323e8ca7996b3e23126511a523f7e62924d93ecd5ae73b333815b0eb3dce"
SRC_URI[portable-pty-0.8.1.sha256sum] = "806ee80c2a03dbe1a9fb9534f8d19e4c0546b790cde8fd1fea9d6390644cb0be"
SRC_URI[powerfmt-0.2.0.sha256sum] = "439ee305def115ba05938db6eb1644ff94165c5ab5e9420d1c1bcedbba909391"
SRC_URI[ppv-lite86-0.2.17.sha256sum] = "5b40af805b3121feab8a3c29f04d8ad262fa8e0561883e7653e024ae4479e6de"
SRC_URI[pretty-hex-0.2.1.sha256sum] = "bc5c99d529f0d30937f6f4b8a86d988047327bb88d04d2c4afc356de74722131"
SRC_URI[prettyplease-0.2.20.sha256sum] = "5f12335488a2f3b0a83b14edad48dca9879ce89b2edd10e80237e4e852dd645e"
SRC_URI[proc-macro-crate-0.1.5.sha256sum] = "1d6ea3c4595b96363c13943497db34af4460fb474a95c43f4446ad341b8c9785"
SRC_URI[proc-macro-crate-2.0.2.sha256sum] = "b00f26d3400549137f92511a46ac1cd8ce37cb5598a96d382381458b992a5d24"
SRC_URI[proc-macro-crate-1.3.1.sha256sum] = "7f4c021e1093a56626774e81216a4ce732a735e5bad4868a03f3ed65ca0c3919"
SRC_URI[proc-macro-error-1.0.4.sha256sum] = "da25490ff9892aab3fcf7c36f08cfb902dd3e71ca0f9f9517bea02a73a5ce38c"
SRC_URI[proc-macro-error-attr-1.0.4.sha256sum] = "a1be40180e52ecc98ad80b184934baf3d0d29f979574e439af5a55274b35f869"
SRC_URI[proc-macro2-0.4.30.sha256sum] = "cf3d2011ab5c909338f7887f4fc896d35932e29146c12c8d01da6b22a80ba759"
SRC_URI[proc-macro2-1.0.93.sha256sum] = "60946a68e5f9d28b0dc1c21bb8a97ee7d018a8b322fa57838ba31cc878e22d99"
SRC_URI[protobuf-3.7.2.sha256sum] = "d65a1d4ddae7d8b5de68153b48f6aa3bba8cb002b243dbdbc55a5afbc98f99f4"
SRC_URI[protobuf-codegen-3.7.2.sha256sum] = "5d3976825c0014bbd2f3b34f0001876604fe87e0c86cd8fa54251530f1544ace"
SRC_URI[protobuf-parse-3.7.2.sha256sum] = "b4aeaa1f2460f1d348eeaeed86aea999ce98c1bded6f089ff8514c9d9dbdc973"
SRC_URI[protobuf-support-3.7.2.sha256sum] = "3e36c2f31e0a47f9280fb347ef5e461ffcd2c52dd520d8e216b52f93b0b0d7d6"
SRC_URI[qoi-0.4.1.sha256sum] = "7f6d64c71eb498fe9eae14ce4ec935c555749aef511cca85b5568910d6e48001"
SRC_URI[qrcode-generator-4.1.9.sha256sum] = "1d06cb9646c7a14096231a2474d7f21e5e8c13de090c68d13bde6157cfe7f159"
SRC_URI[qrcodegen-1.8.0.sha256sum] = "4339fc7a1021c9c1621d87f5e3505f2805c8c105420ba2f2a4df86814590c142"
SRC_URI[quest-0.3.0.sha256sum] = "556af5f5c953a2ee13f45753e581a38f9778e6551bc3ccc56d90b14628fe59d8"
SRC_URI[quick-xml-0.31.0.sha256sum] = "1004a344b30a54e2ee58d66a71b32d2db2feb0a31f9a2d302bf0536f15de2a33"
SRC_URI[quick-xml-0.34.0.sha256sum] = "6f24d770aeca0eacb81ac29dfbc55ebcc09312fdd1f8bbecdc7e4a84e000e3b4"
SRC_URI[quick-xml-0.30.0.sha256sum] = "eff6510e86862b57b210fd8cbe8ed3f0d7d600b9c2863cd4549a2e033c66e956"
SRC_URI[quinn-0.11.8.sha256sum] = "626214629cda6781b6dc1d316ba307189c85ba657213ce642d9c77670f8202c8"
SRC_URI[quinn-proto-0.11.12.sha256sum] = "49df843a9161c85bb8aae55f101bc0bac8bcafd637a620d9122fd7e0b2f7422e"
SRC_URI[quinn-udp-0.5.12.sha256sum] = "ee4e529991f949c5e25755532370b8af5d114acae52326361d68d47af64aa842"
SRC_URI[quote-1.0.36.sha256sum] = "0fa76aaf39101c457836aec0ce2316dbdc3ab723cdda1c6bd4e6ad4208acaca7"
SRC_URI[quote-0.6.13.sha256sum] = "6ce23b6b870e8f94f81fb0a363d65d86675884b34a09043c81e5562f11c1f8e1"
SRC_URI[r-efi-5.2.0.sha256sum] = "74765f6d916ee2faa39bc8e68e4f3ed8949b48cccdac59983d287a7cb71ce9c5"
SRC_URI[radium-0.7.0.sha256sum] = "dc33ff2d4973d518d823d61aa239014831e521c75da58e3df4840d3f47749d09"
SRC_URI[rand-0.6.5.sha256sum] = "6d71dacdc3c88c1fde3885a3be3fbab9f35724e6ce99467f7d9c5026132184ca"
SRC_URI[rand-0.9.0.sha256sum] = "3779b94aeb87e8bd4e834cee3650289ee9e0d5677f976ecdb6d219e5f4f6cd94"
SRC_URI[rand-0.8.5.sha256sum] = "34af8d1a0e25924bc5b7c43c079c942339d8f0a8b57c39049bef581b46327404"
SRC_URI[rand_chacha-0.9.0.sha256sum] = "d3022b5f1df60f26e1ffddd6c66e8aa15de382ae63b3a0c1bfc0e4d3e3f325cb"
SRC_URI[rand_chacha-0.3.1.sha256sum] = "e6c10a63a0fa32252be49d21e7709d4d4baf8d231c2dbce1eaa8141b9b127d88"
SRC_URI[rand_chacha-0.1.1.sha256sum] = "556d3a1ca6600bfcbab7c7c91ccb085ac7fbbcd70e008a98742e7847f4f7bcef"
SRC_URI[rand_core-0.6.4.sha256sum] = "ec0be4795e2f6a28069bec0b5ff3e2ac9bafc99e6a9a7dc3547996c5c816922c"
SRC_URI[rand_core-0.3.1.sha256sum] = "7a6fdeb83b075e8266dcc8762c22776f6877a63111121f5f8c7411e5be7eed4b"
SRC_URI[rand_core-0.4.2.sha256sum] = "9c33a3c44ca05fa6f1807d8e6743f3824e8509beca625669633be0acbdf509dc"
SRC_URI[rand_core-0.9.3.sha256sum] = "99d9a13982dcf210057a8a78572b2217b667c3beacbf3a0d8b454f6f82837d38"
SRC_URI[rand_hc-0.1.0.sha256sum] = "7b40677c7be09ae76218dc623efbf7b18e34bced3f38883af07bb75630a21bc4"
SRC_URI[rand_isaac-0.1.1.sha256sum] = "ded997c9d5f13925be2a6fd7e66bf1872597f759fd9dd93513dd7e92e5a5ee08"
SRC_URI[rand_jitter-0.1.4.sha256sum] = "1166d5c91dc97b88d1decc3285bb0a99ed84b05cfd0bc2341bdf2d43fc41e39b"
SRC_URI[rand_os-0.1.3.sha256sum] = "7b75f676a1e053fc562eafbb47838d67c84801e38fc1ba459e8f180deabd5071"
SRC_URI[rand_pcg-0.1.2.sha256sum] = "abf9b09b01790cfe0364f52bf32995ea3c39f4d2dd011eac241d2914146d0b44"
SRC_URI[rand_xorshift-0.1.1.sha256sum] = "cbf7e9e623549b0e21f6e97cf8ecf247c1a8fd2e8a992ae265314300b2455d5c"
SRC_URI[raw-window-handle-0.5.2.sha256sum] = "f2ff9a1f06a88b01621b7ae906ef0211290d1c8a168a15542486a8f61c0833b9"
SRC_URI[raw-window-handle-0.6.2.sha256sum] = "20675572f6f24e9e76ef639bc5552774ed45f1c30e2951e1e99c59888861c539"
SRC_URI[rayon-1.10.0.sha256sum] = "b418a60154510ca1a002a752ca9714984e21e4241e804d32555251faf8b78ffa"
SRC_URI[rayon-core-1.12.1.sha256sum] = "1465873a3dfdaa8ae7cb14b4383657caab0b3e8a0aa9ae8e04b044854c8dfce2"
SRC_URI[rdev-0.5.0.sha256sum] = "20ba5e7c82cefaf3a4a925a1e1fa33b4945e3d3444b6890895015969e18fce30"
SRC_URI[rdrand-0.4.0.sha256sum] = "678054eb77286b51581ba43620cc911abf02758c91f93f479767aed0f90458b2"
SRC_URI[redox_syscall-0.4.1.sha256sum] = "4722d768eff46b75989dd134e5c353f0d6296e5aaa3132e776cbdb56be7731aa"
SRC_URI[redox_syscall-0.5.2.sha256sum] = "c82cf8cff14456045f55ec4241383baeff27af886adb72ffb2162f99911de0fd"
SRC_URI[redox_users-0.4.5.sha256sum] = "bd283d9651eeda4b2a83a43c1c91b266c40fd76ecd39a50a8c630ae69dc72891"
SRC_URI[regex-1.11.1.sha256sum] = "b544ef1b4eac5dc2db33ea63606ae9ffcfac26c1416a2806ae0bf5f56b201191"
SRC_URI[regex-automata-0.4.9.sha256sum] = "809e8dc61f6de73b46c85f4c96486310fe304c434cfa43669d7b40f711150908"
SRC_URI[regex-syntax-0.8.5.sha256sum] = "2b15c43186be67a4fd63bee50d0303afffcef381492ebe2c5d87f324e1b8815c"
SRC_URI[repng-0.2.2.sha256sum] = "0dd57cd2cb5cc699b3eb4824d654e5a32f3bc013766da4966f71fe94805abbda"
SRC_URI[reqwest-0.12.15.sha256sum] = "d19c46a6fdd48bc4dab94b6103fccc55d34c67cc0ad04653aad4ea2a07cd7bbb"
SRC_URI[rgb-0.8.50.sha256sum] = "57397d16646700483b67d2dd6511d79318f9d057fdbd21a4066aeac8b41d310a"
SRC_URI[ring-0.17.14.sha256sum] = "a4689e6c2294d81e88dc6261c768b63bc4fcdb852be6d1352498b114f61383b7"
SRC_URI[ringbuf-0.3.3.sha256sum] = "79abed428d1fd2a128201cec72c5f6938e2da607c6f3745f769fabea399d950a"
SRC_URI[roxmltree-0.20.0.sha256sum] = "6c20b6793b5c2fa6553b250154b78d6d0db37e72700ae35fad9387a46f487c97"
SRC_URI[rpassword-2.1.0.sha256sum] = "d37473170aedbe66ffa3ad3726939ba677d83c646ad4fd99e5b4bc38712f45ec"
SRC_URI[rpassword-7.3.1.sha256sum] = "80472be3c897911d0137b2d2b9055faf6eeac5b14e324073d83bc17b191d7e3f"
SRC_URI[rtoolbox-0.0.2.sha256sum] = "c247d24e63230cdb56463ae328478bd5eac8b8faa8c69461a77e8e323afac90e"
SRC_URI[runas-1.2.0.sha256sum] = "b96d6b6c505282b007a9b009f2aa38b2fd0359b81a0430ceacc60f69ade4c6a0"
SRC_URI[rust-ini-0.18.0.sha256sum] = "f6d5f2436026b4f6e79dc829837d467cc7e9a55ee40e750d716713540715a2df"
SRC_URI[rustc-demangle-0.1.24.sha256sum] = "719b953e2095829ee67db738b3bfa9fa368c94900df327b3f07fe6e794d2fe1f"
SRC_URI[rustc-hash-2.1.1.sha256sum] = "357703d41365b4b27c590e3ed91eabb1b663f07c4c084095e60cbed4362dff0d"
SRC_URI[rustc-hash-1.1.0.sha256sum] = "08d43f7aa6b08d49f382cde6a7982047c3426db949b1424bc4b7ec9ae12c6ce2"
SRC_URI[rustc_version-0.4.0.sha256sum] = "bfa0f585226d2e68097d4f95d113b15b83a82e819ab25717ec0590d9584ef366"
SRC_URI[rustix-0.38.34.sha256sum] = "70dc5ec042f7a43c4a73241207cecc9873a06d45debb38b329f8541d85c2730f"
SRC_URI[rustix-0.37.27.sha256sum] = "fea8ca367a3a01fe35e6943c400addf443c0f57670e6ec51196f71a4b8762dd2"
SRC_URI[rustls-0.23.26.sha256sum] = "df51b5869f3a441595eac5e8ff14d486ff285f7b8c0df8770e49c3b56351f0f0"
SRC_URI[rustls-native-certs-0.8.1.sha256sum] = "7fcff2dd52b58a8d98a70243663a0d234c4e2b79235637849d15913394a247d3"
SRC_URI[rustls-pemfile-2.2.0.sha256sum] = "dce314e5fee3f39953d46bb63bb8a46d40c2f8fb7cc5a3b6cab2bde9721d6e50"
SRC_URI[rustls-pki-types-1.11.0.sha256sum] = "917ce264624a4b4db1c364dcc35bfca9ded014d0a958cd47ad3e960e988ea51c"
SRC_URI[rustls-platform-verifier-0.5.1.sha256sum] = "4a5467026f437b4cb2a533865eaa73eb840019a0916f4b9ec563c6e617e086c9"
SRC_URI[rustls-platform-verifier-android-0.1.0.sha256sum] = "84e217e7fdc8466b5b35d30f8c0a30febd29173df4a3a0c2115d306b9c4117ad"
SRC_URI[rustls-webpki-0.103.1.sha256sum] = "fef8b8769aaccf73098557a87cd1816b4f9c7c16811c9c77142aa695c16f2c03"
SRC_URI[rustversion-1.0.17.sha256sum] = "955d28af4278de8121b7ebeb796b6a45735dc01436d898801014aced2773a3d6"
SRC_URI[ryu-1.0.18.sha256sum] = "f3cb5ba0dc43242ce17de99c180e96db90b235b8a9fdc9543c96d2209116bd9f"
SRC_URI[same-file-1.0.6.sha256sum] = "93fc1dc3aaa9bfed95e02e6eadabb4baf7e3078b0bd1b4d7b6b0b68378900502"
SRC_URI[schannel-0.1.23.sha256sum] = "fbc91545643bcf3a0bbb6569265615222618bdf33ce4ffbbd13c4bbd4c093534"
SRC_URI[sciter-rs-0.5.57.sha256sum] = "8c9d569d04261b789933daf3c9ed7cfdae0fe4992fe370a5803ec234b08a6651"
SRC_URI[scoped-tls-1.0.1.sha256sum] = "e1cf6437eb19a8f4a6cc0f7dca544973b0b78843adbfeb3683d1a94a0024a294"
SRC_URI[scopeguard-1.2.0.sha256sum] = "94143f37725109f92c262ed2cf5e59bce7498c01bcc1502d7b9afe439a4e9f49"
SRC_URI[scrap-0.5.0.sha256sum] = "04f3e5e5b3bd8d65b04de768fe0bdbd1e2da0831be9f117e1cc1d71785c9126c"
SRC_URI[sctk-adwaita-0.10.1.sha256sum] = "b6277f0217056f77f1d8f49f2950ac6c278c0d607c45f5ee99328d792ede24ec"
SRC_URI[security-framework-3.2.0.sha256sum] = "271720403f46ca04f7ba6f55d438f8bd878d6b8ca0a1046e8228c4145bcbb316"
SRC_URI[security-framework-2.10.0.sha256sum] = "770452e37cad93e0a50d5abc3990d2bc351c36d0328f86cefec2f2fb206eaef6"
SRC_URI[security-framework-sys-2.14.0.sha256sum] = "49db231d56a190491cb4aeda9527f1ad45345af50b0851622a7adb8c03b01c32"
SRC_URI[semver-1.0.23.sha256sum] = "61697e0a1c7e512e84a621326239844a24d8207b4669b41bc18b32ea5cbf988b"
SRC_URI[serde-1.0.203.sha256sum] = "7253ab4de971e72fb7be983802300c30b5a7f0c2e56fab8abfc6a214307c0094"
SRC_URI[serde-0.9.15.sha256sum] = "34b623917345a631dc9608d5194cc206b3fe6c3554cd1c75b937e55e285254af"
SRC_URI[serde_derive-1.0.203.sha256sum] = "500cbc0ebeb6f46627f50f3f5811ccf6bf00643be300b4c3eabc0ef55dc5b5ba"
SRC_URI[serde_json-0.9.10.sha256sum] = "ad8bcf487be7d2e15d3d543f04312de991d631cfe1b43ea0ade69e6a8a5b16a1"
SRC_URI[serde_json-1.0.118.sha256sum] = "d947f6b3163d8857ea16c4fa0dd4840d52f3041039a85decd46867eb1abef2e4"
SRC_URI[serde_repr-0.1.19.sha256sum] = "6c64451ba24fc7a6a2d60fc75dd9c83c90903b19028d4eff35e88fc1e86564e9"
SRC_URI[serde_spanned-0.6.6.sha256sum] = "79e674e01f999af37c49f70a6ede167a8a60b2503e56c5599532a65baa5969a0"
SRC_URI[serde_urlencoded-0.7.1.sha256sum] = "d3491c14715ca2294c4d6a88f15e84739788c1d030eed8c110436aafdaa2f3fd"
SRC_URI[serial-0.4.0.sha256sum] = "a1237a96570fc377c13baa1b88c7589ab66edced652e43ffb17088f003db3e86"
SRC_URI[serial-core-0.4.0.sha256sum] = "3f46209b345401737ae2125fe5b19a77acce90cd53e1658cda928e4fe9a64581"
SRC_URI[serial-unix-0.4.0.sha256sum] = "f03fbca4c9d866e24a459cbca71283f545a37f8e3e002ad8c70593871453cab7"
SRC_URI[serial-windows-0.4.0.sha256sum] = "15c6d3b776267a75d31bbdfd5d36c0ca051251caafc285827052bc53bcdc8162"
SRC_URI[sha1-0.10.6.sha256sum] = "e3bf829a2d51ab4a5ddf1352d8470c140cadc8301b2ae1789db023f01cedd6ba"
SRC_URI[sha2-0.10.8.sha256sum] = "793db75ad2bcafc3ffa7c68b215fee268f537982cd901d132f89c6343f3a3dc8"
SRC_URI[shadow-rs-0.21.0.sha256sum] = "427f07ab5f873000cf55324882e12a88c0a7ea7025df4fc1e7e35e688877a583"
SRC_URI[sharded-slab-0.1.7.sha256sum] = "f40ca3c46823713e0d4209592e8d6e826aa57e928f09752619fc696c499637f6"
SRC_URI[shared_library-0.1.9.sha256sum] = "5a9e7e0f2bfae24d8a5b5a66c5b257a83c7412304311512a0c054cd5e619da11"
SRC_URI[shared_memory-0.12.4.sha256sum] = "ba8593196da75d9dc4f69349682bd4c2099f8cde114257d1ef7ef1b33d1aba54"
SRC_URI[shell-words-1.1.0.sha256sum] = "24188a676b6ae68c3b2cb3a01be17fbf7240ce009799bb56d5b1409051e78fde"
SRC_URI[shlex-1.3.0.sha256sum] = "0fda2ff0d084019ba4d7c6f371c95d8fd75ce3524c3cb8fb653a3023f6323e64"
SRC_URI[shutdown_hooks-0.1.0.sha256sum] = "6057adedbec913419c92996f395ba69931acbd50b7d56955394cd3f7bedbfa45"
SRC_URI[signal-hook-registry-1.4.2.sha256sum] = "a9e9e0b4211b72e7b8b6e85c807d36c212bdb33ea8587f7569562a84df5465b1"
SRC_URI[signature-1.6.4.sha256sum] = "74233d3b3b2f6d4b006dc19dee745e73e2a6bfb6f93607cd3b02bd5b00797d7c"
SRC_URI[simd-adler32-0.3.7.sha256sum] = "d66dc143e6b11c1eddc06d5c423cfc97062865baf299914ab64caa38182078fe"
SRC_URI[siphasher-1.0.1.sha256sum] = "56199f7ddabf13fe5074ce809e7d3f42b42ae711800501b5b16ea82ad029c39d"
SRC_URI[siphasher-0.2.3.sha256sum] = "0b8de496cf83d4ed58b6be86c3a275b8602f6ffe98d3024a869e124147a9a3ac"
SRC_URI[slab-0.4.9.sha256sum] = "8f92a496fb766b417c996b9c5e57daf2f7ad3b0bebe1ccfca4856390e3d3bb67"
SRC_URI[slotmap-1.0.7.sha256sum] = "dbff4acf519f630b3a3ddcfaea6c06b42174d9a44bc70c620e9ed1649d58b82a"
SRC_URI[smallvec-1.15.1.sha256sum] = "67b1b7a3b5fe4f1376887184045fcf45c69e92af734b7aaddc05fb777b6fbd03"
SRC_URI[smithay-client-toolkit-0.19.2.sha256sum] = "3457dea1f0eb631b4034d61d4d8c32074caa6cd1ab2d59f2327bd8461e2c0016"
SRC_URI[smol_str-0.2.2.sha256sum] = "dd538fb6910ac1099850255cf94a94df6551fbdd602454387d0adb2d1ca6dead"
SRC_URI[socket2-0.3.19.sha256sum] = "122e570113d28d773067fab24266b66753f6ea915758651696b6e35e49f88d6e"
SRC_URI[socket2-0.4.10.sha256sum] = "9f7916fc008ca5542385b89a3d3ce689953c143e9304a9bf8beec1de48994c0d"
SRC_URI[socket2-0.5.10.sha256sum] = "e22376abed350d73dd1cd119b57ffccad95b4e585a7cda43e286245ce23c0678"
SRC_URI[sodiumoxide-0.2.7.sha256sum] = "e26be3acb6c2d9a7aac28482586a7856436af4cfe7100031d219de2d2ecb0028"
SRC_URI[softbuffer-0.4.5.sha256sum] = "d623bff5d06f60d738990980d782c8c866997d9194cfe79ecad00aa2f76826dd"
SRC_URI[spin-0.9.8.sha256sum] = "6980e8d7511241f8acf4aebddbb1ff938df5eebe98691418c4468d0b72a96a67"
SRC_URI[static_assertions-1.1.0.sha256sum] = "a2eb9349b6444b326872e140eb1cf5e7c522154d69e7a0ffb0fb81c06b37543f"
SRC_URI[strict-num-0.1.1.sha256sum] = "6637bab7722d379c8b41ba849228d680cc12d0a45ba1fa2b48f2a30577a06731"
SRC_URI[strsim-0.8.0.sha256sum] = "8ea5119cdb4c55b55d432abb513a0429384878c15dde60cc77b1c99de1a95a6a"
SRC_URI[strsim-0.10.0.sha256sum] = "73473c0e59e6d5812c5dfe2a064a6444949f089e20eec9a2e5506596494e4623"
SRC_URI[strsim-0.11.1.sha256sum] = "7da8b5736845d9f2fcb837ea5d9e2628564b3b043a70948a3f0b778838c5fb4f"
SRC_URI[strum-0.24.1.sha256sum] = "063e6045c0e62079840579a7e47a355ae92f60eb74daaf156fb1e84ba164e63f"
SRC_URI[strum-0.18.0.sha256sum] = "57bd81eb48f4c437cadc685403cad539345bf703d78e63707418431cecd4522b"
SRC_URI[strum_macros-0.24.3.sha256sum] = "1e385be0d24f186b4ce2f9982191e7101bb737312ad61c1f2f984f34bcf85d59"
SRC_URI[strum_macros-0.18.0.sha256sum] = "87c85aa3f8ea653bfd3ddf25f7ee357ee4d204731f6aa9ad04002306f6e2774c"
SRC_URI[stun_codec-0.3.5.sha256sum] = "feed9dafe0bda84f2b6ca3ce726b0a1f1ac2e8b63c6ecfb89b08b32313247b5b"
SRC_URI[stunclient-0.4.1.sha256sum] = "c969a14b4a4c09c320416ebf880b3d5a81ad1612065741eb10521951c06c8991"
SRC_URI[subtle-2.6.1.sha256sum] = "13c2bddecc57b384dee18652358fb23172facb8a2c51ccc10d74c157bdea3292"
SRC_URI[syn-1.0.109.sha256sum] = "72b64191b275b66ffe2469e8af2c1cfe3bafa67b529ead792a6d0160888b4237"
SRC_URI[syn-0.15.44.sha256sum] = "9ca4b3b69a77cbe1ffc9e198781b7acb0c7365a883670e8f1c1bc66fba79a5c5"
SRC_URI[syn-2.0.98.sha256sum] = "36147f1a48ae0ec2b5b3bc5b537d267457555a10dc06f3dbc8cb11ba3006d3b1"
SRC_URI[sync_wrapper-1.0.2.sha256sum] = "0bf256ce5efdfa370213c1dabab5935a12e49f2c58d15e9eac2870d3b4f27263"
SRC_URI[sys-locale-0.3.1.sha256sum] = "e801cf239ecd6ccd71f03d270d67dd53d13e90aab208bf4b8fe4ad957ea949b0"
SRC_URI[sysinfo-0.29.10.sha256sum] = "0a18d114d420ada3a891e6bc8e96a2023402203296a47cdd65083377dad18ba5"
SRC_URI[system-configuration-0.5.1.sha256sum] = "ba3a3adc5c275d719af8cb4272ea1c4a6d668a777f37e115f6d11ddbc1c8e0e7"
SRC_URI[system-configuration-sys-0.5.0.sha256sum] = "a75fb188eb626b924683e3b95e3a48e63551fcfb51949de2f06a9d91dbee93c9"
SRC_URI[system-deps-6.2.2.sha256sum] = "a3e535eb8dded36d55ec13eddacd30dec501792ff23a0b1682c38601b8cf2349"
SRC_URI[system-deps-1.3.2.sha256sum] = "0f3ecc17269a19353b3558b313bba738b25d82993e30d62a18406a24aba4649b"
SRC_URI[system_shutdown-4.0.1.sha256sum] = "7567f71160af5e9abfb4f5a21532cf2174cefe91ac5c336419295685a695cc66"
SRC_URI[tao-0.25.0.sha256sum] = "9fa7ba6ee5b8908ba3a62e6a4f3683490ed732fca614cdd3f4c989bba548f9a9"
SRC_URI[tao-macros-0.1.2.sha256sum] = "ec114582505d158b669b136e6851f85840c109819d77c42bb7c0709f727d18c2"
SRC_URI[tap-1.0.1.sha256sum] = "55937e1799185b12863d447f42597ed69d9928686b8d88a1df17376a097d8369"
SRC_URI[target-lexicon-0.12.14.sha256sum] = "e1fc403891a21bcfb7c37834ba66a547a8f402146eba7265b5a6d88059c9ff2f"
SRC_URI[target_build_utils-0.3.1.sha256sum] = "013d134ae4a25ee744ad6129db589018558f620ddfa44043887cdd45fa08e75c"
SRC_URI[tauri-winrt-notification-0.1.3.sha256sum] = "006851c9ccefa3c38a7646b8cec804bb429def3da10497bfa977179869c3e8e2"
SRC_URI[tempfile-3.10.1.sha256sum] = "85b77fafb263dd9d05cbeac119526425676db3784113aa9295c88498cbf8bff1"
SRC_URI[termcolor-1.4.1.sha256sum] = "06794f8f6c5c898b3275aebefa6b8a1cb24cd2c6c79397ab15774837a0bc5755"
SRC_URI[terminfo-0.8.0.sha256sum] = "666cd3a6681775d22b200409aad3b089c5b99fb11ecdd8a204d9d62f8148498f"
SRC_URI[termios-0.2.2.sha256sum] = "d5d9cf598a6d7ce700a4e6a9199da127e6819a61e64b68609683cc9a01b5683a"
SRC_URI[termios-0.3.3.sha256sum] = "411c5bf740737c7918b8b1fe232dca4dc9f8e754b8ad5e20966814001ed0ac6b"
SRC_URI[textwrap-0.11.0.sha256sum] = "d326610f408c7a4eb6f51c37c330e496b08506c9457c9d34287ecc38809fb060"
SRC_URI[tfc-0.7.0.sha256sum] = "0bc65f6827c547528843a59cac5774cf95ae1bd26a4c04eba2bb129f747621bf"
SRC_URI[thiserror-2.0.11.sha256sum] = "d452f284b73e6d76dd36758a0c8684b1d5be31f92b89d07fd5822175732206fc"
SRC_URI[thiserror-1.0.61.sha256sum] = "c546c80d6be4bc6a00c0f01730c08df82eaa7a7a61f11d656526506112cc1709"
SRC_URI[thiserror-impl-2.0.11.sha256sum] = "26afc1baea8a989337eeb52b6e72a039780ce45c3edfcc9c5b9d112feeb173c2"
SRC_URI[thiserror-impl-1.0.61.sha256sum] = "46c3384250002a6d5af4d114f2845d37b57521033f30d5c3f46c4d70e1197533"
SRC_URI[thread_local-1.1.8.sha256sum] = "8b9ef9bad013ada3808854ceac7b46812a6465ba368859a37e2100283d2d719c"
SRC_URI[tiff-0.9.1.sha256sum] = "ba1310fcea54c6a9a4fd1aad794ecc02c31682f6bfbecdf460bf19533eed1e3e"
SRC_URI[time-0.3.36.sha256sum] = "5dfd88e563464686c916c7e46e623e520ddc6d79fa6641390f2e3fa86e83e885"
SRC_URI[time-0.1.45.sha256sum] = "1b797afad3f312d1c66a56d11d0316f916356d11bd158fbc6ca6389ff6bf805a"
SRC_URI[time-core-0.1.2.sha256sum] = "ef927ca75afb808a4d64dd374f00a2adf8d0fcff8e7b184af886c3c87ec4a3f3"
SRC_URI[time-macros-0.2.18.sha256sum] = "3f252a68540fde3a3877aeea552b832b40ab9a69e318efd078774a01ddee1ccf"
SRC_URI[tiny-skia-0.11.4.sha256sum] = "83d13394d44dae3207b52a326c0c85a8bf87f1541f23b0d143811088497b09ab"
SRC_URI[tiny-skia-path-0.11.4.sha256sum] = "9c9e7fc0c2e86a30b117d0462aa261b72b7a99b7ebd7deb3a14ceda95c5bdc93"
SRC_URI[tiny-xlib-0.2.4.sha256sum] = "0324504befd01cab6e0c994f34b2ffa257849ee019d3fb3b64fb2c858887d89e"
SRC_URI[tinyvec-1.6.1.sha256sum] = "c55115c6fbe2d2bef26eb09ad74bde02d8255476fc0c7b515ef09fbb35742d82"
SRC_URI[tinyvec_macros-0.1.1.sha256sum] = "1f3ccbac311fea05f86f61904b462b55fb3df8837a366dfc601a0161d0532f20"
SRC_URI[tokio-1.44.2.sha256sum] = "e6b88822cbe49de4185e3a4cbf8321dd487cf5fe0c5c65695fef6346371e9c48"
SRC_URI[tokio-macros-2.5.0.sha256sum] = "6e06d43f1345a3bcd39f6a56dbb7dcab2ba47e68e8ac134855e7e2bdbaf8cab8"
SRC_URI[tokio-native-tls-0.3.1.sha256sum] = "bbae76ab933c85776efabc971569dd6119c580d8f5d448769dec1764bf796ef2"
SRC_URI[tokio-rustls-0.26.0.sha256sum] = "0c7bc40d0e5a97695bb96e27995cd3a08538541b0a846f65bba7a359f36700d4"
SRC_URI[tokio-socks-0.5.2.sha256sum] = "0d4770b8024672c1101b3f6733eab95b18007dbe0847a8afe341fcf79e06043f"
SRC_URI[tokio-tungstenite-0.26.2.sha256sum] = "7a9daff607c6d2bf6c16fd681ccb7eecc83e4e2cdc1ca067ffaadfca5de7f084"
SRC_URI[tokio-util-0.7.15.sha256sum] = "66a539a9ad6d5d281510d5bd368c973d636c02dbf8a67300bfb6b950696ad7df"
SRC_URI[toml-0.7.8.sha256sum] = "dd79e69d3b627db300ff956027cc6c3798cef26d22526befdfcd12feeb6d2257"
SRC_URI[toml-0.8.2.sha256sum] = "185d8ab0dfbb35cf1399a6344d8484209c088f75f8f68230da55d48d95d43e3d"
SRC_URI[toml-0.5.11.sha256sum] = "f4f7f0dd8d50a853a531c426359045b1998f04219d88799810762cd4ad314234"
SRC_URI[toml_datetime-0.6.3.sha256sum] = "7cda73e2f1397b1262d6dfdcef8aafae14d1de7748d66822d3bfeeb6d03e5e4b"
SRC_URI[toml_edit-0.19.15.sha256sum] = "1b5bb770da30e5cbfde35a2d7b9b8a2c4b8ef89548a7a6aeab5c9a576e3e7421"
SRC_URI[toml_edit-0.20.2.sha256sum] = "396e4d48bbb2b7554c944bde63101b5ae446cff6ec4a24227428f15eb72ef338"
SRC_URI[totp-rs-5.5.1.sha256sum] = "6c4ae9724c5888c0417d2396037ed3b60665925624766416e3e342b6ba5dbd3f"
SRC_URI[tower-0.5.2.sha256sum] = "d039ad9159c98b70ecfd540b2573b97f7f52c3e8d9f8ad57a24b916a536975f9"
SRC_URI[tower-layer-0.3.3.sha256sum] = "121c2a6cda46980bb0fcd1647ffaf6cd3fc79a013de288782836f6df9c48780e"
SRC_URI[tower-service-0.3.3.sha256sum] = "8df9b6e13f2d32c91b9bd719c00d1958837bc7dec474d94952798cc8e69eeec3"
SRC_URI[tracing-0.1.41.sha256sum] = "784e0ac535deb450455cbfa28a6f0df145ea1bb7ae51b821cf5e7927fdcfbdd0"
SRC_URI[tracing-attributes-0.1.29.sha256sum] = "1b1ffbcf9c6f6b99d386e7444eb608ba646ae452a36b39737deb9663b610f662"
SRC_URI[tracing-core-0.1.34.sha256sum] = "b9d12581f227e93f094d3af2ae690a574abb8a2b9b7a96e7cfe9647b2b617678"
SRC_URI[tracing-log-0.2.0.sha256sum] = "ee855f1f400bd0e5c02d150ae5de3840039a3f54b025156404e34c23c03f47c3"
SRC_URI[tracing-subscriber-0.3.19.sha256sum] = "e8189decb5ac0fa7bc8b96b7cb9b2701d60d48805aca84a238004d665fcc4008"
SRC_URI[trackable-0.2.24.sha256sum] = "b98abb9e7300b9ac902cc04920945a874c1973e08c310627cc4458c04b70dd32"
SRC_URI[trackable-1.3.0.sha256sum] = "b15bd114abb99ef8cee977e517c8f37aee63f184f2d08e3e6ceca092373369ae"
SRC_URI[trackable_derive-1.0.0.sha256sum] = "ebeb235c5847e2f82cfe0f07eb971d1e5f6804b18dac2ae16349cc604380f82f"
SRC_URI[tray-icon-0.14.3.sha256sum] = "3ad8319cca93189ea9ab1b290de0595960529750b6b8b501a399ed1ec3775d60"
SRC_URI[tree_magic_mini-3.1.5.sha256sum] = "469a727cac55b41448315cc10427c069c618ac59bb6a4480283fcd811749bdc2"
SRC_URI[try-lock-0.2.5.sha256sum] = "e421abadd41a4225275504ea4d6566923418b7f05506fbc9c0fe86ba7396114b"
SRC_URI[ttf-parser-0.25.1.sha256sum] = "d2df906b07856748fa3f6e0ad0cbaa047052d4a7dd609e231c4f72cee8c36f31"
SRC_URI[tungstenite-0.26.2.sha256sum] = "4793cb5e56680ecbb1d843515b23b6de9a75eb04b66643e256a396d43be33c13"
SRC_URI[typenum-1.17.0.sha256sum] = "42ff0bf0c66b8238c6f3b578df37d0b7848e55df8577b3f74f92a69acceeb825"
SRC_URI[tz-rs-0.6.14.sha256sum] = "33851b15c848fad2cf4b105c6bb66eb9512b6f6c44a4b13f57c53c73c707e2b4"
SRC_URI[tzdb-0.5.10.sha256sum] = "6a18ee5bde3433d683d41859650804a5ad89cad17f153a53f1e6a96e0da2d969"
SRC_URI[tzdb-0.6.1.sha256sum] = "1b580f6b365fa89f5767cdb619a55d534d04a4e14c2d7e5b9a31e94598687fb1"
SRC_URI[tzdb_data-0.1.2.sha256sum] = "d1889fdffac09d65c1d95c42d5202e9b21ad8c758f426e9fe09088817ea998d6"
SRC_URI[uds_windows-1.1.0.sha256sum] = "89daebc3e6fd160ac4aa9fc8b3bf71e1f74fbf92367ae71fb83a037e8bf164b9"
SRC_URI[uname-0.1.1.sha256sum] = "b72f89f0ca32e4db1c04e2a72f5345d59796d4866a1ee0609084569f73683dc8"
SRC_URI[unic-bidi-0.9.0.sha256sum] = "1356b759fb6a82050666f11dce4b6fe3571781f1449f3ef78074e408d468ec09"
SRC_URI[unic-char-property-0.9.0.sha256sum] = "a8c57a407d9b6fa02b4795eb81c5b6652060a15a7903ea981f3d723e6c0be221"
SRC_URI[unic-char-range-0.9.0.sha256sum] = "0398022d5f700414f6b899e10b8348231abf9173fa93144cbc1a43b9793c1fbc"
SRC_URI[unic-common-0.9.0.sha256sum] = "80d7ff825a6a654ee85a63e80f92f054f904f21e7d12da4e22f9834a4aaa35bc"
SRC_URI[unic-ucd-bidi-0.9.0.sha256sum] = "d1d568b51222484e1f8209ce48caa6b430bf352962b877d592c29ab31fb53d8c"
SRC_URI[unic-ucd-version-0.9.0.sha256sum] = "96bd2f2237fe450fcd0a1d2f5f4e91711124f7857ba2e964247776ebeeb7b0c4"
SRC_URI[unicode-bidi-0.3.15.sha256sum] = "08f95100a766bf4f8f28f90d77e0a5461bbdb219042e7679bebe79004fed8d75"
SRC_URI[unicode-ident-1.0.12.sha256sum] = "3354b9ac3fae1ff6755cb6db53683adb661634f67557942dea4facebec0fee4b"
SRC_URI[unicode-normalization-0.1.23.sha256sum] = "a56d1686db2308d901306f92a263857ef59ea39678a5458e7cb17f01415101f5"
SRC_URI[unicode-segmentation-1.11.0.sha256sum] = "d4c87d22b6e3f4a18d4d40ef354e97c90fcb14dd91d7dc0aa9d8a1172ebf7202"
SRC_URI[unicode-width-0.1.13.sha256sum] = "0336d538f7abc86d282a4189614dfaa90810dfc2c6f6427eaf88e16311dd225d"
SRC_URI[unicode-xid-0.1.0.sha256sum] = "fc72304796d0818e357ead4e000d19c9c174ab23dc11093ac919054d20a6a7fc"
SRC_URI[unicode-xid-0.2.4.sha256sum] = "f962df74c8c05a667b5ee8bcf162993134c104e96440b663c8daa176dc772d8c"
SRC_URI[untrusted-0.9.0.sha256sum] = "8ecb6da28b8a351d773b68d5825ac39017e680750f980f3a1a85cd8dd28a47c1"
SRC_URI[url-2.5.2.sha256sum] = "22784dbdf76fdde8af1aeda5622b546b422b6fc585325248a2bf9f5e41e94d6c"
SRC_URI[urlencoding-2.1.3.sha256sum] = "daf8dba3b7eb870caf1ddeed7bc9d2a049f3cfdfae7cb521b087cc33ae4c49da"
SRC_URI[users-0.11.0.sha256sum] = "24cc0f6d6f267b73e5a2cadf007ba8f9bc39c6a6f9666f8cf25ea809a153b032"
SRC_URI[users-0.10.0.sha256sum] = "aa4227e95324a443c9fcb06e03d4d85e91aabe9a5a02aa818688b6918b6af486"
SRC_URI[utf-8-0.7.6.sha256sum] = "09cc8ee72d2a9becf2f2febe0205bbed8fc6615b7cb429ad062dc7b7ddd036a9"
SRC_URI[utf8-width-0.1.7.sha256sum] = "86bd8d4e895da8537e5315b8254664e6b769c4ff3db18321b297a1e7004392e3"
SRC_URI[utf8parse-0.2.2.sha256sum] = "06abde3611657adf66d383f00b093d7faecc7fa57071cce2578660c9f1010821"
SRC_URI[utf16string-0.2.0.sha256sum] = "0b62a1e85e12d5d712bf47a85f426b73d303e2d00a90de5f3004df3596e9d216"
SRC_URI[uuid-1.16.0.sha256sum] = "458f7a779bf54acc9f347480ac654f68407d3aab21269a6e3c9f922acd9e2da9"
SRC_URI[v4l-0.14.0.sha256sum] = "d8fbfea44a46799d62c55323f3c55d06df722fbe577851d848d328a1041c3403"
SRC_URI[v4l2-sys-mit-0.3.0.sha256sum] = "6779878362b9bacadc7893eac76abe69612e8837ef746573c4a5239daf11990b"
SRC_URI[valuable-0.1.1.sha256sum] = "ba73ea9cf16a25df0c8caa16c51acb937d5712a8429db78a3ee29d5dcacd3a65"
SRC_URI[vcpkg-0.2.15.sha256sum] = "accd4ea62f7bb7a82fe23066fb0957d48ef677f6eeb8215f372f52e48bb32426"
SRC_URI[vec_map-0.8.2.sha256sum] = "f1bddf1187be692e79c5ffeab891132dfb0f236ed36a43c7ed39f1165ee20191"
SRC_URI[version-compare-0.0.10.sha256sum] = "d63556a25bae6ea31b52e640d7c41d1ab27faba4ccb600013837a3d0b3994ca1"
SRC_URI[version-compare-0.2.0.sha256sum] = "852e951cb7832cb45cb1169900d19760cfa39b82bc0ea9c0e5a14ae88411c98b"
SRC_URI[version_check-0.9.4.sha256sum] = "49874b5167b65d7193b8aba1567f5c7d93d001cafc34600cee003eda787e483f"
SRC_URI[waker-fn-1.2.0.sha256sum] = "317211a0dc0ceedd78fb2ca9a44aed3d7b9b26f81870d485c07122b4350673b7"
SRC_URI[walkdir-2.5.0.sha256sum] = "29790946404f91d9c5d06f9874efddea1dc06c5efe94541a7d6863108e3a5e4b"
SRC_URI[wallpaper-3.2.0.sha256sum] = "0547c84bf49b1096b20ce49736b86cd27f8225fc426665d3fba19e71e44c4d46"
SRC_URI[want-0.3.1.sha256sum] = "bfa7760aed19e106de2c7c0b581b509f2f25d3dacaf737cb82ac61bc6d760b0e"
SRC_URI[wasi-0.10.0+wasi-snapshot-preview1.sha256sum] = "1a143597ca7c7793eff794def352d41792a93c481eb1042423ff7ff72ba2c31f"
SRC_URI[wasi-0.11.0+wasi-snapshot-preview1.sha256sum] = "9c8d87e72b64a3b4db28d11ce29237c246188f4f51057d65a7eab63b7987e423"
SRC_URI[wasi-0.14.2+wasi-0.2.4.sha256sum] = "9683f9a5a998d873c0d21fcbe3c083009670149a8fab228644b8bd36b2c48cb3"
SRC_URI[wasite-0.1.0.sha256sum] = "b8dad83b4f25e74f184f64c43b150b91efe7647395b42289f38e50566d82855b"
SRC_URI[wasm-bindgen-0.2.100.sha256sum] = "1edc8929d7499fc4e8f0be2262a241556cfc54a0bea223790e71446f2aab1ef5"
SRC_URI[wasm-bindgen-backend-0.2.100.sha256sum] = "2f0a0651a5c2bc21487bde11ee802ccaf4c51935d0d3d42a6101f98161700bc6"
SRC_URI[wasm-bindgen-futures-0.4.50.sha256sum] = "555d470ec0bc3bb57890405e5d4322cc9ea83cebb085523ced7be4144dac1e61"
SRC_URI[wasm-bindgen-macro-0.2.100.sha256sum] = "7fe63fc6d09ed3792bd0897b314f53de8e16568c2b3f7982f468c0bf9bd0b407"
SRC_URI[wasm-bindgen-macro-support-0.2.100.sha256sum] = "8ae87ea40c9f689fc23f209965b6fb8a99ad69aeeb0231408be24920604395de"
SRC_URI[wasm-bindgen-shared-0.2.100.sha256sum] = "1a05d73b933a847d6cccdda8f838a22ff101ad9bf93e33684f39c1f5f0eece3d"
SRC_URI[wayland-backend-0.3.6.sha256sum] = "f90e11ce2ca99c97b940ee83edbae9da2d56a08f9ea8158550fd77fa31722993"
SRC_URI[wayland-client-0.31.5.sha256sum] = "7e321577a0a165911bdcfb39cf029302479d7527b517ee58ab0f6ad09edf0943"
SRC_URI[wayland-csd-frame-0.3.0.sha256sum] = "625c5029dbd43d25e6aa9615e88b829a5cad13b2819c4ae129fdbb7c31ab4c7e"
SRC_URI[wayland-cursor-0.31.5.sha256sum] = "6ef9489a8df197ebf3a8ce8a7a7f0a2320035c3743f3c1bd0bdbccf07ce64f95"
SRC_URI[wayland-protocols-0.32.3.sha256sum] = "62989625a776e827cc0f15d41444a3cea5205b963c3a25be48ae1b52d6b4daaa"
SRC_URI[wayland-protocols-plasma-0.3.3.sha256sum] = "f79f2d57c7fcc6ab4d602adba364bf59a5c24de57bd194486bf9b8360e06bfc4"
SRC_URI[wayland-protocols-wlr-0.3.3.sha256sum] = "fd993de54a40a40fbe5601d9f1fbcaef0aebcc5fda447d7dc8f6dcbaae4f8953"
SRC_URI[wayland-scanner-0.31.4.sha256sum] = "d7b56f89937f1cf2ee1f1259cf2936a17a1f45d8f0aa1019fae6d470d304cfa6"
SRC_URI[wayland-sys-0.31.4.sha256sum] = "43676fe2daf68754ecf1d72026e4e6c15483198b5d24e888b74d3f22f887a148"
SRC_URI[web-sys-0.3.77.sha256sum] = "33b6dd2ef9186f1f2072e409e99cd22a975331a6b3591b12c764e0e55c60d5d2"
SRC_URI[web-time-1.1.0.sha256sum] = "5a6580f308b1fad9207618087a65c04e7a10bc77e02c8e84e9b00dd4b12fa0bb"
SRC_URI[webm-1.1.0.sha256sum] = "ffd0c08586dfb375b19b2e3ee43a0288f0be445b257f64bb0ab08104334e3644"
SRC_URI[webm-sys-1.0.4.sha256sum] = "ba56d3ba3b04afbd15956875ea3e0c2c47de0a2242e6cb9522adbd07633451ec"
SRC_URI[webpki-root-certs-0.26.8.sha256sum] = "09aed61f5e8d2c18344b3faa33a4c837855fe56642757754775548fee21386c4"
SRC_URI[webpki-roots-0.26.9.sha256sum] = "29aad86cec885cafd03e8305fd727c418e970a521322c91688414d5b8efba16b"
SRC_URI[webpki-roots-1.0.0.sha256sum] = "2853738d1cc4f2da3a225c18ec6c3721abb31961096e9dbf5ab35fa88b19cfdb"
SRC_URI[weezl-0.1.8.sha256sum] = "53a85b86a771b1c87058196170769dd264f66c0782acf1ae6cc51bfd64b39082"
SRC_URI[which-4.4.2.sha256sum] = "87ba24419a2078cd2b0f2ede2691b6c66d8e47836da3b6db8265ebad47afbfc7"
SRC_URI[whoami-1.6.0.sha256sum] = "6994d13118ab492c3c80c1f81928718159254c53c472bf9ce36f8dae4add02a7"
SRC_URI[widestring-1.1.0.sha256sum] = "7219d36b6eac893fa81e84ebe06485e7dcbb616177469b142df14f1f4deb1311"
SRC_URI[win-sys-0.3.1.sha256sum] = "5b7b128a98c1cfa201b09eb49ba285887deb3cbe7466a98850eb1adabb452be5"
SRC_URI[winapi-0.3.9.sha256sum] = "5c839a674fcd7a98952e593242ea400abe93992746761e38641405d28b00f419"
SRC_URI[winapi-0.2.8.sha256sum] = "167dc9d6949a9b857f3451275e911c3f44255842c1f7a76f33c55103a909087a"
SRC_URI[winapi-build-0.1.1.sha256sum] = "2d315eee3b34aca4797b2da6b13ed88266e6d612562a0c46390af8299fc699bc"
SRC_URI[winapi-i686-pc-windows-gnu-0.4.0.sha256sum] = "ac3b87c63620426dd9b991e5ce0329eff545bccbbb34f3be09ff6fb6ab51b7b6"
SRC_URI[winapi-util-0.1.8.sha256sum] = "4d4cc384e1e73b93bafa6fb4f1df8c41695c8a91cf9c4c64358067d15a7b6c6b"
SRC_URI[winapi-x86_64-pc-windows-gnu-0.4.0.sha256sum] = "712e227841d057c1ee1cd2fb22fa7e5a5461ae8e48fa2ca79ec42cfc1931183f"
SRC_URI[windows-0.61.1.sha256sum] = "c5ee8f3d025738cb02bad7868bbb5f8a6327501e870bf51f1b455b0a2454a419"
SRC_URI[windows-0.34.0.sha256sum] = "45296b64204227616fdbf2614cefa4c236b98ee64dfaaaa435207ed99fe7829f"
SRC_URI[windows-0.48.0.sha256sum] = "e686886bc078bc1b0b600cac0147aadb815089b6e4da64016cbd754b6342700f"
SRC_URI[windows-0.43.0.sha256sum] = "04662ed0e3e5630dfa9b26e4cb823b817f1a9addda855d973a9458c236556244"
SRC_URI[windows-0.44.0.sha256sum] = "9e745dab35a0c4c77aa3ce42d595e13d2003d6902d6b08c9ef5fc326d08da12b"
SRC_URI[windows-0.32.0.sha256sum] = "fbedf6db9096bc2364adce0ae0aa636dcd89f3c3f2cd67947062aaf0ca2a10ec"
SRC_URI[windows-0.52.0.sha256sum] = "e48a53791691ab099e5e2ad123536d0fff50652600abaf43bbf952894110d0be"
SRC_URI[windows-0.51.1.sha256sum] = "ca229916c5ee38c2f2bc1e9d8f04df975b4bd93f9955dc69fabb5d91270045c9"
SRC_URI[windows-0.54.0.sha256sum] = "9252e5725dbed82865af151df558e754e4a3c2c30818359eb17465f1346a1b49"
SRC_URI[windows-collections-0.2.0.sha256sum] = "3beeceb5e5cfd9eb1d76b381630e82c4241ccd0d27f1a39ed41b2760b255c5e8"
SRC_URI[windows-core-0.52.0.sha256sum] = "33ab640c8d7e35bf8ba19b884ba838ceb4fba93a4e8c65a9059d08afcfc683d9"
SRC_URI[windows-core-0.51.1.sha256sum] = "f1f8cf84f35d2db49a46868f947758c7a1138116f7fac3bc844f43ade1292e64"
SRC_URI[windows-core-0.54.0.sha256sum] = "12661b9c89351d684a50a8a643ce5f608e20243b9fb84687800163429f161d65"
SRC_URI[windows-core-0.61.0.sha256sum] = "4763c1de310c86d75a878046489e2e5ba02c649d185f21c67d4cf8a56d098980"
SRC_URI[windows-future-0.2.0.sha256sum] = "7a1d6bbefcb7b60acd19828e1bc965da6fcf18a7e39490c5f8be71e54a19ba32"
SRC_URI[windows-implement-0.60.0.sha256sum] = "a47fddd13af08290e67f4acabf4b459f647552718f683a7b415d290ac744a836"
SRC_URI[windows-implement-0.52.0.sha256sum] = "12168c33176773b86799be25e2a2ba07c7aab9968b37541f1094dbd7a60c8946"
SRC_URI[windows-interface-0.59.1.sha256sum] = "bd9211b69f8dcdfa817bfd14bf1c97c9188afa36f4750130fcdf3f400eca9fa8"
SRC_URI[windows-interface-0.52.0.sha256sum] = "9d8dc32e0095a7eeccebd0e3f09e9509365ecb3fc6ac4d6f5f14a3f6392942d1"
SRC_URI[windows-link-0.1.1.sha256sum] = "76840935b766e1b0a05c0066835fb9ec80071d4c09a16f6bd5f7e655e3c14c38"
SRC_URI[windows-numerics-0.2.0.sha256sum] = "9150af68066c4c5c07ddc0ce30421554771e528bde427614c61038bc2c92c2b1"
SRC_URI[windows-registry-0.4.0.sha256sum] = "4286ad90ddb45071efd1a66dfa43eb02dd0dfbae1545ad6cc3c51cf34d7e8ba3"
SRC_URI[windows-result-0.1.2.sha256sum] = "5e383302e8ec8515204254685643de10811af0ed97ea37210dc26fb0032647f8"
SRC_URI[windows-result-0.3.2.sha256sum] = "c64fd11a4fd95df68efcfee5f44a294fe71b8bc6a91993e2791938abcc712252"
SRC_URI[windows-service-0.6.0.sha256sum] = "cd9db37ecb5b13762d95468a2fc6009d4b2c62801243223aabd44fca13ad13c8"
SRC_URI[windows-strings-0.3.1.sha256sum] = "87fa48cc5d406560701792be122a10132491cff9d0aeb23583cc2dcafc847319"
SRC_URI[windows-strings-0.4.0.sha256sum] = "7a2ba9642430ee452d5a7aa78d72907ebe8cfda358e8cb7918a2050581322f97"
SRC_URI[windows-sys-0.45.0.sha256sum] = "75283be5efb2831d37ea142365f009c02ec203cd29a3ebecbc093d52315b66d0"
SRC_URI[windows-sys-0.52.0.sha256sum] = "282be5f36a8ce781fad8c8ae18fa3f9beff57ec1b52cb3de0789201425d9a33d"
SRC_URI[windows-sys-0.48.0.sha256sum] = "677d2418bec65e3338edb076e806bc1ec15693c5d0104683f2efe857f61056a9"
SRC_URI[windows-targets-0.48.5.sha256sum] = "9a2fa6e2155d7247be68c096456083145c183cbbbc2764150dda45a87197940c"
SRC_URI[windows-targets-0.52.5.sha256sum] = "6f0713a46559409d202e70e28227288446bf7841d3211583a4b53e3f6d96e7eb"
SRC_URI[windows-targets-0.53.0.sha256sum] = "b1e4c7e8ceaaf9cb7d7507c974735728ab453b67ef8f18febdd7c11fe59dca8b"
SRC_URI[windows-targets-0.42.2.sha256sum] = "8e5180c00cd44c9b1c88adb3693291f1cd93605ded80c250a75d472756b4d071"
SRC_URI[windows-version-0.1.1.sha256sum] = "6998aa457c9ba8ff2fb9f13e9d2a930dabcea28f1d0ab94d687d8b3654844515"
SRC_URI[windows-win-3.0.0.sha256sum] = "58e23e33622b3b52f948049acbec9bcc34bf6e26d74176b88941f213c75cf2dc"
SRC_URI[windows_aarch64_gnullvm-0.53.0.sha256sum] = "86b8d5f90ddd19cb4a147a5fa63ca848db3df085e25fee3cc10b39b6eebae764"
SRC_URI[windows_aarch64_gnullvm-0.52.5.sha256sum] = "7088eed71e8b8dda258ecc8bac5fb1153c5cffaf2578fc8ff5d61e23578d3263"
SRC_URI[windows_aarch64_gnullvm-0.42.2.sha256sum] = "597a5118570b68bc08d8d59125332c54f1ba9d9adeedeef5b99b02ba2b0698f8"
SRC_URI[windows_aarch64_gnullvm-0.48.5.sha256sum] = "2b38e32f0abccf9987a4e3079dfb67dcd799fb61361e53e2882c3cbaf0d905d8"
SRC_URI[windows_aarch64_msvc-0.52.5.sha256sum] = "9985fd1504e250c615ca5f281c3f7a6da76213ebd5ccc9561496568a2752afb6"
SRC_URI[windows_aarch64_msvc-0.53.0.sha256sum] = "c7651a1f62a11b8cbd5e0d42526e55f2c99886c77e007179efff86c2b137e66c"
SRC_URI[windows_aarch64_msvc-0.42.2.sha256sum] = "e08e8864a60f06ef0d0ff4ba04124db8b0fb3be5776a5cd47641e942e58c4d43"
SRC_URI[windows_aarch64_msvc-0.48.5.sha256sum] = "dc35310971f3b2dbbf3f0690a219f40e2d9afcf64f9ab7cc1be722937c26b4bc"
SRC_URI[windows_aarch64_msvc-0.34.0.sha256sum] = "17cffbe740121affb56fad0fc0e421804adf0ae00891205213b5cecd30db881d"
SRC_URI[windows_aarch64_msvc-0.32.0.sha256sum] = "d8e92753b1c443191654ec532f14c199742964a061be25d77d7a96f09db20bf5"
SRC_URI[windows_i686_gnu-0.48.5.sha256sum] = "a75915e7def60c94dcef72200b9a8e58e5091744960da64ec734a6c6e9b3743e"
SRC_URI[windows_i686_gnu-0.34.0.sha256sum] = "2564fde759adb79129d9b4f54be42b32c89970c18ebf93124ca8870a498688ed"
SRC_URI[windows_i686_gnu-0.32.0.sha256sum] = "6a711c68811799e017b6038e0922cb27a5e2f43a2ddb609fe0b6f3eeda9de615"
SRC_URI[windows_i686_gnu-0.52.5.sha256sum] = "88ba073cf16d5372720ec942a8ccbf61626074c6d4dd2e745299726ce8b89670"
SRC_URI[windows_i686_gnu-0.42.2.sha256sum] = "c61d927d8da41da96a81f029489353e68739737d3beca43145c8afec9a31a84f"
SRC_URI[windows_i686_gnu-0.53.0.sha256sum] = "c1dc67659d35f387f5f6c479dc4e28f1d4bb90ddd1a5d3da2e5d97b42d6272c3"
SRC_URI[windows_i686_gnullvm-0.53.0.sha256sum] = "9ce6ccbdedbf6d6354471319e781c0dfef054c81fbc7cf83f338a4296c0cae11"
SRC_URI[windows_i686_gnullvm-0.52.5.sha256sum] = "87f4261229030a858f36b459e748ae97545d6f1ec60e5e0d6a3d32e0dc232ee9"
SRC_URI[windows_i686_msvc-0.42.2.sha256sum] = "44d840b6ec649f480a41c8d80f9c65108b92d89345dd94027bfe06ac444d1060"
SRC_URI[windows_i686_msvc-0.48.5.sha256sum] = "8f55c233f70c4b27f66c523580f78f1004e8b5a8b659e05a4eb49d4166cca406"
SRC_URI[windows_i686_msvc-0.34.0.sha256sum] = "9cd9d32ba70453522332c14d38814bceeb747d80b3958676007acadd7e166956"
SRC_URI[windows_i686_msvc-0.32.0.sha256sum] = "146c11bb1a02615db74680b32a68e2d61f553cc24c4eb5b4ca10311740e44172"
SRC_URI[windows_i686_msvc-0.52.5.sha256sum] = "db3c2bf3d13d5b658be73463284eaf12830ac9a26a90c717b7f771dfe97487bf"
SRC_URI[windows_i686_msvc-0.53.0.sha256sum] = "581fee95406bb13382d2f65cd4a908ca7b1e4c2f1917f143ba16efe98a589b5d"
SRC_URI[windows_x86_64_gnu-0.53.0.sha256sum] = "2e55b5ac9ea33f2fc1716d1742db15574fd6fc8dadc51caab1c16a3d3b4190ba"
SRC_URI[windows_x86_64_gnu-0.32.0.sha256sum] = "c912b12f7454c6620635bbff3450962753834be2a594819bd5e945af18ec64bc"
SRC_URI[windows_x86_64_gnu-0.52.5.sha256sum] = "4e4246f76bdeff09eb48875a0fd3e2af6aada79d409d33011886d3e1581517d9"
SRC_URI[windows_x86_64_gnu-0.42.2.sha256sum] = "8de912b8b8feb55c064867cf047dda097f92d51efad5b491dfb98f6bbb70cb36"
SRC_URI[windows_x86_64_gnu-0.48.5.sha256sum] = "53d40abd2583d23e4718fddf1ebec84dbff8381c07cae67ff7768bbf19c6718e"
SRC_URI[windows_x86_64_gnu-0.34.0.sha256sum] = "cfce6deae227ee8d356d19effc141a509cc503dfd1f850622ec4b0f84428e1f4"
SRC_URI[windows_x86_64_gnullvm-0.52.5.sha256sum] = "852298e482cd67c356ddd9570386e2862b5673c85bd5f88df9ab6802b334c596"
SRC_URI[windows_x86_64_gnullvm-0.53.0.sha256sum] = "0a6e035dd0599267ce1ee132e51c27dd29437f63325753051e71dd9e42406c57"
SRC_URI[windows_x86_64_gnullvm-0.42.2.sha256sum] = "26d41b46a36d453748aedef1486d5c7a85db22e56aff34643984ea85514e94a3"
SRC_URI[windows_x86_64_gnullvm-0.48.5.sha256sum] = "0b7b52767868a23d5bab768e390dc5f5c55825b6d30b86c844ff2dc7414044cc"
SRC_URI[windows_x86_64_msvc-0.53.0.sha256sum] = "271414315aff87387382ec3d271b52d7ae78726f5d44ac98b4f4030c91880486"
SRC_URI[windows_x86_64_msvc-0.48.5.sha256sum] = "ed94fce61571a4006852b7389a063ab983c02eb1bb37b47f8272ce92d06d9538"
SRC_URI[windows_x86_64_msvc-0.34.0.sha256sum] = "d19538ccc21819d01deaf88d6a17eae6596a12e9aafdbb97916fb49896d89de9"
SRC_URI[windows_x86_64_msvc-0.32.0.sha256sum] = "504a2476202769977a040c6364301a3f65d0cc9e3fb08600b2bda150a0488316"
SRC_URI[windows_x86_64_msvc-0.52.5.sha256sum] = "bec47e5bfd1bff0eeaf6d8b485cc1074891a197ab4225d504cb7a1ab88b02bf0"
SRC_URI[windows_x86_64_msvc-0.42.2.sha256sum] = "9aec5da331524158c6d1a4ac0ab1541149c0b9505fde06423b02f5ef0106b9f0"
SRC_URI[winit-0.30.9.sha256sum] = "a809eacf18c8eca8b6635091543f02a5a06ddf3dad846398795460e6e0ae3cc0"
SRC_URI[winnow-0.5.40.sha256sum] = "f593a95398737aeed53e489c785df13f3618e41dbcd6718c6addbf1395aa6876"
SRC_URI[winreg-0.10.1.sha256sum] = "80d0f4e272c85def139476380b12f9ac60926689dd2e01d4923222f40580869d"
SRC_URI[winreg-0.11.0.sha256sum] = "76a1a57ff50e9b408431e8f97d5456f2807f8eb2a2cd79b06068fc87f8ecf189"
SRC_URI[winres-0.1.12.sha256sum] = "b68db261ef59e9e52806f688020631e987592bd83619edccda9c47d42cde4f6c"
SRC_URI[wit-bindgen-rt-0.39.0.sha256sum] = "6f42320e61fe2cfd34354ecb597f86f413484a798ba44a8ca1165c58d42da6c1"
SRC_URI[wl-clipboard-rs-0.9.0.sha256sum] = "4de22eebb1d1e2bad2d970086e96da0e12cde0b411321e5b0f7b2a1f876aa26f"
SRC_URI[wol-rs-1.0.1.sha256sum] = "3c5a8a033ef9b208ec8b5946761958ed2b2693ac49b04f647fdc013000870b8f"
SRC_URI[wyz-0.5.1.sha256sum] = "05f360fc0b24296329c78fda852a1e9ae82de9cf7b27dae4b7f62f118f77b9ed"
SRC_URI[x11-2.19.0.sha256sum] = "8099e1f0f4797830958b078e98e771fc9ca5591ea50e233744fec930d91fffac"
SRC_URI[x11-2.21.0.sha256sum] = "502da5464ccd04011667b11c435cb992822c2c0dbde1770c988480d312a0db2e"
SRC_URI[x11-clipboard-0.9.2.sha256sum] = "b98785a09322d7446e28a13203d2cae1059a0dd3dfb32cb06d0a225f023d8286"
SRC_URI[x11-dl-2.21.0.sha256sum] = "38735924fedd5314a6e548792904ed8c6de6636285cb9fec04d5b1db85c1516f"
SRC_URI[x11rb-0.12.0.sha256sum] = "b1641b26d4dec61337c35a1b1aaf9e3cba8f46f0b43636c609ab0291a648040a"
SRC_URI[x11rb-0.13.1.sha256sum] = "5d91ffca73ee7f68ce055750bf9f6eca0780b8c85eff9bc046a3b0da41755e12"
SRC_URI[x11rb-protocol-0.12.0.sha256sum] = "82d6c3f9a0fb6701fab8f6cea9b0c0bd5d6876f1f89f7fada07e558077c344bc"
SRC_URI[x11rb-protocol-0.13.1.sha256sum] = "ec107c4503ea0b4a98ef47356329af139c0a4f7750e621cf2973cd3385ebcb3d"
SRC_URI[xattr-1.4.0.sha256sum] = "e105d177a3871454f754b33bb0ee637ecaaac997446375fd3e5d43a2ed00c909"
SRC_URI[xcursor-0.3.10.sha256sum] = "bec9e4a500ca8864c5b47b8b482a73d62e4237670e5b5f1d6b9e3cae50f28f2b"
SRC_URI[xdg-home-1.2.0.sha256sum] = "ca91dcf8f93db085f3a0a29358cd0b9d670915468f4290e8b85d118a34211ab8"
SRC_URI[xkbcommon-dl-0.4.2.sha256sum] = "d039de8032a9a8856a6be89cea3e5d12fdd82306ab7c94d74e6deab2460651c5"
SRC_URI[xkeysym-0.2.1.sha256sum] = "b9cc00251562a284751c9973bace760d86c0276c471b4be569fe6b068ee97a56"
SRC_URI[zbus-3.15.2.sha256sum] = "675d170b632a6ad49804c8cf2105d7c31eddd3312555cffd4b740e08e97c25e6"
SRC_URI[zbus_macros-3.15.2.sha256sum] = "7131497b0f887e8061b430c530240063d33bf9455fa34438f388a245da69e0a5"
SRC_URI[zbus_names-2.6.1.sha256sum] = "437d738d3750bed6ca9b8d423ccc7a8eb284f6b1d6d4e225a0e4e6258d864c8d"
SRC_URI[zerocopy-0.7.34.sha256sum] = "ae87e3fcd617500e5d106f0380cf7b77f3c6092aae37191433159dda23cfb087"
SRC_URI[zerocopy-0.8.26.sha256sum] = "1039dd0d3c310cf05de012d8a39ff557cb0d23087fd44cad61df08fc31907a2f"
SRC_URI[zerocopy-derive-0.7.34.sha256sum] = "15e934569e47891f7d9411f1a451d947a60e000ab3bd24fbb970f000387d1b3b"
SRC_URI[zerocopy-derive-0.8.26.sha256sum] = "9ecf5b4cc5364572d7f4c329661bcc82724222973f2cab6f050a4e5c22f75181"
SRC_URI[zeroize-1.8.1.sha256sum] = "ced3678a2879b30306d323f4542626697a464a97c0a07c9aebf7ebca65cd4dde"
SRC_URI[zip-0.6.6.sha256sum] = "760394e246e4c28189f19d488c058bf16f564016aefac5d32bb1f3b51d5e9261"
SRC_URI[zstd-0.13.1.sha256sum] = "2d789b1514203a1120ad2429eae43a7bd32b90976a7bb8a05f7ec02fa88cc23a"
SRC_URI[zstd-0.11.2+zstd.1.5.2.sha256sum] = "20cc960326ece64f010d2d2107537f26dc589a6573a316bd5b1dba685fa5fde4"
SRC_URI[zstd-safe-5.0.2+zstd.1.5.2.sha256sum] = "1d2a5585e04f9eea4b2a3d1eca508c4dee9592a89ef6f450c11719da0726f4db"
SRC_URI[zstd-safe-7.1.0.sha256sum] = "1cd99b45c6bc03a018c8b8a86025678c87e55526064e38f9df301989dce7ec0a"
SRC_URI[zstd-sys-2.0.11+zstd.1.5.6.sha256sum] = "75652c55c0b6f3e6f12eb786fe1bc960396bf05a1eb3bf1f3691c3610ac2e6d4"
SRC_URI[zune-inflate-0.2.54.sha256sum] = "73ab332fe2f6680068f3582b16a24f90ad7096d5d39b974d1c0aff0125116f02"
SRC_URI[zvariant-3.15.2.sha256sum] = "4eef2be88ba09b358d3b58aca6e41cd853631d44787f319a1383ca83424fb2db"
SRC_URI[zvariant_derive-3.15.2.sha256sum] = "37c24dc0bed72f5f90d1f8bb5b07228cbf63b3c6e9f82d82559d4bae666e7ed9"
SRC_URI[zvariant_utils-1.0.1.sha256sum] = "7234f0d811589db492d16893e3f21e8e2fd282e6d01b0cddee310322062cc200"

S = "${WORKDIR}/git"

inherit cargo

CARGO_BUILD_FLAGS = "-v --target ${RUST_HOST_SYS} ${BUILD_MODE} --manifest-path=${CARGO_MANIFEST_PATH}"

# tell cargo class where vendor dir will be
CARGO_VENDOR_DIR = "${WORKDIR}/vendor"

# Add any additional dependencies if required
# libglib-2.0-0
# libgtk-3-0
# glib
RDEPENDS:${PN} = "  xwayland libvpx aom yuv libopus alsa-lib gtk+3 libx11 openssl pulseaudio zlib "

# libvpx-staticdev
# aom-staticdev
# yuv-staticdev
# libopus-staticdev
DEPENDS += " alsa-lib gtk+3 libx11 openssl pulseaudio zlib bindgen-cli-native clang-native pkgconfig-native yasm zip "

# Specify the target architecture
#TARGET_ARCH = "arm64"

do_compile[network] = "1"
do_compile[env] = "VCPKG=${S}/vcpkg"

FILES:${PN} += " \
    ${libdir}/libsciter-gtk.so \
"

INSANE_SKIP:${PN} += "already-stripped"

# Specify the package name
PACKAGES = "${PN}"

# Ensure the package is built for i.MX8MM
COMPATIBLE_MACHINE = "arm64|(imx-nxp-bsp)"
