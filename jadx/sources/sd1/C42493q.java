package sd1;

import ae1.C40293a;
import ed1.C40749p;
import ed1.C40754t;
import ed1.C40756v;
import ed1.C40762x;
import ed1.C40764z;
import hd1.C41205b;
import java.util.NoSuchElementException;
import kd1.C41498c;
import md1.C41734c;

/* renamed from: sd1.q */
public final class C42493q extends C40762x implements C41734c {

    /* renamed from: d */
    final C40754t f99995d;

    /* renamed from: e */
    final long f99996e;

    /* renamed from: f */
    final Object f99997f;

    /* renamed from: sd1.q$a */
    static final class C42494a implements C40756v, C41205b {

        /* renamed from: d */
        final C40764z f99998d;

        /* renamed from: e */
        final long f99999e;

        /* renamed from: f */
        final Object f100000f;

        /* renamed from: g */
        C41205b f100001g;

        /* renamed from: h */
        long f100002h;

        /* renamed from: i */
        boolean f100003i;

        C42494a(C40764z zVar, long j, Object obj) {
            this.f99998d = zVar;
            this.f99999e = j;
            this.f100000f = obj;
        }

        public void dispose() {
            this.f100001g.dispose();
        }

        public boolean isDisposed() {
            return this.f100001g.isDisposed();
        }

        public void onComplete() {
            if (!this.f100003i) {
                this.f100003i = true;
                Object obj = this.f100000f;
                if (obj != null) {
                    this.f99998d.mo95096a(obj);
                } else {
                    this.f99998d.onError(new NoSuchElementException());
                }
            }
        }

        public void onError(Throwable th) {
            if (this.f100003i) {
                C40293a.m116722s(th);
                return;
            }
            this.f100003i = true;
            this.f99998d.onError(th);
        }

        public void onNext(Object obj) {
            if (!this.f100003i) {
                long j = this.f100002h;
                if (j == this.f99999e) {
                    this.f100003i = true;
                    this.f100001g.dispose();
                    this.f99998d.mo95096a(obj);
                    return;
                }
                this.f100002h = j + 1;
            }
        }

        public void onSubscribe(C41205b bVar) {
            if (C41498c.m120378l(this.f100001g, bVar)) {
                this.f100001g = bVar;
                this.f99998d.onSubscribe(this);
            }
        }
    }

    public C42493q(C40754t tVar, long j, Object obj) {
        this.f99995d = tVar;
        this.f99996e = j;
        this.f99997f = obj;
    }

    /* renamed from: J */
    public void mo95071J(C40764z zVar) {
        this.f99995d.mo95016c(new C42494a(zVar, this.f99996e, this.f99997f));
    }

    /* renamed from: b */
    public C40749p mo96527b() {
        return C40293a.m116717n(new C42482o(this.f99995d, this.f99996e, this.f99997f, true));
    }
}
