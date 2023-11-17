package sd1;

import ae1.C40293a;
import androidx.lifecycle.C1612n;
import ed1.C40754t;
import ed1.C40756v;
import hd1.C41205b;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kd1.C41498c;
import zd1.C43413a;

/* renamed from: sd1.o0 */
public final class C42484o0 extends C43413a implements C42495q0 {

    /* renamed from: d */
    final C40754t f99968d;

    /* renamed from: e */
    final AtomicReference f99969e;

    /* renamed from: f */
    final C40754t f99970f;

    /* renamed from: sd1.o0$a */
    static final class C42485a extends AtomicReference implements C41205b {
        private static final long serialVersionUID = -1100270633763673112L;

        /* renamed from: d */
        final C40756v f99971d;

        C42485a(C40756v vVar) {
            this.f99971d = vVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo97925a(C42486b bVar) {
            if (!compareAndSet((Object) null, bVar)) {
                bVar.mo97927b(this);
            }
        }

        public void dispose() {
            Object andSet = getAndSet(this);
            if (andSet != null && andSet != this) {
                ((C42486b) andSet).mo97927b(this);
            }
        }

        public boolean isDisposed() {
            return get() == this;
        }
    }

    /* renamed from: sd1.o0$b */
    static final class C42486b implements C40756v, C41205b {

        /* renamed from: h */
        static final C42485a[] f99972h = new C42485a[0];

        /* renamed from: i */
        static final C42485a[] f99973i = new C42485a[0];

        /* renamed from: d */
        final AtomicReference f99974d;

        /* renamed from: e */
        final AtomicReference f99975e = new AtomicReference(f99972h);

        /* renamed from: f */
        final AtomicBoolean f99976f;

        /* renamed from: g */
        final AtomicReference f99977g = new AtomicReference();

