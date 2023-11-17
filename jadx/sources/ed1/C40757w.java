package ed1;

import ae1.C40293a;
import hd1.C41205b;
import id1.C41300a;
import java.util.concurrent.TimeUnit;
import kd1.C41499d;
import kd1.C41502g;
import vd1.C43134f;
import yd1.C43364i;

/* renamed from: ed1.w */
public abstract class C40757w {

    /* renamed from: a */
    static boolean f96447a = Boolean.getBoolean("rx2.scheduler.use-nanotime");

    /* renamed from: b */
    static final long f96448b = TimeUnit.MINUTES.toNanos(Long.getLong("rx2.scheduler.drift-tolerance", 15).longValue());

    /* renamed from: ed1.w$a */
    static final class C40758a implements C41205b, Runnable {

        /* renamed from: d */
        final Runnable f96449d;

        /* renamed from: e */
        final C40760c f96450e;

        /* renamed from: f */
        Thread f96451f;

        C40758a(Runnable runnable, C40760c cVar) {
            this.f96449d = runnable;
            this.f96450e = cVar;
        }

        public void dispose() {
            if (this.f96451f == Thread.currentThread()) {
                C40760c cVar = this.f96450e;
                if (cVar instanceof C43134f) {
                    ((C43134f) cVar).mo101707h();
                    return;
                }
            }
            this.f96450e.dispose();
        }

        public boolean isDisposed() {
            return this.f96450e.isDisposed();
        }

        public void run() {
            this.f96451f = Thread.currentThread();
            try {
                this.f96449d.run();
            } finally {
                dispose();
                this.f96451f = null;
            }
        }
    }

    /* renamed from: ed1.w$b */
    static final class C40759b implements C41205b, Runnable {

        /* renamed from: d */
        final Runnable f96452d;

        /* renamed from: e */
        final C40760c f96453e;

        /* renamed from: f */
        volatile boolean f96454f;

        C40759b(Runnable runnable, C40760c cVar) {
            this.f96452d = runnable;
            this.f96453e = cVar;
        }

        public void dispose() {
            this.f96454f = true;
            this.f96453e.dispose();
        }

        public boolean isDisposed() {
            return this.f96454f;
        }

        public void run() {
            if (!this.f96454f) {
                try {
                    this.f96452d.run();
                } catch (Throwable th) {
                    C41300a.m119661b(th);
                    this.f96453e.dispose();
                    throw C43364i.m124412e(th);
                }
            }
        }
    }

    /* renamed from: ed1.w$c */
    public static abstract class C40760c implements C41205b {

        /* renamed from: ed1.w$c$a */
        final class C40761a implements Runnable {

            /* renamed from: d */
            final Runnable f96455d;

            /* renamed from: e */
            final C41502g f96456e;

            /* renamed from: f */
            final long f96457f;

            /* renamed from: g */
            long f96458g;

            /* renamed from: h */
            long f96459h;

            /* renamed from: i */
            long f96460i;

            C40761a(long j, Runnable runnable, long j2, C41502g gVar, long j3) {
                this.f96455d = runnable;
                this.f96456e = gVar;
                this.f96457f = j3;
                this.f96459h = j2;
                this.f96460i = j;
            }

            public void run() {
                long j;
                this.f96455d.run();
                if (!this.f96456e.isDisposed()) {
                    C40760c cVar = C40760c.this;
                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                    long a = cVar.mo95057a(timeUnit);
                    long j2 = C40757w.f96448b;
                    long j3 = this.f96459h;
                    if (a + j2 >= j3) {
                        long j4 = this.f96457f;
                        if (a < j3 + j4 + j2) {
                            long j5 = this.f96460i;
                            long j6 = this.f96458g + 1;
                            this.f96458g = j6;
                            j = j5 + (j6 * j4);
                            this.f96459h = a;
                            this.f96456e.mo96265a(C40760c.this.mo95059c(this, j - a, timeUnit));
                        }
                    }
                    long j7 = this.f96457f;
                    long j8 = a + j7;
                    long j9 = this.f96458g + 1;
                    this.f96458g = j9;
                    this.f96460i = j8 - (j7 * j9);
                    j = j8;
                    this.f96459h = a;
                    this.f96456e.mo96265a(C40760c.this.mo95059c(this, j - a, timeUnit));
                }
            }
        }

        /* renamed from: a */
        public long mo95057a(TimeUnit timeUnit) {
            return C40757w.m118140a(timeUnit);
        }

        /* renamed from: b */
        public C41205b mo95058b(Runnable runnable) {
            return mo95059c(runnable, 0, TimeUnit.NANOSECONDS);
        }

        /* renamed from: c */
        public abstract C41205b mo95059c(Runnable runnable, long j, TimeUnit timeUnit);

        /* renamed from: d */
        public C41205b mo95060d(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
            long j3 = j;
            TimeUnit timeUnit2 = timeUnit;
            C41502g gVar = new C41502g();
            C41502g gVar2 = new C41502g(gVar);
            Runnable u = C40293a.m116724u(runnable);
            long nanos = timeUnit2.toNanos(j2);
            long a = mo95057a(TimeUnit.NANOSECONDS);
            C41502g gVar3 = gVar;
            C40761a aVar = r0;
            C40761a aVar2 = new C40761a(a + timeUnit2.toNanos(j3), u, a, gVar2, nanos);
            C41205b c = mo95059c(aVar, j3, timeUnit2);
            if (c == C41499d.INSTANCE) {
                return c;
            }
            gVar3.mo96265a(c);
            return gVar2;
        }
    }

    /* renamed from: a */
    static long m118140a(TimeUnit timeUnit) {
        if (!f96447a) {
            return timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS);
        }
        return timeUnit.convert(System.nanoTime(), TimeUnit.NANOSECONDS);
    }

    /* renamed from: b */
    public abstract C40760c mo95051b();

    /* renamed from: c */
    public C41205b mo95052c(Runnable runnable) {
        return mo95053d(runnable, 0, TimeUnit.NANOSECONDS);
    }

    /* renamed from: d */
    public C41205b mo95053d(Runnable runnable, long j, TimeUnit timeUnit) {
        C40760c b = mo95051b();
        C40758a aVar = new C40758a(C40293a.m116724u(runnable), b);
        b.mo95059c(aVar, j, timeUnit);
        return aVar;
    }

    /* renamed from: e */
    public C41205b mo95054e(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        C40760c b = mo95051b();
        C40759b bVar = new C40759b(C40293a.m116724u(runnable), b);
        C41205b d = b.mo95060d(bVar, j, j2, timeUnit);
        if (d == C41499d.INSTANCE) {
            return d;
        }
        return bVar;
    }
}
