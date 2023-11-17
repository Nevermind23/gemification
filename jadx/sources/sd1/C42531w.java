package sd1;

import ae1.C40293a;
import ed1.C40734b;
import ed1.C40737d;
import ed1.C40739f;
import ed1.C40749p;
import ed1.C40754t;
import ed1.C40756v;
import hd1.C41204a;
import hd1.C41205b;
import id1.C41300a;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import jd1.C41405l;
import kd1.C41498c;
import ld1.C41692b;
import md1.C41734c;
import yd1.C43357b;

/* renamed from: sd1.w */
public final class C42531w extends C40734b implements C41734c {

    /* renamed from: d */
    final C40754t f100103d;

    /* renamed from: e */
    final C41405l f100104e;

    /* renamed from: f */
    final boolean f100105f;

    /* renamed from: sd1.w$a */
    static final class C42532a extends AtomicInteger implements C41205b, C40756v {
        private static final long serialVersionUID = 8443155186132538303L;

        /* renamed from: d */
        final C40737d f100106d;

        /* renamed from: e */
        final C43357b f100107e = new C43357b();

        /* renamed from: f */
        final C41405l f100108f;

        /* renamed from: g */
        final boolean f100109g;

        /* renamed from: h */
        final C41204a f100110h = new C41204a();

        /* renamed from: i */
        C41205b f100111i;

        /* renamed from: j */
        volatile boolean f100112j;

        /* renamed from: sd1.w$a$a */
        final class C42533a extends AtomicReference implements C40737d, C41205b {
            private static final long serialVersionUID = 8606673141535671828L;

            C42533a() {
            }

            public void dispose() {
                C41498c.m120371a(this);
            }

            public boolean isDisposed() {
                return C41498c.m120372b((C41205b) get());
            }

            public void onComplete() {
                C42532a.this.mo97975a(this);
            }

            public void onError(Throwable th) {
                C42532a.this.mo97976b(this, th);
            }

            public void onSubscribe(C41205b bVar) {
                C41498c.m120376g(this, bVar);
            }
        }

        C42532a(C40737d dVar, C41405l lVar, boolean z) {
            this.f100106d = dVar;
            this.f100108f = lVar;
            this.f100109g = z;
            lazySet(1);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo97975a(C42533a aVar) {
            this.f100110h.mo95661c(aVar);
            onComplete();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo97976b(C42533a aVar, Throwable th) {
            this.f100110h.mo95661c(aVar);
            onError(th);
        }

        public void dispose() {
            this.f100112j = true;
            this.f100111i.dispose();
            this.f100110h.dispose();
        }

        public boolean isDisposed() {
            return this.f100111i.isDisposed();
        }

        public void onComplete() {
            if (decrementAndGet() == 0) {
                Throwable b = this.f100107e.mo102035b();
                if (b != null) {
                    this.f100106d.onError(b);
                } else {
                    this.f100106d.onComplete();
                }
            }
        }

        public void onError(Throwable th) {
            if (!this.f100107e.mo102034a(th)) {
                C40293a.m116722s(th);
            } else if (!this.f100109g) {
                dispose();
                if (getAndSet(0) > 0) {
                    this.f100106d.onError(this.f100107e.mo102035b());
                }
            } else if (decrementAndGet() == 0) {
                this.f100106d.onError(this.f100107e.mo102035b());
            }
        }

        public void onNext(Object obj) {
            try {
                C40739f fVar = (C40739f) C41692b.m120934e(this.f100108f.apply(obj), "The mapper returned a null CompletableSource");
                getAndIncrement();
                C42533a aVar = new C42533a();
                if (!this.f100112j && this.f100110h.mo95660b(aVar)) {
                    fVar.mo94894a(aVar);
                }
            } catch (Throwable th) {
                C41300a.m119661b(th);
                this.f100111i.dispose();
                onError(th);
            }
        }

        public void onSubscribe(C41205b bVar) {
            if (C41498c.m120378l(this.f100111i, bVar)) {
                this.f100111i = bVar;
                this.f100106d.onSubscribe(this);
            }
        }
    }

    public C42531w(C40754t tVar, C41405l lVar, boolean z) {
        this.f100103d = tVar;
        this.f100104e = lVar;
        this.f100105f = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public void mo94889H(C40737d dVar) {
        this.f100103d.mo95016c(new C42532a(dVar, this.f100104e, this.f100105f));
    }

    /* renamed from: b */
    public C40749p mo96527b() {
        return C40293a.m116717n(new C42525v(this.f100103d, this.f100104e, this.f100105f));
    }
}
