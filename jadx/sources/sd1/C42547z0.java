package sd1;

import ed1.C40754t;
import ed1.C40756v;
import hd1.C41205b;
import kd1.C41502g;

/* renamed from: sd1.z0 */
public final class C42547z0 extends C42399a {

    /* renamed from: e */
    final C40754t f100150e;

    /* renamed from: sd1.z0$a */
    static final class C42548a implements C40756v {

        /* renamed from: d */
        final C40756v f100151d;

        /* renamed from: e */
        final C40754t f100152e;

        /* renamed from: f */
        final C41502g f100153f = new C41502g();

        /* renamed from: g */
        boolean f100154g = true;

        C42548a(C40756v vVar, C40754t tVar) {
            this.f100151d = vVar;
            this.f100152e = tVar;
        }

        public void onComplete() {
            if (this.f100154g) {
                this.f100154g = false;
                this.f100152e.mo95016c(this);
                return;
            }
            this.f100151d.onComplete();
        }

        public void onError(Throwable th) {
            this.f100151d.onError(th);
        }

        public void onNext(Object obj) {
            if (this.f100154g) {
                this.f100154g = false;
            }
            this.f100151d.onNext(obj);
        }

        public void onSubscribe(C41205b bVar) {
            this.f100153f.mo96266b(bVar);
        }
    }

    public C42547z0(C40754t tVar, C40754t tVar2) {
        super(tVar);
        this.f100150e = tVar2;
    }

    /* renamed from: I0 */
    public void mo94344I0(C40756v vVar) {
        C42548a aVar = new C42548a(vVar, this.f100150e);
        vVar.onSubscribe(aVar.f100153f);
        this.f99678d.mo95016c(aVar);
    }
}
