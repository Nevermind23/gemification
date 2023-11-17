package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.C4224i1;
import p182n6.C7264i;
import p248s7.C8243a;
import p248s7.C8252f;

/* renamed from: com.google.android.gms.measurement.internal.l7 */
final class C4706l7 implements Runnable {

    /* renamed from: d */
    final /* synthetic */ zzq f14593d;

    /* renamed from: e */
    final /* synthetic */ C4224i1 f14594e;

    /* renamed from: f */
    final /* synthetic */ C4641f8 f14595f;

    C4706l7(C4641f8 f8Var, zzq zzq, C4224i1 i1Var) {
        this.f14595f = f8Var;
        this.f14593d = zzq;
        this.f14594e = i1Var;
    }

    public final void run() {
        C4791t4 t4Var;
        String str = null;
        try {
            if (!this.f14595f.f14613a.mo14849F().mo14332q().mo23435i(C8243a.ANALYTICS_STORAGE)) {
                this.f14595f.f14613a.mo14551d().mo14681x().mo14615a("Analytics storage consent denied; will not get app instance id");
                this.f14595f.f14613a.mo14851I().mo14880C((String) null);
                this.f14595f.f14613a.mo14849F().f14263g.mo14320b((String) null);
                t4Var = this.f14595f.f14613a;
            } else {
                C4641f8 f8Var = this.f14595f;
                C8252f H = f8Var.f14433d;
                if (H == null) {
                    f8Var.f14613a.mo14551d().mo14675r().mo14615a("Failed to get app instance id");
                    t4Var = this.f14595f.f14613a;
                } else {
                    C7264i.m27902k(this.f14593d);
                    str = H.mo14435w1(this.f14593d);
                    if (str != null) {
                        this.f14595f.f14613a.mo14851I().mo14880C(str);
                        this.f14595f.f14613a.mo14849F().f14263g.mo14320b(str);
                    }
                    this.f14595f.m17687E();
                    t4Var = this.f14595f.f14613a;
                }
            }
        } catch (RemoteException e) {
            this.f14595f.f14613a.mo14551d().mo14675r().mo14616b("Failed to get app instance id", e);
            t4Var = this.f14595f.f14613a;
        } catch (Throwable th) {
            this.f14595f.f14613a.mo14856N().mo14803K(this.f14594e, (String) null);
            throw th;
        }
        t4Var.mo14856N().mo14803K(this.f14594e, str);
    }
}
