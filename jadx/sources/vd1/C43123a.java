package vd1;

import hd1.C41205b;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;
import ld1.C41669a;

/* renamed from: vd1.a */
abstract class C43123a extends AtomicReference implements C41205b {

    /* renamed from: f */
    protected static final FutureTask f100592f;

    /* renamed from: g */
    protected static final FutureTask f100593g;
    private static final long serialVersionUID = 1811839108042568751L;

    /* renamed from: d */
    protected final Runnable f100594d;

    /* renamed from: e */
    protected Thread f100595e;

    static {
        Runnable runnable = C41669a.f97936b;
        f100592f = new FutureTask(runnable, (Object) null);
        f100593g = new FutureTask(runnable, (Object) null);
    }

    C43123a(Runnable runnable) {
        this.f100594d = runnable;
    }

    /* renamed from: a */
    public final void mo101686a(Future future) {
        Future future2;
        boolean z;
        do {
            future2 = (Future) get();
            if (future2 != f100592f) {
                if (future2 == f100593g) {
                    if (this.f100595e != Thread.currentThread()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    future.cancel(z);
                    return;
                }
            } else {
                return;
            }
        } while (!compareAndSet(future2, future));
    }

    public final void dispose() {
        FutureTask futureTask;
        boolean z;
        Future future = (Future) get();
        if (future != f100592f && future != (futureTask = f100593g) && compareAndSet(future, futureTask) && future != null) {
            if (this.f100595e != Thread.currentThread()) {
                z = true;
            } else {
                z = false;
            }
            future.cancel(z);
        }
    }

    public final boolean isDisposed() {
        Future future = (Future) get();
        if (future == f100592f || future == f100593g) {
            return true;
        }
        return false;
    }
}
