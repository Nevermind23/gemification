package p337z7;

import java.util.concurrent.Executor;

/* renamed from: z7.b0 */
final class C9218b0 implements C9223e, C9221d, C9217b, C9220c0 {

    /* renamed from: a */
    private final Executor f25644a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C9225f f25645b;

    /* renamed from: c */
    private final C9230h0 f25646c;

    public C9218b0(Executor executor, C9225f fVar, C9230h0 h0Var) {
        this.f25644a = executor;
        this.f25645b = fVar;
        this.f25646c = h0Var;
    }

    /* renamed from: a */
    public final void mo17635a(Object obj) {
        this.f25646c.mo24890v(obj);
    }

    /* renamed from: b */
    public final void mo18086b() {
        this.f25646c.mo24891w();
    }

    /* renamed from: c */
    public final void mo24877c(Task task) {
        this.f25644a.execute(new C9216a0(this, task));
    }

    public final void onFailure(Exception exc) {
        this.f25646c.mo24889u(exc);
    }

    /* renamed from: s */
    public final void mo24878s() {
        throw new UnsupportedOperationException();
    }
}
