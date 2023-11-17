package com.medallia.digital.mobilesdk;

import android.util.Base64;

/* renamed from: com.medallia.digital.mobilesdk.o3 */
public final class C11032o3 {
    /* renamed from: a */
    protected static String m40429a(String str) {
        if (str == null) {
            return null;
        }
        try {
            return m40430b(str.split("\\.")[0]);
        } catch (Exception e) {
            C10735b4.m39114f(e.getMessage());
            return null;
        }
    }

    /* renamed from: b */
    private static String m40430b(String str) {
        try {
            return new String(Base64.decode(str, 8), "UTF-8");
        } catch (Exception e) {
            C10735b4.m39114f(e.getMessage());
            return null;
        }
    }

    /* renamed from: c */
    public static String m40431c(String str) {
        if (str == null) {
            return null;
        }
        try {
            return m40430b(str.split("\\.")[1]);
        } catch (Exception e) {
            C10735b4.m39114f(e.getMessage());
            return null;
        }
    }
}
