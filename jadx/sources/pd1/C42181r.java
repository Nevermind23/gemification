package pd1;

import ae1.C40293a;
import ed1.C40741h;
import ed1.C40742i;
import java.util.concurrent.atomic.AtomicLong;
import p469io.reactivex.exceptions.MissingBackpressureException;
import uh1.C43107b;
import uh1.C43108c;
import xd1.C43259d;
import yd1.C43358c;

/* renamed from: pd1.r */
public final class C42181r extends C42144a {

    /* renamed from: pd1.r$a */
    static final class C42182a extends AtomicLong implements C40742i, C43108c {
        private static final long serialVersionUID = -3176480756392482682L;

        /* renamed from: d */
        final C43107b f99232d;

        /* renamed from: e */
        C43108c f99233e;

        /* renamed from: f */
        boolean f99234f;

        C42182a(C43107b bVar) {
            this.f99232d = bVar;
        }

        /* renamed from: b */
        public void mo27070b(C43108c cVar) {
            if (C43259d.m124224h(this.f99233e, cVar)) {
                this.f99233e = cVar;
                this.f99232d.mo27070b(this);
                cVar.mo94357l(Long.MAX_VALUE);
            }
        }

        public void cancel() {
            this.f99233e.cancel();
        }

        /* renamed from: l */
        public void mo94357l(long j) {
            if (C43259d.m124223g(j)) {
                C43358c.m124395a(this, j);
            }
        }

        public void onComplete() {
            if (!this.f99234f) {
                this.f99234f = true;
                this.f99232d.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (this.f99234f) {
                C40293a.m116722s(th);
                return;
            }
            this.f99234f = true;
            this.f99232d.onError(th);
        }

        public void onNext(Object obj) {
            if (!this.f99234f) {
                if (get() != 0) {
                    this.f99232d.onNext(obj);
                    C43358c.m124398d(this, 1);
                    return;
                }
                this.f99233e.cancel();
                onError(new MissingBackpressureException("could not emit value due to lack of requests"));
            }
        }
    }

    public C42181r(C40741h hVar) {
        super(hVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public void mo94348F(C43107b bVar) {
        this.f99110e.mo94922E(new C42182a(bVar));
    }
}
