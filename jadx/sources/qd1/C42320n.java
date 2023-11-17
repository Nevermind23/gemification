package qd1;

import ed1.C40746m;
import ed1.C40748o;
import hd1.C41205b;
import kd1.C41498c;

/* renamed from: qd1.n */
public final class C42320n extends C42296a {

    /* renamed from: qd1.n$a */
    static final class C42321a implements C40746m, C41205b {

        /* renamed from: d */
        final C40746m f99517d;

        /* renamed from: e */
        C41205b f99518e;

        C42321a(C40746m mVar) {
            this.f99517d = mVar;
        }

        /* renamed from: a */
        public void mo94967a(Object obj) {
            this.f99518e = C41498c.DISPOSED;
            this.f99517d.onComplete();
        }

        public void dispose() {
            this.f99518e.dispose();
            this.f99518e = C41498c.DISPOSED;
        }

        public boolean isDisposed() {
            return this.f99518e.isDisposed();
        }

        public void onComplete() {
            this.f99518e = C41498c.DISPOSED;
            this.f99517d.onComplete();
        }

        public void onError(Throwable th) {
            this.f99518e = C41498c.DISPOSED;
            this.f99517d.onError(th);
        }

        public void onSubscribe(C41205b bVar) {
            if (C41498c.m120378l(this.f99518e, bVar)) {
                this.f99518e = bVar;
                this.f99517d.onSubscribe(this);
            }
        }
    }

    public C42320n(C40748o oVar) {
        super(oVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public void mo94961w(C40746m mVar) {
        this.f99467d.mo94947c(new C42321a(mVar));
    }
}
