package androidx.core.view.animation;

import android.graphics.Path;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;

/* renamed from: androidx.core.view.animation.a */
public abstract class C1109a {

    /* renamed from: androidx.core.view.animation.a$a */
    static class C1110a {
        /* renamed from: a */
        static PathInterpolator m4121a(float f, float f2) {
            return new PathInterpolator(f, f2);
        }

        /* renamed from: b */
        static PathInterpolator m4122b(float f, float f2, float f3, float f4) {
            return new PathInterpolator(f, f2, f3, f4);
        }

        /* renamed from: c */
        static PathInterpolator m4123c(Path path) {
            return new PathInterpolator(path);
        }
    }

    /* renamed from: a */
    public static Interpolator m4119a(float f, float f2, float f3, float f4) {
        return C1110a.m4122b(f, f2, f3, f4);
    }

    /* renamed from: b */
    public static Interpolator m4120b(Path path) {
        return C1110a.m4123c(path);
    }
}
