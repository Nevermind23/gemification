package com.facetec.sdk;

import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: com.facetec.sdk.kp */
public final class C3316kp {

    /* renamed from: a */
    private final Set<C3302kh> f10900a = new LinkedHashSet();

    /* renamed from: c */
    public final synchronized void mo9648c(C3302kh khVar) {
        this.f10900a.add(khVar);
    }

    /* renamed from: d */
    public final synchronized void mo9649d(C3302kh khVar) {
        this.f10900a.remove(khVar);
    }

    /* renamed from: e */
    public final synchronized boolean mo9650e(C3302kh khVar) {
        return this.f10900a.contains(khVar);
    }
}
