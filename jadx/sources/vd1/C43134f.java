package vd1;

import ae1.C40293a;
import ed1.C40757w;
import hd1.C41205b;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import kd1.C41497b;
import kd1.C41499d;

/* renamed from: vd1.f */
public class C43134f extends C40757w.C40760c {

    /* renamed from: d */
    private final ScheduledExecutorService f100638d;

    /* renamed from: e */
    volatile boolean f100639e;

    public C43134f(ThreadFactory threadFactory) {
        this.f100638d = C43141l.m123753a(threadFactory);
    }

    /* renamed from: b */
    public C41205b mo95058b(Runnable runnable) {
        return mo95059c(runnable, 0, (TimeUnit) null);
    }

    /* renamed from: c */
    public C41205b mo95059c(Runnable runnable, long j, TimeUnit timeUnit) {
        if (this.f100639e) {
            return C41499d.INSTANCE;
        }
        return mo101704e(runnable, j, timeUnit, (C41497b) null);
    }

    public void dispose() {
        if (!this.f100639e) {
            this.f100639e = true;
            this.f100638d.shutdownNow();
        }
    }

    /* renamed from: e */
    public C43140k mo101704e(Runnable runnable, long j, TimeUnit timeUnit, C41497b bVar) {
        Future future;
        C43140k kVar = new C43140k(C40293a.m116724u(runnable), bVar);
        if (bVar != null && !bVar.mo95660b(kVar)) {
            return kVar;
        }
        if (j <= 0) {
            try {
                future = this.f100638d.submit(kVar);
            } catch (RejectedExecutionException e) {
                if (bVar != null) {
                    bVar.mo95659a(kVar);
                }
                C40293a.m116722s(e);
            }
        } else {
            future = this.f100638d.schedule(kVar, j, timeUnit);
        }
        kVar.mo101713a(future);
        return kVar;
    }

    /* renamed from: f */
    public C41205b mo101705f(Runnable runnable, long j, TimeUnit timeUnit) {
        Future future;
        C43139j jVar = new C43139j(C40293a.m116724u(runnable));
        if (j <= 0) {
            try {
                future = this.f100638d.submit(jVar);
            } catch (RejectedExecutionException e) {
                C40293a.m116722s(e);
                return C41499d.INSTANCE;
            }
        } else {
            future = this.f100638d.schedule(jVar, j, timeUnit);
        }
        jVar.mo101686a(future);
        return jVar;
    }

    /* renamed from: g */
    public C41205b mo101706g(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        Future future;
        Runnable u = C40293a.m116724u(runnable);
        if (j2 <= 0) {
            C43128c cVar = new C43128c(u, this.f100638d);
            if (j <= 0) {
                try {
                    future = this.f100638d.submit(cVar);
                } catch (RejectedExecutionException e) {
                    C40293a.m116722s(e);
                    return C41499d.INSTANCE;
                }
            } else {
                future = this.f100638d.schedule(cVar, j, timeUnit);
            }
            cVar.mo101691b(future);
            return cVar;
        }
        C43138i iVar = new C43138i(u);
        try {
            iVar.mo101686a(this.f100638d.scheduleAtFixedRate(iVar, j, j2, timeUnit));
            return iVar;
        } catch (RejectedExecutionException e2) {
            C40293a.m116722s(e2);
            return C41499d.INSTANCE;
        }
    }

    /* renamed from: h */
    public void mo101707h() {
        if (!this.f100639e) {
            this.f100639e = true;
            this.f100638d.shutdown();
        }
    }

    public boolean isDisposed() {
        return this.f100639e;
    }
}
