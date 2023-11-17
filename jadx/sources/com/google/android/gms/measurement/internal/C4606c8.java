package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;

/* renamed from: com.google.android.gms.measurement.internal.c8 */
final class C4606c8 implements Runnable {

    /* renamed from: d */
    final /* synthetic */ C4630e8 f14247d;

    C4606c8(C4630e8 e8Var) {
        this.f14247d = e8Var;
    }

    public final void run() {
        C4641f8 f8Var = this.f14247d.f14318c;
        Context c = f8Var.f14613a.mo14550c();
        this.f14247d.f14318c.f14613a.mo14549b();
        C4641f8.m17694M(f8Var, new ComponentName(c, "com.google.android.gms.measurement.AppMeasurementService"));
    }
}
