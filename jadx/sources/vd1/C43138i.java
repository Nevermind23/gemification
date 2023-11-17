package vd1;

import ae1.C40293a;

/* renamed from: vd1.i */
public final class C43138i extends C43123a implements Runnable {
    private static final long serialVersionUID = 1811839108042568751L;

    public C43138i(Runnable runnable) {
        super(runnable);
    }

    public void run() {
        this.f100595e = Thread.currentThread();
        try {
            this.f100594d.run();
            this.f100595e = null;
        } catch (Throwable th) {
            this.f100595e = null;
            lazySet(C43123a.f100592f);
            C40293a.m116722s(th);
        }
    }
}
