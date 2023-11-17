package td1;

import ed1.C40735b0;
import ed1.C40762x;
import ed1.C40764z;
import hd1.C41205b;
import id1.C41300a;
import java.util.concurrent.atomic.AtomicReference;
import jd1.C41405l;
import kd1.C41498c;
import ld1.C41692b;
import nd1.C41787n;
import p469io.reactivex.exceptions.CompositeException;

/* renamed from: td1.v */
public final class C42981v extends C40762x {

    /* renamed from: d */
    final C40735b0 f100312d;

    /* renamed from: e */
    final C41405l f100313e;

    /* renamed from: td1.v$a */
    static final class C42982a extends AtomicReference implements C40764z, C41205b {
        private static final long serialVersionUID = -5314538511045349925L;

        /* renamed from: d */
        final C40764z f100314d;

        /* renamed from: e */
        final C41405l f100315e;

        C42982a(C40764z zVar, C41405l lVar) {
            this.f100314d = zVar;
            this.f100315e = lVar;
        }

        /* renamed from: a */
        public void mo95096a(Object obj) {
            this.f100314d.mo95096a(obj);
        }

        public void dispose() {
            C41498c.m120371a(this);
        }

        public boolean isDisposed() {
            return C41498c.m120372b((C41205b) get());
        }

        public void onError(Throwable th) {
            try {
                ((C40735b0) C41692b.m120934e(this.f100315e.apply(th), "The nextFunction returned a null SingleSource.")).mo94907c(new C41787n(this, this.f100314d));
            } catch (Throwable th2) {
                C41300a.m119661b(th2);
                this.f100314d.onError(new CompositeException(th, th2));
            }
        }

        public void onSubscribe(C41205b bVar) {
            if (C41498c.m120376g(this, bVar)) {
                this.f100314d.onSubscribe(this);
            }
        }
    }

    public C42981v(C40735b0 b0Var, C41405l lVar) {
        this.f100312d = b0Var;
        this.f100313e = lVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public void mo95071J(C40764z zVar) {
        this.f100312d.mo94907c(new C42982a(zVar, this.f100313e));
    }
}
