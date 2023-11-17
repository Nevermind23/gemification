package sd1;

import ae1.C40293a;
import ed1.C40754t;
import ed1.C40756v;
import hd1.C41205b;
import java.util.NoSuchElementException;
import kd1.C41498c;

/* renamed from: sd1.o */
public final class C42482o extends C42399a {

    /* renamed from: e */
    final long f99958e;

    /* renamed from: f */
    final Object f99959f;

    /* renamed from: g */
    final boolean f99960g;

    /* renamed from: sd1.o$a */
    static final class C42483a implements C40756v, C41205b {

        /* renamed from: d */
        final C40756v f99961d;

        /* renamed from: e */
        final long f99962e;

        /* renamed from: f */
        final Object f99963f;

        /* renamed from: g */
        final boolean f99964g;

        /* renamed from: h */
        C41205b f99965h;

        /* renamed from: i */
        long f99966i;

        /* renamed from: j */
        boolean f99967j;

        C42483a(C40756v vVar, long j, Object obj, boolean z) {
            this.f99961d = vVar;
            this.f99962e = j;
            this.f99963f = obj;
            this.f99964g = z;
        }

        public void dispose() {
            this.f99965h.dispose();
        }

        public boolean isDisposed() {
            return this.f99965h.isDisposed();
        }

        public void onComplete() {
            if (!this.f99967j) {
                this.f99967j = true;
                Object obj = this.f99963f;
                if (obj != null || !this.f99964g) {
                    if (obj != null) {
                        this.f99961d.onNext(obj);
                    }
                    this.f99961d.onComplete();
                    return;
                }
                this.f99961d.onError(new NoSuchElementException());
            }
        }

        public void onError(Throwable th) {
            if (this.f99967j) {
                C40293a.m116722s(th);
                return;
            }
            this.f99967j = true;
            this.f99961d.onError(th);
        }

        public void onNext(Object obj) {
            if (!this.f99967j) {
                long j = this.f99966i;
                if (j == this.f99962e) {
                    this.f99967j = true;
                    this.f99965h.dispose();
                    this.f99961d.onNext(obj);
                    this.f99961d.onComplete();
                    return;
                }
                this.f99966i = j + 1;
            }
        }

        public void onSubscribe(C41205b bVar) {
            if (C41498c.m120378l(this.f99965h, bVar)) {
                this.f99965h = bVar;
                this.f99961d.onSubscribe(this);
            }
        }
    }

    public C42482o(C40754t tVar, long j, Object obj, boolean z) {
        super(tVar);
        this.f99958e = j;
        this.f99959f = obj;
        this.f99960g = z;
    }

    /* renamed from: I0 */
    public void mo94344I0(C40756v vVar) {
        this.f99678d.mo95016c(new C42483a(vVar, this.f99958e, this.f99959f, this.f99960g));
    }
}
