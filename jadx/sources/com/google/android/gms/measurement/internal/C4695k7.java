package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;
import p182n6.C7264i;
import p248s7.C8243a;
import p248s7.C8252f;

/* renamed from: com.google.android.gms.measurement.internal.k7 */
final class C4695k7 implements Runnable {

    /* renamed from: d */
    final /* synthetic */ AtomicReference f14572d;

    /* renamed from: e */
    final /* synthetic */ zzq f14573e;

    /* renamed from: f */
    final /* synthetic */ C4641f8 f14574f;

    C4695k7(C4641f8 f8Var, AtomicReference atomicReference, zzq zzq) {
        this.f14574f = f8Var;
        this.f14572d = atomicReference;
        this.f14573e = zzq;
    }

    public final void run() {
        AtomicReference atomicReference;
        synchronized (this.f14572d) {
            try {
                if (!this.f14574f.f14613a.mo14849F().mo14332q().mo23435i(C8243a.ANALYTICS_STORAGE)) {
                    this.f14574f.f14613a.mo14551d().mo14681x().mo14615a("Analytics storage consent denied; will not get app instance id");
                    this.f14574f.f14613a.mo14851I().mo14880C((String) null);
                    this.f14574f.f14613a.mo14849F().f14263g.mo14320b((String) null);
                    this.f14572d.set((Object) null);
                    this.f14572d.notify();
                    return;
                }
                C4641f8 f8Var = this.f14574f;
                C8252f H = f8Var.f14433d;
                if (H == null) {
                    f8Var.f14613a.mo14551d().mo14675r().mo14615a("Failed to get app instance id");
                    this.f14572d.notify();
                    return;
                }
                C7264i.m27902k(this.f14573e);
                this.f14572d.set(H.mo14435w1(this.f14573e));
                String str = (String) this.f14572d.get();
                if (str != null) {
                    this.f14574f.f14613a.mo14851I().mo14880C(str);
                    this.f14574f.f14613a.mo14849F().f14263g.mo14320b(str);
                }
                this.f14574f.m17687E();
                atomicReference = this.f14572d;
                atomicReference.notify();
            } catch (RemoteException e) {
                try {
                    this.f14574f.f14613a.mo14551d().mo14675r().mo14616b("Failed to get app instance id", e);
                    atomicReference = this.f14572d;
                } catch (Throwable th) {
                    this.f14572d.notify();
                    throw th;
                }
            }
        }
    }
}
