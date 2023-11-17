package be1;

import ae1.C40293a;
import androidx.lifecycle.C1612n;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import ld1.C41692b;
import p469io.reactivex.exceptions.MissingBackpressureException;
import uh1.C43107b;
import uh1.C43108c;
import xd1.C43259d;
import yd1.C43355a;
import yd1.C43358c;
import yd1.C43364i;
import yd1.C43367k;

/* renamed from: be1.a */
public final class C40327a extends C40329b {

    /* renamed from: l */
    static final Object[] f95794l = new Object[0];

    /* renamed from: m */
    static final C40328a[] f95795m = new C40328a[0];

    /* renamed from: n */
    static final C40328a[] f95796n = new C40328a[0];

    /* renamed from: e */
    final AtomicReference f95797e;

    /* renamed from: f */
    final ReadWriteLock f95798f;

    /* renamed from: g */
    final Lock f95799g;

    /* renamed from: h */
    final Lock f95800h;

    /* renamed from: i */
    final AtomicReference f95801i = new AtomicReference();

    /* renamed from: j */
    final AtomicReference f95802j;

    /* renamed from: k */
    long f95803k;

    /* renamed from: be1.a$a */
    static final class C40328a extends AtomicLong implements C43108c, C43355a.C43356a {
        private static final long serialVersionUID = 3293175281126227086L;

        /* renamed from: d */
        final C43107b f95804d;

        /* renamed from: e */
        final C40327a f95805e;

        /* renamed from: f */
        boolean f95806f;

        /* renamed from: g */
        boolean f95807g;

        /* renamed from: h */
        C43355a f95808h;

        /* renamed from: i */
        boolean f95809i;

        /* renamed from: j */
        volatile boolean f95810j;

        /* renamed from: k */
        long f95811k;

