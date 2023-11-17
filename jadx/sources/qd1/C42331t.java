package qd1;

import ae1.C40293a;
import ed1.C40746m;
import ed1.C40748o;
import hd1.C41205b;
import id1.C41300a;
import jd1.C41394a;
import jd1.C41399f;
import kd1.C41498c;
import kd1.C41499d;
import p469io.reactivex.exceptions.CompositeException;

/* renamed from: qd1.t */
public final class C42331t extends C42296a {

    /* renamed from: e */
    final C41399f f99536e;

    /* renamed from: f */
    final C41399f f99537f;

    /* renamed from: g */
    final C41399f f99538g;

    /* renamed from: h */
    final C41394a f99539h;

    /* renamed from: i */
    final C41394a f99540i;

    /* renamed from: j */
    final C41394a f99541j;

    /* renamed from: qd1.t$a */
    static final class C42332a implements C40746m, C41205b {

        /* renamed from: d */
        final C40746m f99542d;

        /* renamed from: e */
        final C42331t f99543e;

        /* renamed from: f */
        C41205b f99544f;

        C42332a(C40746m mVar, C42331t tVar) {
            this.f99542d = mVar;
            this.f99543e = tVar;
        }

        /* renamed from: a */
        public void mo94967a(Object obj) {
            C41205b bVar = this.f99544f;
            C41498c cVar = C41498c.DISPOSED;
            if (bVar != cVar) {
                try {
                    this.f99543e.f99537f.accept(obj);
                    this.f99544f = cVar;
                    this.f99542d.mo94967a(obj);
                    mo97780b();
                } catch (Throwable th) {
                    C41300a.m119661b(th);
                    mo97781c(th);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo97780b() {
            try {
                this.f99543e.f99540i.run();
            } catch (Throwable th) {
                C41300a.m119661b(th);
                C40293a.m116722s(th);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo97781c(Throwable th) {
            try {
                this.f99543e.f99538g.accept(th);
            } catch (Throwable th2) {
                C41300a.m119661b(th2);
                th = new CompositeException(th, th2);
            }
            this.f99544f = C41498c.DISPOSED;
            this.f99542d.onError(th);
            mo97780b();
        }

        public void dispose() {
            try {
                this.f99543e.f99541j.run();
            } catch (Throwable th) {
                C41300a.m119661b(th);
                C40293a.m116722s(th);
            }
            this.f99544f.dispose();
            this.f99544f = C41498c.DISPOSED;
        }

        public boolean isDisposed() {
            return this.f99544f.isDisposed();
        }

        public void onComplete() {
            C41205b bVar = this.f99544f;
            C41498c cVar = C41498c.DISPOSED;
            if (bVar != cVar) {
                try {
                    this.f99543e.f99539h.run();
                    this.f99544f = cVar;
                    this.f99542d.onComplete();
                    mo97780b();
                } catch (Throwable th) {
                    C41300a.m119661b(th);
                    mo97781c(th);
                }
            }
        }

        public void onError(Throwable th) {
            if (this.f99544f == C41498c.DISPOSED) {
                C40293a.m116722s(th);
            } else {
                mo97781c(th);
            }
        }

        public void onSubscribe(C41205b bVar) {
            if (C41498c.m120378l(this.f99544f, bVar)) {
                try {
                    this.f99543e.f99536e.accept(bVar);
                    this.f99544f = bVar;
                    this.f99542d.onSubscribe(this);
                } catch (Throwable th) {
                    C41300a.m119661b(th);
                    bVar.dispose();
                    this.f99544f = C41498c.DISPOSED;
                    C41499d.m120383l(th, this.f99542d);
                }
            }
        }
    }

    public C42331t(C40748o oVar, C41399f fVar, C41399f fVar2, C41399f fVar3, C41394a aVar, C41394a aVar2, C41394a aVar3) {
        super(oVar);
        this.f99536e = fVar;
        this.f99537f = fVar2;
        this.f99538g = fVar3;
        this.f99539h = aVar;
        this.f99540i = aVar2;
        this.f99541j = aVar3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public void mo94961w(C40746m mVar) {
        this.f99467d.mo94947c(new C42332a(mVar, this));
    }
}
