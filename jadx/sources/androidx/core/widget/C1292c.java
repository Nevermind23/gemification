package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CheckedTextView;

/* renamed from: androidx.core.widget.c */
public abstract class C1292c {

    /* renamed from: androidx.core.widget.c$a */
    private static class C1293a {
        /* renamed from: a */
        static Drawable m4502a(CheckedTextView checkedTextView) {
            return checkedTextView.getCheckMarkDrawable();
        }
    }

    /* renamed from: androidx.core.widget.c$b */
    private static class C1294b {
        /* renamed from: a */
        static void m4503a(CheckedTextView checkedTextView, ColorStateList colorStateList) {
            checkedTextView.setCheckMarkTintList(colorStateList);
        }

        /* renamed from: b */
        static void m4504b(CheckedTextView checkedTextView, PorterDuff.Mode mode) {
            checkedTextView.setCheckMarkTintMode(mode);
        }
    }

    /* renamed from: a */
    public static Drawable m4499a(CheckedTextView checkedTextView) {
        return C1293a.m4502a(checkedTextView);
    }

    /* renamed from: b */
    public static void m4500b(CheckedTextView checkedTextView, ColorStateList colorStateList) {
        C1294b.m4503a(checkedTextView, colorStateList);
    }

    /* renamed from: c */
    public static void m4501c(CheckedTextView checkedTextView, PorterDuff.Mode mode) {
        C1294b.m4504b(checkedTextView, mode);
    }
}
