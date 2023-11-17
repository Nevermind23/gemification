package com.google.firebase.perf.config;

/* renamed from: com.google.firebase.perf.config.j */
public final class C5390j extends C5402v {

    /* renamed from: a */
    private static C5390j f17194a;

    private C5390j() {
    }

    /* renamed from: e */
    public static synchronized C5390j m21338e() {
        C5390j jVar;
        synchronized (C5390j.class) {
            if (f17194a == null) {
                f17194a = new C5390j();
            }
            jVar = f17194a;
        }
        return jVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo17735a() {
        return "com.google.firebase.perf.TimeLimitSec";
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo17736c() {
        return "fpr_rl_time_limit_sec";
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public Long mo17743d() {
        return 600L;
    }
}
