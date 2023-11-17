package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import p182n6.C7264i;
import p248s7.C8252f;

/* renamed from: com.google.android.gms.measurement.internal.j7 */
final class C4684j7 implements Runnable {

    /* renamed from: d */
    final /* synthetic */ zzq f14541d;

    /* renamed from: e */
    final /* synthetic */ C4641f8 f14542e;

    C4684j7(C4641f8 f8Var, zzq zzq) {
        this.f14542e = f8Var;
        this.f14541d = zzq;
    }

    public final void run() {
        C4641f8 f8Var = this.f14542e;
        C8252f H = f8Var.f14433d;
        if (H == null) {
            f8Var.f14613a.mo14551d().mo14675r().mo14615a("Failed to reset data on the service: not connected to service");
            return;
        }
        try {
            C7264i.m27902k(this.f14541d);
            H.mo14425N0(this.f14541d);
        } catch (RemoteException e) {
            this.f14542e.f14613a.mo14551d().mo14675r().mo14616b("Failed to reset data on the service: remote exception", e);
        }
        this.f14542e.m17687E();
    }
}
