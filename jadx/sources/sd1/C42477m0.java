package sd1;

import ae1.C40293a;
import ed1.C40754t;
import ed1.C40756v;
import hd1.C41205b;
import id1.C41300a;
import jd1.C41405l;
import kd1.C41502g;
import p469io.reactivex.exceptions.CompositeException;

/* renamed from: sd1.m0 */
public final class C42477m0 extends C42399a {

    /* renamed from: e */
    final C41405l f99944e;

    /* renamed from: f */
    final boolean f99945f;

    /* renamed from: sd1.m0$a */
    static final class C42478a implements C40756v {

        /* renamed from: d */
        final C40756v f99946d;

        /* renamed from: e */
        final C41405l f99947e;

        /* renamed from: f */
        final boolean f99948f;

        /* renamed from: g */
        final C41502g f99949g = new C41502g();

        /* renamed from: h */
        boolean f99950h;

        /* renamed from: i */
        boolean f99951i;

        C42478a(C40756v vVar, C41405l lVar, boolean z) {
            this.f99946d = vVar;
            this.f99947e = lVar;
            this.f99948f = z;
        }

        public void onComplete() {
            if (!this.f99951i) {
                this.f99951i = true;
                this.f99950h = true;
                this.f99946d.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (!this.f99950h) {
                this.f99950h = true;
                if (!this.f99948f || (th instanceof Exception)) {
                    try {
                        C40754t tVar = (C40754t) this.f99947e.apply(th);
                        if (tVar == null) {
                            NullPointerException nullPointerException = new NullPointerException("Observable is null");
                            nullPointerException.initCause(th);
                            this.f99946d.onError(nullPointerException);
                            return;
                        }
                        tVar.mo95016c(this);
                    } catch (Throwable th2) {
                        C41300a.m119661b(th2);
                        this.f99946d.onError(new CompositeException(th, th2));
                    }
                } else {
                    this.f99946d.onError(th);
                }
            } else if (this.f99951i) {
                C40293a.m116722s(th);
            } else {
                this.f99946d.onError(th);
            }
        }

        public void onNext(Object obj) {
            if (!this.f99951i) {
                this.f99946d.onNext(obj);
            }
        }

        public void onSubscribe(C41205b bVar) {
            this.f99949g.mo96265a(bVar);
        }
    }

    public C42477m0(C40754t tVar, C41405l lVar, boolean z) {
        super(tVar);
        this.f99944e = lVar;
        this.f99945f = z;
    }

    /* renamed from: I0 */
    public void mo94344I0(C40756v vVar) {
        C42478a aVar = new C42478a(vVar, this.f99944e, this.f99945f);
        vVar.onSubscribe(aVar.f99949g);
        this.f99678d.mo95016c(aVar);
    }
}
