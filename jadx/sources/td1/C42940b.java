package td1;

import ae1.C40293a;
import ed1.C40733a0;
import ed1.C40762x;
import ed1.C40763y;
import ed1.C40764z;
import hd1.C41205b;
import id1.C41300a;
import java.util.concurrent.atomic.AtomicReference;
import kd1.C41498c;

/* renamed from: td1.b */
public final class C42940b extends C40762x {

    /* renamed from: d */
    final C40733a0 f100225d;

    /* renamed from: td1.b$a */
    static final class C42941a extends AtomicReference implements C40763y, C41205b {
        private static final long serialVersionUID = -2467358622224974244L;

        /* renamed from: d */
        final C40764z f100226d;

        C42941a(C40764z zVar) {
            this.f100226d = zVar;
        }

        /* renamed from: a */
        public void mo95093a(Object obj) {
            C41205b bVar;
            Object obj2 = get();
            C41498c cVar = C41498c.DISPOSED;
            if (obj2 != cVar && (bVar = (C41205b) getAndSet(cVar)) != cVar) {
                if (obj == null) {
                    try {
                        this.f100226d.onError(new NullPointerException("onSuccess called with null. Null values are generally not allowed in 2.x operators and sources."));
                    } catch (Throwable th) {
                        if (bVar != null) {
                            bVar.dispose();
                        }
                        throw th;
                    }
                } else {
                    this.f100226d.mo95096a(obj);
                }
                if (bVar != null) {
                    bVar.dispose();
                }
            }
        }

        /* renamed from: b */
        public boolean mo95094b(Throwable th) {
            C41205b bVar;
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            Object obj = get();
            C41498c cVar = C41498c.DISPOSED;
            if (obj == cVar || (bVar = (C41205b) getAndSet(cVar)) == cVar) {
                return false;
            }
            try {
                this.f100226d.onError(th);
            } finally {
                if (bVar != null) {
                    bVar.dispose();
                }
            }
        }

        public void dispose() {
            C41498c.m120371a(this);
        }

        public boolean isDisposed() {
            return C41498c.m120372b((C41205b) get());
        }

        public void onError(Throwable th) {
            if (!mo95094b(th)) {
                C40293a.m116722s(th);
            }
        }

        public String toString() {
            return String.format("%s{%s}", new Object[]{C42941a.class.getSimpleName(), super.toString()});
        }
    }

    public C42940b(C40733a0 a0Var) {
        this.f100225d = a0Var;
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public void mo95071J(C40764z zVar) {
        C42941a aVar = new C42941a(zVar);
        zVar.onSubscribe(aVar);
        try {
            this.f100225d.mo23632a(aVar);
        } catch (Throwable th) {
            C41300a.m119661b(th);
            aVar.onError(th);
        }
    }
}
