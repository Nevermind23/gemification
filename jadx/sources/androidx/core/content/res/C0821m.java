package androidx.core.content.res;

import com.github.mikephil.charting.utils.Utils;

/* renamed from: androidx.core.content.res.m */
final class C0821m {

    /* renamed from: k */
    static final C0821m f3452k = m3078k(C0796b.f3418c, (float) ((((double) C0796b.m2978h(50.0f)) * 63.66197723675813d) / 100.0d), 50.0f, 2.0f, false);

    /* renamed from: a */
    private final float f3453a;

    /* renamed from: b */
    private final float f3454b;

    /* renamed from: c */
    private final float f3455c;

    /* renamed from: d */
    private final float f3456d;

    /* renamed from: e */
    private final float f3457e;

    /* renamed from: f */
    private final float f3458f;

    /* renamed from: g */
    private final float[] f3459g;

    /* renamed from: h */
    private final float f3460h;

    /* renamed from: i */
    private final float f3461i;

    /* renamed from: j */
    private final float f3462j;

    private C0821m(float f, float f2, float f3, float f4, float f5, float f6, float[] fArr, float f7, float f8, float f9) {
        this.f3458f = f;
        this.f3453a = f2;
        this.f3454b = f3;
        this.f3455c = f4;
        this.f3456d = f5;
        this.f3457e = f6;
        this.f3459g = fArr;
        this.f3460h = f7;
        this.f3461i = f8;
        this.f3462j = f9;
    }

    /* renamed from: k */
    static C0821m m3078k(float[] fArr, float f, float f2, float f3, boolean z) {
        float f4;
        float f5;
        float f6 = f;
        float[][] fArr2 = C0796b.f3416a;
        float f7 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f8 = fArr[1];
        float f9 = fArr[2];
        float f12 = (fArr3[0] * f7) + (fArr3[1] * f8) + (fArr3[2] * f9);
        float[] fArr4 = fArr2[1];
        float f13 = (fArr4[0] * f7) + (fArr4[1] * f8) + (fArr4[2] * f9);
        float[] fArr5 = fArr2[2];
        float f14 = (f7 * fArr5[0]) + (f8 * fArr5[1]) + (f9 * fArr5[2]);
        float f15 = (f3 / 10.0f) + 0.8f;
        if (((double) f15) >= 0.9d) {
            f4 = C0796b.m2974d(0.59f, 0.69f, (f15 - 0.9f) * 10.0f);
        } else {
            f4 = C0796b.m2974d(0.525f, 0.59f, (f15 - 0.8f) * 10.0f);
        }
        float f16 = f4;
        if (z) {
            f5 = 1.0f;
        } else {
            f5 = (1.0f - (((float) Math.exp((double) (((-f6) - 42.0f) / 92.0f))) * 0.2777778f)) * f15;
        }
        double d = (double) f5;
        if (d > 1.0d) {
            f5 = 1.0f;
        } else if (d < Utils.DOUBLE_EPSILON) {
            f5 = Utils.FLOAT_EPSILON;
        }
        float[] fArr6 = {(((100.0f / f12) * f5) + 1.0f) - f5, (((100.0f / f13) * f5) + 1.0f) - f5, (((100.0f / f14) * f5) + 1.0f) - f5};
        float f17 = 1.0f / ((5.0f * f6) + 1.0f);
        float f18 = f17 * f17 * f17 * f17;
        float f19 = 1.0f - f18;
        float cbrt = (f18 * f6) + (0.1f * f19 * f19 * ((float) Math.cbrt(((double) f6) * 5.0d)));
        float h = C0796b.m2978h(f2) / fArr[1];
        double d2 = (double) h;
        float sqrt = ((float) Math.sqrt(d2)) + 1.48f;
        float pow = 0.725f / ((float) Math.pow(d2, 0.2d));
        float pow2 = (float) Math.pow(((double) ((fArr6[2] * cbrt) * f14)) / 100.0d, 0.42d);
        float[] fArr7 = {(float) Math.pow(((double) ((fArr6[0] * cbrt) * f12)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr6[1] * cbrt) * f13)) / 100.0d, 0.42d), pow2};
        float f22 = fArr7[0];
        float f23 = fArr7[1];
        return new C0821m(h, ((((f22 * 400.0f) / (f22 + 27.13f)) * 2.0f) + ((f23 * 400.0f) / (f23 + 27.13f)) + (((400.0f * pow2) / (pow2 + 27.13f)) * 0.05f)) * pow, pow, pow, f16, f15, fArr6, cbrt, (float) Math.pow((double) cbrt, 0.25d), sqrt);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public float mo3286a() {
        return this.f3453a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public float mo3287b() {
        return this.f3456d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public float mo3288c() {
        return this.f3460h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public float mo3289d() {
        return this.f3461i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public float mo3290e() {
        return this.f3458f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public float mo3291f() {
        return this.f3454b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public float mo3292g() {
        return this.f3457e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public float mo3293h() {
        return this.f3455c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public float[] mo3294i() {
        return this.f3459g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public float mo3295j() {
        return this.f3462j;
    }
}
