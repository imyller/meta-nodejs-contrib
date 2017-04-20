SUMMARY = "UglifyJS is a JavaScript parser, minifier, compressor or beautifier toolkit."
HOMEPAGE = "http://lisperator.net/uglifyjs/"
SECTION = "js/devel"

LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4677f24cba62224b999bcb8da6e05fb4"

SRC_URI = "https://github.com/mishoo/UglifyJS2/archive/v${PV}.tar.gz"

SRC_URI[md5sum] = "7a171d1daf9a99f005156f1b0fefafcb"
SRC_URI[sha256sum] = "b9db9cf85240acdedac766bc53b3400c683205069bf8f77aded4efc7854da180"

S = "${WORKDIR}/UglifyJS2-${PV}"

INSANE_SKIP_${PN} += "file-rdeps"

inherit npm-install-global allarch

BBCLASSEXTEND = "native nativesdk"
