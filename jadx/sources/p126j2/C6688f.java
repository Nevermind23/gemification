package p126j2;

import android.os.Process;
import java.util.concurrent.ThreadFactory;

/* renamed from: j2.f */
public class C6688f implements ThreadFactory {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final int f20219d;

    /* renamed from: j2.f$a */
    class C6689a implements Runnable {

        /* renamed from: d */
        final /* synthetic */ Runnable f20220d;

        C6689a(Runnable runnable) {
            this.f20220d = runnable;
        }

        public void run() {
            try {
                Process.setThreadPriority(C6688f.this.f20219d);
            } catch (Throwable unused) {
            }
            this.f20220d.run();
        }
    }

    public C6688f(int i) {
        this.f20219d = i;
    }

    public Thread newThread(Runnable runnable) {
        return new Thread(new C6689a(runnable));
    }
}
