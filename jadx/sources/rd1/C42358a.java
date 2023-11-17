package rd1;

import ed1.C40737d;
import ed1.C40739f;
import ed1.C40749p;
import ed1.C40754t;
import ed1.C40756v;
import hd1.C41205b;
import java.util.concurrent.atomic.AtomicReference;
import kd1.C41498c;

/* renamed from: rd1.a */
public final class C42358a extends C40749p {

    /* renamed from: d */
    final C40739f f99585d;

    /* renamed from: e */
    final C40754t f99586e;

    /* renamed from: rd1.a$a */
    static final class C42359a extends AtomicReference implements C40756v, C40737d, C41205b {
        private static final long serialVersionUID = -8948264376121066672L;

        /* renamed from: d */
        final C40756v f99587d;

        /* renamed from: e */
        C40754t f99588e;

        C42359a(C40756v vVar, C40754t tVar) {
            this.f99588e = tVar;
            this.f99587d = vVar;
        }

        public void dispose() {
            C41498c.m120371a(this);
        }

        public boolean isDisposed() {
            return C41498c.m120372b((C41205b) get());
        }

        public void onComplete() {
            C40754t tVar = this.f99588e;
            if (tVar == null) {
                this.f99587d.onComplete();
                return;
            }
            this.f99588e = null;
            tVar.mo95016c(this);
        }

        public void onError(Throwable th) {
            this.f99587d.onError(th);
        }

        public void onNext(Object obj) {
            this.f99587d.onNext(obj);
        }

        public void onSubscribe(C41205b bVar) {
            C41498c.m120373c(this, bVar);
        }
    }

    public C42358a(C40739f fVar, C40754t tVar) {
        this.f99585d = fVar;
        this.f99586e = tVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: I0 */
    public void mo94344I0(C40756v vVar) {
        C42359a aVar = new C42359a(vVar, this.f99586e);
        vVar.onSubscribe(aVar);
        this.f99585d.mo94894a(aVar);
    }
}
