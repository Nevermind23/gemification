package gf1;

import ef1.C40798e;
import ef1.C40832l0;
import ef1.C40839n;
import ef1.C40843o;
import ef1.C40849p;
import ef1.C40854q;
import he1.C41225n;
import he1.C41228o;
import he1.C41238w;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.internal.C41584a0;
import kotlinx.coroutines.internal.C41604j;
import kotlinx.coroutines.internal.C41608m;
import kotlinx.coroutines.internal.C41609n;
import kotlinx.coroutines.internal.C41610o;
import kotlinx.coroutines.internal.C41622v;
import oe1.C41853d;
import oe1.C41857h;
import ue1.C43075l;

/* renamed from: gf1.a */
public abstract class C41085a extends C41092c implements C41098f {

    /* renamed from: gf1.a$a */
    private static class C41086a extends C41114r {

        /* renamed from: g */
        public final C40839n f96991g;

        /* renamed from: h */
        public final int f96992h;

        public C41086a(C40839n nVar, int i) {
            this.f96991g = nVar;
            this.f96992h = i;
        }

        /* renamed from: A */
        public final Object mo95507A(Object obj) {
            if (this.f96992h == 1) {
                return C41102i.m119149a(C41102i.f97025b.mo95543b(obj));
            }
            return obj;
        }

        /* renamed from: c */
        public void mo95508c(Object obj) {
            this.f96991g.mo95184B(C40849p.f96564a);
        }

        /* renamed from: d */
        public C41584a0 mo95509d(Object obj, C41610o.C41612b bVar) {
            if (this.f96991g.mo95190y(mo95507A(obj), (Object) null, mo95511y(obj)) == null) {
                return null;
            }
            return C40849p.f96564a;
        }

        public String toString() {
            return "ReceiveElement@" + C40832l0.m118330b(this) + "[receiveMode=" + this.f96992h + ']';
        }

        /* renamed from: z */
        public void mo95510z(C41108l lVar) {
            if (this.f96992h == 1) {
                this.f96991g.mo94382h(C41225n.m119478a(C41102i.m119149a(C41102i.f97025b.mo95542a(lVar.f97029g))));
                return;
            }
            C40839n nVar = this.f96991g;
            C41225n.C41226a aVar = C41225n.f97210d;
            nVar.mo94382h(C41225n.m119478a(C41228o.m119482a(lVar.mo95546E())));
        }
    }

    /* renamed from: gf1.a$b */
    private static final class C41087b extends C41086a {

        /* renamed from: i */
        public final C43075l f96993i;

        public C41087b(C40839n nVar, int i, C43075l lVar) {
            super(nVar, i);
            this.f96993i = lVar;
        }

        /* renamed from: y */
        public C43075l mo95511y(Object obj) {
            return C41622v.m120767a(this.f96993i, obj, this.f96991g.mo94380b());
        }
    }

    /* renamed from: gf1.a$c */
    private final class C41088c extends C40798e {

        /* renamed from: d */
        private final C41114r f96994d;

        public C41088c(C41114r rVar) {
            this.f96994d = rVar;
        }

        /* renamed from: a */
        public void mo95153a(Throwable th) {
            if (this.f96994d.mo95552t()) {
                C41085a.this.mo95501J();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo95153a((Throwable) obj);
            return C41238w.f97225a;
        }

        public String toString() {
            return "RemoveReceiveOnCancel[" + this.f96994d + ']';
        }
    }

    /* renamed from: gf1.a$d */
    public static final class C41089d extends C41610o.C41611a {

        /* renamed from: d */
        final /* synthetic */ C41085a f96996d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C41089d(C41610o oVar, C41085a aVar) {
            super(oVar);
            this.f96996d = aVar;
        }

        /* renamed from: i */
        public Object mo95255g(C41610o oVar) {
            if (this.f96996d.mo95497F()) {
                return null;
            }
            return C41609n.m120712a();
        }
    }

    /* renamed from: gf1.a$e */
    static final class C41090e extends C41853d {

        /* renamed from: g */
        /* synthetic */ Object f96997g;

        /* renamed from: h */
        final /* synthetic */ C41085a f96998h;

        /* renamed from: i */
        int f96999i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41090e(C41085a aVar, Continuation continuation) {
            super(continuation);
            this.f96998h = aVar;
        }

        /* renamed from: f */
        public final Object mo3709f(Object obj) {
            this.f96997g = obj;
            this.f96999i |= Integer.MIN_VALUE;
            Object j = this.f96998h.mo95505j(this);
            return j == C41793d.m121157c() ? j : C41102i.m119149a(j);
        }
    }

