package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* renamed from: com.google.android.gms.measurement.internal.z6 */
final class C4859z6 implements Runnable {

    /* renamed from: d */
    final /* synthetic */ Bundle f15075d;

    /* renamed from: e */
    final /* synthetic */ C4848y6 f15076e;

    /* renamed from: f */
    final /* synthetic */ C4848y6 f15077f;

    /* renamed from: g */
    final /* synthetic */ long f15078g;

    /* renamed from: h */
    final /* synthetic */ C4640f7 f15079h;

    C4859z6(C4640f7 f7Var, Bundle bundle, C4848y6 y6Var, C4848y6 y6Var2, long j) {
        this.f15079h = f7Var;
        this.f15075d = bundle;
        this.f15076e = y6Var;
        this.f15077f = y6Var2;
        this.f15078g = j;
    }

    public final void run() {
        C4640f7.m17672w(this.f15079h, this.f15075d, this.f15076e, this.f15077f, this.f15078g);
    }
}
