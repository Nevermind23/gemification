package p337z7;

import com.google.android.gms.tasks.RuntimeExecutionException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* renamed from: z7.a0 */
final class C9216a0 implements Runnable {

    /* renamed from: d */
    final /* synthetic */ Task f25642d;

    /* renamed from: e */
    final /* synthetic */ C9218b0 f25643e;

    C9216a0(C9218b0 b0Var, Task task) {
        this.f25643e = b0Var;
        this.f25642d = task;
    }

    public final void run() {
        try {
            Task a = this.f25643e.f25645b.mo17657a(this.f25642d.mo24869n());
            if (a == null) {
                this.f25643e.onFailure(new NullPointerException("Continuation returned null"));
                return;
            }
            Executor executor = C9229h.f25654b;
            a.mo24863h(executor, this.f25643e);
            a.mo24860e(executor, this.f25643e);
            a.mo24856a(executor, this.f25643e);
        } catch (RuntimeExecutionException e) {
            if (e.getCause() instanceof Exception) {
                this.f25643e.onFailure((Exception) e.getCause());
            } else {
                this.f25643e.onFailure(e);
            }
        } catch (CancellationException unused) {
            this.f25643e.mo18086b();
        } catch (Exception e2) {
            this.f25643e.onFailure(e2);
        }
    }
}
