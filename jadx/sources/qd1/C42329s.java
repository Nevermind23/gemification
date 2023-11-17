package qd1;

import ed1.C40746m;
import ed1.C40748o;
import hd1.C41205b;
import id1.C41300a;
import jd1.C41405l;
import kd1.C41498c;
import ld1.C41692b;
import p469io.reactivex.exceptions.CompositeException;

/* renamed from: qd1.s */
public final class C42329s extends C42296a {

    /* renamed from: e */
    final C41405l f99532e;

    /* renamed from: qd1.s$a */
    static final class C42330a implements C40746m, C41205b {

        /* renamed from: d */
        final C40746m f99533d;

        /* renamed from: e */
        final C41405l f99534e;

        /* renamed from: f */
        C41205b f99535f;

        C42330a(C40746m mVar, C41405l lVar) {
            this.f99533d = mVar;
            this.f99534e = lVar;
        }

        /* renamed from: a */
        public void mo94967a(Object obj) {
            this.f99533d.mo94967a(obj);
        }

        public void dispose() {
            this.f99535f.dispose();
        }

        public boolean isDisposed() {
            return this.f99535f.isDisposed();
        }

        public void onComplete() {
            this.f99533d.onComplete();
        }

        public void onError(Throwable th) {
            try {
                this.f99533d.mo94967a(C41692b.m120934e(this.f99534e.apply(th), "The valueSupplier returned a null value"));
            } catch (Throwable th2) {
                C41300a.m119661b(th2);
                this.f99533d.onError(new CompositeException(th, th2));
            }
        }

        public void onSubscribe(C41205b bVar) {
            if (C41498c.m120378l(this.f99535f, bVar)) {
                this.f99535f = bVar;
                this.f99533d.onSubscribe(this);
            }
        }
    }

    public C42329s(C40748o oVar, C41405l lVar) {
        super(oVar);
        this.f99532e = lVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public void mo94961w(C40746m mVar) {
        this.f99467d.mo94947c(new C42330a(mVar, this.f99532e));
    }
}
