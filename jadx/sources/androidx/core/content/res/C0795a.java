package androidx.core.content.res;

import androidx.core.graphics.C0825b;
import com.github.mikephil.charting.utils.Utils;

/* renamed from: androidx.core.content.res.a */
class C0795a {

    /* renamed from: a */
    private final float f3407a;

    /* renamed from: b */
    private final float f3408b;

    /* renamed from: c */
    private final float f3409c;

    /* renamed from: d */
    private final float f3410d;

    /* renamed from: e */
    private final float f3411e;

    /* renamed from: f */
    private final float f3412f;

    /* renamed from: g */
    private final float f3413g;

    /* renamed from: h */
    private final float f3414h;

    /* renamed from: i */
    private final float f3415i;

    C0795a(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        this.f3407a = f;
        this.f3408b = f2;
        this.f3409c = f3;
        this.f3410d = f4;
        this.f3411e = f5;
        this.f3412f = f6;
        this.f3413g = f7;
        this.f3414h = f8;
        this.f3415i = f9;
    }

    /* renamed from: b */
    private static C0795a m2955b(float f, float f2, float f3) {
        float f4 = 100.0f;
        float f5 = 1000.0f;
        float f6 = 0.0f;
        C0795a aVar = null;
        float f7 = 1000.0f;
        while (Math.abs(f6 - f4) > 0.01f) {
            float f8 = ((f4 - f6) / 2.0f) + f6;
            int p = m2958e(f8, f2, f).mo3261p();
            float b = C0796b.m2972b(p);
            float abs = Math.abs(f3 - b);
            if (abs < 0.2f) {
                C0795a c = m2956c(p);
                float a = c.mo3253a(m2958e(c.mo3258k(), c.mo3256i(), f));
                if (a <= 1.0f) {
                    aVar = c;
                    f5 = abs;
                    f7 = a;
                }
            }
            if (f5 == Utils.FLOAT_EPSILON && f7 == Utils.FLOAT_EPSILON) {
                break;
            } else if (b < f3) {
                f6 = f8;
            } else {
                f4 = f8;
            }
        }
        return aVar;
    }

    /* renamed from: c */
    static C0795a m2956c(int i) {
        return m2957d(i, C0821m.f3452k);
    }

