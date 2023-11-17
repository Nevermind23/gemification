package be1;

import ae1.C40293a;
import androidx.lifecycle.C1612n;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import ld1.C41692b;
import p469io.reactivex.exceptions.MissingBackpressureException;
import uh1.C43107b;
import uh1.C43108c;
import xd1.C43259d;
import yd1.C43358c;

/* renamed from: be1.c */
public final class C40330c extends C40329b {

    /* renamed from: g */
    static final C40331a[] f95812g = new C40331a[0];

    /* renamed from: h */
    static final C40331a[] f95813h = new C40331a[0];

    /* renamed from: e */
    final AtomicReference f95814e = new AtomicReference(f95813h);

    /* renamed from: f */
    Throwable f95815f;

    /* renamed from: be1.c$a */
    static final class C40331a extends AtomicLong implements C43108c {
        private static final long serialVersionUID = 3562861878281475070L;

        /* renamed from: d */
        final C43107b f95816d;

        /* renamed from: e */
        final C40330c f95817e;

        C40331a(C43107b bVar, C40330c cVar) {
            this.f95816d = bVar;
            this.f95817e = cVar;
        }

        /* renamed from: a */
        public boolean mo94362a() {
            return get() == Long.MIN_VALUE;
        }

        /* renamed from: b */
        public void mo94363b() {
            if (get() != Long.MIN_VALUE) {
                this.f95816d.onComplete();
            }
        }

        /* renamed from: c */
        public void mo94364c(Throwable th) {
            if (get() != Long.MIN_VALUE) {
                this.f95816d.onError(th);
            } else {
                C40293a.m116722s(th);
            }
        }

        public void cancel() {
            if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                this.f95817e.mo94361O(this);
            }
        }

        /* renamed from: d */
        public void mo94365d(Object obj) {
            long j = get();
            if (j != Long.MIN_VALUE) {
                if (j != 0) {
                    this.f95816d.onNext(obj);
                    C43358c.m124399e(this, 1);
                    return;
                }
                cancel();
                this.f95816d.onError(new MissingBackpressureException("Could not emit value due to lack of requests"));
            }
        }

        /* renamed from: l */
        public void mo94357l(long j) {
            if (C43259d.m124223g(j)) {
                C43358c.m124396b(this, j);
            }
        }
    }

    C40330c() {
    }

    /* renamed from: M */
    public static C40330c m116776M() {
        return new C40330c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public void mo94348F(C43107b bVar) {
        C40331a aVar = new C40331a(bVar, this);
        bVar.mo27070b(aVar);
        if (!mo94359L(aVar)) {
            Throwable th = this.f95815f;
            if (th != null) {
                bVar.onError(th);
            } else {
                bVar.onComplete();
            }
        } else if (aVar.mo94362a()) {
            mo94361O(aVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public boolean mo94359L(C40331a aVar) {
        C40331a[] aVarArr;
        C40331a[] aVarArr2;
        do {
            aVarArr = (C40331a[]) this.f95814e.get();
            if (aVarArr == f95812g) {
                return false;
            }
            int length = aVarArr.length;
            aVarArr2 = new C40331a[(length + 1)];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
        } while (!C1612n.m5659a(this.f95814e, aVarArr, aVarArr2));
        return true;
    }

    /* renamed from: N */
    public boolean mo94360N() {
        return ((C40331a[]) this.f95814e.get()).length != 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O */
    public void mo94361O(C40331a aVar) {
        C40331a[] aVarArr;
        C40331a[] aVarArr2;
        do {
            aVarArr = (C40331a[]) this.f95814e.get();
            if (aVarArr != f95812g && aVarArr != f95813h) {
                int length = aVarArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        i = -1;
                        break;
                    } else if (aVarArr[i] == aVar) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i >= 0) {
                    if (length == 1) {
                        aVarArr2 = f95813h;
                    } else {
                        C40331a[] aVarArr3 = new C40331a[(length - 1)];
                        System.arraycopy(aVarArr, 0, aVarArr3, 0, i);
                        System.arraycopy(aVarArr, i + 1, aVarArr3, i, (length - i) - 1);
                        aVarArr2 = aVarArr3;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        } while (!C1612n.m5659a(this.f95814e, aVarArr, aVarArr2));
    }

    /* renamed from: b */
    public void mo27070b(C43108c cVar) {
        if (this.f95814e.get() == f95812g) {
            cVar.cancel();
        } else {
            cVar.mo94357l(Long.MAX_VALUE);
        }
    }

    public void onComplete() {
        Object obj = this.f95814e.get();
        Object obj2 = f95812g;
        if (obj != obj2) {
            for (C40331a b : (C40331a[]) this.f95814e.getAndSet(obj2)) {
                b.mo94363b();
            }
        }
    }

    public void onError(Throwable th) {
        C41692b.m120934e(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        Object obj = this.f95814e.get();
        Object obj2 = f95812g;
        if (obj == obj2) {
            C40293a.m116722s(th);
            return;
        }
        this.f95815f = th;
        for (C40331a c : (C40331a[]) this.f95814e.getAndSet(obj2)) {
            c.mo94364c(th);
        }
    }

    public void onNext(Object obj) {
        C41692b.m120934e(obj, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        for (C40331a d : (C40331a[]) this.f95814e.get()) {
            d.mo94365d(obj);
        }
    }
}
