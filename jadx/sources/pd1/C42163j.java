package pd1;

import ae1.C40293a;
import androidx.lifecycle.C1612n;
import ed1.C40741h;
import ed1.C40742i;
import ed1.C40746m;
import ed1.C40748o;
import hd1.C41204a;
import hd1.C41205b;
import id1.C41300a;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import jd1.C41405l;
import kd1.C41498c;
import ld1.C41692b;
import ud1.C43063b;
import uh1.C43107b;
import uh1.C43108c;
import xd1.C43259d;
import yd1.C43357b;
import yd1.C43358c;

/* renamed from: pd1.j */
public final class C42163j extends C42144a {

    /* renamed from: f */
    final C41405l f99170f;

    /* renamed from: g */
    final boolean f99171g;

    /* renamed from: h */
    final int f99172h;

    /* renamed from: pd1.j$a */
    static final class C42164a extends AtomicInteger implements C40742i, C43108c {
        private static final long serialVersionUID = 8600231336733376951L;

        /* renamed from: d */
        final C43107b f99173d;

        /* renamed from: e */
        final boolean f99174e;

        /* renamed from: f */
        final int f99175f;

        /* renamed from: g */
        final AtomicLong f99176g = new AtomicLong();

        /* renamed from: h */
        final C41204a f99177h = new C41204a();

        /* renamed from: i */
        final AtomicInteger f99178i = new AtomicInteger(1);

        /* renamed from: j */
        final C43357b f99179j = new C43357b();

        /* renamed from: k */
        final C41405l f99180k;

        /* renamed from: l */
        final AtomicReference f99181l = new AtomicReference();

        /* renamed from: m */
        C43108c f99182m;

        /* renamed from: n */
        volatile boolean f99183n;

        /* renamed from: pd1.j$a$a */
        final class C42165a extends AtomicReference implements C40746m, C41205b {
            private static final long serialVersionUID = -502562646270949838L;

            C42165a() {
            }

            /* renamed from: a */
            public void mo94967a(Object obj) {
                C42164a.this.mo97650i(this, obj);
            }

            public void dispose() {
                C41498c.m120371a(this);
            }

            public boolean isDisposed() {
                return C41498c.m120372b((C41205b) get());
            }

            public void onComplete() {
                C42164a.this.mo97648g(this);
            }

            public void onError(Throwable th) {
                C42164a.this.mo97649h(this, th);
            }

            public void onSubscribe(C41205b bVar) {
                C41498c.m120376g(this, bVar);
            }
        }

