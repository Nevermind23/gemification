package td1;

import ed1.C40735b0;
import ed1.C40737d;
import ed1.C40739f;
import ed1.C40762x;
import ed1.C40764z;
import hd1.C41205b;
import java.util.concurrent.atomic.AtomicReference;
import kd1.C41498c;
import nd1.C41787n;

/* renamed from: td1.d */
public final class C42946d extends C40762x {

    /* renamed from: d */
    final C40735b0 f100239d;

    /* renamed from: e */
    final C40739f f100240e;

    /* renamed from: td1.d$a */
    static final class C42947a extends AtomicReference implements C40737d, C41205b {
        private static final long serialVersionUID = -8565274649390031272L;

        /* renamed from: d */
        final C40764z f100241d;

        /* renamed from: e */
        final C40735b0 f100242e;

        C42947a(C40764z zVar, C40735b0 b0Var) {
            this.f100241d = zVar;
            this.f100242e = b0Var;
        }

        public void dispose() {
            C41498c.m120371a(this);
        }

        public boolean isDisposed() {
            return C41498c.m120372b((C41205b) get());
        }

        public void onComplete() {
            this.f100242e.mo94907c(new C41787n(this, this.f100241d));
        }

        public void onError(Throwable th) {
            this.f100241d.onError(th);
        }

        public void onSubscribe(C41205b bVar) {
            if (C41498c.m120376g(this, bVar)) {
                this.f100241d.onSubscribe(this);
            }
        }
    }

    public C42946d(C40735b0 b0Var, C40739f fVar) {
        this.f100239d = b0Var;
        this.f100240e = fVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public void mo95071J(C40764z zVar) {
        this.f100240e.mo94894a(new C42947a(zVar, this.f100239d));
    }
}
