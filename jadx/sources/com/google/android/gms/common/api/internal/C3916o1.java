package com.google.android.gms.common.api.internal;

/* renamed from: com.google.android.gms.common.api.internal.o1 */
final class C3916o1 implements Runnable {

    /* renamed from: d */
    final /* synthetic */ C3899j f12495d;

    C3916o1(C3899j jVar) {
        this.f12495d = jVar;
    }

    public final void run() {
        this.f12495d.f12453n.lock();
        try {
            C3899j.m14793w(this.f12495d);
        } finally {
            this.f12495d.f12453n.unlock();
        }
    }
}
