package com.google.firebase.perf.config;

/* renamed from: com.google.firebase.perf.config.d */
public final class C5383d extends C5402v {

    /* renamed from: a */
    private static C5383d f17187a;

    private C5383d() {
    }

    /* renamed from: e */
    protected static synchronized C5383d m21310e() {
        C5383d dVar;
        synchronized (C5383d.class) {
            if (f17187a == null) {
                f17187a = new C5383d();
            }
            dVar = f17187a;
        }
        return dVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo17735a() {
        return "com.google.firebase.perf.ExperimentTTID";
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public String mo17733b() {
        return "experiment_app_start_ttid";
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo17736c() {
        return "fpr_experiment_app_start_ttid";
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public Boolean mo17737d() {
        return Boolean.FALSE;
    }
}
