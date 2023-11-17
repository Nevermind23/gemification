package p126j2;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: j2.e */
public class C6687e implements Executor {

    /* renamed from: d */
    private final Handler f20218d = new Handler(Looper.getMainLooper());

    public void execute(Runnable runnable) {
        this.f20218d.post(runnable);
    }
}
