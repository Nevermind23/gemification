package td1;

import ed1.C40735b0;
import ed1.C40757w;
import ed1.C40762x;
import ed1.C40764z;
import hd1.C41205b;
import java.util.concurrent.atomic.AtomicReference;
import kd1.C41498c;
import kd1.C41502g;

/* renamed from: td1.w */
public final class C42983w extends C40762x {

    /* renamed from: d */
    final C40735b0 f100316d;

    /* renamed from: e */
    final C40757w f100317e;

    /* renamed from: td1.w$a */
    static final class C42984a extends AtomicReference implements C40764z, C41205b, Runnable {
        private static final long serialVersionUID = 7000911171163930287L;

        /* renamed from: d */
        final C40764z f100318d;

        /* renamed from: e */
        final C41502g f100319e = new C41502g();

        /* renamed from: f */
        final C40735b0 f100320f;

        C42984a(C40764z zVar, C40735b0 b0Var) {
            this.f100318d = zVar;
            this.f100320f = b0Var;
        }

        /* renamed from: a */
        public void mo95096a(Object obj) {
            this.f100318d.mo95096a(obj);
        }

        public void dispose() {
            C41498c.m120371a(this);
            this.f100319e.dispose();
        }

        public boolean isDisposed() {
            return C41498c.m120372b((C41205b) get());
        }

        public void onError(Throwable th) {
            this.f100318d.onError(th);
        }

        public void onSubscribe(C41205b bVar) {
            C41498c.m120376g(this, bVar);
        }

        public void run() {
            this.f100320f.mo94907c(this);
        }
    }

    public C42983w(C40735b0 b0Var, C40757w wVar) {
        this.f100316d = b0Var;
        this.f100317e = wVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public void mo95071J(C40764z zVar) {
        C42984a aVar = new C42984a(zVar, this.f100316d);
        zVar.onSubscribe(aVar);
        aVar.f100319e.mo96265a(this.f100317e.mo95052c(aVar));
    }
}
