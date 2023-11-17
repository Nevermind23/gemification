package qd1;

import androidx.lifecycle.C1612n;
import ed1.C40744k;
import ed1.C40746m;
import ed1.C40748o;
import hd1.C41205b;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: qd1.b */
public final class C42297b extends C40744k implements C40746m {

    /* renamed from: h */
    static final C42298a[] f99468h = new C42298a[0];

    /* renamed from: i */
    static final C42298a[] f99469i = new C42298a[0];

    /* renamed from: d */
    final AtomicReference f99470d;

    /* renamed from: e */
    final AtomicReference f99471e = new AtomicReference(f99468h);

    /* renamed from: f */
    Object f99472f;

    /* renamed from: g */
    Throwable f99473g;

    /* renamed from: qd1.b$a */
    static final class C42298a extends AtomicReference implements C41205b {
        private static final long serialVersionUID = -5791853038359966195L;

        /* renamed from: d */
        final C40746m f99474d;

        C42298a(C40746m mVar, C42297b bVar) {
            super(bVar);
            this.f99474d = mVar;
        }

        public void dispose() {
            C42297b bVar = (C42297b) getAndSet((Object) null);
            if (bVar != null) {
                bVar.mo97773E(this);
            }
        }

        public boolean isDisposed() {
            return get() == null;
        }
    }

    public C42297b(C40748o oVar) {
        this.f99470d = new AtomicReference(oVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public boolean mo97772D(C42298a aVar) {
        C42298a[] aVarArr;
        C42298a[] aVarArr2;
        do {
            aVarArr = (C42298a[]) this.f99471e.get();
            if (aVarArr == f99469i) {
                return false;
            }
            int length = aVarArr.length;
            aVarArr2 = new C42298a[(length + 1)];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
        } while (!C1612n.m5659a(this.f99471e, aVarArr, aVarArr2));
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public void mo97773E(C42298a aVar) {
        C42298a[] aVarArr;
        C42298a[] aVarArr2;
        do {
            aVarArr = (C42298a[]) this.f99471e.get();
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
                        aVarArr2 = f99468h;
                    } else {
                        C42298a[] aVarArr3 = new C42298a[(length - 1)];
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
        } while (!C1612n.m5659a(this.f99471e, aVarArr, aVarArr2));
    }

    /* renamed from: a */
    public void mo94967a(Object obj) {
        this.f99472f = obj;
        for (C42298a aVar : (C42298a[]) this.f99471e.getAndSet(f99469i)) {
            if (!aVar.isDisposed()) {
                aVar.f99474d.mo94967a(obj);
            }
        }
    }

    public void onComplete() {
        for (C42298a aVar : (C42298a[]) this.f99471e.getAndSet(f99469i)) {
            if (!aVar.isDisposed()) {
                aVar.f99474d.onComplete();
            }
        }
    }

    public void onError(Throwable th) {
        this.f99473g = th;
        for (C42298a aVar : (C42298a[]) this.f99471e.getAndSet(f99469i)) {
            if (!aVar.isDisposed()) {
                aVar.f99474d.onError(th);
            }
        }
    }

    public void onSubscribe(C41205b bVar) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public void mo94961w(C40746m mVar) {
        C42298a aVar = new C42298a(mVar, this);
        mVar.onSubscribe(aVar);
        if (mo97772D(aVar)) {
            if (aVar.isDisposed()) {
                mo97773E(aVar);
                return;
            }
            C40748o oVar = (C40748o) this.f99470d.getAndSet((Object) null);
            if (oVar != null) {
                oVar.mo94947c(this);
            }
        } else if (!aVar.isDisposed()) {
            Throwable th = this.f99473g;
            if (th != null) {
                mVar.onError(th);
                return;
            }
            Object obj = this.f99472f;
            if (obj != null) {
                mVar.mo94967a(obj);
            } else {
                mVar.onComplete();
            }
        }
    }
}
