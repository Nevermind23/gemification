package com.facetec.sdk;

/* renamed from: com.facetec.sdk.w */
enum C3648w {
    NOT_RAN(0),
    NOT_DETECTED(1),
    DETECTED(2);
    

    /* renamed from: b */
    final int f11663b;

    private C3648w(int i) {
        this.f11663b = i;
    }

    /* renamed from: b */
    static C3648w m13942b(int i) {
        for (C3648w wVar : values()) {
            if (wVar.f11663b == i) {
                return wVar;
            }
        }
        throw new IllegalArgumentException();
    }
}
