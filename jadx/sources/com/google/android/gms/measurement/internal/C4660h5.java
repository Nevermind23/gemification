package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.h5 */
final class C4660h5 implements Runnable {

    /* renamed from: d */
    final /* synthetic */ zzlj f14486d;

    /* renamed from: e */
    final /* synthetic */ zzq f14487e;

    /* renamed from: f */
    final /* synthetic */ C4704l5 f14488f;

    C4660h5(C4704l5 l5Var, zzlj zzlj, zzq zzq) {
        this.f14488f = l5Var;
        this.f14486d = zzlj;
        this.f14487e = zzq;
    }

    public final void run() {
        this.f14488f.f14588b.mo14584e();
        if (this.f14486d.mo14994v() == null) {
            this.f14488f.f14588b.mo14605u(this.f14486d.f15108e, this.f14487e);
        } else {
            this.f14488f.f14588b.mo14568B(this.f14486d, this.f14487e);
        }
    }
}
