package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C3847a;
import com.google.android.gms.common.internal.C3958b;
import com.google.android.gms.common.internal.C3966e;
import java.util.Set;
import p156l6.C6931b;
import p156l6.C6947i0;

/* renamed from: com.google.android.gms.common.api.internal.s0 */
final class C3926s0 implements C3958b.C3961c, C6947i0 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C3847a.C3855f f12522a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C6931b f12523b;

    /* renamed from: c */
    private C3966e f12524c = null;

    /* renamed from: d */
    private Set f12525d = null;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public boolean f12526e = false;

    /* renamed from: f */
    final /* synthetic */ C3874c f12527f;

    public C3926s0(C3874c cVar, C3847a.C3855f fVar, C6931b bVar) {
        this.f12527f = cVar;
        this.f12522a = fVar;
        this.f12523b = bVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public final void m14919h() {
        C3966e eVar;
        if (this.f12526e && (eVar = this.f12524c) != null) {
            this.f12522a.mo11927n(eVar, this.f12525d);
        }
    }

    /* renamed from: a */
    public final void mo12147a(ConnectionResult connectionResult) {
        this.f12527f.f12369p.post(new C3924r0(this, connectionResult));
    }

    /* renamed from: b */
    public final void mo12148b(C3966e eVar, Set set) {
        if (eVar == null || set == null) {
            Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
            mo12149c(new ConnectionResult(4));
            return;
        }
        this.f12524c = eVar;
        this.f12525d = set;
        m14919h();
    }

    /* renamed from: c */
    public final void mo12149c(ConnectionResult connectionResult) {
        C3918p0 p0Var = (C3918p0) this.f12527f.f12365l.get(this.f12523b);
        if (p0Var != null) {
            p0Var.mo12132H(connectionResult);
        }
    }
}
