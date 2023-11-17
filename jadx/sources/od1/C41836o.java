package od1;

import ed1.C40734b;
import ed1.C40737d;
import ed1.C40739f;
import ed1.C40757w;
import hd1.C41205b;
import java.util.concurrent.atomic.AtomicReference;
import kd1.C41498c;

/* renamed from: od1.o */
public final class C41836o extends C40734b {

    /* renamed from: d */
    final C40739f f98192d;

    /* renamed from: e */
    final C40757w f98193e;

    /* renamed from: od1.o$a */
    static final class C41837a extends AtomicReference implements C40737d, C41205b, Runnable {
        private static final long serialVersionUID = 8571289934935992137L;

        /* renamed from: d */
        final C40737d f98194d;

        /* renamed from: e */
        final C40757w f98195e;

        /* renamed from: f */
        Throwable f98196f;

        C41837a(C40737d dVar, C40757w wVar) {
            this.f98194d = dVar;
            this.f98195e = wVar;
        }

        public void dispose() {
            C41498c.m120371a(this);
        }

        public boolean isDisposed() {
            return C41498c.m120372b((C41205b) get());
        }

        public void onComplete() {
            C41498c.m120373c(this, this.f98195e.mo95052c(this));
        }

        public void onError(Throwable th) {
            this.f98196f = th;
            C41498c.m120373c(this, this.f98195e.mo95052c(this));
        }

        public void onSubscribe(C41205b bVar) {
            if (C41498c.m120376g(this, bVar)) {
                this.f98194d.onSubscribe(this);
            }
        }

        public void run() {
            Throwable th = this.f98196f;
            if (th != null) {
                this.f98196f = null;
                this.f98194d.onError(th);
                return;
            }
            this.f98194d.onComplete();
        }
    }

    public C41836o(C40739f fVar, C40757w wVar) {
        this.f98192d = fVar;
        this.f98193e = wVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public void mo94889H(C40737d dVar) {
        this.f98192d.mo94894a(new C41837a(dVar, this.f98193e));
    }
}
