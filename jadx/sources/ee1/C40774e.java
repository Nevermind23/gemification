package ee1;

import ae1.C40293a;
import androidx.lifecycle.C1612n;
import ed1.C40762x;
import ed1.C40764z;
import hd1.C41205b;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import ld1.C41692b;

/* renamed from: ee1.e */
public final class C40774e extends C40762x implements C40764z {

    /* renamed from: h */
    static final C40775a[] f96503h = new C40775a[0];

    /* renamed from: i */
    static final C40775a[] f96504i = new C40775a[0];

    /* renamed from: d */
    final AtomicReference f96505d = new AtomicReference(f96503h);

    /* renamed from: e */
    final AtomicBoolean f96506e = new AtomicBoolean();

    /* renamed from: f */
    Object f96507f;

    /* renamed from: g */
    Throwable f96508g;

    /* renamed from: ee1.e$a */
    static final class C40775a extends AtomicReference implements C41205b {
        private static final long serialVersionUID = -7650903191002190468L;

        /* renamed from: d */
        final C40764z f96509d;

        C40775a(C40764z zVar, C40774e eVar) {
            this.f96509d = zVar;
            lazySet(eVar);
        }

        public void dispose() {
            C40774e eVar = (C40774e) getAndSet((Object) null);
            if (eVar != null) {
                eVar.mo95123Y(this);
            }
        }

        public boolean isDisposed() {
            return get() == null;
        }
    }

    C40774e() {
    }

    /* renamed from: X */
    public static C40774e m118229X() {
        return new C40774e();
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public void mo95071J(C40764z zVar) {
        C40775a aVar = new C40775a(zVar, this);
        zVar.onSubscribe(aVar);
        if (!mo95122W(aVar)) {
            Throwable th = this.f96508g;
            if (th != null) {
                zVar.onError(th);
            } else {
                zVar.mo95096a(this.f96507f);
            }
        } else if (aVar.isDisposed()) {
            mo95123Y(aVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: W */
    public boolean mo95122W(C40775a aVar) {
        C40775a[] aVarArr;
        C40775a[] aVarArr2;
        do {
            aVarArr = (C40775a[]) this.f96505d.get();
            if (aVarArr == f96504i) {
                return false;
            }
            int length = aVarArr.length;
            aVarArr2 = new C40775a[(length + 1)];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
        } while (!C1612n.m5659a(this.f96505d, aVarArr, aVarArr2));
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Y */
    public void mo95123Y(C40775a aVar) {
        C40775a[] aVarArr;
        C40775a[] aVarArr2;
        do {
            aVarArr = (C40775a[]) this.f96505d.get();
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
                        aVarArr2 = f96503h;
                    } else {
                        C40775a[] aVarArr3 = new C40775a[(length - 1)];
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
        } while (!C1612n.m5659a(this.f96505d, aVarArr, aVarArr2));
    }

    /* renamed from: a */
    public void mo95096a(Object obj) {
        C41692b.m120934e(obj, "onSuccess called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f96506e.compareAndSet(false, true)) {
            this.f96507f = obj;
            for (C40775a aVar : (C40775a[]) this.f96505d.getAndSet(f96504i)) {
                aVar.f96509d.mo95096a(obj);
            }
        }
    }

    public void onError(Throwable th) {
        C41692b.m120934e(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f96506e.compareAndSet(false, true)) {
            this.f96508g = th;
            for (C40775a aVar : (C40775a[]) this.f96505d.getAndSet(f96504i)) {
                aVar.f96509d.onError(th);
            }
            return;
        }
        C40293a.m116722s(th);
    }

    public void onSubscribe(C41205b bVar) {
        if (this.f96505d.get() == f96504i) {
            bVar.dispose();
        }
    }
}
