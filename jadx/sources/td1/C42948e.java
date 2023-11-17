package td1;

import ae1.C40293a;
import ed1.C40735b0;
import ed1.C40762x;
import ed1.C40764z;
import hd1.C41205b;
import id1.C41300a;
import jd1.C41399f;
import kd1.C41498c;

/* renamed from: td1.e */
public final class C42948e extends C40762x {

    /* renamed from: d */
    final C40735b0 f100243d;

    /* renamed from: e */
    final C41399f f100244e;

    /* renamed from: td1.e$a */
    static final class C42949a implements C40764z, C41205b {

        /* renamed from: d */
        final C40764z f100245d;

        /* renamed from: e */
        final C41399f f100246e;

        /* renamed from: f */
        C41205b f100247f;

        C42949a(C40764z zVar, C41399f fVar) {
            this.f100245d = zVar;
            this.f100246e = fVar;
        }

        /* renamed from: a */
        public void mo95096a(Object obj) {
            this.f100245d.mo95096a(obj);
            try {
                this.f100246e.accept(obj);
            } catch (Throwable th) {
                C41300a.m119661b(th);
                C40293a.m116722s(th);
            }
        }

        public void dispose() {
            this.f100247f.dispose();
        }

        public boolean isDisposed() {
            return this.f100247f.isDisposed();
        }

        public void onError(Throwable th) {
            this.f100245d.onError(th);
        }

        public void onSubscribe(C41205b bVar) {
            if (C41498c.m120378l(this.f100247f, bVar)) {
                this.f100247f = bVar;
                this.f100245d.onSubscribe(this);
            }
        }
    }

    public C42948e(C40735b0 b0Var, C41399f fVar) {
        this.f100243d = b0Var;
        this.f100244e = fVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public void mo95071J(C40764z zVar) {
        this.f100243d.mo94907c(new C42949a(zVar, this.f100244e));
    }
}
