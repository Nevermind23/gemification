package p089g4;

import android.os.SystemClock;

/* renamed from: g4.g */
public abstract class C6218g {

    /* renamed from: a */
    private static final double f19233a = (1.0d / Math.pow(10.0d, 6.0d));

    /* renamed from: a */
    public static double m24713a(long j) {
        return ((double) (m24714b() - j)) * f19233a;
    }

    /* renamed from: b */
    public static long m24714b() {
        return SystemClock.elapsedRealtimeNanos();
    }
}
