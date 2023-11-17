package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;

/* renamed from: androidx.core.widget.d */
public abstract class C1295d {

    /* renamed from: androidx.core.widget.d$a */
    static class C1296a {
        /* renamed from: a */
        static ColorStateList m4510a(CompoundButton compoundButton) {
            return compoundButton.getButtonTintList();
        }

        /* renamed from: b */
        static PorterDuff.Mode m4511b(CompoundButton compoundButton) {
            return compoundButton.getButtonTintMode();
        }

        /* renamed from: c */
        static void m4512c(CompoundButton compoundButton, ColorStateList colorStateList) {
            compoundButton.setButtonTintList(colorStateList);
        }

        /* renamed from: d */
        static void m4513d(CompoundButton compoundButton, PorterDuff.Mode mode) {
            compoundButton.setButtonTintMode(mode);
        }
    }

    /* renamed from: androidx.core.widget.d$b */
    static class C1297b {
        /* renamed from: a */
        static Drawable m4514a(CompoundButton compoundButton) {
            return compoundButton.getButtonDrawable();
        }
    }

    /* renamed from: a */
    public static Drawable m4505a(CompoundButton compoundButton) {
        return C1297b.m4514a(compoundButton);
    }

    /* renamed from: b */
    public static ColorStateList m4506b(CompoundButton compoundButton) {
        return C1296a.m4510a(compoundButton);
    }

    /* renamed from: c */
    public static PorterDuff.Mode m4507c(CompoundButton compoundButton) {
        return C1296a.m4511b(compoundButton);
    }

    /* renamed from: d */
    public static void m4508d(CompoundButton compoundButton, ColorStateList colorStateList) {
        C1296a.m4512c(compoundButton, colorStateList);
    }

    /* renamed from: e */
    public static void m4509e(CompoundButton compoundButton, PorterDuff.Mode mode) {
        C1296a.m4513d(compoundButton, mode);
    }
}
