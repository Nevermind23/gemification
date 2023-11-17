package gf1;

import androidx.concurrent.futures.C0611b;
import ef1.C40832l0;
import ef1.C40843o;
import ef1.C40849p;
import ef1.C40854q;
import he1.C41225n;
import he1.C41228o;
import he1.C41238w;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C41527d0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.internal.C41584a0;
import kotlinx.coroutines.internal.C41604j;
import kotlinx.coroutines.internal.C41608m;
import kotlinx.coroutines.internal.C41609n;
import kotlinx.coroutines.internal.C41610o;
import kotlinx.coroutines.internal.C41622v;
import kotlinx.coroutines.internal.UndeliveredElementException;
import oe1.C41857h;
import ue1.C43075l;

/* renamed from: gf1.c */
public abstract class C41092c implements C41119w {

    /* renamed from: f */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f97006f = AtomicReferenceFieldUpdater.newUpdater(C41092c.class, Object.class, "onCloseHandler");

    /* renamed from: d */
    protected final C43075l f97007d;

    /* renamed from: e */
    private final C41608m f97008e = new C41608m();
    private volatile /* synthetic */ Object onCloseHandler = null;

    /* renamed from: gf1.c$a */
    public static final class C41093a extends C41118v {

        /* renamed from: g */
        public final Object f97009g;

        public C41093a(Object obj) {
            this.f97009g = obj;
        }

        /* renamed from: A */
        public C41584a0 mo95528A(C41610o.C41612b bVar) {
            return C40849p.f96564a;
        }

        public String toString() {
            return "SendBuffered@" + C40832l0.m118330b(this) + '(' + this.f97009g + ')';
        }

        /* renamed from: x */
        public void mo95529x() {
        }

        /* renamed from: y */
        public Object mo95530y() {
            return this.f97009g;
        }

        /* renamed from: z */
        public void mo95531z(C41108l lVar) {
        }
    }

    /* renamed from: gf1.c$b */
    public static final class C41094b extends C41610o.C41611a {

        /* renamed from: d */
        final /* synthetic */ C41092c f97010d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C41094b(C41610o oVar, C41092c cVar) {
            super(oVar);
            this.f97010d = cVar;
        }

        /* renamed from: i */
        public Object mo95255g(C41610o oVar) {
            if (this.f97010d.mo95521p()) {
                return null;
            }
            return C41609n.m120712a();
        }
    }

    public C41092c(C43075l lVar) {
        this.f97007d = lVar;
    }

