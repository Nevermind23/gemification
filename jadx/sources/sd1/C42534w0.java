package sd1;

import ae1.C40293a;
import ed1.C40744k;
import ed1.C40746m;
import ed1.C40754t;
import ed1.C40756v;
import hd1.C41205b;
import kd1.C41498c;

/* renamed from: sd1.w0 */
public final class C42534w0 extends C40744k {

    /* renamed from: d */
    final C40754t f100114d;

    /* renamed from: sd1.w0$a */
    static final class C42535a implements C40756v, C41205b {

        /* renamed from: d */
        final C40746m f100115d;

        /* renamed from: e */
        C41205b f100116e;

        /* renamed from: f */
        Object f100117f;

        /* renamed from: g */
        boolean f100118g;

        C42535a(C40746m mVar) {
            this.f100115d = mVar;
        }

        public void dispose() {
            this.f100116e.dispose();
        }

        public boolean isDisposed() {
            return this.f100116e.isDisposed();
        }

        public void onComplete() {
            if (!this.f100118g) {
                this.f100118g = true;
                Object obj = this.f100117f;
                this.f100117f = null;
                if (obj == null) {
                    this.f100115d.onComplete();
                } else {
                    this.f100115d.mo94967a(obj);
                }
            }
        }

        public void onError(Throwable th) {
            if (this.f100118g) {
                C40293a.m116722s(th);
                return;
            }
            this.f100118g = true;
            this.f100115d.onError(th);
        }

        public void onNext(Object obj) {
            if (!this.f100118g) {
                if (this.f100117f != null) {
                    this.f100118g = true;
                    this.f100116e.dispose();
                    this.f100115d.onError(new IllegalArgumentException("Sequence contains more than one element!"));
                    return;
                }
                this.f100117f = obj;
            }
        }

        public void onSubscribe(C41205b bVar) {
            if (C41498c.m120378l(this.f100116e, bVar)) {
                this.f100116e = bVar;
                this.f100115d.onSubscribe(this);
            }
        }
    }

    public C42534w0(C40754t tVar) {
        this.f100114d = tVar;
    }

    /* renamed from: w */
    public void mo94961w(C40746m mVar) {
        this.f100114d.mo95016c(new C42535a(mVar));
    }
}
