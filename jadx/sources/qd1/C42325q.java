package qd1;

import ed1.C40746m;
import ed1.C40748o;
import hd1.C41205b;
import id1.C41300a;
import jd1.C41405l;
import kd1.C41498c;
import ld1.C41692b;

/* renamed from: qd1.q */
public final class C42325q extends C42296a {

    /* renamed from: e */
    final C41405l f99523e;

    /* renamed from: qd1.q$a */
    static final class C42326a implements C40746m, C41205b {

        /* renamed from: d */
        final C40746m f99524d;

        /* renamed from: e */
        final C41405l f99525e;

        /* renamed from: f */
        C41205b f99526f;

        C42326a(C40746m mVar, C41405l lVar) {
            this.f99524d = mVar;
            this.f99525e = lVar;
        }

        /* renamed from: a */
        public void mo94967a(Object obj) {
            try {
                this.f99524d.mo94967a(C41692b.m120934e(this.f99525e.apply(obj), "The mapper returned a null item"));
            } catch (Throwable th) {
                C41300a.m119661b(th);
                this.f99524d.onError(th);
            }
        }

        public void dispose() {
            C41205b bVar = this.f99526f;
            this.f99526f = C41498c.DISPOSED;
            bVar.dispose();
        }

        public boolean isDisposed() {
            return this.f99526f.isDisposed();
        }

        public void onComplete() {
            this.f99524d.onComplete();
        }

        public void onError(Throwable th) {
            this.f99524d.onError(th);
        }

        public void onSubscribe(C41205b bVar) {
            if (C41498c.m120378l(this.f99526f, bVar)) {
                this.f99526f = bVar;
                this.f99524d.onSubscribe(this);
            }
        }
    }

    public C42325q(C40748o oVar, C41405l lVar) {
        super(oVar);
        this.f99523e = lVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public void mo94961w(C40746m mVar) {
        this.f99467d.mo94947c(new C42326a(mVar, this.f99523e));
    }
}
