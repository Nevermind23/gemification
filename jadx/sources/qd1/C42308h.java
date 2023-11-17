package qd1;

import ed1.C40746m;
import ed1.C40748o;
import hd1.C41205b;
import id1.C41300a;
import jd1.C41407n;
import kd1.C41498c;

/* renamed from: qd1.h */
public final class C42308h extends C42296a {

    /* renamed from: e */
    final C41407n f99495e;

    /* renamed from: qd1.h$a */
    static final class C42309a implements C40746m, C41205b {

        /* renamed from: d */
        final C40746m f99496d;

        /* renamed from: e */
        final C41407n f99497e;

        /* renamed from: f */
        C41205b f99498f;

        C42309a(C40746m mVar, C41407n nVar) {
            this.f99496d = mVar;
            this.f99497e = nVar;
        }

        /* renamed from: a */
        public void mo94967a(Object obj) {
            try {
                if (this.f99497e.test(obj)) {
                    this.f99496d.mo94967a(obj);
                } else {
                    this.f99496d.onComplete();
                }
            } catch (Throwable th) {
                C41300a.m119661b(th);
                this.f99496d.onError(th);
            }
        }

        public void dispose() {
            C41205b bVar = this.f99498f;
            this.f99498f = C41498c.DISPOSED;
            bVar.dispose();
        }

        public boolean isDisposed() {
            return this.f99498f.isDisposed();
        }

        public void onComplete() {
            this.f99496d.onComplete();
        }

        public void onError(Throwable th) {
            this.f99496d.onError(th);
        }

        public void onSubscribe(C41205b bVar) {
            if (C41498c.m120378l(this.f99498f, bVar)) {
                this.f99498f = bVar;
                this.f99496d.onSubscribe(this);
            }
        }
    }

    public C42308h(C40748o oVar, C41407n nVar) {
        super(oVar);
        this.f99495e = nVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public void mo94961w(C40746m mVar) {
        this.f99467d.mo94947c(new C42309a(mVar, this.f99495e));
    }
}
