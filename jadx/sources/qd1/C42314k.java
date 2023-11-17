package qd1;

import ed1.C40746m;
import ed1.C40748o;
import hd1.C41205b;
import id1.C41300a;
import java.util.concurrent.atomic.AtomicReference;
import jd1.C41405l;
import kd1.C41498c;
import ld1.C41692b;

/* renamed from: qd1.k */
public final class C42314k extends C42296a {

    /* renamed from: e */
    final C41405l f99508e;

    /* renamed from: qd1.k$a */
    static final class C42315a extends AtomicReference implements C40746m, C41205b {
        private static final long serialVersionUID = 4375739915521278546L;

        /* renamed from: d */
        final C40746m f99509d;

        /* renamed from: e */
        final C41405l f99510e;

        /* renamed from: f */
        C41205b f99511f;

        /* renamed from: qd1.k$a$a */
        final class C42316a implements C40746m {
            C42316a() {
            }

            /* renamed from: a */
            public void mo94967a(Object obj) {
                C42315a.this.f99509d.mo94967a(obj);
            }

            public void onComplete() {
                C42315a.this.f99509d.onComplete();
            }

            public void onError(Throwable th) {
                C42315a.this.f99509d.onError(th);
            }

            public void onSubscribe(C41205b bVar) {
                C41498c.m120376g(C42315a.this, bVar);
            }
        }

        C42315a(C40746m mVar, C41405l lVar) {
            this.f99509d = mVar;
            this.f99510e = lVar;
        }

        /* renamed from: a */
        public void mo94967a(Object obj) {
            try {
                C40748o oVar = (C40748o) C41692b.m120934e(this.f99510e.apply(obj), "The mapper returned a null MaybeSource");
                if (!isDisposed()) {
                    oVar.mo94947c(new C42316a());
                }
            } catch (Exception e) {
                C41300a.m119661b(e);
                this.f99509d.onError(e);
            }
        }

        public void dispose() {
            C41498c.m120371a(this);
            this.f99511f.dispose();
        }

        public boolean isDisposed() {
            return C41498c.m120372b((C41205b) get());
        }

        public void onComplete() {
            this.f99509d.onComplete();
        }

        public void onError(Throwable th) {
            this.f99509d.onError(th);
        }

        public void onSubscribe(C41205b bVar) {
            if (C41498c.m120378l(this.f99511f, bVar)) {
                this.f99511f = bVar;
                this.f99509d.onSubscribe(this);
            }
        }
    }

    public C42314k(C40748o oVar, C41405l lVar) {
        super(oVar);
        this.f99508e = lVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public void mo94961w(C40746m mVar) {
        this.f99467d.mo94947c(new C42315a(mVar, this.f99508e));
    }
}
