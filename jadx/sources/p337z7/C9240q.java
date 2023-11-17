package p337z7;

import com.google.android.gms.tasks.RuntimeExecutionException;
import java.util.concurrent.Executor;

/* renamed from: z7.q */
final class C9240q implements Runnable {

    /* renamed from: d */
    final /* synthetic */ Task f25678d;

    /* renamed from: e */
    final /* synthetic */ C9241r f25679e;

    C9240q(C9241r rVar, Task task) {
        this.f25679e = rVar;
        this.f25678d = task;
    }

    public final void run() {
        try {
            Task task = (Task) this.f25679e.f25681b.mo17447a(this.f25678d);
            if (task == null) {
                this.f25679e.onFailure(new NullPointerException("Continuation returned null"));
                return;
            }
            Executor executor = C9229h.f25654b;
            task.mo24863h(executor, this.f25679e);
            task.mo24860e(executor, this.f25679e);
            task.mo24856a(executor, this.f25679e);
        } catch (RuntimeExecutionException e) {
            if (e.getCause() instanceof Exception) {
                this.f25679e.f25682c.mo24889u((Exception) e.getCause());
            } else {
                this.f25679e.f25682c.mo24889u(e);
            }
        } catch (Exception e2) {
            this.f25679e.f25682c.mo24889u(e2);
        }
    }
}
