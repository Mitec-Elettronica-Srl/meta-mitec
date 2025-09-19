# workaround for a yocto bug about .a being includede twice
EXTRA_OECONF += " --disable-static "
