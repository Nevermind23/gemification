package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.C4224i1;
import java.util.ArrayList;
import p182n6.C7264i;
import p248s7.C8252f;

/* renamed from: com.google.android.gms.measurement.internal.x7 */
final class C4838x7 implements Runnable {

    /* renamed from: d */
    final /* synthetic */ String f15015d;

    /* renamed from: e */
    final /* synthetic */ String f15016e;

    /* renamed from: f */
    final /* synthetic */ zzq f15017f;

    /* renamed from: g */
    final /* synthetic */ C4224i1 f15018g;

    /* renamed from: h */
    final /* synthetic */ C4641f8 f15019h;

    C4838x7(C4641f8 f8Var, String str, String str2, zzq zzq, C4224i1 i1Var) {
        this.f15019h = f8Var;
        this.f15015d = str;
        this.f15016e = str2;
        this.f15017f = zzq;
        this.f15018g = i1Var;
    }

    public final void run() {
        C4791t4 t4Var;
        ArrayList arrayList = new ArrayList();
        try {
            C4641f8 f8Var = this.f15019h;
            C8252f H = f8Var.f14433d;
            if (H == null) {
                f8Var.f14613a.mo14551d().mo14675r().mo14617c("Failed to get conditional properties; not connected to service", this.f15015d, this.f15016e);
                t4Var = this.f15019h.f14613a;
            } else {
                C7264i.m27902k(this.f15017f);
                arrayList = C4785s9.m18232v(H.mo14426W1(this.f15015d, this.f15016e, this.f15017f));
                this.f15019h.m17687E();
                t4Var = this.f15019h.f14613a;
            }
        } catch (RemoteException e) {
            this.f15019h.f14613a.mo14551d().mo14675r().mo14618d("Failed to get conditional properties; remote exception", this.f15015d, this.f15016e, e);
            t4Var = this.f15019h.f14613a;
        } catch (Throwable th) {
            this.f15019h.f14613a.mo14856N().mo14798F(this.f15018g, arrayList);
            throw th;
        }
        t4Var.mo14856N().mo14798F(this.f15018g, arrayList);
    }
}
