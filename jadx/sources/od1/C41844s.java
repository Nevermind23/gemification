package od1;

import ed1.C40734b;
import ed1.C40737d;
import ed1.C40739f;
import ed1.C40757w;
import hd1.C41205b;
import java.util.concurrent.atomic.AtomicReference;
import kd1.C41498c;
import kd1.C41502g;

/* renamed from: od1.s */
public final class C41844s extends C40734b {

    /* renamed from: d */
    final C40739f f98216d;

    /* renamed from: e */
    final C40757w f98217e;

    /* renamed from: od1.s$a */
    static final class C41845a extends AtomicReference implements C40737d, C41205b, Runnable {
        private static final long serialVersionUID = 7000911171163930287L;

        /* renamed from: d */
        final C40737d f98218d;

        /* renamed from: e */
        final C41502g f98219e = new C41502g();

        /* renamed from: f */
        final C40739f f98220f;

        C41845a(C40737d dVar, C40739f fVar) {
            this.f98218d = dVar;
            this.f98220f = fVar;
        }

        public void dispose() {
            C41498c.m120371a(this);
            this.f98219e.dispose();
        }

        public boolean isDisposed() {
            return C41498c.m120372b((C41205b) get());
        }

        public void onComplete() {
            this.f98218d.onComplete();
        }

        public void onError(Throwable th) {
            this.f98218d.onError(th);
        }

        public void onSubscribe(C41205b bVar) {
            C41498c.m120376g(this, bVar);
        }

        public void run() {
            this.f98220f.mo94894a(this);
        }
    }

    public C41844s(C40739f fVar, C40757w wVar) {
        this.f98216d = fVar;
        this.f98217e = wVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public void mo94889H(C40737d dVar) {
        C41845a aVar = new C41845a(dVar, this.f98216d);
        dVar.onSubscribe(aVar);
        aVar.f98219e.mo96265a(this.f98217e.mo95052c(aVar));
    }
}
