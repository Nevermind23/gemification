package p337z7;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import p170m7.C7140a;

/* renamed from: z7.f0 */
final class C9226f0 implements Executor {

    /* renamed from: d */
    private final Handler f25650d = new C7140a(Looper.getMainLooper());

    public final void execute(Runnable runnable) {
        this.f25650d.post(runnable);
    }
}
