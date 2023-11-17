package p457ic;

import com.google.zxing.C5766o;

/* renamed from: ic.a */
public final class C15591a extends C5766o {

    /* renamed from: c */
    private final float f44278c;

    C15591a(float f, float f2, float f3) {
        super(f, f2);
        this.f44278c = f3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean mo42850f(float f, float f2, float f3) {
        if (Math.abs(f2 - mo18902d()) > f || Math.abs(f3 - mo18901c()) > f) {
            return false;
        }
        float abs = Math.abs(f - this.f44278c);
        if (abs <= 1.0f || abs <= this.f44278c) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public C15591a mo42851g(float f, float f2, float f3) {
        return new C15591a((mo18901c() + f2) / 2.0f, (mo18902d() + f) / 2.0f, (this.f44278c + f3) / 2.0f);
    }
}
