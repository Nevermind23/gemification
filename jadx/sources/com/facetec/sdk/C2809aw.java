package com.facetec.sdk;

import java.util.HashMap;

/* renamed from: com.facetec.sdk.aw */
final class C2809aw {

    /* renamed from: a */
    private static HashMap<String, Long> f9021a = new HashMap<>();

    C2809aw() {
    }

    /* renamed from: a */
    private static String m10978a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("__E");
        return sb.toString();
    }

    /* renamed from: b */
    public static long m10979b(String str) {
        long j;
        long j2;
        if (f9021a.containsKey(m10982e(str))) {
            j = f9021a.get(m10982e(str)).longValue();
        } else {
            j = -1;
        }
        if (f9021a.containsKey(m10978a(str))) {
            j2 = f9021a.get(m10978a(str)).longValue();
        } else {
            j2 = -1;
        }
        if (j == -1) {
            return 0;
        }
        if (j2 == -1) {
            return System.nanoTime() - j;
        }
        return j2 - j;
    }

    /* renamed from: c */
    public static void m10980c(String str) {
        f9021a.remove(m10982e(str));
        f9021a.remove(m10978a(str));
        f9021a.put(m10982e(str), Long.valueOf(System.nanoTime()));
    }

    /* renamed from: d */
    public static void m10981d(String str) {
        if (f9021a.containsKey(m10982e(str)) && !f9021a.containsKey(m10978a(str))) {
            f9021a.put(m10978a(str), Long.valueOf(System.nanoTime()));
        }
    }

    /* renamed from: e */
    private static String m10982e(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("__S");
        return sb.toString();
    }
}
