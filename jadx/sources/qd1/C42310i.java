package qd1;

import ed1.C40735b0;
import ed1.C40744k;
import ed1.C40746m;
import ed1.C40764z;
import hd1.C41205b;
import id1.C41300a;
import jd1.C41407n;
import kd1.C41498c;

/* renamed from: qd1.i */
public final class C42310i extends C40744k {

    /* renamed from: d */
    final C40735b0 f99499d;

    /* renamed from: e */
    final C41407n f99500e;

    /* renamed from: qd1.i$a */
    static final class C42311a implements C40764z, C41205b {

        /* renamed from: d */
        final C40746m f99501d;

        /* renamed from: e */
        final C41407n f99502e;

        /* renamed from: f */
        C41205b f99503f;

        C42311a(C40746m mVar, C41407n nVar) {
            this.f99501d = mVar;
            this.f99502e = nVar;
        }

        /* renamed from: a */
        public void mo95096a(Object obj) {
            try {
                if (this.f99502e.test(obj)) {
                    this.f99501d.mo94967a(obj);
                } else {
                    this.f99501d.onComplete();
                }
            } catch (Throwable th) {
                C41300a.m119661b(th);
                this.f99501d.onError(th);
            }
        }

        public void dispose() {
            C41205b bVar = this.f99503f;
            this.f99503f = C41498c.DISPOSED;
            bVar.dispose();
        }

        public boolean isDisposed() {
            return this.f99503f.isDisposed();
        }

        public void onError(Throwable th) {
            this.f99501d.onError(th);
        }

        public void onSubscribe(C41205b bVar) {
            if (C41498c.m120378l(this.f99503f, bVar)) {
                this.f99503f = bVar;
                this.f99501d.onSubscribe(this);
            }
        }
    }

    public C42310i(C40735b0 b0Var, C41407n nVar) {
        this.f99499d = b0Var;
        this.f99500e = nVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public void mo94961w(C40746m mVar) {
        this.f99499d.mo94907c(new C42311a(mVar, this.f99500e));
    }
}
