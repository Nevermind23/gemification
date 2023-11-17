package com.facetec.sdk;

/* renamed from: com.facetec.sdk.ky */
public final class C3328ky {
    static {
        C3435mq.m13741b("\"\\");
        C3435mq.m13741b("\t ,=");
    }

    /* renamed from: a */
    private static long m13333a(String str) {
        if (str == null) {
            return -1;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    /* renamed from: c */
    public static long m13335c(C3295kc kcVar) {
        return m13333a(kcVar.mo9610e().mo9488a("Content-Length"));
    }

    /* renamed from: d */
    public static int m13336d(String str, int i, String str2) {
        while (i < str.length() && str2.indexOf(str.charAt(i)) == -1) {
            i++;
        }
        return i;
    }

    /* renamed from: e */
    public static void m13338e(C3255jo joVar, C3274jx jxVar, C3260jr jrVar) {
        if (joVar != C3255jo.f10648d) {
            C3251jl.m13027d(jxVar, jrVar).isEmpty();
        }
    }

    /* renamed from: c */
    public static int m13334c(String str, int i) {
        while (i < str.length() && ((r0 = str.charAt(i)) == ' ' || r0 == 9)) {
            i++;
        }
        return i;
    }

    /* renamed from: e */
    public static boolean m13339e(C3295kc kcVar) {
        if (kcVar.mo9609d().mo9589b().equals("HEAD")) {
            return false;
        }
        int b = kcVar.mo9606b();
        if (((b >= 100 && b < 200) || b == 204 || b == 304) && m13335c(kcVar) == -1 && !"chunked".equalsIgnoreCase(kcVar.mo9611e("Transfer-Encoding"))) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public static int m13337e(String str, int i) {
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (parseLong < 0) {
                return 0;
            }
            return (int) parseLong;
        } catch (NumberFormatException unused) {
            return i;
        }
    }
}
