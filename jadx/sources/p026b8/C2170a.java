package p026b8;

import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import p124j0.C6632a;
import p124j0.C6633b;
import p124j0.C6634c;

/* renamed from: b8.a */
public abstract class C2170a {

    /* renamed from: a */
    public static final TimeInterpolator f6350a = new LinearInterpolator();

    /* renamed from: b */
    public static final TimeInterpolator f6351b = new C6633b();

    /* renamed from: c */
    public static final TimeInterpolator f6352c = new C6632a();

    /* renamed from: d */
    public static final TimeInterpolator f6353d = new C6634c();

    /* renamed from: e */
    public static final TimeInterpolator f6354e = new DecelerateInterpolator();

    /* renamed from: a */
    public static float m8290a(float f, float f2, float f3) {
        return f + (f3 * (f2 - f));
    }

    /* renamed from: b */
    public static float m8291b(float f, float f2, float f3, float f4, float f5) {
        return f5 < f3 ? f : f5 > f4 ? f2 : m8290a(f, f2, (f5 - f3) / (f4 - f3));
    }

    /* renamed from: c */
    public static int m8292c(int i, int i2, float f) {
        return i + Math.round(f * ((float) (i2 - i)));
    }
}
