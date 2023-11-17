package com.google.firebase.perf.config;

/* renamed from: com.google.firebase.perf.config.h */
public final class C5388h extends C5402v {

    /* renamed from: a */
    private static C5388h f17192a;

    private C5388h() {
    }

    /* renamed from: e */
    public static synchronized C5388h m21330e() {
        C5388h hVar;
        synchronized (C5388h.class) {
            if (f17192a == null) {
                f17192a = new C5388h();
            }
            hVar = f17192a;
        }
        return hVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo17735a() {
        return "com.google.firebase.perf.NetworkEventCountForeground";
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo17736c() {
        return "fpr_rl_network_event_count_fg";
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public Long mo17741d() {
        return 700L;
    }
}
