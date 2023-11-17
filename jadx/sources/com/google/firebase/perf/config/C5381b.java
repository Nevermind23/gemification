package com.google.firebase.perf.config;

/* renamed from: com.google.firebase.perf.config.b */
public final class C5381b extends C5402v {

    /* renamed from: a */
    private static C5381b f17185a;

    private C5381b() {
    }

    /* renamed from: e */
    protected static synchronized C5381b m21304e() {
        C5381b bVar;
        synchronized (C5381b.class) {
            if (f17185a == null) {
                f17185a = new C5381b();
            }
            bVar = f17185a;
        }
        return bVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public String mo17733b() {
        return "firebase_performance_collection_deactivated";
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public Boolean mo17734d() {
        return Boolean.FALSE;
    }
}
