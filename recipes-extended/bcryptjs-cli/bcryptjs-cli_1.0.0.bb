DESCRIPTION = "Command line interface for bcryptjs"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=2459e4101d5fabab9d291bde6cdc5a56"

PR = "r1"

SRC_URI = "https://github.com/imyller/node-bcryptjs-cli/archive/v${PV}.tar.gz;name=module;downloadfilename=${PN}-${PV}.tar.gz"

SRC_URI[module.md5sum] = "d74b6c2568dd237b11c6780ddb5add91"
SRC_URI[module.sha256sum] = "af62f54b68df11fcbc3eac79d87c08458b89841f49c733cf6a3cc3364c43db8c"

S = "${WORKDIR}/node-bcryptjs-cli-${PV}"

RDEPENDS_${PN} = "nodejs"

inherit npm-install-global
