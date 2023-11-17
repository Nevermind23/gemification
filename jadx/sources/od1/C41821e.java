package od1;

import ed1.C40734b;
import ed1.C40737d;
import ed1.C40739f;
import ed1.C40757w;
import hd1.C41205b;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import kd1.C41498c;

/* renamed from: od1.e */
public final class C41821e extends C40734b {

    /* renamed from: d */
    final C40739f f98163d;

    /* renamed from: e */
    final long f98164e;

    /* renamed from: f */
    final TimeUnit f98165f;

    /* renamed from: g */
    final C40757w f98166g;

    /* renamed from: h */
    final boolean f98167h;

    /* renamed from: od1.e$a */
    static final class C41822a extends AtomicReference implements C40737d, Runnable, C41205b {
        private static final long serialVersionUID = 465972761105851022L;

        /* renamed from: d */
        final C40737d f98168d;

        /* renamed from: e */
        final long f98169e;

        /* renamed from: f */
        final TimeUnit f98170f;

        /* renamed from: g */
        final C40757w f98171g;

        /* renamed from: h */
        final boolean f98172h;

        /* renamed from: i */
        Throwable f98173i;

        C41822a(C40737d dVar, long j, TimeUnit timeUnit, C40757w wVar, boolean z) {
            this.f98168d = dVar;
            this.f98169e = j;
            this.f98170f = timeUnit;
            this.f98171g = wVar;
            this.f98172h = z;
        }

        public void dispose() {
            C41498c.m120371a(this);
        }

        public boolean isDisposed() {
            return C41498c.m120372b((C41205b) get());
        }

        public void onComplete() {
            C41498c.m120373c(this, this.f98171g.mo95053d(this, this.f98169e, this.f98170f));
        }

        public void onError(Throwable th) {
            long j;
            this.f98173i = th;
            C40757w wVar = this.f98171g;
            if (this.f98172h) {
                j = this.f98169e;
            } else {
                j = 0;
            }
            C41498c.m120373c(this, wVar.mo95053d(this, j, this.f98170f));
        }

        public void onSubscribe(C41205b bVar) {
            if (C41498c.m120376g(this, bVar)) {
                this.f98168d.onSubscribe(this);
            }
        }

        public void run() {
            Throwable th = this.f98173i;
            this.f98173i = null;
            if (th != null) {
                this.f98168d.onError(th);
            } else {
                this.f98168d.onComplete();
            }
        }
    }

    public C41821e(C40739f fVar, long j, TimeUnit timeUnit, C40757w wVar, boolean z) {
        this.f98163d = fVar;
        this.f98164e = j;
        this.f98165f = timeUnit;
        this.f98166g = wVar;
        this.f98167h = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public void mo94889H(C40737d dVar) {
        this.f98163d.mo94894a(new C41822a(dVar, this.f98164e, this.f98165f, this.f98166g, this.f98167h));
    }
}
