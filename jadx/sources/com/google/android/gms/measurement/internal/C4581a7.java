package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* renamed from: com.google.android.gms.measurement.internal.a7 */
final class C4581a7 implements Runnable {

    /* renamed from: d */
    final /* synthetic */ C4848y6 f14197d;

    /* renamed from: e */
    final /* synthetic */ C4848y6 f14198e;

    /* renamed from: f */
    final /* synthetic */ long f14199f;

    /* renamed from: g */
    final /* synthetic */ boolean f14200g;

    /* renamed from: h */
    final /* synthetic */ C4640f7 f14201h;

    C4581a7(C4640f7 f7Var, C4848y6 y6Var, C4848y6 y6Var2, long j, boolean z) {
        this.f14201h = f7Var;
        this.f14197d = y6Var;
        this.f14198e = y6Var2;
        this.f14199f = j;
        this.f14200g = z;
    }

    public final void run() {
        this.f14201h.m17667o(this.f14197d, this.f14198e, this.f14199f, this.f14200g, (Bundle) null);
    }
}
