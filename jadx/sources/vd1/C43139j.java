package vd1;

import java.util.concurrent.Callable;

/* renamed from: vd1.j */
public final class C43139j extends C43123a implements Callable {
    private static final long serialVersionUID = 1811839108042568751L;

    public C43139j(Runnable runnable) {
        super(runnable);
    }

    /* renamed from: b */
    public Void call() {
        this.f100595e = Thread.currentThread();
        try {
            this.f100594d.run();
            return null;
        } finally {
            lazySet(C43123a.f100592f);
            this.f100595e = null;
        }
    }
}
