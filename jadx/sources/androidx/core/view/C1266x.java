package androidx.core.view;

import android.graphics.Rect;
import android.view.Gravity;

/* renamed from: androidx.core.view.x */
public abstract class C1266x {

    /* renamed from: androidx.core.view.x$a */
    static class C1267a {
        /* renamed from: a */
        static void m4407a(int i, int i2, int i3, Rect rect, int i4, int i5, Rect rect2, int i6) {
            Gravity.apply(i, i2, i3, rect, i4, i5, rect2, i6);
        }

        /* renamed from: b */
        static void m4408b(int i, int i2, int i3, Rect rect, Rect rect2, int i4) {
            Gravity.apply(i, i2, i3, rect, rect2, i4);
        }

        /* renamed from: c */
        static void m4409c(int i, Rect rect, Rect rect2, int i2) {
            Gravity.applyDisplay(i, rect, rect2, i2);
        }
    }

    /* renamed from: a */
    public static void m4405a(int i, int i2, int i3, Rect rect, Rect rect2, int i4) {
        C1267a.m4408b(i, i2, i3, rect, rect2, i4);
    }

    /* renamed from: b */
    public static int m4406b(int i, int i2) {
        return Gravity.getAbsoluteGravity(i, i2);
    }
}
