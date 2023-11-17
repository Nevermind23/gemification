package ee1;

import ae1.C40293a;
import androidx.lifecycle.C1612n;
import ed1.C40756v;
import hd1.C41205b;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import ld1.C41692b;
import yd1.C43355a;
import yd1.C43364i;
import yd1.C43367k;

/* renamed from: ee1.a */
public final class C40765a extends C40776f {

    /* renamed from: k */
    private static final Object[] f96462k = new Object[0];

    /* renamed from: l */
    static final C40766a[] f96463l = new C40766a[0];

    /* renamed from: m */
    static final C40766a[] f96464m = new C40766a[0];

    /* renamed from: d */
    final AtomicReference f96465d;

    /* renamed from: e */
    final AtomicReference f96466e;

    /* renamed from: f */
    final ReadWriteLock f96467f;

    /* renamed from: g */
    final Lock f96468g;

    /* renamed from: h */
    final Lock f96469h;

    /* renamed from: i */
    final AtomicReference f96470i;

    /* renamed from: j */
    long f96471j;

    /* renamed from: ee1.a$a */
    static final class C40766a implements C41205b, C43355a.C43356a {

        /* renamed from: d */
        final C40756v f96472d;

        /* renamed from: e */
        final C40765a f96473e;

        /* renamed from: f */
        boolean f96474f;

        /* renamed from: g */
        boolean f96475g;

        /* renamed from: h */
        C43355a f96476h;

        /* renamed from: i */
        boolean f96477i;

        /* renamed from: j */
        volatile boolean f96478j;

        /* renamed from: k */
        long f96479k;

