package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.e6 */
final class C4628e6 implements Runnable {

    /* renamed from: d */
    final /* synthetic */ AtomicReference f14313d;

    /* renamed from: e */
    final /* synthetic */ C4793t6 f14314e;

    C4628e6(C4793t6 t6Var, AtomicReference atomicReference) {
        this.f14314e = t6Var;
        this.f14313d = atomicReference;
    }

    public final void run() {
        synchronized (this.f14313d) {
            try {
                this.f14313d.set(Boolean.valueOf(this.f14314e.f14613a.mo14876z().mo14398B(this.f14314e.f14613a.mo14845B().mo14446s(), C4636f3.f14346M)));
                this.f14313d.notify();
            } catch (Throwable th) {
                this.f14313d.notify();
                throw th;
            }
        }
    }
}
