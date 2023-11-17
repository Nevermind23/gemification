package p182n6;

import android.os.Looper;
import android.util.Log;

/* renamed from: n6.b */
public abstract class C7247b {
    /* renamed from: a */
    public static void m27852a(String str) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            String valueOf = String.valueOf(Thread.currentThread());
            String valueOf2 = String.valueOf(Looper.getMainLooper().getThread());
            Log.e("Asserts", "checkMainThread: current thread " + valueOf + " IS NOT the main thread " + valueOf2 + "!");
            throw new IllegalStateException(str);
        }
    }

    /* renamed from: b */
    public static void m27853b(String str) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            String valueOf = String.valueOf(Thread.currentThread());
            String valueOf2 = String.valueOf(Looper.getMainLooper().getThread());
            Log.e("Asserts", "checkNotMainThread: current thread " + valueOf + " IS the main thread " + valueOf2 + "!");
            throw new IllegalStateException(str);
        }
    }
}
