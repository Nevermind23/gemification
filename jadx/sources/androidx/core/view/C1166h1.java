package androidx.core.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Build;
import android.view.PointerIcon;

/* renamed from: androidx.core.view.h1 */
public final class C1166h1 {

    /* renamed from: a */
    private final PointerIcon f3821a;

    /* renamed from: androidx.core.view.h1$a */
    static class C1167a {
        /* renamed from: a */
        static PointerIcon m4236a(Bitmap bitmap, float f, float f2) {
            return PointerIcon.create(bitmap, f, f2);
        }

        /* renamed from: b */
        static PointerIcon m4237b(Context context, int i) {
            return PointerIcon.getSystemIcon(context, i);
        }

        /* renamed from: c */
        static PointerIcon m4238c(Resources resources, int i) {
            return PointerIcon.load(resources, i);
        }
    }

    private C1166h1(PointerIcon pointerIcon) {
        this.f3821a = pointerIcon;
    }

    /* renamed from: b */
    public static C1166h1 m4234b(Context context, int i) {
        if (Build.VERSION.SDK_INT >= 24) {
            return new C1166h1(C1167a.m4237b(context, i));
        }
        return new C1166h1((PointerIcon) null);
    }

    /* renamed from: a */
    public Object mo3716a() {
        return this.f3821a;
    }
}
