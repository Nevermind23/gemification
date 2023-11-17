package com.facetec.sdk;

import com.salesforce.marketingcloud.sfmcsdk.components.http.Request;

/* renamed from: com.facetec.sdk.kz */
public final class C3329kz {
    /* renamed from: a */
    public static boolean m13340a(String str) {
        return str.equals("PROPFIND");
    }

    /* renamed from: b */
    public static boolean m13341b(String str) {
        if (str.equals("POST") || str.equals(Request.PUT) || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT")) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m13342c(String str) {
        if (!str.equals("PROPFIND")) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static boolean m13343d(String str) {
        if (str.equals("GET") || str.equals("HEAD")) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public static boolean m13344e(String str) {
        if (str.equals("POST") || str.equals("PATCH") || str.equals(Request.PUT) || str.equals("DELETE") || str.equals("MOVE")) {
            return true;
        }
        return false;
    }
}
