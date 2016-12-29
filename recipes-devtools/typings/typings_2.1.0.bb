SUMMARY = "Typescript Definition Manager"
HOMEPAGE = "https://www.npmjs.com/package/typings"
SECTION = "js/devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=298525826e29612d4180abda579d8430"

SRC_URI = "https://github.com/typings/typings/archive/v${PV}.tar.gz"

SRC_URI[md5sum] = "3dce4dd3fe4c311eedea4e099f989b27"
SRC_URI[sha256sum] = "11f0cabaa0e81461957465aa6ea1ba15419161e9815700c10d5adf94a942fad6"

inherit npm-install-global allarch

INSANE_SKIP_${PN} += "file-rdeps"

BBCLASSEXTEND = "native nativesdk"
