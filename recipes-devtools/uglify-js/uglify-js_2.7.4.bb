SUMMARY = "UglifyJS is a JavaScript parser, minifier, compressor or beautifier toolkit."
HOMEPAGE = "http://lisperator.net/uglifyjs/"
SECTION = "js/devel"

LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4677f24cba62224b999bcb8da6e05fb4"

SRC_URI = "https://github.com/mishoo/UglifyJS2/archive/v${PV}.tar.gz"

SRC_URI[md5sum] = "5b46edc8138a73ee6dc7db1099348235"
SRC_URI[sha256sum] = "d8ae07b1e1d07d0b6955310542287a0233297b19fbab9aab8513a4bf1ddaea31"

S = "${WORKDIR}/UglifyJS2-${PV}" 

INSANE_SKIP_${PN} += "file-rdeps"

inherit npm-install-global allarch

BBCLASSEXTEND = "native nativesdk"
