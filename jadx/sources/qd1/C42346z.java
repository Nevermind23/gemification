package qd1;

import ed1.C40746m;
import ed1.C40748o;
import ed1.C40762x;
import ed1.C40764z;
import hd1.C41205b;
import java.util.NoSuchElementException;
import kd1.C41498c;

/* renamed from: qd1.z */
public final class C42346z extends C40762x {

    /* renamed from: d */
    final C40748o f99565d;

    /* renamed from: e */
    final Object f99566e;

    /* renamed from: qd1.z$a */
    static final class C42347a implements C40746m, C41205b {

        /* renamed from: d */
        final C40764z f99567d;

        /* renamed from: e */
        final Object f99568e;

        /* renamed from: f */
        C41205b f99569f;

        C42347a(C40764z zVar, Object obj) {
            this.f99567d = zVar;
            this.f99568e = obj;
        }

        /* renamed from: a */
        public void mo94967a(Object obj) {
            this.f99569f = C41498c.DISPOSED;
            this.f99567d.mo95096a(obj);
        }

        public void dispose() {
            this.f99569f.dispose();
            this.f99569f = C41498c.DISPOSED;
        }

        public boolean isDisposed() {
            return this.f99569f.isDisposed();
        }

        public void onComplete() {
            this.f99569f = C41498c.DISPOSED;
            Object obj = this.f99568e;
            if (obj != null) {
                this.f99567d.mo95096a(obj);
            } else {
                this.f99567d.onError(new NoSuchElementException("The MaybeSource is empty"));
            }
        }

        public void onError(Throwable th) {
            this.f99569f = C41498c.DISPOSED;
            this.f99567d.onError(th);
        }

        public void onSubscribe(C41205b bVar) {
            if (C41498c.m120378l(this.f99569f, bVar)) {
                this.f99569f = bVar;
                this.f99567d.onSubscribe(this);
            }
        }
    }

    public C42346z(C40748o oVar, Object obj) {
        this.f99565d = oVar;
        this.f99566e = obj;
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public void mo95071J(C40764z zVar) {
        this.f99565d.mo94947c(new C42347a(zVar, this.f99566e));
    }
}
