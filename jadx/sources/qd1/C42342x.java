package qd1;

import ed1.C40741h;
import ed1.C40746m;
import ed1.C40748o;
import hd1.C41205b;
import kd1.C41498c;
import uh1.C43107b;
import xd1.C43257b;

/* renamed from: qd1.x */
public final class C42342x extends C40741h {

    /* renamed from: e */
    final C40748o f99561e;

    /* renamed from: qd1.x$a */
    static final class C42343a extends C43257b implements C40746m {
        private static final long serialVersionUID = 7603343402964826922L;

        /* renamed from: f */
        C41205b f99562f;

        C42343a(C43107b bVar) {
            super(bVar);
        }

        /* renamed from: a */
        public void mo94967a(Object obj) {
            mo101944g(obj);
        }

        public void cancel() {
            super.cancel();
            this.f99562f.dispose();
        }

        public void onComplete() {
            this.f101012d.onComplete();
        }

        public void onError(Throwable th) {
            this.f101012d.onError(th);
        }

        public void onSubscribe(C41205b bVar) {
            if (C41498c.m120378l(this.f99562f, bVar)) {
                this.f99562f = bVar;
                this.f101012d.mo27070b(this);
            }
        }
    }

    public C42342x(C40748o oVar) {
        this.f99561e = oVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public void mo94348F(C43107b bVar) {
        this.f99561e.mo94947c(new C42343a(bVar));
    }
}
