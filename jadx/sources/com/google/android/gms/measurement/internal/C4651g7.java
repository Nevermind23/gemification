package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.C4224i1;
import java.util.List;
import p182n6.C7264i;
import p248s7.C8252f;

/* renamed from: com.google.android.gms.measurement.internal.g7 */
final class C4651g7 implements Runnable {

    /* renamed from: d */
    final /* synthetic */ String f14452d;

    /* renamed from: e */
    final /* synthetic */ String f14453e;

    /* renamed from: f */
    final /* synthetic */ zzq f14454f;

    /* renamed from: g */
    final /* synthetic */ boolean f14455g;

    /* renamed from: h */
    final /* synthetic */ C4224i1 f14456h;

    /* renamed from: i */
    final /* synthetic */ C4641f8 f14457i;

    C4651g7(C4641f8 f8Var, String str, String str2, zzq zzq, boolean z, C4224i1 i1Var) {
        this.f14457i = f8Var;
        this.f14452d = str;
        this.f14453e = str2;
        this.f14454f = zzq;
        this.f14455g = z;
        this.f14456h = i1Var;
    }

    public final void run() {
        Throwable th;
        Bundle bundle;
        RemoteException e;
        Bundle bundle2 = new Bundle();
        try {
            C4641f8 f8Var = this.f14457i;
            C8252f H = f8Var.f14433d;
            if (H == null) {
                f8Var.f14613a.mo14551d().mo14675r().mo14617c("Failed to get user properties; not connected to service", this.f14452d, this.f14453e);
                this.f14457i.f14613a.mo14856N().mo14799G(this.f14456h, bundle2);
                return;
            }
            C7264i.m27902k(this.f14454f);
            List<zzlj> I0 = H.mo14424I0(this.f14452d, this.f14453e, this.f14455g, this.f14454f);
            bundle = new Bundle();
            if (I0 != null) {
                for (zzlj zzlj : I0) {
                    String str = zzlj.f15111h;
                    if (str != null) {
                        bundle.putString(zzlj.f15108e, str);
                    } else {
                        Long l = zzlj.f15110g;
                        if (l != null) {
                            bundle.putLong(zzlj.f15108e, l.longValue());
                        } else {
                            Double d = zzlj.f15113j;
                            if (d != null) {
                                bundle.putDouble(zzlj.f15108e, d.doubleValue());
                            }
                        }
                    }
                }
            }
            try {
                this.f14457i.m17687E();
                this.f14457i.f14613a.mo14856N().mo14799G(this.f14456h, bundle);
            } catch (RemoteException e2) {
                e = e2;
                try {
                    this.f14457i.f14613a.mo14551d().mo14675r().mo14617c("Failed to get user properties; remote exception", this.f14452d, e);
                    this.f14457i.f14613a.mo14856N().mo14799G(this.f14456h, bundle);
                } catch (Throwable th2) {
                    th = th2;
                    bundle2 = bundle;
                    this.f14457i.f14613a.mo14856N().mo14799G(this.f14456h, bundle2);
                    throw th;
                }
            }
        } catch (RemoteException e3) {
            bundle = bundle2;
            e = e3;
            this.f14457i.f14613a.mo14551d().mo14675r().mo14617c("Failed to get user properties; remote exception", this.f14452d, e);
            this.f14457i.f14613a.mo14856N().mo14799G(this.f14456h, bundle);
        } catch (Throwable th3) {
            th = th3;
            this.f14457i.f14613a.mo14856N().mo14799G(this.f14456h, bundle2);
            throw th;
        }
    }
}
