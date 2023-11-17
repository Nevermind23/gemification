package sd1;

import ed1.C40749p;
import ed1.C40754t;
import ed1.C40756v;
import hd1.C41205b;
import id1.C41300a;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import jd1.C41405l;
import kd1.C41498c;
import kd1.C41499d;
import ld1.C41692b;
import ud1.C43063b;
import yd1.C43357b;

/* renamed from: sd1.e */
public final class C42421e extends C40749p {

    /* renamed from: d */
    final C40754t[] f99754d;

    /* renamed from: e */
    final Iterable f99755e;

    /* renamed from: f */
    final C41405l f99756f;

    /* renamed from: g */
    final int f99757g;

    /* renamed from: h */
    final boolean f99758h;

    /* renamed from: sd1.e$a */
    static final class C42422a extends AtomicReference implements C40756v {
        private static final long serialVersionUID = -4823716997131257941L;

        /* renamed from: d */
        final C42423b f99759d;

        /* renamed from: e */
        final int f99760e;

        C42422a(C42423b bVar, int i) {
            this.f99759d = bVar;
            this.f99760e = i;
        }

        /* renamed from: a */
        public void mo97879a() {
            C41498c.m120371a(this);
        }

        public void onComplete() {
            this.f99759d.mo97883d(this.f99760e);
        }

        public void onError(Throwable th) {
            this.f99759d.mo97884e(this.f99760e, th);
        }

        public void onNext(Object obj) {
            this.f99759d.mo97885f(this.f99760e, obj);
        }

        public void onSubscribe(C41205b bVar) {
            C41498c.m120376g(this, bVar);
        }
    }

    /* renamed from: sd1.e$b */
    static final class C42423b extends AtomicInteger implements C41205b {
        private static final long serialVersionUID = 8567835998786448817L;

        /* renamed from: d */
        final C40756v f99761d;

        /* renamed from: e */
        final C41405l f99762e;

        /* renamed from: f */
        final C42422a[] f99763f;

        /* renamed from: g */
        Object[] f99764g;

        /* renamed from: h */
        final C43063b f99765h;

        /* renamed from: i */
        final boolean f99766i;

        /* renamed from: j */
        volatile boolean f99767j;

        /* renamed from: k */
        volatile boolean f99768k;

        /* renamed from: l */
        final C43357b f99769l = new C43357b();

        /* renamed from: m */
        int f99770m;

        /* renamed from: n */
        int f99771n;

