package com.google.gson.internal;

/* renamed from: com.google.gson.internal.d */
public abstract class C5576d {

    /* renamed from: a */
    private static final int f17748a = m22213a();

    /* renamed from: a */
    private static int m22213a() {
        return m22215c(System.getProperty("java.version"));
    }

    /* renamed from: b */
    private static int m22214b(String str) {
        try {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                char charAt = str.charAt(i);
                if (!Character.isDigit(charAt)) {
                    break;
                }
                sb.append(charAt);
            }
            return Integer.parseInt(sb.toString());
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    /* renamed from: c */
    static int m22215c(String str) {
        int e = m22217e(str);
        if (e == -1) {
            e = m22214b(str);
        }
        if (e == -1) {
            return 6;
        }
        return e;
    }

    /* renamed from: d */
    public static boolean m22216d() {
        return f17748a >= 9;
    }

    /* renamed from: e */
    private static int m22217e(String str) {
        try {
            String[] split = str.split("[._]");
            int parseInt = Integer.parseInt(split[0]);
            if (parseInt != 1 || split.length <= 1) {
                return parseInt;
            }
            return Integer.parseInt(split[1]);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }
}
