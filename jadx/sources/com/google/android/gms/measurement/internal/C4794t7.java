package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import p182n6.C7264i;
import p248s7.C8252f;

/* renamed from: com.google.android.gms.measurement.internal.t7 */
final class C4794t7 implements Runnable {

    /* renamed from: d */
    final /* synthetic */ zzq f14923d;

    /* renamed from: e */
    final /* synthetic */ C4641f8 f14924e;

    C4794t7(C4641f8 f8Var, zzq zzq) {
        this.f14924e = f8Var;
        this.f14923d = zzq;
    }

    public final void run() {
        C4641f8 f8Var = this.f14924e;
        C8252f H = f8Var.f14433d;
        if (H == null) {
            f8Var.f14613a.mo14551d().mo14675r().mo14615a("Failed to send consent settings to service");
            return;
        }
        try {
            C7264i.m27902k(this.f14923d);
            H.mo14422D0(this.f14923d);
            this.f14924e.m17687E();
        } catch (RemoteException e) {
            this.f14924e.f14613a.mo14551d().mo14675r().mo14616b("Failed to send consent settings to the service", e);
        }
    }
}
