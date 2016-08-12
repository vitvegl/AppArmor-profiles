### php5.6 profile skeleton ###

/usr/bin/php5 {

  /etc/ld.so.cache r,

  /lib/ld-linux.so.2 r,
  /lib/i386-linux-gnu/ld-*.so rm,
  /lib/i386-linux-gnu/libgcc_s.so.? rm,

  /lib/i386-linux-gnu/lib{c,m,dl,pthread,resolv}*.so{,?} rm,
  /lib/i386-linux-gnu/libnss_{dns,files,nis}*.so{,?} rm,

  /lib/i386-linux-gnu/libz.so.* rm,
  /lib/i386-linux-gnu/libcrypto.so.* rm,
  /lib/i386-linux-gnu/libssl.so.* rm,

  /usr/lib/i386-linux-gnu/libdb*.so rm,
  /lib/i386-linux-gnu/libbz2.so.* rm,
  /lib/i386-linux-gnu/libpcre.so.* rm,
  /usr/lib/i386-linux-gnu/libxml2.so.* rm,
  /usr/lib/i386-linux-gnu/libicuuc.so.* rm,
  /usr/lib/i386-linux-gnu/libicudata.so.* rm,
  /usr/lib/i386-linux-gnu/libstdc++.so.* rm,

  /lib/i386-linux-gnu/libjson-c.so.* rm,
  /usr/lib/i386-linux-gnu/libmysqlclient.so.* rm,

  /etc/localtime r,
  /etc/nsswitch.conf r,
  /etc/services r,

  /usr/{lib,share}/locale/{,**} r,

  /etc/php5/{,**} r,
  /usr/lib/php5/{,**} rm,
  
}
