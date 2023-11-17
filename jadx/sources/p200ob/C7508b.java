package p200ob;

import java.util.Arrays;

/* renamed from: ob.b */
public final class C7508b implements Cloneable {

    /* renamed from: d */
    private final int f21873d;

    /* renamed from: e */
    private final int f21874e;

    /* renamed from: f */
    private final int f21875f;

    /* renamed from: g */
    private final int[] f21876g;

    public C7508b(int i) {
        this(i, i);
    }

    /* renamed from: a */
    private String m28536a(String str, String str2, String str3) {
        String str4;
        StringBuilder sb = new StringBuilder(this.f21874e * (this.f21873d + 1));
        for (int i = 0; i < this.f21874e; i++) {
            for (int i2 = 0; i2 < this.f21873d; i2++) {
                if (mo21974e(i2, i)) {
                    str4 = str;
                } else {
                    str4 = str2;
                }
                sb.append(str4);
            }
            sb.append(str3);
        }
        return sb.toString();
    }

    /* renamed from: b */
    public void mo21970b() {
        int length = this.f21876g.length;
        for (int i = 0; i < length; i++) {
            this.f21876g[i] = 0;
        }
    }

    /* renamed from: c */
    public C7508b clone() {
        return new C7508b(this.f21873d, this.f21874e, this.f21875f, (int[]) this.f21876g.clone());
    }

    /* renamed from: d */
    public void mo21973d(int i, int i2) {
        int i3 = (i2 * this.f21875f) + (i / 32);
        int[] iArr = this.f21876g;
        iArr[i3] = (1 << (i & 31)) ^ iArr[i3];
    }

