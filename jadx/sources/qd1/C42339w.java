package qd1;

import ed1.C40735b0;
import ed1.C40746m;
import ed1.C40748o;
import ed1.C40762x;
import ed1.C40764z;
import hd1.C41205b;
import java.util.concurrent.atomic.AtomicReference;
import kd1.C41498c;

/* renamed from: qd1.w */
public final class C42339w extends C40762x {

    /* renamed from: d */
    final C40748o f99555d;

    /* renamed from: e */
    final C40735b0 f99556e;

    /* renamed from: qd1.w$a */
    static final class C42340a extends AtomicReference implements C40746m, C41205b {
        private static final long serialVersionUID = 4603919676453758899L;

        /* renamed from: d */
        final C40764z f99557d;

        /* renamed from: e */
        final C40735b0 f99558e;

        /* renamed from: qd1.w$a$a */
        static final class C42341a implements C40764z {

            /* renamed from: d */
            final C40764z f99559d;

            /* renamed from: e */
            final AtomicReference f99560e;

            C42341a(C40764z zVar, AtomicReference atomicReference) {
                this.f99559d = zVar;
                this.f99560e = atomicReference;
            }

            /* renamed from: a */
            public void mo95096a(Object obj) {
                this.f99559d.mo95096a(obj);
            }

            public void onError(Throwable th) {
                this.f99559d.onError(th);
            }

            public void onSubscribe(C41205b bVar) {
                C41498c.m120376g(this.f99560e, bVar);
            }
        }

        C42340a(C40764z zVar, C40735b0 b0Var) {
            this.f99557d = zVar;
            this.f99558e = b0Var;
        }

        /* renamed from: a */
        public void mo94967a(Object obj) {
            this.f99557d.mo95096a(obj);
        }

        public void dispose() {
            C41498c.m120371a(this);
        }

        public boolean isDisposed() {
            return C41498c.m120372b((C41205b) get());
        }

        public void onComplete() {
            C41205b bVar = (C41205b) get();
            if (bVar != C41498c.DISPOSED && compareAndSet(bVar, (Object) null)) {
                this.f99558e.mo94907c(new C42341a(this.f99557d, this));
            }
        }

        public void onError(Throwable th) {
            this.f99557d.onError(th);
        }

        public void onSubscribe(C41205b bVar) {
            if (C41498c.m120376g(this, bVar)) {
                this.f99557d.onSubscribe(this);
            }
        }
    }

    public C42339w(C40748o oVar, C40735b0 b0Var) {
        this.f99555d = oVar;
        this.f99556e = b0Var;
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public void mo95071J(C40764z zVar) {
        this.f99555d.mo94947c(new C42340a(zVar, this.f99556e));
    }
}
