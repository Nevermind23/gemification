package qd1;

import ed1.C40746m;
import ed1.C40748o;
import hd1.C41205b;
import java.util.concurrent.atomic.AtomicReference;
import kd1.C41498c;

/* renamed from: qd1.v */
public final class C42336v extends C42296a {

    /* renamed from: e */
    final C40748o f99550e;

    /* renamed from: qd1.v$a */
    static final class C42337a extends AtomicReference implements C40746m, C41205b {
        private static final long serialVersionUID = -2223459372976438024L;

        /* renamed from: d */
        final C40746m f99551d;

        /* renamed from: e */
        final C40748o f99552e;

        /* renamed from: qd1.v$a$a */
        static final class C42338a implements C40746m {

            /* renamed from: d */
            final C40746m f99553d;

            /* renamed from: e */
            final AtomicReference f99554e;

            C42338a(C40746m mVar, AtomicReference atomicReference) {
                this.f99553d = mVar;
                this.f99554e = atomicReference;
            }

            /* renamed from: a */
            public void mo94967a(Object obj) {
                this.f99553d.mo94967a(obj);
            }

            public void onComplete() {
                this.f99553d.onComplete();
            }

            public void onError(Throwable th) {
                this.f99553d.onError(th);
            }

            public void onSubscribe(C41205b bVar) {
                C41498c.m120376g(this.f99554e, bVar);
            }
        }

        C42337a(C40746m mVar, C40748o oVar) {
            this.f99551d = mVar;
            this.f99552e = oVar;
        }

        /* renamed from: a */
        public void mo94967a(Object obj) {
            this.f99551d.mo94967a(obj);
        }

        public void dispose() {
            C41498c.m120371a(this);
        }

        public boolean isDisposed() {
            return C41498c.m120372b((C41205b) get());
        }

        public void onComplete() {
            C41205b bVar = (C41205b) get();
            if (bVar != C41498c.DISPOSED && compareAndSet(bVar, (Object) null)) {
                this.f99552e.mo94947c(new C42338a(this.f99551d, this));
            }
        }

        public void onError(Throwable th) {
            this.f99551d.onError(th);
        }

        public void onSubscribe(C41205b bVar) {
            if (C41498c.m120376g(this, bVar)) {
                this.f99551d.onSubscribe(this);
            }
        }
    }

    public C42336v(C40748o oVar, C40748o oVar2) {
        super(oVar);
        this.f99550e = oVar2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public void mo94961w(C40746m mVar) {
        this.f99467d.mo94947c(new C42337a(mVar, this.f99550e));
    }
}
