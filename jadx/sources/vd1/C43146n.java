package vd1;

import ae1.C40293a;
import ed1.C40757w;
import hd1.C41205b;
import hd1.C41206c;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import kd1.C41499d;
import ld1.C41692b;

/* renamed from: vd1.n */
public final class C43146n extends C40757w {

    /* renamed from: c */
    private static final C43146n f100659c = new C43146n();

    /* renamed from: vd1.n$a */
    static final class C43147a implements Runnable {

        /* renamed from: d */
        private final Runnable f100660d;

        /* renamed from: e */
        private final C43149c f100661e;

        /* renamed from: f */
        private final long f100662f;

        C43147a(Runnable runnable, C43149c cVar, long j) {
            this.f100660d = runnable;
            this.f100661e = cVar;
            this.f100662f = j;
        }

        public void run() {
            if (!this.f100661e.f100670g) {
                long a = this.f100661e.mo95057a(TimeUnit.MILLISECONDS);
                long j = this.f100662f;
                if (j > a) {
                    try {
                        Thread.sleep(j - a);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        C40293a.m116722s(e);
                        return;
                    }
                }
                if (!this.f100661e.f100670g) {
                    this.f100660d.run();
                }
            }
        }
    }

    /* renamed from: vd1.n$b */
    static final class C43148b implements Comparable {

        /* renamed from: d */
        final Runnable f100663d;

        /* renamed from: e */
        final long f100664e;

        /* renamed from: f */
        final int f100665f;

        /* renamed from: g */
        volatile boolean f100666g;

        C43148b(Runnable runnable, Long l, int i) {
            this.f100663d = runnable;
            this.f100664e = l.longValue();
            this.f100665f = i;
        }

        /* renamed from: a */
        public int compareTo(C43148b bVar) {
            int b = C41692b.m120931b(this.f100664e, bVar.f100664e);
            if (b == 0) {
                return C41692b.m120930a(this.f100665f, bVar.f100665f);
            }
            return b;
        }
    }

    /* renamed from: vd1.n$c */
    static final class C43149c extends C40757w.C40760c {

        /* renamed from: d */
        final PriorityBlockingQueue f100667d = new PriorityBlockingQueue();

        /* renamed from: e */
        private final AtomicInteger f100668e = new AtomicInteger();

        /* renamed from: f */
        final AtomicInteger f100669f = new AtomicInteger();

        /* renamed from: g */
        volatile boolean f100670g;

        /* renamed from: vd1.n$c$a */
        final class C43150a implements Runnable {

            /* renamed from: d */
            final C43148b f100671d;

            C43150a(C43148b bVar) {
                this.f100671d = bVar;
            }

            public void run() {
                this.f100671d.f100666g = true;
                C43149c.this.f100667d.remove(this.f100671d);
            }
        }

        C43149c() {
        }

        /* renamed from: b */
        public C41205b mo95058b(Runnable runnable) {
            return mo101721e(runnable, mo95057a(TimeUnit.MILLISECONDS));
        }

        /* renamed from: c */
        public C41205b mo95059c(Runnable runnable, long j, TimeUnit timeUnit) {
            long a = mo95057a(TimeUnit.MILLISECONDS) + timeUnit.toMillis(j);
            return mo101721e(new C43147a(runnable, this, a), a);
        }

        public void dispose() {
            this.f100670g = true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public C41205b mo101721e(Runnable runnable, long j) {
            if (this.f100670g) {
                return C41499d.INSTANCE;
            }
            C43148b bVar = new C43148b(runnable, Long.valueOf(j), this.f100669f.incrementAndGet());
            this.f100667d.add(bVar);
            if (this.f100668e.getAndIncrement() != 0) {
                return C41206c.m119455c(new C43150a(bVar));
            }
            int i = 1;
            while (!this.f100670g) {
                C43148b bVar2 = (C43148b) this.f100667d.poll();
                if (bVar2 == null) {
                    i = this.f100668e.addAndGet(-i);
                    if (i == 0) {
                        return C41499d.INSTANCE;
                    }
                } else if (!bVar2.f100666g) {
                    bVar2.f100663d.run();
                }
            }
            this.f100667d.clear();
            return C41499d.INSTANCE;
        }

        public boolean isDisposed() {
            return this.f100670g;
        }
    }

    C43146n() {
    }

    /* renamed from: f */
    public static C43146n m123765f() {
        return f100659c;
    }

    /* renamed from: b */
    public C40757w.C40760c mo95051b() {
        return new C43149c();
    }

    /* renamed from: c */
    public C41205b mo95052c(Runnable runnable) {
        C40293a.m116724u(runnable).run();
        return C41499d.INSTANCE;
    }

    /* renamed from: d */
    public C41205b mo95053d(Runnable runnable, long j, TimeUnit timeUnit) {
        try {
            timeUnit.sleep(j);
            C40293a.m116724u(runnable).run();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            C40293a.m116722s(e);
        }
        return C41499d.INSTANCE;
    }
}
