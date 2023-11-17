package vd1;

import ae1.C40293a;
import androidx.lifecycle.C1612n;
import hd1.C41205b;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;
import ld1.C41669a;

/* renamed from: vd1.c */
final class C43128c implements Callable, C41205b {

    /* renamed from: i */
    static final FutureTask f100610i = new FutureTask(C41669a.f97936b, (Object) null);

    /* renamed from: d */
    final Runnable f100611d;

    /* renamed from: e */
    final AtomicReference f100612e = new AtomicReference();

    /* renamed from: f */
    final AtomicReference f100613f = new AtomicReference();

    /* renamed from: g */
    final ExecutorService f100614g;

    /* renamed from: h */
    Thread f100615h;

    C43128c(Runnable runnable, ExecutorService executorService) {
        this.f100611d = runnable;
        this.f100614g = executorService;
    }

    /* renamed from: a */
    public Void call() {
        this.f100615h = Thread.currentThread();
        try {
            this.f100611d.run();
            mo101692c(this.f100614g.submit(this));
            this.f100615h = null;
        } catch (Throwable th) {
            this.f100615h = null;
            C40293a.m116722s(th);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo101691b(Future future) {
        Future future2;
        boolean z;
        do {
            future2 = (Future) this.f100613f.get();
            if (future2 == f100610i) {
                if (this.f100615h != Thread.currentThread()) {
                    z = true;
                } else {
                    z = false;
                }
                future.cancel(z);
                return;
            }
        } while (!C1612n.m5659a(this.f100613f, future2, future));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo101692c(Future future) {
        Future future2;
        boolean z;
        do {
            future2 = (Future) this.f100612e.get();
            if (future2 == f100610i) {
                if (this.f100615h != Thread.currentThread()) {
                    z = true;
                } else {
                    z = false;
                }
                future.cancel(z);
                return;
            }
        } while (!C1612n.m5659a(this.f100612e, future2, future));
    }

    public void dispose() {
        boolean z;
        AtomicReference atomicReference = this.f100613f;
        FutureTask futureTask = f100610i;
        Future future = (Future) atomicReference.getAndSet(futureTask);
        boolean z2 = true;
        if (!(future == null || future == futureTask)) {
            if (this.f100615h != Thread.currentThread()) {
                z = true;
            } else {
                z = false;
            }
            future.cancel(z);
        }
        Future future2 = (Future) this.f100612e.getAndSet(futureTask);
        if (future2 != null && future2 != futureTask) {
            if (this.f100615h == Thread.currentThread()) {
                z2 = false;
            }
            future2.cancel(z2);
        }
    }

    public boolean isDisposed() {
        return this.f100613f.get() == f100610i;
    }
}
