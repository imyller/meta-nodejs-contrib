SUMMARY = "UglifyJS is a JavaScript parser, minifier, compressor or beautifier toolkit."
HOMEPAGE = "http://lisperator.net/uglifyjs/"
SECTION = "js/devel"

LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4677f24cba62224b999bcb8da6e05fb4"

SRC_URI = "https://github.com/mishoo/UglifyJS2/archive/v${PV}.tar.gz"

SRC_URI[md5sum] = "c7d5cb5680e00a9c3120045e837c6ff6"
SRC_URI[sha256sum] = "a40387b605eff7928984c7beba83f37dff26ab34c7bc104755586b4e8054f7ad"

S = "${WORKDIR}/UglifyJS2-${PV}"

INSANE_SKIP_${PN} += "file-rdeps"

inherit npm-install-global allarch

BBCLASSEXTEND = "native nativesdk"
