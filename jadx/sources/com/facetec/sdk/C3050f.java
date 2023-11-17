package com.facetec.sdk;

/* renamed from: com.facetec.sdk.f */
final class C3050f<T> {

    /* renamed from: c */
    private T f10209c = null;

    @FunctionalInterface
    /* renamed from: com.facetec.sdk.f$e */
    interface C3051e {
        Object create();
    }

    C3050f() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final synchronized T mo9264d(C3051e eVar) {
        if (this.f10209c == null) {
            this.f10209c = eVar.create();
        }
        return this.f10209c;
    }
}
