package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.m6 */
final class C4716m6 implements Runnable {

    /* renamed from: d */
    final /* synthetic */ AtomicReference f14614d;

    /* renamed from: e */
    final /* synthetic */ C4793t6 f14615e;

    C4716m6(C4793t6 t6Var, AtomicReference atomicReference) {
        this.f14615e = t6Var;
        this.f14614d = atomicReference;
    }

    public final void run() {
        synchronized (this.f14614d) {
            try {
                this.f14614d.set(Double.valueOf(this.f14615e.f14613a.mo14876z().mo14405k(this.f14615e.f14613a.mo14845B().mo14446s(), C4636f3.f14350Q)));
                this.f14614d.notify();
            } catch (Throwable th) {
                this.f14614d.notify();
                throw th;
            }
        }
    }
}
