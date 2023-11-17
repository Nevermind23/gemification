package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import p182n6.C7264i;

/* renamed from: com.google.android.gms.measurement.internal.i9 */
final class C4675i9 implements Runnable {

    /* renamed from: d */
    final /* synthetic */ String f14526d;

    /* renamed from: e */
    final /* synthetic */ String f14527e = "_err";

    /* renamed from: f */
    final /* synthetic */ Bundle f14528f;

    /* renamed from: g */
    final /* synthetic */ C4686j9 f14529g;

    C4675i9(C4686j9 j9Var, String str, String str2, Bundle bundle) {
        this.f14529g = j9Var;
        this.f14526d = str;
        this.f14528f = bundle;
    }

    public final void run() {
        this.f14529g.f14546a.mo14594k((zzaw) C7264i.m27902k(this.f14529g.f14546a.mo14589h0().mo14839y0(this.f14526d, this.f14527e, this.f14528f, "auto", this.f14529g.f14546a.mo14548a().mo23594a(), false, true)), this.f14526d);
    }
}
