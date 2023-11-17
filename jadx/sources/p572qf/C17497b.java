package p572qf;

import android.os.Looper;

/* renamed from: qf.b */
public abstract class C17497b {

    /* renamed from: a */
    private static Thread f49015a;

    /* renamed from: a */
    public static void m60997a() {
        if (!m60998b()) {
            throw new IllegalStateException("Must be called on the Main thread.");
        }
    }

    /* renamed from: b */
    public static boolean m60998b() {
        if (f49015a == null) {
            f49015a = Looper.getMainLooper().getThread();
        }
        if (Thread.currentThread() == f49015a) {
            return true;
        }
        return false;
    }
}
