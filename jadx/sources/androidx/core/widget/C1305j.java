package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.widget.ImageView;

/* renamed from: androidx.core.widget.j */
public abstract class C1305j {

    /* renamed from: androidx.core.widget.j$a */
    static class C1306a {
        /* renamed from: a */
        static ColorStateList m4531a(ImageView imageView) {
            return imageView.getImageTintList();
        }

        /* renamed from: b */
        static PorterDuff.Mode m4532b(ImageView imageView) {
            return imageView.getImageTintMode();
        }

        /* renamed from: c */
        static void m4533c(ImageView imageView, ColorStateList colorStateList) {
            imageView.setImageTintList(colorStateList);
        }

        /* renamed from: d */
        static void m4534d(ImageView imageView, PorterDuff.Mode mode) {
            imageView.setImageTintMode(mode);
        }
    }

    /* renamed from: a */
    public static ColorStateList m4527a(ImageView imageView) {
        return C1306a.m4531a(imageView);
    }

    /* renamed from: b */
    public static PorterDuff.Mode m4528b(ImageView imageView) {
        return C1306a.m4532b(imageView);
    }

    /* renamed from: c */
    public static void m4529c(ImageView imageView, ColorStateList colorStateList) {
        C1306a.m4533c(imageView, colorStateList);
    }

    /* renamed from: d */
    public static void m4530d(ImageView imageView, PorterDuff.Mode mode) {
        C1306a.m4534d(imageView, mode);
    }
}
