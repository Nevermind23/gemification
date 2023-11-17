package sd1;

import ae1.C40293a;
import ed1.C40744k;
import ed1.C40746m;
import ed1.C40749p;
import ed1.C40754t;
import ed1.C40756v;
import hd1.C41205b;
import kd1.C41498c;
import md1.C41734c;

/* renamed from: sd1.p */
public final class C42488p extends C40744k implements C41734c {

    /* renamed from: d */
    final C40754t f99979d;

    /* renamed from: e */
    final long f99980e;

    /* renamed from: sd1.p$a */
    static final class C42489a implements C40756v, C41205b {

        /* renamed from: d */
        final C40746m f99981d;

        /* renamed from: e */
        final long f99982e;

        /* renamed from: f */
        C41205b f99983f;

        /* renamed from: g */
        long f99984g;

        /* renamed from: h */
        boolean f99985h;

        C42489a(C40746m mVar, long j) {
            this.f99981d = mVar;
            this.f99982e = j;
        }

        public void dispose() {
            this.f99983f.dispose();
        }

        public boolean isDisposed() {
            return this.f99983f.isDisposed();
        }

        public void onComplete() {
            if (!this.f99985h) {
                this.f99985h = true;
                this.f99981d.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (this.f99985h) {
                C40293a.m116722s(th);
                return;
            }
            this.f99985h = true;
            this.f99981d.onError(th);
        }

        public void onNext(Object obj) {
            if (!this.f99985h) {
                long j = this.f99984g;
                if (j == this.f99982e) {
                    this.f99985h = true;
                    this.f99983f.dispose();
                    this.f99981d.mo94967a(obj);
                    return;
                }
                this.f99984g = j + 1;
            }
        }

        public void onSubscribe(C41205b bVar) {
            if (C41498c.m120378l(this.f99983f, bVar)) {
                this.f99983f = bVar;
                this.f99981d.onSubscribe(this);
            }
        }
    }

    public C42488p(C40754t tVar, long j) {
        this.f99979d = tVar;
        this.f99980e = j;
    }

    /* renamed from: b */
    public C40749p mo96527b() {
        return C40293a.m116717n(new C42482o(this.f99979d, this.f99980e, (Object) null, false));
    }

    /* renamed from: w */
    public void mo94961w(C40746m mVar) {
        this.f99979d.mo95016c(new C42489a(mVar, this.f99980e));
    }
}
