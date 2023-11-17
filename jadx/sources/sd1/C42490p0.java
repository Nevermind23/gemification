package sd1;

import androidx.lifecycle.C1612n;
import ed1.C40754t;
import ed1.C40756v;
import hd1.C41205b;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kd1.C41498c;
import kd1.C41501f;
import zd1.C43413a;

/* renamed from: sd1.p0 */
public final class C42490p0 extends C43413a implements C41501f {

    /* renamed from: d */
    final C40754t f99986d;

    /* renamed from: e */
    final AtomicReference f99987e = new AtomicReference();

    /* renamed from: sd1.p0$a */
    static final class C42491a extends AtomicReference implements C41205b {
        private static final long serialVersionUID = 7463222674719692880L;

        /* renamed from: d */
        final C40756v f99988d;

        C42491a(C40756v vVar, C42492b bVar) {
            this.f99988d = vVar;
            lazySet(bVar);
        }

        public void dispose() {
            C42492b bVar = (C42492b) getAndSet((Object) null);
            if (bVar != null) {
                bVar.mo97929b(this);
            }
        }

        public boolean isDisposed() {
            return get() == null;
        }
    }

    /* renamed from: sd1.p0$b */
    static final class C42492b extends AtomicReference implements C40756v, C41205b {

        /* renamed from: h */
        static final C42491a[] f99989h = new C42491a[0];

        /* renamed from: i */
        static final C42491a[] f99990i = new C42491a[0];
        private static final long serialVersionUID = -3251430252873581268L;

        /* renamed from: d */
        final AtomicBoolean f99991d = new AtomicBoolean();

        /* renamed from: e */
        final AtomicReference f99992e;

        /* renamed from: f */
        final AtomicReference f99993f;

        /* renamed from: g */
        Throwable f99994g;

        C42492b(AtomicReference atomicReference) {
            this.f99992e = atomicReference;
            this.f99993f = new AtomicReference();
            lazySet(f99989h);
        }

        /* renamed from: a */
        public boolean mo97928a(C42491a aVar) {
            C42491a[] aVarArr;
            C42491a[] aVarArr2;
            do {
                aVarArr = (C42491a[]) get();
                if (aVarArr == f99990i) {
                    return false;
                }
                int length = aVarArr.length;
                aVarArr2 = new C42491a[(length + 1)];
                System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                aVarArr2[length] = aVar;
            } while (!compareAndSet(aVarArr, aVarArr2));
            return true;
        }

        /* renamed from: b */
        public void mo97929b(C42491a aVar) {
            C42491a[] aVarArr;
            C42491a[] aVarArr2;
            do {
                aVarArr = (C42491a[]) get();
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
                        aVarArr2 = f99989h;
                        if (length != 1) {
                            aVarArr2 = new C42491a[(length - 1)];
                            System.arraycopy(aVarArr, 0, aVarArr2, 0, i);
                            System.arraycopy(aVarArr, i + 1, aVarArr2, i, (length - i) - 1);
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } while (!compareAndSet(aVarArr, aVarArr2));
        }

        public void dispose() {
            getAndSet(f99990i);
            C1612n.m5659a(this.f99992e, this, (Object) null);
            C41498c.m120371a(this.f99993f);
        }

        public boolean isDisposed() {
            return get() == f99990i;
        }

        public void onComplete() {
            this.f99993f.lazySet(C41498c.DISPOSED);
            for (C42491a aVar : (C42491a[]) getAndSet(f99990i)) {
                aVar.f99988d.onComplete();
            }
        }

        public void onError(Throwable th) {
            this.f99994g = th;
            this.f99993f.lazySet(C41498c.DISPOSED);
            for (C42491a aVar : (C42491a[]) getAndSet(f99990i)) {
                aVar.f99988d.onError(th);
            }
        }

        public void onNext(Object obj) {
            for (C42491a aVar : (C42491a[]) get()) {
                aVar.f99988d.onNext(obj);
            }
        }

        public void onSubscribe(C41205b bVar) {
            C41498c.m120376g(this.f99993f, bVar);
        }
    }

    public C42490p0(C40754t tVar) {
        this.f99986d = tVar;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* renamed from: I0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo94344I0(ed1.C40756v r4) {
        /*
            r3 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicReference r0 = r3.f99987e
            java.lang.Object r0 = r0.get()
            sd1.p0$b r0 = (sd1.C42490p0.C42492b) r0
            if (r0 != 0) goto L_0x001b
            sd1.p0$b r1 = new sd1.p0$b
            java.util.concurrent.atomic.AtomicReference r2 = r3.f99987e
            r1.<init>(r2)
            java.util.concurrent.atomic.AtomicReference r2 = r3.f99987e
            boolean r0 = androidx.lifecycle.C1612n.m5659a(r2, r0, r1)
            if (r0 != 0) goto L_0x001a
            goto L_0x0000
        L_0x001a:
            r0 = r1
        L_0x001b:
            sd1.p0$a r1 = new sd1.p0$a
            r1.<init>(r4, r0)
            r4.onSubscribe(r1)
            boolean r2 = r0.mo97928a(r1)
            if (r2 == 0) goto L_0x0033
            boolean r4 = r1.isDisposed()
            if (r4 == 0) goto L_0x0032
            r0.mo97929b(r1)
        L_0x0032:
            return
        L_0x0033:
            java.lang.Throwable r0 = r0.f99994g
            if (r0 == 0) goto L_0x003b
            r4.onError(r0)
            goto L_0x003e
        L_0x003b:
            r4.onComplete()
        L_0x003e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sd1.C42490p0.mo94344I0(ed1.v):void");
    }

    /* renamed from: a */
    public void mo96264a(C41205b bVar) {
        C1612n.m5659a(this.f99987e, (C42492b) bVar, (Object) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* renamed from: j1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo97924j1(jd1.C41399f r5) {
        /*
            r4 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicReference r0 = r4.f99987e
            java.lang.Object r0 = r0.get()
            sd1.p0$b r0 = (sd1.C42490p0.C42492b) r0
            if (r0 == 0) goto L_0x0010
            boolean r1 = r0.isDisposed()
            if (r1 == 0) goto L_0x0021
        L_0x0010:
            sd1.p0$b r1 = new sd1.p0$b
            java.util.concurrent.atomic.AtomicReference r2 = r4.f99987e
            r1.<init>(r2)
            java.util.concurrent.atomic.AtomicReference r2 = r4.f99987e
            boolean r0 = androidx.lifecycle.C1612n.m5659a(r2, r0, r1)
            if (r0 != 0) goto L_0x0020
            goto L_0x0000
        L_0x0020:
            r0 = r1
        L_0x0021:
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.f99991d
            boolean r1 = r1.get()
            r2 = 0
            if (r1 != 0) goto L_0x0034
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.f99991d
            r3 = 1
            boolean r1 = r1.compareAndSet(r2, r3)
            if (r1 == 0) goto L_0x0034
            r2 = r3
        L_0x0034:
            r5.accept(r0)     // Catch:{ all -> 0x003f }
            if (r2 == 0) goto L_0x003e
            ed1.t r5 = r4.f99986d
            r5.mo95016c(r0)
        L_0x003e:
            return
        L_0x003f:
            r5 = move-exception
            id1.C41300a.m119661b(r5)
            java.lang.RuntimeException r5 = yd1.C43364i.m124412e(r5)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: sd1.C42490p0.mo97924j1(jd1.f):void");
    }
}
