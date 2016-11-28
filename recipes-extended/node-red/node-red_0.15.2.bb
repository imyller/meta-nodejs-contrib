DESCRIPTION = "Node-RED is a visual tool for wiring the Internet of Things"
HOMEPAGE = "http://nodered.org"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=2ee41112a44fe7014dce33e26468ba93"

SRC_URI = " \
	https://github.com/${PN}/${PN}/releases/download/${PV}/${PN}-${PV}.zip;name=pkg \
"

SRC_URI[pkg.md5sum] = "a8ff00b8a0b6ad9f68399b27cac2ba23"
SRC_URI[pkg.sha256sum] = "2187b3e2262752eef849741fd09a955b23da1a6d569e4897b45deb7c10d9080c"

S = "${WORKDIR}/${PN}-${PV}"

inherit npm-install-global

do_configure() {
	:
}

INHIBIT_PACKAGE_DEBUG_SPLIT = "1"

RDEPENDS_${PN} += " nodejs bash python zsh"
