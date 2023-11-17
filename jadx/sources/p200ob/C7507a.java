package p200ob;

import java.util.Arrays;

/* renamed from: ob.a */
public final class C7507a implements Cloneable {

    /* renamed from: d */
    private int[] f21871d;

    /* renamed from: e */
    private int f21872e;

    public C7507a() {
        this.f21872e = 0;
        this.f21871d = new int[1];
    }

    /* renamed from: f */
    private void m28517f(int i) {
        if (i > (this.f21871d.length << 5)) {
            int[] o = m28518o(i);
            int[] iArr = this.f21871d;
            System.arraycopy(iArr, 0, o, 0, iArr.length);
            this.f21871d = o;
        }
    }

    /* renamed from: o */
    private static int[] m28518o(int i) {
        return new int[((i + 31) / 32)];
    }

    /* renamed from: a */
    public void mo21949a(boolean z) {
        m28517f(this.f21872e + 1);
        if (z) {
            int[] iArr = this.f21871d;
            int i = this.f21872e;
            int i2 = i / 32;
            iArr[i2] = (1 << (i & 31)) | iArr[i2];
        }
        this.f21872e++;
    }

    /* renamed from: b */
    public void mo21950b(C7507a aVar) {
        int i = aVar.f21872e;
        m28517f(this.f21872e + i);
        for (int i2 = 0; i2 < i; i2++) {
            mo21949a(aVar.mo21956g(i2));
        }
    }

    /* renamed from: c */
    public void mo21951c(int i, int i2) {
        if (i2 < 0 || i2 > 32) {
            throw new IllegalArgumentException("Num bits must be between 0 and 32");
        }
        m28517f(this.f21872e + i2);
        while (i2 > 0) {
            boolean z = true;
            if (((i >> (i2 - 1)) & 1) != 1) {
                z = false;
            }
            mo21949a(z);
            i2--;
        }
    }

    /* renamed from: d */
    public void mo21953d() {
        int length = this.f21871d.length;
        for (int i = 0; i < length; i++) {
            this.f21871d[i] = 0;
        }
    }

