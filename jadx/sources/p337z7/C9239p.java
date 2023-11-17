package p337z7;

import java.util.concurrent.Executor;

/* renamed from: z7.p */
final class C9239p implements C9220c0 {

    /* renamed from: a */
    private final Executor f25675a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C9215a f25676b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C9230h0 f25677c;

    public C9239p(Executor executor, C9215a aVar, C9230h0 h0Var) {
        this.f25675a = executor;
        this.f25676b = aVar;
        this.f25677c = h0Var;
    }

    /* renamed from: c */
    public final void mo24877c(Task task) {
        this.f25675a.execute(new C9238o(this, task));
    }

    /* renamed from: s */
    public final void mo24878s() {
        throw new UnsupportedOperationException();
    }
}
