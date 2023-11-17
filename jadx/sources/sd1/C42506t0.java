package sd1;

import ae1.C40293a;
import androidx.lifecycle.C1612n;
import ed1.C40754t;
import ed1.C40756v;
import hd1.C41205b;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kd1.C41498c;
import kd1.C41501f;
import yd1.C43367k;
import zd1.C43413a;

/* renamed from: sd1.t0 */
public final class C42506t0 extends C43413a implements C41501f {

    /* renamed from: h */
    static final C42508b f100028h = new C42516j();

    /* renamed from: d */
    final C40754t f100029d;

    /* renamed from: e */
    final AtomicReference f100030e;

    /* renamed from: f */
    final C42508b f100031f;

    /* renamed from: g */
    final C40754t f100032g;

    /* renamed from: sd1.t0$a */
    static abstract class C42507a extends AtomicReference implements C42511e {
        private static final long serialVersionUID = 2346567790059478686L;

        /* renamed from: d */
        C42510d f100033d;

        /* renamed from: e */
        int f100034e;

        C42507a() {
            C42510d dVar = new C42510d((Object) null);
            this.f100033d = dVar;
            set(dVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo97937a(C42510d dVar) {
            this.f100033d.set(dVar);
            this.f100033d = dVar;
            this.f100034e++;
        }

        /* renamed from: b */
        public final void mo97938b() {
            mo97937a(new C42510d(mo97940d(C43367k.m124422e())));
            mo97949n();
        }

        /* renamed from: c */
        public final void mo97939c(C42509c cVar) {
            if (cVar.getAndIncrement() == 0) {
                int i = 1;
                do {
                    C42510d dVar = (C42510d) cVar.mo97951a();
                    if (dVar == null) {
                        dVar = mo97941e();
                        cVar.f100037f = dVar;
                    }
                    while (!cVar.isDisposed()) {
                        C42510d dVar2 = (C42510d) dVar.get();
                        if (dVar2 == null) {
                            cVar.f100037f = dVar;
                            i = cVar.addAndGet(-i);
                        } else if (C43367k.m124419a(mo97942f(dVar2.f100039d), cVar.f100036e)) {
                            cVar.f100037f = null;
                            return;
                        } else {
                            dVar = dVar2;
                        }
                    }
                    cVar.f100037f = null;
                    return;
                } while (i != 0);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public Object mo97940d(Object obj) {
            return obj;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public C42510d mo97941e() {
            return (C42510d) get();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public Object mo97942f(Object obj) {
            return obj;
        }

        /* renamed from: g */
        public final void mo97943g(Throwable th) {
            mo97937a(new C42510d(mo97940d(C43367k.m124424g(th))));
            mo97949n();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public final void mo97944h() {
            this.f100034e--;
            mo97945i((C42510d) ((C42510d) get()).get());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public final void mo97945i(C42510d dVar) {
            set(dVar);
        }

        /* renamed from: k */
        public final void mo97946k(Object obj) {
            mo97937a(new C42510d(mo97940d(C43367k.m124429q(obj))));
            mo97948m();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l */
        public final void mo97947l() {
            C42510d dVar = (C42510d) get();
            if (dVar.f100039d != null) {
                C42510d dVar2 = new C42510d((Object) null);
                dVar2.lazySet(dVar.get());
                set(dVar2);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public abstract void mo97948m();

        /* access modifiers changed from: package-private */
        /* renamed from: n */
        public void mo97949n() {
            mo97947l();
        }
    }

    /* renamed from: sd1.t0$b */
    interface C42508b {
        C42511e call();
    }

    /* renamed from: sd1.t0$c */
    static final class C42509c extends AtomicInteger implements C41205b {
        private static final long serialVersionUID = 2728361546769921047L;

        /* renamed from: d */
        final C42513g f100035d;

        /* renamed from: e */
        final C40756v f100036e;

        /* renamed from: f */
        Object f100037f;

        /* renamed from: g */
        volatile boolean f100038g;

        C42509c(C42513g gVar, C40756v vVar) {
            this.f100035d = gVar;
            this.f100036e = vVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public Object mo97951a() {
            return this.f100037f;
        }

        public void dispose() {
            if (!this.f100038g) {
                this.f100038g = true;
                this.f100035d.mo97953b(this);
                this.f100037f = null;
            }
        }

        public boolean isDisposed() {
            return this.f100038g;
        }
    }

    /* renamed from: sd1.t0$d */
    static final class C42510d extends AtomicReference {
        private static final long serialVersionUID = 245354315435971818L;

        /* renamed from: d */
        final Object f100039d;

        C42510d(Object obj) {
            this.f100039d = obj;
        }
    }

    /* renamed from: sd1.t0$e */
    interface C42511e {
        /* renamed from: b */
        void mo97938b();

        /* renamed from: c */
        void mo97939c(C42509c cVar);

        /* renamed from: g */
        void mo97943g(Throwable th);

        /* renamed from: k */
        void mo97946k(Object obj);
    }

    /* renamed from: sd1.t0$f */
    static final class C42512f implements C42508b {

        /* renamed from: a */
        private final int f100040a;

        C42512f(int i) {
            this.f100040a = i;
        }

        public C42511e call() {
            return new C42515i(this.f100040a);
        }
    }

    /* renamed from: sd1.t0$g */
    static final class C42513g extends AtomicReference implements C40756v, C41205b {

        /* renamed from: h */
        static final C42509c[] f100041h = new C42509c[0];

        /* renamed from: i */
        static final C42509c[] f100042i = new C42509c[0];
        private static final long serialVersionUID = -533785617179540163L;

        /* renamed from: d */
        final C42511e f100043d;

        /* renamed from: e */
        boolean f100044e;

        /* renamed from: f */
        final AtomicReference f100045f = new AtomicReference(f100041h);

        /* renamed from: g */
        final AtomicBoolean f100046g = new AtomicBoolean();

        C42513g(C42511e eVar) {
            this.f100043d = eVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo97952a(C42509c cVar) {
            C42509c[] cVarArr;
            C42509c[] cVarArr2;
            do {
                cVarArr = (C42509c[]) this.f100045f.get();
                if (cVarArr == f100042i) {
                    return false;
                }
                int length = cVarArr.length;
                cVarArr2 = new C42509c[(length + 1)];
                System.arraycopy(cVarArr, 0, cVarArr2, 0, length);
                cVarArr2[length] = cVar;
            } while (!C1612n.m5659a(this.f100045f, cVarArr, cVarArr2));
            return true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo97953b(C42509c cVar) {
            C42509c[] cVarArr;
            C42509c[] cVarArr2;
            do {
                cVarArr = (C42509c[]) this.f100045f.get();
                int length = cVarArr.length;
                if (length != 0) {
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            i = -1;
                            break;
                        } else if (cVarArr[i].equals(cVar)) {
                            break;
                        } else {
                            i++;
                        }
                    }
                    if (i >= 0) {
                        if (length == 1) {
                            cVarArr2 = f100041h;
                        } else {
                            C42509c[] cVarArr3 = new C42509c[(length - 1)];
                            System.arraycopy(cVarArr, 0, cVarArr3, 0, i);
                            System.arraycopy(cVarArr, i + 1, cVarArr3, i, (length - i) - 1);
                            cVarArr2 = cVarArr3;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } while (!C1612n.m5659a(this.f100045f, cVarArr, cVarArr2));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo97954c() {
            for (C42509c c : (C42509c[]) this.f100045f.get()) {
                this.f100043d.mo97939c(c);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo97955d() {
            for (C42509c c : (C42509c[]) this.f100045f.getAndSet(f100042i)) {
                this.f100043d.mo97939c(c);
            }
        }

        public void dispose() {
            this.f100045f.set(f100042i);
            C41498c.m120371a(this);
        }

        public boolean isDisposed() {
            return this.f100045f.get() == f100042i;
        }

        public void onComplete() {
            if (!this.f100044e) {
                this.f100044e = true;
                this.f100043d.mo97938b();
                mo97955d();
            }
        }

        public void onError(Throwable th) {
            if (!this.f100044e) {
                this.f100044e = true;
                this.f100043d.mo97943g(th);
                mo97955d();
                return;
            }
            C40293a.m116722s(th);
        }

        public void onNext(Object obj) {
            if (!this.f100044e) {
                this.f100043d.mo97946k(obj);
                mo97954c();
            }
        }

        public void onSubscribe(C41205b bVar) {
            if (C41498c.m120376g(this, bVar)) {
                mo97954c();
            }
        }
    }

    /* renamed from: sd1.t0$h */
    static final class C42514h implements C40754t {

        /* renamed from: d */
        private final AtomicReference f100047d;

        /* renamed from: e */
        private final C42508b f100048e;

        C42514h(AtomicReference atomicReference, C42508b bVar) {
            this.f100047d = atomicReference;
            this.f100048e = bVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo95016c(ed1.C40756v r4) {
            /*
                r3 = this;
            L_0x0000:
                java.util.concurrent.atomic.AtomicReference r0 = r3.f100047d
                java.lang.Object r0 = r0.get()
                sd1.t0$g r0 = (sd1.C42506t0.C42513g) r0
                if (r0 != 0) goto L_0x0020
                sd1.t0$b r0 = r3.f100048e
                sd1.t0$e r0 = r0.call()
                sd1.t0$g r1 = new sd1.t0$g
                r1.<init>(r0)
                java.util.concurrent.atomic.AtomicReference r0 = r3.f100047d
                r2 = 0
                boolean r0 = androidx.lifecycle.C1612n.m5659a(r0, r2, r1)
                if (r0 != 0) goto L_0x001f
                goto L_0x0000
            L_0x001f:
                r0 = r1
            L_0x0020:
                sd1.t0$c r1 = new sd1.t0$c
                r1.<init>(r0, r4)
                r4.onSubscribe(r1)
                r0.mo97952a(r1)
                boolean r4 = r1.isDisposed()
                if (r4 == 0) goto L_0x0035
                r0.mo97953b(r1)
                return
            L_0x0035:
                sd1.t0$e r4 = r0.f100043d
                r4.mo97939c(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: sd1.C42506t0.C42514h.mo95016c(ed1.v):void");
        }
    }

    /* renamed from: sd1.t0$i */
    static final class C42515i extends C42507a {
        private static final long serialVersionUID = -5898283885385201806L;

        /* renamed from: f */
        final int f100049f;

        C42515i(int i) {
            this.f100049f = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public void mo97948m() {
            if (this.f100034e > this.f100049f) {
                mo97944h();
            }
        }
    }

    /* renamed from: sd1.t0$j */
    static final class C42516j implements C42508b {
        C42516j() {
        }

        public C42511e call() {
            return new C42517k(16);
        }
    }

    /* renamed from: sd1.t0$k */
    static final class C42517k extends ArrayList implements C42511e {
        private static final long serialVersionUID = 7063189396499112664L;

        /* renamed from: d */
        volatile int f100050d;

        C42517k(int i) {
            super(i);
        }

        /* renamed from: b */
        public void mo97938b() {
            add(C43367k.m124422e());
            this.f100050d++;
        }

        /* renamed from: c */
        public void mo97939c(C42509c cVar) {
            int i;
            if (cVar.getAndIncrement() == 0) {
                C40756v vVar = cVar.f100036e;
                int i2 = 1;
                while (!cVar.isDisposed()) {
                    int i3 = this.f100050d;
                    Integer num = (Integer) cVar.mo97951a();
                    if (num != null) {
                        i = num.intValue();
                    } else {
                        i = 0;
                    }
                    while (i < i3) {
                        if (!C43367k.m124419a(get(i), vVar) && !cVar.isDisposed()) {
                            i++;
                        } else {
                            return;
                        }
                    }
                    cVar.f100037f = Integer.valueOf(i);
                    i2 = cVar.addAndGet(-i2);
                    if (i2 == 0) {
                        return;
                    }
                }
            }
        }

        /* renamed from: g */
        public void mo97943g(Throwable th) {
            add(C43367k.m124424g(th));
            this.f100050d++;
        }

        /* renamed from: k */
        public void mo97946k(Object obj) {
            add(C43367k.m124429q(obj));
            this.f100050d++;
        }
    }

    private C42506t0(C40754t tVar, C40754t tVar2, AtomicReference atomicReference, C42508b bVar) {
        this.f100032g = tVar;
        this.f100029d = tVar2;
        this.f100030e = atomicReference;
        this.f100031f = bVar;
    }

    /* renamed from: o1 */
    public static C43413a m123100o1(C40754t tVar, int i) {
        if (i == Integer.MAX_VALUE) {
            return m123102q1(tVar);
        }
        return m123101p1(tVar, new C42512f(i));
    }

    /* renamed from: p1 */
    static C43413a m123101p1(C40754t tVar, C42508b bVar) {
        AtomicReference atomicReference = new AtomicReference();
        return C40293a.m116719p(new C42506t0(new C42514h(atomicReference, bVar), tVar, atomicReference, bVar));
    }

    /* renamed from: q1 */
    public static C43413a m123102q1(C40754t tVar) {
        return m123101p1(tVar, f100028h);
    }

    /* access modifiers changed from: protected */
    /* renamed from: I0 */
    public void mo94344I0(C40756v vVar) {
        this.f100032g.mo95016c(vVar);
    }

    /* renamed from: a */
    public void mo96264a(C41205b bVar) {
        C1612n.m5659a(this.f100030e, (C42513g) bVar, (Object) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* renamed from: j1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo97924j1(jd1.C41399f r5) {
        /*
            r4 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicReference r0 = r4.f100030e
            java.lang.Object r0 = r0.get()
            sd1.t0$g r0 = (sd1.C42506t0.C42513g) r0
            if (r0 == 0) goto L_0x0010
            boolean r1 = r0.isDisposed()
            if (r1 == 0) goto L_0x0025
        L_0x0010:
            sd1.t0$b r1 = r4.f100031f
            sd1.t0$e r1 = r1.call()
            sd1.t0$g r2 = new sd1.t0$g
            r2.<init>(r1)
            java.util.concurrent.atomic.AtomicReference r1 = r4.f100030e
            boolean r0 = androidx.lifecycle.C1612n.m5659a(r1, r0, r2)
            if (r0 != 0) goto L_0x0024
            goto L_0x0000
        L_0x0024:
            r0 = r2
        L_0x0025:
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.f100046g
            boolean r1 = r1.get()
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x0039
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.f100046g
            boolean r1 = r1.compareAndSet(r3, r2)
            if (r1 == 0) goto L_0x0039
            r1 = r2
            goto L_0x003a
        L_0x0039:
            r1 = r3
        L_0x003a:
            r5.accept(r0)     // Catch:{ all -> 0x0045 }
            if (r1 == 0) goto L_0x0044
            ed1.t r5 = r4.f100029d
            r5.mo95016c(r0)
        L_0x0044:
            return
        L_0x0045:
            r5 = move-exception
            if (r1 == 0) goto L_0x004d
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.f100046g
            r0.compareAndSet(r2, r3)
        L_0x004d:
            id1.C41300a.m119661b(r5)
            java.lang.RuntimeException r5 = yd1.C43364i.m124412e(r5)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: sd1.C42506t0.mo97924j1(jd1.f):void");
    }
}