    /* renamed from: e */
    public boolean mo21974e(int i, int i2) {
        if (((this.f21876g[(i2 * this.f21875f) + (i / 32)] >>> (i & 31)) & 1) != 0) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C7508b)) {
            return false;
        }
        C7508b bVar = (C7508b) obj;
        if (this.f21873d == bVar.f21873d && this.f21874e == bVar.f21874e && this.f21875f == bVar.f21875f && Arrays.equals(this.f21876g, bVar.f21876g)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public int[] mo21976f() {
        int length = this.f21876g.length - 1;
        while (length >= 0 && this.f21876g[length] == 0) {
            length--;
        }
        if (length < 0) {
            return null;
        }
        int i = this.f21875f;
        int i2 = length / i;
        int i3 = (length % i) << 5;
        int i4 = 31;
        while ((this.f21876g[length] >>> i4) == 0) {
            i4--;
        }
        return new int[]{i3 + i4, i2};
    }

    /* renamed from: g */
    public int[] mo21977g() {
        int i = this.f21873d;
        int i2 = this.f21874e;
        int i3 = -1;
        int i4 = -1;
        for (int i5 = 0; i5 < this.f21874e; i5++) {
            int i6 = 0;
            while (true) {
                int i7 = this.f21875f;
                if (i6 >= i7) {
                    break;
                }
                int i8 = this.f21876g[(i7 * i5) + i6];
                if (i8 != 0) {
                    if (i5 < i2) {
                        i2 = i5;
                    }
                    if (i5 > i4) {
                        i4 = i5;
                    }
                    int i9 = i6 << 5;
                    if (i9 < i) {
                        int i12 = 0;
                        while ((i8 << (31 - i12)) == 0) {
                            i12++;
                        }
                        int i13 = i12 + i9;
                        if (i13 < i) {
                            i = i13;
                        }
                    }
                    if (i9 + 31 > i3) {
                        int i14 = 31;
                        while ((i8 >>> i14) == 0) {
                            i14--;
                        }
                        int i15 = i9 + i14;
                        if (i15 > i3) {
                            i3 = i15;
                        }
                    }
                }
                i6++;
            }
        }
        if (i3 < i || i4 < i2) {
            return null;
        }
        return new int[]{i, i2, (i3 - i) + 1, (i4 - i2) + 1};
    }

    /* renamed from: h */
    public int mo21978h() {
        return this.f21874e;
    }

    public int hashCode() {
        int i = this.f21873d;
        return (((((((i * 31) + i) * 31) + this.f21874e) * 31) + this.f21875f) * 31) + Arrays.hashCode(this.f21876g);
    }

    /* renamed from: j */
    public C7507a mo21980j(int i, C7507a aVar) {
        if (aVar == null || aVar.mo21961l() < this.f21873d) {
            aVar = new C7507a(this.f21873d);
        } else {
            aVar.mo21953d();
        }
        int i2 = i * this.f21875f;
        for (int i3 = 0; i3 < this.f21875f; i3++) {
            aVar.mo21966r(i3 << 5, this.f21876g[i2 + i3]);
        }
        return aVar;
    }

    /* renamed from: k */
    public int[] mo21981k() {
        int[] iArr;
        int i = 0;
        while (true) {
            iArr = this.f21876g;
            if (i < iArr.length && iArr[i] == 0) {
                i++;
            }
        }
        if (i == iArr.length) {
            return null;
        }
        int i2 = this.f21875f;
        int i3 = i / i2;
        int i4 = (i % i2) << 5;
        int i5 = iArr[i];
        int i6 = 0;
        while ((i5 << (31 - i6)) == 0) {
            i6++;
        }
        return new int[]{i4 + i6, i3};
    }

    /* renamed from: l */
    public int mo21982l() {
        return this.f21873d;
    }

    /* renamed from: m */
    public void mo21983m() {
        C7507a aVar = new C7507a(this.f21873d);
        C7507a aVar2 = new C7507a(this.f21873d);
        int i = (this.f21874e + 1) / 2;
        for (int i2 = 0; i2 < i; i2++) {
            aVar = mo21980j(i2, aVar);
            int i3 = (this.f21874e - 1) - i2;
            aVar2 = mo21980j(i3, aVar2);
            aVar.mo21964p();
            aVar2.mo21964p();
            mo21986p(i2, aVar2);
            mo21986p(i3, aVar);
        }
    }

    /* renamed from: n */
    public void mo21984n(int i, int i2) {
        int i3 = (i2 * this.f21875f) + (i / 32);
        int[] iArr = this.f21876g;
        iArr[i3] = (1 << (i & 31)) | iArr[i3];
    }

    /* renamed from: o */
    public void mo21985o(int i, int i2, int i3, int i4) {
        if (i2 < 0 || i < 0) {
            throw new IllegalArgumentException("Left and top must be nonnegative");
        } else if (i4 <= 0 || i3 <= 0) {
            throw new IllegalArgumentException("Height and width must be at least 1");
        } else {
            int i5 = i3 + i;
            int i6 = i4 + i2;
            if (i6 > this.f21874e || i5 > this.f21873d) {
                throw new IllegalArgumentException("The region must fit inside the matrix");
            }
            while (i2 < i6) {
                int i7 = this.f21875f * i2;
                for (int i8 = i; i8 < i5; i8++) {
                    int[] iArr = this.f21876g;
                    int i9 = (i8 / 32) + i7;
                    iArr[i9] = iArr[i9] | (1 << (i8 & 31));
                }
                i2++;
            }
        }
    }

    /* renamed from: p */
    public void mo21986p(int i, C7507a aVar) {
        int[] h = aVar.mo21957h();
        int[] iArr = this.f21876g;
        int i2 = this.f21875f;
        System.arraycopy(h, 0, iArr, i * i2, i2);
    }

    /* renamed from: q */
    public String mo21987q(String str, String str2) {
        return m28536a(str, str2, "\n");
    }

    public String toString() {
        return mo21987q("X ", "  ");
    }

    public C7508b(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            throw new IllegalArgumentException("Both dimensions must be greater than 0");
        }
        this.f21873d = i;
        this.f21874e = i2;
        int i3 = (i + 31) / 32;
        this.f21875f = i3;
        this.f21876g = new int[(i3 * i2)];
    }

    private C7508b(int i, int i2, int i3, int[] iArr) {
        this.f21873d = i;
        this.f21874e = i2;
        this.f21875f = i3;
        this.f21876g = iArr;
    }
}
