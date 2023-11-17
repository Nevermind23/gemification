package p337z7;

import java.util.concurrent.Executor;

/* renamed from: z7.v */
final class C9245v implements C9220c0 {

    /* renamed from: a */
    private final Executor f25689a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Object f25690b = new Object();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C9219c f25691c;

    public C9245v(Executor executor, C9219c cVar) {
        this.f25689a = executor;
        this.f25691c = cVar;
    }

    /* renamed from: c */
    public final void mo24877c(Task task) {
        synchronized (this.f25690b) {
            if (this.f25691c != null) {
                this.f25689a.execute(new C9244u(this, task));
            }
        }
    }

    /* renamed from: s */
    public final void mo24878s() {
        synchronized (this.f25690b) {
            this.f25691c = null;
        }
    }
}
