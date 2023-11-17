package qd1;

import ed1.C40734b;
import ed1.C40737d;
import ed1.C40739f;
import ed1.C40746m;
import ed1.C40748o;
import hd1.C41205b;
import id1.C41300a;
import java.util.concurrent.atomic.AtomicReference;
import jd1.C41405l;
import kd1.C41498c;
import ld1.C41692b;

/* renamed from: qd1.j */
public final class C42312j extends C40734b {

    /* renamed from: d */
    final C40748o f99504d;

    /* renamed from: e */
    final C41405l f99505e;

    /* renamed from: qd1.j$a */
    static final class C42313a extends AtomicReference implements C40746m, C40737d, C41205b {
        private static final long serialVersionUID = -2177128922851101253L;

        /* renamed from: d */
        final C40737d f99506d;

        /* renamed from: e */
        final C41405l f99507e;

        C42313a(C40737d dVar, C41405l lVar) {
            this.f99506d = dVar;
            this.f99507e = lVar;
        }

        /* renamed from: a */
        public void mo94967a(Object obj) {
            try {
                C40739f fVar = (C40739f) C41692b.m120934e(this.f99507e.apply(obj), "The mapper returned a null CompletableSource");
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
            this.f99506d.onComplete();
        }

        public void onError(Throwable th) {
            this.f99506d.onError(th);
        }

        public void onSubscribe(C41205b bVar) {
            C41498c.m120373c(this, bVar);
        }
    }

    public C42312j(C40748o oVar, C41405l lVar) {
        this.f99504d = oVar;
        this.f99505e = lVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public void mo94889H(C40737d dVar) {
        C42313a aVar = new C42313a(dVar, this.f99505e);
        dVar.onSubscribe(aVar);
        this.f99504d.mo94947c(aVar);
    }
}
