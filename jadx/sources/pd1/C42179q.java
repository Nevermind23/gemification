package pd1;

import ae1.C40293a;
import ed1.C40741h;
import ed1.C40742i;
import id1.C41300a;
import java.util.concurrent.atomic.AtomicLong;
import jd1.C41399f;
import uh1.C43107b;
import uh1.C43108c;
import xd1.C43259d;
import yd1.C43358c;

/* renamed from: pd1.q */
public final class C42179q extends C42144a implements C41399f {

    /* renamed from: f */
    final C41399f f99227f = this;

    /* renamed from: pd1.q$a */
    static final class C42180a extends AtomicLong implements C40742i, C43108c {
        private static final long serialVersionUID = -6246093802440953054L;

        /* renamed from: d */
        final C43107b f99228d;

        /* renamed from: e */
        final C41399f f99229e;

        /* renamed from: f */
        C43108c f99230f;

        /* renamed from: g */
        boolean f99231g;

        C42180a(C43107b bVar, C41399f fVar) {
            this.f99228d = bVar;
            this.f99229e = fVar;
        }

        /* renamed from: b */
        public void mo27070b(C43108c cVar) {
            if (C43259d.m124224h(this.f99230f, cVar)) {
                this.f99230f = cVar;
                this.f99228d.mo27070b(this);
                cVar.mo94357l(Long.MAX_VALUE);
            }
        }

        public void cancel() {
            this.f99230f.cancel();
        }

        /* renamed from: l */
        public void mo94357l(long j) {
            if (C43259d.m124223g(j)) {
                C43358c.m124395a(this, j);
            }
        }

        public void onComplete() {
            if (!this.f99231g) {
                this.f99231g = true;
                this.f99228d.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (this.f99231g) {
                C40293a.m116722s(th);
                return;
            }
            this.f99231g = true;
            this.f99228d.onError(th);
        }

        public void onNext(Object obj) {
            if (!this.f99231g) {
                if (get() != 0) {
                    this.f99228d.onNext(obj);
                    C43358c.m124398d(this, 1);
                    return;
                }
                try {
                    this.f99229e.accept(obj);
                } catch (Throwable th) {
                    C41300a.m119661b(th);
                    cancel();
                    onError(th);
                }
            }
        }
    }

    public C42179q(C40741h hVar) {
        super(hVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public void mo94348F(C43107b bVar) {
        this.f99110e.mo94922E(new C42180a(bVar, this.f99227f));
    }

    public void accept(Object obj) {
    }
}
