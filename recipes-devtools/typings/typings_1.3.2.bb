SUMMARY = "Typescript Definition Manager"
HOMEPAGE = "https://www.npmjs.com/package/typings"
SECTION = "js/devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=298525826e29612d4180abda579d8430"

SRC_URI = "https://github.com/typings/typings/archive/v${PV}.tar.gz"

SRC_URI[md5sum] = "a337c11222e4a0fe068b3bf5c5395a38"
SRC_URI[sha256sum] = "8a62118ec226c6211fbea45e1ada0b59d6a919dfecedbe33a88a1d46706f6f7f"

inherit npm-install-global allarch

INSANE_SKIP_${PN} += "file-rdeps"

BBCLASSEXTEND = "native nativesdk"
