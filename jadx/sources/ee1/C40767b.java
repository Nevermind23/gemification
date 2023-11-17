package ee1;

import ae1.C40293a;
import androidx.lifecycle.C1612n;
import ed1.C40756v;
import hd1.C41205b;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import ld1.C41692b;

/* renamed from: ee1.b */
public final class C40767b extends C40776f {

    /* renamed from: f */
    static final C40768a[] f96480f = new C40768a[0];

    /* renamed from: g */
    static final C40768a[] f96481g = new C40768a[0];

    /* renamed from: d */
    final AtomicReference f96482d = new AtomicReference(f96481g);

    /* renamed from: e */
    Throwable f96483e;

    /* renamed from: ee1.b$a */
    static final class C40768a extends AtomicBoolean implements C41205b {
        private static final long serialVersionUID = 3562861878281475070L;

        /* renamed from: d */
        final C40756v f96484d;

        /* renamed from: e */
        final C40767b f96485e;

        C40768a(C40756v vVar, C40767b bVar) {
            this.f96484d = vVar;
            this.f96485e = bVar;
        }

        /* renamed from: a */
        public void mo95110a() {
            if (!get()) {
                this.f96484d.onComplete();
            }
        }

        /* renamed from: b */
        public void mo95111b(Throwable th) {
            if (get()) {
                C40293a.m116722s(th);
            } else {
                this.f96484d.onError(th);
            }
        }

        /* renamed from: c */
        public void mo95112c(Object obj) {
            if (!get()) {
                this.f96484d.onNext(obj);
            }
        }

        public void dispose() {
            if (compareAndSet(false, true)) {
                this.f96485e.mo95109i1(this);
            }
        }

        public boolean isDisposed() {
            return get();
        }
    }

    C40767b() {
    }

    /* renamed from: h1 */
    public static C40767b m118210h1() {
        return new C40767b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: I0 */
    public void mo94344I0(C40756v vVar) {
        C40768a aVar = new C40768a(vVar, this);
        vVar.onSubscribe(aVar);
        if (!mo95108g1(aVar)) {
            Throwable th = this.f96483e;
            if (th != null) {
                vVar.onError(th);
            } else {
                vVar.onComplete();
            }
        } else if (aVar.isDisposed()) {
            mo95109i1(aVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g1 */
    public boolean mo95108g1(C40768a aVar) {
        C40768a[] aVarArr;
        C40768a[] aVarArr2;
        do {
            aVarArr = (C40768a[]) this.f96482d.get();
            if (aVarArr == f96480f) {
                return false;
            }
            int length = aVarArr.length;
            aVarArr2 = new C40768a[(length + 1)];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
        } while (!C1612n.m5659a(this.f96482d, aVarArr, aVarArr2));
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i1 */
    public void mo95109i1(C40768a aVar) {
        C40768a[] aVarArr;
        C40768a[] aVarArr2;
        do {
            aVarArr = (C40768a[]) this.f96482d.get();
            if (aVarArr != f96480f && aVarArr != f96481g) {
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
                        aVarArr2 = f96481g;
                    } else {
                        C40768a[] aVarArr3 = new C40768a[(length - 1)];
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
        } while (!C1612n.m5659a(this.f96482d, aVarArr, aVarArr2));
    }

    public void onComplete() {
        Object obj = this.f96482d.get();
        Object obj2 = f96480f;
        if (obj != obj2) {
            for (C40768a a : (C40768a[]) this.f96482d.getAndSet(obj2)) {
                a.mo95110a();
            }
        }
    }

    public void onError(Throwable th) {
        C41692b.m120934e(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        Object obj = this.f96482d.get();
        Object obj2 = f96480f;
        if (obj == obj2) {
            C40293a.m116722s(th);
            return;
        }
        this.f96483e = th;
        for (C40768a b : (C40768a[]) this.f96482d.getAndSet(obj2)) {
            b.mo95111b(th);
        }
    }

    public void onNext(Object obj) {
        C41692b.m120934e(obj, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        for (C40768a c : (C40768a[]) this.f96482d.get()) {
            c.mo95112c(obj);
        }
    }

    public void onSubscribe(C41205b bVar) {
        if (this.f96482d.get() == f96480f) {
            bVar.dispose();
        }
    }
}
