package qd1;

import ae1.C40293a;
import ed1.C40734b;
import ed1.C40737d;
import ed1.C40744k;
import ed1.C40746m;
import ed1.C40748o;
import hd1.C41205b;
import kd1.C41498c;
import md1.C41733b;

/* renamed from: qd1.o */
public final class C42322o extends C40734b implements C41733b {

    /* renamed from: d */
    final C40748o f99519d;

    /* renamed from: qd1.o$a */
    static final class C42323a implements C40746m, C41205b {

        /* renamed from: d */
        final C40737d f99520d;

        /* renamed from: e */
        C41205b f99521e;

        C42323a(C40737d dVar) {
            this.f99520d = dVar;
        }

        /* renamed from: a */
        public void mo94967a(Object obj) {
            this.f99521e = C41498c.DISPOSED;
            this.f99520d.onComplete();
        }

        public void dispose() {
            this.f99521e.dispose();
            this.f99521e = C41498c.DISPOSED;
        }

        public boolean isDisposed() {
            return this.f99521e.isDisposed();
        }

        public void onComplete() {
            this.f99521e = C41498c.DISPOSED;
            this.f99520d.onComplete();
        }

        public void onError(Throwable th) {
            this.f99521e = C41498c.DISPOSED;
            this.f99520d.onError(th);
        }

        public void onSubscribe(C41205b bVar) {
            if (C41498c.m120378l(this.f99521e, bVar)) {
                this.f99521e = bVar;
                this.f99520d.onSubscribe(this);
            }
        }
    }

    public C42322o(C40748o oVar) {
        this.f99519d = oVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public void mo94889H(C40737d dVar) {
        this.f99519d.mo94947c(new C42323a(dVar));
    }

    /* renamed from: c */
    public C40744k mo96526c() {
        return C40293a.m116716m(new C42320n(this.f99519d));
    }
}
