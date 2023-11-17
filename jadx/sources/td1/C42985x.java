package td1;

import ae1.C40293a;
import ed1.C40735b0;
import ed1.C40757w;
import ed1.C40762x;
import ed1.C40764z;
import hd1.C41205b;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import kd1.C41498c;
import yd1.C43364i;

/* renamed from: td1.x */
public final class C42985x extends C40762x {

    /* renamed from: d */
    final C40735b0 f100321d;

    /* renamed from: e */
    final long f100322e;

    /* renamed from: f */
    final TimeUnit f100323f;

    /* renamed from: g */
    final C40757w f100324g;

    /* renamed from: h */
    final C40735b0 f100325h;

    /* renamed from: td1.x$a */
    static final class C42986a extends AtomicReference implements C40764z, Runnable, C41205b {
        private static final long serialVersionUID = 37497744973048446L;

        /* renamed from: d */
        final C40764z f100326d;

        /* renamed from: e */
        final AtomicReference f100327e = new AtomicReference();

        /* renamed from: f */
        final C42987a f100328f;

        /* renamed from: g */
        C40735b0 f100329g;

        /* renamed from: h */
        final long f100330h;

        /* renamed from: i */
        final TimeUnit f100331i;

        /* renamed from: td1.x$a$a */
        static final class C42987a extends AtomicReference implements C40764z {
            private static final long serialVersionUID = 2071387740092105509L;

            /* renamed from: d */
            final C40764z f100332d;

            C42987a(C40764z zVar) {
                this.f100332d = zVar;
            }

            /* renamed from: a */
            public void mo95096a(Object obj) {
                this.f100332d.mo95096a(obj);
            }

            public void onError(Throwable th) {
                this.f100332d.onError(th);
            }

            public void onSubscribe(C41205b bVar) {
                C41498c.m120376g(this, bVar);
            }
        }

        C42986a(C40764z zVar, C40735b0 b0Var, long j, TimeUnit timeUnit) {
            this.f100326d = zVar;
            this.f100329g = b0Var;
            this.f100330h = j;
            this.f100331i = timeUnit;
            if (b0Var != null) {
                this.f100328f = new C42987a(zVar);
            } else {
                this.f100328f = null;
            }
        }

        /* renamed from: a */
        public void mo95096a(Object obj) {
            C41205b bVar = (C41205b) get();
            C41498c cVar = C41498c.DISPOSED;
            if (bVar != cVar && compareAndSet(bVar, cVar)) {
                C41498c.m120371a(this.f100327e);
                this.f100326d.mo95096a(obj);
            }
        }

        public void dispose() {
            C41498c.m120371a(this);
            C41498c.m120371a(this.f100327e);
            C42987a aVar = this.f100328f;
            if (aVar != null) {
                C41498c.m120371a(aVar);
            }
        }

        public boolean isDisposed() {
            return C41498c.m120372b((C41205b) get());
        }

        public void onError(Throwable th) {
            C41205b bVar = (C41205b) get();
            C41498c cVar = C41498c.DISPOSED;
            if (bVar == cVar || !compareAndSet(bVar, cVar)) {
                C40293a.m116722s(th);
                return;
            }
            C41498c.m120371a(this.f100327e);
            this.f100326d.onError(th);
        }

        public void onSubscribe(C41205b bVar) {
            C41498c.m120376g(this, bVar);
        }

        public void run() {
            C41205b bVar = (C41205b) get();
            C41498c cVar = C41498c.DISPOSED;
            if (bVar != cVar && compareAndSet(bVar, cVar)) {
                if (bVar != null) {
                    bVar.dispose();
                }
                C40735b0 b0Var = this.f100329g;
                if (b0Var == null) {
                    this.f100326d.onError(new TimeoutException(C43364i.m124411d(this.f100330h, this.f100331i)));
                    return;
                }
                this.f100329g = null;
                b0Var.mo94907c(this.f100328f);
            }
        }
    }

    public C42985x(C40735b0 b0Var, long j, TimeUnit timeUnit, C40757w wVar, C40735b0 b0Var2) {
        this.f100321d = b0Var;
        this.f100322e = j;
        this.f100323f = timeUnit;
        this.f100324g = wVar;
        this.f100325h = b0Var2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public void mo95071J(C40764z zVar) {
        C42986a aVar = new C42986a(zVar, this.f100325h, this.f100322e, this.f100323f);
        zVar.onSubscribe(aVar);
        C41498c.m120373c(aVar.f100327e, this.f100324g.mo95053d(aVar, this.f100322e, this.f100323f));
        this.f100321d.mo94907c(aVar);
    }
}
