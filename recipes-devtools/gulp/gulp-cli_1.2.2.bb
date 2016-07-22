SUMMARY = "Command line interface for the Gulp streaming build system"
HOMEPAGE = "http://gulpjs.com/"
SECTION = "js/devel"
LICENSE = "MIT"

LIC_FILES_CHKSUM = "file://LICENSE;md5=2823b4b2f2e0f9bae5fa46f1f150c75a"

PACKAGE_ARCH = "all"

SRC_URI = "https://github.com/gulpjs/gulp-cli/archive/v${PV}.tar.gz"

SRC_URI[md5sum] = "e4d0c0e8b9f34bef58f65c8d4675304f"
SRC_URI[sha256sum] = "9ca5154f3d608817879f05e7a6a1bee60815036e337bdafc88a4d7a293eed282"

INSANE_SKIP_${PN} += "file-rdeps"

inherit npm-install-global

BBCLASSEXTEND = "native nativesdk"
