package com.google.android.gms.measurement.internal;

import com.medallia.digital.mobilesdk.C10749b8;
import p182n6.C7264i;
import p260t6.C8404f;

/* renamed from: com.google.android.gms.measurement.internal.w8 */
final class C4828w8 {

    /* renamed from: a */
    private final C8404f f14996a;

    /* renamed from: b */
    private long f14997b;

    public C4828w8(C8404f fVar) {
        C7264i.m27902k(fVar);
        this.f14996a = fVar;
    }

    /* renamed from: a */
    public final void mo14947a() {
        this.f14997b = 0;
    }

    /* renamed from: b */
    public final void mo14948b() {
        this.f14997b = this.f14996a.mo23596c();
    }

    /* renamed from: c */
    public final boolean mo14949c(long j) {
        return this.f14997b == 0 || this.f14996a.mo23596c() - this.f14997b >= C10749b8.C10751b.f30744c;
    }
}
