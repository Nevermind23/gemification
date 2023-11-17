package od1;

import ed1.C40734b;
import ed1.C40737d;
import ed1.C40739f;
import hd1.C41205b;
import id1.C41300a;
import java.util.concurrent.atomic.AtomicReference;
import jd1.C41405l;
import kd1.C41498c;
import ld1.C41692b;
import p469io.reactivex.exceptions.CompositeException;

/* renamed from: od1.r */
public final class C41842r extends C40734b {

    /* renamed from: d */
    final C40739f f98211d;

    /* renamed from: e */
    final C41405l f98212e;

    /* renamed from: od1.r$a */
    static final class C41843a extends AtomicReference implements C40737d, C41205b {
        private static final long serialVersionUID = 5018523762564524046L;

        /* renamed from: d */
        final C40737d f98213d;

        /* renamed from: e */
        final C41405l f98214e;

        /* renamed from: f */
        boolean f98215f;

        C41843a(C40737d dVar, C41405l lVar) {
            this.f98213d = dVar;
            this.f98214e = lVar;
        }

        public void dispose() {
            C41498c.m120371a(this);
        }

        public boolean isDisposed() {
            return C41498c.m120372b((C41205b) get());
        }

        public void onComplete() {
            this.f98213d.onComplete();
        }

        public void onError(Throwable th) {
            if (this.f98215f) {
                this.f98213d.onError(th);
                return;
            }
            this.f98215f = true;
            try {
                ((C40739f) C41692b.m120934e(this.f98214e.apply(th), "The errorMapper returned a null CompletableSource")).mo94894a(this);
            } catch (Throwable th2) {
                C41300a.m119661b(th2);
                this.f98213d.onError(new CompositeException(th, th2));
            }
        }

        public void onSubscribe(C41205b bVar) {
            C41498c.m120373c(this, bVar);
        }
    }

    public C41842r(C40739f fVar, C41405l lVar) {
        this.f98211d = fVar;
        this.f98212e = lVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public void mo94889H(C40737d dVar) {
        C41843a aVar = new C41843a(dVar, this.f98212e);
        dVar.onSubscribe(aVar);
        this.f98211d.mo94894a(aVar);
    }
}
