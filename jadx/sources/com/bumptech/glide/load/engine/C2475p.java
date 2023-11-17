package com.bumptech.glide.load.engine;

import java.util.HashMap;
import java.util.Map;
import p166m3.C7083e;

/* renamed from: com.bumptech.glide.load.engine.p */
final class C2475p {

    /* renamed from: a */
    private final Map f7858a = new HashMap();

    /* renamed from: b */
    private final Map f7859b = new HashMap();

    C2475p() {
    }

    /* renamed from: b */
    private Map m9570b(boolean z) {
        return z ? this.f7859b : this.f7858a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C2464k mo7950a(C7083e eVar, boolean z) {
        return (C2464k) m9570b(z).get(eVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo7951c(C7083e eVar, C2464k kVar) {
        m9570b(kVar.mo7923p()).put(eVar, kVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo7952d(C7083e eVar, C2464k kVar) {
        Map b = m9570b(kVar.mo7923p());
        if (kVar.equals(b.get(eVar))) {
            b.remove(eVar);
        }
    }
}
