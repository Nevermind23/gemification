package td1;

import ed1.C40735b0;
import ed1.C40757w;
import ed1.C40762x;
import ed1.C40764z;
import hd1.C41205b;
import java.util.concurrent.atomic.AtomicReference;
import kd1.C41498c;

/* renamed from: td1.t */
public final class C42977t extends C40762x {

    /* renamed from: d */
    final C40735b0 f100301d;

    /* renamed from: e */
    final C40757w f100302e;

    /* renamed from: td1.t$a */
    static final class C42978a extends AtomicReference implements C40764z, C41205b, Runnable {
        private static final long serialVersionUID = 3528003840217436037L;

        /* renamed from: d */
        final C40764z f100303d;

        /* renamed from: e */
        final C40757w f100304e;

        /* renamed from: f */
        Object f100305f;

        /* renamed from: g */
        Throwable f100306g;

        C42978a(C40764z zVar, C40757w wVar) {
            this.f100303d = zVar;
            this.f100304e = wVar;
        }

        /* renamed from: a */
        public void mo95096a(Object obj) {
            this.f100305f = obj;
            C41498c.m120373c(this, this.f100304e.mo95052c(this));
        }

        public void dispose() {
            C41498c.m120371a(this);
        }

        public boolean isDisposed() {
            return C41498c.m120372b((C41205b) get());
        }

        public void onError(Throwable th) {
            this.f100306g = th;
            C41498c.m120373c(this, this.f100304e.mo95052c(this));
        }

        public void onSubscribe(C41205b bVar) {
            if (C41498c.m120376g(this, bVar)) {
                this.f100303d.onSubscribe(this);
            }
        }

        public void run() {
            Throwable th = this.f100306g;
            if (th != null) {
                this.f100303d.onError(th);
            } else {
                this.f100303d.mo95096a(this.f100305f);
            }
        }
    }

    public C42977t(C40735b0 b0Var, C40757w wVar) {
        this.f100301d = b0Var;
        this.f100302e = wVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public void mo95071J(C40764z zVar) {
        this.f100301d.mo94907c(new C42978a(zVar, this.f100302e));
    }
}
