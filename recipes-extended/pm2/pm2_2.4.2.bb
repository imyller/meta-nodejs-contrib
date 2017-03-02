DESCRIPTION = "Production process manager for Node.js apps with a built-in load balancer"

LICENSE = "AGPL-3.0"
LIC_FILES_CHKSUM = "file://GNU-AGPL-3.0.txt;md5=9f9fa01c099265d62f73735e404ff8bb"

SRC_URI = "https://github.com/Unitech/pm2/archive/${PV}.tar.gz;name=src"

SRC_URI[src.md5sum] = "8007cd5dbcc7eb7aacd6c14c7a581a3c"
SRC_URI[src.sha256sum] = "5709e43741110c94422d14e116054853133885f4c8bad3423ef8a669fea8b0e5"

RDEPENDS_${PN} = "nodejs"

do_compile[noexec] = "1"

do_install_append() {
	
	rm -f ${D}/usr/lib/node_modules/pm2/lib/templates/init-scripts/openrc.tpl || true

}

INSANE_SKIP_${PN} += "file-rdeps"

inherit allarch npm-install-global
