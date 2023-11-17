package com.google.firebase.perf.config;

/* renamed from: com.google.firebase.perf.config.o */
public final class C5395o extends C5402v {

    /* renamed from: a */
    private static C5395o f17199a;

    private C5395o() {
    }

    /* renamed from: e */
    public static synchronized C5395o m21360e() {
        C5395o oVar;
        synchronized (C5395o.class) {
            if (f17199a == null) {
                f17199a = new C5395o();
            }
            oVar = f17199a;
        }
        return oVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo17735a() {
        return "com.google.firebase.perf.SessionsMaxDurationMinutes";
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public String mo17733b() {
        return "sessions_max_length_minutes";
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo17736c() {
        return "fpr_session_max_duration_min";
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public Long mo17748d() {
        return 240L;
    }
}
