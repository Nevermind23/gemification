package sd1;

import ae1.C40293a;
import ed1.C40754t;
import ed1.C40756v;
import hd1.C41205b;
import kd1.C41498c;
import kd1.C41499d;

/* renamed from: sd1.b1 */
public final class C42408b1 extends C42399a {

    /* renamed from: e */
    final long f99712e;

    /* renamed from: sd1.b1$a */
    static final class C42409a implements C40756v, C41205b {

        /* renamed from: d */
        final C40756v f99713d;

        /* renamed from: e */
        boolean f99714e;

        /* renamed from: f */
        C41205b f99715f;

        /* renamed from: g */
        long f99716g;

        C42409a(C40756v vVar, long j) {
            this.f99713d = vVar;
            this.f99716g = j;
        }

        public void dispose() {
            this.f99715f.dispose();
        }

        public boolean isDisposed() {
            return this.f99715f.isDisposed();
        }

        public void onComplete() {
            if (!this.f99714e) {
                this.f99714e = true;
                this.f99715f.dispose();
                this.f99713d.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (this.f99714e) {
                C40293a.m116722s(th);
                return;
            }
            this.f99714e = true;
            this.f99715f.dispose();
            this.f99713d.onError(th);
        }

        public void onNext(Object obj) {
            boolean z;
            if (!this.f99714e) {
                long j = this.f99716g;
                long j2 = j - 1;
                this.f99716g = j2;
                if (j > 0) {
                    if (j2 == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    this.f99713d.onNext(obj);
                    if (z) {
                        onComplete();
                    }
                }
            }
        }

        public void onSubscribe(C41205b bVar) {
            if (C41498c.m120378l(this.f99715f, bVar)) {
                this.f99715f = bVar;
                if (this.f99716g == 0) {
                    this.f99714e = true;
                    bVar.dispose();
                    C41499d.m120381g(this.f99713d);
                    return;
                }
                this.f99713d.onSubscribe(this);
            }
        }
    }

    public C42408b1(C40754t tVar, long j) {
        super(tVar);
        this.f99712e = j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: I0 */
    public void mo94344I0(C40756v vVar) {
        this.f99678d.mo95016c(new C42409a(vVar, this.f99712e));
    }
}
