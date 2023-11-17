package pd1;

import ae1.C40293a;
import ed1.C40741h;
import ed1.C40742i;
import ed1.C40757w;
import fe1.C40941b;
import hd1.C41205b;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kd1.C41498c;
import p469io.reactivex.exceptions.MissingBackpressureException;
import uh1.C43107b;
import uh1.C43108c;
import xd1.C43259d;
import yd1.C43358c;

/* renamed from: pd1.b */
public final class C42145b extends C42144a {

    /* renamed from: f */
    final long f99111f;

    /* renamed from: g */
    final TimeUnit f99112g;

    /* renamed from: h */
    final C40757w f99113h;

    /* renamed from: pd1.b$a */
    static final class C42146a extends AtomicReference implements Runnable, C41205b {
        private static final long serialVersionUID = 6812032969491025141L;

        /* renamed from: d */
        final Object f99114d;

        /* renamed from: e */
        final long f99115e;

        /* renamed from: f */
        final C42147b f99116f;

        /* renamed from: g */
        final AtomicBoolean f99117g = new AtomicBoolean();

        C42146a(Object obj, long j, C42147b bVar) {
            this.f99114d = obj;
            this.f99115e = j;
            this.f99116f = bVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo97640a() {
            if (this.f99117g.compareAndSet(false, true)) {
                this.f99116f.mo97643a(this.f99115e, this.f99114d, this);
            }
        }

        /* renamed from: b */
        public void mo97641b(C41205b bVar) {
            C41498c.m120373c(this, bVar);
        }

        public void dispose() {
            C41498c.m120371a(this);
        }

        public boolean isDisposed() {
            return get() == C41498c.DISPOSED;
        }

        public void run() {
            mo97640a();
        }
    }

    /* renamed from: pd1.b$b */
    static final class C42147b extends AtomicLong implements C40742i, C43108c {
        private static final long serialVersionUID = -9102637559663639004L;

        /* renamed from: d */
        final C43107b f99118d;

        /* renamed from: e */
        final long f99119e;

        /* renamed from: f */
        final TimeUnit f99120f;

        /* renamed from: g */
        final C40757w.C40760c f99121g;

        /* renamed from: h */
        C43108c f99122h;

        /* renamed from: i */
        C41205b f99123i;

        /* renamed from: j */
        volatile long f99124j;

        /* renamed from: k */
        boolean f99125k;

        C42147b(C43107b bVar, long j, TimeUnit timeUnit, C40757w.C40760c cVar) {
            this.f99118d = bVar;
            this.f99119e = j;
            this.f99120f = timeUnit;
            this.f99121g = cVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo97643a(long j, Object obj, C42146a aVar) {
            if (j != this.f99124j) {
                return;
            }
            if (get() != 0) {
                this.f99118d.onNext(obj);
                C43358c.m124398d(this, 1);
                aVar.dispose();
                return;
            }
            cancel();
            this.f99118d.onError(new MissingBackpressureException("Could not deliver value due to lack of requests"));
        }

        /* renamed from: b */
        public void mo27070b(C43108c cVar) {
            if (C43259d.m124224h(this.f99122h, cVar)) {
                this.f99122h = cVar;
                this.f99118d.mo27070b(this);
                cVar.mo94357l(Long.MAX_VALUE);
            }
        }

        public void cancel() {
            this.f99122h.cancel();
            this.f99121g.dispose();
        }

        /* renamed from: l */
        public void mo94357l(long j) {
            if (C43259d.m124223g(j)) {
                C43358c.m124395a(this, j);
            }
        }

        public void onComplete() {
            if (!this.f99125k) {
                this.f99125k = true;
                C41205b bVar = this.f99123i;
                if (bVar != null) {
                    bVar.dispose();
                }
                C42146a aVar = (C42146a) bVar;
                if (aVar != null) {
                    aVar.mo97640a();
                }
                this.f99118d.onComplete();
                this.f99121g.dispose();
            }
        }

        public void onError(Throwable th) {
            if (this.f99125k) {
                C40293a.m116722s(th);
                return;
            }
            this.f99125k = true;
            C41205b bVar = this.f99123i;
            if (bVar != null) {
                bVar.dispose();
            }
            this.f99118d.onError(th);
            this.f99121g.dispose();
        }

        public void onNext(Object obj) {
            if (!this.f99125k) {
                long j = this.f99124j + 1;
                this.f99124j = j;
                C41205b bVar = this.f99123i;
                if (bVar != null) {
                    bVar.dispose();
                }
                C42146a aVar = new C42146a(obj, j, this);
                this.f99123i = aVar;
                aVar.mo97641b(this.f99121g.mo95059c(aVar, this.f99119e, this.f99120f));
            }
        }
    }

    public C42145b(C40741h hVar, long j, TimeUnit timeUnit, C40757w wVar) {
        super(hVar);
        this.f99111f = j;
        this.f99112g = timeUnit;
        this.f99113h = wVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public void mo94348F(C43107b bVar) {
        this.f99110e.mo94922E(new C42147b(new C40941b(bVar), this.f99111f, this.f99112g, this.f99113h.mo95051b()));
    }
}
