package p337z7;

import java.util.concurrent.Executor;

/* renamed from: z7.r */
final class C9241r implements C9223e, C9221d, C9217b, C9220c0 {

    /* renamed from: a */
    private final Executor f25680a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C9215a f25681b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C9230h0 f25682c;

    public C9241r(Executor executor, C9215a aVar, C9230h0 h0Var) {
        this.f25680a = executor;
        this.f25681b = aVar;
        this.f25682c = h0Var;
    }

    /* renamed from: a */
    public final void mo17635a(Object obj) {
        this.f25682c.mo24890v(obj);
    }

    /* renamed from: b */
    public final void mo18086b() {
        this.f25682c.mo24891w();
    }

    /* renamed from: c */
    public final void mo24877c(Task task) {
        this.f25680a.execute(new C9240q(this, task));
    }

    public final void onFailure(Exception exc) {
        this.f25682c.mo24889u(exc);
    }

    /* renamed from: s */
    public final void mo24878s() {
        throw new UnsupportedOperationException();
    }
}
