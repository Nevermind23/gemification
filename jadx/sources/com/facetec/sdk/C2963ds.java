package com.facetec.sdk;

/* renamed from: com.facetec.sdk.ds */
public enum C2963ds implements C2970dt {
    ;

    /* renamed from: a */
    static String m12512a(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt) && sb.length() != 0) {
                sb.append(str2);
            }
            sb.append(charAt);
        }
        return sb.toString();
    }

    /* renamed from: e */
    static String m12513e(String str) {
        int length = str.length() - 1;
        int i = 0;
        while (!Character.isLetter(str.charAt(i)) && i < length) {
            i++;
        }
        char charAt = str.charAt(i);
        if (Character.isUpperCase(charAt)) {
            return str;
        }
        char upperCase = Character.toUpperCase(charAt);
        if (i == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(upperCase);
            sb.append(str.substring(1));
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str.substring(0, i));
        sb2.append(upperCase);
        sb2.append(str.substring(i + 1));
        return sb2.toString();
    }
}
