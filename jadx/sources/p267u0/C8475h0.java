package p267u0;

import he1.C41238w;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.C41536l;

/* renamed from: u0.h0 */
public final class C8475h0 implements Executor {

    /* renamed from: d */
    private final Executor f24093d;

    /* renamed from: e */
    private final ArrayDeque f24094e = new ArrayDeque();

    /* renamed from: f */
    private Runnable f24095f;

    /* renamed from: g */
    private final Object f24096g = new Object();

    public C8475h0(Executor executor) {
        C41536l.m120489i(executor, "executor");
        this.f24093d = executor;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final void m31760b(Runnable runnable, C8475h0 h0Var) {
        C41536l.m120489i(runnable, "$command");
        C41536l.m120489i(h0Var, "this$0");
        try {
            runnable.run();
        } finally {
            h0Var.mo23744c();
        }
    }

    /* renamed from: c */
    public final void mo23744c() {
        synchronized (this.f24096g) {
            Object poll = this.f24094e.poll();
            Runnable runnable = (Runnable) poll;
            this.f24095f = runnable;
            if (poll != null) {
                this.f24093d.execute(runnable);
            }
            C41238w wVar = C41238w.f97225a;
        }
    }

    public void execute(Runnable runnable) {
        C41536l.m120489i(runnable, "command");
        synchronized (this.f24096g) {
            this.f24094e.offer(new C8473g0(runnable, this));
            if (this.f24095f == null) {
                mo23744c();
            }
            C41238w wVar = C41238w.f97225a;
        }
    }
}
