package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C3860c;

/* renamed from: com.google.android.gms.common.api.internal.h1 */
final class C3895h1 implements C3860c.C3863c {

    /* renamed from: b */
    public final int f12434b;

    /* renamed from: c */
    public final C3860c f12435c;

    /* renamed from: d */
    public final C3860c.C3863c f12436d;

    /* renamed from: e */
    final /* synthetic */ C3898i1 f12437e;

    public C3895h1(C3898i1 i1Var, int i, C3860c cVar, C3860c.C3863c cVar2) {
        this.f12437e = i1Var;
        this.f12434b = i;
        this.f12435c = cVar;
        this.f12436d = cVar2;
    }

    /* renamed from: y */
    public final void mo12084y(ConnectionResult connectionResult) {
        Log.d("AutoManageHelper", "beginFailureResolution for ".concat(String.valueOf(connectionResult)));
        this.f12437e.mo12121s(connectionResult, this.f12434b);
    }
}