    /* renamed from: d */
    static C0795a m2957d(int i, C0821m mVar) {
        float f;
        float[] f2 = C0796b.m2976f(i);
        float[][] fArr = C0796b.f3416a;
        float f3 = f2[0];
        float[] fArr2 = fArr[0];
        float f4 = f2[1];
        float f5 = f2[2];
        float f6 = (fArr2[0] * f3) + (fArr2[1] * f4) + (fArr2[2] * f5);
        float[] fArr3 = fArr[1];
        float f7 = (fArr3[0] * f3) + (fArr3[1] * f4) + (fArr3[2] * f5);
        float[] fArr4 = fArr[2];
        float f8 = (f3 * fArr4[0]) + (f4 * fArr4[1]) + (f5 * fArr4[2]);
        float f9 = mVar.mo3294i()[0] * f6;
        float f12 = mVar.mo3294i()[1] * f7;
        float f13 = mVar.mo3294i()[2] * f8;
        float pow = (float) Math.pow(((double) (mVar.mo3288c() * Math.abs(f9))) / 100.0d, 0.42d);
        float pow2 = (float) Math.pow(((double) (mVar.mo3288c() * Math.abs(f12))) / 100.0d, 0.42d);
        float pow3 = (float) Math.pow(((double) (mVar.mo3288c() * Math.abs(f13))) / 100.0d, 0.42d);
        float signum = ((Math.signum(f9) * 400.0f) * pow) / (pow + 27.13f);
        float signum2 = ((Math.signum(f12) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum3 = ((Math.signum(f13) * 400.0f) * pow3) / (pow3 + 27.13f);
        double d = (double) signum3;
        float f14 = ((float) (((((double) signum) * 11.0d) + (((double) signum2) * -12.0d)) + d)) / 11.0f;
        float f15 = ((float) (((double) (signum + signum2)) - (d * 2.0d))) / 9.0f;
        float f16 = signum2 * 20.0f;
        float f17 = (((signum * 20.0f) + f16) + (21.0f * signum3)) / 20.0f;
        float f18 = (((signum * 40.0f) + f16) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2((double) f15, (double) f14)) * 180.0f) / 3.1415927f;
        if (atan2 < Utils.FLOAT_EPSILON) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f19 = atan2;
        float f22 = (3.1415927f * f19) / 180.0f;
        float pow4 = ((float) Math.pow((double) ((f18 * mVar.mo3291f()) / mVar.mo3286a()), (double) (mVar.mo3287b() * mVar.mo3295j()))) * 100.0f;
        float d2 = mVar.mo3289d() * (4.0f / mVar.mo3287b()) * ((float) Math.sqrt((double) (pow4 / 100.0f))) * (mVar.mo3286a() + 4.0f);
        if (((double) f19) < 20.14d) {
            f = 360.0f + f19;
        } else {
            f = f19;
        }
        float pow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, (double) mVar.mo3290e()), 0.73d)) * ((float) Math.pow((double) ((((((((float) (Math.cos(((((double) f) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * mVar.mo3292g()) * mVar.mo3293h()) * ((float) Math.sqrt((double) ((f14 * f14) + (f15 * f15))))) / (f17 + 0.305f)), 0.9d));
        float sqrt = pow5 * ((float) Math.sqrt(((double) pow4) / 100.0d));
        float d3 = sqrt * mVar.mo3289d();
        float sqrt2 = ((float) Math.sqrt((double) ((pow5 * mVar.mo3287b()) / (mVar.mo3286a() + 4.0f)))) * 50.0f;
        float f23 = (1.7f * pow4) / ((0.007f * pow4) + 1.0f);
        float log = ((float) Math.log((double) ((0.0228f * d3) + 1.0f))) * 43.85965f;
        double d4 = (double) f22;
        return new C0795a(f19, sqrt, pow4, d2, d3, sqrt2, f23, log * ((float) Math.cos(d4)), log * ((float) Math.sin(d4)));
    }

    /* renamed from: e */
    private static C0795a m2958e(float f, float f2, float f3) {
        return m2959f(f, f2, f3, C0821m.f3452k);
    }

    /* renamed from: f */
    private static C0795a m2959f(float f, float f2, float f3, C0821m mVar) {
        float f4 = f;
        double d = ((double) f4) / 100.0d;
        float b = (4.0f / mVar.mo3287b()) * ((float) Math.sqrt(d)) * (mVar.mo3286a() + 4.0f) * mVar.mo3289d();
        float d2 = f2 * mVar.mo3289d();
        float sqrt = ((float) Math.sqrt((double) (((f2 / ((float) Math.sqrt(d))) * mVar.mo3287b()) / (mVar.mo3286a() + 4.0f)))) * 50.0f;
        float f5 = (1.7f * f4) / ((0.007f * f4) + 1.0f);
        float log = ((float) Math.log((((double) d2) * 0.0228d) + 1.0d)) * 43.85965f;
        double d3 = (double) ((3.1415927f * f3) / 180.0f);
        return new C0795a(f3, f2, f4, b, d2, sqrt, f5, log * ((float) Math.cos(d3)), log * ((float) Math.sin(d3)));
    }

    /* renamed from: m */
    static int m2960m(float f, float f2, float f3) {
        return m2961n(f, f2, f3, C0821m.f3452k);
    }

    /* renamed from: n */
    static int m2961n(float f, float f2, float f3, C0821m mVar) {
        float f4;
        if (((double) f2) < 1.0d || ((double) Math.round(f3)) <= Utils.DOUBLE_EPSILON || ((double) Math.round(f3)) >= 100.0d) {
            return C0796b.m2971a(f3);
        }
        if (f < Utils.FLOAT_EPSILON) {
            f4 = 0.0f;
        } else {
            f4 = Math.min(360.0f, f);
        }
        C0795a aVar = null;
        boolean z = true;
        float f5 = 0.0f;
        float f6 = f2;
        while (Math.abs(f5 - f2) >= 0.4f) {
            C0795a b = m2955b(f4, f6, f3);
            if (!z) {
                if (b == null) {
                    f2 = f6;
                } else {
                    f5 = f6;
                    aVar = b;
                }
                f6 = ((f2 - f5) / 2.0f) + f5;
            } else if (b != null) {
                return b.mo3260o(mVar);
            } else {
                f6 = ((f2 - f5) / 2.0f) + f5;
                z = false;
            }
        }
        if (aVar == null) {
            return C0796b.m2971a(f3);
        }
        return aVar.mo3260o(mVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public float mo3253a(C0795a aVar) {
        float l = mo3259l() - aVar.mo3259l();
        float g = mo3254g() - aVar.mo3254g();
        float h = mo3255h() - aVar.mo3255h();
        return (float) (Math.pow(Math.sqrt((double) ((l * l) + (g * g) + (h * h))), 0.63d) * 1.41d);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public float mo3254g() {
        return this.f3414h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public float mo3255h() {
        return this.f3415i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public float mo3256i() {
        return this.f3408b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public float mo3257j() {
        return this.f3407a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public float mo3258k() {
        return this.f3409c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public float mo3259l() {
        return this.f3413g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public int mo3260o(C0821m mVar) {
        float f;
        if (((double) mo3256i()) == Utils.DOUBLE_EPSILON || ((double) mo3258k()) == Utils.DOUBLE_EPSILON) {
            f = Utils.FLOAT_EPSILON;
        } else {
            f = mo3256i() / ((float) Math.sqrt(((double) mo3258k()) / 100.0d));
        }
        float pow = (float) Math.pow(((double) f) / Math.pow(1.64d - Math.pow(0.29d, (double) mVar.mo3290e()), 0.73d), 1.1111111111111112d);
        double j = (double) ((mo3257j() * 3.1415927f) / 180.0f);
        float a = mVar.mo3286a() * ((float) Math.pow(((double) mo3258k()) / 100.0d, (1.0d / ((double) mVar.mo3287b())) / ((double) mVar.mo3295j())));
        float cos = ((float) (Math.cos(2.0d + j) + 3.8d)) * 0.25f * 3846.1538f * mVar.mo3292g() * mVar.mo3293h();
        float f2 = a / mVar.mo3291f();
        float sin = (float) Math.sin(j);
        float cos2 = (float) Math.cos(j);
        float f3 = (((0.305f + f2) * 23.0f) * pow) / (((cos * 23.0f) + ((11.0f * pow) * cos2)) + ((pow * 108.0f) * sin));
        float f4 = cos2 * f3;
        float f5 = f3 * sin;
        float f6 = f2 * 460.0f;
        float f7 = (((451.0f * f4) + f6) + (288.0f * f5)) / 1403.0f;
        float f8 = ((f6 - (891.0f * f4)) - (261.0f * f5)) / 1403.0f;
        float f9 = ((f6 - (f4 * 220.0f)) - (f5 * 6300.0f)) / 1403.0f;
        float signum = Math.signum(f7) * (100.0f / mVar.mo3288c()) * ((float) Math.pow((double) ((float) Math.max(Utils.DOUBLE_EPSILON, (((double) Math.abs(f7)) * 27.13d) / (400.0d - ((double) Math.abs(f7))))), 2.380952380952381d));
        float signum2 = Math.signum(f8) * (100.0f / mVar.mo3288c()) * ((float) Math.pow((double) ((float) Math.max(Utils.DOUBLE_EPSILON, (((double) Math.abs(f8)) * 27.13d) / (400.0d - ((double) Math.abs(f8))))), 2.380952380952381d));
        float signum3 = Math.signum(f9) * (100.0f / mVar.mo3288c()) * ((float) Math.pow((double) ((float) Math.max(Utils.DOUBLE_EPSILON, (((double) Math.abs(f9)) * 27.13d) / (400.0d - ((double) Math.abs(f9))))), 2.380952380952381d));
        float f12 = signum / mVar.mo3294i()[0];
        float f13 = signum2 / mVar.mo3294i()[1];
        float f14 = signum3 / mVar.mo3294i()[2];
        float[][] fArr = C0796b.f3417b;
        float[] fArr2 = fArr[0];
        float f15 = (fArr2[0] * f12) + (fArr2[1] * f13) + (fArr2[2] * f14);
        float[] fArr3 = fArr[1];
        float[] fArr4 = fArr[2];
        return C0825b.m3093b((double) f15, (double) ((fArr3[0] * f12) + (fArr3[1] * f13) + (fArr3[2] * f14)), (double) ((f12 * fArr4[0]) + (f13 * fArr4[1]) + (f14 * fArr4[2])));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public int mo3261p() {
        return mo3260o(C0821m.f3452k);
    }
}
