package com.google.firebase.perf.config;

/* renamed from: com.google.firebase.perf.config.i */
public final class C5389i extends C5402v {

    /* renamed from: a */
    private static C5389i f17193a;

    private C5389i() {
    }

    /* renamed from: e */
    protected static synchronized C5389i m21334e() {
        C5389i iVar;
        synchronized (C5389i.class) {
            if (f17193a == null) {
                f17193a = new C5389i();
            }
            iVar = f17193a;
        }
        return iVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo17735a() {
        return "com.google.firebase.perf.NetworkRequestSamplingRate";
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo17736c() {
        return "fpr_vc_network_request_sampling_rate";
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public Double mo17742d() {
        return Double.valueOf(1.0d);
    }
}
