SUMMARY = "Simple hello program from meta-simon"
DESCRIPTION = "A small hello world example for OpenBMC custom layer"
LICENSE = "CLOSED"

SRC_URI = "file://hello-simon.c"

S = "${UNPACKDIR}"

do_compile() {
    ${CC} ${CFLAGS} ${LDFLAGS} ${S}/hello-simon.c -o hello-simon
}

do_install() {
    install -d ${D}${bindir}
    install -m 0755 hello-simon ${D}${bindir}/hello-simon
}

