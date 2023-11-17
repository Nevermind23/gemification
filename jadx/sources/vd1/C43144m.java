package vd1;

import ae1.C40293a;
import ed1.C40757w;
import hd1.C41204a;
import hd1.C41205b;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import kd1.C41499d;

/* renamed from: vd1.m */
public final class C43144m extends C40757w {

    /* renamed from: e */
    static final C43136h f100652e = new C43136h("RxSingleScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.single-priority", 5).intValue())), true);

    /* renamed from: f */
    static final ScheduledExecutorService f100653f;

    /* renamed from: c */
    final ThreadFactory f100654c;

    /* renamed from: d */
    final AtomicReference f100655d;

    /* renamed from: vd1.m$a */
    static final class C43145a extends C40757w.C40760c {

        /* renamed from: d */
        final ScheduledExecutorService f100656d;

        /* renamed from: e */
        final C41204a f100657e = new C41204a();

        /* renamed from: f */
        volatile boolean f100658f;

        C43145a(ScheduledExecutorService scheduledExecutorService) {
            this.f100656d = scheduledExecutorService;
        }

        /* renamed from: c */
        public C41205b mo95059c(Runnable runnable, long j, TimeUnit timeUnit) {
            Future future;
            if (this.f100658f) {
                return C41499d.INSTANCE;
            }
            C43140k kVar = new C43140k(C40293a.m116724u(runnable), this.f100657e);
            this.f100657e.mo95660b(kVar);
            if (j <= 0) {
                try {
                    future = this.f100656d.submit(kVar);
                } catch (RejectedExecutionException e) {
                    dispose();
                    C40293a.m116722s(e);
                    return C41499d.INSTANCE;
                }
            } else {
                future = this.f100656d.schedule(kVar, j, timeUnit);
            }
            kVar.mo101713a(future);
            return kVar;
        }

        public void dispose() {
            if (!this.f100658f) {
                this.f100658f = true;
                this.f100657e.dispose();
            }
        }

        public boolean isDisposed() {
            return this.f100658f;
        }
    }

    static {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(0);
        f100653f = newScheduledThreadPool;
        newScheduledThreadPool.shutdown();
    }

    public C43144m() {
        this(f100652e);
    }

    /* renamed from: f */
    static ScheduledExecutorService m123760f(ThreadFactory threadFactory) {
        return C43141l.m123753a(threadFactory);
    }

    /* renamed from: b */
    public C40757w.C40760c mo95051b() {
        return new C43145a((ScheduledExecutorService) this.f100655d.get());
    }

    /* renamed from: d */
    public C41205b mo95053d(Runnable runnable, long j, TimeUnit timeUnit) {
        Future future;
        C43139j jVar = new C43139j(C40293a.m116724u(runnable));
        if (j <= 0) {
            try {
                future = ((ScheduledExecutorService) this.f100655d.get()).submit(jVar);
            } catch (RejectedExecutionException e) {
                C40293a.m116722s(e);
                return C41499d.INSTANCE;
            }
        } else {
            future = ((ScheduledExecutorService) this.f100655d.get()).schedule(jVar, j, timeUnit);
        }
        jVar.mo101686a(future);
        return jVar;
    }

    /* renamed from: e */
    public C41205b mo95054e(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        Future future;
        Runnable u = C40293a.m116724u(runnable);
        if (j2 <= 0) {
            ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f100655d.get();
            C43128c cVar = new C43128c(u, scheduledExecutorService);
            if (j <= 0) {
                try {
                    future = scheduledExecutorService.submit(cVar);
                } catch (RejectedExecutionException e) {
                    C40293a.m116722s(e);
                    return C41499d.INSTANCE;
                }
            } else {
                future = scheduledExecutorService.schedule(cVar, j, timeUnit);
            }
            cVar.mo101691b(future);
            return cVar;
        }
        C43138i iVar = new C43138i(u);
        try {
            iVar.mo101686a(((ScheduledExecutorService) this.f100655d.get()).scheduleAtFixedRate(iVar, j, j2, timeUnit));
            return iVar;
        } catch (RejectedExecutionException e2) {
            C40293a.m116722s(e2);
            return C41499d.INSTANCE;
        }
    }

    public C43144m(ThreadFactory threadFactory) {
        AtomicReference atomicReference = new AtomicReference();
        this.f100655d = atomicReference;
        this.f100654c = threadFactory;
        atomicReference.lazySet(m123760f(threadFactory));
    }
}
