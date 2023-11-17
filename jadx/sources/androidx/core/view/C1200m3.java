package androidx.core.view;

import android.os.Build;
import android.view.View;
import android.view.Window;

/* renamed from: androidx.core.view.m3 */
public abstract class C1200m3 {

    /* renamed from: androidx.core.view.m3$a */
    static class C1201a {
        /* renamed from: a */
        static void m4287a(Window window, boolean z) {
            int i;
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            if (z) {
                i = systemUiVisibility & -1793;
            } else {
                i = systemUiVisibility | 1792;
            }
            decorView.setSystemUiVisibility(i);
        }
    }

    /* renamed from: androidx.core.view.m3$b */
    static class C1202b {
        /* renamed from: a */
        static void m4288a(Window window, boolean z) {
            window.setDecorFitsSystemWindows(z);
        }
    }

    /* renamed from: a */
    public static WindowInsetsControllerCompat m4285a(Window window, View view) {
        return new WindowInsetsControllerCompat(window, view);
    }

    /* renamed from: b */
    public static void m4286b(Window window, boolean z) {
        if (Build.VERSION.SDK_INT >= 30) {
            C1202b.m4288a(window, z);
        } else {
            C1201a.m4287a(window, z);
        }
    }
}
