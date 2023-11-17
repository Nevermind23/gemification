package sd1;

import ae1.C40293a;
import ed1.C40734b;
import ed1.C40737d;
import ed1.C40749p;
import ed1.C40754t;
import ed1.C40756v;
import hd1.C41205b;
import md1.C41734c;

/* renamed from: sd1.f0 */
public final class C42433f0 extends C40734b implements C41734c {

    /* renamed from: d */
    final C40754t f99807d;

    /* renamed from: sd1.f0$a */
    static final class C42434a implements C40756v, C41205b {

        /* renamed from: d */
        final C40737d f99808d;

        /* renamed from: e */
        C41205b f99809e;

        C42434a(C40737d dVar) {
            this.f99808d = dVar;
        }

        public void dispose() {
            this.f99809e.dispose();
        }

        public boolean isDisposed() {
            return this.f99809e.isDisposed();
        }

        public void onComplete() {
            this.f99808d.onComplete();
        }

        public void onError(Throwable th) {
            this.f99808d.onError(th);
        }

        public void onNext(Object obj) {
        }

        public void onSubscribe(C41205b bVar) {
            this.f99809e = bVar;
            this.f99808d.onSubscribe(this);
        }
    }

    public C42433f0(C40754t tVar) {
        this.f99807d = tVar;
    }

    /* renamed from: H */
    public void mo94889H(C40737d dVar) {
        this.f99807d.mo95016c(new C42434a(dVar));
    }

    /* renamed from: b */
    public C40749p mo96527b() {
        return C40293a.m116717n(new C42424e0(this.f99807d));
    }
}
