package androidx.appcompat.widget;

import android.os.Build;
import android.view.View;

/* renamed from: androidx.appcompat.widget.x1 */
public abstract class C0512x1 {

    /* renamed from: androidx.appcompat.widget.x1$a */
    static class C0513a {
        /* renamed from: a */
        static void m2057a(View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    /* renamed from: a */
    public static void m2056a(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            C0513a.m2057a(view, charSequence);
        } else {
            C0397a2.m1615h(view, charSequence);
        }
    }
}
