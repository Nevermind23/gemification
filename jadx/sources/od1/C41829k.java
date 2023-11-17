package od1;

import ed1.C40734b;
import ed1.C40735b0;
import ed1.C40737d;
import ed1.C40764z;
import hd1.C41205b;

/* renamed from: od1.k */
public final class C41829k extends C40734b {

    /* renamed from: d */
    final C40735b0 f98180d;

    /* renamed from: od1.k$a */
    static final class C41830a implements C40764z {

        /* renamed from: d */
        final C40737d f98181d;

        C41830a(C40737d dVar) {
            this.f98181d = dVar;
        }

        /* renamed from: a */
        public void mo95096a(Object obj) {
            this.f98181d.onComplete();
        }

        public void onError(Throwable th) {
            this.f98181d.onError(th);
        }

        public void onSubscribe(C41205b bVar) {
            this.f98181d.onSubscribe(bVar);
        }
    }

    public C41829k(C40735b0 b0Var) {
        this.f98180d = b0Var;
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public void mo94889H(C40737d dVar) {
        this.f98180d.mo94907c(new C41830a(dVar));
    }
}
