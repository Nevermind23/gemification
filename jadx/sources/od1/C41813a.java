package od1;

import ed1.C40734b;
import ed1.C40737d;
import ed1.C40739f;
import hd1.C41205b;
import java.util.concurrent.atomic.AtomicReference;
import kd1.C41498c;

/* renamed from: od1.a */
public final class C41813a extends C40734b {

    /* renamed from: d */
    final C40739f f98149d;

    /* renamed from: e */
    final C40739f f98150e;

    /* renamed from: od1.a$a */
    static final class C41814a implements C40737d {

        /* renamed from: d */
        final AtomicReference f98151d;

        /* renamed from: e */
        final C40737d f98152e;

        C41814a(AtomicReference atomicReference, C40737d dVar) {
            this.f98151d = atomicReference;
            this.f98152e = dVar;
        }

        public void onComplete() {
            this.f98152e.onComplete();
        }

        public void onError(Throwable th) {
            this.f98152e.onError(th);
        }

        public void onSubscribe(C41205b bVar) {
            C41498c.m120373c(this.f98151d, bVar);
        }
    }

    /* renamed from: od1.a$b */
    static final class C41815b extends AtomicReference implements C40737d, C41205b {
        private static final long serialVersionUID = -4101678820158072998L;

        /* renamed from: d */
        final C40737d f98153d;

        /* renamed from: e */
        final C40739f f98154e;

        C41815b(C40737d dVar, C40739f fVar) {
            this.f98153d = dVar;
            this.f98154e = fVar;
        }

        public void dispose() {
            C41498c.m120371a(this);
        }

        public boolean isDisposed() {
            return C41498c.m120372b((C41205b) get());
        }

        public void onComplete() {
            this.f98154e.mo94894a(new C41814a(this, this.f98153d));
        }

        public void onError(Throwable th) {
            this.f98153d.onError(th);
        }

        public void onSubscribe(C41205b bVar) {
            if (C41498c.m120376g(this, bVar)) {
                this.f98153d.onSubscribe(this);
            }
        }
    }

    public C41813a(C40739f fVar, C40739f fVar2) {
        this.f98149d = fVar;
        this.f98150e = fVar2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public void mo94889H(C40737d dVar) {
        this.f98149d.mo94894a(new C41815b(dVar, this.f98150e));
    }
}
