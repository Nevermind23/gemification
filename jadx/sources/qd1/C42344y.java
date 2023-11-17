package qd1;

import ed1.C40746m;
import ed1.C40748o;
import ed1.C40749p;
import ed1.C40756v;
import hd1.C41205b;
import kd1.C41498c;
import nd1.C41783j;

/* renamed from: qd1.y */
public final class C42344y extends C40749p {

    /* renamed from: d */
    final C40748o f99563d;

    /* renamed from: qd1.y$a */
    static final class C42345a extends C41783j implements C40746m {
        private static final long serialVersionUID = 7603343402964826922L;

        /* renamed from: f */
        C41205b f99564f;

        C42345a(C40756v vVar) {
            super(vVar);
        }

        /* renamed from: a */
        public void mo94967a(Object obj) {
            mo96606d(obj);
        }

        public void dispose() {
            super.dispose();
            this.f99564f.dispose();
        }

        public void onComplete() {
            mo96605b();
        }

        public void onError(Throwable th) {
            mo96607g(th);
        }

        public void onSubscribe(C41205b bVar) {
            if (C41498c.m120378l(this.f99564f, bVar)) {
                this.f99564f = bVar;
                this.f98097d.onSubscribe(this);
            }
        }
    }

    public C42344y(C40748o oVar) {
        this.f99563d = oVar;
    }

    /* renamed from: f1 */
    public static C40746m m122819f1(C40756v vVar) {
        return new C42345a(vVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: I0 */
    public void mo94344I0(C40756v vVar) {
        this.f99563d.mo94947c(m122819f1(vVar));
    }
}
