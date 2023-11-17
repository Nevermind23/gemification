package com.google.firebase.perf.config;

/* renamed from: com.google.firebase.perf.config.k */
public final class C5391k extends C5402v {

    /* renamed from: a */
    private static C5391k f17195a;

    protected C5391k() {
    }

    /* renamed from: e */
    protected static synchronized C5391k m21342e() {
        C5391k kVar;
        synchronized (C5391k.class) {
            if (f17195a == null) {
                f17195a = new C5391k();
            }
            kVar = f17195a;
        }
        return kVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo17735a() {
        return "com.google.firebase.perf.SdkDisabledVersions";
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo17736c() {
        return "fpr_disabled_android_versions";
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public String mo17744d() {
        return "";
    }
}
