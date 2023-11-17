package pd1;

import ae1.C40293a;
import ed1.C40741h;
import ed1.C40742i;
import ed1.C40762x;
import ed1.C40764z;
import hd1.C41205b;
import java.util.NoSuchElementException;
import uh1.C43108c;
import xd1.C43259d;

/* renamed from: pd1.g */
public final class C42157g extends C40762x {

    /* renamed from: d */
    final C40741h f99157d;

    /* renamed from: e */
    final long f99158e;

    /* renamed from: f */
    final Object f99159f;

    /* renamed from: pd1.g$a */
    static final class C42158a implements C40742i, C41205b {

        /* renamed from: d */
        final C40764z f99160d;

        /* renamed from: e */
        final long f99161e;

        /* renamed from: f */
        final Object f99162f;

        /* renamed from: g */
        C43108c f99163g;

        /* renamed from: h */
        long f99164h;

        /* renamed from: i */
        boolean f99165i;

        C42158a(C40764z zVar, long j, Object obj) {
            this.f99160d = zVar;
            this.f99161e = j;
            this.f99162f = obj;
        }

        /* renamed from: b */
        public void mo27070b(C43108c cVar) {
            if (C43259d.m124224h(this.f99163g, cVar)) {
                this.f99163g = cVar;
                this.f99160d.onSubscribe(this);
                cVar.mo94357l(Long.MAX_VALUE);
            }
        }

        public void dispose() {
            this.f99163g.cancel();
            this.f99163g = C43259d.CANCELLED;
        }

        public boolean isDisposed() {
            return this.f99163g == C43259d.CANCELLED;
        }

        public void onComplete() {
            this.f99163g = C43259d.CANCELLED;
            if (!this.f99165i) {
                this.f99165i = true;
                Object obj = this.f99162f;
                if (obj != null) {
                    this.f99160d.mo95096a(obj);
                } else {
                    this.f99160d.onError(new NoSuchElementException());
                }
            }
        }

        public void onError(Throwable th) {
            if (this.f99165i) {
                C40293a.m116722s(th);
                return;
            }
            this.f99165i = true;
            this.f99163g = C43259d.CANCELLED;
            this.f99160d.onError(th);
        }

        public void onNext(Object obj) {
            if (!this.f99165i) {
                long j = this.f99164h;
                if (j == this.f99161e) {
                    this.f99165i = true;
                    this.f99163g.cancel();
                    this.f99163g = C43259d.CANCELLED;
                    this.f99160d.mo95096a(obj);
                    return;
                }
                this.f99164h = j + 1;
            }
        }
    }

    public C42157g(C40741h hVar, long j, Object obj) {
        this.f99157d = hVar;
        this.f99158e = j;
        this.f99159f = obj;
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public void mo95071J(C40764z zVar) {
        this.f99157d.mo94922E(new C42158a(zVar, this.f99158e, this.f99159f));
    }
}
