package com.google.android.gms.measurement.internal;

import java.lang.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import p182n6.C7264i;

/* renamed from: com.google.android.gms.measurement.internal.r4 */
public final class C4769r4 extends C4726n5 {
    /* access modifiers changed from: private */

    /* renamed from: l */
    public static final AtomicLong f14812l = new AtomicLong(Long.MIN_VALUE);
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C4758q4 f14813c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C4758q4 f14814d;

    /* renamed from: e */
    private final PriorityBlockingQueue f14815e = new PriorityBlockingQueue();

    /* renamed from: f */
    private final BlockingQueue f14816f = new LinkedBlockingQueue();

    /* renamed from: g */
    private final Thread.UncaughtExceptionHandler f14817g = new C4736o4(this, "Thread death: Uncaught exception on worker thread");

    /* renamed from: h */
    private final Thread.UncaughtExceptionHandler f14818h = new C4736o4(this, "Thread death: Uncaught exception on network thread");
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final Object f14819i = new Object();
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final Semaphore f14820j = new Semaphore(2);
    /* access modifiers changed from: private */

    /* renamed from: k */
    public volatile boolean f14821k;

    C4769r4(C4791t4 t4Var) {
        super(t4Var);
    }

    /* renamed from: D */
    private final void m18193D(C4747p4 p4Var) {
        synchronized (this.f14819i) {
            this.f14815e.add(p4Var);
            C4758q4 q4Var = this.f14813c;
            if (q4Var == null) {
                C4758q4 q4Var2 = new C4758q4(this, "Measurement Worker", this.f14815e);
                this.f14813c = q4Var2;
                q4Var2.setUncaughtExceptionHandler(this.f14817g);
                this.f14813c.start();
            } else {
                q4Var.mo14760a();
            }
        }
    }

    /* renamed from: A */
    public final void mo14770A(Runnable runnable) {
        mo14640k();
        C7264i.m27902k(runnable);
        m18193D(new C4747p4(this, runnable, true, "Task exception on worker thread"));
    }

    /* renamed from: C */
    public final boolean mo14771C() {
        return Thread.currentThread() == this.f14813c;
    }

    /* renamed from: g */
    public final void mo14553g() {
        if (Thread.currentThread() != this.f14814d) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    /* renamed from: h */
    public final void mo14554h() {
        if (Thread.currentThread() != this.f14813c) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final boolean mo14329j() {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:11|12|13|14) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0027, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r3 = r1.f14613a.mo14551d().mo14680w();
        r3.mo14615a("Interrupted waiting for " + r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0047, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000e, code lost:
        r2 = r2.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0012, code lost:
        if (r2 != null) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0014, code lost:
        r1.f14613a.mo14551d().mo14680w().mo14615a("Timed out waiting for ".concat(r5));
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0028 */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo14772r(java.util.concurrent.atomic.AtomicReference r2, long r3, java.lang.String r5, java.lang.Runnable r6) {
        /*
            r1 = this;
            monitor-enter(r2)
            com.google.android.gms.measurement.internal.t4 r0 = r1.f14613a     // Catch:{ all -> 0x0049 }
            com.google.android.gms.measurement.internal.r4 r0 = r0.mo14552f()     // Catch:{ all -> 0x0049 }
            r0.mo14776z(r6)     // Catch:{ all -> 0x0049 }
            r2.wait(r3)     // Catch:{ InterruptedException -> 0x0028 }
            monitor-exit(r2)     // Catch:{ all -> 0x0049 }
            java.lang.Object r2 = r2.get()
            if (r2 != 0) goto L_0x0027
            com.google.android.gms.measurement.internal.t4 r3 = r1.f14613a
            com.google.android.gms.measurement.internal.p3 r3 = r3.mo14551d()
            com.google.android.gms.measurement.internal.n3 r3 = r3.mo14680w()
            java.lang.String r4 = "Timed out waiting for "
            java.lang.String r4 = r4.concat(r5)
            r3.mo14615a(r4)
        L_0x0027:
            return r2
        L_0x0028:
            com.google.android.gms.measurement.internal.t4 r3 = r1.f14613a     // Catch:{ all -> 0x0049 }
            com.google.android.gms.measurement.internal.p3 r3 = r3.mo14551d()     // Catch:{ all -> 0x0049 }
            com.google.android.gms.measurement.internal.n3 r3 = r3.mo14680w()     // Catch:{ all -> 0x0049 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0049 }
            r4.<init>()     // Catch:{ all -> 0x0049 }
            java.lang.String r6 = "Interrupted waiting for "
            r4.append(r6)     // Catch:{ all -> 0x0049 }
            r4.append(r5)     // Catch:{ all -> 0x0049 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0049 }
            r3.mo14615a(r4)     // Catch:{ all -> 0x0049 }
            monitor-exit(r2)     // Catch:{ all -> 0x0049 }
            r2 = 0
            return r2
        L_0x0049:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0049 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4769r4.mo14772r(java.util.concurrent.atomic.AtomicReference, long, java.lang.String, java.lang.Runnable):java.lang.Object");
    }

    /* renamed from: s */
    public final Future mo14773s(Callable callable) {
        mo14640k();
        C7264i.m27902k(callable);
        C4747p4 p4Var = new C4747p4(this, callable, false, "Task exception on worker thread");
        if (Thread.currentThread() == this.f14813c) {
            if (!this.f14815e.isEmpty()) {
                this.f14613a.mo14551d().mo14680w().mo14615a("Callable skipped the worker queue.");
            }
            p4Var.run();
        } else {
            m18193D(p4Var);
        }
        return p4Var;
    }

    /* renamed from: t */
    public final Future mo14774t(Callable callable) {
        mo14640k();
        C7264i.m27902k(callable);
        C4747p4 p4Var = new C4747p4(this, callable, true, "Task exception on worker thread");
        if (Thread.currentThread() == this.f14813c) {
            p4Var.run();
        } else {
            m18193D(p4Var);
        }
        return p4Var;
    }

    /* renamed from: y */
    public final void mo14775y(Runnable runnable) {
        mo14640k();
        C7264i.m27902k(runnable);
        C4747p4 p4Var = new C4747p4(this, runnable, false, "Task exception on network thread");
        synchronized (this.f14819i) {
            this.f14816f.add(p4Var);
            C4758q4 q4Var = this.f14814d;
            if (q4Var == null) {
                C4758q4 q4Var2 = new C4758q4(this, "Measurement Network", this.f14816f);
                this.f14814d = q4Var2;
                q4Var2.setUncaughtExceptionHandler(this.f14818h);
                this.f14814d.start();
            } else {
                q4Var.mo14760a();
            }
        }
    }

    /* renamed from: z */
    public final void mo14776z(Runnable runnable) {
        mo14640k();
        C7264i.m27902k(runnable);
        m18193D(new C4747p4(this, runnable, false, "Task exception on worker thread"));
    }
}
