package com.google.firebase.perf.config;

/* renamed from: com.google.firebase.perf.config.m */
public final class C5393m extends C5402v {

    /* renamed from: a */
    private static C5393m f17197a;

    private C5393m() {
    }

    /* renamed from: e */
    public static synchronized C5393m m21350e() {
        C5393m mVar;
        synchronized (C5393m.class) {
            if (f17197a == null) {
                f17197a = new C5393m();
            }
            mVar = f17197a;
        }
        return mVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo17735a() {
        return "com.google.firebase.perf.SessionsCpuCaptureFrequencyBackgroundMs";
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public String mo17733b() {
        return "sessions_cpu_capture_frequency_bg_ms";
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo17736c() {
        return "fpr_session_gauge_cpu_capture_frequency_bg_ms";
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public Long mo17746d() {
        return 0L;
    }
}
