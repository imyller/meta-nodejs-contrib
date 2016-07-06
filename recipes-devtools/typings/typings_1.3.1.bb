SUMMARY = "Typescript Definition Manager"
HOMEPAGE = "https://www.npmjs.com/package/typings"
SECTION = "js/devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=298525826e29612d4180abda579d8430"

SRC_URI = "https://github.com/typings/typings/archive/v${PV}.tar.gz"

SRC_URI[md5sum] = "7d9d418b502467c424b08a3f0d46916e"
SRC_URI[sha256sum] = "5d5ebc27a1aa991f55254bbc3ac86100dfc0530c15ca4b5fb6e57e7cc012a85c"

inherit npm-install-global allarch

INSANE_SKIP_${PN} += "file-rdeps"

BBCLASSEXTEND = "native nativesdk"
