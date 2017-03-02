SUMMARY = "UglifyJS is a JavaScript parser, minifier, compressor or beautifier toolkit."
HOMEPAGE = "http://lisperator.net/uglifyjs/"
SECTION = "js/devel"

LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4677f24cba62224b999bcb8da6e05fb4"

SRC_URI = "https://github.com/mishoo/UglifyJS2/archive/v${PV}.tar.gz"

SRC_URI[md5sum] = "6ca69d1ec07405afd46ebecc4d881b89"
SRC_URI[sha256sum] = "563b4e6e6969646fd44372ff36c72f34b922f546004c1944c806f75e974cc91c"

S = "${WORKDIR}/UglifyJS2-${PV}" 

INSANE_SKIP_${PN} += "file-rdeps"

inherit npm-install-global allarch

BBCLASSEXTEND = "native nativesdk"
