package com.facetec.sdk;

import java.io.IOException;

/* renamed from: com.facetec.sdk.lw */
public final class C3395lw extends IOException {

    /* renamed from: e */
    public final C3361ll f11195e;

    public C3395lw(C3361ll llVar) {
        super("stream was reset: ".concat(String.valueOf(llVar)));
        this.f11195e = llVar;
    }
}
