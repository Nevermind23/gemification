package od1;

import ae1.C40293a;
import ed1.C40734b;
import ed1.C40736c;
import ed1.C40737d;
import ed1.C40738e;
import hd1.C41205b;
import id1.C41300a;
import java.util.concurrent.atomic.AtomicReference;
import jd1.C41398e;
import kd1.C41496a;
import kd1.C41498c;

/* renamed from: od1.c */
public final class C41818c extends C40734b {

    /* renamed from: d */
    final C40738e f98160d;

    /* renamed from: od1.c$a */
    static final class C41819a extends AtomicReference implements C40736c, C41205b {
        private static final long serialVersionUID = -2467358622224974244L;

        /* renamed from: d */
        final C40737d f98161d;

        C41819a(C40737d dVar) {
            this.f98161d = dVar;
        }

        /* renamed from: a */
        public void mo96635a(C41205b bVar) {
            C41498c.m120375f(this, bVar);
        }

        /* renamed from: b */
        public boolean mo94908b(Throwable th) {
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
                this.f98161d.onError(th);
            } finally {
                if (bVar != null) {
                    bVar.dispose();
                }
            }
        }

        /* renamed from: c */
        public void mo94909c(C41398e eVar) {
            mo96635a(new C41496a(eVar));
        }

        public void dispose() {
            C41498c.m120371a(this);
        }

        public boolean isDisposed() {
            return C41498c.m120372b((C41205b) get());
        }

        public void onComplete() {
            C41205b bVar;
            Object obj = get();
            C41498c cVar = C41498c.DISPOSED;
            if (obj != cVar && (bVar = (C41205b) getAndSet(cVar)) != cVar) {
                try {
                    this.f98161d.onComplete();
                } finally {
                    if (bVar != null) {
                        bVar.dispose();
                    }
                }
            }
        }

        public void onError(Throwable th) {
            if (!mo94908b(th)) {
                C40293a.m116722s(th);
            }
        }

        public String toString() {
            return String.format("%s{%s}", new Object[]{C41819a.class.getSimpleName(), super.toString()});
        }
    }

    public C41818c(C40738e eVar) {
        this.f98160d = eVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public void mo94889H(C40737d dVar) {
        C41819a aVar = new C41819a(dVar);
        dVar.onSubscribe(aVar);
        try {
            this.f98160d.mo26762a(aVar);
        } catch (Throwable th) {
            C41300a.m119661b(th);
            aVar.onError(th);
        }
    }
}