        C40766a(C40756v vVar, C40765a aVar) {
            this.f96472d = vVar;
            this.f96473e = aVar;
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0031, code lost:
            if (r0 == null) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0037, code lost:
            if (test(r0) == false) goto L_0x003a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0039, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x003a, code lost:
            mo95106b();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
            return;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo95105a() {
            /*
                r4 = this;
                boolean r0 = r4.f96478j
                if (r0 == 0) goto L_0x0005
                return
            L_0x0005:
                monitor-enter(r4)
                boolean r0 = r4.f96478j     // Catch:{ all -> 0x003e }
                if (r0 == 0) goto L_0x000c
                monitor-exit(r4)     // Catch:{ all -> 0x003e }
                return
            L_0x000c:
                boolean r0 = r4.f96474f     // Catch:{ all -> 0x003e }
                if (r0 == 0) goto L_0x0012
                monitor-exit(r4)     // Catch:{ all -> 0x003e }
                return
            L_0x0012:
                ee1.a r0 = r4.f96473e     // Catch:{ all -> 0x003e }
                java.util.concurrent.locks.Lock r1 = r0.f96468g     // Catch:{ all -> 0x003e }
                r1.lock()     // Catch:{ all -> 0x003e }
                long r2 = r0.f96471j     // Catch:{ all -> 0x003e }
                r4.f96479k = r2     // Catch:{ all -> 0x003e }
                java.util.concurrent.atomic.AtomicReference r0 = r0.f96465d     // Catch:{ all -> 0x003e }
                java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x003e }
                r1.unlock()     // Catch:{ all -> 0x003e }
                r1 = 1
                if (r0 == 0) goto L_0x002b
                r2 = r1
                goto L_0x002c
            L_0x002b:
                r2 = 0
            L_0x002c:
                r4.f96475g = r2     // Catch:{ all -> 0x003e }
                r4.f96474f = r1     // Catch:{ all -> 0x003e }
                monitor-exit(r4)     // Catch:{ all -> 0x003e }
                if (r0 == 0) goto L_0x003d
                boolean r0 = r4.test(r0)
                if (r0 == 0) goto L_0x003a
                return
            L_0x003a:
                r4.mo95106b()
            L_0x003d:
                return
            L_0x003e:
                r0 = move-exception
                monitor-exit(r4)     // Catch:{ all -> 0x003e }
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: ee1.C40765a.C40766a.mo95105a():void");
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0013, code lost:
            r0.mo102032d(r2);
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo95106b() {
            /*
                r2 = this;
            L_0x0000:
                boolean r0 = r2.f96478j
                if (r0 == 0) goto L_0x0005
                return
            L_0x0005:
                monitor-enter(r2)
                yd1.a r0 = r2.f96476h     // Catch:{ all -> 0x0017 }
                if (r0 != 0) goto L_0x000f
                r0 = 0
                r2.f96475g = r0     // Catch:{ all -> 0x0017 }
                monitor-exit(r2)     // Catch:{ all -> 0x0017 }
                return
            L_0x000f:
                r1 = 0
                r2.f96476h = r1     // Catch:{ all -> 0x0017 }
                monitor-exit(r2)     // Catch:{ all -> 0x0017 }
                r0.mo102032d(r2)
                goto L_0x0000
            L_0x0017:
                r0 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x0017 }
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: ee1.C40765a.C40766a.mo95106b():void");
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0031, code lost:
            r2.f96477i = true;
         */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo95107c(java.lang.Object r3, long r4) {
            /*
                r2 = this;
                boolean r0 = r2.f96478j
                if (r0 == 0) goto L_0x0005
                return
            L_0x0005:
                boolean r0 = r2.f96477i
                if (r0 != 0) goto L_0x0037
                monitor-enter(r2)
                boolean r0 = r2.f96478j     // Catch:{ all -> 0x0034 }
                if (r0 == 0) goto L_0x0010
                monitor-exit(r2)     // Catch:{ all -> 0x0034 }
                return
            L_0x0010:
                long r0 = r2.f96479k     // Catch:{ all -> 0x0034 }
                int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
                if (r4 != 0) goto L_0x0018
                monitor-exit(r2)     // Catch:{ all -> 0x0034 }
                return
            L_0x0018:
                boolean r4 = r2.f96475g     // Catch:{ all -> 0x0034 }
                if (r4 == 0) goto L_0x002d
                yd1.a r4 = r2.f96476h     // Catch:{ all -> 0x0034 }
                if (r4 != 0) goto L_0x0028
                yd1.a r4 = new yd1.a     // Catch:{ all -> 0x0034 }
                r5 = 4
                r4.<init>(r5)     // Catch:{ all -> 0x0034 }
                r2.f96476h = r4     // Catch:{ all -> 0x0034 }
            L_0x0028:
                r4.mo102031c(r3)     // Catch:{ all -> 0x0034 }
                monitor-exit(r2)     // Catch:{ all -> 0x0034 }
                return
            L_0x002d:
                r4 = 1
                r2.f96474f = r4     // Catch:{ all -> 0x0034 }
                monitor-exit(r2)     // Catch:{ all -> 0x0034 }
                r2.f96477i = r4
                goto L_0x0037
            L_0x0034:
                r3 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x0034 }
                throw r3
            L_0x0037:
                r2.test(r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ee1.C40765a.C40766a.mo95107c(java.lang.Object, long):void");
        }

        public void dispose() {
            if (!this.f96478j) {
                this.f96478j = true;
                this.f96473e.mo95102l1(this);
            }
        }

        public boolean isDisposed() {
            return this.f96478j;
        }

        public boolean test(Object obj) {
            return this.f96478j || C43367k.m124419a(obj, this.f96472d);
        }
    }

    C40765a() {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f96467f = reentrantReadWriteLock;
        this.f96468g = reentrantReadWriteLock.readLock();
        this.f96469h = reentrantReadWriteLock.writeLock();
        this.f96466e = new AtomicReference(f96463l);
        this.f96465d = new AtomicReference();
        this.f96470i = new AtomicReference();
    }

    /* renamed from: h1 */
    public static C40765a m118198h1() {
        return new C40765a();
    }

    /* renamed from: i1 */
    public static C40765a m118199i1(Object obj) {
        return new C40765a(obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: I0 */
    public void mo94344I0(C40756v vVar) {
        C40766a aVar = new C40766a(vVar, this);
        vVar.onSubscribe(aVar);
        if (!mo95099g1(aVar)) {
            Throwable th = (Throwable) this.f96470i.get();
            if (th == C43364i.f101206a) {
                vVar.onComplete();
            } else {
                vVar.onError(th);
            }
        } else if (aVar.f96478j) {
            mo95102l1(aVar);
        } else {
            aVar.mo95105a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g1 */
    public boolean mo95099g1(C40766a aVar) {
        C40766a[] aVarArr;
        C40766a[] aVarArr2;
        do {
            aVarArr = (C40766a[]) this.f96466e.get();
            if (aVarArr == f96464m) {
                return false;
            }
            int length = aVarArr.length;
            aVarArr2 = new C40766a[(length + 1)];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
        } while (!C1612n.m5659a(this.f96466e, aVarArr, aVarArr2));
        return true;
    }

    /* renamed from: j1 */
    public Object mo95100j1() {
        Object obj = this.f96465d.get();
        if (C43367k.m124427n(obj) || C43367k.m124428o(obj)) {
            return null;
        }
        return C43367k.m124426l(obj);
    }

    /* renamed from: k1 */
    public boolean mo95101k1() {
        Object obj = this.f96465d.get();
        if (obj == null || C43367k.m124427n(obj) || C43367k.m124428o(obj)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l1 */
    public void mo95102l1(C40766a aVar) {
        C40766a[] aVarArr;
        C40766a[] aVarArr2;
        do {
            aVarArr = (C40766a[]) this.f96466e.get();
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
                        aVarArr2 = f96463l;
                    } else {
                        C40766a[] aVarArr3 = new C40766a[(length - 1)];
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
        } while (!C1612n.m5659a(this.f96466e, aVarArr, aVarArr2));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m1 */
    public void mo95103m1(Object obj) {
        this.f96469h.lock();
        this.f96471j++;
        this.f96465d.lazySet(obj);
        this.f96469h.unlock();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n1 */
    public C40766a[] mo95104n1(Object obj) {
        AtomicReference atomicReference = this.f96466e;
        C40766a[] aVarArr = f96464m;
        C40766a[] aVarArr2 = (C40766a[]) atomicReference.getAndSet(aVarArr);
        if (aVarArr2 != aVarArr) {
            mo95103m1(obj);
        }
        return aVarArr2;
    }

    public void onComplete() {
        if (C1612n.m5659a(this.f96470i, (Object) null, C43364i.f101206a)) {
            Object e = C43367k.m124422e();
            for (C40766a c : mo95104n1(e)) {
                c.mo95107c(e, this.f96471j);
            }
        }
    }

    public void onError(Throwable th) {
        C41692b.m120934e(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!C1612n.m5659a(this.f96470i, (Object) null, th)) {
            C40293a.m116722s(th);
            return;
        }
        Object g = C43367k.m124424g(th);
        for (C40766a c : mo95104n1(g)) {
            c.mo95107c(g, this.f96471j);
        }
    }

    public void onNext(Object obj) {
        C41692b.m120934e(obj, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f96470i.get() == null) {
            Object q = C43367k.m124429q(obj);
            mo95103m1(q);
            for (C40766a c : (C40766a[]) this.f96466e.get()) {
                c.mo95107c(q, this.f96471j);
            }
        }
    }

    public void onSubscribe(C41205b bVar) {
        if (this.f96470i.get() != null) {
            bVar.dispose();
        }
    }

    C40765a(Object obj) {
        this();
        this.f96465d.lazySet(C41692b.m120934e(obj, "defaultValue is null"));
    }
}
