package com.google.android.gms.measurement.internal;

import p182n6.C7264i;
import p248s7.C8252f;

/* renamed from: com.google.android.gms.measurement.internal.v7 */
final class C4816v7 implements Runnable {

    /* renamed from: d */
    final /* synthetic */ zzq f14970d;

    /* renamed from: e */
    final /* synthetic */ boolean f14971e;

    /* renamed from: f */
    final /* synthetic */ zzac f14972f;

    /* renamed from: g */
    final /* synthetic */ zzac f14973g;

    /* renamed from: h */
    final /* synthetic */ C4641f8 f14974h;

    C4816v7(C4641f8 f8Var, boolean z, zzq zzq, boolean z2, zzac zzac, zzac zzac2) {
        this.f14974h = f8Var;
        this.f14970d = zzq;
        this.f14971e = z2;
        this.f14972f = zzac;
        this.f14973g = zzac2;
    }

    public final void run() {
        zzac zzac;
        C4641f8 f8Var = this.f14974h;
        C8252f H = f8Var.f14433d;
        if (H == null) {
            f8Var.f14613a.mo14551d().mo14675r().mo14615a("Discarding data. Failed to send conditional user property to service");
            return;
        }
        C7264i.m27902k(this.f14970d);
        C4641f8 f8Var2 = this.f14974h;
        if (this.f14971e) {
            zzac = null;
        } else {
            zzac = this.f14972f;
        }
        f8Var2.mo14388r(H, zzac, this.f14970d);
        this.f14974h.m17687E();
    }
}
