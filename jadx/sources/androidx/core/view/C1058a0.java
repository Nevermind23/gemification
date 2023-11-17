package androidx.core.view;

import android.view.ViewGroup;

/* renamed from: androidx.core.view.a0 */
public abstract class C1058a0 {

    /* renamed from: androidx.core.view.a0$a */
    static class C1059a {
        /* renamed from: a */
        static int m3954a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.getLayoutDirection();
        }

        /* renamed from: b */
        static int m3955b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.getMarginEnd();
        }

        /* renamed from: c */
        static int m3956c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.getMarginStart();
        }

        /* renamed from: d */
        static boolean m3957d(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.isMarginRelative();
        }

        /* renamed from: e */
        static void m3958e(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
            marginLayoutParams.resolveLayoutDirection(i);
        }

        /* renamed from: f */
        static void m3959f(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
            marginLayoutParams.setLayoutDirection(i);
        }

        /* renamed from: g */
        static void m3960g(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
            marginLayoutParams.setMarginEnd(i);
        }

        /* renamed from: h */
        static void m3961h(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
            marginLayoutParams.setMarginStart(i);
        }
    }

    /* renamed from: a */
    public static int m3950a(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return C1059a.m3955b(marginLayoutParams);
    }

    /* renamed from: b */
    public static int m3951b(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return C1059a.m3956c(marginLayoutParams);
    }

    /* renamed from: c */
    public static void m3952c(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        C1059a.m3960g(marginLayoutParams, i);
    }

    /* renamed from: d */
    public static void m3953d(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        C1059a.m3961h(marginLayoutParams, i);
    }
}
