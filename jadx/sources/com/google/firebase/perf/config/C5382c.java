package com.google.firebase.perf.config;

/* renamed from: com.google.firebase.perf.config.c */
public final class C5382c extends C5402v {

    /* renamed from: a */
    private static C5382c f17186a;

    private C5382c() {
    }

    /* renamed from: d */
    protected static synchronized C5382c m21307d() {
        C5382c cVar;
        synchronized (C5382c.class) {
            if (f17186a == null) {
                f17186a = new C5382c();
            }
            cVar = f17186a;
        }
        return cVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo17735a() {
        return "isEnabled";
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public String mo17733b() {
        return "firebase_performance_collection_enabled";
    }
}
