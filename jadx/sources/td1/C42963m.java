package td1;

import ed1.C40735b0;
import ed1.C40762x;
import ed1.C40764z;
import hd1.C41205b;
import id1.C41300a;
import java.util.concurrent.atomic.AtomicReference;
import jd1.C41405l;
import kd1.C41498c;
import ld1.C41692b;

/* renamed from: td1.m */
public final class C42963m extends C40762x {

    /* renamed from: d */
    final C40735b0 f100276d;

    /* renamed from: e */
    final C41405l f100277e;

    /* renamed from: td1.m$a */
    static final class C42964a extends AtomicReference implements C40764z, C41205b {
        private static final long serialVersionUID = 3258103020495908596L;

        /* renamed from: d */
        final C40764z f100278d;

        /* renamed from: e */
        final C41405l f100279e;

        /* renamed from: td1.m$a$a */
        static final class C42965a implements C40764z {

            /* renamed from: d */
            final AtomicReference f100280d;

            /* renamed from: e */
            final C40764z f100281e;

            C42965a(AtomicReference atomicReference, C40764z zVar) {
                this.f100280d = atomicReference;
                this.f100281e = zVar;
            }

            /* renamed from: a */
            public void mo95096a(Object obj) {
                this.f100281e.mo95096a(obj);
            }

            public void onError(Throwable th) {
                this.f100281e.onError(th);
            }

            public void onSubscribe(C41205b bVar) {
                C41498c.m120373c(this.f100280d, bVar);
            }
        }

        C42964a(C40764z zVar, C41405l lVar) {
            this.f100278d = zVar;
            this.f100279e = lVar;
        }

        /* renamed from: a */
        public void mo95096a(Object obj) {
            try {
                C40735b0 b0Var = (C40735b0) C41692b.m120934e(this.f100279e.apply(obj), "The single returned by the mapper is null");
                if (!isDisposed()) {
                    b0Var.mo94907c(new C42965a(this, this.f100278d));
                }
            } catch (Throwable th) {
                C41300a.m119661b(th);
                this.f100278d.onError(th);
            }
        }

        public void dispose() {
            C41498c.m120371a(this);
        }

        public boolean isDisposed() {
            return C41498c.m120372b((C41205b) get());
        }

        public void onError(Throwable th) {
            this.f100278d.onError(th);
        }

        public void onSubscribe(C41205b bVar) {
            if (C41498c.m120376g(this, bVar)) {
                this.f100278d.onSubscribe(this);
            }
        }
    }

    public C42963m(C40735b0 b0Var, C41405l lVar) {
        this.f100277e = lVar;
        this.f100276d = b0Var;
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public void mo95071J(C40764z zVar) {
        this.f100276d.mo94907c(new C42964a(zVar, this.f100277e));
    }
}
