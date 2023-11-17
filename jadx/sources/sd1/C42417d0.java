package sd1;

import ed1.C40754t;
import ed1.C40756v;
import hd1.C41205b;
import kd1.C41498c;

/* renamed from: sd1.d0 */
public final class C42417d0 extends C42399a {

    /* renamed from: sd1.d0$a */
    static final class C42418a implements C40756v, C41205b {

        /* renamed from: d */
        final C40756v f99742d;

        /* renamed from: e */
        C41205b f99743e;

        C42418a(C40756v vVar) {
            this.f99742d = vVar;
        }

        public void dispose() {
            this.f99743e.dispose();
        }

        public boolean isDisposed() {
            return this.f99743e.isDisposed();
        }

        public void onComplete() {
            this.f99742d.onComplete();
        }

        public void onError(Throwable th) {
            this.f99742d.onError(th);
        }

        public void onNext(Object obj) {
            this.f99742d.onNext(obj);
        }

        public void onSubscribe(C41205b bVar) {
            if (C41498c.m120378l(this.f99743e, bVar)) {
                this.f99743e = bVar;
                this.f99742d.onSubscribe(this);
            }
        }
    }

    public C42417d0(C40754t tVar) {
        super(tVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: I0 */
    public void mo94344I0(C40756v vVar) {
        this.f99678d.mo95016c(new C42418a(vVar));
    }
}
