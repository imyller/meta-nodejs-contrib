SUMMARY = "Grunt.js command line wrapper"
HOMEPAGE = "http://gruntjs.com/"
SECTION = "js/devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE-MIT;md5=331c934843c71c28b2bf98046c03eb97"

PACKAGE_ARCH = "all"

SRC_URI = "https://github.com/gruntjs/grunt-cli/archive/v${PV}.tar.gz"

SRC_URI[md5sum] = "b5b4fedca4729efd88acf0606cbe9f89"
SRC_URI[sha256sum] = "02fca1e10d8158cb6ee7a450d23dd11cd9bb867e994466d973a851315050595a"

INSANE_SKIP_${PN} += "file-rdeps"

inherit npm-install-global

#Seperate Zsh script for those that want it without breaking those that don't
PACKAGES =+ "${PN}-zsh"
FILES_${PN}-zsh = "${exec_prefix}/lib/node_modules/grunt-cli/completion/zsh"

#The disable warning about missing zsh
INSANE_SKIP_${PN} += "file-rdeps"

BBCLASSEXTEND = "native nativesdk"
