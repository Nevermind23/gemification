package p278ub;

import com.google.zxing.C5755e;

/* renamed from: ub.k */
public class C8677k {

    /* renamed from: i */
    static final C8677k[] f24486i;

    /* renamed from: j */
    private static C8677k[] f24487j;

    /* renamed from: a */
    private final boolean f24488a;

    /* renamed from: b */
    private final int f24489b;

    /* renamed from: c */
    private final int f24490c;

    /* renamed from: d */
    public final int f24491d;

    /* renamed from: e */
    public final int f24492e;

    /* renamed from: f */
    private final int f24493f;

    /* renamed from: g */
    private final int f24494g;

    /* renamed from: h */
    private final int f24495h;

    static {
        C8677k[] kVarArr = {new C8677k(false, 3, 5, 8, 8, 1), new C8677k(false, 5, 7, 10, 10, 1), new C8677k(true, 5, 7, 16, 6, 1), new C8677k(false, 8, 10, 12, 12, 1), new C8677k(true, 10, 11, 14, 6, 2), new C8677k(false, 12, 12, 14, 14, 1), new C8677k(true, 16, 14, 24, 10, 1), new C8677k(false, 18, 14, 16, 16, 1), new C8677k(false, 22, 18, 18, 18, 1), new C8677k(true, 22, 18, 16, 10, 2), new C8677k(false, 30, 20, 20, 20, 1), new C8677k(true, 32, 24, 16, 14, 2), new C8677k(false, 36, 24, 22, 22, 1), new C8677k(false, 44, 28, 24, 24, 1), new C8677k(true, 49, 28, 22, 14, 2), new C8677k(false, 62, 36, 14, 14, 4), new C8677k(false, 86, 42, 16, 16, 4), new C8677k(false, 114, 48, 18, 18, 4), new C8677k(false, 144, 56, 20, 20, 4), new C8677k(false, 174, 68, 22, 22, 4), new C8677k(false, 204, 84, 24, 24, 4, 102, 42), new C8677k(false, 280, 112, 14, 14, 16, 140, 56), new C8677k(false, 368, 144, 16, 16, 16, 92, 36), new C8677k(false, 456, 192, 18, 18, 16, 114, 48), new C8677k(false, 576, 224, 20, 20, 16, 144, 56), new C8677k(false, 696, 272, 22, 22, 16, 174, 68), new C8677k(false, 816, 336, 24, 24, 16, 136, 56), new C8677k(false, 1050, 408, 18, 18, 36, 175, 68), new C8677k(false, 1304, 496, 20, 20, 36, 163, 62), new C8670d()};
        f24486i = kVarArr;
        f24487j = kVarArr;
    }

    public C8677k(boolean z, int i, int i2, int i3, int i4, int i5) {
        this(z, i, i2, i3, i4, i5, i, i2);
    }

    /* renamed from: e */
    private int m32383e() {
        int i = this.f24493f;
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (!(i == 2 || i == 4)) {
                if (i == 16) {
                    return 4;
                }
                if (i == 36) {
                    return 6;
                }
                throw new IllegalStateException("Cannot handle this number of data regions");
            }
        }
        return i2;
    }

    /* renamed from: k */
    private int m32384k() {
        int i = this.f24493f;
        if (i == 1 || i == 2) {
            return 1;
        }
        if (i == 4) {
            return 2;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 36) {
            return 6;
        }
        throw new IllegalStateException("Cannot handle this number of data regions");
    }

    /* renamed from: l */
    public static C8677k m32385l(int i, C8678l lVar, C5755e eVar, C5755e eVar2, boolean z) {
        for (C8677k kVar : f24487j) {
            if ((lVar != C8678l.FORCE_SQUARE || !kVar.f24488a) && ((lVar != C8678l.FORCE_RECTANGLE || kVar.f24488a) && i <= kVar.f24489b)) {
                return kVar;
            }
        }
        if (!z) {
            return null;
        }
        throw new IllegalArgumentException("Can't find a symbol arrangement that matches the message. Data codewords: ".concat(String.valueOf(i)));
    }

    /* renamed from: a */
    public final int mo24050a() {
        return this.f24489b;
    }

    /* renamed from: b */
    public int mo24027b(int i) {
        return this.f24494g;
    }

    /* renamed from: c */
    public final int mo24051c() {
        return this.f24490c;
    }

    /* renamed from: d */
    public final int mo24052d(int i) {
        return this.f24495h;
    }

    /* renamed from: f */
    public int mo24028f() {
        return this.f24489b / this.f24494g;
    }

    /* renamed from: g */
    public final int mo24053g() {
        return m32384k() * this.f24492e;
    }

    /* renamed from: h */
    public final int mo24054h() {
        return m32383e() * this.f24491d;
    }

    /* renamed from: i */
    public final int mo24055i() {
        return mo24053g() + (m32384k() << 1);
    }

    /* renamed from: j */
    public final int mo24056j() {
        return mo24054h() + (m32383e() << 1);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (this.f24488a) {
            str = "Rectangular Symbol:";
        } else {
            str = "Square Symbol:";
        }
        sb.append(str);
        sb.append(" data region ");
        sb.append(this.f24491d);
        sb.append('x');
        sb.append(this.f24492e);
        sb.append(", symbol size ");
        sb.append(mo24056j());
        sb.append('x');
        sb.append(mo24055i());
        sb.append(", symbol data size ");
        sb.append(mo24054h());
        sb.append('x');
        sb.append(mo24053g());
        sb.append(", codewords ");
        sb.append(this.f24489b);
        sb.append('+');
        sb.append(this.f24490c);
        return sb.toString();
    }

    C8677k(boolean z, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.f24488a = z;
        this.f24489b = i;
        this.f24490c = i2;
        this.f24491d = i3;
        this.f24492e = i4;
        this.f24493f = i5;
        this.f24494g = i6;
        this.f24495h = i7;
    }
}
