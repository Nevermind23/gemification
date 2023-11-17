package sd1;

import ae1.C40293a;
import androidx.lifecycle.C1612n;
import ed1.C40754t;
import ed1.C40756v;
import hd1.C41205b;
import id1.C41300a;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import jd1.C41405l;
import kd1.C41498c;
import ld1.C41692b;
import md1.C41735d;
import md1.C41739h;
import md1.C41740i;
import ud1.C43062a;
import ud1.C43063b;
import yd1.C43357b;
import yd1.C43364i;

/* renamed from: sd1.u */
public final class C42518u extends C42399a {

    /* renamed from: e */
    final C41405l f100051e;

    /* renamed from: f */
    final boolean f100052f;

    /* renamed from: g */
    final int f100053g;

    /* renamed from: h */
    final int f100054h;

    /* renamed from: sd1.u$a */
    static final class C42519a extends AtomicReference implements C40756v {
        private static final long serialVersionUID = -4606175640614850599L;

        /* renamed from: d */
        final long f100055d;

        /* renamed from: e */
        final C42520b f100056e;

        /* renamed from: f */
        volatile boolean f100057f;

        /* renamed from: g */
        volatile C41740i f100058g;

        /* renamed from: h */
        int f100059h;

        C42519a(C42520b bVar, long j) {
            this.f100055d = j;
            this.f100056e = bVar;
        }

        /* renamed from: a */
        public void mo97956a() {
            C41498c.m120371a(this);
        }

        public void onComplete() {
            this.f100057f = true;
            this.f100056e.mo97960d();
        }

        public void onError(Throwable th) {
            if (this.f100056e.f100069k.mo102034a(th)) {
                C42520b bVar = this.f100056e;
                if (!bVar.f100064f) {
                    bVar.mo97959c();
                }
                this.f100057f = true;
                this.f100056e.mo97960d();
                return;
            }
            C40293a.m116722s(th);
        }

        public void onNext(Object obj) {
            if (this.f100059h == 0) {
                this.f100056e.mo97965i(obj, this);
            } else {
                this.f100056e.mo97960d();
            }
        }

        public void onSubscribe(C41205b bVar) {
            if (C41498c.m120376g(this, bVar) && (bVar instanceof C41735d)) {
                C41735d dVar = (C41735d) bVar;
                int e = dVar.mo96260e(7);
                if (e == 1) {
                    this.f100059h = e;
                    this.f100058g = dVar;
                    this.f100057f = true;
                    this.f100056e.mo97960d();
                } else if (e == 2) {
                    this.f100059h = e;
                    this.f100058g = dVar;
                }
            }
        }
    }

    /* renamed from: sd1.u$b */
    static final class C42520b extends AtomicInteger implements C41205b, C40756v {
        private static final long serialVersionUID = -2117620485640801370L;

        /* renamed from: t */
        static final C42519a[] f100060t = new C42519a[0];

        /* renamed from: u */
        static final C42519a[] f100061u = new C42519a[0];

        /* renamed from: d */
        final C40756v f100062d;

        /* renamed from: e */
        final C41405l f100063e;

        /* renamed from: f */
        final boolean f100064f;

        /* renamed from: g */
        final int f100065g;

        /* renamed from: h */
        final int f100066h;

        /* renamed from: i */
        volatile C41739h f100067i;

        /* renamed from: j */
        volatile boolean f100068j;

        /* renamed from: k */
        final C43357b f100069k = new C43357b();

        /* renamed from: l */
        volatile boolean f100070l;

        /* renamed from: m */
        final AtomicReference f100071m;

        /* renamed from: n */
        C41205b f100072n;

        /* renamed from: o */
        long f100073o;

        /* renamed from: p */
        long f100074p;

        /* renamed from: q */
        int f100075q;

        /* renamed from: r */
        Queue f100076r;

        /* renamed from: s */
        int f100077s;

