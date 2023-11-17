package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p182n6.C7264i;
import p248s7.C8252f;

/* renamed from: com.google.android.gms.measurement.internal.m7 */
final class C4717m7 implements Runnable {

    /* renamed from: d */
    final /* synthetic */ zzq f14616d;

    /* renamed from: e */
    final /* synthetic */ C4641f8 f14617e;

    C4717m7(C4641f8 f8Var, zzq zzq) {
        this.f14617e = f8Var;
        this.f14616d = zzq;
    }

    public final void run() {
        C4641f8 f8Var = this.f14617e;
        C8252f H = f8Var.f14433d;
        if (H == null) {
            f8Var.f14613a.mo14551d().mo14675r().mo14615a("Discarding data. Failed to send app launch");
            return;
        }
        try {
            C7264i.m27902k(this.f14616d);
            H.mo14431q0(this.f14616d);
            this.f14617e.f14613a.mo14846C().mo14480t();
            this.f14617e.mo14388r(H, (AbstractSafeParcelable) null, this.f14616d);
            this.f14617e.m17687E();
        } catch (RemoteException e) {
            this.f14617e.f14613a.mo14551d().mo14675r().mo14616b("Failed to send app launch to the service", e);
        }
    }
}
