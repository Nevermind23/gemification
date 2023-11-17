package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import p182n6.C7257f0;
import p182n6.C7264i;

/* renamed from: com.google.android.gms.common.internal.p */
public final class C3978p extends C7257f0 {

    /* renamed from: b */
    private C3958b f12696b;

    /* renamed from: c */
    private final int f12697c;

    public C3978p(C3958b bVar, int i) {
        this.f12696b = bVar;
        this.f12697c = i;
    }

    /* renamed from: E1 */
    public final void mo12282E1(int i, Bundle bundle) {
        Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
    }

    /* renamed from: s0 */
    public final void mo12283s0(int i, IBinder iBinder, Bundle bundle) {
        C7264i.m27903l(this.f12696b, "onPostInitComplete can be called only once per call to getRemoteService");
        this.f12696b.mo12231S(i, iBinder, bundle, this.f12697c);
        this.f12696b = null;
    }

    /* renamed from: v2 */
    public final void mo12284v2(int i, IBinder iBinder, zzk zzk) {
        C3958b bVar = this.f12696b;
        C7264i.m27903l(bVar, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
        C7264i.m27902k(zzk);
        C3958b.m15017h0(bVar, zzk);
        mo12283s0(i, iBinder, zzk.f12736d);
    }
}
