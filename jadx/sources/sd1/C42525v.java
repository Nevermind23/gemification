package sd1;

import ae1.C40293a;
import ed1.C40737d;
import ed1.C40739f;
import ed1.C40754t;
import ed1.C40756v;
import hd1.C41204a;
import hd1.C41205b;
import id1.C41300a;
import java.util.concurrent.atomic.AtomicReference;
import jd1.C41405l;
import kd1.C41498c;
import ld1.C41692b;
import nd1.C41775b;
import yd1.C43357b;

/* renamed from: sd1.v */
public final class C42525v extends C42399a {

    /* renamed from: e */
    final C41405l f100089e;

    /* renamed from: f */
    final boolean f100090f;

    /* renamed from: sd1.v$a */
    static final class C42526a extends C41775b implements C40756v {
        private static final long serialVersionUID = 8443155186132538303L;

        /* renamed from: d */
        final C40756v f100091d;

        /* renamed from: e */
        final C43357b f100092e = new C43357b();

        /* renamed from: f */
        final C41405l f100093f;

        /* renamed from: g */
        final boolean f100094g;

        /* renamed from: h */
        final C41204a f100095h = new C41204a();

        /* renamed from: i */
        C41205b f100096i;

        /* renamed from: j */
        volatile boolean f100097j;

        /* renamed from: sd1.v$a$a */
        final class C42527a extends AtomicReference implements C40737d, C41205b {
            private static final long serialVersionUID = 8606673141535671828L;

            C42527a() {
            }

            public void dispose() {
                C41498c.m120371a(this);
            }

            public boolean isDisposed() {
                return C41498c.m120372b((C41205b) get());
            }

            public void onComplete() {
                C42526a.this.mo97972b(this);
            }

            public void onError(Throwable th) {
                C42526a.this.mo97973d(this, th);
            }

            public void onSubscribe(C41205b bVar) {
                C41498c.m120376g(this, bVar);
            }
        }

        C42526a(C40756v vVar, C41405l lVar, boolean z) {
            this.f100091d = vVar;
            this.f100093f = lVar;
            this.f100094g = z;
            lazySet(1);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo97972b(C42527a aVar) {
            this.f100095h.mo95661c(aVar);
            onComplete();
        }

        /* renamed from: c */
        public Object mo96258c() {
            return null;
        }

        public void clear() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo97973d(C42527a aVar, Throwable th) {
            this.f100095h.mo95661c(aVar);
            onError(th);
        }

        public void dispose() {
            this.f100097j = true;
            this.f100096i.dispose();
            this.f100095h.dispose();
        }

        /* renamed from: e */
        public int mo96260e(int i) {
            return i & 2;
        }

        public boolean isDisposed() {
            return this.f100096i.isDisposed();
        }

        public boolean isEmpty() {
            return true;
        }

        public void onComplete() {
            if (decrementAndGet() == 0) {
                Throwable b = this.f100092e.mo102035b();
                if (b != null) {
                    this.f100091d.onError(b);
                } else {
                    this.f100091d.onComplete();
                }
            }
        }

        public void onError(Throwable th) {
            if (!this.f100092e.mo102034a(th)) {
                C40293a.m116722s(th);
            } else if (!this.f100094g) {
                dispose();
                if (getAndSet(0) > 0) {
                    this.f100091d.onError(this.f100092e.mo102035b());
                }
            } else if (decrementAndGet() == 0) {
                this.f100091d.onError(this.f100092e.mo102035b());
            }
        }

        public void onNext(Object obj) {
            try {
                C40739f fVar = (C40739f) C41692b.m120934e(this.f100093f.apply(obj), "The mapper returned a null CompletableSource");
                getAndIncrement();
                C42527a aVar = new C42527a();
                if (!this.f100097j && this.f100095h.mo95660b(aVar)) {
                    fVar.mo94894a(aVar);
                }
            } catch (Throwable th) {
                C41300a.m119661b(th);
                this.f100096i.dispose();
                onError(th);
            }
        }

        public void onSubscribe(C41205b bVar) {
            if (C41498c.m120378l(this.f100096i, bVar)) {
                this.f100096i = bVar;
                this.f100091d.onSubscribe(this);
            }
        }
    }

    public C42525v(C40754t tVar, C41405l lVar, boolean z) {
        super(tVar);
        this.f100089e = lVar;
        this.f100090f = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: I0 */
    public void mo94344I0(C40756v vVar) {
        this.f99678d.mo95016c(new C42526a(vVar, this.f100089e, this.f100090f));
    }
}
