package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.m */
final class C4709m implements Runnable {

    /* renamed from: d */
    final /* synthetic */ C4737o5 f14600d;

    /* renamed from: e */
    final /* synthetic */ C4720n f14601e;

    C4709m(C4720n nVar, C4737o5 o5Var) {
        this.f14601e = nVar;
        this.f14600d = o5Var;
    }

    public final void run() {
        this.f14600d.mo14549b();
        if (C4597c.m17607a()) {
            this.f14600d.mo14552f().mo14776z(this);
            return;
        }
        boolean e = this.f14601e.mo14614e();
        this.f14601e.f14654c = 0;
        if (e) {
            this.f14601e.mo14612c();
        }
    }
}
