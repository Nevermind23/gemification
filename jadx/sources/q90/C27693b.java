package q90;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* renamed from: q90.b */
public class C27693b {

    /* renamed from: a */
    private final Executor f70807a;

    /* renamed from: b */
    private final Executor f70808b;

    /* renamed from: q90.b$a */
    private static class C27694a implements Executor {

        /* renamed from: d */
        private final Handler f70809d;

        public void execute(Runnable runnable) {
            this.f70809d.post(runnable);
        }

        private C27694a() {
            this.f70809d = new Handler(Looper.getMainLooper());
        }
    }

    C27693b(Executor executor, Executor executor2) {
        this.f70807a = executor;
        this.f70808b = executor2;
    }

    public C27693b() {
        this(Executors.newCachedThreadPool(), new C27694a());
    }
}
