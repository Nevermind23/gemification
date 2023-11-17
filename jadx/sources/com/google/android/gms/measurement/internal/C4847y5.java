package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* renamed from: com.google.android.gms.measurement.internal.y5 */
final class C4847y5 implements Runnable {

    /* renamed from: d */
    final /* synthetic */ String f15033d;

    /* renamed from: e */
    final /* synthetic */ String f15034e;

    /* renamed from: f */
    final /* synthetic */ long f15035f;

    /* renamed from: g */
    final /* synthetic */ Bundle f15036g;

    /* renamed from: h */
    final /* synthetic */ boolean f15037h;

    /* renamed from: i */
    final /* synthetic */ boolean f15038i;

    /* renamed from: j */
    final /* synthetic */ boolean f15039j;

    /* renamed from: k */
    final /* synthetic */ String f15040k;

    /* renamed from: l */
    final /* synthetic */ C4793t6 f15041l;

    C4847y5(C4793t6 t6Var, String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        this.f15041l = t6Var;
        this.f15033d = str;
        this.f15034e = str2;
        this.f15035f = j;
        this.f15036g = bundle;
        this.f15037h = z;
        this.f15038i = z2;
        this.f15039j = z3;
        this.f15040k = str3;
    }

    public final void run() {
        this.f15041l.mo14912w(this.f15033d, this.f15034e, this.f15035f, this.f15036g, this.f15037h, this.f15038i, this.f15039j, this.f15040k);
    }
}
