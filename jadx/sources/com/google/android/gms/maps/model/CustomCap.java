package com.google.android.gms.maps.model;

import p222q7.C7896a;

public final class CustomCap extends Cap {

    /* renamed from: h */
    public final C7896a f14057h;

    /* renamed from: i */
    public final float f14058i;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public CustomCap(p222q7.C7896a r3, float r4) {
        /*
            r2 = this;
            java.lang.String r0 = "bitmapDescriptor must not be null"
            java.lang.Object r0 = p182n6.C7264i.m27903l(r3, r0)
            q7.a r0 = (p222q7.C7896a) r0
            r1 = 0
            int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x0015
            r2.<init>(r0, r4)
            r2.f14057h = r3
            r2.f14058i = r4
            return
        L_0x0015:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "refWidth must be positive"
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.model.CustomCap.<init>(q7.a, float):void");
    }

    public String toString() {
        String valueOf = String.valueOf(this.f14057h);
        float f = this.f14058i;
        return "[CustomCap: bitmapDescriptor=" + valueOf + " refWidth=" + f + "]";
    }
}
