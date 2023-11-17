package com.facetec.sdk;

import java.net.ProtocolException;

/* renamed from: com.facetec.sdk.le */
public final class C3346le {

    /* renamed from: a */
    public final C3271jv f10985a;

    /* renamed from: c */
    public final int f10986c;

    /* renamed from: e */
    public final String f10987e;

    private C3346le(C3271jv jvVar, int i, String str) {
        this.f10985a = jvVar;
        this.f10986c = i;
        this.f10987e = str;
    }

    /* renamed from: e */
    public static C3346le m13370e(String str) {
        int i;
        C3271jv jvVar;
        String str2;
        if (str.startsWith("HTTP/1.")) {
            i = 9;
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            int charAt = str.charAt(7) - '0';
            if (charAt == 0) {
                jvVar = C3271jv.HTTP_1_0;
            } else if (charAt == 1) {
                jvVar = C3271jv.HTTP_1_1;
            } else {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
        } else if (str.startsWith("ICY ")) {
            jvVar = C3271jv.HTTP_1_0;
            i = 4;
        } else {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        int i2 = i + 3;
        if (str.length() >= i2) {
            try {
                int parseInt = Integer.parseInt(str.substring(i, i2));
                if (str.length() <= i2) {
                    str2 = "";
                } else if (str.charAt(i2) == ' ') {
                    str2 = str.substring(i + 4);
                } else {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                return new C3346le(jvVar, parseInt, str2);
            } catch (NumberFormatException unused) {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
        } else {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (this.f10985a == C3271jv.HTTP_1_0) {
            str = "HTTP/1.0";
        } else {
            str = "HTTP/1.1";
        }
        sb.append(str);
        sb.append(' ');
        sb.append(this.f10986c);
        if (this.f10987e != null) {
            sb.append(' ');
            sb.append(this.f10987e);
        }
        return sb.toString();
    }
}
