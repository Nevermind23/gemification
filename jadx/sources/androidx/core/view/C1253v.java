package androidx.core.view;

import android.graphics.Rect;
import android.os.Build;
import android.view.DisplayCutout;
import androidx.core.util.C1002c;
import java.util.List;

/* renamed from: androidx.core.view.v */
public final class C1253v {

    /* renamed from: a */
    private final DisplayCutout f3826a;

    /* renamed from: androidx.core.view.v$a */
    static class C1254a {
        /* renamed from: a */
        static DisplayCutout m4371a(Rect rect, List<Rect> list) {
            C1247u.m4353a();
            return C1241t.m4344a(rect, list);
        }

        /* renamed from: b */
        static List<Rect> m4372b(DisplayCutout displayCutout) {
            return displayCutout.getBoundingRects();
        }

        /* renamed from: c */
        static int m4373c(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetBottom();
        }

        /* renamed from: d */
        static int m4374d(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetLeft();
        }

        /* renamed from: e */
        static int m4375e(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetRight();
        }

        /* renamed from: f */
        static int m4376f(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetTop();
        }
    }

    private C1253v(DisplayCutout displayCutout) {
        this.f3826a = displayCutout;
    }

    /* renamed from: e */
    static C1253v m4366e(DisplayCutout displayCutout) {
        if (displayCutout == null) {
            return null;
        }
        return new C1253v(displayCutout);
    }

    /* renamed from: a */
    public int mo3724a() {
        if (Build.VERSION.SDK_INT >= 28) {
            return C1254a.m4373c(this.f3826a);
        }
        return 0;
    }

    /* renamed from: b */
    public int mo3725b() {
        if (Build.VERSION.SDK_INT >= 28) {
            return C1254a.m4374d(this.f3826a);
        }
        return 0;
    }

    /* renamed from: c */
    public int mo3726c() {
        if (Build.VERSION.SDK_INT >= 28) {
            return C1254a.m4375e(this.f3826a);
        }
        return 0;
    }

    /* renamed from: d */
    public int mo3727d() {
        if (Build.VERSION.SDK_INT >= 28) {
            return C1254a.m4376f(this.f3826a);
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1253v.class != obj.getClass()) {
            return false;
        }
        return C1002c.m3509a(this.f3826a, ((C1253v) obj).f3826a);
    }

    public int hashCode() {
        DisplayCutout displayCutout = this.f3826a;
        if (displayCutout == null) {
            return 0;
        }
        return displayCutout.hashCode();
    }

    public String toString() {
        return "DisplayCutoutCompat{" + this.f3826a + "}";
    }
}
