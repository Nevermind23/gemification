package com.google.android.gms.measurement.internal;

import p182n6.C7264i;
import p248s7.C8252f;

/* renamed from: com.google.android.gms.measurement.internal.u7 */
final class C4805u7 implements Runnable {

    /* renamed from: d */
    final /* synthetic */ zzq f14948d;

    /* renamed from: e */
    final /* synthetic */ boolean f14949e;

    /* renamed from: f */
    final /* synthetic */ zzaw f14950f;

    /* renamed from: g */
    final /* synthetic */ String f14951g;

    /* renamed from: h */
    final /* synthetic */ C4641f8 f14952h;

    C4805u7(C4641f8 f8Var, boolean z, zzq zzq, boolean z2, zzaw zzaw, String str) {
        this.f14952h = f8Var;
        this.f14948d = zzq;
        this.f14949e = z2;
        this.f14950f = zzaw;
        this.f14951g = str;
    }

    public final void run() {
        zzaw zzaw;
        C4641f8 f8Var = this.f14952h;
        C8252f H = f8Var.f14433d;
        if (H == null) {
            f8Var.f14613a.mo14551d().mo14675r().mo14615a("Discarding data. Failed to send event to service");
            return;
        }
        C7264i.m27902k(this.f14948d);
        C4641f8 f8Var2 = this.f14952h;
        if (this.f14949e) {
            zzaw = null;
        } else {
            zzaw = this.f14950f;
        }
        f8Var2.mo14388r(H, zzaw, this.f14948d);
        this.f14952h.m17687E();
    }
}
