DESCRIPTION = "Command line interface for bcryptjs"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=2459e4101d5fabab9d291bde6cdc5a56"

PR = "r2"

SRC_URI = "https://github.com/imyller/node-bcryptjs-cli/archive/v${PV}.tar.gz;name=module;downloadfilename=${PN}-${PV}.tar.gz"

SRC_URI[module.md5sum] = "e1bf1f191f81208d0f2585fa817d0d6b"
SRC_URI[module.sha256sum] = "f8b13900b5a1c4869e59c44f87e9831deeca82fa36002cfaa84e273d9d4ad52a"

S = "${WORKDIR}/node-bcryptjs-cli-${PV}"

RDEPENDS_${PN} = "nodejs"

inherit npm-install-global allarch
