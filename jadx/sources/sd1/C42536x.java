package sd1;

import ae1.C40293a;
import androidx.lifecycle.C1612n;
import ed1.C40735b0;
import ed1.C40749p;
import ed1.C40754t;
import ed1.C40756v;
import ed1.C40764z;
import hd1.C41204a;
import hd1.C41205b;
import id1.C41300a;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import jd1.C41405l;
import kd1.C41498c;
import ld1.C41692b;
import ud1.C43063b;
import yd1.C43357b;

/* renamed from: sd1.x */
public final class C42536x extends C42399a {

    /* renamed from: e */
    final C41405l f100119e;

    /* renamed from: f */
    final boolean f100120f;

    /* renamed from: sd1.x$a */
    static final class C42537a extends AtomicInteger implements C40756v, C41205b {
        private static final long serialVersionUID = 8600231336733376951L;

        /* renamed from: d */
        final C40756v f100121d;

        /* renamed from: e */
        final boolean f100122e;

        /* renamed from: f */
        final C41204a f100123f = new C41204a();

        /* renamed from: g */
        final AtomicInteger f100124g = new AtomicInteger(1);

        /* renamed from: h */
        final C43357b f100125h = new C43357b();

        /* renamed from: i */
        final C41405l f100126i;

        /* renamed from: j */
        final AtomicReference f100127j = new AtomicReference();

        /* renamed from: k */
        C41205b f100128k;

        /* renamed from: l */
        volatile boolean f100129l;

        /* renamed from: sd1.x$a$a */
        final class C42538a extends AtomicReference implements C40764z, C41205b {
            private static final long serialVersionUID = -502562646270949838L;

            C42538a() {
            }

            /* renamed from: a */
            public void mo95096a(Object obj) {
                C42537a.this.mo97982f(this, obj);
            }

            public void dispose() {
                C41498c.m120371a(this);
            }

            public boolean isDisposed() {
                return C41498c.m120372b((C41205b) get());
            }

            public void onError(Throwable th) {
                C42537a.this.mo97981e(this, th);
            }

            public void onSubscribe(C41205b bVar) {
                C41498c.m120376g(this, bVar);
            }
        }

        C42537a(C40756v vVar, C41405l lVar, boolean z) {
            this.f100121d = vVar;
            this.f100126i = lVar;
            this.f100122e = z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo97977a() {
            C43063b bVar = (C43063b) this.f100127j.get();
            if (bVar != null) {
                bVar.clear();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo97978b() {
            if (getAndIncrement() == 0) {
                mo97979c();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo97979c() {
            boolean z;
            Object obj;
            C40756v vVar = this.f100121d;
            AtomicInteger atomicInteger = this.f100124g;
            AtomicReference atomicReference = this.f100127j;
            int i = 1;
            while (!this.f100129l) {
                if (this.f100122e || ((Throwable) this.f100125h.get()) == null) {
                    boolean z2 = false;
                    if (atomicInteger.get() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    C43063b bVar = (C43063b) atomicReference.get();
                    if (bVar != null) {
                        obj = bVar.mo96258c();
                    } else {
                        obj = null;
                    }
                    if (obj == null) {
                        z2 = true;
                    }
                    if (z && z2) {
                        Throwable b = this.f100125h.mo102035b();
                        if (b != null) {
                            vVar.onError(b);
                            return;
                        } else {
                            vVar.onComplete();
                            return;
                        }
                    } else if (z2) {
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    } else {
                        vVar.onNext(obj);
                    }
                } else {
                    Throwable b2 = this.f100125h.mo102035b();
                    mo97977a();
                    vVar.onError(b2);
                    return;
                }
            }
            mo97977a();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public C43063b mo97980d() {
            C43063b bVar;
            do {
                C43063b bVar2 = (C43063b) this.f100127j.get();
                if (bVar2 != null) {
                    return bVar2;
                }
                bVar = new C43063b(C40749p.m118040f());
            } while (!C1612n.m5659a(this.f100127j, (Object) null, bVar));
            return bVar;
        }

        public void dispose() {
            this.f100129l = true;
            this.f100128k.dispose();
            this.f100123f.dispose();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo97981e(C42538a aVar, Throwable th) {
            this.f100123f.mo95661c(aVar);
            if (this.f100125h.mo102034a(th)) {
                if (!this.f100122e) {
                    this.f100128k.dispose();
                    this.f100123f.dispose();
                }
                this.f100124g.decrementAndGet();
                mo97978b();
                return;
            }
            C40293a.m116722s(th);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public void mo97982f(C42538a aVar, Object obj) {
            this.f100123f.mo95661c(aVar);
            if (get() == 0) {
                boolean z = false;
                if (compareAndSet(0, 1)) {
                    this.f100121d.onNext(obj);
                    if (this.f100124g.decrementAndGet() == 0) {
                        z = true;
                    }
                    C43063b bVar = (C43063b) this.f100127j.get();
                    if (!z || (bVar != null && !bVar.isEmpty())) {
                        if (decrementAndGet() == 0) {
                            return;
                        }
                        mo97979c();
                    }
                    Throwable b = this.f100125h.mo102035b();
                    if (b != null) {
                        this.f100121d.onError(b);
                        return;
                    } else {
                        this.f100121d.onComplete();
                        return;
                    }
                }
            }
            C43063b d = mo97980d();
            synchronized (d) {
                d.mo96261f(obj);
            }
            this.f100124g.decrementAndGet();
            if (getAndIncrement() != 0) {
                return;
            }
            mo97979c();
        }

        public boolean isDisposed() {
            return this.f100129l;
        }

        public void onComplete() {
            this.f100124g.decrementAndGet();
            mo97978b();
        }

        public void onError(Throwable th) {
            this.f100124g.decrementAndGet();
            if (this.f100125h.mo102034a(th)) {
                if (!this.f100122e) {
                    this.f100123f.dispose();
                }
                mo97978b();
                return;
            }
            C40293a.m116722s(th);
        }

        public void onNext(Object obj) {
            try {
                C40735b0 b0Var = (C40735b0) C41692b.m120934e(this.f100126i.apply(obj), "The mapper returned a null SingleSource");
                this.f100124g.getAndIncrement();
                C42538a aVar = new C42538a();
                if (!this.f100129l && this.f100123f.mo95660b(aVar)) {
                    b0Var.mo94907c(aVar);
                }
            } catch (Throwable th) {
                C41300a.m119661b(th);
                this.f100128k.dispose();
                onError(th);
            }
        }

        public void onSubscribe(C41205b bVar) {
            if (C41498c.m120378l(this.f100128k, bVar)) {
                this.f100128k = bVar;
                this.f100121d.onSubscribe(this);
            }
        }
    }

    public C42536x(C40754t tVar, C41405l lVar, boolean z) {
        super(tVar);
        this.f100119e = lVar;
        this.f100120f = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: I0 */
    public void mo94344I0(C40756v vVar) {
        this.f99678d.mo95016c(new C42537a(vVar, this.f100119e, this.f100120f));
    }
}
