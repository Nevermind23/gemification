package com.google.firebase.perf.config;

/* renamed from: com.google.firebase.perf.config.s */
public final class C5399s extends C5402v {

    /* renamed from: a */
    private static C5399s f17203a;

    private C5399s() {
    }

    /* renamed from: e */
    public static synchronized C5399s m21380e() {
        C5399s sVar;
        synchronized (C5399s.class) {
            if (f17203a == null) {
                f17203a = new C5399s();
            }
            sVar = f17203a;
        }
        return sVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo17735a() {
        return "com.google.firebase.perf.TraceEventCountBackground";
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo17736c() {
        return "fpr_rl_trace_event_count_bg";
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public Long mo17752d() {
        return 30L;
    }
}
