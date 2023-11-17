package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.f5 */
final class C4638f5 implements Runnable {

    /* renamed from: d */
    final /* synthetic */ zzaw f14414d;

    /* renamed from: e */
    final /* synthetic */ String f14415e;

    /* renamed from: f */
    final /* synthetic */ C4704l5 f14416f;

    C4638f5(C4704l5 l5Var, zzaw zzaw, String str) {
        this.f14416f = l5Var;
        this.f14414d = zzaw;
        this.f14415e = str;
    }

    public final void run() {
        this.f14416f.f14588b.mo14584e();
        this.f14416f.f14588b.mo14594k(this.f14414d, this.f14415e);
    }
}
