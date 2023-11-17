package p273u6;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import p092g7.C6254e;

/* renamed from: u6.a */
public class C8637a implements Executor {

    /* renamed from: d */
    private final Handler f24405d;

    public C8637a(Looper looper) {
        this.f24405d = new C6254e(looper);
    }

    public final void execute(Runnable runnable) {
        this.f24405d.post(runnable);
    }
}
