package sd1;

import ae1.C40293a;
import androidx.lifecycle.C1612n;
import ed1.C40754t;
import ed1.C40756v;
import hd1.C41205b;
import id1.C41300a;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import jd1.C41405l;
import kd1.C41498c;
import ld1.C41692b;
import md1.C41735d;
import md1.C41740i;
import ud1.C43063b;
import yd1.C43357b;

/* renamed from: sd1.a1 */
public final class C42402a1 extends C42399a {

    /* renamed from: e */
    final C41405l f99686e;

    /* renamed from: f */
    final int f99687f;

    /* renamed from: g */
    final boolean f99688g;

    /* renamed from: sd1.a1$a */
    static final class C42403a extends AtomicReference implements C40756v {
        private static final long serialVersionUID = 3837284832786408377L;

        /* renamed from: d */
        final C42404b f99689d;

        /* renamed from: e */
        final long f99690e;

        /* renamed from: f */
        final int f99691f;

        /* renamed from: g */
        volatile C41740i f99692g;

        /* renamed from: h */
        volatile boolean f99693h;

        C42403a(C42404b bVar, long j, int i) {
            this.f99689d = bVar;
            this.f99690e = j;
            this.f99691f = i;
        }

        /* renamed from: a */
        public void mo97871a() {
            C41498c.m120371a(this);
        }

        public void onComplete() {
            if (this.f99690e == this.f99689d.f99704m) {
                this.f99693h = true;
                this.f99689d.mo97873b();
            }
        }

        public void onError(Throwable th) {
            this.f99689d.mo97874c(this, th);
        }

        public void onNext(Object obj) {
            if (this.f99690e == this.f99689d.f99704m) {
                if (obj != null) {
                    this.f99692g.mo96261f(obj);
                }
                this.f99689d.mo97873b();
            }
        }

        public void onSubscribe(C41205b bVar) {
            if (C41498c.m120376g(this, bVar)) {
                if (bVar instanceof C41735d) {
                    C41735d dVar = (C41735d) bVar;
                    int e = dVar.mo96260e(7);
                    if (e == 1) {
                        this.f99692g = dVar;
                        this.f99693h = true;
                        this.f99689d.mo97873b();
                        return;
                    } else if (e == 2) {
                        this.f99692g = dVar;
                        return;
                    }
                }
                this.f99692g = new C43063b(this.f99691f);
            }
        }
    }

    /* renamed from: sd1.a1$b */
    static final class C42404b extends AtomicInteger implements C40756v, C41205b {

        /* renamed from: n */
        static final C42403a f99694n;
        private static final long serialVersionUID = -3491074160481096299L;

        /* renamed from: d */
        final C40756v f99695d;

        /* renamed from: e */
        final C41405l f99696e;

        /* renamed from: f */
        final int f99697f;

        /* renamed from: g */
        final boolean f99698g;

        /* renamed from: h */
        final C43357b f99699h;

        /* renamed from: i */
        volatile boolean f99700i;

        /* renamed from: j */
        volatile boolean f99701j;

        /* renamed from: k */
        C41205b f99702k;

        /* renamed from: l */
        final AtomicReference f99703l = new AtomicReference();

        /* renamed from: m */
        volatile long f99704m;

        static {
            C42403a aVar = new C42403a((C42404b) null, -1, 1);
            f99694n = aVar;
            aVar.mo97871a();
        }

