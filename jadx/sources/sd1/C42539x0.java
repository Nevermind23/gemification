package sd1;

import ae1.C40293a;
import ed1.C40754t;
import ed1.C40756v;
import ed1.C40762x;
import ed1.C40764z;
import hd1.C41205b;
import java.util.NoSuchElementException;
import kd1.C41498c;

/* renamed from: sd1.x0 */
public final class C42539x0 extends C40762x {

    /* renamed from: d */
    final C40754t f100131d;

    /* renamed from: e */
    final Object f100132e;

    /* renamed from: sd1.x0$a */
    static final class C42540a implements C40756v, C41205b {

        /* renamed from: d */
        final C40764z f100133d;

        /* renamed from: e */
        final Object f100134e;

        /* renamed from: f */
        C41205b f100135f;

        /* renamed from: g */
        Object f100136g;

        /* renamed from: h */
        boolean f100137h;

        C42540a(C40764z zVar, Object obj) {
            this.f100133d = zVar;
            this.f100134e = obj;
        }

        public void dispose() {
            this.f100135f.dispose();
        }

        public boolean isDisposed() {
            return this.f100135f.isDisposed();
        }

        public void onComplete() {
            if (!this.f100137h) {
                this.f100137h = true;
                Object obj = this.f100136g;
                this.f100136g = null;
                if (obj == null) {
                    obj = this.f100134e;
                }
                if (obj != null) {
                    this.f100133d.mo95096a(obj);
                } else {
                    this.f100133d.onError(new NoSuchElementException());
                }
            }
        }

        public void onError(Throwable th) {
            if (this.f100137h) {
                C40293a.m116722s(th);
                return;
            }
            this.f100137h = true;
            this.f100133d.onError(th);
        }

        public void onNext(Object obj) {
            if (!this.f100137h) {
                if (this.f100136g != null) {
                    this.f100137h = true;
                    this.f100135f.dispose();
                    this.f100133d.onError(new IllegalArgumentException("Sequence contains more than one element!"));
                    return;
                }
                this.f100136g = obj;
            }
        }

        public void onSubscribe(C41205b bVar) {
            if (C41498c.m120378l(this.f100135f, bVar)) {
                this.f100135f = bVar;
                this.f100133d.onSubscribe(this);
            }
        }
    }

    public C42539x0(C40754t tVar, Object obj) {
        this.f100131d = tVar;
        this.f100132e = obj;
    }

    /* renamed from: J */
    public void mo95071J(C40764z zVar) {
        this.f100131d.mo95016c(new C42540a(zVar, this.f100132e));
    }
}
