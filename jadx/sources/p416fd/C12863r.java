package p416fd;

import android.os.Looper;

/* renamed from: fd.r */
public abstract class C12863r {
    /* renamed from: a */
    public static void m48677a() {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("Must be called from the main thread.");
        }
    }
}
