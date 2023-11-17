package p337z7;

import android.app.Activity;
import com.google.android.gms.tasks.DuplicateTaskCompletionException;
import com.google.android.gms.tasks.RuntimeExecutionException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import p182n6.C7264i;

/* renamed from: z7.h0 */
final class C9230h0 extends Task {

    /* renamed from: a */
    private final Object f25655a = new Object();

    /* renamed from: b */
    private final C9222d0 f25656b = new C9222d0();

    /* renamed from: c */
    private boolean f25657c;

    /* renamed from: d */
    private volatile boolean f25658d;

    /* renamed from: e */
    private Object f25659e;

    /* renamed from: f */
    private Exception f25660f;

    C9230h0() {
    }

    /* renamed from: A */
    private final void m34078A() {
        if (this.f25658d) {
            throw new CancellationException("Task is already canceled.");
        }
    }

    /* renamed from: B */
    private final void m34079B() {
        if (this.f25657c) {
            throw DuplicateTaskCompletionException.m18560a(this);
        }
    }

    /* renamed from: C */
    private final void m34080C() {
        synchronized (this.f25655a) {
            if (this.f25657c) {
                this.f25656b.mo24880b(this);
            }
        }
    }

    /* renamed from: z */
    private final void m34081z() {
        C7264i.m27906o(this.f25657c, "Task is not yet complete");
    }

    /* renamed from: a */
    public final Task mo24856a(Executor executor, C9217b bVar) {
        this.f25656b.mo24879a(new C9243t(executor, bVar));
        m34080C();
        return this;
    }

    /* renamed from: b */
    public final Task mo24857b(Executor executor, C9219c cVar) {
        this.f25656b.mo24879a(new C9245v(executor, cVar));
        m34080C();
        return this;
    }

    /* renamed from: c */
    public final Task mo24858c(C9219c cVar) {
        this.f25656b.mo24879a(new C9245v(C9229h.f25653a, cVar));
        m34080C();
        return this;
    }

    /* renamed from: d */
    public final Task mo24859d(Activity activity, C9221d dVar) {
        C9247x xVar = new C9247x(C9229h.f25653a, dVar);
        this.f25656b.mo24879a(xVar);
        C9228g0.m34075l(activity).mo24888m(xVar);
        m34080C();
        return this;
    }

    /* renamed from: e */
    public final Task mo24860e(Executor executor, C9221d dVar) {
        this.f25656b.mo24879a(new C9247x(executor, dVar));
        m34080C();
        return this;
    }

    /* renamed from: f */
    public final Task mo24861f(C9221d dVar) {
        mo24860e(C9229h.f25653a, dVar);
        return this;
    }

    /* renamed from: g */
    public final Task mo24862g(Activity activity, C9223e eVar) {
        C9249z zVar = new C9249z(C9229h.f25653a, eVar);
        this.f25656b.mo24879a(zVar);
        C9228g0.m34075l(activity).mo24888m(zVar);
        m34080C();
        return this;
    }

    /* renamed from: h */
    public final Task mo24863h(Executor executor, C9223e eVar) {
        this.f25656b.mo24879a(new C9249z(executor, eVar));
        m34080C();
        return this;
    }

    /* renamed from: i */
    public final Task mo24864i(C9223e eVar) {
        mo24863h(C9229h.f25653a, eVar);
        return this;
    }

    /* renamed from: j */
    public final Task mo24865j(Executor executor, C9215a aVar) {
        C9230h0 h0Var = new C9230h0();
        this.f25656b.mo24879a(new C9239p(executor, aVar, h0Var));
        m34080C();
        return h0Var;
    }

    /* renamed from: k */
    public final Task mo24866k(C9215a aVar) {
        return mo24865j(C9229h.f25653a, aVar);
    }

    /* renamed from: l */
    public final Task mo24867l(Executor executor, C9215a aVar) {
        C9230h0 h0Var = new C9230h0();
        this.f25656b.mo24879a(new C9241r(executor, aVar, h0Var));
        m34080C();
        return h0Var;
    }

    /* renamed from: m */
    public final Exception mo24868m() {
        Exception exc;
        synchronized (this.f25655a) {
            exc = this.f25660f;
        }
        return exc;
    }

    /* renamed from: n */
    public final Object mo24869n() {
        Object obj;
        synchronized (this.f25655a) {
            m34081z();
            m34078A();
            Exception exc = this.f25660f;
            if (exc == null) {
                obj = this.f25659e;
            } else {
                throw new RuntimeExecutionException(exc);
            }
        }
        return obj;
    }

    /* renamed from: o */
    public final Object mo24870o(Class cls) {
        Object obj;
        synchronized (this.f25655a) {
            m34081z();
            m34078A();
            if (!cls.isInstance(this.f25660f)) {
                Exception exc = this.f25660f;
                if (exc == null) {
                    obj = this.f25659e;
                } else {
                    throw new RuntimeExecutionException(exc);
                }
            } else {
                throw ((Throwable) cls.cast(this.f25660f));
            }
        }
        return obj;
    }

    /* renamed from: p */
    public final boolean mo24871p() {
        return this.f25658d;
    }

    /* renamed from: q */
    public final boolean mo24872q() {
        boolean z;
        synchronized (this.f25655a) {
            z = this.f25657c;
        }
        return z;
    }

    /* renamed from: r */
    public final boolean mo24873r() {
        boolean z;
        synchronized (this.f25655a) {
            z = false;
            if (this.f25657c && !this.f25658d && this.f25660f == null) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: s */
    public final Task mo24874s(Executor executor, C9225f fVar) {
        C9230h0 h0Var = new C9230h0();
        this.f25656b.mo24879a(new C9218b0(executor, fVar, h0Var));
        m34080C();
        return h0Var;
    }

    /* renamed from: t */
    public final Task mo24875t(C9225f fVar) {
        Executor executor = C9229h.f25653a;
        C9230h0 h0Var = new C9230h0();
        this.f25656b.mo24879a(new C9218b0(executor, fVar, h0Var));
        m34080C();
        return h0Var;
    }

    /* renamed from: u */
    public final void mo24889u(Exception exc) {
        C7264i.m27903l(exc, "Exception must not be null");
        synchronized (this.f25655a) {
            m34079B();
            this.f25657c = true;
            this.f25660f = exc;
        }
        this.f25656b.mo24880b(this);
    }

    /* renamed from: v */
    public final void mo24890v(Object obj) {
        synchronized (this.f25655a) {
            m34079B();
            this.f25657c = true;
            this.f25659e = obj;
        }
        this.f25656b.mo24880b(this);
    }

    /* renamed from: w */
    public final boolean mo24891w() {
        synchronized (this.f25655a) {
            if (this.f25657c) {
                return false;
            }
            this.f25657c = true;
            this.f25658d = true;
            this.f25656b.mo24880b(this);
            return true;
        }
    }

    /* renamed from: x */
    public final boolean mo24892x(Exception exc) {
        C7264i.m27903l(exc, "Exception must not be null");
        synchronized (this.f25655a) {
            if (this.f25657c) {
                return false;
            }
            this.f25657c = true;
            this.f25660f = exc;
            this.f25656b.mo24880b(this);
            return true;
        }
    }

    /* renamed from: y */
    public final boolean mo24893y(Object obj) {
        synchronized (this.f25655a) {
            if (this.f25657c) {
                return false;
            }
            this.f25657c = true;
            this.f25659e = obj;
            this.f25656b.mo24880b(this);
            return true;
        }
    }
}
