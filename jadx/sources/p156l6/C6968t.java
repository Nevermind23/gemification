package p156l6;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: l6.t */
public final /* synthetic */ class C6968t implements Executor {

    /* renamed from: d */
    public final /* synthetic */ Handler f20845d;

    public /* synthetic */ C6968t(Handler handler) {
        this.f20845d = handler;
    }

    public final void execute(Runnable runnable) {
        this.f20845d.post(runnable);
    }
}
