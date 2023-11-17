package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;

/* renamed from: com.google.android.gms.internal.measurement.p8 */
class C4350p8 extends C4333o8 {

    /* renamed from: h */
    protected final byte[] f13585h;

    C4350p8(byte[] bArr) {
        bArr.getClass();
        this.f13585h = bArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public int mo13352A() {
        return 0;
    }

    /* renamed from: b */
    public byte mo13353b(int i) {
        return this.f13585h[i];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public byte mo13354c(int i) {
        return this.f13585h[i];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4418t8) || mo13355g() != ((C4418t8) obj).mo13355g()) {
            return false;
        }
        if (mo13355g() == 0) {
            return true;
        }
        if (!(obj instanceof C4350p8)) {
            return obj.equals(this);
        }
        C4350p8 p8Var = (C4350p8) obj;
        int v = mo13647v();
        int v2 = p8Var.mo13647v();
        if (v != 0 && v2 != 0 && v != v2) {
            return false;
        }
        int g = mo13355g();
        if (g > p8Var.mo13355g()) {
            throw new IllegalArgumentException("Length too large: " + g + mo13355g());
        } else if (g <= p8Var.mo13355g()) {
            byte[] bArr = this.f13585h;
            byte[] bArr2 = p8Var.f13585h;
            p8Var.mo13352A();
            int i = 0;
            int i2 = 0;
            while (i < g) {
                if (bArr[i] != bArr2[i2]) {
                    return false;
                }
                i++;
                i2++;
            }
            return true;
        } else {
            throw new IllegalArgumentException("Ran off end of other: 0, " + g + ", " + p8Var.mo13355g());
        }
    }

    /* renamed from: g */
    public int mo13355g() {
        return this.f13585h.length;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final int mo13460i(int i, int i2, int i3) {
        return C4470w9.m17096b(i, this.f13585h, 0, i3);
    }

    /* renamed from: k */
    public final C4418t8 mo13461k(int i, int i2) {
        int r = C4418t8.m16749r(0, i2, mo13355g());
        if (r == 0) {
            return C4418t8.f13699e;
        }
        return new C4299m8(this.f13585h, 0, r);
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final String mo13462l(Charset charset) {
        return new String(this.f13585h, 0, mo13355g(), charset);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final void mo13463n(C4231i8 i8Var) {
        ((C4501y8) i8Var).mo13833B(this.f13585h, 0, mo13355g());
    }

    /* renamed from: o */
    public final boolean mo13464o() {
        return C4472wb.m17103e(this.f13585h, 0, mo13355g());
    }
}
