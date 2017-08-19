DESCRIPTION = "Node-RED is a visual tool for wiring the Internet of Things"
HOMEPAGE = "http://nodered.org"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d6f37569f5013072e9490d2194d10ae6"

SRC_URI = " \
	https://github.com/${PN}/${PN}/releases/download/${PV}/${PN}-${PV}.zip;name=pkg \
"

SRC_URI[pkg.md5sum] = "a2067061c69eee8d16c8c3f7d386ce2d"
SRC_URI[pkg.sha256sum] = "67880b57877fcb45004550a4436f97c7586b7bfab82ab7ff97f3ff61d696e298"

S = "${WORKDIR}/${PN}-${PV}"

inherit npm-install-global

do_configure() {
	:
}

INHIBIT_PACKAGE_DEBUG_SPLIT = "1"

RDEPENDS_${PN} += " nodejs bash python zsh"
