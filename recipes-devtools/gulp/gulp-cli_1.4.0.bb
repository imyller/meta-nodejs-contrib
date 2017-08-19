SUMMARY = "Command line interface for the Gulp streaming build system"
HOMEPAGE = "http://gulpjs.com/"
SECTION = "js/devel"
LICENSE = "MIT"

LIC_FILES_CHKSUM = "file://LICENSE;md5=2823b4b2f2e0f9bae5fa46f1f150c75a"

PACKAGE_ARCH = "all"

SRC_URI = "https://github.com/gulpjs/gulp-cli/archive/v${PV}.tar.gz"

SRC_URI[md5sum] = "6dcb80662d819c1dedb591bd4bba9bd5"
SRC_URI[sha256sum] = "8665f199d31dc6508673244742cd9b6d9c08e8d278d4f70f7fefbc30ad3ff9ba"

INSANE_SKIP_${PN} += "file-rdeps"

inherit npm-install-global

BBCLASSEXTEND = "native nativesdk"
