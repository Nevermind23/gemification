package pd1;

import ed1.C40741h;
import ed1.C40749p;
import ed1.C40756v;
import hd1.C41205b;
import uh1.C43107b;
import uh1.C43108c;

/* renamed from: pd1.k */
public final class C42166k extends C40741h {

    /* renamed from: e */
    private final C40749p f99185e;

    /* renamed from: pd1.k$a */
    static final class C42167a implements C40756v, C43108c {

        /* renamed from: d */
        final C43107b f99186d;

        /* renamed from: e */
        C41205b f99187e;

        C42167a(C43107b bVar) {
            this.f99186d = bVar;
        }

        public void cancel() {
            this.f99187e.dispose();
        }

        /* renamed from: l */
        public void mo94357l(long j) {
        }

        public void onComplete() {
            this.f99186d.onComplete();
        }

        public void onError(Throwable th) {
            this.f99186d.onError(th);
        }

        public void onNext(Object obj) {
            this.f99186d.onNext(obj);
        }

        public void onSubscribe(C41205b bVar) {
            this.f99187e = bVar;
            this.f99186d.mo27070b(this);
        }
    }

    public C42166k(C40749p pVar) {
        this.f99185e = pVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public void mo94348F(C43107b bVar) {
        this.f99185e.mo95016c(new C42167a(bVar));
    }
}
