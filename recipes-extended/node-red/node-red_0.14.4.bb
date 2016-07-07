DESCRIPTION = "Node-RED is a visual tool for wiring the Internet of Things"
HOMEPAGE = "http://nodered.org"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=2ee41112a44fe7014dce33e26468ba93"

SRC_URI = " \
	https://github.com/${PN}/${PN}/releases/download/${PV}/${PN}-${PV}.zip;name=pkg \
"

SRC_URI[pkg.md5sum] = "042bda2a7a6f67d769b8f0d580b7d475"
SRC_URI[pkg.sha256sum] = "3f720874629d93e62b6833f8e0397286e8268a3b876e712c4d7f69bd340ca96c"

S = "${WORKDIR}/${PN}-${PV}"

inherit npm-install-global

INHIBIT_PACKAGE_DEBUG_SPLIT = "1"

RDEPENDS_${PN} += " nodejs bash python zsh"
