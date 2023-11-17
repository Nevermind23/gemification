package od1;

import ed1.C40734b;
import ed1.C40737d;
import ed1.C40739f;
import hd1.C41205b;
import id1.C41300a;
import jd1.C41407n;
import p469io.reactivex.exceptions.CompositeException;

/* renamed from: od1.p */
public final class C41838p extends C40734b {

    /* renamed from: d */
    final C40739f f98197d;

    /* renamed from: e */
    final C41407n f98198e;

    /* renamed from: od1.p$a */
    final class C41839a implements C40737d {

        /* renamed from: d */
        private final C40737d f98199d;

        C41839a(C40737d dVar) {
            this.f98199d = dVar;
        }

        public void onComplete() {
            this.f98199d.onComplete();
        }

        public void onError(Throwable th) {
            try {
                if (C41838p.this.f98198e.test(th)) {
                    this.f98199d.onComplete();
                } else {
                    this.f98199d.onError(th);
                }
            } catch (Throwable th2) {
                C41300a.m119661b(th2);
                this.f98199d.onError(new CompositeException(th, th2));
            }
        }

        public void onSubscribe(C41205b bVar) {
            this.f98199d.onSubscribe(bVar);
        }
    }

    public C41838p(C40739f fVar, C41407n nVar) {
        this.f98197d = fVar;
        this.f98198e = nVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public void mo94889H(C40737d dVar) {
        this.f98197d.mo94894a(new C41839a(dVar));
    }
}
