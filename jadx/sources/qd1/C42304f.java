package qd1;

import ed1.C40737d;
import ed1.C40739f;
import ed1.C40744k;
import ed1.C40746m;
import ed1.C40748o;
import hd1.C41205b;
import java.util.concurrent.atomic.AtomicReference;
import kd1.C41498c;

/* renamed from: qd1.f */
public final class C42304f extends C40744k {

    /* renamed from: d */
    final C40748o f99488d;

    /* renamed from: e */
    final C40739f f99489e;

    /* renamed from: qd1.f$a */
    static final class C42305a implements C40746m {

        /* renamed from: d */
        final AtomicReference f99490d;

        /* renamed from: e */
        final C40746m f99491e;

        C42305a(AtomicReference atomicReference, C40746m mVar) {
            this.f99490d = atomicReference;
            this.f99491e = mVar;
        }

        /* renamed from: a */
        public void mo94967a(Object obj) {
            this.f99491e.mo94967a(obj);
        }

        public void onComplete() {
            this.f99491e.onComplete();
        }

        public void onError(Throwable th) {
            this.f99491e.onError(th);
        }

        public void onSubscribe(C41205b bVar) {
            C41498c.m120373c(this.f99490d, bVar);
        }
    }

    /* renamed from: qd1.f$b */
    static final class C42306b extends AtomicReference implements C40737d, C41205b {
        private static final long serialVersionUID = 703409937383992161L;

        /* renamed from: d */
        final C40746m f99492d;

        /* renamed from: e */
        final C40748o f99493e;

        C42306b(C40746m mVar, C40748o oVar) {
            this.f99492d = mVar;
            this.f99493e = oVar;
        }

        public void dispose() {
            C41498c.m120371a(this);
        }

        public boolean isDisposed() {
            return C41498c.m120372b((C41205b) get());
        }

        public void onComplete() {
            this.f99493e.mo94947c(new C42305a(this, this.f99492d));
        }

        public void onError(Throwable th) {
            this.f99492d.onError(th);
        }

        public void onSubscribe(C41205b bVar) {
            if (C41498c.m120376g(this, bVar)) {
                this.f99492d.onSubscribe(this);
            }
        }
    }

    public C42304f(C40748o oVar, C40739f fVar) {
        this.f99488d = oVar;
        this.f99489e = fVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public void mo94961w(C40746m mVar) {
        this.f99489e.mo94894a(new C42306b(mVar, this.f99488d));
    }
}
