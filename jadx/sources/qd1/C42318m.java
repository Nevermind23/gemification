package qd1;

import ed1.C40735b0;
import ed1.C40744k;
import ed1.C40746m;
import ed1.C40764z;
import hd1.C41205b;
import kd1.C41498c;

/* renamed from: qd1.m */
public final class C42318m extends C40744k {

    /* renamed from: d */
    final C40735b0 f99514d;

    /* renamed from: qd1.m$a */
    static final class C42319a implements C40764z, C41205b {

        /* renamed from: d */
        final C40746m f99515d;

        /* renamed from: e */
        C41205b f99516e;

        C42319a(C40746m mVar) {
            this.f99515d = mVar;
        }

        /* renamed from: a */
        public void mo95096a(Object obj) {
            this.f99516e = C41498c.DISPOSED;
            this.f99515d.mo94967a(obj);
        }

        public void dispose() {
            this.f99516e.dispose();
            this.f99516e = C41498c.DISPOSED;
        }

        public boolean isDisposed() {
            return this.f99516e.isDisposed();
        }

        public void onError(Throwable th) {
            this.f99516e = C41498c.DISPOSED;
            this.f99515d.onError(th);
        }

        public void onSubscribe(C41205b bVar) {
            if (C41498c.m120378l(this.f99516e, bVar)) {
                this.f99516e = bVar;
                this.f99515d.onSubscribe(this);
            }
        }
    }

    public C42318m(C40735b0 b0Var) {
        this.f99514d = b0Var;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public void mo94961w(C40746m mVar) {
        this.f99514d.mo94907c(new C42319a(mVar));
    }
}
