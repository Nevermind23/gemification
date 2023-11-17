package qd1;

import ed1.C40746m;
import ed1.C40748o;
import ed1.C40757w;
import hd1.C41205b;
import java.util.concurrent.atomic.AtomicReference;
import kd1.C41498c;
import kd1.C41502g;

/* renamed from: qd1.u */
public final class C42333u extends C42296a {

    /* renamed from: e */
    final C40757w f99545e;

    /* renamed from: qd1.u$a */
    static final class C42334a extends AtomicReference implements C40746m, C41205b {
        private static final long serialVersionUID = 8571289934935992137L;

        /* renamed from: d */
        final C41502g f99546d = new C41502g();

        /* renamed from: e */
        final C40746m f99547e;

        C42334a(C40746m mVar) {
            this.f99547e = mVar;
        }

        /* renamed from: a */
        public void mo94967a(Object obj) {
            this.f99547e.mo94967a(obj);
        }

        public void dispose() {
            C41498c.m120371a(this);
            this.f99546d.dispose();
        }

        public boolean isDisposed() {
            return C41498c.m120372b((C41205b) get());
        }

        public void onComplete() {
            this.f99547e.onComplete();
        }

        public void onError(Throwable th) {
            this.f99547e.onError(th);
        }

        public void onSubscribe(C41205b bVar) {
            C41498c.m120376g(this, bVar);
        }
    }

    /* renamed from: qd1.u$b */
    static final class C42335b implements Runnable {

        /* renamed from: d */
        final C40746m f99548d;

        /* renamed from: e */
        final C40748o f99549e;

        C42335b(C40746m mVar, C40748o oVar) {
            this.f99548d = mVar;
            this.f99549e = oVar;
        }

        public void run() {
            this.f99549e.mo94947c(this.f99548d);
        }
    }

    public C42333u(C40748o oVar, C40757w wVar) {
        super(oVar);
        this.f99545e = wVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public void mo94961w(C40746m mVar) {
        C42334a aVar = new C42334a(mVar);
        mVar.onSubscribe(aVar);
        aVar.f99546d.mo96265a(this.f99545e.mo95052c(new C42335b(aVar, this.f99467d)));
    }
}
