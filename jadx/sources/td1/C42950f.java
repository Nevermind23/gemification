package td1;

import ae1.C40293a;
import ed1.C40735b0;
import ed1.C40762x;
import ed1.C40764z;
import hd1.C41205b;
import id1.C41300a;
import jd1.C41394a;
import kd1.C41498c;

/* renamed from: td1.f */
public final class C42950f extends C40762x {

    /* renamed from: d */
    final C40735b0 f100248d;

    /* renamed from: e */
    final C41394a f100249e;

    /* renamed from: td1.f$a */
    static final class C42951a implements C40764z, C41205b {

        /* renamed from: d */
        final C40764z f100250d;

        /* renamed from: e */
        final C41394a f100251e;

        /* renamed from: f */
        C41205b f100252f;

        C42951a(C40764z zVar, C41394a aVar) {
            this.f100250d = zVar;
            this.f100251e = aVar;
        }

        /* renamed from: b */
        private void m123300b() {
            try {
                this.f100251e.run();
            } catch (Throwable th) {
                C41300a.m119661b(th);
                C40293a.m116722s(th);
            }
        }

        /* renamed from: a */
        public void mo95096a(Object obj) {
            this.f100250d.mo95096a(obj);
            m123300b();
        }

        public void dispose() {
            this.f100252f.dispose();
        }

        public boolean isDisposed() {
            return this.f100252f.isDisposed();
        }

        public void onError(Throwable th) {
            this.f100250d.onError(th);
            m123300b();
        }

        public void onSubscribe(C41205b bVar) {
            if (C41498c.m120378l(this.f100252f, bVar)) {
                this.f100252f = bVar;
                this.f100250d.onSubscribe(this);
            }
        }
    }

    public C42950f(C40735b0 b0Var, C41394a aVar) {
        this.f100248d = b0Var;
        this.f100249e = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public void mo95071J(C40764z zVar) {
        this.f100248d.mo94907c(new C42951a(zVar, this.f100249e));
    }
}
