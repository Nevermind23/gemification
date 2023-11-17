package vd1;

import hd1.C41205b;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kd1.C41497b;

/* renamed from: vd1.k */
public final class C43140k extends AtomicReferenceArray implements Runnable, Callable, C41205b {

    /* renamed from: e */
    static final Object f100643e = new Object();

    /* renamed from: f */
    static final Object f100644f = new Object();

    /* renamed from: g */
    static final Object f100645g = new Object();

    /* renamed from: h */
    static final Object f100646h = new Object();
    private static final long serialVersionUID = -6120223772001106981L;

    /* renamed from: d */
    final Runnable f100647d;

    public C43140k(Runnable runnable, C41497b bVar) {
        super(3);
        this.f100647d = runnable;
        lazySet(0, bVar);
    }

    /* renamed from: a */
    public void mo101713a(Future future) {
        Object obj;
        do {
            obj = get(1);
            if (obj != f100646h) {
                if (obj == f100644f) {
                    future.cancel(false);
                    return;
                } else if (obj == f100645g) {
                    future.cancel(true);
                    return;
                }
            } else {
                return;
            }
        } while (!compareAndSet(1, obj, future));
    }

    public Object call() {
        run();
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void dispose() {
        /*
            r7 = this;
        L_0x0000:
            r0 = 1
            java.lang.Object r1 = r7.get(r0)
            java.lang.Object r2 = f100646h
            r3 = 0
            if (r1 == r2) goto L_0x0031
            java.lang.Object r2 = f100644f
            if (r1 == r2) goto L_0x0031
            java.lang.Object r4 = f100645g
            if (r1 != r4) goto L_0x0013
            goto L_0x0031
        L_0x0013:
            r5 = 2
            java.lang.Object r5 = r7.get(r5)
            java.lang.Thread r6 = java.lang.Thread.currentThread()
            if (r5 == r6) goto L_0x0020
            r5 = r0
            goto L_0x0021
        L_0x0020:
            r5 = r3
        L_0x0021:
            if (r5 == 0) goto L_0x0024
            r2 = r4
        L_0x0024:
            boolean r0 = r7.compareAndSet(r0, r1, r2)
            if (r0 == 0) goto L_0x0000
            if (r1 == 0) goto L_0x0031
            java.util.concurrent.Future r1 = (java.util.concurrent.Future) r1
            r1.cancel(r5)
        L_0x0031:
            java.lang.Object r0 = r7.get(r3)
            java.lang.Object r1 = f100646h
            if (r0 == r1) goto L_0x004b
            java.lang.Object r1 = f100643e
            if (r0 == r1) goto L_0x004b
            if (r0 != 0) goto L_0x0040
            goto L_0x004b
        L_0x0040:
            boolean r1 = r7.compareAndSet(r3, r0, r1)
            if (r1 == 0) goto L_0x0031
            kd1.b r0 = (kd1.C41497b) r0
            r0.mo95661c(r7)
        L_0x004b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vd1.C43140k.dispose():void");
    }

    public boolean isDisposed() {
        Object obj = get(0);
        if (obj == f100643e || obj == f100646h) {
            return true;
        }
        return false;
    }

    public void run() {
        Object obj;
        Object obj2;
        lazySet(2, Thread.currentThread());
        try {
            this.f100647d.run();
        } catch (Throwable th) {
            lazySet(2, (Object) null);
            Object obj3 = get(0);
            if (!(obj3 == f100643e || !compareAndSet(0, obj3, f100646h) || obj3 == null)) {
                ((C41497b) obj3).mo95661c(this);
            }
            do {
                obj2 = get(1);
                if (obj2 == f100644f || obj2 == f100645g || compareAndSet(1, obj2, f100646h)) {
                    throw th;
                }
                obj2 = get(1);
                break;
            } while (compareAndSet(1, obj2, f100646h));
            throw th;
        }
        lazySet(2, (Object) null);
        Object obj4 = get(0);
        if (!(obj4 == f100643e || !compareAndSet(0, obj4, f100646h) || obj4 == null)) {
            ((C41497b) obj4).mo95661c(this);
        }
        do {
            obj = get(1);
            if (obj == f100644f || obj == f100645g || compareAndSet(1, obj, f100646h)) {
            }
            obj = get(1);
            return;
        } while (compareAndSet(1, obj, f100646h));
    }
}
