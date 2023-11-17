package sd1;

import ae1.C40293a;
import ed1.C40754t;
import ed1.C40756v;
import ed1.C40757w;
import hd1.C41205b;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kd1.C41498c;
import p469io.reactivex.observers.C41381b;

/* renamed from: sd1.h */
public final class C42444h extends C42399a {

    /* renamed from: e */
    final long f99828e;

    /* renamed from: f */
    final TimeUnit f99829f;

    /* renamed from: g */
    final C40757w f99830g;

    /* renamed from: sd1.h$a */
    static final class C42445a extends AtomicReference implements Runnable, C41205b {
        private static final long serialVersionUID = 6812032969491025141L;

        /* renamed from: d */
        final Object f99831d;

        /* renamed from: e */
        final long f99832e;

        /* renamed from: f */
        final C42446b f99833f;

        /* renamed from: g */
        final AtomicBoolean f99834g = new AtomicBoolean();

        C42445a(Object obj, long j, C42446b bVar) {
            this.f99831d = obj;
            this.f99832e = j;
            this.f99833f = bVar;
        }

        /* renamed from: a */
        public void mo97896a(C41205b bVar) {
            C41498c.m120373c(this, bVar);
        }

        public void dispose() {
            C41498c.m120371a(this);
        }

        public boolean isDisposed() {
            return get() == C41498c.DISPOSED;
        }

        public void run() {
            if (this.f99834g.compareAndSet(false, true)) {
                this.f99833f.mo97898a(this.f99832e, this.f99831d, this);
            }
        }
    }

    /* renamed from: sd1.h$b */
    static final class C42446b implements C40756v, C41205b {

        /* renamed from: d */
        final C40756v f99835d;

        /* renamed from: e */
        final long f99836e;

        /* renamed from: f */
        final TimeUnit f99837f;

        /* renamed from: g */
        final C40757w.C40760c f99838g;

        /* renamed from: h */
        C41205b f99839h;

        /* renamed from: i */
        C41205b f99840i;

        /* renamed from: j */
        volatile long f99841j;

        /* renamed from: k */
        boolean f99842k;

        C42446b(C40756v vVar, long j, TimeUnit timeUnit, C40757w.C40760c cVar) {
            this.f99835d = vVar;
            this.f99836e = j;
            this.f99837f = timeUnit;
            this.f99838g = cVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo97898a(long j, Object obj, C42445a aVar) {
            if (j == this.f99841j) {
                this.f99835d.onNext(obj);
                aVar.dispose();
            }
        }

        public void dispose() {
            this.f99839h.dispose();
            this.f99838g.dispose();
        }

        public boolean isDisposed() {
            return this.f99838g.isDisposed();
        }

        public void onComplete() {
            if (!this.f99842k) {
                this.f99842k = true;
                C41205b bVar = this.f99840i;
                if (bVar != null) {
                    bVar.dispose();
                }
                C42445a aVar = (C42445a) bVar;
                if (aVar != null) {
                    aVar.run();
                }
                this.f99835d.onComplete();
                this.f99838g.dispose();
            }
        }

        public void onError(Throwable th) {
            if (this.f99842k) {
                C40293a.m116722s(th);
                return;
            }
            C41205b bVar = this.f99840i;
            if (bVar != null) {
                bVar.dispose();
            }
            this.f99842k = true;
            this.f99835d.onError(th);
            this.f99838g.dispose();
        }

        public void onNext(Object obj) {
            if (!this.f99842k) {
                long j = this.f99841j + 1;
                this.f99841j = j;
                C41205b bVar = this.f99840i;
                if (bVar != null) {
                    bVar.dispose();
                }
                C42445a aVar = new C42445a(obj, j, this);
                this.f99840i = aVar;
                aVar.mo97896a(this.f99838g.mo95059c(aVar, this.f99836e, this.f99837f));
            }
        }

        public void onSubscribe(C41205b bVar) {
            if (C41498c.m120378l(this.f99839h, bVar)) {
                this.f99839h = bVar;
                this.f99835d.onSubscribe(this);
            }
        }
    }

    public C42444h(C40754t tVar, long j, TimeUnit timeUnit, C40757w wVar) {
        super(tVar);
        this.f99828e = j;
        this.f99829f = timeUnit;
        this.f99830g = wVar;
    }

    /* renamed from: I0 */
    public void mo94344I0(C40756v vVar) {
        this.f99678d.mo95016c(new C42446b(new C41381b(vVar), this.f99828e, this.f99829f, this.f99830g.mo95051b()));
    }
}
