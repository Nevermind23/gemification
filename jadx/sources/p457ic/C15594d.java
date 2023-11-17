package p457ic;

import com.google.zxing.C5766o;

/* renamed from: ic.d */
public final class C15594d extends C5766o {

    /* renamed from: c */
    private final float f44290c;

    /* renamed from: d */
    private final int f44291d;

    C15594d(float f, float f2, float f3) {
        this(f, f2, f3, 1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean mo42857f(float f, float f2, float f3) {
        if (Math.abs(f2 - mo18902d()) > f || Math.abs(f3 - mo18901c()) > f) {
            return false;
        }
        float abs = Math.abs(f - this.f44290c);
        if (abs <= 1.0f || abs <= this.f44290c) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public C15594d mo42858g(float f, float f2, float f3) {
        int i = this.f44291d;
        int i2 = i + 1;
        float c = (((float) i) * mo18901c()) + f2;
        float f4 = (float) i2;
        return new C15594d(c / f4, ((((float) this.f44291d) * mo18902d()) + f) / f4, ((((float) this.f44291d) * this.f44290c) + f3) / f4, i2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public int mo42859h() {
        return this.f44291d;
    }

    /* renamed from: i */
    public float mo42860i() {
        return this.f44290c;
    }

    private C15594d(float f, float f2, float f3, int i) {
        super(f, f2);
        this.f44290c = f3;
        this.f44291d = i;
    }
}
