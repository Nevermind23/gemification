package com.threatmetrix.TrustDefender;

import com.threatmetrix.TrustDefender.C11907h;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;
import java.util.Map;
import java.util.TreeMap;
import p341ge.bog.mobilebank.model.payment.PaymentServiceConfig;

/* renamed from: com.threatmetrix.TrustDefender.r */
public class C11965r {

    /* renamed from: j */
    private static final String f35141j = C11907h.m43615j(C11965r.class);

    /* renamed from: a */
    private String f35142a = null;

    /* renamed from: b */
    private String f35143b = null;

    /* renamed from: c */
    private String f35144c = null;

    /* renamed from: d */
    private String f35145d = null;

    /* renamed from: e */
    private String f35146e = null;

    /* renamed from: f */
    private String f35147f = null;

    /* renamed from: g */
    private String f35148g = null;

    /* renamed from: h */
    private String f35149h = null;

    /* renamed from: i */
    private String f35150i = null;

    /* renamed from: com.threatmetrix.TrustDefender.r$a */
    public enum C11966a {
        BLUETOOTH("bluetooth tethering"),
        CELLULAR("cellular"),
        MOBILE(PaymentServiceConfig.TYPE_MOBILE),
        WIFI("wifi"),
        ETHERNET("ethernet"),
        VPN("vpn"),
        MOBILE_DUN("mobile_dun");
        

        /* renamed from: d */
        public final String f35159d;

        private C11966a(String str) {
            this.f35159d = str;
        }

        /* renamed from: a */
        public String mo32038a() {
            return this.f35159d;
        }
    }

    /* renamed from: com.threatmetrix.TrustDefender.r$b */
    public static class C11967b {
    }

    public C11965r() {
        TreeMap treeMap = new TreeMap();
        TreeMap treeMap2 = new TreeMap();
        TreeMap treeMap3 = new TreeMap();
        C11967b[] F = C11996u0.m44035F();
        if (F == null || F.length <= 0) {
            try {
                Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
                if (networkInterfaces != null) {
                    while (networkInterfaces.hasMoreElements()) {
                        NetworkInterface nextElement = networkInterfaces.nextElement();
                        String name = nextElement.getName();
                        if (nextElement.getHardwareAddress() != null) {
                            String y = C11921k0.m43742y(nextElement.getHardwareAddress());
                            if (C11921k0.m43717B(y)) {
                                treeMap3.put(y, name);
                            }
                        }
                        if (!name.startsWith("dummy")) {
                            m43914m(nextElement.getInetAddresses(), name, treeMap, treeMap2);
                        }
                    }
                }
            } catch (SocketException e) {
                C11907h.C11908a.m43627e(f35141j, "Declared exception: Can't get IP Addresses due to SocketException :{} ", e.toString());
            } catch (Throwable th) {
                String str = f35141j;
                C11907h.C11908a.m43623a(str, "Unexpected exception happened " + th.toString());
            }
        } else if (F.length > 0) {
            C11967b bVar = F[0];
            throw null;
        }
        this.f35146e = C11921k0.m43727j(treeMap);
        this.f35147f = C11921k0.m43720c(treeMap2, false, -1);
        this.f35148g = C11921k0.m43727j(treeMap3);
    }

    /* renamed from: d */
    private void m43913d(InetAddress inetAddress, String str, Map map, Map map2) {
        if (inetAddress.isLoopbackAddress()) {
            return;
        }
        if (inetAddress instanceof Inet4Address) {
            map.put(inetAddress.getHostAddress(), str);
        } else if (inetAddress instanceof Inet6Address) {
            String hostAddress = inetAddress.getHostAddress();
            int indexOf = hostAddress.indexOf("%");
            if (indexOf > 0) {
                hostAddress = hostAddress.substring(0, indexOf);
            }
            map2.put(hostAddress, str);
        }
    }

    /* renamed from: m */
    private void m43914m(Enumeration enumeration, String str, Map map, Map map2) {
        if (enumeration != null) {
            while (enumeration.hasMoreElements()) {
                m43913d((InetAddress) enumeration.nextElement(), str, map, map2);
            }
        }
    }

    /* renamed from: a */
    public String mo32024a() {
        return this.f35146e;
    }

    /* renamed from: b */
    public void mo32025b() {
        this.f35143b = null;
        this.f35142a = null;
        this.f35145d = null;
    }

    /* renamed from: c */
    public void mo32026c(String str) {
        this.f35150i = str;
    }

    /* renamed from: e */
    public String mo32027e() {
        return this.f35149h;
    }

    /* renamed from: f */
    public String mo32028f() {
        return this.f35144c;
    }

    /* renamed from: g */
    public void mo32029g(String str) {
        this.f35144c = str;
    }

    /* renamed from: h */
    public String mo32030h() {
        return this.f35148g;
    }

    /* renamed from: i */
    public String mo32031i() {
        return this.f35143b;
    }

    /* renamed from: j */
    public String mo32032j() {
        return this.f35150i;
    }

    /* renamed from: k */
    public boolean mo32033k(String[] strArr) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        if (strArr != null && strArr.length >= 5) {
            if (this.f35143b == null && (str5 = strArr[0]) != null) {
                this.f35143b = C11934m0.m43793d(str5);
            }
            if (this.f35142a == null && (str4 = strArr[1]) != null) {
                this.f35142a = C11934m0.m43797h(str4);
            }
            if (this.f35145d == null && (str3 = strArr[2]) != null) {
                this.f35145d = str3;
            }
            if (this.f35144c == null && (str2 = strArr[3]) != null) {
                this.f35144c = str2;
            }
            if (this.f35150i == null && (str = strArr[4]) != null) {
                this.f35150i = str;
            }
        }
        return (this.f35143b == null || this.f35142a == null || this.f35145d == null || this.f35144c == null) ? false : true;
    }

    /* renamed from: l */
    public String mo32034l() {
        return this.f35145d;
    }

    /* renamed from: n */
    public String mo32035n() {
        return this.f35142a;
    }

    /* renamed from: o */
    public void mo32036o(String str) {
        this.f35149h = str;
    }

    /* renamed from: p */
    public String mo32037p() {
        return this.f35147f;
    }
}
