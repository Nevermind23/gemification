package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.i6 */
final class C4672i6 implements Runnable {

    /* renamed from: d */
    final /* synthetic */ AtomicReference f14514d;

    /* renamed from: e */
    final /* synthetic */ C4793t6 f14515e;

    C4672i6(C4793t6 t6Var, AtomicReference atomicReference) {
        this.f14515e = t6Var;
        this.f14514d = atomicReference;
    }

    public final void run() {
        synchronized (this.f14514d) {
            try {
                this.f14514d.set(this.f14515e.f14613a.mo14876z().mo14418x(this.f14515e.f14613a.mo14845B().mo14446s(), C4636f3.f14347N));
                this.f14514d.notify();
            } catch (Throwable th) {
                this.f14514d.notify();
                throw th;
            }
        }
    }
}
