KBRANCH ?= "v6.8-rc5/qcom-sa8155p-xt"

require recipes-kernel/linux/linux-yocto.inc
SRCREV ?= "392e9ddc116f4d5623cacb94ee8a52196241e678"

SRC_URI = "git://github.com/xen-troops/linux.git;name=machine;branch=${KBRANCH};protocol=https \
	   file://defconfig \
"

LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"
LINUX_VERSION ?= "6.8-rc5"

DEPENDS += "openssl-native util-linux-native"
DEPENDS += "gmp-native libmpc-native"

COMPATIBLE_MACHINE = "^(sa8155p-adp)$"

PV = "${LINUX_VERSION}+git${SRCPV}"

KMETA = "kernel-meta"
KCONF_BSP_AUDIT_LEVEL = "1"

KERNEL_DEVICETREE = "qcom/sa8155p-adp.dtb"
