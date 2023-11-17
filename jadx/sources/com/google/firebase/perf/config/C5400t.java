package com.google.firebase.perf.config;

/* renamed from: com.google.firebase.perf.config.t */
public final class C5400t extends C5402v {

    /* renamed from: a */
    private static C5400t f17204a;

    private C5400t() {
    }

    /* renamed from: e */
    public static synchronized C5400t m21384e() {
        C5400t tVar;
        synchronized (C5400t.class) {
            if (f17204a == null) {
                f17204a = new C5400t();
            }
            tVar = f17204a;
        }
        return tVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo17735a() {
        return "com.google.firebase.perf.TraceEventCountForeground";
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo17736c() {
        return "fpr_rl_trace_event_count_fg";
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public Long mo17753d() {
        return 300L;
    }
}
