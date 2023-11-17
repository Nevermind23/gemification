package kotlinx.coroutines.internal;

import androidx.concurrent.futures.C0611b;
import ef1.C40782b0;
import ef1.C40793d0;
import ef1.C40832l0;
import ef1.C40834l2;
import ef1.C40839n;
import ef1.C40843o;
import ef1.C40861s0;
import ef1.C40882y0;
import ef1.C40884z;
import he1.C41238w;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C41536l;
import me1.C41752f;
import oe1.C41854e;
import ue1.C43075l;

/* renamed from: kotlinx.coroutines.internal.f */
public final class C41596f extends C40861s0 implements C41854e, Continuation {

    /* renamed from: k */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f97787k = AtomicReferenceFieldUpdater.newUpdater(C41596f.class, Object.class, "_reusableCancellableContinuation");
    private volatile /* synthetic */ Object _reusableCancellableContinuation = null;

    /* renamed from: g */
    public final C40793d0 f97788g;

    /* renamed from: h */
    public final Continuation f97789h;

    /* renamed from: i */
    public Object f97790i = C41598g.f97795a;

    /* renamed from: j */
    public final Object f97791j = C41592e0.m120648b(mo94380b());

    public C41596f(C40793d0 d0Var, Continuation continuation) {
        super(-1);
        this.f97788g = d0Var;
        this.f97789h = continuation;
    }

    /* renamed from: o */
    private final C40843o m120653o() {
        Object obj = this._reusableCancellableContinuation;
        if (obj instanceof C40843o) {
            return (C40843o) obj;
        }
        return null;
    }

    /* renamed from: a */
    public void mo95198a(Object obj, Throwable th) {
        if (obj instanceof C40884z) {
            ((C40884z) obj).f96607b.invoke(th);
        }
    }

    /* renamed from: b */
    public C41752f mo94380b() {
        return this.f97789h.mo94380b();
    }

    /* renamed from: c */
    public Continuation mo95199c() {
        return this;
    }

    /* renamed from: g */
    public C41854e mo95202g() {
        Continuation continuation = this.f97789h;
        if (continuation instanceof C41854e) {
            return (C41854e) continuation;
        }
        return null;
    }

    /* renamed from: h */
    public void mo94382h(Object obj) {
        C41752f b;
        Object c;
        C41752f b2 = this.f97789h.mo94380b();
        Object d = C40782b0.m118255d(obj, (C43075l) null, 1, (Object) null);
        if (this.f97788g.mo95149i(b2)) {
            this.f97790i = d;
            this.f96571f = 0;
            this.f97788g.mo95148h(b2, this);
            return;
        }
        C40882y0 b3 = C40834l2.f96545a.mo95178b();
        if (b3.mo95273p0()) {
            this.f97790i = d;
            this.f96571f = 0;
            b3.mo95270h0(this);
            return;
        }
        b3.mo95272n0(true);
        try {
            b = mo94380b();
            c = C41592e0.m120649c(b, this.f97791j);
            this.f97789h.mo94382h(obj);
            C41238w wVar = C41238w.f97225a;
            C41592e0.m120647a(b, c);
            do {
            } while (b3.mo95276x0());
        } catch (Throwable th) {
            try {
                mo95224j(th, (Throwable) null);
            } catch (Throwable th2) {
                b3.mo95269Q(true);
                throw th2;
            }
        }
        b3.mo95269Q(true);
    }

    /* renamed from: k */
    public Object mo95203k() {
        Object obj = this.f97790i;
        this.f97790i = C41598g.f97795a;
        return obj;
    }

    /* renamed from: m */
    public final void mo96364m() {
        do {
        } while (this._reusableCancellableContinuation == C41598g.f97796b);
    }

    /* renamed from: n */
    public final C40843o mo96365n() {
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            if (obj == null) {
                this._reusableCancellableContinuation = C41598g.f97796b;
                return null;
            } else if (obj instanceof C40843o) {
                if (C0611b.m2366a(f97787k, this, obj, C41598g.f97796b)) {
                    return (C40843o) obj;
                }
            } else if (obj != C41598g.f97796b && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
    }

    /* renamed from: p */
    public final boolean mo96366p() {
        return this._reusableCancellableContinuation != null;
    }

    /* renamed from: q */
    public final boolean mo96367q(Throwable th) {
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            C41584a0 a0Var = C41598g.f97796b;
            if (C41536l.m120484d(obj, a0Var)) {
                if (C0611b.m2366a(f97787k, this, a0Var, th)) {
                    return true;
                }
            } else if (obj instanceof Throwable) {
                return true;
            } else {
                if (C0611b.m2366a(f97787k, this, obj, (Object) null)) {
                    return false;
                }
            }
        }
    }

    /* renamed from: s */
    public final void mo96368s() {
        mo96364m();
        C40843o o = m120653o();
        if (o != null) {
            o.mo95206s();
        }
    }

    /* renamed from: t */
    public final Throwable mo96369t(C40839n nVar) {
        C41584a0 a0Var;
        do {
            Object obj = this._reusableCancellableContinuation;
            a0Var = C41598g.f97796b;
            if (obj != a0Var) {
                if (!(obj instanceof Throwable)) {
                    throw new IllegalStateException(("Inconsistent state " + obj).toString());
                } else if (C0611b.m2366a(f97787k, this, obj, (Object) null)) {
                    return (Throwable) obj;
                } else {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
            }
        } while (!C0611b.m2366a(f97787k, this, a0Var, nVar));
        return null;
    }

    public String toString() {
        return "DispatchedContinuation[" + this.f97788g + ", " + C40832l0.m118331c(this.f97789h) + ']';
    }
}
