package sd1;

import ae1.C40293a;
import ed1.C40749p;
import ed1.C40756v;
import ed1.C40757w;
import hd1.C41205b;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import jd1.C41399f;
import kd1.C41498c;
import kd1.C41501f;
import zd1.C43413a;

/* renamed from: sd1.s0 */
public final class C42501s0 extends C40749p {

    /* renamed from: d */
    final C43413a f100011d;

    /* renamed from: e */
    final int f100012e;

    /* renamed from: f */
    final long f100013f;

    /* renamed from: g */
    final TimeUnit f100014g;

    /* renamed from: h */
    final C40757w f100015h;

    /* renamed from: i */
    C42502a f100016i;

    /* renamed from: sd1.s0$a */
    static final class C42502a extends AtomicReference implements Runnable, C41399f {
        private static final long serialVersionUID = -4552101107598366241L;

        /* renamed from: d */
        final C42501s0 f100017d;

        /* renamed from: e */
        C41205b f100018e;

        /* renamed from: f */
        long f100019f;

        /* renamed from: g */
        boolean f100020g;

        /* renamed from: h */
        boolean f100021h;

        C42502a(C42501s0 s0Var) {
            this.f100017d = s0Var;
        }

        /* renamed from: a */
        public void accept(C41205b bVar) {
            C41498c.m120373c(this, bVar);
            synchronized (this.f100017d) {
                if (this.f100021h) {
                    ((C41501f) this.f100017d.f100011d).mo96264a(bVar);
                }
            }
        }

        public void run() {
            this.f100017d.mo97934j1(this);
        }
    }

    /* renamed from: sd1.s0$b */
    static final class C42503b extends AtomicBoolean implements C40756v, C41205b {
        private static final long serialVersionUID = -7419642935409022375L;

        /* renamed from: d */
        final C40756v f100022d;

        /* renamed from: e */
        final C42501s0 f100023e;

        /* renamed from: f */
        final C42502a f100024f;

        /* renamed from: g */
        C41205b f100025g;

        C42503b(C40756v vVar, C42501s0 s0Var, C42502a aVar) {
            this.f100022d = vVar;
            this.f100023e = s0Var;
            this.f100024f = aVar;
        }

        public void dispose() {
            this.f100025g.dispose();
            if (compareAndSet(false, true)) {
                this.f100023e.mo97930f1(this.f100024f);
            }
        }

        public boolean isDisposed() {
            return this.f100025g.isDisposed();
        }

        public void onComplete() {
            if (compareAndSet(false, true)) {
                this.f100023e.mo97933i1(this.f100024f);
                this.f100022d.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (compareAndSet(false, true)) {
                this.f100023e.mo97933i1(this.f100024f);
                this.f100022d.onError(th);
                return;
            }
            C40293a.m116722s(th);
        }

        public void onNext(Object obj) {
            this.f100022d.onNext(obj);
        }

        public void onSubscribe(C41205b bVar) {
            if (C41498c.m120378l(this.f100025g, bVar)) {
                this.f100025g = bVar;
                this.f100022d.onSubscribe(this);
            }
        }
    }

