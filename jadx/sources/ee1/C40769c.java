package ee1;

import ae1.C40293a;
import androidx.lifecycle.C1612n;
import ed1.C40756v;
import hd1.C41205b;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import ld1.C41692b;
import yd1.C43367k;

/* renamed from: ee1.c */
public final class C40769c extends C40776f {

    /* renamed from: g */
    static final C40771b[] f96486g = new C40771b[0];

    /* renamed from: h */
    static final C40771b[] f96487h = new C40771b[0];

    /* renamed from: i */
    private static final Object[] f96488i = new Object[0];

    /* renamed from: d */
    final C40770a f96489d;

    /* renamed from: e */
    final AtomicReference f96490e = new AtomicReference(f96486g);

    /* renamed from: f */
    boolean f96491f;

    /* renamed from: ee1.c$a */
    interface C40770a {
        /* renamed from: a */
        void mo95116a(Object obj);

        void add(Object obj);

        /* renamed from: b */
        void mo95118b(C40771b bVar);

        boolean compareAndSet(Object obj, Object obj2);
    }

    /* renamed from: ee1.c$b */
    static final class C40771b extends AtomicInteger implements C41205b {
        private static final long serialVersionUID = 466549804534799122L;

        /* renamed from: d */
        final C40756v f96492d;

        /* renamed from: e */
        final C40769c f96493e;

        /* renamed from: f */
        Object f96494f;

        /* renamed from: g */
        volatile boolean f96495g;

        C40771b(C40756v vVar, C40769c cVar) {
            this.f96492d = vVar;
            this.f96493e = cVar;
        }

        public void dispose() {
            if (!this.f96495g) {
                this.f96495g = true;
                this.f96493e.mo95114i1(this);
            }
        }

        public boolean isDisposed() {
            return this.f96495g;
        }
    }

    /* renamed from: ee1.c$c */
    static final class C40772c extends AtomicReference implements C40770a {
        private static final long serialVersionUID = -733876083048047795L;

        /* renamed from: d */
        final List f96496d;

        /* renamed from: e */
        volatile boolean f96497e;

        /* renamed from: f */
        volatile int f96498f;

        C40772c(int i) {
            this.f96496d = new ArrayList(C41692b.m120935f(i, "capacityHint"));
        }

        /* renamed from: a */
        public void mo95116a(Object obj) {
            this.f96496d.add(obj);
            mo95120c();
            this.f96498f++;
            this.f96497e = true;
        }

        public void add(Object obj) {
            this.f96496d.add(obj);
            this.f96498f++;
        }

        /* renamed from: b */
        public void mo95118b(C40771b bVar) {
            int i;
            int i2;
            if (bVar.getAndIncrement() == 0) {
                List list = this.f96496d;
                C40756v vVar = bVar.f96492d;
                Integer num = (Integer) bVar.f96494f;
                if (num != null) {
                    i = num.intValue();
                } else {
                    i = 0;
                    bVar.f96494f = 0;
                }
                int i3 = 1;
                while (!bVar.f96495g) {
                    int i4 = this.f96498f;
                    while (i4 != i) {
                        if (bVar.f96495g) {
                            bVar.f96494f = null;
                            return;
                        }
                        Object obj = list.get(i);
                        if (this.f96497e && (i2 = i + 1) == i4 && i2 == (i4 = this.f96498f)) {
                            if (C43367k.m124427n(obj)) {
                                vVar.onComplete();
                            } else {
                                vVar.onError(C43367k.m124425h(obj));
                            }
                            bVar.f96494f = null;
                            bVar.f96495g = true;
                            return;
                        }
                        vVar.onNext(obj);
                        i++;
                    }
                    if (i == this.f96498f) {
                        bVar.f96494f = Integer.valueOf(i);
                        i3 = bVar.addAndGet(-i3);
                        if (i3 == 0) {
                            return;
                        }
                    }
                }
                bVar.f96494f = null;
            }
        }

        /* renamed from: c */
        public void mo95120c() {
        }
    }

    C40769c(C40770a aVar) {
        this.f96489d = aVar;
    }

    /* renamed from: h1 */
    public static C40769c m118217h1() {
        return new C40769c(new C40772c(16));
    }

    /* access modifiers changed from: protected */
    /* renamed from: I0 */
    public void mo94344I0(C40756v vVar) {
        C40771b bVar = new C40771b(vVar, this);
        vVar.onSubscribe(bVar);
        if (bVar.f96495g) {
            return;
        }
        if (!mo95113g1(bVar) || !bVar.f96495g) {
            this.f96489d.mo95118b(bVar);
        } else {
            mo95114i1(bVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g1 */
    public boolean mo95113g1(C40771b bVar) {
        C40771b[] bVarArr;
        C40771b[] bVarArr2;
        do {
            bVarArr = (C40771b[]) this.f96490e.get();
            if (bVarArr == f96487h) {
                return false;
            }
            int length = bVarArr.length;
            bVarArr2 = new C40771b[(length + 1)];
            System.arraycopy(bVarArr, 0, bVarArr2, 0, length);
            bVarArr2[length] = bVar;
        } while (!C1612n.m5659a(this.f96490e, bVarArr, bVarArr2));
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i1 */
    public void mo95114i1(C40771b bVar) {
        C40771b[] bVarArr;
        C40771b[] bVarArr2;
        do {
            bVarArr = (C40771b[]) this.f96490e.get();
            if (bVarArr != f96487h && bVarArr != f96486g) {
                int length = bVarArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        i = -1;
                        break;
                    } else if (bVarArr[i] == bVar) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i >= 0) {
                    if (length == 1) {
                        bVarArr2 = f96486g;
                    } else {
                        C40771b[] bVarArr3 = new C40771b[(length - 1)];
                        System.arraycopy(bVarArr, 0, bVarArr3, 0, i);
                        System.arraycopy(bVarArr, i + 1, bVarArr3, i, (length - i) - 1);
                        bVarArr2 = bVarArr3;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        } while (!C1612n.m5659a(this.f96490e, bVarArr, bVarArr2));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j1 */
    public C40771b[] mo95115j1(Object obj) {
        if (this.f96489d.compareAndSet((Object) null, obj)) {
            return (C40771b[]) this.f96490e.getAndSet(f96487h);
        }
        return f96487h;
    }

    public void onComplete() {
        if (!this.f96491f) {
            this.f96491f = true;
            Object e = C43367k.m124422e();
            C40770a aVar = this.f96489d;
            aVar.mo95116a(e);
            for (C40771b b : mo95115j1(e)) {
                aVar.mo95118b(b);
            }
        }
    }

    public void onError(Throwable th) {
        C41692b.m120934e(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f96491f) {
            C40293a.m116722s(th);
            return;
        }
        this.f96491f = true;
        Object g = C43367k.m124424g(th);
        C40770a aVar = this.f96489d;
        aVar.mo95116a(g);
        for (C40771b b : mo95115j1(g)) {
            aVar.mo95118b(b);
        }
    }

    public void onNext(Object obj) {
        C41692b.m120934e(obj, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!this.f96491f) {
            C40770a aVar = this.f96489d;
            aVar.add(obj);
            for (C40771b b : (C40771b[]) this.f96490e.get()) {
                aVar.mo95118b(b);
            }
        }
    }

    public void onSubscribe(C41205b bVar) {
        if (this.f96491f) {
            bVar.dispose();
        }
    }
}
