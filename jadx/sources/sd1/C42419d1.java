package sd1;

import ae1.C40293a;
import ed1.C40754t;
import ed1.C40756v;
import ed1.C40757w;
import hd1.C41205b;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import kd1.C41498c;
import p469io.reactivex.observers.C41381b;

/* renamed from: sd1.d1 */
public final class C42419d1 extends C42399a {

    /* renamed from: e */
    final long f99744e;

    /* renamed from: f */
    final TimeUnit f99745f;

    /* renamed from: g */
    final C40757w f99746g;

    /* renamed from: sd1.d1$a */
    static final class C42420a extends AtomicReference implements C40756v, C41205b, Runnable {
        private static final long serialVersionUID = 786994795061867455L;

        /* renamed from: d */
        final C40756v f99747d;

        /* renamed from: e */
        final long f99748e;

        /* renamed from: f */
        final TimeUnit f99749f;

        /* renamed from: g */
        final C40757w.C40760c f99750g;

        /* renamed from: h */
        C41205b f99751h;

        /* renamed from: i */
        volatile boolean f99752i;

        /* renamed from: j */
        boolean f99753j;

        C42420a(C40756v vVar, long j, TimeUnit timeUnit, C40757w.C40760c cVar) {
            this.f99747d = vVar;
            this.f99748e = j;
            this.f99749f = timeUnit;
            this.f99750g = cVar;
        }

        public void dispose() {
            this.f99751h.dispose();
            this.f99750g.dispose();
        }

        public boolean isDisposed() {
            return this.f99750g.isDisposed();
        }

        public void onComplete() {
            if (!this.f99753j) {
                this.f99753j = true;
                this.f99747d.onComplete();
                this.f99750g.dispose();
            }
        }

        public void onError(Throwable th) {
            if (this.f99753j) {
                C40293a.m116722s(th);
                return;
            }
            this.f99753j = true;
            this.f99747d.onError(th);
            this.f99750g.dispose();
        }

        public void onNext(Object obj) {
            if (!this.f99752i && !this.f99753j) {
                this.f99752i = true;
                this.f99747d.onNext(obj);
                C41205b bVar = (C41205b) get();
                if (bVar != null) {
                    bVar.dispose();
                }
                C41498c.m120373c(this, this.f99750g.mo95059c(this, this.f99748e, this.f99749f));
            }
        }

        public void onSubscribe(C41205b bVar) {
            if (C41498c.m120378l(this.f99751h, bVar)) {
                this.f99751h = bVar;
                this.f99747d.onSubscribe(this);
            }
        }

        public void run() {
            this.f99752i = false;
        }
    }

    public C42419d1(C40754t tVar, long j, TimeUnit timeUnit, C40757w wVar) {
        super(tVar);
        this.f99744e = j;
        this.f99745f = timeUnit;
        this.f99746g = wVar;
    }

    /* renamed from: I0 */
    public void mo94344I0(C40756v vVar) {
        this.f99678d.mo95016c(new C42420a(new C41381b(vVar), this.f99744e, this.f99745f, this.f99746g.mo95051b()));
    }
}
