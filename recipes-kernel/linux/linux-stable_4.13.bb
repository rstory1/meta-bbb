require recipes-kernel/linux/linux-yocto.inc

KERNEL_IMAGETYPE = "zImage"

COMPATIBLE_MACHINE = "beaglebone"

RDEPENDS_kernel-base += "kernel-devicetree"

KERNEL_DEVICETREE_beaglebone = " \
    am335x-boneblack.dtb \
    am335x-boneblack-wireless.dtb \
    am335x-bonegreen.dtb \
    am335x-bonegreen-wireless.dtb \
"

LINUX_VERSION = "4.13"
LINUX_VERSION_EXTENSION = "-jumpnow"

FILESEXTRAPATHS_prepend := "${THISDIR}/linux-stable-4.13:"

S = "${WORKDIR}/git"

PR = "r6"

PV = "4.13.8"
SRCREV = "d913bc0b6dac2b93233a0aff4ff418be8c615613"
SRC_URI = " \
    git://git.kernel.org/pub/scm/linux/kernel/git/stable/linux-stable.git;branch=linux-4.13.y \
    file://defconfig \
    file://0001-spidev-Add-a-generic-compatible-id.patch \
    file://0002-dts-Revoke-Beaglebone-i2c2-cape-definitions.patch \
    file://0003-wlcore-Change-NO-FW-RX-BA-session-warnings-to-debug.patch \
"
