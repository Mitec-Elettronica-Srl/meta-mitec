do_install () {
	install -d ${D}${sysconfdir}
	install -m 0644 ${S}/etc/rpc ${D}${sysconfdir}/rpc
	install -m 0644 ${S}/etc/protocols ${D}${sysconfdir}/protocols
	install -m 0644 ${S}/etc/services ${D}${sysconfdir}/services
	# install -m 0644 ${S}/etc/ethertypes ${D}${sysconfdir}/ethertypes
	# ethertypes is provided by iptables in meta-virtualization layer
}
