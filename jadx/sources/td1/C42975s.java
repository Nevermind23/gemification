package td1;

import ed1.C40735b0;
import ed1.C40762x;
import ed1.C40764z;
import hd1.C41205b;
import id1.C41300a;
import jd1.C41405l;
import ld1.C41692b;

/* renamed from: td1.s */
public final class C42975s extends C40762x {

    /* renamed from: d */
    final C40735b0 f100297d;

    /* renamed from: e */
    final C41405l f100298e;

    /* renamed from: td1.s$a */
    static final class C42976a implements C40764z {

        /* renamed from: d */
        final C40764z f100299d;

        /* renamed from: e */
        final C41405l f100300e;

        C42976a(C40764z zVar, C41405l lVar) {
            this.f100299d = zVar;
            this.f100300e = lVar;
        }

        /* renamed from: a */
        public void mo95096a(Object obj) {
            try {
                this.f100299d.mo95096a(C41692b.m120934e(this.f100300e.apply(obj), "The mapper function returned a null value."));
            } catch (Throwable th) {
                C41300a.m119661b(th);
                onError(th);
            }
        }

        public void onError(Throwable th) {
            this.f100299d.onError(th);
        }

        public void onSubscribe(C41205b bVar) {
            this.f100299d.onSubscribe(bVar);
        }
    }

    public C42975s(C40735b0 b0Var, C41405l lVar) {
        this.f100297d = b0Var;
        this.f100298e = lVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public void mo95071J(C40764z zVar) {
        this.f100297d.mo94907c(new C42976a(zVar, this.f100298e));
    }
}