        C40328a(C43107b bVar, C40327a aVar) {
            this.f95804d = bVar;
            this.f95805e = aVar;
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
            mo94354b();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
            return;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo94353a() {
            /*
                r4 = this;
                boolean r0 = r4.f95810j
                if (r0 == 0) goto L_0x0005
                return
            L_0x0005:
                monitor-enter(r4)
                boolean r0 = r4.f95810j     // Catch:{ all -> 0x003e }
                if (r0 == 0) goto L_0x000c
                monitor-exit(r4)     // Catch:{ all -> 0x003e }
                return
            L_0x000c:
                boolean r0 = r4.f95806f     // Catch:{ all -> 0x003e }
                if (r0 == 0) goto L_0x0012
                monitor-exit(r4)     // Catch:{ all -> 0x003e }
                return
            L_0x0012:
                be1.a r0 = r4.f95805e     // Catch:{ all -> 0x003e }
                java.util.concurrent.locks.Lock r1 = r0.f95799g     // Catch:{ all -> 0x003e }
                r1.lock()     // Catch:{ all -> 0x003e }
                long r2 = r0.f95803k     // Catch:{ all -> 0x003e }
                r4.f95811k = r2     // Catch:{ all -> 0x003e }
                java.util.concurrent.atomic.AtomicReference r0 = r0.f95801i     // Catch:{ all -> 0x003e }
                java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x003e }
                r1.unlock()     // Catch:{ all -> 0x003e }
                r1 = 1
                if (r0 == 0) goto L_0x002b
                r2 = r1
                goto L_0x002c
            L_0x002b:
                r2 = 0
            L_0x002c:
                r4.f95807g = r2     // Catch:{ all -> 0x003e }
                r4.f95806f = r1     // Catch:{ all -> 0x003e }
                monitor-exit(r4)     // Catch:{ all -> 0x003e }
                if (r0 == 0) goto L_0x003d
                boolean r0 = r4.test(r0)
                if (r0 == 0) goto L_0x003a
                return
            L_0x003a:
                r4.mo94354b()
            L_0x003d:
                return
            L_0x003e:
                r0 = move-exception
                monitor-exit(r4)     // Catch:{ all -> 0x003e }
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: be1.C40327a.C40328a.mo94353a():void");
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0013, code lost:
            r0.mo102032d(r2);
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo94354b() {
            /*
                r2 = this;
            L_0x0000:
                boolean r0 = r2.f95810j
                if (r0 == 0) goto L_0x0005
                return
            L_0x0005:
                monitor-enter(r2)
                yd1.a r0 = r2.f95808h     // Catch:{ all -> 0x0017 }
                if (r0 != 0) goto L_0x000f
                r0 = 0
                r2.f95807g = r0     // Catch:{ all -> 0x0017 }
                monitor-exit(r2)     // Catch:{ all -> 0x0017 }
                return
            L_0x000f:
                r1 = 0
                r2.f95808h = r1     // Catch:{ all -> 0x0017 }
                monitor-exit(r2)     // Catch:{ all -> 0x0017 }
                r0.mo102032d(r2)
                goto L_0x0000
            L_0x0017:
                r0 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x0017 }
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: be1.C40327a.C40328a.mo94354b():void");
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0031, code lost:
            r2.f95809i = true;
         */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo94355c(java.lang.Object r3, long r4) {
            /*
                r2 = this;
                boolean r0 = r2.f95810j
                if (r0 == 0) goto L_0x0005
                return
            L_0x0005:
                boolean r0 = r2.f95809i
                if (r0 != 0) goto L_0x0037
                monitor-enter(r2)
                boolean r0 = r2.f95810j     // Catch:{ all -> 0x0034 }
                if (r0 == 0) goto L_0x0010
                monitor-exit(r2)     // Catch:{ all -> 0x0034 }
                return
            L_0x0010:
                long r0 = r2.f95811k     // Catch:{ all -> 0x0034 }
                int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
                if (r4 != 0) goto L_0x0018
                monitor-exit(r2)     // Catch:{ all -> 0x0034 }
                return
            L_0x0018:
                boolean r4 = r2.f95807g     // Catch:{ all -> 0x0034 }
                if (r4 == 0) goto L_0x002d
                yd1.a r4 = r2.f95808h     // Catch:{ all -> 0x0034 }
                if (r4 != 0) goto L_0x0028
                yd1.a r4 = new yd1.a     // Catch:{ all -> 0x0034 }
                r5 = 4
                r4.<init>(r5)     // Catch:{ all -> 0x0034 }
                r2.f95808h = r4     // Catch:{ all -> 0x0034 }
            L_0x0028:
                r4.mo102031c(r3)     // Catch:{ all -> 0x0034 }
                monitor-exit(r2)     // Catch:{ all -> 0x0034 }
                return
            L_0x002d:
                r4 = 1
                r2.f95806f = r4     // Catch:{ all -> 0x0034 }
                monitor-exit(r2)     // Catch:{ all -> 0x0034 }
                r2.f95809i = r4
                goto L_0x0037
            L_0x0034:
                r3 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x0034 }
                throw r3
            L_0x0037:
                r2.test(r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: be1.C40327a.C40328a.mo94355c(java.lang.Object, long):void");
        }

        public void cancel() {
            if (!this.f95810j) {
                this.f95810j = true;
                this.f95805e.mo94350N(this);
            }
        }

        /* renamed from: l */
        public void mo94357l(long j) {
            if (C43259d.m124223g(j)) {
                C43358c.m124395a(this, j);
            }
        }

        public boolean test(Object obj) {
            if (this.f95810j) {
                return true;
            }
            if (C43367k.m124427n(obj)) {
                this.f95804d.onComplete();
                return true;
            } else if (C43367k.m124428o(obj)) {
                this.f95804d.onError(C43367k.m124425h(obj));
                return true;
            } else {
                long j = get();
                if (j != 0) {
                    this.f95804d.onNext(C43367k.m124426l(obj));
                    if (j == Long.MAX_VALUE) {
                        return false;
                    }
                    decrementAndGet();
                    return false;
                }
                cancel();
                this.f95804d.onError(new MissingBackpressureException("Could not deliver value due to lack of requests"));
                return true;
            }
        }
    }

    C40327a() {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f95798f = reentrantReadWriteLock;
        this.f95799g = reentrantReadWriteLock.readLock();
        this.f95800h = reentrantReadWriteLock.writeLock();
        this.f95797e = new AtomicReference(f95795m);
        this.f95802j = new AtomicReference();
    }

    /* renamed from: M */
    public static C40327a m116764M() {
        return new C40327a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public void mo94348F(C43107b bVar) {
        C40328a aVar = new C40328a(bVar, this);
        bVar.mo27070b(aVar);
        if (!mo94349L(aVar)) {
            Throwable th = (Throwable) this.f95802j.get();
            if (th == C43364i.f101206a) {
                bVar.onComplete();
            } else {
                bVar.onError(th);
            }
        } else if (aVar.f95810j) {
            mo94350N(aVar);
        } else {
            aVar.mo94353a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public boolean mo94349L(C40328a aVar) {
        C40328a[] aVarArr;
        C40328a[] aVarArr2;
        do {
            aVarArr = (C40328a[]) this.f95797e.get();
            if (aVarArr == f95796n) {
                return false;
            }
            int length = aVarArr.length;
            aVarArr2 = new C40328a[(length + 1)];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
        } while (!C1612n.m5659a(this.f95797e, aVarArr, aVarArr2));
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N */
    public void mo94350N(C40328a aVar) {
        C40328a[] aVarArr;
        C40328a[] aVarArr2;
        do {
            aVarArr = (C40328a[]) this.f95797e.get();
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
                        aVarArr2 = f95795m;
                    } else {
                        C40328a[] aVarArr3 = new C40328a[(length - 1)];
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
        } while (!C1612n.m5659a(this.f95797e, aVarArr, aVarArr2));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O */
    public void mo94351O(Object obj) {
        Lock lock = this.f95800h;
        lock.lock();
        this.f95803k++;
        this.f95801i.lazySet(obj);
        lock.unlock();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public C40328a[] mo94352P(Object obj) {
        C40328a[] aVarArr = (C40328a[]) this.f95797e.get();
        C40328a[] aVarArr2 = f95796n;
        if (!(aVarArr == aVarArr2 || (aVarArr = (C40328a[]) this.f95797e.getAndSet(aVarArr2)) == aVarArr2)) {
            mo94351O(obj);
        }
        return aVarArr;
    }

    /* renamed from: b */
    public void mo27070b(C43108c cVar) {
        if (this.f95802j.get() != null) {
            cVar.cancel();
        } else {
            cVar.mo94357l(Long.MAX_VALUE);
        }
    }

    public void onComplete() {
        if (C1612n.m5659a(this.f95802j, (Object) null, C43364i.f101206a)) {
            Object e = C43367k.m124422e();
            for (C40328a c : mo94352P(e)) {
                c.mo94355c(e, this.f95803k);
            }
        }
    }

    public void onError(Throwable th) {
        C41692b.m120934e(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!C1612n.m5659a(this.f95802j, (Object) null, th)) {
            C40293a.m116722s(th);
            return;
        }
        Object g = C43367k.m124424g(th);
        for (C40328a c : mo94352P(g)) {
            c.mo94355c(g, this.f95803k);
        }
    }

    public void onNext(Object obj) {
        C41692b.m120934e(obj, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f95802j.get() == null) {
            Object q = C43367k.m124429q(obj);
            mo94351O(q);
            for (C40328a c : (C40328a[]) this.f95797e.get()) {
                c.mo94355c(q, this.f95803k);
            }
        }
    }
}