        C42520b(C40756v vVar, C41405l lVar, boolean z, int i, int i2) {
            this.f100062d = vVar;
            this.f100063e = lVar;
            this.f100064f = z;
            this.f100065g = i;
            this.f100066h = i2;
            if (i != Integer.MAX_VALUE) {
                this.f100076r = new ArrayDeque(i);
            }
            this.f100071m = new AtomicReference(f100060t);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo97957a(C42519a aVar) {
            C42519a[] aVarArr;
            C42519a[] aVarArr2;
            do {
                aVarArr = (C42519a[]) this.f100071m.get();
                if (aVarArr == f100061u) {
                    aVar.mo97956a();
                    return false;
                }
                int length = aVarArr.length;
                aVarArr2 = new C42519a[(length + 1)];
                System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                aVarArr2[length] = aVar;
            } while (!C1612n.m5659a(this.f100071m, aVarArr, aVarArr2));
            return true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo97958b() {
            if (this.f100070l) {
                return true;
            }
            Throwable th = (Throwable) this.f100069k.get();
            if (this.f100064f || th == null) {
                return false;
            }
            mo97959c();
            Throwable b = this.f100069k.mo102035b();
            if (b != C43364i.f101206a) {
                this.f100062d.onError(b);
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean mo97959c() {
            C42519a[] aVarArr;
            this.f100072n.dispose();
            C42519a[] aVarArr2 = (C42519a[]) this.f100071m.get();
            C42519a[] aVarArr3 = f100061u;
            if (aVarArr2 == aVarArr3 || (aVarArr = (C42519a[]) this.f100071m.getAndSet(aVarArr3)) == aVarArr3) {
                return false;
            }
            for (C42519a a : aVarArr) {
                a.mo97956a();
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo97960d() {
            if (getAndIncrement() == 0) {
                mo97961e();
            }
        }

        public void dispose() {
            Throwable b;
            if (!this.f100070l) {
                this.f100070l = true;
                if (mo97959c() && (b = this.f100069k.mo102035b()) != null && b != C43364i.f101206a) {
                    C40293a.m116722s(b);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo97961e() {
            int i;
            int i2;
            C40756v vVar = this.f100062d;
            int i3 = 1;
            while (!mo97958b()) {
                C41739h hVar = this.f100067i;
                int i4 = 0;
                if (hVar != null) {
                    while (!mo97958b()) {
                        Object c = hVar.mo96258c();
                        if (c != null) {
                            vVar.onNext(c);
                            i4++;
                        }
                    }
                    return;
                }
                if (i4 == 0) {
                    boolean z = this.f100068j;
                    C41739h hVar2 = this.f100067i;
                    C42519a[] aVarArr = (C42519a[]) this.f100071m.get();
                    int length = aVarArr.length;
                    if (this.f100065g != Integer.MAX_VALUE) {
                        synchronized (this) {
                            i = this.f100076r.size();
                        }
                    } else {
                        i = 0;
                    }
                    if (!z || !((hVar2 == null || hVar2.isEmpty()) && length == 0 && i == 0)) {
                        if (length != 0) {
                            long j = this.f100074p;
                            int i5 = this.f100075q;
                            if (length <= i5 || aVarArr[i5].f100055d != j) {
                                if (length <= i5) {
                                    i5 = 0;
                                }
                                for (int i6 = 0; i6 < length && aVarArr[i5].f100055d != j; i6++) {
                                    i5++;
                                    if (i5 == length) {
                                        i5 = 0;
                                    }
                                }
                                this.f100075q = i5;
                                this.f100074p = aVarArr[i5].f100055d;
                            }
                            int i7 = 0;
                            while (i7 < length) {
                                if (!mo97958b()) {
                                    C42519a aVar = aVarArr[i5];
                                    C41740i iVar = aVar.f100058g;
                                    if (iVar != null) {
                                        while (true) {
                                            try {
                                                Object c2 = iVar.mo96258c();
                                                if (c2 == null) {
                                                    break;
                                                }
                                                vVar.onNext(c2);
                                                if (mo97958b()) {
                                                    return;
                                                }
                                            } catch (Throwable th) {
                                                C41300a.m119661b(th);
                                                aVar.mo97956a();
                                                this.f100069k.mo102034a(th);
                                                if (!mo97958b()) {
                                                    mo97962f(aVar);
                                                    i4++;
                                                    i2 = i5 + 1;
                                                    if (i2 != length) {
                                                    }
                                                } else {
                                                    return;
                                                }
                                            }
                                        }
                                    }
                                    boolean z2 = aVar.f100057f;
                                    C41740i iVar2 = aVar.f100058g;
                                    if (z2 && (iVar2 == null || iVar2.isEmpty())) {
                                        mo97962f(aVar);
                                        if (!mo97958b()) {
                                            i4++;
                                        } else {
                                            return;
                                        }
                                    }
                                    i2 = i5 + 1;
                                    if (i2 != length) {
                                        i7++;
                                    }
                                    i2 = 0;
                                    i7++;
                                } else {
                                    return;
                                }
                            }
                            this.f100075q = i5;
                            this.f100074p = aVarArr[i5].f100055d;
                        }
                        if (i4 == 0) {
                            i3 = addAndGet(-i3);
                            if (i3 == 0) {
                                return;
                            }
                        } else if (this.f100065g != Integer.MAX_VALUE) {
                            mo97964h(i4);
                        }
                    } else {
                        Throwable b = this.f100069k.mo102035b();
                        if (b == C43364i.f101206a) {
                            return;
                        }
                        if (b == null) {
                            vVar.onComplete();
                            return;
                        } else {
                            vVar.onError(b);
                            return;
                        }
                    }
                } else if (this.f100065g != Integer.MAX_VALUE) {
                    mo97964h(i4);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public void mo97962f(C42519a aVar) {
            C42519a[] aVarArr;
            C42519a[] aVarArr2;
            do {
                aVarArr = (C42519a[]) this.f100071m.get();
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
                            aVarArr2 = f100060t;
                        } else {
                            C42519a[] aVarArr3 = new C42519a[(length - 1)];
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
            } while (!C1612n.m5659a(this.f100071m, aVarArr, aVarArr2));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public void mo97963g(C40754t tVar) {
            boolean z;
            while (tVar instanceof Callable) {
                if (mo97966k((Callable) tVar) && this.f100065g != Integer.MAX_VALUE) {
                    synchronized (this) {
                        tVar = (C40754t) this.f100076r.poll();
                        if (tVar == null) {
                            z = true;
                            this.f100077s--;
                        } else {
                            z = false;
                        }
                    }
                    if (z) {
                        mo97960d();
                        return;
                    }
                } else {
                    return;
                }
            }
            long j = this.f100073o;
            this.f100073o = 1 + j;
            C42519a aVar = new C42519a(this, j);
            if (mo97957a(aVar)) {
                tVar.mo95016c(aVar);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public void mo97964h(int i) {
            while (true) {
                int i2 = i - 1;
                if (i != 0) {
                    synchronized (this) {
                        C40754t tVar = (C40754t) this.f100076r.poll();
                        if (tVar == null) {
                            this.f100077s--;
                        } else {
                            mo97963g(tVar);
                        }
                    }
                    i = i2;
                } else {
                    return;
                }
            }
            while (true) {
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public void mo97965i(Object obj, C42519a aVar) {
            if (get() != 0 || !compareAndSet(0, 1)) {
                C41740i iVar = aVar.f100058g;
                if (iVar == null) {
                    iVar = new C43063b(this.f100066h);
                    aVar.f100058g = iVar;
                }
                iVar.mo96261f(obj);
                if (getAndIncrement() != 0) {
                    return;
                }
            } else {
                this.f100062d.onNext(obj);
                if (decrementAndGet() == 0) {
                    return;
                }
            }
            mo97961e();
        }

        public boolean isDisposed() {
            return this.f100070l;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public boolean mo97966k(Callable callable) {
            try {
                Object call = callable.call();
                if (call == null) {
                    return true;
                }
                if (get() != 0 || !compareAndSet(0, 1)) {
                    C41739h hVar = this.f100067i;
                    if (hVar == null) {
                        if (this.f100065g == Integer.MAX_VALUE) {
                            hVar = new C43063b(this.f100066h);
                        } else {
                            hVar = new C43062a(this.f100065g);
                        }
                        this.f100067i = hVar;
                    }
                    if (!hVar.mo96261f(call)) {
                        onError(new IllegalStateException("Scalar queue full?!"));
                        return true;
                    } else if (getAndIncrement() != 0) {
                        return false;
                    }
                } else {
                    this.f100062d.onNext(call);
                    if (decrementAndGet() == 0) {
                        return true;
                    }
                }
                mo97961e();
                return true;
            } catch (Throwable th) {
                C41300a.m119661b(th);
                this.f100069k.mo102034a(th);
                mo97960d();
                return true;
            }
        }

        public void onComplete() {
            if (!this.f100068j) {
                this.f100068j = true;
                mo97960d();
            }
        }

        public void onError(Throwable th) {
            if (this.f100068j) {
                C40293a.m116722s(th);
            } else if (this.f100069k.mo102034a(th)) {
                this.f100068j = true;
                mo97960d();
            } else {
                C40293a.m116722s(th);
            }
        }

        public void onNext(Object obj) {
            if (!this.f100068j) {
                try {
                    C40754t tVar = (C40754t) C41692b.m120934e(this.f100063e.apply(obj), "The mapper returned a null ObservableSource");
                    if (this.f100065g != Integer.MAX_VALUE) {
                        synchronized (this) {
                            int i = this.f100077s;
                            if (i == this.f100065g) {
                                this.f100076r.offer(tVar);
                                return;
                            }
                            this.f100077s = i + 1;
                        }
                    }
                    mo97963g(tVar);
                } catch (Throwable th) {
                    C41300a.m119661b(th);
                    this.f100072n.dispose();
                    onError(th);
                }
            }
        }

        public void onSubscribe(C41205b bVar) {
            if (C41498c.m120378l(this.f100072n, bVar)) {
                this.f100072n = bVar;
                this.f100062d.onSubscribe(this);
            }
        }
    }

    public C42518u(C40754t tVar, C41405l lVar, boolean z, int i, int i2) {
        super(tVar);
        this.f100051e = lVar;
        this.f100052f = z;
        this.f100053g = i;
        this.f100054h = i2;
    }

    /* renamed from: I0 */
    public void mo94344I0(C40756v vVar) {
        if (!C42528v0.m123158b(this.f99678d, vVar, this.f100051e)) {
            this.f99678d.mo95016c(new C42520b(vVar, this.f100051e, this.f100052f, this.f100053g, this.f100054h));
        }
    }
}
