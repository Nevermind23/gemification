package sd1;

import ae1.C40293a;
import ed1.C40754t;
import ed1.C40756v;
import hd1.C41205b;
import id1.C41300a;
import jd1.C41407n;
import kd1.C41498c;

/* renamed from: sd1.c1 */
public final class C42412c1 extends C42399a {

    /* renamed from: e */
    final C41407n f99718e;

    /* renamed from: sd1.c1$a */
    static final class C42413a implements C40756v, C41205b {

        /* renamed from: d */
        final C40756v f99719d;

        /* renamed from: e */
        final C41407n f99720e;

        /* renamed from: f */
        C41205b f99721f;

        /* renamed from: g */
        boolean f99722g;

        C42413a(C40756v vVar, C41407n nVar) {
            this.f99719d = vVar;
            this.f99720e = nVar;
        }

        public void dispose() {
            this.f99721f.dispose();
        }

        public boolean isDisposed() {
            return this.f99721f.isDisposed();
        }

        public void onComplete() {
            if (!this.f99722g) {
                this.f99722g = true;
                this.f99719d.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (!this.f99722g) {
                this.f99722g = true;
                this.f99719d.onError(th);
                return;
            }
            C40293a.m116722s(th);
        }

        public void onNext(Object obj) {
            if (!this.f99722g) {
                this.f99719d.onNext(obj);
                try {
                    if (this.f99720e.test(obj)) {
                        this.f99722g = true;
                        this.f99721f.dispose();
                        this.f99719d.onComplete();
                    }
                } catch (Throwable th) {
                    C41300a.m119661b(th);
                    this.f99721f.dispose();
                    onError(th);
                }
            }
        }

        public void onSubscribe(C41205b bVar) {
            if (C41498c.m120378l(this.f99721f, bVar)) {
                this.f99721f = bVar;
                this.f99719d.onSubscribe(this);
            }
        }
    }

    public C42412c1(C40754t tVar, C41407n nVar) {
        super(tVar);
        this.f99718e = nVar;
    }

    /* renamed from: I0 */
    public void mo94344I0(C40756v vVar) {
        this.f99678d.mo95016c(new C42413a(vVar, this.f99718e));
    }
}