        C42486b(AtomicReference atomicReference) {
            this.f99974d = atomicReference;
            this.f99976f = new AtomicBoolean();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo97926a(C42485a aVar) {
            C42485a[] aVarArr;
            C42485a[] aVarArr2;
            do {
                aVarArr = (C42485a[]) this.f99975e.get();
                if (aVarArr == f99973i) {
                    return false;
                }
                int length = aVarArr.length;
                aVarArr2 = new C42485a[(length + 1)];
                System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                aVarArr2[length] = aVar;
            } while (!C1612n.m5659a(this.f99975e, aVarArr, aVarArr2));
            return true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo97927b(C42485a aVar) {
            C42485a[] aVarArr;
            C42485a[] aVarArr2;
            do {
                aVarArr = (C42485a[]) this.f99975e.get();
                int length = aVarArr.length;
                if (length != 0) {
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            i = -1;
                            break;
                        } else if (aVarArr[i].equals(aVar)) {
                            break;
                        } else {
                            i++;
                        }
                    }
                    if (i >= 0) {
                        if (length == 1) {
                            aVarArr2 = f99972h;
                        } else {
                            C42485a[] aVarArr3 = new C42485a[(length - 1)];
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
            } while (!C1612n.m5659a(this.f99975e, aVarArr, aVarArr2));
        }

        public void dispose() {
            AtomicReference atomicReference = this.f99975e;
            C42485a[] aVarArr = f99973i;
            if (((C42485a[]) atomicReference.getAndSet(aVarArr)) != aVarArr) {
                C1612n.m5659a(this.f99974d, this, (Object) null);
                C41498c.m120371a(this.f99977g);
            }
        }

        public boolean isDisposed() {
            return this.f99975e.get() == f99973i;
        }

        public void onComplete() {
            C1612n.m5659a(this.f99974d, this, (Object) null);
            for (C42485a aVar : (C42485a[]) this.f99975e.getAndSet(f99973i)) {
                aVar.f99971d.onComplete();
            }
        }

        public void onError(Throwable th) {
            C1612n.m5659a(this.f99974d, this, (Object) null);
            C42485a[] aVarArr = (C42485a[]) this.f99975e.getAndSet(f99973i);
            if (aVarArr.length != 0) {
                for (C42485a aVar : aVarArr) {
                    aVar.f99971d.onError(th);
                }
                return;
            }
            C40293a.m116722s(th);
        }

        public void onNext(Object obj) {
            for (C42485a aVar : (C42485a[]) this.f99975e.get()) {
                aVar.f99971d.onNext(obj);
            }
        }

        public void onSubscribe(C41205b bVar) {
            C41498c.m120376g(this.f99977g, bVar);
        }
    }

    /* renamed from: sd1.o0$c */
    static final class C42487c implements C40754t {

        /* renamed from: d */
        private final AtomicReference f99978d;

        C42487c(AtomicReference atomicReference) {
            this.f99978d = atomicReference;
        }

        /* renamed from: c */
        public void mo95016c(C40756v vVar) {
            C42485a aVar = new C42485a(vVar);
            vVar.onSubscribe(aVar);
            while (true) {
                C42486b bVar = (C42486b) this.f99978d.get();
                if (bVar == null || bVar.isDisposed()) {
                    C42486b bVar2 = new C42486b(this.f99978d);
                    if (!C1612n.m5659a(this.f99978d, bVar, bVar2)) {
                        continue;
                    } else {
                        bVar = bVar2;
                    }
                }
                if (bVar.mo97926a(aVar)) {
                    aVar.mo97925a(bVar);
                    return;
                }
            }
        }
    }

    private C42484o0(C40754t tVar, C40754t tVar2, AtomicReference atomicReference) {
        this.f99970f = tVar;
        this.f99968d = tVar2;
        this.f99969e = atomicReference;
    }

    /* renamed from: o1 */
    public static C43413a m123069o1(C40754t tVar) {
        AtomicReference atomicReference = new AtomicReference();
        return C40293a.m116719p(new C42484o0(new C42487c(atomicReference), tVar, atomicReference));
    }

    /* access modifiers changed from: protected */
    /* renamed from: I0 */
    public void mo94344I0(C40756v vVar) {
        this.f99970f.mo95016c(vVar);
    }

    /* renamed from: b */
    public C40754t mo97923b() {
        return this.f99968d;
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* renamed from: j1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo97924j1(jd1.C41399f r5) {
        /*
            r4 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicReference r0 = r4.f99969e
            java.lang.Object r0 = r0.get()
            sd1.o0$b r0 = (sd1.C42484o0.C42486b) r0
            if (r0 == 0) goto L_0x0010
            boolean r1 = r0.isDisposed()
            if (r1 == 0) goto L_0x0021
        L_0x0010:
            sd1.o0$b r1 = new sd1.o0$b
            java.util.concurrent.atomic.AtomicReference r2 = r4.f99969e
            r1.<init>(r2)
            java.util.concurrent.atomic.AtomicReference r2 = r4.f99969e
            boolean r0 = androidx.lifecycle.C1612n.m5659a(r2, r0, r1)
            if (r0 != 0) goto L_0x0020
            goto L_0x0000
        L_0x0020:
            r0 = r1
        L_0x0021:
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.f99976f
            boolean r1 = r1.get()
            r2 = 0
            if (r1 != 0) goto L_0x0034
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.f99976f
            r3 = 1
            boolean r1 = r1.compareAndSet(r2, r3)
            if (r1 == 0) goto L_0x0034
            r2 = r3
        L_0x0034:
            r5.accept(r0)     // Catch:{ all -> 0x003f }
            if (r2 == 0) goto L_0x003e
            ed1.t r5 = r4.f99968d
            r5.mo95016c(r0)
        L_0x003e:
            return
        L_0x003f:
            r5 = move-exception
            id1.C41300a.m119661b(r5)
            java.lang.RuntimeException r5 = yd1.C43364i.m124412e(r5)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: sd1.C42484o0.mo97924j1(jd1.f):void");
    }
}
