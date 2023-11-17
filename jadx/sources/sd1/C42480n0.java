package sd1;

import ed1.C40754t;
import ed1.C40756v;
import hd1.C41205b;
import id1.C41300a;
import jd1.C41405l;
import kd1.C41498c;
import p469io.reactivex.exceptions.CompositeException;

/* renamed from: sd1.n0 */
public final class C42480n0 extends C42399a {

    /* renamed from: e */
    final C41405l f99954e;

    /* renamed from: sd1.n0$a */
    static final class C42481a implements C40756v, C41205b {

        /* renamed from: d */
        final C40756v f99955d;

        /* renamed from: e */
        final C41405l f99956e;

        /* renamed from: f */
        C41205b f99957f;

        C42481a(C40756v vVar, C41405l lVar) {
            this.f99955d = vVar;
            this.f99956e = lVar;
        }

        public void dispose() {
            this.f99957f.dispose();
        }

        public boolean isDisposed() {
            return this.f99957f.isDisposed();
        }

        public void onComplete() {
            this.f99955d.onComplete();
        }

        public void onError(Throwable th) {
            try {
                Object apply = this.f99956e.apply(th);
                if (apply == null) {
                    NullPointerException nullPointerException = new NullPointerException("The supplied value is null");
                    nullPointerException.initCause(th);
                    this.f99955d.onError(nullPointerException);
                    return;
                }
                this.f99955d.onNext(apply);
                this.f99955d.onComplete();
            } catch (Throwable th2) {
                C41300a.m119661b(th2);
                this.f99955d.onError(new CompositeException(th, th2));
            }
        }

        public void onNext(Object obj) {
            this.f99955d.onNext(obj);
        }

        public void onSubscribe(C41205b bVar) {
            if (C41498c.m120378l(this.f99957f, bVar)) {
                this.f99957f = bVar;
                this.f99955d.onSubscribe(this);
            }
        }
    }

    public C42480n0(C40754t tVar, C41405l lVar) {
        super(tVar);
        this.f99954e = lVar;
    }

    /* renamed from: I0 */
    public void mo94344I0(C40756v vVar) {
        this.f99678d.mo95016c(new C42481a(vVar, this.f99954e));
    }
}
