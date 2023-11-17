package qd1;

import ed1.C40746m;
import ed1.C40748o;
import ed1.C40757w;
import hd1.C41205b;
import java.util.concurrent.atomic.AtomicReference;
import kd1.C41498c;

/* renamed from: qd1.r */
public final class C42327r extends C42296a {

    /* renamed from: e */
    final C40757w f99527e;

    /* renamed from: qd1.r$a */
    static final class C42328a extends AtomicReference implements C40746m, C41205b, Runnable {
        private static final long serialVersionUID = 8571289934935992137L;

        /* renamed from: d */
        final C40746m f99528d;

        /* renamed from: e */
        final C40757w f99529e;

        /* renamed from: f */
        Object f99530f;

        /* renamed from: g */
        Throwable f99531g;

        C42328a(C40746m mVar, C40757w wVar) {
            this.f99528d = mVar;
            this.f99529e = wVar;
        }

        /* renamed from: a */
        public void mo94967a(Object obj) {
            this.f99530f = obj;
            C41498c.m120373c(this, this.f99529e.mo95052c(this));
        }

        public void dispose() {
            C41498c.m120371a(this);
        }

        public boolean isDisposed() {
            return C41498c.m120372b((C41205b) get());
        }

        public void onComplete() {
            C41498c.m120373c(this, this.f99529e.mo95052c(this));
        }

        public void onError(Throwable th) {
            this.f99531g = th;
            C41498c.m120373c(this, this.f99529e.mo95052c(this));
        }

        public void onSubscribe(C41205b bVar) {
            if (C41498c.m120376g(this, bVar)) {
                this.f99528d.onSubscribe(this);
            }
        }

        public void run() {
            Throwable th = this.f99531g;
            if (th != null) {
                this.f99531g = null;
                this.f99528d.onError(th);
                return;
            }
            Object obj = this.f99530f;
            if (obj != null) {
                this.f99530f = null;
                this.f99528d.mo94967a(obj);
                return;
            }
            this.f99528d.onComplete();
        }
    }

    public C42327r(C40748o oVar, C40757w wVar) {
        super(oVar);
        this.f99527e = wVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public void mo94961w(C40746m mVar) {
        this.f99467d.mo94947c(new C42328a(mVar, this.f99527e));
    }
}
