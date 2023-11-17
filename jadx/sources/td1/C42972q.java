package td1;

import ed1.C40735b0;
import ed1.C40762x;
import ed1.C40764z;
import hd1.C41205b;
import kd1.C41498c;

/* renamed from: td1.q */
public final class C42972q extends C40762x {

    /* renamed from: d */
    final C40735b0 f100293d;

    /* renamed from: td1.q$a */
    static final class C42973a implements C40764z, C41205b {

        /* renamed from: d */
        final C40764z f100294d;

        /* renamed from: e */
        C41205b f100295e;

        C42973a(C40764z zVar) {
            this.f100294d = zVar;
        }

        /* renamed from: a */
        public void mo95096a(Object obj) {
            this.f100294d.mo95096a(obj);
        }

        public void dispose() {
            this.f100295e.dispose();
        }

        public boolean isDisposed() {
            return this.f100295e.isDisposed();
        }

        public void onError(Throwable th) {
            this.f100294d.onError(th);
        }

        public void onSubscribe(C41205b bVar) {
            if (C41498c.m120378l(this.f100295e, bVar)) {
                this.f100295e = bVar;
                this.f100294d.onSubscribe(this);
            }
        }
    }

    public C42972q(C40735b0 b0Var) {
        this.f100293d = b0Var;
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public void mo95071J(C40764z zVar) {
        this.f100293d.mo94907c(new C42973a(zVar));
    }
}
