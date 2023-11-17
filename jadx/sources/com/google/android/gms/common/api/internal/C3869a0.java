package com.google.android.gms.common.api.internal;

import java.util.concurrent.locks.Lock;
import p156l6.C6962q;

/* renamed from: com.google.android.gms.common.api.internal.a0 */
abstract class C3869a0 implements Runnable {

    /* renamed from: d */
    final /* synthetic */ C3872b0 f12322d;

    /* synthetic */ C3869a0(C3872b0 b0Var, C6962q qVar) {
        this.f12322d = b0Var;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo12005a();

    public final void run() {
        Lock y;
        this.f12322d.f12327b.lock();
        try {
            if (Thread.interrupted()) {
                y = this.f12322d.f12327b;
            } else {
                mo12005a();
                y = this.f12322d.f12327b;
            }
        } catch (RuntimeException e) {
            this.f12322d.f12326a.mo12106o(e);
            y = this.f12322d.f12327b;
        } catch (Throwable th) {
            this.f12322d.f12327b.unlock();
            throw th;
        }
        y.unlock();
    }
}
