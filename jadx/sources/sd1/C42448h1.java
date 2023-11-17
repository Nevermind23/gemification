package sd1;

import ed1.C40754t;
import ed1.C40756v;
import hd1.C41205b;
import id1.C41300a;
import java.util.concurrent.atomic.AtomicReference;
import jd1.C41396c;
import kd1.C41498c;
import ld1.C41692b;
import p469io.reactivex.observers.C41381b;

/* renamed from: sd1.h1 */
public final class C42448h1 extends C42399a {

    /* renamed from: e */
    final C41396c f99844e;

    /* renamed from: f */
    final C40754t f99845f;

    /* renamed from: sd1.h1$a */
    static final class C42449a extends AtomicReference implements C40756v, C41205b {
        private static final long serialVersionUID = -312246233408980075L;

        /* renamed from: d */
        final C40756v f99846d;

        /* renamed from: e */
        final C41396c f99847e;

        /* renamed from: f */
        final AtomicReference f99848f = new AtomicReference();

        /* renamed from: g */
        final AtomicReference f99849g = new AtomicReference();

        C42449a(C40756v vVar, C41396c cVar) {
            this.f99846d = vVar;
            this.f99847e = cVar;
        }

        /* renamed from: a */
        public void mo97899a(Throwable th) {
            C41498c.m120371a(this.f99848f);
            this.f99846d.onError(th);
        }

        /* renamed from: b */
        public boolean mo97900b(C41205b bVar) {
            return C41498c.m120376g(this.f99849g, bVar);
        }

        public void dispose() {
            C41498c.m120371a(this.f99848f);
            C41498c.m120371a(this.f99849g);
        }

        public boolean isDisposed() {
            return C41498c.m120372b((C41205b) this.f99848f.get());
        }

        public void onComplete() {
            C41498c.m120371a(this.f99849g);
            this.f99846d.onComplete();
        }

        public void onError(Throwable th) {
            C41498c.m120371a(this.f99849g);
            this.f99846d.onError(th);
        }

        public void onNext(Object obj) {
            Object obj2 = get();
            if (obj2 != null) {
                try {
                    this.f99846d.onNext(C41692b.m120934e(this.f99847e.apply(obj, obj2), "The combiner returned a null value"));
                } catch (Throwable th) {
                    C41300a.m119661b(th);
                    dispose();
                    this.f99846d.onError(th);
                }
            }
        }

        public void onSubscribe(C41205b bVar) {
            C41498c.m120376g(this.f99848f, bVar);
        }
    }

    /* renamed from: sd1.h1$b */
    final class C42450b implements C40756v {

        /* renamed from: d */
        private final C42449a f99850d;

        C42450b(C42449a aVar) {
            this.f99850d = aVar;
        }

        public void onComplete() {
        }

        public void onError(Throwable th) {
            this.f99850d.mo97899a(th);
        }

        public void onNext(Object obj) {
            this.f99850d.lazySet(obj);
        }

        public void onSubscribe(C41205b bVar) {
            this.f99850d.mo97900b(bVar);
        }
    }

    public C42448h1(C40754t tVar, C41396c cVar, C40754t tVar2) {
        super(tVar);
        this.f99844e = cVar;
        this.f99845f = tVar2;
    }

    /* renamed from: I0 */
    public void mo94344I0(C40756v vVar) {
        C41381b bVar = new C41381b(vVar);
        C42449a aVar = new C42449a(bVar, this.f99844e);
        bVar.onSubscribe(aVar);
        this.f99845f.mo95016c(new C42450b(aVar));
        this.f99678d.mo95016c(aVar);
    }
}
