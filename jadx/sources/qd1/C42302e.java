package qd1;

import ae1.C40293a;
import ed1.C40744k;
import ed1.C40745l;
import ed1.C40746m;
import ed1.C40747n;
import hd1.C41205b;
import id1.C41300a;
import java.util.concurrent.atomic.AtomicReference;
import kd1.C41498c;

/* renamed from: qd1.e */
public final class C42302e extends C40744k {

    /* renamed from: d */
    final C40747n f99486d;

    /* renamed from: qd1.e$a */
    static final class C42303a extends AtomicReference implements C40745l, C41205b {
        private static final long serialVersionUID = -2467358622224974244L;

        /* renamed from: d */
        final C40746m f99487d;

        C42303a(C40746m mVar) {
            this.f99487d = mVar;
        }

        /* renamed from: a */
        public void mo94965a(Object obj) {
            C41205b bVar;
            Object obj2 = get();
            C41498c cVar = C41498c.DISPOSED;
            if (obj2 != cVar && (bVar = (C41205b) getAndSet(cVar)) != cVar) {
                if (obj == null) {
                    try {
                        this.f99487d.onError(new NullPointerException("onSuccess called with null. Null values are generally not allowed in 2.x operators and sources."));
                    } catch (Throwable th) {
                        if (bVar != null) {
                            bVar.dispose();
                        }
                        throw th;
                    }
                } else {
                    this.f99487d.mo94967a(obj);
                }
                if (bVar != null) {
                    bVar.dispose();
                }
            }
        }

        /* renamed from: b */
        public void mo97775b(Throwable th) {
            if (!mo97776c(th)) {
                C40293a.m116722s(th);
            }
        }

        /* renamed from: c */
        public boolean mo97776c(Throwable th) {
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
                this.f99487d.onError(th);
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

        public void onComplete() {
            C41205b bVar;
            Object obj = get();
            C41498c cVar = C41498c.DISPOSED;
            if (obj != cVar && (bVar = (C41205b) getAndSet(cVar)) != cVar) {
                try {
                    this.f99487d.onComplete();
                } finally {
                    if (bVar != null) {
                        bVar.dispose();
                    }
                }
            }
        }

        public String toString() {
            return String.format("%s{%s}", new Object[]{C42303a.class.getSimpleName(), super.toString()});
        }
    }

    public C42302e(C40747n nVar) {
        this.f99486d = nVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public void mo94961w(C40746m mVar) {
        C42303a aVar = new C42303a(mVar);
        mVar.onSubscribe(aVar);
        try {
            this.f99486d.mo48474a(aVar);
        } catch (Throwable th) {
            C41300a.m119661b(th);
            aVar.mo97775b(th);
        }
    }
}
