package vd1;

import androidx.lifecycle.C1612n;
import ed1.C40757w;
import hd1.C41204a;
import hd1.C41205b;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kd1.C41497b;
import kd1.C41499d;

/* renamed from: vd1.d */
public final class C43129d extends C40757w {

    /* renamed from: e */
    static final C43136h f100616e;

    /* renamed from: f */
    static final C43136h f100617f;

    /* renamed from: g */
    private static final long f100618g = Long.getLong("rx2.io-keep-alive-time", 60).longValue();

    /* renamed from: h */
    private static final TimeUnit f100619h = TimeUnit.SECONDS;

    /* renamed from: i */
    static final C43132c f100620i;

    /* renamed from: j */
    static boolean f100621j = Boolean.getBoolean("rx2.io-scheduled-release");

    /* renamed from: k */
    static final C43130a f100622k;

    /* renamed from: c */
    final ThreadFactory f100623c;

    /* renamed from: d */
    final AtomicReference f100624d;

    /* renamed from: vd1.d$a */
    static final class C43130a implements Runnable {

        /* renamed from: d */
        private final long f100625d;

        /* renamed from: e */
        private final ConcurrentLinkedQueue f100626e;

        /* renamed from: f */
        final C41204a f100627f;

        /* renamed from: g */
        private final ScheduledExecutorService f100628g;

        /* renamed from: h */
        private final Future f100629h;

        /* renamed from: i */
        private final ThreadFactory f100630i;

        C43130a(long j, TimeUnit timeUnit, ThreadFactory threadFactory) {
            long j2;
            ScheduledFuture<?> scheduledFuture;
            ScheduledExecutorService scheduledExecutorService;
            if (timeUnit != null) {
                j2 = timeUnit.toNanos(j);
            } else {
                j2 = 0;
            }
            long j3 = j2;
            this.f100625d = j3;
            this.f100626e = new ConcurrentLinkedQueue();
            this.f100627f = new C41204a();
            this.f100630i = threadFactory;
            if (timeUnit != null) {
                scheduledExecutorService = Executors.newScheduledThreadPool(1, C43129d.f100617f);
                scheduledFuture = scheduledExecutorService.scheduleWithFixedDelay(this, j3, j3, TimeUnit.NANOSECONDS);
            } else {
                scheduledExecutorService = null;
                scheduledFuture = null;
            }
            this.f100628g = scheduledExecutorService;
            this.f100629h = scheduledFuture;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo101695a() {
            if (!this.f100626e.isEmpty()) {
                long c = mo101697c();
                Iterator it = this.f100626e.iterator();
                while (it.hasNext()) {
                    C43132c cVar = (C43132c) it.next();
                    if (cVar.mo101702i() > c) {
                        return;
                    }
                    if (this.f100626e.remove(cVar)) {
                        this.f100627f.mo95659a(cVar);
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C43132c mo101696b() {
            if (this.f100627f.isDisposed()) {
                return C43129d.f100620i;
            }
            while (!this.f100626e.isEmpty()) {
                C43132c cVar = (C43132c) this.f100626e.poll();
                if (cVar != null) {
                    return cVar;
                }
            }
            C43132c cVar2 = new C43132c(this.f100630i);
            this.f100627f.mo95660b(cVar2);
            return cVar2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public long mo101697c() {
            return System.nanoTime();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo101698d(C43132c cVar) {
            cVar.mo101703j(mo101697c() + this.f100625d);
            this.f100626e.offer(cVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo101699e() {
            this.f100627f.dispose();
            Future future = this.f100629h;
            if (future != null) {
                future.cancel(true);
            }
            ScheduledExecutorService scheduledExecutorService = this.f100628g;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.shutdownNow();
            }
        }

        public void run() {
            mo101695a();
        }
    }

    /* renamed from: vd1.d$b */
    static final class C43131b extends C40757w.C40760c implements Runnable {

        /* renamed from: d */
        private final C41204a f100631d;

        /* renamed from: e */
        private final C43130a f100632e;

        /* renamed from: f */
        private final C43132c f100633f;

        /* renamed from: g */
        final AtomicBoolean f100634g = new AtomicBoolean();

        C43131b(C43130a aVar) {
            this.f100632e = aVar;
            this.f100631d = new C41204a();
            this.f100633f = aVar.mo101696b();
        }

        /* renamed from: c */
        public C41205b mo95059c(Runnable runnable, long j, TimeUnit timeUnit) {
            if (this.f100631d.isDisposed()) {
                return C41499d.INSTANCE;
            }
            return this.f100633f.mo101704e(runnable, j, timeUnit, this.f100631d);
        }

        public void dispose() {
            if (this.f100634g.compareAndSet(false, true)) {
                this.f100631d.dispose();
                if (C43129d.f100621j) {
                    this.f100633f.mo101704e(this, 0, TimeUnit.NANOSECONDS, (C41497b) null);
                    return;
                }
                this.f100632e.mo101698d(this.f100633f);
            }
        }

        public boolean isDisposed() {
            return this.f100634g.get();
        }

        public void run() {
            this.f100632e.mo101698d(this.f100633f);
        }
    }

    /* renamed from: vd1.d$c */
    static final class C43132c extends C43134f {

        /* renamed from: f */
        private long f100635f = 0;

        C43132c(ThreadFactory threadFactory) {
            super(threadFactory);
        }

        /* renamed from: i */
        public long mo101702i() {
            return this.f100635f;
        }

        /* renamed from: j */
        public void mo101703j(long j) {
            this.f100635f = j;
        }
    }

    static {
        C43132c cVar = new C43132c(new C43136h("RxCachedThreadSchedulerShutdown"));
        f100620i = cVar;
        cVar.dispose();
        int max = Math.max(1, Math.min(10, Integer.getInteger("rx2.io-priority", 5).intValue()));
        C43136h hVar = new C43136h("RxCachedThreadScheduler", max);
        f100616e = hVar;
        f100617f = new C43136h("RxCachedWorkerPoolEvictor", max);
        C43130a aVar = new C43130a(0, (TimeUnit) null, hVar);
        f100622k = aVar;
        aVar.mo101699e();
    }

    public C43129d() {
        this(f100616e);
    }

    /* renamed from: b */
    public C40757w.C40760c mo95051b() {
        return new C43131b((C43130a) this.f100624d.get());
    }

    /* renamed from: f */
    public void mo101694f() {
        C43130a aVar = new C43130a(f100618g, f100619h, this.f100623c);
        if (!C1612n.m5659a(this.f100624d, f100622k, aVar)) {
            aVar.mo101699e();
        }
    }

    public C43129d(ThreadFactory threadFactory) {
        this.f100623c = threadFactory;
        this.f100624d = new AtomicReference(f100622k);
        mo101694f();
    }
}
