package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import p182n6.C7264i;
import p248s7.C8252f;

/* renamed from: com.google.android.gms.measurement.internal.o7 */
final class C4739o7 implements Runnable {

    /* renamed from: d */
    final /* synthetic */ zzq f14699d;

    /* renamed from: e */
    final /* synthetic */ Bundle f14700e;

    /* renamed from: f */
    final /* synthetic */ C4641f8 f14701f;

    C4739o7(C4641f8 f8Var, zzq zzq, Bundle bundle) {
        this.f14701f = f8Var;
        this.f14699d = zzq;
        this.f14700e = bundle;
    }

    public final void run() {
        C4641f8 f8Var = this.f14701f;
        C8252f H = f8Var.f14433d;
        if (H == null) {
            f8Var.f14613a.mo14551d().mo14675r().mo14615a("Failed to send default event parameters to service");
            return;
        }
        try {
            C7264i.m27902k(this.f14699d);
            H.mo14428l1(this.f14700e, this.f14699d);
        } catch (RemoteException e) {
            this.f14701f.f14613a.mo14551d().mo14675r().mo14616b("Failed to send default event parameters to service", e);
        }
    }
}
