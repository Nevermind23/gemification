package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.InsetDrawable;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: androidx.core.graphics.drawable.a */
public abstract class C0836a {

    /* renamed from: androidx.core.graphics.drawable.a$a */
    static class C0837a {
        /* renamed from: a */
        static int m3157a(Drawable drawable) {
            return drawable.getAlpha();
        }

        /* renamed from: b */
        static Drawable m3158b(DrawableContainer.DrawableContainerState drawableContainerState, int i) {
            return drawableContainerState.getChild(i);
        }

        /* renamed from: c */
        static Drawable m3159c(InsetDrawable insetDrawable) {
            return insetDrawable.getDrawable();
        }

        /* renamed from: d */
        static boolean m3160d(Drawable drawable) {
            return drawable.isAutoMirrored();
        }

        /* renamed from: e */
        static void m3161e(Drawable drawable, boolean z) {
            drawable.setAutoMirrored(z);
        }
    }

    /* renamed from: androidx.core.graphics.drawable.a$b */
    static class C0838b {
        /* renamed from: a */
        static void m3162a(Drawable drawable, Resources.Theme theme) {
            drawable.applyTheme(theme);
        }

        /* renamed from: b */
        static boolean m3163b(Drawable drawable) {
            return drawable.canApplyTheme();
        }

        /* renamed from: c */
        static ColorFilter m3164c(Drawable drawable) {
            return drawable.getColorFilter();
        }

        /* renamed from: d */
        static void m3165d(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
        }

        /* renamed from: e */
        static void m3166e(Drawable drawable, float f, float f2) {
            drawable.setHotspot(f, f2);
        }

        /* renamed from: f */
        static void m3167f(Drawable drawable, int i, int i2, int i3, int i4) {
            drawable.setHotspotBounds(i, i2, i3, i4);
        }

        /* renamed from: g */
        static void m3168g(Drawable drawable, int i) {
            drawable.setTint(i);
        }

        /* renamed from: h */
        static void m3169h(Drawable drawable, ColorStateList colorStateList) {
            drawable.setTintList(colorStateList);
        }

        /* renamed from: i */
        static void m3170i(Drawable drawable, PorterDuff.Mode mode) {
            drawable.setTintMode(mode);
        }
    }

    /* renamed from: androidx.core.graphics.drawable.a$c */
    static class C0839c {
        /* renamed from: a */
        static int m3171a(Drawable drawable) {
            return drawable.getLayoutDirection();
        }

        /* renamed from: b */
        static boolean m3172b(Drawable drawable, int i) {
            return drawable.setLayoutDirection(i);
        }
    }

    /* renamed from: a */
    public static void m3139a(Drawable drawable, Resources.Theme theme) {
        C0838b.m3162a(drawable, theme);
    }

    /* renamed from: b */
    public static boolean m3140b(Drawable drawable) {
        return C0838b.m3163b(drawable);
    }

    /* renamed from: c */
    public static void m3141c(Drawable drawable) {
        drawable.clearColorFilter();
    }

    /* renamed from: d */
    public static int m3142d(Drawable drawable) {
        return C0837a.m3157a(drawable);
    }

    /* renamed from: e */
    public static ColorFilter m3143e(Drawable drawable) {
        return C0838b.m3164c(drawable);
    }

    /* renamed from: f */
    public static int m3144f(Drawable drawable) {
        return C0839c.m3171a(drawable);
    }

    /* renamed from: g */
    public static void m3145g(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        C0838b.m3165d(drawable, resources, xmlPullParser, attributeSet, theme);
    }

    /* renamed from: h */
    public static boolean m3146h(Drawable drawable) {
        return C0837a.m3160d(drawable);
    }

    /* renamed from: i */
    public static void m3147i(Drawable drawable) {
        drawable.jumpToCurrentState();
    }

    /* renamed from: j */
    public static void m3148j(Drawable drawable, boolean z) {
        C0837a.m3161e(drawable, z);
    }

    /* renamed from: k */
    public static void m3149k(Drawable drawable, float f, float f2) {
        C0838b.m3166e(drawable, f, f2);
    }

    /* renamed from: l */
    public static void m3150l(Drawable drawable, int i, int i2, int i3, int i4) {
        C0838b.m3167f(drawable, i, i2, i3, i4);
    }

    /* renamed from: m */
    public static boolean m3151m(Drawable drawable, int i) {
        return C0839c.m3172b(drawable, i);
    }

    /* renamed from: n */
    public static void m3152n(Drawable drawable, int i) {
        C0838b.m3168g(drawable, i);
    }

    /* renamed from: o */
    public static void m3153o(Drawable drawable, ColorStateList colorStateList) {
        C0838b.m3169h(drawable, colorStateList);
    }

    /* renamed from: p */
    public static void m3154p(Drawable drawable, PorterDuff.Mode mode) {
        C0838b.m3170i(drawable, mode);
    }

    /* renamed from: q */
    public static Drawable m3155q(Drawable drawable) {
        if (drawable instanceof C0852n) {
            return ((C0852n) drawable).mo3326a();
        }
        return drawable;
    }

    /* renamed from: r */
    public static Drawable m3156r(Drawable drawable) {
        return drawable;
    }
}
