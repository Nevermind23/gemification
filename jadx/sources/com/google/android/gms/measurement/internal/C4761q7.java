package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.C4224i1;
import p248s7.C8252f;

/* renamed from: com.google.android.gms.measurement.internal.q7 */
final class C4761q7 implements Runnable {

    /* renamed from: d */
    final /* synthetic */ zzaw f14795d;

    /* renamed from: e */
    final /* synthetic */ String f14796e;

    /* renamed from: f */
    final /* synthetic */ C4224i1 f14797f;

    /* renamed from: g */
    final /* synthetic */ C4641f8 f14798g;

    C4761q7(C4641f8 f8Var, zzaw zzaw, String str, C4224i1 i1Var) {
        this.f14798g = f8Var;
        this.f14795d = zzaw;
        this.f14796e = str;
        this.f14797f = i1Var;
    }

    public final void run() {
        C4791t4 t4Var;
        byte[] bArr = null;
        try {
            C4641f8 f8Var = this.f14798g;
            C8252f H = f8Var.f14433d;
            if (H == null) {
                f8Var.f14613a.mo14551d().mo14675r().mo14615a("Discarding data. Failed to send event to service to bundle");
                t4Var = this.f14798g.f14613a;
            } else {
                bArr = H.mo14433t1(this.f14795d, this.f14796e);
                this.f14798g.m17687E();
                t4Var = this.f14798g.f14613a;
            }
        } catch (RemoteException e) {
            this.f14798g.f14613a.mo14551d().mo14675r().mo14616b("Failed to send event to the service to bundle", e);
            t4Var = this.f14798g.f14613a;
        } catch (Throwable th) {
            this.f14798g.f14613a.mo14856N().mo14800H(this.f14797f, bArr);
            throw th;
        }
        t4Var.mo14856N().mo14800H(this.f14797f, bArr);
    }
}
