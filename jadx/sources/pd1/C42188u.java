package pd1;

import ed1.C40741h;
import ed1.C40757w;
import hd1.C41205b;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import kd1.C41498c;
import kd1.C41499d;
import p469io.reactivex.exceptions.MissingBackpressureException;
import uh1.C43107b;
import uh1.C43108c;
import xd1.C43259d;

/* renamed from: pd1.u */
public final class C42188u extends C40741h {

    /* renamed from: e */
    final C40757w f99252e;

    /* renamed from: f */
    final long f99253f;

    /* renamed from: g */
    final TimeUnit f99254g;

    /* renamed from: pd1.u$a */
    static final class C42189a extends AtomicReference implements C43108c, Runnable {
        private static final long serialVersionUID = -2809475196591179431L;

        /* renamed from: d */
        final C43107b f99255d;

        /* renamed from: e */
        volatile boolean f99256e;

        C42189a(C43107b bVar) {
            this.f99255d = bVar;
        }

        /* renamed from: a */
        public void mo97665a(C41205b bVar) {
            C41498c.m120377h(this, bVar);
        }

        public void cancel() {
            C41498c.m120371a(this);
        }

        /* renamed from: l */
        public void mo94357l(long j) {
            if (C43259d.m124223g(j)) {
                this.f99256e = true;
            }
        }

        public void run() {
            if (get() == C41498c.DISPOSED) {
                return;
            }
            if (this.f99256e) {
                this.f99255d.onNext(0L);
                lazySet(C41499d.INSTANCE);
                this.f99255d.onComplete();
                return;
            }
            lazySet(C41499d.INSTANCE);
            this.f99255d.onError(new MissingBackpressureException("Can't deliver value due to lack of requests"));
        }
    }

    public C42188u(long j, TimeUnit timeUnit, C40757w wVar) {
        this.f99253f = j;
        this.f99254g = timeUnit;
        this.f99252e = wVar;
    }

    /* renamed from: F */
    public void mo94348F(C43107b bVar) {
        C42189a aVar = new C42189a(bVar);
        bVar.mo27070b(aVar);
        aVar.mo97665a(this.f99252e.mo95053d(aVar, this.f99253f, this.f99254g));
    }
}
