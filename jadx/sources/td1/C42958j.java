package td1;

import ed1.C40735b0;
import ed1.C40762x;
import ed1.C40764z;
import hd1.C41205b;
import id1.C41300a;
import jd1.C41399f;

/* renamed from: td1.j */
public final class C42958j extends C40762x {

    /* renamed from: d */
    final C40735b0 f100267d;

    /* renamed from: e */
    final C41399f f100268e;

    /* renamed from: td1.j$a */
    final class C42959a implements C40764z {

        /* renamed from: d */
        final C40764z f100269d;

        C42959a(C40764z zVar) {
            this.f100269d = zVar;
        }

        /* renamed from: a */
        public void mo95096a(Object obj) {
            try {
                C42958j.this.f100268e.accept(obj);
                this.f100269d.mo95096a(obj);
            } catch (Throwable th) {
                C41300a.m119661b(th);
                this.f100269d.onError(th);
            }
        }

        public void onError(Throwable th) {
            this.f100269d.onError(th);
        }

        public void onSubscribe(C41205b bVar) {
            this.f100269d.onSubscribe(bVar);
        }
    }

    public C42958j(C40735b0 b0Var, C41399f fVar) {
        this.f100267d = b0Var;
        this.f100268e = fVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public void mo95071J(C40764z zVar) {
        this.f100267d.mo94907c(new C42959a(zVar));
    }
}
