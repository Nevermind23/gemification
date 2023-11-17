package rd1;

import ae1.C40293a;
import androidx.lifecycle.C1612n;
import ed1.C40734b;
import ed1.C40737d;
import ed1.C40739f;
import ed1.C40749p;
import ed1.C40756v;
import hd1.C41205b;
import id1.C41300a;
import java.util.concurrent.atomic.AtomicReference;
import jd1.C41405l;
import kd1.C41498c;
import ld1.C41692b;
import yd1.C43357b;
import yd1.C43364i;

/* renamed from: rd1.b */
public final class C42360b extends C40734b {

    /* renamed from: d */
    final C40749p f99589d;

    /* renamed from: e */
    final C41405l f99590e;

    /* renamed from: f */
    final boolean f99591f;

    /* renamed from: rd1.b$a */
    static final class C42361a implements C40756v, C41205b {

        /* renamed from: k */
        static final C42362a f99592k = new C42362a((C42361a) null);

        /* renamed from: d */
        final C40737d f99593d;

        /* renamed from: e */
        final C41405l f99594e;

        /* renamed from: f */
        final boolean f99595f;

        /* renamed from: g */
        final C43357b f99596g = new C43357b();

        /* renamed from: h */
        final AtomicReference f99597h = new AtomicReference();

        /* renamed from: i */
        volatile boolean f99598i;

        /* renamed from: j */
        C41205b f99599j;

        /* renamed from: rd1.b$a$a */
        static final class C42362a extends AtomicReference implements C40737d {
            private static final long serialVersionUID = -8003404460084760287L;

            /* renamed from: d */
            final C42361a f99600d;

            C42362a(C42361a aVar) {
                this.f99600d = aVar;
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public void mo97817a() {
                C41498c.m120371a(this);
            }

            public void onComplete() {
                this.f99600d.mo97815b(this);
            }

            public void onError(Throwable th) {
                this.f99600d.mo97816c(this, th);
            }

            public void onSubscribe(C41205b bVar) {
                C41498c.m120376g(this, bVar);
            }
        }

        C42361a(C40737d dVar, C41405l lVar, boolean z) {
            this.f99593d = dVar;
            this.f99594e = lVar;
            this.f99595f = z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo97814a() {
            AtomicReference atomicReference = this.f99597h;
            C42362a aVar = f99592k;
            C42362a aVar2 = (C42362a) atomicReference.getAndSet(aVar);
            if (aVar2 != null && aVar2 != aVar) {
                aVar2.mo97817a();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo97815b(C42362a aVar) {
            if (C1612n.m5659a(this.f99597h, aVar, (Object) null) && this.f99598i) {
                Throwable b = this.f99596g.mo102035b();
                if (b == null) {
                    this.f99593d.onComplete();
                } else {
                    this.f99593d.onError(b);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo97816c(C42362a aVar, Throwable th) {
            if (!C1612n.m5659a(this.f99597h, aVar, (Object) null) || !this.f99596g.mo102034a(th)) {
                C40293a.m116722s(th);
            } else if (!this.f99595f) {
                dispose();
                Throwable b = this.f99596g.mo102035b();
                if (b != C43364i.f101206a) {
                    this.f99593d.onError(b);
                }
            } else if (this.f99598i) {
                this.f99593d.onError(this.f99596g.mo102035b());
            }
        }

        public void dispose() {
            this.f99599j.dispose();
            mo97814a();
        }

        public boolean isDisposed() {
            return this.f99597h.get() == f99592k;
        }

        public void onComplete() {
            this.f99598i = true;
            if (this.f99597h.get() == null) {
                Throwable b = this.f99596g.mo102035b();
                if (b == null) {
                    this.f99593d.onComplete();
                } else {
                    this.f99593d.onError(b);
                }
            }
        }

        public void onError(Throwable th) {
            if (!this.f99596g.mo102034a(th)) {
                C40293a.m116722s(th);
            } else if (this.f99595f) {
                onComplete();
            } else {
                mo97814a();
                Throwable b = this.f99596g.mo102035b();
                if (b != C43364i.f101206a) {
                    this.f99593d.onError(b);
                }
            }
        }

        public void onNext(Object obj) {
            C42362a aVar;
            try {
                C40739f fVar = (C40739f) C41692b.m120934e(this.f99594e.apply(obj), "The mapper returned a null CompletableSource");
                C42362a aVar2 = new C42362a(this);
                do {
                    aVar = (C42362a) this.f99597h.get();
                    if (aVar == f99592k) {
                        return;
                    }
                } while (!C1612n.m5659a(this.f99597h, aVar, aVar2));
                if (aVar != null) {
                    aVar.mo97817a();
                }
                fVar.mo94894a(aVar2);
            } catch (Throwable th) {
                C41300a.m119661b(th);
                this.f99599j.dispose();
                onError(th);
            }
        }

        public void onSubscribe(C41205b bVar) {
            if (C41498c.m120378l(this.f99599j, bVar)) {
                this.f99599j = bVar;
                this.f99593d.onSubscribe(this);
            }
        }
    }

    public C42360b(C40749p pVar, C41405l lVar, boolean z) {
        this.f99589d = pVar;
        this.f99590e = lVar;
        this.f99591f = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public void mo94889H(C40737d dVar) {
        if (!C42363c.m122875a(this.f99589d, this.f99590e, dVar)) {
            this.f99589d.mo95016c(new C42361a(dVar, this.f99590e, this.f99591f));
        }
    }
}
