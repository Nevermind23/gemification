package p273u6;

import android.os.Process;

/* renamed from: u6.d */
final class C8640d implements Runnable {

    /* renamed from: d */
    private final Runnable f24411d;

    public C8640d(Runnable runnable, int i) {
        this.f24411d = runnable;
    }

    public final void run() {
        Process.setThreadPriority(0);
        this.f24411d.run();
    }
}
