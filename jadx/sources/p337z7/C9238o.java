package p337z7;

import com.google.android.gms.tasks.RuntimeExecutionException;

/* renamed from: z7.o */
final class C9238o implements Runnable {

    /* renamed from: d */
    final /* synthetic */ Task f25673d;

    /* renamed from: e */
    final /* synthetic */ C9239p f25674e;

    C9238o(C9239p pVar, Task task) {
        this.f25674e = pVar;
        this.f25673d = task;
    }

    public final void run() {
        if (this.f25673d.mo24871p()) {
            this.f25674e.f25677c.mo24891w();
            return;
        }
        try {
            this.f25674e.f25677c.mo24890v(this.f25674e.f25676b.mo17447a(this.f25673d));
        } catch (RuntimeExecutionException e) {
            if (e.getCause() instanceof Exception) {
                this.f25674e.f25677c.mo24889u((Exception) e.getCause());
            } else {
                this.f25674e.f25677c.mo24889u(e);
            }
        } catch (Exception e2) {
            this.f25674e.f25677c.mo24889u(e2);
        }
    }
}
