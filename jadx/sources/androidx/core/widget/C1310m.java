package androidx.core.widget;

import android.view.View;
import android.widget.PopupWindow;

/* renamed from: androidx.core.widget.m */
public abstract class C1310m {

    /* renamed from: androidx.core.widget.m$a */
    static class C1311a {
        /* renamed from: a */
        static void m4545a(PopupWindow popupWindow, View view, int i, int i2, int i3) {
            popupWindow.showAsDropDown(view, i, i2, i3);
        }
    }

    /* renamed from: androidx.core.widget.m$b */
    static class C1312b {
        /* renamed from: a */
        static boolean m4546a(PopupWindow popupWindow) {
            return popupWindow.getOverlapAnchor();
        }

        /* renamed from: b */
        static int m4547b(PopupWindow popupWindow) {
            return popupWindow.getWindowLayoutType();
        }

        /* renamed from: c */
        static void m4548c(PopupWindow popupWindow, boolean z) {
            popupWindow.setOverlapAnchor(z);
        }

        /* renamed from: d */
        static void m4549d(PopupWindow popupWindow, int i) {
            popupWindow.setWindowLayoutType(i);
        }
    }

    /* renamed from: a */
    public static void m4542a(PopupWindow popupWindow, boolean z) {
        C1312b.m4548c(popupWindow, z);
    }

    /* renamed from: b */
    public static void m4543b(PopupWindow popupWindow, int i) {
        C1312b.m4549d(popupWindow, i);
    }

    /* renamed from: c */
    public static void m4544c(PopupWindow popupWindow, View view, int i, int i2, int i3) {
        C1311a.m4545a(popupWindow, view, i, i2, i3);
    }
}
