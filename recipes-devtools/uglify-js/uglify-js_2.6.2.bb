SUMMARY = "UglifyJS is a JavaScript parser, minifier, compressor or beautifier toolkit."
HOMEPAGE = "http://lisperator.net/uglifyjs/"
SECTION = "js/devel"

LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4677f24cba62224b999bcb8da6e05fb4"

SRC_URI = "https://github.com/mishoo/UglifyJS2/archive/v${PV}.tar.gz"

SRC_URI[md5sum] = "27784630dfe56a5c0fcb77e2d8b3ccba"
SRC_URI[sha256sum] = "be8a33a465dc21a4ecb0decd909d5d9528240cb14cc7acdba9fc60ea45d09e39"

S = "${WORKDIR}/UglifyJS2-${PV}" 

INSANE_SKIP_${PN} += "file-rdeps"

inherit npm-install-global allarch

BBCLASSEXTEND = "native nativesdk"
