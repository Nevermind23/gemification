package sd1;

import ae1.C40293a;
import ed1.C40754t;
import ed1.C40756v;
import hd1.C41205b;
import id1.C41300a;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import jd1.C41405l;
import kd1.C41498c;
import ld1.C41692b;
import md1.C41735d;
import md1.C41740i;
import p469io.reactivex.observers.C41381b;
import ud1.C43063b;
import yd1.C43357b;
import yd1.C43363h;

/* renamed from: sd1.f */
public final class C42428f extends C42399a {

    /* renamed from: e */
    final C41405l f99778e;

    /* renamed from: f */
    final int f99779f;

    /* renamed from: g */
    final C43363h f99780g;

    /* renamed from: sd1.f$a */
    static final class C42429a extends AtomicInteger implements C40756v, C41205b {
        private static final long serialVersionUID = -6951100001833242599L;

        /* renamed from: d */
        final C40756v f99781d;

        /* renamed from: e */
        final C41405l f99782e;

        /* renamed from: f */
        final int f99783f;

        /* renamed from: g */
        final C43357b f99784g = new C43357b();

        /* renamed from: h */
        final C42430a f99785h;

        /* renamed from: i */
        final boolean f99786i;

        /* renamed from: j */
        C41740i f99787j;

        /* renamed from: k */
        C41205b f99788k;

        /* renamed from: l */
        volatile boolean f99789l;

        /* renamed from: m */
        volatile boolean f99790m;

        /* renamed from: n */
        volatile boolean f99791n;

        /* renamed from: o */
        int f99792o;

        /* renamed from: sd1.f$a$a */
        static final class C42430a extends AtomicReference implements C40756v {
            private static final long serialVersionUID = 2620149119579502636L;

            /* renamed from: d */
            final C40756v f99793d;

            /* renamed from: e */
            final C42429a f99794e;

            C42430a(C40756v vVar, C42429a aVar) {
                this.f99793d = vVar;
                this.f99794e = aVar;
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public void mo97888a() {
                C41498c.m120371a(this);
            }

            public void onComplete() {
                C42429a aVar = this.f99794e;
                aVar.f99789l = false;
                aVar.mo97887a();
            }

            public void onError(Throwable th) {
                C42429a aVar = this.f99794e;
                if (aVar.f99784g.mo102034a(th)) {
                    if (!aVar.f99786i) {
                        aVar.f99788k.dispose();
                    }
                    aVar.f99789l = false;
                    aVar.mo97887a();
                    return;
                }
                C40293a.m116722s(th);
            }

            public void onNext(Object obj) {
                this.f99793d.onNext(obj);
            }

            public void onSubscribe(C41205b bVar) {
                C41498c.m120373c(this, bVar);
            }
        }

