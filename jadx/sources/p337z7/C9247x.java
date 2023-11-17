package p337z7;

import java.util.concurrent.Executor;

/* renamed from: z7.x */
final class C9247x implements C9220c0 {

    /* renamed from: a */
    private final Executor f25694a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Object f25695b = new Object();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C9221d f25696c;

    public C9247x(Executor executor, C9221d dVar) {
        this.f25694a = executor;
        this.f25696c = dVar;
    }

    /* renamed from: c */
    public final void mo24877c(Task task) {
        if (!task.mo24873r() && !task.mo24871p()) {
            synchronized (this.f25695b) {
                if (this.f25696c != null) {
                    this.f25694a.execute(new C9246w(this, task));
                }
            }
        }
    }

    /* renamed from: s */
    public final void mo24878s() {
        synchronized (this.f25695b) {
            this.f25696c = null;
        }
    }
}
