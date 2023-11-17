package com.google.android.gms.common.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: com.google.android.gms.common.internal.k */
abstract class C3973k extends C3977o {

    /* renamed from: d */
    public final int f12688d;

    /* renamed from: e */
    public final Bundle f12689e;

    /* renamed from: f */
    final /* synthetic */ C3958b f12690f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected C3973k(C3958b bVar, int i, Bundle bundle) {
        super(bVar, Boolean.TRUE);
        this.f12690f = bVar;
        this.f12688d = i;
        this.f12689e = bundle;
    }

    /* JADX WARNING: type inference failed for: r3v5, types: [android.os.Parcelable] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void mo12270a(java.lang.Object r3) {
        /*
            r2 = this;
            int r3 = r2.f12688d
            r0 = 1
            r1 = 0
            if (r3 != 0) goto L_0x001c
            boolean r3 = r2.mo12273g()
            if (r3 != 0) goto L_0x001b
            com.google.android.gms.common.internal.b r3 = r2.f12690f
            r3.m15022n0(r0, (android.os.IInterface) null)
            com.google.android.gms.common.ConnectionResult r3 = new com.google.android.gms.common.ConnectionResult
            r0 = 8
            r3.<init>(r0, r1)
            r2.mo12272f(r3)
        L_0x001b:
            return
        L_0x001c:
            com.google.android.gms.common.internal.b r3 = r2.f12690f
            r3.m15022n0(r0, (android.os.IInterface) null)
            android.os.Bundle r3 = r2.f12689e
            if (r3 == 0) goto L_0x002e
            java.lang.String r0 = "pendingIntent"
            android.os.Parcelable r3 = r3.getParcelable(r0)
            r1 = r3
            android.app.PendingIntent r1 = (android.app.PendingIntent) r1
        L_0x002e:
            com.google.android.gms.common.ConnectionResult r3 = new com.google.android.gms.common.ConnectionResult
            int r0 = r2.f12688d
            r3.<init>(r0, r1)
            r2.mo12272f(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.C3973k.mo12270a(java.lang.Object):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo12271b() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract void mo12272f(ConnectionResult connectionResult);

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract boolean mo12273g();
}
