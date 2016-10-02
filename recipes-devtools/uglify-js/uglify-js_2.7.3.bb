SUMMARY = "UglifyJS is a JavaScript parser, minifier, compressor or beautifier toolkit."
HOMEPAGE = "http://lisperator.net/uglifyjs/"
SECTION = "js/devel"

LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4677f24cba62224b999bcb8da6e05fb4"

SRC_URI = "https://github.com/mishoo/UglifyJS2/archive/v${PV}.tar.gz"

SRC_URI[md5sum] = "caa1139b1727425cb8fd222ae74e1463"
SRC_URI[sha256sum] = "87f38958ea0de896e3d9c147b9097b724c3d1d03d1b344ea17eb2818c5a17e84"

S = "${WORKDIR}/UglifyJS2-${PV}" 

INSANE_SKIP_${PN} += "file-rdeps"

inherit npm-install-global allarch

BBCLASSEXTEND = "native nativesdk"
