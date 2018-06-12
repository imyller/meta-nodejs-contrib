SUMMARY = "Command line interface for the Gulp streaming build system"
HOMEPAGE = "http://gulpjs.com/"
SECTION = "js/devel"
LICENSE = "MIT"

LIC_FILES_CHKSUM = "file://LICENSE;md5=2823b4b2f2e0f9bae5fa46f1f150c75a"

PACKAGE_ARCH = "all"

SRC_URI = "https://github.com/gulpjs/gulp-cli/archive/v${PV}.tar.gz"

SRC_URI[md5sum] = "92ef34d96557627afd59b626a3210a03"
SRC_URI[sha256sum] = "0f65cd7256fe7d64c807229b1f9cfdc1e09e177e500844ac60d30dd44437daf5"

INSANE_SKIP_${PN} += "file-rdeps"

inherit npm-install-global

BBCLASSEXTEND = "native nativesdk"
