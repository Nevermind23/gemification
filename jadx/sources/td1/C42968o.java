package td1;

import ed1.C40735b0;
import ed1.C40744k;
import ed1.C40746m;
import ed1.C40748o;
import ed1.C40764z;
import hd1.C41205b;
import id1.C41300a;
import java.util.concurrent.atomic.AtomicReference;
import jd1.C41405l;
import kd1.C41498c;
import ld1.C41692b;

/* renamed from: td1.o */
public final class C42968o extends C40744k {

    /* renamed from: d */
    final C40735b0 f100286d;

    /* renamed from: e */
    final C41405l f100287e;

    /* renamed from: td1.o$a */
    static final class C42969a implements C40746m {

        /* renamed from: d */
        final AtomicReference f100288d;

        /* renamed from: e */
        final C40746m f100289e;

        C42969a(AtomicReference atomicReference, C40746m mVar) {
            this.f100288d = atomicReference;
            this.f100289e = mVar;
        }

        /* renamed from: a */
        public void mo94967a(Object obj) {
            this.f100289e.mo94967a(obj);
        }

        public void onComplete() {
            this.f100289e.onComplete();
        }

        public void onError(Throwable th) {
            this.f100289e.onError(th);
        }

        public void onSubscribe(C41205b bVar) {
            C41498c.m120373c(this.f100288d, bVar);
        }
    }

    /* renamed from: td1.o$b */
    static final class C42970b extends AtomicReference implements C40764z, C41205b {
        private static final long serialVersionUID = -5843758257109742742L;

        /* renamed from: d */
        final C40746m f100290d;

        /* renamed from: e */
        final C41405l f100291e;

        C42970b(C40746m mVar, C41405l lVar) {
            this.f100290d = mVar;
            this.f100291e = lVar;
        }

        /* renamed from: a */
        public void mo95096a(Object obj) {
            try {
                C40748o oVar = (C40748o) C41692b.m120934e(this.f100291e.apply(obj), "The mapper returned a null MaybeSource");
                if (!isDisposed()) {
                    oVar.mo94947c(new C42969a(this, this.f100290d));
                }
            } catch (Throwable th) {
                C41300a.m119661b(th);
                onError(th);
            }
        }

        public void dispose() {
            C41498c.m120371a(this);
        }

        public boolean isDisposed() {
            return C41498c.m120372b((C41205b) get());
        }

        public void onError(Throwable th) {
            this.f100290d.onError(th);
        }

        public void onSubscribe(C41205b bVar) {
            if (C41498c.m120376g(this, bVar)) {
                this.f100290d.onSubscribe(this);
            }
        }
    }

    public C42968o(C40735b0 b0Var, C41405l lVar) {
        this.f100287e = lVar;
        this.f100286d = b0Var;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public void mo94961w(C40746m mVar) {
        this.f100286d.mo94907c(new C42970b(mVar, this.f100287e));
    }
}
