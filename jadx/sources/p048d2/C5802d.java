package p048d2;

/* renamed from: d2.d */
public abstract class C5802d {
    /* renamed from: a */
    private static float m23324a(float f) {
        return f <= 0.04045f ? f / 12.92f : (float) Math.pow((double) ((f + 0.055f) / 1.055f), 2.4000000953674316d);
    }

    /* renamed from: b */
    private static float m23325b(float f) {
        return f <= 0.0031308f ? f * 12.92f : (float) ((Math.pow((double) f, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }

    /* renamed from: c */
    public static int m23326c(float f, int i, int i2) {
        if (i == i2) {
            return i;
        }
        float f2 = ((float) ((i >> 24) & C11051p3.f31759c)) / 255.0f;
        float a = m23324a(((float) ((i >> 16) & C11051p3.f31759c)) / 255.0f);
        float a2 = m23324a(((float) ((i >> 8) & C11051p3.f31759c)) / 255.0f);
        float a3 = m23324a(((float) (i & C11051p3.f31759c)) / 255.0f);
        float a4 = m23324a(((float) ((i2 >> 16) & C11051p3.f31759c)) / 255.0f);
        float a5 = m23324a(((float) ((i2 >> 8) & C11051p3.f31759c)) / 255.0f);
        float a6 = a3 + (f * (m23324a(((float) (i2 & C11051p3.f31759c)) / 255.0f) - a3));
        return (Math.round(m23325b(a + ((a4 - a) * f)) * 255.0f) << 16) | (Math.round((f2 + (((((float) ((i2 >> 24) & C11051p3.f31759c)) / 255.0f) - f2) * f)) * 255.0f) << 24) | (Math.round(m23325b(a2 + ((a5 - a2) * f)) * 255.0f) << 8) | Math.round(m23325b(a6) * 255.0f);
    }
}
