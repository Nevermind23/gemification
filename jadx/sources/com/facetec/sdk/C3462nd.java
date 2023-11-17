package com.facetec.sdk;

import java.util.Arrays;

/* renamed from: com.facetec.sdk.nd */
final class C3462nd extends C3435mq {

    /* renamed from: b */
    private transient byte[][] f11313b;

    /* renamed from: e */
    private transient int[] f11314e;

    C3462nd(C3431mm mmVar, int i) {
        super((byte[]) null);
        C3460nb.m13841e(mmVar.f11260b, 0, (long) i);
        C3459na naVar = mmVar.f11261e;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            int i5 = naVar.f11307c;
            int i6 = naVar.f11309e;
            if (i5 != i6) {
                i3 += i5 - i6;
                i4++;
                naVar = naVar.f11311j;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        this.f11313b = new byte[i4][];
        this.f11314e = new int[(i4 << 1)];
        C3459na naVar2 = mmVar.f11261e;
        int i7 = 0;
        while (i2 < i) {
            byte[][] bArr = this.f11313b;
            bArr[i7] = naVar2.f11308d;
            int i8 = naVar2.f11307c;
            int i9 = naVar2.f11309e;
            i2 += i8 - i9;
            if (i2 > i) {
                i2 = i;
            }
            int[] iArr = this.f11314e;
            iArr[i7] = i2;
            iArr[bArr.length + i7] = i9;
            naVar2.f11306b = true;
            i7++;
            naVar2 = naVar2.f11311j;
        }
    }

    /* renamed from: f */
    private C3435mq m13845f() {
        return new C3435mq(mo9909j());
    }

    private Object writeReplace() {
        return m13845f();
    }

    /* renamed from: a */
    public final C3435mq mo9893a() {
        return m13845f().mo9893a();
    }

    /* renamed from: b */
    public final String mo9894b() {
        return m13845f().mo9894b();
    }

    /* renamed from: c */
    public final C3435mq mo9897c() {
        return m13845f().mo9897c();
    }

    /* renamed from: d */
    public final String mo9901d() {
        return m13845f().mo9901d();
    }

    /* renamed from: e */
    public final String mo9903e() {
        return m13845f().mo9903e();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C3435mq) {
            C3435mq mqVar = (C3435mq) obj;
            if (mqVar.mo9906g() != mo9906g() || !mo9895b(0, mqVar, 0, mo9906g())) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public final int mo9906g() {
        return this.f11314e[this.f11313b.length - 1];
    }

    /* renamed from: h */
    public final C3435mq mo9907h() {
        return m13845f().mo9907h();
    }

    public final int hashCode() {
        int i = this.f11266c;
        if (i != 0) {
            return i;
        }
        int length = this.f11313b.length;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i2 < length) {
            byte[] bArr = this.f11313b[i2];
            int[] iArr = this.f11314e;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            int i7 = (i6 - i4) + i5;
            while (i5 < i7) {
                i3 = (i3 * 31) + bArr[i5];
                i5++;
            }
            i2++;
            i4 = i6;
        }
        this.f11266c = i3;
        return i3;
    }

    /* renamed from: j */
    public final byte[] mo9909j() {
        int[] iArr = this.f11314e;
        byte[][] bArr = this.f11313b;
        byte[] bArr2 = new byte[iArr[bArr.length - 1]];
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr2 = this.f11314e;
            int i3 = iArr2[length + i];
            int i4 = iArr2[i];
            System.arraycopy(this.f11313b[i], i3, bArr2, i2, i4 - i2);
            i++;
            i2 = i4;
        }
        return bArr2;
    }

    public final String toString() {
        return m13845f().toString();
    }

    /* renamed from: b */
    private int m13844b(int i) {
        int binarySearch = Arrays.binarySearch(this.f11314e, 0, this.f11313b.length, i + 1);
        return binarySearch >= 0 ? binarySearch : ~binarySearch;
    }

    /* renamed from: c */
    public final C3435mq mo9898c(int i, int i2) {
        return m13845f().mo9898c(i, i2);
    }

    /* renamed from: e */
    public final byte mo9902e(int i) {
        int i2;
        C3460nb.m13841e((long) this.f11314e[this.f11313b.length - 1], (long) i, 1);
        int b = m13844b(i);
        if (b == 0) {
            i2 = 0;
        } else {
            i2 = this.f11314e[b - 1];
        }
        int[] iArr = this.f11314e;
        byte[][] bArr = this.f11313b;
        return bArr[b][(i - i2) + iArr[bArr.length + b]];
    }

    /* renamed from: b */
    public final boolean mo9895b(int i, C3435mq mqVar, int i2, int i3) {
        int i4;
        if (mo9906g() - i3 < 0) {
            return false;
        }
        int b = m13844b(0);
        while (i3 > 0) {
            if (b == 0) {
                i4 = 0;
            } else {
                i4 = this.f11314e[b - 1];
            }
            int min = Math.min(i3, ((this.f11314e[b] - i4) + i4) - i);
            int[] iArr = this.f11314e;
            byte[][] bArr = this.f11313b;
            if (!mqVar.mo9904e(i2, bArr[b], (i - i4) + iArr[bArr.length + b], min)) {
                return false;
            }
            i += min;
            i2 += min;
            i3 -= min;
            b++;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo9899c(C3431mm mmVar) {
        int length = this.f11313b.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr = this.f11314e;
            int i3 = iArr[length + i];
            int i4 = iArr[i];
            C3459na naVar = new C3459na(this.f11313b[i], i3, (i3 + i4) - i2);
            C3459na naVar2 = mmVar.f11261e;
            if (naVar2 == null) {
                naVar.f11310h = naVar;
                naVar.f11311j = naVar;
                mmVar.f11261e = naVar;
            } else {
                naVar2.f11310h.mo9939a(naVar);
            }
            i++;
            i2 = i4;
        }
        mmVar.f11260b += (long) i2;
    }

    /* renamed from: e */
    public final boolean mo9904e(int i, byte[] bArr, int i2, int i3) {
        int i4;
        if (i < 0 || i > mo9906g() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int b = m13844b(i);
        while (i3 > 0) {
            if (b == 0) {
                i4 = 0;
            } else {
                i4 = this.f11314e[b - 1];
            }
            int min = Math.min(i3, ((this.f11314e[b] - i4) + i4) - i);
            int[] iArr = this.f11314e;
            byte[][] bArr2 = this.f11313b;
            if (!C3460nb.m13840d(bArr2[b], (i - i4) + iArr[bArr2.length + b], bArr, i2, min)) {
                return false;
            }
            i += min;
            i2 += min;
            i3 -= min;
            b++;
        }
        return true;
    }
}
