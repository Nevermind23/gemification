package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;

/* renamed from: com.google.android.gms.measurement.internal.s5 */
public final /* synthetic */ class C4781s5 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C4793t6 f14851d;

    /* renamed from: e */
    public final /* synthetic */ Bundle f14852e;

    /* renamed from: f */
    public final /* synthetic */ long f14853f;

    public /* synthetic */ C4781s5(C4793t6 t6Var, Bundle bundle, long j) {
        this.f14851d = t6Var;
        this.f14852e = bundle;
        this.f14853f = j;
    }

    public final void run() {
        C4793t6 t6Var = this.f14851d;
        Bundle bundle = this.f14852e;
        long j = this.f14853f;
        if (TextUtils.isEmpty(t6Var.f14613a.mo14845B().mo14447t())) {
            t6Var.mo14883F(bundle, 0, j);
        } else {
            t6Var.f14613a.mo14551d().mo14681x().mo14615a("Using developer consent only; google app id found");
        }
    }
}
