package com.facetec.sdk;

/* renamed from: com.facetec.sdk.eu */
public final class C3037eu {

    /* renamed from: e */
    private static final int f10181e;

    static {
        String property = System.getProperty("java.version");
        int d = m12689d(property);
        if (d == -1) {
            d = m12688c(property);
        }
        if (d == -1) {
            d = 6;
        }
        f10181e = d;
    }

    /* renamed from: a */
    public static int m12686a() {
        return f10181e;
    }

    /* renamed from: b */
    public static boolean m12687b() {
        return f10181e >= 9;
    }

    /* renamed from: c */
    private static int m12688c(String str) {
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

    /* renamed from: d */
    private static int m12689d(String str) {
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
