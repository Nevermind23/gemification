package yd1;

import ae1.C40293a;
import ed1.C40756v;
import java.util.concurrent.atomic.AtomicInteger;
import uh1.C43107b;

/* renamed from: yd1.j */
public abstract class C43366j {
    /* renamed from: a */
    public static void m124413a(C40756v vVar, AtomicInteger atomicInteger, C43357b bVar) {
        if (atomicInteger.getAndIncrement() == 0) {
            Throwable b = bVar.mo102035b();
            if (b != null) {
                vVar.onError(b);
            } else {
                vVar.onComplete();
            }
        }
    }

    /* renamed from: b */
    public static void m124414b(C43107b bVar, AtomicInteger atomicInteger, C43357b bVar2) {
        if (atomicInteger.getAndIncrement() == 0) {
            Throwable b = bVar2.mo102035b();
            if (b != null) {
                bVar.onError(b);
            } else {
                bVar.onComplete();
            }
        }
    }

    /* renamed from: c */
    public static void m124415c(C40756v vVar, Throwable th, AtomicInteger atomicInteger, C43357b bVar) {
        if (!bVar.mo102034a(th)) {
            C40293a.m116722s(th);
        } else if (atomicInteger.getAndIncrement() == 0) {
            vVar.onError(bVar.mo102035b());
        }
    }

    /* renamed from: d */
    public static void m124416d(C43107b bVar, Throwable th, AtomicInteger atomicInteger, C43357b bVar2) {
        if (!bVar2.mo102034a(th)) {
            C40293a.m116722s(th);
        } else if (atomicInteger.getAndIncrement() == 0) {
            bVar.onError(bVar2.mo102035b());
        }
    }

    /* renamed from: e */
    public static void m124417e(C40756v vVar, Object obj, AtomicInteger atomicInteger, C43357b bVar) {
        if (atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1)) {
            vVar.onNext(obj);
            if (atomicInteger.decrementAndGet() != 0) {
                Throwable b = bVar.mo102035b();
                if (b != null) {
                    vVar.onError(b);
                } else {
                    vVar.onComplete();
                }
            }
        }
    }

    /* renamed from: f */
    public static void m124418f(C43107b bVar, Object obj, AtomicInteger atomicInteger, C43357b bVar2) {
        if (atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1)) {
            bVar.onNext(obj);
            if (atomicInteger.decrementAndGet() != 0) {
                Throwable b = bVar2.mo102035b();
                if (b != null) {
                    bVar.onError(b);
                } else {
                    bVar.onComplete();
                }
            }
        }
    }
}
