package com.facetec.sdk;

/* renamed from: com.facetec.sdk.as */
final class C2798as extends Exception {
    C2798as(String str) {
        super(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final boolean mo8848e() {
        return getCause() instanceof IllegalAccessException;
    }

    C2798as(Throwable th) {
        super(th.getMessage(), th);
    }

    C2798as(String str, Throwable th) {
        super(str, th);
    }
}
