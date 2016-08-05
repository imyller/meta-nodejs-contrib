DESCRIPTION = "Production process manager for Node.js apps with a built-in load balancer"

LICENSE = "AGPL-3.0"
LIC_FILES_CHKSUM = "file://GNU-AGPL-3.0.txt;md5=9f9fa01c099265d62f73735e404ff8bb"

PR = "r1"

SRC_URI = "https://github.com/Unitech/pm2/archive/${PV}.tar.gz;name=src"

SRC_URI[src.md5sum] = "53e72064ad003875471c2eddc5e4110a"
SRC_URI[src.sha256sum] = "a5ea50ff621052e601686603478878993e45de1c8b86e10d5be65a37d2ec2ab1"

RDEPENDS_${PN} = "nodejs"

inherit allarch npm-install-global
