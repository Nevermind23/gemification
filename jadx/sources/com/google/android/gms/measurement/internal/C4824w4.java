package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.w4 */
final class C4824w4 implements Runnable {

    /* renamed from: d */
    final /* synthetic */ zzac f14988d;

    /* renamed from: e */
    final /* synthetic */ C4704l5 f14989e;

    C4824w4(C4704l5 l5Var, zzac zzac) {
        this.f14989e = l5Var;
        this.f14988d = zzac;
    }

    public final void run() {
        this.f14989e.f14588b.mo14584e();
        if (this.f14988d.f15093f.mo14994v() == null) {
            this.f14989e.f14588b.mo14603s(this.f14988d);
        } else {
            this.f14989e.f14588b.mo14609y(this.f14988d);
        }
    }
}
