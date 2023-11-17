package sd1;

import ed1.C40754t;
import ed1.C40756v;
import ee1.C40767b;
import hd1.C41205b;
import id1.C41300a;
import java.util.concurrent.atomic.AtomicReference;
import jd1.C41405l;
import kd1.C41498c;
import kd1.C41499d;
import ld1.C41692b;

/* renamed from: sd1.r0 */
public final class C42497r0 extends C42399a {

    /* renamed from: e */
    final C41405l f100005e;

    /* renamed from: sd1.r0$a */
    static final class C42498a implements C40756v {

        /* renamed from: d */
        final C40767b f100006d;

        /* renamed from: e */
        final AtomicReference f100007e;

        C42498a(C40767b bVar, AtomicReference atomicReference) {
            this.f100006d = bVar;
            this.f100007e = atomicReference;
        }

        public void onComplete() {
            this.f100006d.onComplete();
        }

        public void onError(Throwable th) {
            this.f100006d.onError(th);
        }

        public void onNext(Object obj) {
            this.f100006d.onNext(obj);
        }

        public void onSubscribe(C41205b bVar) {
            C41498c.m120376g(this.f100007e, bVar);
        }
    }

    /* renamed from: sd1.r0$b */
    static final class C42499b extends AtomicReference implements C40756v, C41205b {
        private static final long serialVersionUID = 854110278590336484L;

        /* renamed from: d */
        final C40756v f100008d;

        /* renamed from: e */
        C41205b f100009e;

        C42499b(C40756v vVar) {
            this.f100008d = vVar;
        }

        public void dispose() {
            this.f100009e.dispose();
            C41498c.m120371a(this);
        }

        public boolean isDisposed() {
            return this.f100009e.isDisposed();
        }

        public void onComplete() {
            C41498c.m120371a(this);
            this.f100008d.onComplete();
        }

        public void onError(Throwable th) {
            C41498c.m120371a(this);
            this.f100008d.onError(th);
        }

        public void onNext(Object obj) {
            this.f100008d.onNext(obj);
        }

        public void onSubscribe(C41205b bVar) {
            if (C41498c.m120378l(this.f100009e, bVar)) {
                this.f100009e = bVar;
                this.f100008d.onSubscribe(this);
            }
        }
    }

    public C42497r0(C40754t tVar, C41405l lVar) {
        super(tVar);
        this.f100005e = lVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: I0 */
    public void mo94344I0(C40756v vVar) {
        C40767b h1 = C40767b.m118210h1();
        try {
            C40754t tVar = (C40754t) C41692b.m120934e(this.f100005e.apply(h1), "The selector returned a null ObservableSource");
            C42499b bVar = new C42499b(vVar);
            tVar.mo95016c(bVar);
            this.f99678d.mo95016c(new C42498a(h1, bVar));
        } catch (Throwable th) {
            C41300a.m119661b(th);
            C41499d.m120384n(th, vVar);
        }
    }
}
