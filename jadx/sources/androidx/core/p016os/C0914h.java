package androidx.core.p016os;

import android.os.Handler;
import androidx.core.util.C1008h;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: androidx.core.os.h */
public abstract class C0914h {

    /* renamed from: androidx.core.os.h$a */
    private static class C0915a implements Executor {

        /* renamed from: d */
        private final Handler f3539d;

        C0915a(Handler handler) {
            this.f3539d = (Handler) C1008h.m3530g(handler);
        }

        public void execute(Runnable runnable) {
            if (!this.f3539d.post((Runnable) C1008h.m3530g(runnable))) {
                throw new RejectedExecutionException(this.f3539d + " is shutting down");
            }
        }
    }

    /* renamed from: a */
    public static Executor m3346a(Handler handler) {
        return new C0915a(handler);
    }
}
