package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.k6 */
final class C4694k6 implements Runnable {

    /* renamed from: d */
    final /* synthetic */ AtomicReference f14570d;

    /* renamed from: e */
    final /* synthetic */ C4793t6 f14571e;

    C4694k6(C4793t6 t6Var, AtomicReference atomicReference) {
        this.f14571e = t6Var;
        this.f14570d = atomicReference;
    }

    public final void run() {
        synchronized (this.f14570d) {
            try {
                this.f14570d.set(Long.valueOf(this.f14571e.f14613a.mo14876z().mo14412r(this.f14571e.f14613a.mo14845B().mo14446s(), C4636f3.f14348O)));
                this.f14570d.notify();
            } catch (Throwable th) {
                this.f14570d.notify();
                throw th;
            }
        }
    }
}
