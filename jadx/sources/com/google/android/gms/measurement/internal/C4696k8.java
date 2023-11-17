package com.google.android.gms.measurement.internal;

import android.content.Intent;

/* renamed from: com.google.android.gms.measurement.internal.k8 */
public final /* synthetic */ class C4696k8 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C4718m8 f14575d;

    /* renamed from: e */
    public final /* synthetic */ int f14576e;

    /* renamed from: f */
    public final /* synthetic */ C4746p3 f14577f;

    /* renamed from: g */
    public final /* synthetic */ Intent f14578g;

    public /* synthetic */ C4696k8(C4718m8 m8Var, int i, C4746p3 p3Var, Intent intent) {
        this.f14575d = m8Var;
        this.f14576e = i;
        this.f14577f = p3Var;
        this.f14578g = intent;
    }

    public final void run() {
        this.f14575d.mo14559c(this.f14576e, this.f14577f, this.f14578g);
    }
}
