package com.google.android.gms.measurement.internal;

import android.content.ComponentName;

/* renamed from: com.google.android.gms.measurement.internal.a8 */
final class C4582a8 implements Runnable {

    /* renamed from: d */
    final /* synthetic */ ComponentName f14202d;

    /* renamed from: e */
    final /* synthetic */ C4630e8 f14203e;

    C4582a8(C4630e8 e8Var, ComponentName componentName) {
        this.f14203e = e8Var;
        this.f14202d = componentName;
    }

    public final void run() {
        C4641f8.m17694M(this.f14203e.f14318c, this.f14202d);
    }
}
