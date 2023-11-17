package com.google.android.gms.common.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: com.google.android.gms.common.internal.s */
public final class C3981s extends C3973k {

    /* renamed from: g */
    final /* synthetic */ C3958b f12702g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3981s(C3958b bVar, int i, Bundle bundle) {
        super(bVar, i, (Bundle) null);
        this.f12702g = bVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo12272f(ConnectionResult connectionResult) {
        if (!this.f12702g.mo12254y() || !C3958b.m15021m0(this.f12702g)) {
            this.f12702g.f12666p.mo12147a(connectionResult);
            this.f12702g.mo12229Q(connectionResult);
            return;
        }
        C3958b.m15018i0(this.f12702g, 16);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final boolean mo12273g() {
        this.f12702g.f12666p.mo12147a(ConnectionResult.f12230h);
        return true;
    }
}
