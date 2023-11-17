package sd1;

import ae1.C40293a;
import ed1.C40749p;
import ed1.C40754t;
import ed1.C40756v;
import ed1.C40762x;
import ed1.C40764z;
import hd1.C41205b;
import id1.C41300a;
import java.util.Collection;
import java.util.concurrent.Callable;
import kd1.C41498c;
import kd1.C41499d;
import ld1.C41669a;
import ld1.C41692b;
import md1.C41734c;

/* renamed from: sd1.f1 */
public final class C42435f1 extends C40762x implements C41734c {

    /* renamed from: d */
    final C40754t f99810d;

    /* renamed from: e */
    final Callable f99811e;

    /* renamed from: sd1.f1$a */
    static final class C42436a implements C40756v, C41205b {

        /* renamed from: d */
        final C40764z f99812d;

        /* renamed from: e */
        Collection f99813e;

        /* renamed from: f */
        C41205b f99814f;

        C42436a(C40764z zVar, Collection collection) {
            this.f99812d = zVar;
            this.f99813e = collection;
        }

        public void dispose() {
            this.f99814f.dispose();
        }

        public boolean isDisposed() {
            return this.f99814f.isDisposed();
        }

        public void onComplete() {
            Collection collection = this.f99813e;
            this.f99813e = null;
            this.f99812d.mo95096a(collection);
        }

        public void onError(Throwable th) {
            this.f99813e = null;
            this.f99812d.onError(th);
        }

        public void onNext(Object obj) {
            this.f99813e.add(obj);
        }

        public void onSubscribe(C41205b bVar) {
            if (C41498c.m120378l(this.f99814f, bVar)) {
                this.f99814f = bVar;
                this.f99812d.onSubscribe(this);
            }
        }
    }

    public C42435f1(C40754t tVar, int i) {
        this.f99810d = tVar;
        this.f99811e = C41669a.m120907c(i);
    }

    /* renamed from: J */
    public void mo95071J(C40764z zVar) {
        try {
            this.f99810d.mo95016c(new C42436a(zVar, (Collection) C41692b.m120934e(this.f99811e.call(), "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.")));
        } catch (Throwable th) {
            C41300a.m119661b(th);
            C41499d.m120385o(th, zVar);
        }
    }

    /* renamed from: b */
    public C40749p mo96527b() {
        return C40293a.m116717n(new C42426e1(this.f99810d, this.f99811e));
    }
}
