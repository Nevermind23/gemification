package od1;

import ed1.C40734b;
import ed1.C40737d;
import ed1.C40754t;
import ed1.C40756v;
import hd1.C41205b;

/* renamed from: od1.j */
public final class C41827j extends C40734b {

    /* renamed from: d */
    final C40754t f98178d;

    /* renamed from: od1.j$a */
    static final class C41828a implements C40756v {

        /* renamed from: d */
        final C40737d f98179d;

        C41828a(C40737d dVar) {
            this.f98179d = dVar;
        }

        public void onComplete() {
            this.f98179d.onComplete();
        }

        public void onError(Throwable th) {
            this.f98179d.onError(th);
        }

        public void onNext(Object obj) {
        }

        public void onSubscribe(C41205b bVar) {
            this.f98179d.onSubscribe(bVar);
        }
    }

    public C41827j(C40754t tVar) {
        this.f98178d = tVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public void mo94889H(C40737d dVar) {
        this.f98178d.mo95016c(new C41828a(dVar));
    }
}
