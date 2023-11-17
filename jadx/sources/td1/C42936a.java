package td1;

import androidx.lifecycle.C1612n;
import ed1.C40735b0;
import ed1.C40762x;
import ed1.C40764z;
import hd1.C41205b;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: td1.a */
public final class C42936a extends C40762x implements C40764z {

    /* renamed from: i */
    static final C42937a[] f100213i = new C42937a[0];

    /* renamed from: j */
    static final C42937a[] f100214j = new C42937a[0];

    /* renamed from: d */
    final C40735b0 f100215d;

    /* renamed from: e */
    final AtomicInteger f100216e = new AtomicInteger();

    /* renamed from: f */
    final AtomicReference f100217f = new AtomicReference(f100213i);

    /* renamed from: g */
    Object f100218g;

    /* renamed from: h */
    Throwable f100219h;

    /* renamed from: td1.a$a */
    static final class C42937a extends AtomicBoolean implements C41205b {
        private static final long serialVersionUID = 7514387411091976596L;

        /* renamed from: d */
        final C40764z f100220d;

        /* renamed from: e */
        final C42936a f100221e;

        C42937a(C40764z zVar, C42936a aVar) {
            this.f100220d = zVar;
            this.f100221e = aVar;
        }

        public void dispose() {
            if (compareAndSet(false, true)) {
                this.f100221e.mo101493X(this);
            }
        }

        public boolean isDisposed() {
            return get();
        }
    }

    public C42936a(C40735b0 b0Var) {
        this.f100215d = b0Var;
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public void mo95071J(C40764z zVar) {
        C42937a aVar = new C42937a(zVar, this);
        zVar.onSubscribe(aVar);
        if (mo101492W(aVar)) {
            if (aVar.isDisposed()) {
                mo101493X(aVar);
            }
            if (this.f100216e.getAndIncrement() == 0) {
                this.f100215d.mo94907c(this);
                return;
            }
            return;
        }
        Throwable th = this.f100219h;
        if (th != null) {
            zVar.onError(th);
        } else {
            zVar.mo95096a(this.f100218g);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: W */
    public boolean mo101492W(C42937a aVar) {
        C42937a[] aVarArr;
        C42937a[] aVarArr2;
        do {
            aVarArr = (C42937a[]) this.f100217f.get();
            if (aVarArr == f100214j) {
                return false;
            }
            int length = aVarArr.length;
            aVarArr2 = new C42937a[(length + 1)];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
        } while (!C1612n.m5659a(this.f100217f, aVarArr, aVarArr2));
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: X */
    public void mo101493X(C42937a aVar) {
        C42937a[] aVarArr;
        C42937a[] aVarArr2;
        do {
            aVarArr = (C42937a[]) this.f100217f.get();
            int length = aVarArr.length;
            if (length != 0) {
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
                        aVarArr2 = f100213i;
                    } else {
                        C42937a[] aVarArr3 = new C42937a[(length - 1)];
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
        } while (!C1612n.m5659a(this.f100217f, aVarArr, aVarArr2));
    }

    /* renamed from: a */
    public void mo95096a(Object obj) {
        this.f100218g = obj;
        for (C42937a aVar : (C42937a[]) this.f100217f.getAndSet(f100214j)) {
            if (!aVar.isDisposed()) {
                aVar.f100220d.mo95096a(obj);
            }
        }
    }

    public void onError(Throwable th) {
        this.f100219h = th;
        for (C42937a aVar : (C42937a[]) this.f100217f.getAndSet(f100214j)) {
            if (!aVar.isDisposed()) {
                aVar.f100220d.onError(th);
            }
        }
    }

    public void onSubscribe(C41205b bVar) {
    }
}
