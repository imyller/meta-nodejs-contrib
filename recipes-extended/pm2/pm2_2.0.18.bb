DESCRIPTION = "Production process manager for Node.js apps with a built-in load balancer"

LICENSE = "AGPL-3.0"
LIC_FILES_CHKSUM = "file://GNU-AGPL-3.0.txt;md5=9f9fa01c099265d62f73735e404ff8bb"

PR = "r1"

SRC_URI = "https://github.com/Unitech/pm2/archive/v${PV}.tar.gz;name=src"

SRC_URI[src.md5sum] = "54aad69327d9e4599fe219848f553380"
SRC_URI[src.sha256sum] = "e2a9f28995fe33f568fb53becb55bde985431f188e452f5bfefa02ed88a1a4e8"

RDEPENDS_${PN} = "nodejs"

do_compile[noexec] = "1"

inherit allarch npm-install-global
