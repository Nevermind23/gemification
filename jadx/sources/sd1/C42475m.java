package sd1;

import ae1.C40293a;
import ed1.C40754t;
import ed1.C40756v;
import hd1.C41205b;
import id1.C41300a;
import jd1.C41394a;
import jd1.C41399f;
import kd1.C41498c;
import p469io.reactivex.exceptions.CompositeException;

/* renamed from: sd1.m */
public final class C42475m extends C42399a {

    /* renamed from: e */
    final C41399f f99933e;

    /* renamed from: f */
    final C41399f f99934f;

    /* renamed from: g */
    final C41394a f99935g;

    /* renamed from: h */
    final C41394a f99936h;

    /* renamed from: sd1.m$a */
    static final class C42476a implements C40756v, C41205b {

        /* renamed from: d */
        final C40756v f99937d;

        /* renamed from: e */
        final C41399f f99938e;

        /* renamed from: f */
        final C41399f f99939f;

        /* renamed from: g */
        final C41394a f99940g;

        /* renamed from: h */
        final C41394a f99941h;

        /* renamed from: i */
        C41205b f99942i;

        /* renamed from: j */
        boolean f99943j;

        C42476a(C40756v vVar, C41399f fVar, C41399f fVar2, C41394a aVar, C41394a aVar2) {
            this.f99937d = vVar;
            this.f99938e = fVar;
            this.f99939f = fVar2;
            this.f99940g = aVar;
            this.f99941h = aVar2;
        }

        public void dispose() {
            this.f99942i.dispose();
        }

        public boolean isDisposed() {
            return this.f99942i.isDisposed();
        }

        public void onComplete() {
            if (!this.f99943j) {
                try {
                    this.f99940g.run();
                    this.f99943j = true;
                    this.f99937d.onComplete();
                    try {
                        this.f99941h.run();
                    } catch (Throwable th) {
                        C41300a.m119661b(th);
                        C40293a.m116722s(th);
                    }
                } catch (Throwable th2) {
                    C41300a.m119661b(th2);
                    onError(th2);
                }
            }
        }

        public void onError(Throwable th) {
            if (this.f99943j) {
                C40293a.m116722s(th);
                return;
            }
            this.f99943j = true;
            try {
                this.f99939f.accept(th);
            } catch (Throwable th2) {
                C41300a.m119661b(th2);
                th = new CompositeException(th, th2);
            }
            this.f99937d.onError(th);
            try {
                this.f99941h.run();
            } catch (Throwable th3) {
                C41300a.m119661b(th3);
                C40293a.m116722s(th3);
            }
        }

        public void onNext(Object obj) {
            if (!this.f99943j) {
                try {
                    this.f99938e.accept(obj);
                    this.f99937d.onNext(obj);
                } catch (Throwable th) {
                    C41300a.m119661b(th);
                    this.f99942i.dispose();
                    onError(th);
                }
            }
        }

        public void onSubscribe(C41205b bVar) {
            if (C41498c.m120378l(this.f99942i, bVar)) {
                this.f99942i = bVar;
                this.f99937d.onSubscribe(this);
            }
        }
    }

    public C42475m(C40754t tVar, C41399f fVar, C41399f fVar2, C41394a aVar, C41394a aVar2) {
        super(tVar);
        this.f99933e = fVar;
        this.f99934f = fVar2;
        this.f99935g = aVar;
        this.f99936h = aVar2;
    }

    /* renamed from: I0 */
    public void mo94344I0(C40756v vVar) {
        this.f99678d.mo95016c(new C42476a(vVar, this.f99933e, this.f99934f, this.f99935g, this.f99936h));
    }
}
