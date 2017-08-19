DESCRIPTION = "Production process manager for Node.js apps with a built-in load balancer"

LICENSE = "AGPL-3.0"
LIC_FILES_CHKSUM = "file://GNU-AGPL-3.0.txt;md5=9f9fa01c099265d62f73735e404ff8bb"

SRC_URI = "https://github.com/Unitech/pm2/archive/${PV}.tar.gz;name=src"

SRC_URI[src.md5sum] = "29c75c5a3fee85500d502901023530bb"
SRC_URI[src.sha256sum] = "f3da0e8ca3e609b455ffda61bf08b66dc2c5a65d082217abd62ca46148988824"

RDEPENDS_${PN} = "nodejs"

do_compile[noexec] = "1"

do_install_append() {

	rm -f ${D}/usr/lib/node_modules/pm2/lib/templates/init-scripts/openrc.tpl || true

}

INSANE_SKIP_${PN} += "file-rdeps"

inherit allarch npm-install-global