    /* renamed from: d */
    private final int m119098d() {
        C41608m mVar = this.f97008e;
        int i = 0;
        for (C41610o oVar = (C41610o) mVar.mo96392m(); !C41536l.m120484d(oVar, mVar); oVar = oVar.mo96393n()) {
            if (oVar instanceof C41610o) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: k */
    private final String m119099k() {
        String str;
        C41610o n = this.f97008e.mo96393n();
        if (n == this.f97008e) {
            return "EmptyQueue";
        }
        if (n instanceof C41108l) {
            str = n.toString();
        } else if (n instanceof C41114r) {
            str = "ReceiveQueued";
        } else if (n instanceof C41118v) {
            str = "SendQueued";
        } else {
            str = "UNEXPECTED:" + n;
        }
        C41610o o = this.f97008e.mo96394o();
        if (o == n) {
            return str;
        }
        String str2 = str + ",queueSize=" + m119098d();
        if (!(o instanceof C41108l)) {
            return str2;
        }
        return str2 + ",closedForSend=" + o;
    }

    /* renamed from: l */
    private final void m119100l(C41108l lVar) {
        C41114r rVar;
        Object b = C41604j.m120700b((Object) null, 1, (DefaultConstructorMarker) null);
        while (true) {
            C41610o o = lVar.mo96394o();
            if (o instanceof C41114r) {
                rVar = (C41114r) o;
            } else {
                rVar = null;
            }
            if (rVar == null) {
                break;
            } else if (!rVar.mo95552t()) {
                rVar.mo96395p();
            } else {
                b = C41604j.m120701c(b, rVar);
            }
        }
        if (b != null) {
            if (!(b instanceof ArrayList)) {
                ((C41114r) b).mo95510z(lVar);
            } else {
                ArrayList arrayList = (ArrayList) b;
                for (int size = arrayList.size() - 1; -1 < size; size--) {
                    ((C41114r) arrayList.get(size)).mo95510z(lVar);
                }
            }
        }
        mo95523s(lVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public final void m119101m(Continuation continuation, Object obj, C41108l lVar) {
        UndeliveredElementException d;
        m119100l(lVar);
        Throwable F = lVar.mo95547F();
        C43075l lVar2 = this.f97007d;
        if (lVar2 == null || (d = C41622v.m120770d(lVar2, obj, (UndeliveredElementException) null, 2, (Object) null)) == null) {
            C41225n.C41226a aVar = C41225n.f97210d;
            continuation.mo94382h(C41225n.m119478a(C41228o.m119482a(F)));
            return;
        }
        C41211b.m119461a(d, F);
        C41225n.C41226a aVar2 = C41225n.f97210d;
        continuation.mo94382h(C41225n.m119478a(C41228o.m119482a(d)));
    }

    /* renamed from: n */
    private final void m119102n(Throwable th) {
        C41584a0 a0Var;
        Object obj = this.onCloseHandler;
        if (obj != null && obj != (a0Var = C41091b.f97005f) && C0611b.m2366a(f97006f, this, obj, a0Var)) {
            ((C43075l) C41527d0.m120459f(obj, 1)).invoke(th);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public final boolean m119103q() {
        return !(this.f97008e.mo96393n() instanceof C41116t) && mo95521p();
    }

    /* renamed from: u */
    private final Object m119104u(Object obj, Continuation continuation) {
        C41118v vVar;
        C40843o b = C40854q.m118427b(C41790c.m121154b(continuation));
        while (true) {
            if (m119103q()) {
                if (this.f97007d == null) {
                    vVar = new C41121x(obj, b);
                } else {
                    vVar = new C41122y(obj, b, this.f97007d);
                }
                Object e = mo95515e(vVar);
                if (e == null) {
                    C40854q.m118428c(b, vVar);
                    break;
                } else if (e instanceof C41108l) {
                    m119101m(b, obj, (C41108l) e);
                    break;
                } else if (e != C41091b.f97004e && !(e instanceof C41114r)) {
                    throw new IllegalStateException(("enqueueSend returned " + e).toString());
                }
            }
            Object r = mo95522r(obj);
            if (r == C41091b.f97001b) {
                C41225n.C41226a aVar = C41225n.f97210d;
                b.mo94382h(C41225n.m119478a(C41238w.f97225a));
                break;
            } else if (r != C41091b.f97002c) {
                if (r instanceof C41108l) {
                    m119101m(b, obj, (C41108l) r);
                } else {
                    throw new IllegalStateException(("offerInternal returned " + r).toString());
                }
            }
        }
        Object x = b.mo95209x();
        if (x == C41793d.m121157c()) {
            C41857h.m121275c(continuation);
        }
        if (x == C41793d.m121157c()) {
            return x;
        }
        return C41238w.f97225a;
    }

    /* renamed from: A */
    public final Object mo95514A(Object obj, Continuation continuation) {
        if (mo95522r(obj) == C41091b.f97001b) {
            return C41238w.f97225a;
        }
        Object u = m119104u(obj, continuation);
        if (u == C41793d.m121157c()) {
            return u;
        }
        return C41238w.f97225a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public Object mo95515e(C41118v vVar) {
        boolean z;
        C41610o o;
        if (mo95520o()) {
            C41608m mVar = this.f97008e;
            do {
                o = mVar.mo96394o();
                if (o instanceof C41116t) {
                    return o;
                }
            } while (!o.mo96390f(vVar, mVar));
            return null;
        }
        C41608m mVar2 = this.f97008e;
        C41094b bVar = new C41094b(vVar, this);
        while (true) {
            C41610o o2 = mVar2.mo96394o();
            if (!(o2 instanceof C41116t)) {
                int w = o2.mo96398w(vVar, mVar2, bVar);
                z = true;
                if (w != 1) {
                    if (w == 2) {
                        z = false;
                        break;
                    }
                } else {
                    break;
                }
            } else {
                return o2;
            }
        }
        if (!z) {
            return C41091b.f97004e;
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public String mo95516f() {
        return "";
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final C41108l mo95517g() {
        C41610o n = this.f97008e.mo96393n();
        C41108l lVar = n instanceof C41108l ? (C41108l) n : null;
        if (lVar == null) {
            return null;
        }
        m119100l(lVar);
        return lVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final C41108l mo95518h() {
        C41610o o = this.f97008e.mo96394o();
        C41108l lVar = o instanceof C41108l ? (C41108l) o : null;
        if (lVar == null) {
            return null;
        }
        m119100l(lVar);
        return lVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final C41608m mo95519i() {
        return this.f97008e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public abstract boolean mo95520o();

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public abstract boolean mo95521p();

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public Object mo95522r(Object obj) {
        C41116t v;
        do {
            v = mo95506v();
            if (v == null) {
                return C41091b.f97002c;
            }
        } while (v.mo95509d(obj, (C41610o.C41612b) null) == null);
        v.mo95508c(obj);
        return v.mo95548a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public void mo95523s(C41610o oVar) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final C41116t mo95524t(Object obj) {
        C41610o o;
        C41608m mVar = this.f97008e;
        C41093a aVar = new C41093a(obj);
        do {
            o = mVar.mo96394o();
            if (o instanceof C41116t) {
                return (C41116t) o;
            }
        } while (!o.mo96390f(aVar, mVar));
        return null;
    }

    public String toString() {
        return C40832l0.m118329a(this) + '@' + C40832l0.m118330b(this) + '{' + m119099k() + '}' + mo95516f();
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public C41116t mo95506v() {
        C41610o oVar;
        C41610o u;
        C41608m mVar = this.f97008e;
        while (true) {
            oVar = (C41610o) mVar.mo96392m();
            if (oVar != mVar && (oVar instanceof C41116t)) {
                if (((((C41116t) oVar) instanceof C41108l) && !oVar.mo96388r()) || (u = oVar.mo96397u()) == null) {
                    break;
                }
                u.mo96396q();
            }
        }
        oVar = null;
        return (C41116t) oVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final C41118v mo95526w() {
        C41610o oVar;
        C41610o u;
        C41608m mVar = this.f97008e;
        while (true) {
            oVar = (C41610o) mVar.mo96392m();
            if (oVar != mVar && (oVar instanceof C41118v)) {
                if (((((C41118v) oVar) instanceof C41108l) && !oVar.mo96388r()) || (u = oVar.mo96397u()) == null) {
                    break;
                }
                u.mo96396q();
            }
        }
        oVar = null;
        return (C41118v) oVar;
    }

    /* renamed from: z */
    public boolean mo95527z(Throwable th) {
        boolean z;
        C41108l lVar = new C41108l(th);
        C41608m mVar = this.f97008e;
        while (true) {
            C41610o o = mVar.mo96394o();
            z = true;
            if (!(o instanceof C41108l)) {
                if (o.mo96390f(lVar, mVar)) {
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        if (!z) {
            lVar = (C41108l) this.f97008e.mo96394o();
        }
        m119100l(lVar);
        if (z) {
            m119102n(th);
        }
        return z;
    }
}
