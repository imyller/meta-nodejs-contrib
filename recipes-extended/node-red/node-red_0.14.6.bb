DESCRIPTION = "Node-RED is a visual tool for wiring the Internet of Things"
HOMEPAGE = "http://nodered.org"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=2ee41112a44fe7014dce33e26468ba93"

SRC_URI = " \
	https://github.com/${PN}/${PN}/releases/download/${PV}/${PN}-${PV}.zip;name=pkg \
"

SRC_URI[pkg.md5sum] = "b89a1309b687af9845d0ae593988e3de"
SRC_URI[pkg.sha256sum] = "d4ce01c646550efa96b7c8f9fd117c713d994c9cecd6fc9a53944dd18b384b66"

S = "${WORKDIR}/${PN}-${PV}"

inherit npm-install-global

do_configure() {
	:
}

INHIBIT_PACKAGE_DEBUG_SPLIT = "1"

RDEPENDS_${PN} += " nodejs bash python zsh"
