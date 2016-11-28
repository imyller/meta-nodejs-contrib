SUMMARY = "Bower package manager"
HOMEPAGE = "http://bower.io"
SECTION = "js/devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e273de0d9430b4e4a74446f00e19ac54"

PACKAGE_ARCH = "all"

SRC_URI = "https://github.com/bower/bower/archive/v${PV}.tar.gz"

SRC_URI[md5sum] = "34c26bee216aa5da65671626b87d0524"
SRC_URI[sha256sum] = "1db61bf2605dfb67f16cd4d88f22f290dd0bf4c26ccc71bcd405fbdd9faf05fe"

inherit npm-install-global

INSANE_SKIP_${PN} += "file-rdeps"

BBCLASSEXTEND = "native nativesdk"
