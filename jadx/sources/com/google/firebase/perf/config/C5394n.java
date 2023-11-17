package com.google.firebase.perf.config;

/* renamed from: com.google.firebase.perf.config.n */
public final class C5394n extends C5402v {

    /* renamed from: a */
    private static C5394n f17198a;

    private C5394n() {
    }

    /* renamed from: e */
    public static synchronized C5394n m21355e() {
        C5394n nVar;
        synchronized (C5394n.class) {
            if (f17198a == null) {
                f17198a = new C5394n();
            }
            nVar = f17198a;
        }
        return nVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo17735a() {
        return "com.google.firebase.perf.SessionsCpuCaptureFrequencyForegroundMs";
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public String mo17733b() {
        return "sessions_cpu_capture_frequency_fg_ms";
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo17736c() {
        return "fpr_session_gauge_cpu_capture_frequency_fg_ms";
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public Long mo17747d() {
        return 100L;
    }
}