        C42404b(C40756v vVar, C41405l lVar, int i, boolean z) {
            this.f99695d = vVar;
            this.f99696e = lVar;
            this.f99697f = i;
            this.f99698g = z;
            this.f99699h = new C43357b();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo97872a() {
            C42403a aVar;
            C42403a aVar2 = (C42403a) this.f99703l.get();
            C42403a aVar3 = f99694n;
            if (aVar2 != aVar3 && (aVar = (C42403a) this.f99703l.getAndSet(aVar3)) != aVar3 && aVar != null) {
                aVar.mo97871a();
            }
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Removed duplicated region for block: B:86:0x000f A[SYNTHETIC] */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo97873b() {
            /*
                r13 = this;
                int r0 = r13.getAndIncrement()
                if (r0 == 0) goto L_0x0007
                return
            L_0x0007:
                ed1.v r0 = r13.f99695d
                java.util.concurrent.atomic.AtomicReference r1 = r13.f99703l
                boolean r2 = r13.f99698g
                r3 = 1
                r4 = r3
            L_0x000f:
                boolean r5 = r13.f99701j
                if (r5 == 0) goto L_0x0014
                return
            L_0x0014:
                boolean r5 = r13.f99700i
                r6 = 0
                if (r5 == 0) goto L_0x0052
                java.lang.Object r5 = r1.get()
                if (r5 != 0) goto L_0x0021
                r5 = r3
                goto L_0x0022
            L_0x0021:
                r5 = r6
            L_0x0022:
                if (r2 == 0) goto L_0x0038
                if (r5 == 0) goto L_0x0052
                yd1.b r1 = r13.f99699h
                java.lang.Object r1 = r1.get()
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                if (r1 == 0) goto L_0x0034
                r0.onError(r1)
                goto L_0x0037
            L_0x0034:
                r0.onComplete()
            L_0x0037:
                return
            L_0x0038:
                yd1.b r7 = r13.f99699h
                java.lang.Object r7 = r7.get()
                java.lang.Throwable r7 = (java.lang.Throwable) r7
                if (r7 == 0) goto L_0x004c
                yd1.b r1 = r13.f99699h
                java.lang.Throwable r1 = r1.mo102035b()
                r0.onError(r1)
                return
            L_0x004c:
                if (r5 == 0) goto L_0x0052
                r0.onComplete()
                return
            L_0x0052:
                java.lang.Object r5 = r1.get()
                sd1.a1$a r5 = (sd1.C42402a1.C42403a) r5
                if (r5 == 0) goto L_0x00e9
                md1.i r7 = r5.f99692g
                if (r7 == 0) goto L_0x00e9
                boolean r8 = r5.f99693h
                r9 = 0
                if (r8 == 0) goto L_0x0089
                boolean r8 = r7.isEmpty()
                if (r2 == 0) goto L_0x006f
                if (r8 == 0) goto L_0x0089
                androidx.lifecycle.C1612n.m5659a(r1, r5, r9)
                goto L_0x000f
            L_0x006f:
                yd1.b r10 = r13.f99699h
                java.lang.Object r10 = r10.get()
                java.lang.Throwable r10 = (java.lang.Throwable) r10
                if (r10 == 0) goto L_0x0083
                yd1.b r1 = r13.f99699h
                java.lang.Throwable r1 = r1.mo102035b()
                r0.onError(r1)
                return
            L_0x0083:
                if (r8 == 0) goto L_0x0089
                androidx.lifecycle.C1612n.m5659a(r1, r5, r9)
                goto L_0x000f
            L_0x0089:
                r8 = r6
            L_0x008a:
                boolean r10 = r13.f99701j
                if (r10 == 0) goto L_0x008f
                return
            L_0x008f:
                java.lang.Object r10 = r1.get()
                if (r5 == r10) goto L_0x0097
            L_0x0095:
                r8 = r3
                goto L_0x00e1
            L_0x0097:
                if (r2 != 0) goto L_0x00ad
                yd1.b r10 = r13.f99699h
                java.lang.Object r10 = r10.get()
                java.lang.Throwable r10 = (java.lang.Throwable) r10
                if (r10 == 0) goto L_0x00ad
                yd1.b r1 = r13.f99699h
                java.lang.Throwable r1 = r1.mo102035b()
                r0.onError(r1)
                return
            L_0x00ad:
                boolean r10 = r5.f99693h
                java.lang.Object r11 = r7.mo96258c()     // Catch:{ all -> 0x00b4 }
                goto L_0x00d2
            L_0x00b4:
                r8 = move-exception
                id1.C41300a.m119661b(r8)
                yd1.b r11 = r13.f99699h
                r11.mo102034a(r8)
                androidx.lifecycle.C1612n.m5659a(r1, r5, r9)
                if (r2 != 0) goto L_0x00cd
                r13.mo97872a()
                hd1.b r8 = r13.f99702k
                r8.dispose()
                r13.f99700i = r3
                goto L_0x00d0
            L_0x00cd:
                r5.mo97871a()
            L_0x00d0:
                r8 = r3
                r11 = r9
            L_0x00d2:
                if (r11 != 0) goto L_0x00d6
                r12 = r3
                goto L_0x00d7
            L_0x00d6:
                r12 = r6
            L_0x00d7:
                if (r10 == 0) goto L_0x00df
                if (r12 == 0) goto L_0x00df
                androidx.lifecycle.C1612n.m5659a(r1, r5, r9)
                goto L_0x0095
            L_0x00df:
                if (r12 == 0) goto L_0x00e5
            L_0x00e1:
                if (r8 == 0) goto L_0x00e9
                goto L_0x000f
            L_0x00e5:
                r0.onNext(r11)
                goto L_0x008a
            L_0x00e9:
                int r4 = -r4
                int r4 = r13.addAndGet(r4)
                if (r4 != 0) goto L_0x000f
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: sd1.C42402a1.C42404b.mo97873b():void");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo97874c(C42403a aVar, Throwable th) {
            if (aVar.f99690e != this.f99704m || !this.f99699h.mo102034a(th)) {
                C40293a.m116722s(th);
                return;
            }
            if (!this.f99698g) {
                this.f99702k.dispose();
                this.f99700i = true;
            }
            aVar.f99693h = true;
            mo97873b();
        }

        public void dispose() {
            if (!this.f99701j) {
                this.f99701j = true;
                this.f99702k.dispose();
                mo97872a();
            }
        }

        public boolean isDisposed() {
            return this.f99701j;
        }

        public void onComplete() {
            if (!this.f99700i) {
                this.f99700i = true;
                mo97873b();
            }
        }

        public void onError(Throwable th) {
            if (this.f99700i || !this.f99699h.mo102034a(th)) {
                C40293a.m116722s(th);
                return;
            }
            if (!this.f99698g) {
                mo97872a();
            }
            this.f99700i = true;
            mo97873b();
        }

        public void onNext(Object obj) {
            C42403a aVar;
            long j = this.f99704m + 1;
            this.f99704m = j;
            C42403a aVar2 = (C42403a) this.f99703l.get();
            if (aVar2 != null) {
                aVar2.mo97871a();
            }
            try {
                C40754t tVar = (C40754t) C41692b.m120934e(this.f99696e.apply(obj), "The ObservableSource returned is null");
                C42403a aVar3 = new C42403a(this, j, this.f99697f);
                do {
                    aVar = (C42403a) this.f99703l.get();
                    if (aVar == f99694n) {
                        return;
                    }
                } while (!C1612n.m5659a(this.f99703l, aVar, aVar3));
                tVar.mo95016c(aVar3);
            } catch (Throwable th) {
                C41300a.m119661b(th);
                this.f99702k.dispose();
                onError(th);
            }
        }

        public void onSubscribe(C41205b bVar) {
            if (C41498c.m120378l(this.f99702k, bVar)) {
                this.f99702k = bVar;
                this.f99695d.onSubscribe(this);
            }
        }
    }

    public C42402a1(C40754t tVar, C41405l lVar, int i, boolean z) {
        super(tVar);
        this.f99686e = lVar;
        this.f99687f = i;
        this.f99688g = z;
    }

    /* renamed from: I0 */
    public void mo94344I0(C40756v vVar) {
        if (!C42528v0.m123158b(this.f99678d, vVar, this.f99686e)) {
            this.f99678d.mo95016c(new C42404b(vVar, this.f99686e, this.f99687f, this.f99688g));
        }
    }
}
