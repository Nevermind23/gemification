package com.google.firebase.perf.config;

/* renamed from: com.google.firebase.perf.config.r */
public final class C5398r extends C5402v {

    /* renamed from: a */
    private static C5398r f17202a;

    private C5398r() {
    }

    /* renamed from: e */
    public static synchronized C5398r m21375e() {
        C5398r rVar;
        synchronized (C5398r.class) {
            if (f17202a == null) {
                f17202a = new C5398r();
            }
            rVar = f17202a;
        }
        return rVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo17735a() {
        return "com.google.firebase.perf.SessionSamplingRate";
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public String mo17733b() {
        return "sessions_sampling_percentage";
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo17736c() {
        return "fpr_vc_session_sampling_rate";
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public Double mo17751d() {
        return Double.valueOf(0.01d);
    }
}
