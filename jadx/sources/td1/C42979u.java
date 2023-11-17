package td1;

import ed1.C40735b0;
import ed1.C40762x;
import ed1.C40764z;
import hd1.C41205b;
import id1.C41300a;
import jd1.C41405l;
import p469io.reactivex.exceptions.CompositeException;

/* renamed from: td1.u */
public final class C42979u extends C40762x {

    /* renamed from: d */
    final C40735b0 f100307d;

    /* renamed from: e */
    final C41405l f100308e;

    /* renamed from: f */
    final Object f100309f;

    /* renamed from: td1.u$a */
    final class C42980a implements C40764z {

        /* renamed from: d */
        private final C40764z f100310d;

        C42980a(C40764z zVar) {
            this.f100310d = zVar;
        }

        /* renamed from: a */
        public void mo95096a(Object obj) {
            this.f100310d.mo95096a(obj);
        }

        public void onError(Throwable th) {
            Object obj;
            C42979u uVar = C42979u.this;
            C41405l lVar = uVar.f100308e;
            if (lVar != null) {
                try {
                    obj = lVar.apply(th);
                } catch (Throwable th2) {
                    C41300a.m119661b(th2);
                    this.f100310d.onError(new CompositeException(th, th2));
                    return;
                }
            } else {
                obj = uVar.f100309f;
            }
            if (obj == null) {
                NullPointerException nullPointerException = new NullPointerException("Value supplied was null");
                nullPointerException.initCause(th);
                this.f100310d.onError(nullPointerException);
                return;
            }
            this.f100310d.mo95096a(obj);
        }

        public void onSubscribe(C41205b bVar) {
            this.f100310d.onSubscribe(bVar);
        }
    }

    public C42979u(C40735b0 b0Var, C41405l lVar, Object obj) {
        this.f100307d = b0Var;
        this.f100308e = lVar;
        this.f100309f = obj;
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public void mo95071J(C40764z zVar) {
        this.f100307d.mo94907c(new C42980a(zVar));
    }
}
