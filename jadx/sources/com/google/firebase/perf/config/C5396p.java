package com.google.firebase.perf.config;

/* renamed from: com.google.firebase.perf.config.p */
public final class C5396p extends C5402v {

    /* renamed from: a */
    private static C5396p f17200a;

    private C5396p() {
    }

    /* renamed from: e */
    public static synchronized C5396p m21365e() {
        C5396p pVar;
        synchronized (C5396p.class) {
            if (f17200a == null) {
                f17200a = new C5396p();
            }
            pVar = f17200a;
        }
        return pVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo17735a() {
        return "com.google.firebase.perf.SessionsMemoryCaptureFrequencyBackgroundMs";
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public String mo17733b() {
        return "sessions_memory_capture_frequency_bg_ms";
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo17736c() {
        return "fpr_session_gauge_memory_capture_frequency_bg_ms";
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public Long mo17749d() {
        return 0L;
    }
}
