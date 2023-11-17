package androidx.core.graphics;

import android.graphics.Paint;

/* renamed from: androidx.core.graphics.e */
public abstract class C0853e {

    /* renamed from: a */
    private static final ThreadLocal f3493a = new ThreadLocal();

    /* renamed from: androidx.core.graphics.e$a */
    static class C0854a {
        /* renamed from: a */
        static boolean m3193a(Paint paint, String str) {
            return paint.hasGlyph(str);
        }
    }

    /* renamed from: a */
    public static boolean m3192a(Paint paint, String str) {
        return C0854a.m3193a(paint, str);
    }
}
