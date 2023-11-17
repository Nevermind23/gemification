package com.google.firebase.perf.config;

/* renamed from: com.google.firebase.perf.config.g */
public final class C5387g extends C5402v {

    /* renamed from: a */
    private static C5387g f17191a;

    private C5387g() {
    }

    /* renamed from: e */
    public static synchronized C5387g m21326e() {
        C5387g gVar;
        synchronized (C5387g.class) {
            if (f17191a == null) {
                f17191a = new C5387g();
            }
            gVar = f17191a;
        }
        return gVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo17735a() {
        return "com.google.firebase.perf.NetworkEventCountBackground";
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo17736c() {
        return "fpr_rl_network_event_count_bg";
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public Long mo17740d() {
        return 70L;
    }
}
