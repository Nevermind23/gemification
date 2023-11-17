package sd1;

import ed1.C40754t;
import ed1.C40756v;
import hd1.C41205b;
import id1.C41300a;
import java.util.Collection;
import java.util.concurrent.Callable;
import kd1.C41498c;
import kd1.C41499d;
import ld1.C41692b;

/* renamed from: sd1.e1 */
public final class C42426e1 extends C42399a {

    /* renamed from: e */
    final Callable f99774e;

    /* renamed from: sd1.e1$a */
    static final class C42427a implements C40756v, C41205b {

        /* renamed from: d */
        final C40756v f99775d;

        /* renamed from: e */
        C41205b f99776e;

        /* renamed from: f */
        Collection f99777f;

        C42427a(C40756v vVar, Collection collection) {
            this.f99775d = vVar;
            this.f99777f = collection;
        }

        public void dispose() {
            this.f99776e.dispose();
        }

        public boolean isDisposed() {
            return this.f99776e.isDisposed();
        }

        public void onComplete() {
            Collection collection = this.f99777f;
            this.f99777f = null;
            this.f99775d.onNext(collection);
            this.f99775d.onComplete();
        }

        public void onError(Throwable th) {
            this.f99777f = null;
            this.f99775d.onError(th);
        }

        public void onNext(Object obj) {
            this.f99777f.add(obj);
        }

        public void onSubscribe(C41205b bVar) {
            if (C41498c.m120378l(this.f99776e, bVar)) {
                this.f99776e = bVar;
                this.f99775d.onSubscribe(this);
            }
        }
    }

    public C42426e1(C40754t tVar, Callable callable) {
        super(tVar);
        this.f99774e = callable;
    }

    /* renamed from: I0 */
    public void mo94344I0(C40756v vVar) {
        try {
            this.f99678d.mo95016c(new C42427a(vVar, (Collection) C41692b.m120934e(this.f99774e.call(), "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.")));
        } catch (Throwable th) {
            C41300a.m119661b(th);
            C41499d.m120384n(th, vVar);
        }
    }
}
