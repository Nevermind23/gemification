package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import p182n6.C7264i;

/* renamed from: com.google.android.gms.common.internal.r */
public final class C3980r extends C3973k {

    /* renamed from: g */
    public final IBinder f12700g;

    /* renamed from: h */
    final /* synthetic */ C3958b f12701h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3980r(C3958b bVar, int i, IBinder iBinder, Bundle bundle) {
        super(bVar, i, bundle);
        this.f12701h = bVar;
        this.f12700g = iBinder;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo12272f(ConnectionResult connectionResult) {
        if (this.f12701h.f12672v != null) {
            this.f12701h.f12672v.mo12258y(connectionResult);
        }
        this.f12701h.mo12229Q(connectionResult);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final boolean mo12273g() {
        try {
            IBinder iBinder = this.f12700g;
            C7264i.m27902k(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            if (!this.f12701h.mo7049J().equals(interfaceDescriptor)) {
                String J = this.f12701h.mo7049J();
                Log.w("GmsClient", "service descriptor mismatch: " + J + " vs. " + interfaceDescriptor);
                return false;
            }
            IInterface x = this.f12701h.mo7054x(this.f12700g);
            if (x == null || (!C3958b.m15020l0(this.f12701h, 2, 4, x) && !C3958b.m15020l0(this.f12701h, 3, 4, x))) {
                return false;
            }
            this.f12701h.f12676z = null;
            Bundle C = this.f12701h.mo12218C();
            C3958b bVar = this.f12701h;
            if (bVar.f12671u == null) {
                return true;
            }
            bVar.f12671u.mo12256k(C);
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}
