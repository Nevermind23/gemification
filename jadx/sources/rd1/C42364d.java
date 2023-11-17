package rd1;

import ed1.C40735b0;
import ed1.C40749p;
import ed1.C40754t;
import ed1.C40756v;
import ed1.C40764z;
import hd1.C41205b;
import id1.C41300a;
import java.util.concurrent.atomic.AtomicReference;
import jd1.C41405l;
import kd1.C41498c;
import ld1.C41692b;

/* renamed from: rd1.d */
public final class C42364d extends C40749p {

    /* renamed from: d */
    final C40735b0 f99601d;

    /* renamed from: e */
    final C41405l f99602e;

    /* renamed from: rd1.d$a */
    static final class C42365a extends AtomicReference implements C40756v, C40764z, C41205b {
        private static final long serialVersionUID = -8948264376121066672L;

        /* renamed from: d */
        final C40756v f99603d;

        /* renamed from: e */
        final C41405l f99604e;

        C42365a(C40756v vVar, C41405l lVar) {
            this.f99603d = vVar;
            this.f99604e = lVar;
        }

        /* renamed from: a */
        public void mo95096a(Object obj) {
            try {
                ((C40754t) C41692b.m120934e(this.f99604e.apply(obj), "The mapper returned a null Publisher")).mo95016c(this);
            } catch (Throwable th) {
                C41300a.m119661b(th);
                this.f99603d.onError(th);
            }
        }

        public void dispose() {
            C41498c.m120371a(this);
        }

        public boolean isDisposed() {
            return C41498c.m120372b((C41205b) get());
        }

        public void onComplete() {
            this.f99603d.onComplete();
        }

        public void onError(Throwable th) {
            this.f99603d.onError(th);
        }

        public void onNext(Object obj) {
            this.f99603d.onNext(obj);
        }

        public void onSubscribe(C41205b bVar) {
            C41498c.m120373c(this, bVar);
        }
    }

    public C42364d(C40735b0 b0Var, C41405l lVar) {
        this.f99601d = b0Var;
        this.f99602e = lVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: I0 */
    public void mo94344I0(C40756v vVar) {
        C42365a aVar = new C42365a(vVar, this.f99602e);
        vVar.onSubscribe(aVar);
        this.f99601d.mo94907c(aVar);
    }
}
