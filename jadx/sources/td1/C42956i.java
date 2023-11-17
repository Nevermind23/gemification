package td1;

import ae1.C40293a;
import ed1.C40735b0;
import ed1.C40762x;
import ed1.C40764z;
import hd1.C41205b;
import id1.C41300a;
import jd1.C41399f;
import kd1.C41499d;

/* renamed from: td1.i */
public final class C42956i extends C40762x {

    /* renamed from: d */
    final C40735b0 f100262d;

    /* renamed from: e */
    final C41399f f100263e;

    /* renamed from: td1.i$a */
    static final class C42957a implements C40764z {

        /* renamed from: d */
        final C40764z f100264d;

        /* renamed from: e */
        final C41399f f100265e;

        /* renamed from: f */
        boolean f100266f;

        C42957a(C40764z zVar, C41399f fVar) {
            this.f100264d = zVar;
            this.f100265e = fVar;
        }

        /* renamed from: a */
        public void mo95096a(Object obj) {
            if (!this.f100266f) {
                this.f100264d.mo95096a(obj);
            }
        }

        public void onError(Throwable th) {
            if (this.f100266f) {
                C40293a.m116722s(th);
            } else {
                this.f100264d.onError(th);
            }
        }

        public void onSubscribe(C41205b bVar) {
            try {
                this.f100265e.accept(bVar);
                this.f100264d.onSubscribe(bVar);
            } catch (Throwable th) {
                C41300a.m119661b(th);
                this.f100266f = true;
                bVar.dispose();
                C41499d.m120385o(th, this.f100264d);
            }
        }
    }

    public C42956i(C40735b0 b0Var, C41399f fVar) {
        this.f100262d = b0Var;
        this.f100263e = fVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public void mo95071J(C40764z zVar) {
        this.f100262d.mo94907c(new C42957a(zVar, this.f100263e));
    }
}
