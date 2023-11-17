package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.v4 */
final class C4813v4 implements Runnable {

    /* renamed from: d */
    final /* synthetic */ zzac f14962d;

    /* renamed from: e */
    final /* synthetic */ zzq f14963e;

    /* renamed from: f */
    final /* synthetic */ C4704l5 f14964f;

    C4813v4(C4704l5 l5Var, zzac zzac, zzq zzq) {
        this.f14964f = l5Var;
        this.f14962d = zzac;
        this.f14963e = zzq;
    }

    public final void run() {
        this.f14964f.f14588b.mo14584e();
        if (this.f14962d.f15093f.mo14994v() == null) {
            this.f14964f.f14588b.mo14604t(this.f14962d, this.f14963e);
        } else {
            this.f14964f.f14588b.mo14610z(this.f14962d, this.f14963e);
        }
    }
}
