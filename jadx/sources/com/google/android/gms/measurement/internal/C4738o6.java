package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C4356pe;
import p248s7.C8245b;

/* renamed from: com.google.android.gms.measurement.internal.o6 */
final class C4738o6 implements Runnable {

    /* renamed from: d */
    final /* synthetic */ C8245b f14692d;

    /* renamed from: e */
    final /* synthetic */ long f14693e;

    /* renamed from: f */
    final /* synthetic */ int f14694f;

    /* renamed from: g */
    final /* synthetic */ long f14695g;

    /* renamed from: h */
    final /* synthetic */ boolean f14696h;

    /* renamed from: i */
    final /* synthetic */ C8245b f14697i;

    /* renamed from: j */
    final /* synthetic */ C4793t6 f14698j;

    C4738o6(C4793t6 t6Var, C8245b bVar, long j, int i, long j2, boolean z, C8245b bVar2) {
        this.f14698j = t6Var;
        this.f14692d = bVar;
        this.f14693e = j;
        this.f14694f = i;
        this.f14695g = j2;
        this.f14696h = z;
        this.f14697i = bVar2;
    }

    public final void run() {
        this.f14698j.mo14887J(this.f14692d);
        this.f14698j.mo14915z(this.f14693e, false);
        C4793t6.m18335c0(this.f14698j, this.f14692d, this.f14694f, this.f14695g, true, this.f14696h);
        C4356pe.m16469c();
        if (this.f14698j.f14613a.mo14876z().mo14398B((String) null, C4636f3.f14391p0)) {
            C4793t6.m18334b0(this.f14698j, this.f14692d, this.f14697i);
        }
    }
}
