package vd1;

import androidx.lifecycle.C1612n;
import ed1.C40757w;
import hd1.C41204a;
import hd1.C41205b;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import kd1.C41499d;
import kd1.C41500e;

/* renamed from: vd1.b */
public final class C43124b extends C40757w {

    /* renamed from: e */
    static final C43126b f100596e;

    /* renamed from: f */
    static final C43136h f100597f;

    /* renamed from: g */
    static final int f100598g = m123722f(Runtime.getRuntime().availableProcessors(), Integer.getInteger("rx2.computation-threads", 0).intValue());

    /* renamed from: h */
    static final C43127c f100599h;

    /* renamed from: c */
    final ThreadFactory f100600c;

    /* renamed from: d */
    final AtomicReference f100601d;

    /* renamed from: vd1.b$a */
    static final class C43125a extends C40757w.C40760c {

        /* renamed from: d */
        private final C41500e f100602d;

        /* renamed from: e */
        private final C41204a f100603e;

        /* renamed from: f */
        private final C41500e f100604f;

        /* renamed from: g */
        private final C43127c f100605g;

        /* renamed from: h */
        volatile boolean f100606h;

        C43125a(C43127c cVar) {
            this.f100605g = cVar;
            C41500e eVar = new C41500e();
            this.f100602d = eVar;
            C41204a aVar = new C41204a();
            this.f100603e = aVar;
            C41500e eVar2 = new C41500e();
            this.f100604f = eVar2;
            eVar2.mo95660b(eVar);
            eVar2.mo95660b(aVar);
        }

        /* renamed from: b */
        public C41205b mo95058b(Runnable runnable) {
            if (this.f100606h) {
                return C41499d.INSTANCE;
            }
            return this.f100605g.mo101704e(runnable, 0, TimeUnit.MILLISECONDS, this.f100602d);
        }

        /* renamed from: c */
        public C41205b mo95059c(Runnable runnable, long j, TimeUnit timeUnit) {
            if (this.f100606h) {
                return C41499d.INSTANCE;
            }
            return this.f100605g.mo101704e(runnable, j, timeUnit, this.f100603e);
        }

        public void dispose() {
            if (!this.f100606h) {
                this.f100606h = true;
                this.f100604f.dispose();
            }
        }

        public boolean isDisposed() {
            return this.f100606h;
        }
    }

    /* renamed from: vd1.b$b */
    static final class C43126b {

        /* renamed from: a */
        final int f100607a;

        /* renamed from: b */
        final C43127c[] f100608b;

        /* renamed from: c */
        long f100609c;

        C43126b(int i, ThreadFactory threadFactory) {
            this.f100607a = i;
            this.f100608b = new C43127c[i];
            for (int i2 = 0; i2 < i; i2++) {
                this.f100608b[i2] = new C43127c(threadFactory);
            }
        }

        /* renamed from: a */
        public C43127c mo101688a() {
            int i = this.f100607a;
            if (i == 0) {
                return C43124b.f100599h;
            }
            C43127c[] cVarArr = this.f100608b;
            long j = this.f100609c;
            this.f100609c = 1 + j;
            return cVarArr[(int) (j % ((long) i))];
        }

        /* renamed from: b */
        public void mo101689b() {
            for (C43127c dispose : this.f100608b) {
                dispose.dispose();
            }
        }
    }

    /* renamed from: vd1.b$c */
    static final class C43127c extends C43134f {
        C43127c(ThreadFactory threadFactory) {
            super(threadFactory);
        }
    }

    static {
        C43127c cVar = new C43127c(new C43136h("RxComputationShutdown"));
        f100599h = cVar;
        cVar.dispose();
        C43136h hVar = new C43136h("RxComputationThreadPool", Math.max(1, Math.min(10, Integer.getInteger("rx2.computation-priority", 5).intValue())), true);
        f100597f = hVar;
        C43126b bVar = new C43126b(0, hVar);
        f100596e = bVar;
        bVar.mo101689b();
    }

    public C43124b() {
        this(f100597f);
    }

    /* renamed from: f */
    static int m123722f(int i, int i2) {
        return (i2 <= 0 || i2 > i) ? i : i2;
    }

    /* renamed from: b */
    public C40757w.C40760c mo95051b() {
        return new C43125a(((C43126b) this.f100601d.get()).mo101688a());
    }

    /* renamed from: d */
    public C41205b mo95053d(Runnable runnable, long j, TimeUnit timeUnit) {
        return ((C43126b) this.f100601d.get()).mo101688a().mo101705f(runnable, j, timeUnit);
    }

    /* renamed from: e */
    public C41205b mo95054e(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return ((C43126b) this.f100601d.get()).mo101688a().mo101706g(runnable, j, j2, timeUnit);
    }

    /* renamed from: g */
    public void mo101687g() {
        C43126b bVar = new C43126b(f100598g, this.f100600c);
        if (!C1612n.m5659a(this.f100601d, f100596e, bVar)) {
            bVar.mo101689b();
        }
    }

    public C43124b(ThreadFactory threadFactory) {
        this.f100600c = threadFactory;
        this.f100601d = new AtomicReference(f100596e);
        mo101687g();
    }
}