    public C42501s0(C43413a aVar) {
        this(aVar, 1, 0, TimeUnit.NANOSECONDS, (C40757w) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: I0 */
    public void mo94344I0(C40756v vVar) {
        C42502a aVar;
        boolean z;
        C41205b bVar;
        synchronized (this) {
            aVar = this.f100016i;
            if (aVar == null) {
                aVar = new C42502a(this);
                this.f100016i = aVar;
            }
            long j = aVar.f100019f;
            if (j == 0 && (bVar = aVar.f100018e) != null) {
                bVar.dispose();
            }
            long j2 = j + 1;
            aVar.f100019f = j2;
            if (aVar.f100020g || j2 != ((long) this.f100012e)) {
                z = false;
            } else {
                z = true;
                aVar.f100020g = true;
            }
        }
        this.f100011d.mo95016c(new C42503b(vVar, this, aVar));
        if (z) {
            this.f100011d.mo97924j1(aVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003e, code lost:
        return;
     */
    /* renamed from: f1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo97930f1(sd1.C42501s0.C42502a r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            sd1.s0$a r0 = r5.f100016i     // Catch:{ all -> 0x003f }
            if (r0 == 0) goto L_0x003d
            if (r0 == r6) goto L_0x0008
            goto L_0x003d
        L_0x0008:
            long r0 = r6.f100019f     // Catch:{ all -> 0x003f }
            r2 = 1
            long r0 = r0 - r2
            r6.f100019f = r0     // Catch:{ all -> 0x003f }
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x003b
            boolean r0 = r6.f100020g     // Catch:{ all -> 0x003f }
            if (r0 != 0) goto L_0x001a
            goto L_0x003b
        L_0x001a:
            long r0 = r5.f100013f     // Catch:{ all -> 0x003f }
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x0025
            r5.mo97934j1(r6)     // Catch:{ all -> 0x003f }
            monitor-exit(r5)     // Catch:{ all -> 0x003f }
            return
        L_0x0025:
            kd1.g r0 = new kd1.g     // Catch:{ all -> 0x003f }
            r0.<init>()     // Catch:{ all -> 0x003f }
            r6.f100018e = r0     // Catch:{ all -> 0x003f }
            monitor-exit(r5)     // Catch:{ all -> 0x003f }
            ed1.w r1 = r5.f100015h
            long r2 = r5.f100013f
            java.util.concurrent.TimeUnit r4 = r5.f100014g
            hd1.b r6 = r1.mo95053d(r6, r2, r4)
            r0.mo96265a(r6)
            return
        L_0x003b:
            monitor-exit(r5)     // Catch:{ all -> 0x003f }
            return
        L_0x003d:
            monitor-exit(r5)     // Catch:{ all -> 0x003f }
            return
        L_0x003f:
            r6 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x003f }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: sd1.C42501s0.mo97930f1(sd1.s0$a):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g1 */
    public void mo97931g1(C42502a aVar) {
        C41205b bVar = aVar.f100018e;
        if (bVar != null) {
            bVar.dispose();
            aVar.f100018e = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h1 */
    public void mo97932h1(C42502a aVar) {
        C43413a aVar2 = this.f100011d;
        if (aVar2 instanceof C41205b) {
            ((C41205b) aVar2).dispose();
        } else if (aVar2 instanceof C41501f) {
            ((C41501f) aVar2).mo96264a((C41205b) aVar.get());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i1 */
    public void mo97933i1(C42502a aVar) {
        synchronized (this) {
            if (this.f100011d instanceof C42495q0) {
                C42502a aVar2 = this.f100016i;
                if (aVar2 != null && aVar2 == aVar) {
                    this.f100016i = null;
                    mo97931g1(aVar);
                }
                long j = aVar.f100019f - 1;
                aVar.f100019f = j;
                if (j == 0) {
                    mo97932h1(aVar);
                }
            } else {
                C42502a aVar3 = this.f100016i;
                if (aVar3 != null && aVar3 == aVar) {
                    mo97931g1(aVar);
                    long j2 = aVar.f100019f - 1;
                    aVar.f100019f = j2;
                    if (j2 == 0) {
                        this.f100016i = null;
                        mo97932h1(aVar);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j1 */
    public void mo97934j1(C42502a aVar) {
        synchronized (this) {
            if (aVar.f100019f == 0 && aVar == this.f100016i) {
                this.f100016i = null;
                C41205b bVar = (C41205b) aVar.get();
                C41498c.m120371a(aVar);
                C43413a aVar2 = this.f100011d;
                if (aVar2 instanceof C41205b) {
                    ((C41205b) aVar2).dispose();
                } else if (aVar2 instanceof C41501f) {
                    if (bVar == null) {
                        aVar.f100021h = true;
                    } else {
                        ((C41501f) aVar2).mo96264a(bVar);
                    }
                }
            }
        }
    }

    public C42501s0(C43413a aVar, int i, long j, TimeUnit timeUnit, C40757w wVar) {
        this.f100011d = aVar;
        this.f100012e = i;
        this.f100013f = j;
        this.f100014g = timeUnit;
        this.f100015h = wVar;
    }
}
