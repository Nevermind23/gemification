package com.google.firebase.perf.config;

/* renamed from: com.google.firebase.perf.config.l */
public final class C5392l extends C5402v {

    /* renamed from: a */
    private static C5392l f17196a;

    protected C5392l() {
    }

    /* renamed from: e */
    protected static synchronized C5392l m21346e() {
        C5392l lVar;
        synchronized (C5392l.class) {
            if (f17196a == null) {
                f17196a = new C5392l();
            }
            lVar = f17196a;
        }
        return lVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo17735a() {
        return "com.google.firebase.perf.SdkEnabled";
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo17736c() {
        return "fpr_enabled";
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public Boolean mo17745d() {
        return Boolean.TRUE;
    }
}
