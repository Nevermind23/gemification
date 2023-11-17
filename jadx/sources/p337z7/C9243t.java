package p337z7;

import java.util.concurrent.Executor;

/* renamed from: z7.t */
final class C9243t implements C9220c0 {

    /* renamed from: a */
    private final Executor f25684a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Object f25685b = new Object();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C9217b f25686c;

    public C9243t(Executor executor, C9217b bVar) {
        this.f25684a = executor;
        this.f25686c = bVar;
    }

    /* renamed from: c */
    public final void mo24877c(Task task) {
        if (task.mo24871p()) {
            synchronized (this.f25685b) {
                if (this.f25686c != null) {
                    this.f25684a.execute(new C9242s(this));
                }
            }
        }
    }

    /* renamed from: s */
    public final void mo24878s() {
        synchronized (this.f25685b) {
            this.f25686c = null;
        }
    }
}