        C42429a(C40756v vVar, C41405l lVar, int i, boolean z) {
            this.f99781d = vVar;
            this.f99782e = lVar;
            this.f99783f = i;
            this.f99786i = z;
            this.f99785h = new C42430a(vVar, this);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo97887a() {
            boolean z;
            if (getAndIncrement() == 0) {
                C40756v vVar = this.f99781d;
                C41740i iVar = this.f99787j;
                C43357b bVar = this.f99784g;
                while (true) {
                    if (!this.f99789l) {
                        if (this.f99791n) {
                            iVar.clear();
                            return;
                        } else if (this.f99786i || ((Throwable) bVar.get()) == null) {
                            boolean z2 = this.f99790m;
                            try {
                                Object c = iVar.mo96258c();
                                if (c == null) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (z2 && z) {
                                    this.f99791n = true;
                                    Throwable b = bVar.mo102035b();
                                    if (b != null) {
                                        vVar.onError(b);
                                        return;
                                    } else {
                                        vVar.onComplete();
                                        return;
                                    }
                                } else if (!z) {
                                    try {
                                        C40754t tVar = (C40754t) C41692b.m120934e(this.f99782e.apply(c), "The mapper returned a null ObservableSource");
                                        if (tVar instanceof Callable) {
                                            try {
                                                Object call = ((Callable) tVar).call();
                                                if (call != null && !this.f99791n) {
                                                    vVar.onNext(call);
                                                }
                                            } catch (Throwable th) {
                                                C41300a.m119661b(th);
                                                bVar.mo102034a(th);
                                            }
                                        } else {
                                            this.f99789l = true;
                                            tVar.mo95016c(this.f99785h);
                                        }
                                    } catch (Throwable th2) {
                                        C41300a.m119661b(th2);
                                        this.f99791n = true;
                                        this.f99788k.dispose();
                                        iVar.clear();
                                        bVar.mo102034a(th2);
                                        vVar.onError(bVar.mo102035b());
                                        return;
                                    }
                                }
                            } catch (Throwable th3) {
                                C41300a.m119661b(th3);
                                this.f99791n = true;
                                this.f99788k.dispose();
                                bVar.mo102034a(th3);
                                vVar.onError(bVar.mo102035b());
                                return;
                            }
                        } else {
                            iVar.clear();
                            this.f99791n = true;
                            vVar.onError(bVar.mo102035b());
                            return;
                        }
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        public void dispose() {
            this.f99791n = true;
            this.f99788k.dispose();
            this.f99785h.mo97888a();
        }

        public boolean isDisposed() {
            return this.f99791n;
        }

        public void onComplete() {
            this.f99790m = true;
            mo97887a();
        }

        public void onError(Throwable th) {
            if (this.f99784g.mo102034a(th)) {
                this.f99790m = true;
                mo97887a();
                return;
            }
            C40293a.m116722s(th);
        }

        public void onNext(Object obj) {
            if (this.f99792o == 0) {
                this.f99787j.mo96261f(obj);
            }
            mo97887a();
        }

        public void onSubscribe(C41205b bVar) {
            if (C41498c.m120378l(this.f99788k, bVar)) {
                this.f99788k = bVar;
                if (bVar instanceof C41735d) {
                    C41735d dVar = (C41735d) bVar;
                    int e = dVar.mo96260e(3);
                    if (e == 1) {
                        this.f99792o = e;
                        this.f99787j = dVar;
                        this.f99790m = true;
                        this.f99781d.onSubscribe(this);
                        mo97887a();
                        return;
                    } else if (e == 2) {
                        this.f99792o = e;
                        this.f99787j = dVar;
                        this.f99781d.onSubscribe(this);
                        return;
                    }
                }
                this.f99787j = new C43063b(this.f99783f);
                this.f99781d.onSubscribe(this);
            }
        }
    }

    /* renamed from: sd1.f$b */
    static final class C42431b extends AtomicInteger implements C40756v, C41205b {
        private static final long serialVersionUID = 8828587559905699186L;

        /* renamed from: d */
        final C40756v f99795d;

        /* renamed from: e */
        final C41405l f99796e;

        /* renamed from: f */
        final C42432a f99797f;

        /* renamed from: g */
        final int f99798g;

        /* renamed from: h */
        C41740i f99799h;

        /* renamed from: i */
        C41205b f99800i;

        /* renamed from: j */
        volatile boolean f99801j;

        /* renamed from: k */
        volatile boolean f99802k;

        /* renamed from: l */
        volatile boolean f99803l;

        /* renamed from: m */
        int f99804m;

        /* renamed from: sd1.f$b$a */
        static final class C42432a extends AtomicReference implements C40756v {
            private static final long serialVersionUID = -7449079488798789337L;

            /* renamed from: d */
            final C40756v f99805d;

            /* renamed from: e */
            final C42431b f99806e;

            C42432a(C40756v vVar, C42431b bVar) {
                this.f99805d = vVar;
                this.f99806e = bVar;
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public void mo97891a() {
                C41498c.m120371a(this);
            }

            public void onComplete() {
                this.f99806e.mo97890b();
            }

            public void onError(Throwable th) {
                this.f99806e.dispose();
                this.f99805d.onError(th);
            }

            public void onNext(Object obj) {
                this.f99805d.onNext(obj);
            }

            public void onSubscribe(C41205b bVar) {
                C41498c.m120373c(this, bVar);
            }
        }

        C42431b(C40756v vVar, C41405l lVar, int i) {
            this.f99795d = vVar;
            this.f99796e = lVar;
            this.f99798g = i;
            this.f99797f = new C42432a(vVar, this);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo97889a() {
            boolean z;
            if (getAndIncrement() == 0) {
                while (!this.f99802k) {
                    if (!this.f99801j) {
                        boolean z2 = this.f99803l;
                        try {
                            Object c = this.f99799h.mo96258c();
                            if (c == null) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z2 && z) {
                                this.f99802k = true;
                                this.f99795d.onComplete();
                                return;
                            } else if (!z) {
                                try {
                                    C40754t tVar = (C40754t) C41692b.m120934e(this.f99796e.apply(c), "The mapper returned a null ObservableSource");
                                    this.f99801j = true;
                                    tVar.mo95016c(this.f99797f);
                                } catch (Throwable th) {
                                    C41300a.m119661b(th);
                                    dispose();
                                    this.f99799h.clear();
                                    this.f99795d.onError(th);
                                    return;
                                }
                            }
                        } catch (Throwable th2) {
                            C41300a.m119661b(th2);
                            dispose();
                            this.f99799h.clear();
                            this.f99795d.onError(th2);
                            return;
                        }
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
                this.f99799h.clear();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo97890b() {
            this.f99801j = false;
            mo97889a();
        }

        public void dispose() {
            this.f99802k = true;
            this.f99797f.mo97891a();
            this.f99800i.dispose();
            if (getAndIncrement() == 0) {
                this.f99799h.clear();
            }
        }

        public boolean isDisposed() {
            return this.f99802k;
        }

        public void onComplete() {
            if (!this.f99803l) {
                this.f99803l = true;
                mo97889a();
            }
        }

        public void onError(Throwable th) {
            if (this.f99803l) {
                C40293a.m116722s(th);
                return;
            }
            this.f99803l = true;
            dispose();
            this.f99795d.onError(th);
        }

        public void onNext(Object obj) {
            if (!this.f99803l) {
                if (this.f99804m == 0) {
                    this.f99799h.mo96261f(obj);
                }
                mo97889a();
            }
        }

        public void onSubscribe(C41205b bVar) {
            if (C41498c.m120378l(this.f99800i, bVar)) {
                this.f99800i = bVar;
                if (bVar instanceof C41735d) {
                    C41735d dVar = (C41735d) bVar;
                    int e = dVar.mo96260e(3);
                    if (e == 1) {
                        this.f99804m = e;
                        this.f99799h = dVar;
                        this.f99803l = true;
                        this.f99795d.onSubscribe(this);
                        mo97889a();
                        return;
                    } else if (e == 2) {
                        this.f99804m = e;
                        this.f99799h = dVar;
                        this.f99795d.onSubscribe(this);
                        return;
                    }
                }
                this.f99799h = new C43063b(this.f99798g);
                this.f99795d.onSubscribe(this);
            }
        }
    }

    public C42428f(C40754t tVar, C41405l lVar, int i, C43363h hVar) {
        super(tVar);
        this.f99778e = lVar;
        this.f99780g = hVar;
        this.f99779f = Math.max(8, i);
    }

    /* renamed from: I0 */
    public void mo94344I0(C40756v vVar) {
        boolean z;
        if (!C42528v0.m123158b(this.f99678d, vVar, this.f99778e)) {
            if (this.f99780g == C43363h.IMMEDIATE) {
                this.f99678d.mo95016c(new C42431b(new C41381b(vVar), this.f99778e, this.f99779f));
                return;
            }
            C40754t tVar = this.f99678d;
            C41405l lVar = this.f99778e;
            int i = this.f99779f;
            if (this.f99780g == C43363h.END) {
                z = true;
            } else {
                z = false;
            }
            tVar.mo95016c(new C42429a(vVar, lVar, i, z));
        }
    }
}
