package com.google.firebase.perf.config;

/* renamed from: com.google.firebase.perf.config.u */
public final class C5401u extends C5402v {

    /* renamed from: a */
    private static C5401u f17205a;

    private C5401u() {
    }

    /* renamed from: e */
    protected static synchronized C5401u m21388e() {
        C5401u uVar;
        synchronized (C5401u.class) {
            if (f17205a == null) {
                f17205a = new C5401u();
            }
            uVar = f17205a;
        }
        return uVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo17735a() {
        return "com.google.firebase.perf.TraceSamplingRate";
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo17736c() {
        return "fpr_vc_trace_sampling_rate";
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public Double mo17754d() {
        return Double.valueOf(1.0d);
    }
}
