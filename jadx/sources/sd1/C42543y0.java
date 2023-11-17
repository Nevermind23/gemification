package sd1;

import ed1.C40754t;
import ed1.C40756v;
import ed1.C40757w;
import hd1.C41205b;
import java.util.concurrent.atomic.AtomicReference;
import kd1.C41498c;

/* renamed from: sd1.y0 */
public final class C42543y0 extends C42399a {

    /* renamed from: e */
    final C40757w f100144e;

    /* renamed from: sd1.y0$a */
    static final class C42544a extends AtomicReference implements C40756v, C41205b {
        private static final long serialVersionUID = 8094547886072529208L;

        /* renamed from: d */
        final C40756v f100145d;

        /* renamed from: e */
        final AtomicReference f100146e = new AtomicReference();

        C42544a(C40756v vVar) {
            this.f100145d = vVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo97984a(C41205b bVar) {
            C41498c.m120376g(this, bVar);
        }

        public void dispose() {
            C41498c.m120371a(this.f100146e);
            C41498c.m120371a(this);
        }

        public boolean isDisposed() {
            return C41498c.m120372b((C41205b) get());
        }

        public void onComplete() {
            this.f100145d.onComplete();
        }

        public void onError(Throwable th) {
            this.f100145d.onError(th);
        }

        public void onNext(Object obj) {
            this.f100145d.onNext(obj);
        }

        public void onSubscribe(C41205b bVar) {
            C41498c.m120376g(this.f100146e, bVar);
        }
    }

    /* renamed from: sd1.y0$b */
    final class C42545b implements Runnable {

        /* renamed from: d */
        private final C42544a f100147d;

        C42545b(C42544a aVar) {
            this.f100147d = aVar;
        }

        public void run() {
            C42543y0.this.f99678d.mo95016c(this.f100147d);
        }
    }

    public C42543y0(C40754t tVar, C40757w wVar) {
        super(tVar);
        this.f100144e = wVar;
    }

    /* renamed from: I0 */
    public void mo94344I0(C40756v vVar) {
        C42544a aVar = new C42544a(vVar);
        vVar.onSubscribe(aVar);
        aVar.mo97984a(this.f100144e.mo95052c(new C42545b(aVar)));
    }
}
