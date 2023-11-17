package td1;

import ae1.C40293a;
import ed1.C40735b0;
import ed1.C40762x;
import ed1.C40764z;
import hd1.C41205b;
import id1.C41300a;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import jd1.C41405l;
import kd1.C41498c;
import ld1.C41692b;
import td1.C42975s;

/* renamed from: td1.z */
public final class C42990z extends C40762x {

    /* renamed from: d */
    final C40735b0[] f100335d;

    /* renamed from: e */
    final C41405l f100336e;

    /* renamed from: td1.z$a */
    final class C42991a implements C41405l {
        C42991a() {
        }

        public Object apply(Object obj) {
            return C41692b.m120934e(C42990z.this.f100336e.apply(new Object[]{obj}), "The zipper returned a null value");
        }
    }

    /* renamed from: td1.z$b */
    static final class C42992b extends AtomicInteger implements C41205b {
        private static final long serialVersionUID = -5556924161382950569L;

        /* renamed from: d */
        final C40764z f100338d;

        /* renamed from: e */
        final C41405l f100339e;

        /* renamed from: f */
        final C42993c[] f100340f;

        /* renamed from: g */
        final Object[] f100341g;

        C42992b(C40764z zVar, int i, C41405l lVar) {
            super(i);
            this.f100338d = zVar;
            this.f100339e = lVar;
            C42993c[] cVarArr = new C42993c[i];
            for (int i2 = 0; i2 < i; i2++) {
                cVarArr[i2] = new C42993c(this, i2);
            }
            this.f100340f = cVarArr;
            this.f100341g = new Object[i];
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo101501a(int i) {
            C42993c[] cVarArr = this.f100340f;
            int length = cVarArr.length;
            for (int i2 = 0; i2 < i; i2++) {
                cVarArr[i2].mo101504b();
            }
            while (true) {
                i++;
                if (i < length) {
                    cVarArr[i].mo101504b();
                } else {
                    return;
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo101502b(Throwable th, int i) {
            if (getAndSet(0) > 0) {
                mo101501a(i);
                this.f100338d.onError(th);
                return;
            }
            C40293a.m116722s(th);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo101503c(Object obj, int i) {
            this.f100341g[i] = obj;
            if (decrementAndGet() == 0) {
                try {
                    this.f100338d.mo95096a(C41692b.m120934e(this.f100339e.apply(this.f100341g), "The zipper returned a null value"));
                } catch (Throwable th) {
                    C41300a.m119661b(th);
                    this.f100338d.onError(th);
                }
            }
        }

        public void dispose() {
            if (getAndSet(0) > 0) {
                for (C42993c b : this.f100340f) {
                    b.mo101504b();
                }
            }
        }

        public boolean isDisposed() {
            return get() <= 0;
        }
    }

    /* renamed from: td1.z$c */
    static final class C42993c extends AtomicReference implements C40764z {
        private static final long serialVersionUID = 3323743579927613702L;

        /* renamed from: d */
        final C42992b f100342d;

        /* renamed from: e */
        final int f100343e;

        C42993c(C42992b bVar, int i) {
            this.f100342d = bVar;
            this.f100343e = i;
        }

        /* renamed from: a */
        public void mo95096a(Object obj) {
            this.f100342d.mo101503c(obj, this.f100343e);
        }

        /* renamed from: b */
        public void mo101504b() {
            C41498c.m120371a(this);
        }

        public void onError(Throwable th) {
            this.f100342d.mo101502b(th, this.f100343e);
        }

        public void onSubscribe(C41205b bVar) {
            C41498c.m120376g(this, bVar);
        }
    }

    public C42990z(C40735b0[] b0VarArr, C41405l lVar) {
        this.f100335d = b0VarArr;
        this.f100336e = lVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public void mo95071J(C40764z zVar) {
        C40735b0[] b0VarArr = this.f100335d;
        int length = b0VarArr.length;
        int i = 0;
        if (length == 1) {
            b0VarArr[0].mo94907c(new C42975s.C42976a(zVar, new C42991a()));
            return;
        }
        C42992b bVar = new C42992b(zVar, length, this.f100336e);
        zVar.onSubscribe(bVar);
        while (i < length && !bVar.isDisposed()) {
            C40735b0 b0Var = b0VarArr[i];
            if (b0Var == null) {
                bVar.mo101502b(new NullPointerException("One of the sources is null"), i);
                return;
            } else {
                b0Var.mo94907c(bVar.f100340f[i]);
                i++;
            }
        }
    }
}
