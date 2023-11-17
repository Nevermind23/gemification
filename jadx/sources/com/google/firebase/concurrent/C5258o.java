package com.google.firebase.concurrent;

import com.google.firebase.concurrent.C5259p;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.firebase.concurrent.o */
class C5258o implements ScheduledExecutorService {

    /* renamed from: d */
    private final ExecutorService f16859d;

    /* renamed from: e */
    private final ScheduledExecutorService f16860e;

    C5258o(ExecutorService executorService, ScheduledExecutorService scheduledExecutorService) {
        this.f16859d = executorService;
        this.f16860e = scheduledExecutorService;
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public static /* synthetic */ void m20745m(Runnable runnable, C5259p.C5261b bVar) {
        try {
            runnable.run();
            bVar.set((Object) null);
        } catch (Exception e) {
            bVar.mo17441a(e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public /* synthetic */ void m20746n(Runnable runnable, C5259p.C5261b bVar) {
        this.f16859d.execute(new C5247d(runnable, bVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public /* synthetic */ ScheduledFuture m20747o(Runnable runnable, long j, TimeUnit timeUnit, C5259p.C5261b bVar) {
        return this.f16860e.schedule(new C5254k(this, runnable, bVar), j, timeUnit);
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public static /* synthetic */ void m20748p(Callable callable, C5259p.C5261b bVar) {
        try {
            bVar.set(callable.call());
        } catch (Exception e) {
            bVar.mo17441a(e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ Future m20749q(Callable callable, C5259p.C5261b bVar) {
        return this.f16859d.submit(new C5256m(callable, bVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public /* synthetic */ ScheduledFuture m20750r(Callable callable, long j, TimeUnit timeUnit, C5259p.C5261b bVar) {
        return this.f16860e.schedule(new C5255l(this, callable, bVar), j, timeUnit);
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public static /* synthetic */ void m20751s(Runnable runnable, C5259p.C5261b bVar) {
        try {
            runnable.run();
        } catch (Exception e) {
            bVar.mo17441a(e);
            throw e;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public /* synthetic */ void m20752t(Runnable runnable, C5259p.C5261b bVar) {
        this.f16859d.execute(new C5257n(runnable, bVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public /* synthetic */ ScheduledFuture m20753u(Runnable runnable, long j, long j2, TimeUnit timeUnit, C5259p.C5261b bVar) {
        return this.f16860e.scheduleAtFixedRate(new C5252i(this, runnable, bVar), j, j2, timeUnit);
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public /* synthetic */ void m20754v(Runnable runnable, C5259p.C5261b bVar) {
        this.f16859d.execute(new C5248e(runnable, bVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public /* synthetic */ ScheduledFuture m20755x(Runnable runnable, long j, long j2, TimeUnit timeUnit, C5259p.C5261b bVar) {
        return this.f16860e.scheduleWithFixedDelay(new C5253j(this, runnable, bVar), j, j2, timeUnit);
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public static /* synthetic */ void m20756y(Runnable runnable, C5259p.C5261b bVar) {
        try {
            runnable.run();
        } catch (Exception e) {
            bVar.mo17441a(e);
        }
    }

    public boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.f16859d.awaitTermination(j, timeUnit);
    }

    public void execute(Runnable runnable) {
        this.f16859d.execute(runnable);
    }

    public List invokeAll(Collection collection) {
        return this.f16859d.invokeAll(collection);
    }

    public Object invokeAny(Collection collection) {
        return this.f16859d.invokeAny(collection);
    }

    public boolean isShutdown() {
        return this.f16859d.isShutdown();
    }

    public boolean isTerminated() {
        return this.f16859d.isTerminated();
    }

    public ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        return new C5259p(new C5249f(this, runnable, j, timeUnit));
    }

    public ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return new C5259p(new C5251h(this, runnable, j, j2, timeUnit));
    }

    public ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return new C5259p(new C5250g(this, runnable, j, j2, timeUnit));
    }

    public void shutdown() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    public List shutdownNow() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    public Future submit(Callable callable) {
        return this.f16859d.submit(callable);
    }

    public List invokeAll(Collection collection, long j, TimeUnit timeUnit) {
        return this.f16859d.invokeAll(collection, j, timeUnit);
    }

    public Object invokeAny(Collection collection, long j, TimeUnit timeUnit) {
        return this.f16859d.invokeAny(collection, j, timeUnit);
    }

    public ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        return new C5259p(new C5246c(this, callable, j, timeUnit));
    }

    public Future submit(Runnable runnable, Object obj) {
        return this.f16859d.submit(runnable, obj);
    }

    public Future submit(Runnable runnable) {
        return this.f16859d.submit(runnable);
    }
}
