/usr/lib/jvm/java-8-openjdk-i386/jre/bin/java {

capability mknod,

unix (create, shutdown) type=stream addr=none,

network inet stream,
network inet dgram,
network inet6 stream,
network inet6 dgram,

/etc/ld.so.cache r,

/etc/java-8-openjdk/{,**} r,

/usr/lib/jvm/java-8-openjdk-i386/jre/{,**} rm,

/dev/{,u}random r,

/etc/hosts r,
/etc/host.conf r,
/etc/localtime r,
/etc/locale.alias r,
/etc/nsswitch.conf r,
/etc/passwd r,
/etc/resolv.conf r,
/etc/timezone r,

owner /proc/*/{,**} r,

/proc/loadavg r,
/proc/meminfo r,
/proc/self/maps r,
/proc/stat r,
/proc/sys/vm/overcommit_memory r,
/sys/block/{,*} r,
/sys/devices/pci*/{,**} r,
/sys/devices/system/cpu/{,**} r,

/usr/{lib,share}/locale/{,**} r,
/usr/share/zoneinfo/{,**} r,

/tmp/{,**} r,

deny /tmp/{systemd,ssh}*/{,**} rwklm,

owner /home/*/projects/ r,
owner /home/*/projects/java/{,**} rwkl,

owner /tmp/ r,
owner /tmp/jna*{,/**} rwk,
owner /tmp/hsperfdata_*/{,**} rwkl,
owner /tmp/[0-9]*.tmp rwk,

/usr/lib/i386-linux-gnu/jni/libatk-wrapper.so{,.*} rm,
/usr/share/java/java-atk-wrapper.jar r,

/usr/lib/i386-linux-gnu/librt.so r,
/lib/i386-linux-gnu/librt*.so{,.?} rm,
/lib/i386-linux-gnu/ld*.so{,.?} rm,

/lib/i386-linux-gnu/lib{c,dl,ld,m,nsl,nss_{compat,files,nis},pthread}*.so{,.?} rm,
/lib/i386-linux-gnu/libz.so* rm,

/usr/lib/i386-linux-gnu/libstdc++.so* rm,

/lib/i386-linux-gnu/libgcc_s.so.? rm,

}
