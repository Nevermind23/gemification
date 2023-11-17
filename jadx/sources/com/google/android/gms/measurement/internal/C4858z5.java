package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.z5 */
final class C4858z5 implements Runnable {

    /* renamed from: d */
    final /* synthetic */ String f15070d;

    /* renamed from: e */
    final /* synthetic */ String f15071e;

    /* renamed from: f */
    final /* synthetic */ Object f15072f;

    /* renamed from: g */
    final /* synthetic */ long f15073g;

    /* renamed from: h */
    final /* synthetic */ C4793t6 f15074h;

    C4858z5(C4793t6 t6Var, String str, String str2, Object obj, long j) {
        this.f15074h = t6Var;
        this.f15070d = str;
        this.f15071e = str2;
        this.f15072f = obj;
        this.f15073g = j;
    }

    public final void run() {
        this.f15074h.mo14890M(this.f15070d, this.f15071e, this.f15072f, this.f15073g);
    }
}
