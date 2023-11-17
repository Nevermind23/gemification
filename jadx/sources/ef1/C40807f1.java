package ef1;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.internal.C41589d;
import me1.C41752f;

/* renamed from: ef1.f1 */
public final class C40807f1 extends C40801e1 implements C40844o0 {

    /* renamed from: g */
    private final Executor f96530g;

    public C40807f1(Executor executor) {
        this.f96530g = executor;
        C41589d.m120640a(mo95162e0());
    }

    /* renamed from: Q */
    private final void m118289Q(C41752f fVar, RejectedExecutionException rejectedExecutionException) {
        C40859r1.m118440c(fVar, C40796d1.m118280a("The task was rejected", rejectedExecutionException));
    }

    /* renamed from: f0 */
    private final ScheduledFuture m118290f0(ScheduledExecutorService scheduledExecutorService, Runnable runnable, C41752f fVar, long j) {
        try {
            return scheduledExecutorService.schedule(runnable, j, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
            m118289Q(fVar, e);
            return null;
        }
    }

    public void close() {
        Executor e0 = mo95162e0();
        ExecutorService executorService = e0 instanceof ExecutorService ? (ExecutorService) e0 : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    /* renamed from: e */
    public void mo95161e(long j, C40839n nVar) {
        ScheduledExecutorService scheduledExecutorService;
        Executor e0 = mo95162e0();
        ScheduledFuture scheduledFuture = null;
        if (e0 instanceof ScheduledExecutorService) {
            scheduledExecutorService = (ScheduledExecutorService) e0;
        } else {
            scheduledExecutorService = null;
        }
        if (scheduledExecutorService != null) {
            scheduledFuture = m118290f0(scheduledExecutorService, new C40808f2(this, nVar), nVar.mo94380b(), j);
        }
        if (scheduledFuture != null) {
            C40859r1.m118442e(nVar, scheduledFuture);
        } else {
            C40836m0.f96547k.mo95161e(j, nVar);
        }
    }

    /* renamed from: e0 */
    public Executor mo95162e0() {
        return this.f96530g;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C40807f1) && ((C40807f1) obj).mo95162e0() == mo95162e0();
    }

    /* renamed from: h */
    public void mo95148h(C41752f fVar, Runnable runnable) {
        try {
            Executor e0 = mo95162e0();
            C40785c.m118257a();
            e0.execute(runnable);
        } catch (RejectedExecutionException e) {
            C40785c.m118257a();
            m118289Q(fVar, e);
            C40867u0.m118468b().mo95148h(fVar, runnable);
        }
    }

    public int hashCode() {
        return System.identityHashCode(mo95162e0());
    }

    public String toString() {
        return mo95162e0().toString();
    }
}
