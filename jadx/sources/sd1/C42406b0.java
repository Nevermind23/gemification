package sd1;

import ed1.C40742i;
import ed1.C40749p;
import ed1.C40756v;
import hd1.C41205b;
import uh1.C43106a;
import uh1.C43108c;
import xd1.C43259d;

/* renamed from: sd1.b0 */
public final class C42406b0 extends C40749p {

    /* renamed from: d */
    final C43106a f99709d;

    /* renamed from: sd1.b0$a */
    static final class C42407a implements C40742i, C41205b {

        /* renamed from: d */
        final C40756v f99710d;

        /* renamed from: e */
        C43108c f99711e;

        C42407a(C40756v vVar) {
            this.f99710d = vVar;
        }

        /* renamed from: b */
        public void mo27070b(C43108c cVar) {
            if (C43259d.m124224h(this.f99711e, cVar)) {
                this.f99711e = cVar;
                this.f99710d.onSubscribe(this);
                cVar.mo94357l(Long.MAX_VALUE);
            }
        }

        public void dispose() {
            this.f99711e.cancel();
            this.f99711e = C43259d.CANCELLED;
        }

        public boolean isDisposed() {
            return this.f99711e == C43259d.CANCELLED;
        }

        public void onComplete() {
            this.f99710d.onComplete();
        }

        public void onError(Throwable th) {
            this.f99710d.onError(th);
        }

        public void onNext(Object obj) {
            this.f99710d.onNext(obj);
        }
    }

    public C42406b0(C43106a aVar) {
        this.f99709d = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: I0 */
    public void mo94344I0(C40756v vVar) {
        this.f99709d.mo26347a(new C42407a(vVar));
    }
}
