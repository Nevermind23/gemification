package com.google.android.gms.auth.api.signin.internal;

import android.os.Bundle;
import androidx.loader.app.C1647a;
import com.google.android.gms.common.api.C3860c;
import p091g6.C6232e;
import p091g6.C6249v;
import p176n0.C7188b;

/* renamed from: com.google.android.gms.auth.api.signin.internal.b */
final class C3829b implements C1647a.C1648a {

    /* renamed from: a */
    final /* synthetic */ SignInHubActivity f12202a;

    /* synthetic */ C3829b(SignInHubActivity signInHubActivity, C6249v vVar) {
        this.f12202a = signInHubActivity;
    }

    /* renamed from: a */
    public final void mo4964a(C7188b bVar) {
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo4965b(C7188b bVar, Object obj) {
        Void voidR = (Void) obj;
        SignInHubActivity signInHubActivity = this.f12202a;
        signInHubActivity.setResult(signInHubActivity.f12200q, signInHubActivity.f12201r);
        this.f12202a.finish();
    }

    /* renamed from: c */
    public final C7188b mo4966c(int i, Bundle bundle) {
        return new C6232e(this.f12202a, C3860c.m14546h());
    }
}
