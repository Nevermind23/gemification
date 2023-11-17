package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.l6 */
final class C4705l6 implements Runnable {

    /* renamed from: d */
    final /* synthetic */ AtomicReference f14591d;

    /* renamed from: e */
    final /* synthetic */ C4793t6 f14592e;

    C4705l6(C4793t6 t6Var, AtomicReference atomicReference) {
        this.f14592e = t6Var;
        this.f14591d = atomicReference;
    }

    public final void run() {
        synchronized (this.f14591d) {
            try {
                this.f14591d.set(Integer.valueOf(this.f14592e.f14613a.mo14876z().mo14409o(this.f14592e.f14613a.mo14845B().mo14446s(), C4636f3.f14349P)));
                this.f14591d.notify();
            } catch (Throwable th) {
                this.f14591d.notify();
                throw th;
            }
        }
    }
}
