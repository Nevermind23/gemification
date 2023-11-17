package td1;

import ae1.C40293a;
import ed1.C40735b0;
import ed1.C40762x;
import ed1.C40764z;
import hd1.C41205b;
import id1.C41300a;
import java.util.concurrent.atomic.AtomicInteger;
import jd1.C41394a;
import kd1.C41498c;

/* renamed from: td1.g */
public final class C42952g extends C40762x {

    /* renamed from: d */
    final C40735b0 f100253d;

    /* renamed from: e */
    final C41394a f100254e;

    /* renamed from: td1.g$a */
    static final class C42953a extends AtomicInteger implements C40764z, C41205b {
        private static final long serialVersionUID = 4109457741734051389L;

        /* renamed from: d */
        final C40764z f100255d;

        /* renamed from: e */
        final C41394a f100256e;

        /* renamed from: f */
        C41205b f100257f;

        C42953a(C40764z zVar, C41394a aVar) {
            this.f100255d = zVar;
            this.f100256e = aVar;
        }

        /* renamed from: a */
        public void mo95096a(Object obj) {
            this.f100255d.mo95096a(obj);
            mo101497b();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo101497b() {
            if (compareAndSet(0, 1)) {
                try {
                    this.f100256e.run();
                } catch (Throwable th) {
                    C41300a.m119661b(th);
                    C40293a.m116722s(th);
                }
            }
        }

        public void dispose() {
            this.f100257f.dispose();
            mo101497b();
        }

        public boolean isDisposed() {
            return this.f100257f.isDisposed();
        }

        public void onError(Throwable th) {
            this.f100255d.onError(th);
            mo101497b();
        }

        public void onSubscribe(C41205b bVar) {
            if (C41498c.m120378l(this.f100257f, bVar)) {
                this.f100257f = bVar;
                this.f100255d.onSubscribe(this);
            }
        }
    }

    public C42952g(C40735b0 b0Var, C41394a aVar) {
        this.f100253d = b0Var;
        this.f100254e = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public void mo95071J(C40764z zVar) {
        this.f100253d.mo94907c(new C42953a(zVar, this.f100254e));
    }
}
