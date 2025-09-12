CONFIGUREOPTS = " \
    --target=${VPXTARGET} \
    --enable-vp8 \
    --enable-vp9 \
    --enable-vp9-highbitdepth \
    --enable-libs \
    --disable-install-docs \
    --enable-static \
    --enable-shared \
    --prefix=${prefix} \
    --libdir=${libdir} \
    --size-limit=16384x16384 \
"