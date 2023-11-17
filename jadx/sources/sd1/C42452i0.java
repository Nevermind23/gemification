package sd1;

import ed1.C40754t;
import ed1.C40756v;
import ed1.C40762x;
import ed1.C40764z;
import hd1.C41205b;
import java.util.NoSuchElementException;
import kd1.C41498c;

/* renamed from: sd1.i0 */
public final class C42452i0 extends C40762x {

    /* renamed from: d */
    final C40754t f99853d;

    /* renamed from: e */
    final Object f99854e;

    /* renamed from: sd1.i0$a */
    static final class C42453a implements C40756v, C41205b {

        /* renamed from: d */
        final C40764z f99855d;

        /* renamed from: e */
        final Object f99856e;

        /* renamed from: f */
        C41205b f99857f;

        /* renamed from: g */
        Object f99858g;

        C42453a(C40764z zVar, Object obj) {
            this.f99855d = zVar;
            this.f99856e = obj;
        }

        public void dispose() {
            this.f99857f.dispose();
            this.f99857f = C41498c.DISPOSED;
        }

        public boolean isDisposed() {
            return this.f99857f == C41498c.DISPOSED;
        }

        public void onComplete() {
            this.f99857f = C41498c.DISPOSED;
            Object obj = this.f99858g;
            if (obj != null) {
                this.f99858g = null;
                this.f99855d.mo95096a(obj);
                return;
            }
            Object obj2 = this.f99856e;
            if (obj2 != null) {
                this.f99855d.mo95096a(obj2);
            } else {
                this.f99855d.onError(new NoSuchElementException());
            }
        }

        public void onError(Throwable th) {
            this.f99857f = C41498c.DISPOSED;
            this.f99858g = null;
            this.f99855d.onError(th);
        }

        public void onNext(Object obj) {
            this.f99858g = obj;
        }

        public void onSubscribe(C41205b bVar) {
            if (C41498c.m120378l(this.f99857f, bVar)) {
                this.f99857f = bVar;
                this.f99855d.onSubscribe(this);
            }
        }
    }

    public C42452i0(C40754t tVar, Object obj) {
        this.f99853d = tVar;
        this.f99854e = obj;
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public void mo95071J(C40764z zVar) {
        this.f99853d.mo95016c(new C42453a(zVar, this.f99854e));
    }
}
