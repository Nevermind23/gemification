package sd1;

import ae1.C40293a;
import ed1.C40754t;
import ed1.C40756v;
import ed1.C40757w;
import hd1.C41205b;
import java.util.concurrent.atomic.AtomicBoolean;
import kd1.C41498c;

/* renamed from: sd1.g1 */
public final class C42441g1 extends C42399a {

    /* renamed from: e */
    final C40757w f99823e;

    /* renamed from: sd1.g1$a */
    static final class C42442a extends AtomicBoolean implements C40756v, C41205b {
        private static final long serialVersionUID = 1015244841293359600L;

        /* renamed from: d */
        final C40756v f99824d;

        /* renamed from: e */
        final C40757w f99825e;

        /* renamed from: f */
        C41205b f99826f;

        /* renamed from: sd1.g1$a$a */
        final class C42443a implements Runnable {
            C42443a() {
            }

            public void run() {
                C42442a.this.f99826f.dispose();
            }
        }

        C42442a(C40756v vVar, C40757w wVar) {
            this.f99824d = vVar;
            this.f99825e = wVar;
        }

        public void dispose() {
            if (compareAndSet(false, true)) {
                this.f99825e.mo95052c(new C42443a());
            }
        }

        public boolean isDisposed() {
            return get();
        }

        public void onComplete() {
            if (!get()) {
                this.f99824d.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (get()) {
                C40293a.m116722s(th);
            } else {
                this.f99824d.onError(th);
            }
        }

        public void onNext(Object obj) {
            if (!get()) {
                this.f99824d.onNext(obj);
            }
        }

        public void onSubscribe(C41205b bVar) {
            if (C41498c.m120378l(this.f99826f, bVar)) {
                this.f99826f = bVar;
                this.f99824d.onSubscribe(this);
            }
        }
    }

    public C42441g1(C40754t tVar, C40757w wVar) {
        super(tVar);
        this.f99823e = wVar;
    }

    /* renamed from: I0 */
    public void mo94344I0(C40756v vVar) {
        this.f99678d.mo95016c(new C42442a(vVar, this.f99823e));
    }
}
