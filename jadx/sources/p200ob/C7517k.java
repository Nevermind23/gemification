package p200ob;

import com.github.mikephil.charting.utils.Utils;

/* renamed from: ob.k */
public final class C7517k {

    /* renamed from: a */
    private final float f21929a;

    /* renamed from: b */
    private final float f21930b;

    /* renamed from: c */
    private final float f21931c;

    /* renamed from: d */
    private final float f21932d;

    /* renamed from: e */
    private final float f21933e;

    /* renamed from: f */
    private final float f21934f;

    /* renamed from: g */
    private final float f21935g;

    /* renamed from: h */
    private final float f21936h;

    /* renamed from: i */
    private final float f21937i;

    private C7517k(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        this.f21929a = f;
        this.f21930b = f4;
        this.f21931c = f7;
        this.f21932d = f2;
        this.f21933e = f5;
        this.f21934f = f8;
        this.f21935g = f3;
        this.f21936h = f6;
        this.f21937i = f9;
    }

    /* renamed from: b */
    public static C7517k m28590b(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f12, float f13, float f14, float f15, float f16, float f17, float f18) {
        return m28592d(f9, f12, f13, f14, f15, f16, f17, f18).mo22012e(m28591c(f, f2, f3, f4, f5, f6, f7, f8));
    }

    /* renamed from: c */
    public static C7517k m28591c(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        return m28592d(f, f2, f3, f4, f5, f6, f7, f8).mo22011a();
    }

    /* renamed from: d */
    public static C7517k m28592d(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        float f9 = ((f - f3) + f5) - f7;
        float f12 = ((f2 - f4) + f6) - f8;
        if (f9 == Utils.FLOAT_EPSILON && f12 == Utils.FLOAT_EPSILON) {
            return new C7517k(f3 - f, f5 - f3, f, f4 - f2, f6 - f4, f2, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, 1.0f);
        }
        float f13 = f3 - f5;
        float f14 = f7 - f5;
        float f15 = f4 - f6;
        float f16 = f8 - f6;
        float f17 = (f13 * f16) - (f14 * f15);
        float f18 = ((f16 * f9) - (f14 * f12)) / f17;
        float f19 = ((f13 * f12) - (f9 * f15)) / f17;
        return new C7517k((f18 * f3) + (f3 - f), (f19 * f7) + (f7 - f), f, (f4 - f2) + (f18 * f4), (f8 - f2) + (f19 * f8), f2, f18, f19, 1.0f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C7517k mo22011a() {
        float f = this.f21933e;
        float f2 = this.f21937i;
        float f3 = this.f21934f;
        float f4 = this.f21936h;
        float f5 = (f * f2) - (f3 * f4);
        float f6 = this.f21935g;
        float f7 = this.f21932d;
        float f8 = (f3 * f6) - (f7 * f2);
        float f9 = (f7 * f4) - (f * f6);
        float f12 = this.f21931c;
        float f13 = this.f21930b;
        float f14 = (f12 * f4) - (f13 * f2);
        float f15 = this.f21929a;
        return new C7517k(f5, f8, f9, f14, (f2 * f15) - (f12 * f6), (f6 * f13) - (f4 * f15), (f13 * f3) - (f12 * f), (f12 * f7) - (f3 * f15), (f15 * f) - (f13 * f7));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public C7517k mo22012e(C7517k kVar) {
        C7517k kVar2 = kVar;
        float f = this.f21929a;
        float f2 = kVar2.f21929a;
        float f3 = this.f21932d;
        float f4 = kVar2.f21930b;
        float f5 = this.f21935g;
        float f6 = kVar2.f21931c;
        float f7 = (f * f2) + (f3 * f4) + (f5 * f6);
        float f8 = kVar2.f21932d;
        float f9 = kVar2.f21933e;
        float f12 = kVar2.f21934f;
        float f13 = (f * f8) + (f3 * f9) + (f5 * f12);
        float f14 = kVar2.f21935g;
        float f15 = kVar2.f21936h;
        float f16 = kVar2.f21937i;
        float f17 = (f * f14) + (f3 * f15) + (f5 * f16);
        float f18 = this.f21930b;
        float f19 = f17;
        float f22 = this.f21933e;
        float f23 = f13;
        float f24 = this.f21936h;
        float f25 = (f18 * f2) + (f22 * f4) + (f24 * f6);
        float f26 = (f24 * f16) + (f18 * f14) + (f22 * f15);
        float f27 = this.f21931c;
        float f28 = this.f21934f;
        float f29 = (f2 * f27) + (f4 * f28);
        float f32 = this.f21937i;
        float f33 = (f27 * f14) + (f28 * f15) + (f32 * f16);
        return new C7517k(f7, f23, f19, f25, (f18 * f8) + (f22 * f9) + (f24 * f12), f26, (f6 * f32) + f29, (f8 * f27) + (f9 * f28) + (f12 * f32), f33);
    }

    /* renamed from: f */
    public void mo22013f(float[] fArr) {
        float[] fArr2 = fArr;
        float f = this.f21929a;
        float f2 = this.f21930b;
        float f3 = this.f21931c;
        float f4 = this.f21932d;
        float f5 = this.f21933e;
        float f6 = this.f21934f;
        float f7 = this.f21935g;
        float f8 = this.f21936h;
        float f9 = this.f21937i;
        int length = fArr2.length - 1;
        for (int i = 0; i < length; i += 2) {
            float f12 = fArr2[i];
            int i2 = i + 1;
            float f13 = fArr2[i2];
            float f14 = (f3 * f12) + (f6 * f13) + f9;
            fArr2[i] = (((f * f12) + (f4 * f13)) + f7) / f14;
            fArr2[i2] = (((f12 * f2) + (f13 * f5)) + f8) / f14;
        }
    }
}
