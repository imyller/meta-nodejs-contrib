DESCRIPTION = "A simple CLI tool for ensuring that a given script runs continuously (i.e. forever)."

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=da5360871cfc7e3df08cde6a2adeac25"

PR = "r2"

SRC_URI = "https://github.com/foreverjs/forever/archive/${PV}.tar.gz;name=src"

SRC_URI[src.md5sum] = "6c10d48a9c7a625a498baa2bdaec937b"
SRC_URI[src.sha256sum] = "f4840f8eb94e35cd720728327099cf5cc50011eb0ce2243f9cbe9ee29ae99f31"

RDEPENDS_${PN} = "nodejs"

inherit allarch npm-install-global