    public C41085a(C43075l lVar) {
        super(lVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: C */
    public final boolean m119069C(C41114r rVar) {
        boolean D = mo95495D(rVar);
        if (D) {
            mo95502K();
        }
        return D;
    }

    /* renamed from: M */
    private final Object m119070M(int i, Continuation continuation) {
        C41086a aVar;
        C40843o b = C40854q.m118427b(C41790c.m121154b(continuation));
        if (this.f97007d == null) {
            aVar = new C41086a(b, i);
        } else {
            aVar = new C41087b(b, i, this.f97007d);
        }
        while (true) {
            if (!m119069C(aVar)) {
                Object L = mo95503L();
                if (!(L instanceof C41108l)) {
                    if (L != C41091b.f97003d) {
                        b.mo95187l(aVar.mo95507A(L), aVar.mo95511y(L));
                        break;
                    }
                } else {
                    aVar.mo95510z((C41108l) L);
                    break;
                }
            } else {
                m119071N(b, aVar);
                break;
            }
        }
        Object x = b.mo95209x();
        if (x == C41793d.m121157c()) {
            C41857h.m121275c(continuation);
        }
        return x;
    }

    /* access modifiers changed from: private */
    /* renamed from: N */
    public final void m119071N(C40839n nVar, C41114r rVar) {
        nVar.mo95186i(new C41088c(rVar));
    }

    /* renamed from: B */
    public final boolean mo95494B(Throwable th) {
        boolean z = mo95527z(th);
        mo95499H(z);
        return z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public boolean mo95495D(C41114r rVar) {
        int w;
        C41610o o;
        if (mo95496E()) {
            C41608m i = mo95519i();
            do {
                o = i.mo96394o();
                if (!(!(o instanceof C41118v))) {
                    return false;
                }
            } while (!o.mo96390f(rVar, i));
        } else {
            C41608m i2 = mo95519i();
            C41089d dVar = new C41089d(rVar, this);
            do {
                C41610o o2 = i2.mo96394o();
                if (!(!(o2 instanceof C41118v))) {
                    return false;
                }
                w = o2.mo96398w(rVar, i2, dVar);
                if (w != 1) {
                }
            } while (w != 2);
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public abstract boolean mo95496E();

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public abstract boolean mo95497F();

    /* renamed from: G */
    public boolean mo95498G() {
        return mo95517g() != null && mo95497F();
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public void mo95499H(boolean z) {
        C41108l h = mo95518h();
        if (h != null) {
            Object b = C41604j.m120700b((Object) null, 1, (DefaultConstructorMarker) null);
            while (true) {
                C41610o o = h.mo96394o();
                if (o instanceof C41608m) {
                    mo95500I(b, h);
                    return;
                } else if (!o.mo95552t()) {
                    o.mo96395p();
                } else {
                    b = C41604j.m120701c(b, (C41118v) o);
                }
            }
        } else {
            throw new IllegalStateException("Cannot happen".toString());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public void mo95500I(Object obj, C41108l lVar) {
        if (obj == null) {
            return;
        }
        if (!(obj instanceof ArrayList)) {
            ((C41118v) obj).mo95531z(lVar);
            return;
        }
        ArrayList arrayList = (ArrayList) obj;
        int size = arrayList.size();
        while (true) {
            size--;
            if (-1 < size) {
                ((C41118v) arrayList.get(size)).mo95531z(lVar);
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public void mo95501J() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public void mo95502K() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: L */
    public Object mo95503L() {
        while (true) {
            C41118v w = mo95526w();
            if (w == null) {
                return C41091b.f97003d;
            }
            if (w.mo95528A((C41610o.C41612b) null) != null) {
                w.mo95529x();
                return w.mo95530y();
            }
            w.mo95551B();
        }
    }

    /* renamed from: a */
    public final void mo95504a(CancellationException cancellationException) {
        if (!mo95498G()) {
            if (cancellationException == null) {
                cancellationException = new CancellationException(C40832l0.m118329a(this) + " was cancelled");
            }
            mo95494B(cancellationException);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo95505j(kotlin.coroutines.Continuation r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof gf1.C41085a.C41090e
            if (r0 == 0) goto L_0x0013
            r0 = r5
            gf1.a$e r0 = (gf1.C41085a.C41090e) r0
            int r1 = r0.f96999i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f96999i = r1
            goto L_0x0018
        L_0x0013:
            gf1.a$e r0 = new gf1.a$e
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.f96997g
            java.lang.Object r1 = ne1.C41793d.m121157c()
            int r2 = r0.f96999i
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            he1.C41228o.m119483b(r5)
            goto L_0x005b
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0031:
            he1.C41228o.m119483b(r5)
            java.lang.Object r5 = r4.mo95503L()
            kotlinx.coroutines.internal.a0 r2 = gf1.C41091b.f97003d
            if (r5 == r2) goto L_0x0052
            boolean r0 = r5 instanceof gf1.C41108l
            if (r0 == 0) goto L_0x004b
            gf1.i$b r0 = gf1.C41102i.f97025b
            gf1.l r5 = (gf1.C41108l) r5
            java.lang.Throwable r5 = r5.f97029g
            java.lang.Object r5 = r0.mo95542a(r5)
            goto L_0x0051
        L_0x004b:
            gf1.i$b r0 = gf1.C41102i.f97025b
            java.lang.Object r5 = r0.mo95543b(r5)
        L_0x0051:
            return r5
        L_0x0052:
            r0.f96999i = r3
            java.lang.Object r5 = r4.m119070M(r3, r0)
            if (r5 != r1) goto L_0x005b
            return r1
        L_0x005b:
            gf1.i r5 = (gf1.C41102i) r5
            java.lang.Object r5 = r5.mo95537i()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: gf1.C41085a.mo95505j(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public C41116t mo95506v() {
        C41116t v = super.mo95506v();
        if (v != null && !(v instanceof C41108l)) {
            mo95501J();
        }
        return v;
    }
}
