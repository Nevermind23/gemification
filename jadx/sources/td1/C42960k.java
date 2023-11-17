package td1;

import ed1.C40735b0;
import ed1.C40762x;
import ed1.C40764z;
import hd1.C41205b;
import id1.C41300a;
import jd1.C41394a;
import p469io.reactivex.exceptions.CompositeException;

/* renamed from: td1.k */
public final class C42960k extends C40762x {

    /* renamed from: d */
    final C40735b0 f100271d;

    /* renamed from: e */
    final C41394a f100272e;

    /* renamed from: td1.k$a */
    final class C42961a implements C40764z {

        /* renamed from: d */
        final C40764z f100273d;

        C42961a(C40764z zVar) {
            this.f100273d = zVar;
        }

        /* renamed from: a */
        public void mo95096a(Object obj) {
            try {
                C42960k.this.f100272e.run();
                this.f100273d.mo95096a(obj);
            } catch (Throwable th) {
                C41300a.m119661b(th);
                this.f100273d.onError(th);
            }
        }

        public void onError(Throwable th) {
            try {
                C42960k.this.f100272e.run();
            } catch (Throwable th2) {
                C41300a.m119661b(th2);
                th = new CompositeException(th, th2);
            }
            this.f100273d.onError(th);
        }

        public void onSubscribe(C41205b bVar) {
            this.f100273d.onSubscribe(bVar);
        }
    }

    public C42960k(C40735b0 b0Var, C41394a aVar) {
        this.f100271d = b0Var;
        this.f100272e = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public void mo95071J(C40764z zVar) {
        this.f100271d.mo94907c(new C42961a(zVar));
    }
}
