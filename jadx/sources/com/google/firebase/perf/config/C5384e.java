package com.google.firebase.perf.config;

import com.github.mikephil.charting.utils.Utils;

/* renamed from: com.google.firebase.perf.config.e */
public final class C5384e extends C5402v {

    /* renamed from: a */
    private static C5384e f17188a;

    private C5384e() {
    }

    /* renamed from: e */
    protected static synchronized C5384e m21315e() {
        C5384e eVar;
        synchronized (C5384e.class) {
            if (f17188a == null) {
                f17188a = new C5384e();
            }
            eVar = f17188a;
        }
        return eVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo17735a() {
        return "com.google.firebase.perf.FragmentSamplingRate";
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public String mo17733b() {
        return "fragment_sampling_percentage";
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo17736c() {
        return "fpr_vc_fragment_sampling_rate";
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public Double mo17738d() {
        return Double.valueOf(Utils.DOUBLE_EPSILON);
    }
}
