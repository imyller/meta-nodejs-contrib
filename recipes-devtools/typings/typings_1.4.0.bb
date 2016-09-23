SUMMARY = "Typescript Definition Manager"
HOMEPAGE = "https://www.npmjs.com/package/typings"
SECTION = "js/devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=298525826e29612d4180abda579d8430"

SRC_URI = "https://github.com/typings/typings/archive/v${PV}.tar.gz"

SRC_URI[md5sum] = "3bde63bf66d6d5580c9d8b5e14aebe83"
SRC_URI[sha256sum] = "bbcabc88efd0267a6e176353c0062ea0b881b6abd92b409dc3f550aaa3e97c30"

inherit npm-install-global allarch

INSANE_SKIP_${PN} += "file-rdeps"

BBCLASSEXTEND = "native nativesdk"
