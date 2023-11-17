package sd1;

import androidx.lifecycle.C1612n;
import ed1.C40749p;
import ed1.C40756v;
import hd1.C41205b;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: sd1.d */
public final class C42414d extends C42399a implements C40756v {

    /* renamed from: n */
    static final C42415a[] f99723n = new C42415a[0];

    /* renamed from: o */
    static final C42415a[] f99724o = new C42415a[0];

    /* renamed from: e */
    final AtomicBoolean f99725e = new AtomicBoolean();

    /* renamed from: f */
    final int f99726f;

    /* renamed from: g */
    final AtomicReference f99727g;

    /* renamed from: h */
    volatile long f99728h;

    /* renamed from: i */
    final C42416b f99729i;

    /* renamed from: j */
    C42416b f99730j;

    /* renamed from: k */
    int f99731k;

    /* renamed from: l */
    Throwable f99732l;

    /* renamed from: m */
    volatile boolean f99733m;

    /* renamed from: sd1.d$a */
    static final class C42415a extends AtomicInteger implements C41205b {
        private static final long serialVersionUID = 6770240836423125754L;

        /* renamed from: d */
        final C40756v f99734d;

        /* renamed from: e */
        final C42414d f99735e;

        /* renamed from: f */
        C42416b f99736f;

        /* renamed from: g */
        int f99737g;

        /* renamed from: h */
        long f99738h;

        /* renamed from: i */
        volatile boolean f99739i;

        C42415a(C40756v vVar, C42414d dVar) {
            this.f99734d = vVar;
            this.f99735e = dVar;
            this.f99736f = dVar.f99729i;
        }

        public void dispose() {
            if (!this.f99739i) {
                this.f99739i = true;
                this.f99735e.mo97876g1(this);
            }
        }

        public boolean isDisposed() {
            return this.f99739i;
        }
    }

    /* renamed from: sd1.d$b */
    static final class C42416b {

        /* renamed from: a */
        final Object[] f99740a;

        /* renamed from: b */
        volatile C42416b f99741b;

        C42416b(int i) {
            this.f99740a = new Object[i];
        }
    }

    public C42414d(C40749p pVar, int i) {
        super(pVar);
        this.f99726f = i;
        C42416b bVar = new C42416b(i);
        this.f99729i = bVar;
        this.f99730j = bVar;
        this.f99727g = new AtomicReference(f99723n);
    }

    /* access modifiers changed from: protected */
    /* renamed from: I0 */
    public void mo94344I0(C40756v vVar) {
        C42415a aVar = new C42415a(vVar, this);
        vVar.onSubscribe(aVar);
        mo97875f1(aVar);
        if (this.f99725e.get() || !this.f99725e.compareAndSet(false, true)) {
            mo97877h1(aVar);
        } else {
            this.f99678d.mo95016c(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f1 */
    public void mo97875f1(C42415a aVar) {
        C42415a[] aVarArr;
        C42415a[] aVarArr2;
        do {
            aVarArr = (C42415a[]) this.f99727g.get();
            if (aVarArr != f99724o) {
                int length = aVarArr.length;
                aVarArr2 = new C42415a[(length + 1)];
                System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                aVarArr2[length] = aVar;
            } else {
                return;
            }
        } while (!C1612n.m5659a(this.f99727g, aVarArr, aVarArr2));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g1 */
    public void mo97876g1(C42415a aVar) {
        C42415a[] aVarArr;
        C42415a[] aVarArr2;
        do {
            aVarArr = (C42415a[]) this.f99727g.get();
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
                        aVarArr2 = f99723n;
                    } else {
                        C42415a[] aVarArr3 = new C42415a[(length - 1)];
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
        } while (!C1612n.m5659a(this.f99727g, aVarArr, aVarArr2));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h1 */
    public void mo97877h1(C42415a aVar) {
        boolean z;
        if (aVar.getAndIncrement() == 0) {
            long j = aVar.f99738h;
            int i = aVar.f99737g;
            C42416b bVar = aVar.f99736f;
            C40756v vVar = aVar.f99734d;
            int i2 = this.f99726f;
            int i3 = 1;
            while (!aVar.f99739i) {
                boolean z2 = this.f99733m;
                if (this.f99728h == j) {
                    z = true;
                } else {
                    z = false;
                }
                if (z2 && z) {
                    aVar.f99736f = null;
                    Throwable th = this.f99732l;
                    if (th != null) {
                        vVar.onError(th);
                        return;
                    } else {
                        vVar.onComplete();
                        return;
                    }
                } else if (!z) {
                    if (i == i2) {
                        bVar = bVar.f99741b;
                        i = 0;
                    }
                    vVar.onNext(bVar.f99740a[i]);
                    i++;
                    j++;
                } else {
                    aVar.f99738h = j;
                    aVar.f99737g = i;
                    aVar.f99736f = bVar;
                    i3 = aVar.addAndGet(-i3);
                    if (i3 == 0) {
                        return;
                    }
                }
            }
            aVar.f99736f = null;
        }
    }

    public void onComplete() {
        this.f99733m = true;
        for (C42415a h1 : (C42415a[]) this.f99727g.getAndSet(f99724o)) {
            mo97877h1(h1);
        }
    }

    public void onError(Throwable th) {
        this.f99732l = th;
        this.f99733m = true;
        for (C42415a h1 : (C42415a[]) this.f99727g.getAndSet(f99724o)) {
            mo97877h1(h1);
        }
    }

    public void onNext(Object obj) {
        int i = this.f99731k;
        if (i == this.f99726f) {
            C42416b bVar = new C42416b(i);
            bVar.f99740a[0] = obj;
            this.f99731k = 1;
            this.f99730j.f99741b = bVar;
            this.f99730j = bVar;
        } else {
            this.f99730j.f99740a[i] = obj;
            this.f99731k = i + 1;
        }
        this.f99728h++;
        for (C42415a h1 : (C42415a[]) this.f99727g.get()) {
            mo97877h1(h1);
        }
    }

    public void onSubscribe(C41205b bVar) {
    }
}
