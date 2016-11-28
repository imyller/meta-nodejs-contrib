DESCRIPTION = "A simple CLI tool for ensuring that a given script runs continuously (i.e. forever)."

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=da5360871cfc7e3df08cde6a2adeac25"

SRC_URI = "https://github.com/foreverjs/forever/archive/${PV}.tar.gz;name=src"

SRC_URI[src.md5sum] = "d9a7186766b35212cdd70fcb5ddfc0bd"
SRC_URI[src.sha256sum] = "696f581784330531a4d4a121755e239c3ad42dd814f1f0e9b6fa0384a462ecce"

RDEPENDS_${PN} = "nodejs"

inherit allarch npm-install-global
