package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import p248s7.C8252f;

/* renamed from: com.google.android.gms.measurement.internal.n7 */
final class C4728n7 implements Runnable {

    /* renamed from: d */
    final /* synthetic */ C4848y6 f14676d;

    /* renamed from: e */
    final /* synthetic */ C4641f8 f14677e;

    C4728n7(C4641f8 f8Var, C4848y6 y6Var) {
        this.f14677e = f8Var;
        this.f14676d = y6Var;
    }

    public final void run() {
        C4641f8 f8Var = this.f14677e;
        C8252f H = f8Var.f14433d;
        if (H == null) {
            f8Var.f14613a.mo14551d().mo14675r().mo14615a("Failed to send current screen to service");
            return;
        }
        try {
            C4848y6 y6Var = this.f14676d;
            if (y6Var == null) {
                H.mo14434v0(0, (String) null, (String) null, f8Var.f14613a.mo14550c().getPackageName());
            } else {
                H.mo14434v0(y6Var.f15044c, y6Var.f15042a, y6Var.f15043b, f8Var.f14613a.mo14550c().getPackageName());
            }
            this.f14677e.m17687E();
        } catch (RemoteException e) {
            this.f14677e.f14613a.mo14551d().mo14675r().mo14616b("Failed to send current screen to the service", e);
        }
    }
}
