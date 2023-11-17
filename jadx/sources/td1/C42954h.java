package td1;

import ed1.C40735b0;
import ed1.C40762x;
import ed1.C40764z;
import hd1.C41205b;
import id1.C41300a;
import jd1.C41399f;
import p469io.reactivex.exceptions.CompositeException;

/* renamed from: td1.h */
public final class C42954h extends C40762x {

    /* renamed from: d */
    final C40735b0 f100258d;

    /* renamed from: e */
    final C41399f f100259e;

    /* renamed from: td1.h$a */
    final class C42955a implements C40764z {

        /* renamed from: d */
        private final C40764z f100260d;

        C42955a(C40764z zVar) {
            this.f100260d = zVar;
        }

        /* renamed from: a */
        public void mo95096a(Object obj) {
            this.f100260d.mo95096a(obj);
        }

        public void onError(Throwable th) {
            try {
                C42954h.this.f100259e.accept(th);
            } catch (Throwable th2) {
                C41300a.m119661b(th2);
                th = new CompositeException(th, th2);
            }
            this.f100260d.onError(th);
        }

        public void onSubscribe(C41205b bVar) {
            this.f100260d.onSubscribe(bVar);
        }
    }

    public C42954h(C40735b0 b0Var, C41399f fVar) {
        this.f100258d = b0Var;
        this.f100259e = fVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public void mo95071J(C40764z zVar) {
        this.f100258d.mo94907c(new C42955a(zVar));
    }
}
