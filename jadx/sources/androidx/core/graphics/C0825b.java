package androidx.core.graphics;

import android.graphics.Color;

/* renamed from: androidx.core.graphics.b */
public abstract class C0825b {

    /* renamed from: a */
    private static final ThreadLocal f3463a = new ThreadLocal();

    /* renamed from: a */
    public static void m3092a(int i, int i2, int i3, double[] dArr) {
        double d;
        double d2;
        double d3;
        double[] dArr2 = dArr;
        if (dArr2.length == 3) {
            double d4 = ((double) i) / 255.0d;
            if (d4 < 0.04045d) {
                d = d4 / 12.92d;
            } else {
                d = Math.pow((d4 + 0.055d) / 1.055d, 2.4d);
            }
            double d5 = ((double) i2) / 255.0d;
            if (d5 < 0.04045d) {
                d2 = d5 / 12.92d;
            } else {
                d2 = Math.pow((d5 + 0.055d) / 1.055d, 2.4d);
            }
            double d6 = ((double) i3) / 255.0d;
            if (d6 < 0.04045d) {
                d3 = d6 / 12.92d;
            } else {
                d3 = Math.pow((d6 + 0.055d) / 1.055d, 2.4d);
            }
            dArr2[0] = ((0.4124d * d) + (0.3576d * d2) + (0.1805d * d3)) * 100.0d;
            dArr2[1] = ((0.2126d * d) + (0.7152d * d2) + (0.0722d * d3)) * 100.0d;
            dArr2[2] = ((d * 0.0193d) + (d2 * 0.1192d) + (d3 * 0.9505d)) * 100.0d;
            return;
        }
        throw new IllegalArgumentException("outXyz must have a length of 3.");
    }

    /* renamed from: b */
    public static int m3093b(double d, double d2, double d3) {
        double d4;
        double d5;
        double d6;
        double d7 = (((3.2406d * d) + (-1.5372d * d2)) + (-0.4986d * d3)) / 100.0d;
        double d8 = (((-0.9689d * d) + (1.8758d * d2)) + (0.0415d * d3)) / 100.0d;
        double d9 = (((0.0557d * d) + (-0.204d * d2)) + (1.057d * d3)) / 100.0d;
        if (d7 > 0.0031308d) {
            d4 = (Math.pow(d7, 0.4166666666666667d) * 1.055d) - 0.055d;
        } else {
            d4 = d7 * 12.92d;
        }
        if (d8 > 0.0031308d) {
            d5 = (Math.pow(d8, 0.4166666666666667d) * 1.055d) - 0.055d;
        } else {
            d5 = d8 * 12.92d;
        }
        if (d9 > 0.0031308d) {
            d6 = (Math.pow(d9, 0.4166666666666667d) * 1.055d) - 0.055d;
        } else {
            d6 = d9 * 12.92d;
        }
        return Color.rgb(m3099h((int) Math.round(d4 * 255.0d), 0, C11051p3.f31759c), m3099h((int) Math.round(d5 * 255.0d), 0, C11051p3.f31759c), m3099h((int) Math.round(d6 * 255.0d), 0, C11051p3.f31759c));
    }

    /* renamed from: c */
    public static double m3094c(int i) {
        double[] i2 = m3100i();
        m3095d(i, i2);
        return i2[1] / 100.0d;
    }

    /* renamed from: d */
    public static void m3095d(int i, double[] dArr) {
        m3092a(Color.red(i), Color.green(i), Color.blue(i), dArr);
    }

    /* renamed from: e */
    private static int m3096e(int i, int i2) {
        return 255 - (((255 - i2) * (255 - i)) / C11051p3.f31759c);
    }

    /* renamed from: f */
    public static int m3097f(int i, int i2) {
        int alpha = Color.alpha(i2);
        int alpha2 = Color.alpha(i);
        int e = m3096e(alpha2, alpha);
        return Color.argb(e, m3098g(Color.red(i), alpha2, Color.red(i2), alpha, e), m3098g(Color.green(i), alpha2, Color.green(i2), alpha, e), m3098g(Color.blue(i), alpha2, Color.blue(i2), alpha, e));
    }

    /* renamed from: g */
    private static int m3098g(int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            return 0;
        }
        return (((i * C11051p3.f31759c) * i2) + ((i3 * i4) * (255 - i2))) / (i5 * C11051p3.f31759c);
    }

    /* renamed from: h */
    private static int m3099h(int i, int i2, int i3) {
        return i < i2 ? i2 : Math.min(i, i3);
    }

    /* renamed from: i */
    private static double[] m3100i() {
        ThreadLocal threadLocal = f3463a;
        double[] dArr = (double[]) threadLocal.get();
        if (dArr != null) {
            return dArr;
        }
        double[] dArr2 = new double[3];
        threadLocal.set(dArr2);
        return dArr2;
    }

    /* renamed from: j */
    public static int m3101j(int i, int i2) {
        if (i2 >= 0 && i2 <= 255) {
            return (i & 16777215) | (i2 << 24);
        }
        throw new IllegalArgumentException("alpha must be between 0 and 255.");
    }
}
