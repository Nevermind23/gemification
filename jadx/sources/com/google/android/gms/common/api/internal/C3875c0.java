package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C3847a;
import java.util.Collections;
import p156l6.C6964r;

/* renamed from: com.google.android.gms.common.api.internal.c0 */
public final class C3875c0 implements C6964r {

    /* renamed from: a */
    private final C3900j0 f12371a;

    public C3875c0(C3900j0 j0Var) {
        this.f12371a = j0Var;
    }

    /* renamed from: a */
    public final void mo12013a(Bundle bundle) {
    }

    /* renamed from: b */
    public final void mo12014b() {
        for (C3847a.C3855f b : this.f12371a.f12460g.values()) {
            b.mo11918b();
        }
        this.f12371a.f12468o.f12415p = Collections.emptySet();
    }

    /* renamed from: c */
    public final void mo12015c() {
        this.f12371a.mo12103l();
    }

    /* renamed from: d */
    public final void mo12016d(ConnectionResult connectionResult, C3847a aVar, boolean z) {
    }

    /* renamed from: e */
    public final void mo12017e(int i) {
    }

    /* renamed from: f */
    public final boolean mo12018f() {
        return true;
    }

    /* renamed from: g */
    public final C3871b mo12019g(C3871b bVar) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }
}