    /* renamed from: e */
    public C7507a clone() {
        return new C7507a((int[]) this.f21871d.clone(), this.f21872e);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C7507a)) {
            return false;
        }
        C7507a aVar = (C7507a) obj;
        if (this.f21872e != aVar.f21872e || !Arrays.equals(this.f21871d, aVar.f21871d)) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public boolean mo21956g(int i) {
        return ((1 << (i & 31)) & this.f21871d[i / 32]) != 0;
    }

    /* renamed from: h */
    public int[] mo21957h() {
        return this.f21871d;
    }

    public int hashCode() {
        return (this.f21872e * 31) + Arrays.hashCode(this.f21871d);
    }

    /* renamed from: j */
    public int mo21959j(int i) {
        int i2 = this.f21872e;
        if (i >= i2) {
            return i2;
        }
        int i3 = i / 32;
        int i4 = (-(1 << (i & 31))) & this.f21871d[i3];
        while (i4 == 0) {
            i3++;
            int[] iArr = this.f21871d;
            if (i3 == iArr.length) {
                return this.f21872e;
            }
            i4 = iArr[i3];
        }
        return Math.min((i3 << 5) + Integer.numberOfTrailingZeros(i4), this.f21872e);
    }

    /* renamed from: k */
    public int mo21960k(int i) {
        int i2 = this.f21872e;
        if (i >= i2) {
            return i2;
        }
        int i3 = i / 32;
        int i4 = (-(1 << (i & 31))) & (~this.f21871d[i3]);
        while (i4 == 0) {
            i3++;
            int[] iArr = this.f21871d;
            if (i3 == iArr.length) {
                return this.f21872e;
            }
            i4 = ~iArr[i3];
        }
        return Math.min((i3 << 5) + Integer.numberOfTrailingZeros(i4), this.f21872e);
    }

    /* renamed from: l */
    public int mo21961l() {
        return this.f21872e;
    }

    /* renamed from: m */
    public int mo21962m() {
        return (this.f21872e + 7) / 8;
    }

    /* renamed from: n */
    public boolean mo21963n(int i, int i2, boolean z) {
        int i3;
        if (i2 < i || i < 0 || i2 > this.f21872e) {
            throw new IllegalArgumentException();
        } else if (i2 == i) {
            return true;
        } else {
            int i4 = i2 - 1;
            int i5 = i / 32;
            int i6 = i4 / 32;
            for (int i7 = i5; i7 <= i6; i7++) {
                int i8 = 31;
                if (i7 > i5) {
                    i3 = 0;
                } else {
                    i3 = i & 31;
                }
                if (i7 >= i6) {
                    i8 = 31 & i4;
                }
                int i9 = (2 << i8) - (1 << i3);
                int i12 = this.f21871d[i7] & i9;
                if (!z) {
                    i9 = 0;
                }
                if (i12 != i9) {
                    return false;
                }
            }
            return true;
        }
    }

    /* renamed from: p */
    public void mo21964p() {
        int[] iArr = new int[this.f21871d.length];
        int i = (this.f21872e - 1) / 32;
        int i2 = i + 1;
        for (int i3 = 0; i3 < i2; i3++) {
            long j = (long) this.f21871d[i3];
            long j2 = ((j & 1431655765) << 1) | ((j >> 1) & 1431655765);
            long j3 = ((j2 & 858993459) << 2) | ((j2 >> 2) & 858993459);
            long j4 = ((j3 & 252645135) << 4) | ((j3 >> 4) & 252645135);
            long j5 = ((j4 & 16711935) << 8) | ((j4 >> 8) & 16711935);
            iArr[i - i3] = (int) (((j5 & 65535) << 16) | ((j5 >> 16) & 65535));
        }
        int i4 = this.f21872e;
        int i5 = i2 << 5;
        if (i4 != i5) {
            int i6 = i5 - i4;
            int i7 = iArr[0] >>> i6;
            for (int i8 = 1; i8 < i2; i8++) {
                int i9 = iArr[i8];
                iArr[i8 - 1] = i7 | (i9 << (32 - i6));
                i7 = i9 >>> i6;
            }
            iArr[i2 - 1] = i7;
        }
        this.f21871d = iArr;
    }

    /* renamed from: q */
    public void mo21965q(int i) {
        int[] iArr = this.f21871d;
        int i2 = i / 32;
        iArr[i2] = (1 << (i & 31)) | iArr[i2];
    }

    /* renamed from: r */
    public void mo21966r(int i, int i2) {
        this.f21871d[i / 32] = i2;
    }

    /* renamed from: s */
    public void mo21967s(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = 0;
            for (int i6 = 0; i6 < 8; i6++) {
                if (mo21956g(i)) {
                    i5 |= 1 << (7 - i6);
                }
                i++;
            }
            bArr[i2 + i4] = (byte) i5;
        }
    }

    /* renamed from: t */
    public void mo21968t(C7507a aVar) {
        if (this.f21872e == aVar.f21872e) {
            int i = 0;
            while (true) {
                int[] iArr = this.f21871d;
                if (i < iArr.length) {
                    iArr[i] = iArr[i] ^ aVar.f21871d[i];
                    i++;
                } else {
                    return;
                }
            }
        } else {
            throw new IllegalArgumentException("Sizes don't match");
        }
    }

    public String toString() {
        char c;
        int i = this.f21872e;
        StringBuilder sb = new StringBuilder(i + (i / 8) + 1);
        for (int i2 = 0; i2 < this.f21872e; i2++) {
            if ((i2 & 7) == 0) {
                sb.append(' ');
            }
            if (mo21956g(i2)) {
                c = 'X';
            } else {
                c = '.';
            }
            sb.append(c);
        }
        return sb.toString();
    }

    public C7507a(int i) {
        this.f21872e = i;
        this.f21871d = m28518o(i);
    }

    C7507a(int[] iArr, int i) {
        this.f21871d = iArr;
        this.f21872e = i;
    }
}
