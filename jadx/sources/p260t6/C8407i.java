package p260t6;

import android.os.SystemClock;

/* renamed from: t6.i */
public class C8407i implements C8404f {

    /* renamed from: a */
    private static final C8407i f23851a = new C8407i();

    private C8407i() {
    }

    /* renamed from: d */
    public static C8404f m31544d() {
        return f23851a;
    }

    /* renamed from: a */
    public final long mo23594a() {
        return System.currentTimeMillis();
    }

    /* renamed from: b */
    public final long mo23595b() {
        return System.nanoTime();
    }

    /* renamed from: c */
    public final long mo23596c() {
        return SystemClock.elapsedRealtime();
    }
}
