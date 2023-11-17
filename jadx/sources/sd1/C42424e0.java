package sd1;

import ed1.C40754t;
import ed1.C40756v;
import hd1.C41205b;

/* renamed from: sd1.e0 */
public final class C42424e0 extends C42399a {

    /* renamed from: sd1.e0$a */
    static final class C42425a implements C40756v, C41205b {

        /* renamed from: d */
        final C40756v f99772d;

        /* renamed from: e */
        C41205b f99773e;

        C42425a(C40756v vVar) {
            this.f99772d = vVar;
        }

        public void dispose() {
            this.f99773e.dispose();
        }

        public boolean isDisposed() {
            return this.f99773e.isDisposed();
        }

        public void onComplete() {
            this.f99772d.onComplete();
        }

        public void onError(Throwable th) {
            this.f99772d.onError(th);
        }

        public void onNext(Object obj) {
        }

        public void onSubscribe(C41205b bVar) {
            this.f99773e = bVar;
            this.f99772d.onSubscribe(this);
        }
    }

    public C42424e0(C40754t tVar) {
        super(tVar);
    }

    /* renamed from: I0 */
    public void mo94344I0(C40756v vVar) {
        this.f99678d.mo95016c(new C42425a(vVar));
    }
}
