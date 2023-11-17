package pd1;

import ae1.C40293a;
import ed1.C40741h;
import ed1.C40742i;
import id1.C41300a;
import jd1.C41394a;
import jd1.C41399f;
import jd1.C41406m;
import uh1.C43107b;
import uh1.C43108c;
import xd1.C43258c;
import xd1.C43259d;

/* renamed from: pd1.f */
public final class C42155f extends C42144a {

    /* renamed from: f */
    private final C41399f f99149f;

    /* renamed from: g */
    private final C41406m f99150g;

    /* renamed from: h */
    private final C41394a f99151h;

    /* renamed from: pd1.f$a */
    static final class C42156a implements C40742i, C43108c {

        /* renamed from: d */
        final C43107b f99152d;

        /* renamed from: e */
        final C41399f f99153e;

        /* renamed from: f */
        final C41406m f99154f;

        /* renamed from: g */
        final C41394a f99155g;

        /* renamed from: h */
        C43108c f99156h;

        C42156a(C43107b bVar, C41399f fVar, C41406m mVar, C41394a aVar) {
            this.f99152d = bVar;
            this.f99153e = fVar;
            this.f99155g = aVar;
            this.f99154f = mVar;
        }

        /* renamed from: b */
        public void mo27070b(C43108c cVar) {
            try {
                this.f99153e.accept(cVar);
                if (C43259d.m124224h(this.f99156h, cVar)) {
                    this.f99156h = cVar;
                    this.f99152d.mo27070b(this);
                }
            } catch (Throwable th) {
                C41300a.m119661b(th);
                cVar.cancel();
                this.f99156h = C43259d.CANCELLED;
                C43258c.m124213b(th, this.f99152d);
            }
        }

        public void cancel() {
            C43108c cVar = this.f99156h;
            C43259d dVar = C43259d.CANCELLED;
            if (cVar != dVar) {
                this.f99156h = dVar;
                try {
                    this.f99155g.run();
                } catch (Throwable th) {
                    C41300a.m119661b(th);
                    C40293a.m116722s(th);
                }
                cVar.cancel();
            }
        }

        /* renamed from: l */
        public void mo94357l(long j) {
            try {
                this.f99154f.mo96042a(j);
            } catch (Throwable th) {
                C41300a.m119661b(th);
                C40293a.m116722s(th);
            }
            this.f99156h.mo94357l(j);
        }

        public void onComplete() {
            if (this.f99156h != C43259d.CANCELLED) {
                this.f99152d.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (this.f99156h != C43259d.CANCELLED) {
                this.f99152d.onError(th);
            } else {
                C40293a.m116722s(th);
            }
        }

        public void onNext(Object obj) {
            this.f99152d.onNext(obj);
        }
    }

    public C42155f(C40741h hVar, C41399f fVar, C41406m mVar, C41394a aVar) {
        super(hVar);
        this.f99149f = fVar;
        this.f99150g = mVar;
        this.f99151h = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public void mo94348F(C43107b bVar) {
        this.f99110e.mo94922E(new C42156a(bVar, this.f99149f, this.f99150g, this.f99151h));
    }
}