        C42423b(C40756v vVar, C41405l lVar, int i, int i2, boolean z) {
            this.f99761d = vVar;
            this.f99762e = lVar;
            this.f99766i = z;
            this.f99764g = new Object[i];
            C42422a[] aVarArr = new C42422a[i];
            for (int i3 = 0; i3 < i; i3++) {
                aVarArr[i3] = new C42422a(this, i3);
            }
            this.f99763f = aVarArr;
            this.f99765h = new C43063b(i2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo97880a() {
            for (C42422a a : this.f99763f) {
                a.mo97879a();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo97881b(C43063b bVar) {
            synchronized (this) {
                this.f99764g = null;
            }
            bVar.clear();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo97882c() {
            boolean z;
            if (getAndIncrement() == 0) {
                C43063b bVar = this.f99765h;
                C40756v vVar = this.f99761d;
                boolean z2 = this.f99766i;
                int i = 1;
                while (!this.f99767j) {
                    if (z2 || this.f99769l.get() == null) {
                        boolean z3 = this.f99768k;
                        Object[] objArr = (Object[]) bVar.mo96258c();
                        if (objArr == null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z3 && z) {
                            mo97881b(bVar);
                            Throwable b = this.f99769l.mo102035b();
                            if (b == null) {
                                vVar.onComplete();
                                return;
                            } else {
                                vVar.onError(b);
                                return;
                            }
                        } else if (z) {
                            i = addAndGet(-i);
                            if (i == 0) {
                                return;
                            }
                        } else {
                            try {
                                vVar.onNext(C41692b.m120934e(this.f99762e.apply(objArr), "The combiner returned a null value"));
                            } catch (Throwable th) {
                                C41300a.m119661b(th);
                                this.f99769l.mo102034a(th);
                                mo97880a();
                                mo97881b(bVar);
                                vVar.onError(this.f99769l.mo102035b());
                                return;
                            }
                        }
                    } else {
                        mo97880a();
                        mo97881b(bVar);
                        vVar.onError(this.f99769l.mo102035b());
                        return;
                    }
                }
                mo97881b(bVar);
            }
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0017, code lost:
            if (r2 == r0.length) goto L_0x0019;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x001c, code lost:
            if (r4 == false) goto L_0x0021;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x001e, code lost:
            mo97880a();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0021, code lost:
            mo97882c();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0024, code lost:
            return;
         */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo97883d(int r4) {
            /*
                r3 = this;
                monitor-enter(r3)
                java.lang.Object[] r0 = r3.f99764g     // Catch:{ all -> 0x0025 }
                if (r0 != 0) goto L_0x0007
                monitor-exit(r3)     // Catch:{ all -> 0x0025 }
                return
            L_0x0007:
                r4 = r0[r4]     // Catch:{ all -> 0x0025 }
                r1 = 1
                if (r4 != 0) goto L_0x000e
                r4 = r1
                goto L_0x000f
            L_0x000e:
                r4 = 0
            L_0x000f:
                if (r4 != 0) goto L_0x0019
                int r2 = r3.f99771n     // Catch:{ all -> 0x0025 }
                int r2 = r2 + r1
                r3.f99771n = r2     // Catch:{ all -> 0x0025 }
                int r0 = r0.length     // Catch:{ all -> 0x0025 }
                if (r2 != r0) goto L_0x001b
            L_0x0019:
                r3.f99768k = r1     // Catch:{ all -> 0x0025 }
            L_0x001b:
                monitor-exit(r3)     // Catch:{ all -> 0x0025 }
                if (r4 == 0) goto L_0x0021
                r3.mo97880a()
            L_0x0021:
                r3.mo97882c()
                return
            L_0x0025:
                r4 = move-exception
                monitor-exit(r3)     // Catch:{ all -> 0x0025 }
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: sd1.C42421e.C42423b.mo97883d(int):void");
        }

        public void dispose() {
            if (!this.f99767j) {
                this.f99767j = true;
                mo97880a();
                if (getAndIncrement() == 0) {
                    mo97881b(this.f99765h);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0023, code lost:
            if (r1 == r4.length) goto L_0x0025;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0028, code lost:
            r0 = r3;
         */
        /* renamed from: e */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo97884e(int r3, java.lang.Throwable r4) {
            /*
                r2 = this;
                yd1.b r0 = r2.f99769l
                boolean r0 = r0.mo102034a(r4)
                if (r0 == 0) goto L_0x0036
                boolean r4 = r2.f99766i
                r0 = 1
                if (r4 == 0) goto L_0x002d
                monitor-enter(r2)
                java.lang.Object[] r4 = r2.f99764g     // Catch:{ all -> 0x002a }
                if (r4 != 0) goto L_0x0014
                monitor-exit(r2)     // Catch:{ all -> 0x002a }
                return
            L_0x0014:
                r3 = r4[r3]     // Catch:{ all -> 0x002a }
                if (r3 != 0) goto L_0x001a
                r3 = r0
                goto L_0x001b
            L_0x001a:
                r3 = 0
            L_0x001b:
                if (r3 != 0) goto L_0x0025
                int r1 = r2.f99771n     // Catch:{ all -> 0x002a }
                int r1 = r1 + r0
                r2.f99771n = r1     // Catch:{ all -> 0x002a }
                int r4 = r4.length     // Catch:{ all -> 0x002a }
                if (r1 != r4) goto L_0x0027
            L_0x0025:
                r2.f99768k = r0     // Catch:{ all -> 0x002a }
            L_0x0027:
                monitor-exit(r2)     // Catch:{ all -> 0x002a }
                r0 = r3
                goto L_0x002d
            L_0x002a:
                r3 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x002a }
                throw r3
            L_0x002d:
                if (r0 == 0) goto L_0x0032
                r2.mo97880a()
            L_0x0032:
                r2.mo97882c()
                goto L_0x0039
            L_0x0036:
                ae1.C40293a.m116722s(r4)
            L_0x0039:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: sd1.C42421e.C42423b.mo97884e(int, java.lang.Throwable):void");
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0023, code lost:
            if (r4 == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0025, code lost:
            mo97882c();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
            return;
         */
        /* renamed from: f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo97885f(int r4, java.lang.Object r5) {
            /*
                r3 = this;
                monitor-enter(r3)
                java.lang.Object[] r0 = r3.f99764g     // Catch:{ all -> 0x0029 }
                if (r0 != 0) goto L_0x0007
                monitor-exit(r3)     // Catch:{ all -> 0x0029 }
                return
            L_0x0007:
                r1 = r0[r4]     // Catch:{ all -> 0x0029 }
                int r2 = r3.f99770m     // Catch:{ all -> 0x0029 }
                if (r1 != 0) goto L_0x0011
                int r2 = r2 + 1
                r3.f99770m = r2     // Catch:{ all -> 0x0029 }
            L_0x0011:
                r0[r4] = r5     // Catch:{ all -> 0x0029 }
                int r4 = r0.length     // Catch:{ all -> 0x0029 }
                if (r2 != r4) goto L_0x0021
                ud1.b r4 = r3.f99765h     // Catch:{ all -> 0x0029 }
                java.lang.Object r5 = r0.clone()     // Catch:{ all -> 0x0029 }
                r4.mo96261f(r5)     // Catch:{ all -> 0x0029 }
                r4 = 1
                goto L_0x0022
            L_0x0021:
                r4 = 0
            L_0x0022:
                monitor-exit(r3)     // Catch:{ all -> 0x0029 }
                if (r4 == 0) goto L_0x0028
                r3.mo97882c()
            L_0x0028:
                return
            L_0x0029:
                r4 = move-exception
                monitor-exit(r3)     // Catch:{ all -> 0x0029 }
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: sd1.C42421e.C42423b.mo97885f(int, java.lang.Object):void");
        }

        /* renamed from: g */
        public void mo97886g(C40754t[] tVarArr) {
            C42422a[] aVarArr = this.f99763f;
            int length = aVarArr.length;
            this.f99761d.onSubscribe(this);
            for (int i = 0; i < length && !this.f99768k && !this.f99767j; i++) {
                tVarArr[i].mo95016c(aVarArr[i]);
            }
        }

        public boolean isDisposed() {
            return this.f99767j;
        }
    }

    public C42421e(C40754t[] tVarArr, Iterable iterable, C41405l lVar, int i, boolean z) {
        this.f99754d = tVarArr;
        this.f99755e = iterable;
        this.f99756f = lVar;
        this.f99757g = i;
        this.f99758h = z;
    }

    /* renamed from: I0 */
    public void mo94344I0(C40756v vVar) {
        int i;
        C40754t[] tVarArr = this.f99754d;
        if (tVarArr == null) {
            tVarArr = new C40754t[8];
            i = 0;
            for (C40754t tVar : this.f99755e) {
                if (i == tVarArr.length) {
                    C40754t[] tVarArr2 = new C40754t[((i >> 2) + i)];
                    System.arraycopy(tVarArr, 0, tVarArr2, 0, i);
                    tVarArr = tVarArr2;
                }
                tVarArr[i] = tVar;
                i++;
            }
        } else {
            i = tVarArr.length;
        }
        int i2 = i;
        if (i2 == 0) {
            C41499d.m120381g(vVar);
            return;
        }
        new C42423b(vVar, this.f99756f, i2, this.f99757g, this.f99758h).mo97886g(tVarArr);
    }
}
