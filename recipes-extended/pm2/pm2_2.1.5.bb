DESCRIPTION = "Production process manager for Node.js apps with a built-in load balancer"

LICENSE = "AGPL-3.0"
LIC_FILES_CHKSUM = "file://GNU-AGPL-3.0.txt;md5=9f9fa01c099265d62f73735e404ff8bb"

SRC_URI = "https://github.com/Unitech/pm2/archive/${PV}.tar.gz;name=src"

SRC_URI[src.md5sum] = "c92797f565681ee978588b0fc9debb49"
SRC_URI[src.sha256sum] = "5126ce99c838b2813e56d03dfa8ee758a0e839539838cfc9964631601ddb3f02"

RDEPENDS_${PN} = "nodejs"

do_compile[noexec] = "1"

inherit allarch npm-install-global
