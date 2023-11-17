package androidx.core.view;

import android.view.ViewGroup;

/* renamed from: androidx.core.view.e3 */
public abstract class C1145e3 {

    /* renamed from: androidx.core.view.e3$a */
    static class C1146a {
        /* renamed from: a */
        static int m4206a(ViewGroup viewGroup) {
            return viewGroup.getNestedScrollAxes();
        }

        /* renamed from: b */
        static boolean m4207b(ViewGroup viewGroup) {
            return viewGroup.isTransitionGroup();
        }

        /* renamed from: c */
        static void m4208c(ViewGroup viewGroup, boolean z) {
            viewGroup.setTransitionGroup(z);
        }
    }

    /* renamed from: a */
    public static boolean m4205a(ViewGroup viewGroup) {
        return C1146a.m4207b(viewGroup);
    }
}
