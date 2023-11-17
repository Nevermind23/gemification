package com.google.firebase.perf.config;

/* renamed from: com.google.firebase.perf.config.q */
public final class C5397q extends C5402v {

    /* renamed from: a */
    private static C5397q f17201a;

    private C5397q() {
    }

    /* renamed from: e */
    public static synchronized C5397q m21370e() {
        C5397q qVar;
        synchronized (C5397q.class) {
            if (f17201a == null) {
                f17201a = new C5397q();
            }
            qVar = f17201a;
        }
        return qVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo17735a() {
        return "com.google.firebase.perf.SessionsMemoryCaptureFrequencyForegroundMs";
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public String mo17733b() {
        return "sessions_memory_capture_frequency_fg_ms";
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo17736c() {
        return "fpr_session_gauge_memory_capture_frequency_fg_ms";
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public Long mo17750d() {
        return 100L;
    }
}
