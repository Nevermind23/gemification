package p213pb;

import com.github.mikephil.charting.utils.Utils;

/* renamed from: pb.a */
public abstract class C7798a {
    /* renamed from: a */
    public static float m29507a(float f, float f2, float f3, float f4) {
        double d = (double) (f - f3);
        double d2 = (double) (f2 - f4);
        return (float) Math.sqrt((d * d) + (d2 * d2));
    }

    /* renamed from: b */
    public static float m29508b(int i, int i2, int i3, int i4) {
        double d = (double) (i - i3);
        double d2 = (double) (i2 - i4);
        return (float) Math.sqrt((d * d) + (d2 * d2));
    }

    /* renamed from: c */
    public static int m29509c(float f) {
        return (int) (f + (f < Utils.FLOAT_EPSILON ? -0.5f : 0.5f));
    }

    /* renamed from: d */
    public static int m29510d(int[] iArr) {
        int i = 0;
        for (int i2 : iArr) {
            i += i2;
        }
        return i;
    }
}