        C42164a(C43107b bVar, C41405l lVar, boolean z, int i) {
            this.f99173d = bVar;
            this.f99180k = lVar;
            this.f99174e = z;
            this.f99175f = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo97644a() {
            C43063b bVar = (C43063b) this.f99181l.get();
            if (bVar != null) {
                bVar.clear();
            }
        }

        /* renamed from: b */
        public void mo27070b(C43108c cVar) {
            if (C43259d.m124224h(this.f99182m, cVar)) {
                this.f99182m = cVar;
                this.f99173d.mo27070b(this);
                int i = this.f99175f;
                if (i == Integer.MAX_VALUE) {
                    cVar.mo94357l(Long.MAX_VALUE);
                } else {
                    cVar.mo94357l((long) i);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo97645c() {
            if (getAndIncrement() == 0) {
                mo97646e();
            }
        }

        public void cancel() {
            this.f99183n = true;
            this.f99182m.cancel();
            this.f99177h.dispose();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo97646e() {
            int i;
            boolean z;
            boolean z2;
            boolean z3;
            Object obj;
            boolean z4;
            C43107b bVar = this.f99173d;
            AtomicInteger atomicInteger = this.f99178i;
            AtomicReference atomicReference = this.f99181l;
            int i2 = 1;
            do {
                long j = this.f99176g.get();
                long j2 = 0;
                while (true) {
                    i = (j2 > j ? 1 : (j2 == j ? 0 : -1));
                    z = false;
                    if (i == 0) {
                        break;
                    } else if (this.f99183n) {
                        mo97644a();
                        return;
                    } else if (this.f99174e || ((Throwable) this.f99179j.get()) == null) {
                        if (atomicInteger.get() == 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        C43063b bVar2 = (C43063b) atomicReference.get();
                        if (bVar2 != null) {
                            obj = bVar2.mo96258c();
                        } else {
                            obj = null;
                        }
                        if (obj == null) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (z3 && z4) {
                            Throwable b = this.f99179j.mo102035b();
                            if (b != null) {
                                bVar.onError(b);
                                return;
                            } else {
                                bVar.onComplete();
                                return;
                            }
                        } else if (z4) {
                            break;
                        } else {
                            bVar.onNext(obj);
                            j2++;
                        }
                    } else {
                        Throwable b2 = this.f99179j.mo102035b();
                        mo97644a();
                        bVar.onError(b2);
                        return;
                    }
                }
                if (i == 0) {
                    if (this.f99183n) {
                        mo97644a();
                        return;
                    } else if (this.f99174e || ((Throwable) this.f99179j.get()) == null) {
                        if (atomicInteger.get() == 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        C43063b bVar3 = (C43063b) atomicReference.get();
                        if (bVar3 == null || bVar3.isEmpty()) {
                            z = true;
                        }
                        if (z2 && z) {
                            Throwable b3 = this.f99179j.mo102035b();
                            if (b3 != null) {
                                bVar.onError(b3);
                                return;
                            } else {
                                bVar.onComplete();
                                return;
                            }
                        }
                    } else {
                        Throwable b4 = this.f99179j.mo102035b();
                        mo97644a();
                        bVar.onError(b4);
                        return;
                    }
                }
                if (j2 != 0) {
                    C43358c.m124398d(this.f99176g, j2);
                    if (this.f99175f != Integer.MAX_VALUE) {
                        this.f99182m.mo94357l(j2);
                    }
                }
                i2 = addAndGet(-i2);
            } while (i2 != 0);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public C43063b mo97647f() {
            C43063b bVar;
            do {
                C43063b bVar2 = (C43063b) this.f99181l.get();
                if (bVar2 != null) {
                    return bVar2;
                }
                bVar = new C43063b(C40741h.m117960c());
            } while (!C1612n.m5659a(this.f99181l, (Object) null, bVar));
            return bVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public void mo97648g(C42165a aVar) {
            this.f99177h.mo95661c(aVar);
            if (get() == 0) {
                boolean z = false;
                if (compareAndSet(0, 1)) {
                    if (this.f99178i.decrementAndGet() == 0) {
                        z = true;
                    }
                    C43063b bVar = (C43063b) this.f99181l.get();
                    if (!z || (bVar != null && !bVar.isEmpty())) {
                        if (this.f99175f != Integer.MAX_VALUE) {
                            this.f99182m.mo94357l(1);
                        }
                        if (decrementAndGet() != 0) {
                            mo97646e();
                            return;
                        }
                        return;
                    }
                    Throwable b = this.f99179j.mo102035b();
                    if (b != null) {
                        this.f99173d.onError(b);
                        return;
                    } else {
                        this.f99173d.onComplete();
                        return;
                    }
                }
            }
            this.f99178i.decrementAndGet();
            if (this.f99175f != Integer.MAX_VALUE) {
                this.f99182m.mo94357l(1);
            }
            mo97645c();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public void mo97649h(C42165a aVar, Throwable th) {
            this.f99177h.mo95661c(aVar);
            if (this.f99179j.mo102034a(th)) {
                if (!this.f99174e) {
                    this.f99182m.cancel();
                    this.f99177h.dispose();
                } else if (this.f99175f != Integer.MAX_VALUE) {
                    this.f99182m.mo94357l(1);
                }
                this.f99178i.decrementAndGet();
                mo97645c();
                return;
            }
            C40293a.m116722s(th);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public void mo97650i(C42165a aVar, Object obj) {
            this.f99177h.mo95661c(aVar);
            if (get() == 0) {
                boolean z = false;
                if (compareAndSet(0, 1)) {
                    if (this.f99178i.decrementAndGet() == 0) {
                        z = true;
                    }
                    if (this.f99176g.get() != 0) {
                        this.f99173d.onNext(obj);
                        C43063b bVar = (C43063b) this.f99181l.get();
                        if (!z || (bVar != null && !bVar.isEmpty())) {
                            C43358c.m124398d(this.f99176g, 1);
                            if (this.f99175f != Integer.MAX_VALUE) {
                                this.f99182m.mo94357l(1);
                            }
                        } else {
                            Throwable b = this.f99179j.mo102035b();
                            if (b != null) {
                                this.f99173d.onError(b);
                                return;
                            } else {
                                this.f99173d.onComplete();
                                return;
                            }
                        }
                    } else {
                        C43063b f = mo97647f();
                        synchronized (f) {
                            f.mo96261f(obj);
                        }
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                    mo97646e();
                }
            }
            C43063b f2 = mo97647f();
            synchronized (f2) {
                f2.mo96261f(obj);
            }
            this.f99178i.decrementAndGet();
            if (getAndIncrement() != 0) {
                return;
            }
            mo97646e();
        }

        /* renamed from: l */
        public void mo94357l(long j) {
            if (C43259d.m124223g(j)) {
                C43358c.m124395a(this.f99176g, j);
                mo97645c();
            }
        }

        public void onComplete() {
            this.f99178i.decrementAndGet();
            mo97645c();
        }

        public void onError(Throwable th) {
            this.f99178i.decrementAndGet();
            if (this.f99179j.mo102034a(th)) {
                if (!this.f99174e) {
                    this.f99177h.dispose();
                }
                mo97645c();
                return;
            }
            C40293a.m116722s(th);
        }

        public void onNext(Object obj) {
            try {
                C40748o oVar = (C40748o) C41692b.m120934e(this.f99180k.apply(obj), "The mapper returned a null MaybeSource");
                this.f99178i.getAndIncrement();
                C42165a aVar = new C42165a();
                if (!this.f99183n && this.f99177h.mo95660b(aVar)) {
                    oVar.mo94947c(aVar);
                }
            } catch (Throwable th) {
                C41300a.m119661b(th);
                this.f99182m.cancel();
                onError(th);
            }
        }
    }

    public C42163j(C40741h hVar, C41405l lVar, boolean z, int i) {
        super(hVar);
        this.f99170f = lVar;
        this.f99171g = z;
        this.f99172h = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public void mo94348F(C43107b bVar) {
        this.f99110e.mo94922E(new C42164a(bVar, this.f99170f, this.f99171g, this.f99172h));
    }
}
