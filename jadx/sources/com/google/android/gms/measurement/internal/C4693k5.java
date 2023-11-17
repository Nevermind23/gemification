package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.k5 */
final class C4693k5 implements Runnable {

    /* renamed from: d */
    final /* synthetic */ String f14565d;

    /* renamed from: e */
    final /* synthetic */ String f14566e;

    /* renamed from: f */
    final /* synthetic */ String f14567f;

    /* renamed from: g */
    final /* synthetic */ long f14568g;

    /* renamed from: h */
    final /* synthetic */ C4704l5 f14569h;

    C4693k5(C4704l5 l5Var, String str, String str2, String str3, long j) {
        this.f14569h = l5Var;
        this.f14565d = str;
        this.f14566e = str2;
        this.f14567f = str3;
        this.f14568g = j;
    }

    public final void run() {
        String str = this.f14565d;
        if (str == null) {
            this.f14569h.f14588b.mo14607w(this.f14566e, (C4848y6) null);
            return;
        }
        this.f14569h.f14588b.mo14607w(this.f14566e, new C4848y6(this.f14567f, str, this.f14568g));
    }
}
