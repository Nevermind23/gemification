package ef1;

import androidx.concurrent.futures.C0611b;
import ef1.C40845o1;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CompletionHandlerException;
import kotlinx.coroutines.internal.C41584a0;
import kotlinx.coroutines.internal.C41596f;
import me1.C41752f;
import oe1.C41854e;
import ue1.C43075l;

/* renamed from: ef1.o */
public class C40843o extends C40861s0 implements C40839n, C41854e {

    /* renamed from: j */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f96556j;

    /* renamed from: k */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f96557k;
    private volatile /* synthetic */ int _decision = 0;
    private volatile /* synthetic */ Object _state = C40792d.f96518d;

    /* renamed from: g */
    private final Continuation f96558g;

    /* renamed from: h */
    private final C41752f f96559h;

    /* renamed from: i */
    private C40870v0 f96560i;

    static {
        Class<C40843o> cls = C40843o.class;
        f96556j = AtomicIntegerFieldUpdater.newUpdater(cls, "_decision");
        f96557k = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "_state");
    }

    public C40843o(Continuation continuation, int i) {
        super(i);
        this.f96558g = continuation;
        this.f96559h = continuation.mo94380b();
    }

    /* renamed from: A */
    private final String m118363A() {
        Object z = mo95210z();
        if (z instanceof C40784b2) {
            return "Active";
        }
        if (z instanceof C40857r) {
            return "Cancelled";
        }
        return "Completed";
    }

    /* renamed from: D */
    private final C40870v0 m118364D() {
        C40845o1 o1Var = (C40845o1) mo94380b().mo23736c(C40845o1.f96561d3);
        if (o1Var == null) {
            return null;
        }
        C40870v0 d = C40845o1.C40846a.m118417d(o1Var, true, false, new C40860s(this), 2, (Object) null);
        this.f96560i = d;
        return d;
    }

    /* renamed from: F */
    private final boolean m118365F() {
        return C40864t0.m118456c(this.f96571f) && ((C41596f) this.f96558g).mo96366p();
    }

    /* renamed from: G */
    private final C40831l m118366G(C43075l lVar) {
        return lVar instanceof C40831l ? (C40831l) lVar : new C40833l1(lVar);
    }

    /* renamed from: H */
    private final void m118367H(C43075l lVar, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + lVar + ", already has " + obj).toString());
    }

    /* renamed from: K */
    private final void m118368K() {
        C41596f fVar;
        Throwable t;
        Continuation continuation = this.f96558g;
        if (continuation instanceof C41596f) {
            fVar = (C41596f) continuation;
        } else {
            fVar = null;
        }
        if (fVar != null && (t = fVar.mo96369t(this)) != null) {
            mo95206s();
            mo95188r(t);
        }
    }

    /* renamed from: M */
    private final void m118369M(Object obj, int i, C43075l lVar) {
        Object obj2;
        do {
            obj2 = this._state;
            if (obj2 instanceof C40784b2) {
            } else {
                if (obj2 instanceof C40857r) {
                    C40857r rVar = (C40857r) obj2;
                    if (rVar.mo95222c()) {
                        if (lVar != null) {
                            mo95205p(lVar, rVar.f96602a);
                            return;
                        }
                        return;
                    }
                }
                m118375m(obj);
                throw new KotlinNothingValueException();
            }
        } while (!C0611b.m2366a(f96557k, this, obj2, m118371O((C40784b2) obj2, obj, i, lVar, (Object) null)));
        m118378t();
        m118379u(i);
    }

    /* renamed from: N */
    static /* synthetic */ void m118370N(C40843o oVar, Object obj, int i, C43075l lVar, int i2, Object obj2) {
        if (obj2 == null) {
            if ((i2 & 4) != 0) {
                lVar = null;
            }
            oVar.m118369M(obj, i, lVar);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeImpl");
    }

    /* renamed from: O */
    private final Object m118371O(C40784b2 b2Var, Object obj, int i, C43075l lVar, Object obj2) {
        C40831l lVar2;
        if (obj instanceof C40881y) {
            return obj;
        }
        if (!C40864t0.m118455b(i) && obj2 == null) {
            return obj;
        }
        if (lVar == null && ((!(b2Var instanceof C40831l) || (b2Var instanceof C40798e)) && obj2 == null)) {
            return obj;
        }
        if (b2Var instanceof C40831l) {
            lVar2 = (C40831l) b2Var;
        } else {
            lVar2 = null;
        }
        return new C40878x(obj, lVar2, lVar, obj2, (Throwable) null, 16, (DefaultConstructorMarker) null);
    }

    /* renamed from: P */
    private final boolean m118372P() {
        do {
            int i = this._decision;
            if (i != 0) {
                if (i == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f96556j.compareAndSet(this, 0, 2));
        return true;
    }

    /* renamed from: Q */
    private final C41584a0 m118373Q(Object obj, Object obj2, C43075l lVar) {
        Object obj3;
        do {
            obj3 = this._state;
            if (obj3 instanceof C40784b2) {
            } else if (!(obj3 instanceof C40878x) || obj2 == null || ((C40878x) obj3).f96597d != obj2) {
                return null;
            } else {
                return C40849p.f96564a;
            }
        } while (!C0611b.m2366a(f96557k, this, obj3, m118371O((C40784b2) obj3, obj, this.f96571f, lVar, obj2)));
        m118378t();
        return C40849p.f96564a;
    }

    /* renamed from: R */
    private final boolean m118374R() {
        do {
            int i = this._decision;
            if (i != 0) {
                if (i == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!f96556j.compareAndSet(this, 0, 1));
        return true;
    }

    /* renamed from: m */
    private final Void m118375m(Object obj) {
        throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
    }

    /* renamed from: o */
    private final void m118376o(C43075l lVar, Throwable th) {
        try {
            lVar.invoke(th);
        } catch (Throwable th2) {
            C41752f b = mo94380b();
            C40810g0.m118295a(b, new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    /* renamed from: q */
    private final boolean m118377q(Throwable th) {
        if (!m118365F()) {
            return false;
        }
        return ((C41596f) this.f96558g).mo96367q(th);
    }

    /* renamed from: t */
    private final void m118378t() {
        if (!m118365F()) {
            mo95206s();
        }
    }

    /* renamed from: u */
    private final void m118379u(int i) {
        if (!m118372P()) {
            C40864t0.m118454a(this, i);
        }
    }

    /* renamed from: B */
    public void mo95184B(Object obj) {
        m118379u(this.f96571f);
    }

    /* renamed from: C */
    public void mo95193C() {
        C40870v0 D = m118364D();
        if (D != null && mo95194E()) {
            D.dispose();
            this.f96560i = C40780a2.f96511d;
        }
    }

    /* renamed from: E */
    public boolean mo95194E() {
        return !(mo95210z() instanceof C40784b2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public String mo95195I() {
        return "CancellableContinuation";
    }

    /* renamed from: J */
    public final void mo95196J(Throwable th) {
        if (!m118377q(th)) {
            mo95188r(th);
            m118378t();
        }
    }

    /* renamed from: L */
    public final boolean mo95197L() {
        Object obj = this._state;
        if (!(obj instanceof C40878x) || ((C40878x) obj).f96597d == null) {
            this._decision = 0;
            this._state = C40792d.f96518d;
            return true;
        }
        mo95206s();
        return false;
    }

    /* renamed from: a */
    public void mo95198a(Object obj, Throwable th) {
        while (true) {
            Object obj2 = this._state;
            if (obj2 instanceof C40784b2) {
                throw new IllegalStateException("Not completed".toString());
            } else if (!(obj2 instanceof C40881y)) {
                if (obj2 instanceof C40878x) {
                    C40878x xVar = (C40878x) obj2;
                    if (!xVar.mo95259c()) {
                        if (C0611b.m2366a(f96557k, this, obj2, C40878x.m118570b(xVar, (Object) null, (C40831l) null, (C43075l) null, (Object) null, th, 15, (Object) null))) {
                            xVar.mo95260d(this, th);
                            return;
                        }
                    } else {
                        throw new IllegalStateException("Must be called at most once".toString());
                    }
                } else if (C0611b.m2366a(f96557k, this, obj2, new C40878x(obj2, (C40831l) null, (C43075l) null, (Object) null, th, 14, (DefaultConstructorMarker) null))) {
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    public C41752f mo94380b() {
        return this.f96559h;
    }

    /* renamed from: c */
    public final Continuation mo95199c() {
        return this.f96558g;
    }

    /* renamed from: d */
    public Throwable mo95200d(Object obj) {
        Throwable d = super.mo95200d(obj);
        if (d != null) {
            return d;
        }
        return null;
    }

    /* renamed from: e */
    public Object mo95185e(Object obj, Object obj2) {
        return m118373Q(obj, obj2, (C43075l) null);
    }

    /* renamed from: f */
    public Object mo95201f(Object obj) {
        return obj instanceof C40878x ? ((C40878x) obj).f96594a : obj;
    }

    /* renamed from: g */
    public C41854e mo95202g() {
        Continuation continuation = this.f96558g;
        if (continuation instanceof C41854e) {
            return (C41854e) continuation;
        }
        return null;
    }

    /* renamed from: h */
    public void mo94382h(Object obj) {
        m118370N(this, C40782b0.m118253b(obj, this), this.f96571f, (C43075l) null, 4, (Object) null);
    }

    /* renamed from: i */
    public void mo95186i(C43075l lVar) {
        C40831l G = m118366G(lVar);
        while (true) {
            Object obj = this._state;
            if (obj instanceof C40792d) {
                if (C0611b.m2366a(f96557k, this, obj, G)) {
                    return;
                }
            } else if (obj instanceof C40831l) {
                m118367H(lVar, obj);
            } else {
                boolean z = obj instanceof C40881y;
                if (z) {
                    C40881y yVar = (C40881y) obj;
                    if (!yVar.mo95266b()) {
                        m118367H(lVar, obj);
                    }
                    if (obj instanceof C40857r) {
                        Throwable th = null;
                        if (!z) {
                            yVar = null;
                        }
                        if (yVar != null) {
                            th = yVar.f96602a;
                        }
                        m118376o(lVar, th);
                        return;
                    }
                    return;
                } else if (obj instanceof C40878x) {
                    C40878x xVar = (C40878x) obj;
                    if (xVar.f96595b != null) {
                        m118367H(lVar, obj);
                    }
                    if (!(G instanceof C40798e)) {
                        if (xVar.mo95259c()) {
                            m118376o(lVar, xVar.f96598e);
                            return;
                        }
                        if (C0611b.m2366a(f96557k, this, obj, C40878x.m118570b(xVar, (Object) null, G, (C43075l) null, (Object) null, (Throwable) null, 29, (Object) null))) {
                            return;
                        }
                    } else {
                        return;
                    }
                } else if (!(G instanceof C40798e)) {
                    if (C0611b.m2366a(f96557k, this, obj, new C40878x(obj, G, (C43075l) null, (Object) null, (Throwable) null, 28, (DefaultConstructorMarker) null))) {
                        return;
                    }
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: k */
    public Object mo95203k() {
        return mo95210z();
    }

    /* renamed from: l */
    public void mo95187l(Object obj, C43075l lVar) {
        m118369M(obj, this.f96571f, lVar);
    }

    /* renamed from: n */
    public final void mo95204n(C40831l lVar, Throwable th) {
        try {
            lVar.mo95153a(th);
        } catch (Throwable th2) {
            C41752f b = mo94380b();
            C40810g0.m118295a(b, new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    /* renamed from: p */
    public final void mo95205p(C43075l lVar, Throwable th) {
        try {
            lVar.invoke(th);
        } catch (Throwable th2) {
            C41752f b = mo94380b();
            C40810g0.m118295a(b, new CompletionHandlerException("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    /* renamed from: r */
    public boolean mo95188r(Throwable th) {
        Object obj;
        boolean z;
        C40831l lVar;
        do {
            obj = this._state;
            if (!(obj instanceof C40784b2)) {
                return false;
            }
            z = obj instanceof C40831l;
        } while (!C0611b.m2366a(f96557k, this, obj, new C40857r(this, th, z)));
        if (z) {
            lVar = (C40831l) obj;
        } else {
            lVar = null;
        }
        if (lVar != null) {
            mo95204n(lVar, th);
        }
        m118378t();
        m118379u(this.f96571f);
        return true;
    }

    /* renamed from: s */
    public final void mo95206s() {
        C40870v0 v0Var = this.f96560i;
        if (v0Var != null) {
            v0Var.dispose();
            this.f96560i = C40780a2.f96511d;
        }
    }

    public String toString() {
        return mo95195I() + '(' + C40832l0.m118331c(this.f96558g) + "){" + m118363A() + "}@" + C40832l0.m118330b(this);
    }

    /* renamed from: v */
    public Throwable mo95208v(C40845o1 o1Var) {
        return o1Var.mo95212n();
    }

    /* renamed from: w */
    public void mo95189w(C40793d0 d0Var, Object obj) {
        C41596f fVar;
        int i;
        Continuation continuation = this.f96558g;
        C40793d0 d0Var2 = null;
        if (continuation instanceof C41596f) {
            fVar = (C41596f) continuation;
        } else {
            fVar = null;
        }
        if (fVar != null) {
            d0Var2 = fVar.f97788g;
        }
        if (d0Var2 == d0Var) {
            i = 4;
        } else {
            i = this.f96571f;
        }
        m118370N(this, obj, i, (C43075l) null, 4, (Object) null);
    }

    /* renamed from: x */
    public final Object mo95209x() {
        C40845o1 o1Var;
        boolean F = m118365F();
        if (m118374R()) {
            if (this.f96560i == null) {
                m118364D();
            }
            if (F) {
                m118368K();
            }
            return C41793d.m121157c();
        }
        if (F) {
            m118368K();
        }
        Object z = mo95210z();
        if (z instanceof C40881y) {
            throw ((C40881y) z).f96602a;
        } else if (!C40864t0.m118455b(this.f96571f) || (o1Var = (C40845o1) mo94380b().mo23736c(C40845o1.f96561d3)) == null || o1Var.mo95131k()) {
            return mo95201f(z);
        } else {
            CancellationException n = o1Var.mo95212n();
            mo95198a(z, n);
            throw n;
        }
    }

    /* renamed from: y */
    public Object mo95190y(Object obj, Object obj2, C43075l lVar) {
        return m118373Q(obj, obj2, lVar);
    }

    /* renamed from: z */
    public final Object mo95210z() {
        return this._state;
    }
}
