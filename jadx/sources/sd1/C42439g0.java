package sd1;

import ed1.C40749p;
import ed1.C40756v;
import ed1.C40757w;
import hd1.C41205b;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import kd1.C41498c;
import vd1.C43146n;

/* renamed from: sd1.g0 */
public final class C42439g0 extends C40749p {

    /* renamed from: d */
    final C40757w f99817d;

    /* renamed from: e */
    final long f99818e;

    /* renamed from: f */
    final long f99819f;

    /* renamed from: g */
    final TimeUnit f99820g;

    /* renamed from: sd1.g0$a */
    static final class C42440a extends AtomicReference implements C41205b, Runnable {
        private static final long serialVersionUID = 346773832286157679L;

        /* renamed from: d */
        final C40756v f99821d;

        /* renamed from: e */
        long f99822e;

        C42440a(C40756v vVar) {
            this.f99821d = vVar;
        }

        /* renamed from: a */
        public void mo97893a(C41205b bVar) {
            C41498c.m120376g(this, bVar);
        }

        public void dispose() {
            C41498c.m120371a(this);
        }

        public boolean isDisposed() {
            return get() == C41498c.DISPOSED;
        }

        public void run() {
            if (get() != C41498c.DISPOSED) {
                C40756v vVar = this.f99821d;
                long j = this.f99822e;
                this.f99822e = 1 + j;
                vVar.onNext(Long.valueOf(j));
            }
        }
    }

    public C42439g0(long j, long j2, TimeUnit timeUnit, C40757w wVar) {
        this.f99818e = j;
        this.f99819f = j2;
        this.f99820g = timeUnit;
        this.f99817d = wVar;
    }

    /* renamed from: I0 */
    public void mo94344I0(C40756v vVar) {
        C42440a aVar = new C42440a(vVar);
        vVar.onSubscribe(aVar);
        C40757w wVar = this.f99817d;
        if (wVar instanceof C43146n) {
            C40757w.C40760c b = wVar.mo95051b();
            aVar.mo97893a(b);
            b.mo95060d(aVar, this.f99818e, this.f99819f, this.f99820g);
            return;
        }
        aVar.mo97893a(wVar.mo95054e(aVar, this.f99818e, this.f99819f, this.f99820g));
    }
}
