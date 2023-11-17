package com.facetec.sdk;

import java.net.Proxy;

/* renamed from: com.facetec.sdk.lf */
public final class C3347lf {
    /* renamed from: b */
    public static String m13371b(C3274jx jxVar) {
        String f = jxVar.mo9549f();
        String j = jxVar.mo9554j();
        if (j == null) {
            return f;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(f);
        sb.append('?');
        sb.append(j);
        return sb.toString();
    }

    /* renamed from: d */
    public static boolean m13372d(C3293kb kbVar, Proxy.Type type) {
        return !kbVar.mo9595j() && type == Proxy.Type.HTTP;
    }
}
