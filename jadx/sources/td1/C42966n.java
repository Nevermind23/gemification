package td1;

import ed1.C40734b;
import ed1.C40735b0;
import ed1.C40737d;
import ed1.C40739f;
import ed1.C40764z;
import hd1.C41205b;
import id1.C41300a;
import java.util.concurrent.atomic.AtomicReference;
import jd1.C41405l;
import kd1.C41498c;
import ld1.C41692b;

/* renamed from: td1.n */
public final class C42966n extends C40734b {

    /* renamed from: d */
    final C40735b0 f100282d;

    /* renamed from: e */
    final C41405l f100283e;

    /* renamed from: td1.n$a */
    static final class C42967a extends AtomicReference implements C40764z, C40737d, C41205b {
        private static final long serialVersionUID = -2177128922851101253L;

        /* renamed from: d */
        final C40737d f100284d;

        /* renamed from: e */
        final C41405l f100285e;

        C42967a(C40737d dVar, C41405l lVar) {
            this.f100284d = dVar;
            this.f100285e = lVar;
        }

        /* renamed from: a */
        public void mo95096a(Object obj) {
            try {
                C40739f fVar = (C40739f) C41692b.m120934e(this.f100285e.apply(obj), "The mapper returned a null CompletableSource");
                if (!isDisposed()) {
                    fVar.mo94894a(this);
                }
            } catch (Throwable th) {
                C41300a.m119661b(th);
                onError(th);
            }
        }

        public void dispose() {
            C41498c.m120371a(this);
        }

        public boolean isDisposed() {
            return C41498c.m120372b((C41205b) get());
        }

        public void onComplete() {
            this.f100284d.onComplete();
        }

        public void onError(Throwable th) {
            this.f100284d.onError(th);
        }

        public void onSubscribe(C41205b bVar) {
            C41498c.m120373c(this, bVar);
        }
    }

    public C42966n(C40735b0 b0Var, C41405l lVar) {
        this.f100282d = b0Var;
        this.f100283e = lVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public void mo94889H(C40737d dVar) {
        C42967a aVar = new C42967a(dVar, this.f100283e);
        dVar.onSubscribe(aVar);
        this.f100282d.mo94907c(aVar);
    }
}
