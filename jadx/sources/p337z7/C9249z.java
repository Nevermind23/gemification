package p337z7;

import java.util.concurrent.Executor;

/* renamed from: z7.z */
final class C9249z implements C9220c0 {

    /* renamed from: a */
    private final Executor f25699a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Object f25700b = new Object();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C9223e f25701c;

    public C9249z(Executor executor, C9223e eVar) {
        this.f25699a = executor;
        this.f25701c = eVar;
    }

    /* renamed from: c */
    public final void mo24877c(Task task) {
        if (task.mo24873r()) {
            synchronized (this.f25700b) {
                if (this.f25701c != null) {
                    this.f25699a.execute(new C9248y(this, task));
                }
            }
        }
    }

    /* renamed from: s */
    public final void mo24878s() {
        synchronized (this.f25700b) {
            this.f25701c = null;
        }
    }
}
