package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import p182n6.C7264i;
import p248s7.C8252f;

/* renamed from: com.google.android.gms.measurement.internal.s7 */
final class C4783s7 implements Runnable {

    /* renamed from: d */
    final /* synthetic */ zzq f14855d;

    /* renamed from: e */
    final /* synthetic */ C4641f8 f14856e;

    C4783s7(C4641f8 f8Var, zzq zzq) {
        this.f14856e = f8Var;
        this.f14855d = zzq;
    }

    public final void run() {
        C4641f8 f8Var = this.f14856e;
        C8252f H = f8Var.f14433d;
        if (H == null) {
            f8Var.f14613a.mo14551d().mo14675r().mo14615a("Failed to send measurementEnabled to service");
            return;
        }
        try {
            C7264i.m27902k(this.f14855d);
            H.mo14427i1(this.f14855d);
            this.f14856e.m17687E();
        } catch (RemoteException e) {
            this.f14856e.f14613a.mo14551d().mo14675r().mo14616b("Failed to send measurementEnabled to the service", e);
        }
    }
}
