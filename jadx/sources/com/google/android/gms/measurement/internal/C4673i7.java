package com.google.android.gms.measurement.internal;

import p182n6.C7264i;
import p248s7.C8252f;

/* renamed from: com.google.android.gms.measurement.internal.i7 */
final class C4673i7 implements Runnable {

    /* renamed from: d */
    final /* synthetic */ zzq f14516d;

    /* renamed from: e */
    final /* synthetic */ boolean f14517e;

    /* renamed from: f */
    final /* synthetic */ zzlj f14518f;

    /* renamed from: g */
    final /* synthetic */ C4641f8 f14519g;

    C4673i7(C4641f8 f8Var, zzq zzq, boolean z, zzlj zzlj) {
        this.f14519g = f8Var;
        this.f14516d = zzq;
        this.f14517e = z;
        this.f14518f = zzlj;
    }

    public final void run() {
        zzlj zzlj;
        C4641f8 f8Var = this.f14519g;
        C8252f H = f8Var.f14433d;
        if (H == null) {
            f8Var.f14613a.mo14551d().mo14675r().mo14615a("Discarding data. Failed to set user property");
            return;
        }
        C7264i.m27902k(this.f14516d);
        C4641f8 f8Var2 = this.f14519g;
        if (this.f14517e) {
            zzlj = null;
        } else {
            zzlj = this.f14518f;
        }
        f8Var2.mo14388r(H, zzlj, this.f14516d);
        this.f14519g.m17687E();
    }
}
