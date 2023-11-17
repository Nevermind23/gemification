package pd1;

import ed1.C40741h;
import ed1.C40742i;
import ed1.C40757w;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import uh1.C43106a;
import uh1.C43107b;
import uh1.C43108c;
import xd1.C43259d;
import yd1.C43358c;

/* renamed from: pd1.t */
public final class C42185t extends C42144a {

    /* renamed from: f */
    final C40757w f99242f;

    /* renamed from: g */
    final boolean f99243g;

    /* renamed from: pd1.t$a */
    static final class C42186a extends AtomicReference implements C40742i, C43108c, Runnable {
        private static final long serialVersionUID = 8094547886072529208L;

        /* renamed from: d */
        final C43107b f99244d;

        /* renamed from: e */
        final C40757w.C40760c f99245e;

        /* renamed from: f */
        final AtomicReference f99246f = new AtomicReference();

        /* renamed from: g */
        final AtomicLong f99247g = new AtomicLong();

        /* renamed from: h */
        final boolean f99248h;

        /* renamed from: i */
        C43106a f99249i;

        /* renamed from: pd1.t$a$a */
        static final class C42187a implements Runnable {

            /* renamed from: d */
            final C43108c f99250d;

            /* renamed from: e */
            final long f99251e;

            C42187a(C43108c cVar, long j) {
                this.f99250d = cVar;
                this.f99251e = j;
            }

            public void run() {
                this.f99250d.mo94357l(this.f99251e);
            }
        }

        C42186a(C43107b bVar, C40757w.C40760c cVar, C43106a aVar, boolean z) {
            this.f99244d = bVar;
            this.f99245e = cVar;
            this.f99249i = aVar;
            this.f99248h = !z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo97662a(long j, C43108c cVar) {
            if (this.f99248h || Thread.currentThread() == get()) {
                cVar.mo94357l(j);
            } else {
                this.f99245e.mo95058b(new C42187a(cVar, j));
            }
        }

        /* renamed from: b */
        public void mo27070b(C43108c cVar) {
            if (C43259d.m124222f(this.f99246f, cVar)) {
                long andSet = this.f99247g.getAndSet(0);
                if (andSet != 0) {
                    mo97662a(andSet, cVar);
                }
            }
        }

        public void cancel() {
            C43259d.m124218a(this.f99246f);
            this.f99245e.dispose();
        }

        /* renamed from: l */
        public void mo94357l(long j) {
            if (C43259d.m124223g(j)) {
                C43108c cVar = (C43108c) this.f99246f.get();
                if (cVar != null) {
                    mo97662a(j, cVar);
                    return;
                }
                C43358c.m124395a(this.f99247g, j);
                C43108c cVar2 = (C43108c) this.f99246f.get();
                if (cVar2 != null) {
                    long andSet = this.f99247g.getAndSet(0);
                    if (andSet != 0) {
                        mo97662a(andSet, cVar2);
                    }
                }
            }
        }

        public void onComplete() {
            this.f99244d.onComplete();
            this.f99245e.dispose();
        }

        public void onError(Throwable th) {
            this.f99244d.onError(th);
            this.f99245e.dispose();
        }

        public void onNext(Object obj) {
            this.f99244d.onNext(obj);
        }

        public void run() {
            lazySet(Thread.currentThread());
            C43106a aVar = this.f99249i;
            this.f99249i = null;
            aVar.mo26347a(this);
        }
    }

    public C42185t(C40741h hVar, C40757w wVar, boolean z) {
        super(hVar);
        this.f99242f = wVar;
        this.f99243g = z;
    }

    /* renamed from: F */
    public void mo94348F(C43107b bVar) {
        C40757w.C40760c b = this.f99242f.mo95051b();
        C42186a aVar = new C42186a(bVar, b, this.f99110e, this.f99243g);
        bVar.mo27070b(aVar);
        b.mo95058b(aVar);
    }
}
