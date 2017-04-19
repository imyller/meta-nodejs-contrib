SUMMARY = "Typescript Definition Manager"
HOMEPAGE = "https://www.npmjs.com/package/typings"
SECTION = "js/devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=298525826e29612d4180abda579d8430"

SRC_URI = "https://github.com/typings/typings/archive/v${PV}.tar.gz"

SRC_URI[md5sum] = "ca180792a40f6a9ac998558e9f234c76"
SRC_URI[sha256sum] = "57086568bcb8215ccf23d02a3f6af4d1f43a2750a34a109a33eaa69aa90f9c73"

inherit npm-install-global allarch

INSANE_SKIP_${PN} += "file-rdeps"

BBCLASSEXTEND = "native nativesdk"
