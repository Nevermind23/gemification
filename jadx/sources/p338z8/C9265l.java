package p338z8;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: z8.l */
public enum C9265l implements Executor {
    INSTANCE;
    

    /* renamed from: e */
    private static final Handler f25720e = null;

    static {
        f25720e = new Handler(Looper.getMainLooper());
    }

    public void execute(Runnable runnable) {
        f25720e.post(runnable);
    }
}
