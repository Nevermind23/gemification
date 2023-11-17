package p252sb;

import com.google.zxing.FormatException;
import p200ob.C7508b;

/* renamed from: sb.a */
final class C8291a {

    /* renamed from: a */
    private final C7508b f23485a;

    /* renamed from: b */
    private final C7508b f23486b;

    /* renamed from: c */
    private final C8297e f23487c;

    C8291a(C7508b bVar) {
        int h = bVar.mo21978h();
        if (h < 8 || h > 144 || (h & 1) != 0) {
            throw FormatException.m23153a();
        }
        this.f23487c = m31151j(bVar);
        C7508b a = m31144a(bVar);
        this.f23485a = a;
        this.f23486b = new C7508b(a.mo21982l(), a.mo21978h());
    }

    /* renamed from: a */
    private C7508b m31144a(C7508b bVar) {
        int f = this.f23487c.mo23460f();
        int e = this.f23487c.mo23459e();
        if (bVar.mo21978h() == f) {
            int c = this.f23487c.mo23457c();
            int b = this.f23487c.mo23456b();
            int i = f / c;
            int i2 = e / b;
            C7508b bVar2 = new C7508b(i2 * b, i * c);
            for (int i3 = 0; i3 < i; i3++) {
                int i4 = i3 * c;
                for (int i5 = 0; i5 < i2; i5++) {
                    int i6 = i5 * b;
                    for (int i7 = 0; i7 < c; i7++) {
                        int i8 = ((c + 2) * i3) + 1 + i7;
                        int i9 = i4 + i7;
                        for (int i12 = 0; i12 < b; i12++) {
                            if (bVar.mo21974e(((b + 2) * i5) + 1 + i12, i8)) {
                                bVar2.mo21984n(i6 + i12, i9);
                            }
                        }
                        C7508b bVar3 = bVar;
                    }
                    C7508b bVar4 = bVar;
                }
                C7508b bVar5 = bVar;
            }
            return bVar2;
        }
        throw new IllegalArgumentException("Dimension of bitMatrix must match the version size");
    }

    /* renamed from: d */
    private int m31145d(int i, int i2) {
        int i3 = i - 1;
        int i4 = (m31149h(i3, 0, i, i2) ? 1 : 0) << true;
        if (m31149h(i3, 1, i, i2)) {
            i4 |= 1;
        }
        int i5 = i4 << 1;
        if (m31149h(i3, 2, i, i2)) {
            i5 |= 1;
        }
        int i6 = i5 << 1;
        if (m31149h(0, i2 - 2, i, i2)) {
            i6 |= 1;
        }
        int i7 = i6 << 1;
        int i8 = i2 - 1;
        if (m31149h(0, i8, i, i2)) {
            i7 |= 1;
        }
        int i9 = i7 << 1;
        if (m31149h(1, i8, i, i2)) {
            i9 |= 1;
        }
        int i12 = i9 << 1;
        if (m31149h(2, i8, i, i2)) {
            i12 |= 1;
        }
        int i13 = i12 << 1;
        if (m31149h(3, i8, i, i2)) {
            return i13 | 1;
        }
        return i13;
    }

    /* renamed from: e */
    private int m31146e(int i, int i2) {
        int i3 = (m31149h(i + -3, 0, i, i2) ? 1 : 0) << true;
        if (m31149h(i - 2, 0, i, i2)) {
            i3 |= 1;
        }
        int i4 = i3 << 1;
        if (m31149h(i - 1, 0, i, i2)) {
            i4 |= 1;
        }
        int i5 = i4 << 1;
        if (m31149h(0, i2 - 4, i, i2)) {
            i5 |= 1;
        }
        int i6 = i5 << 1;
        if (m31149h(0, i2 - 3, i, i2)) {
            i6 |= 1;
        }
        int i7 = i6 << 1;
        if (m31149h(0, i2 - 2, i, i2)) {
            i7 |= 1;
        }
        int i8 = i7 << 1;
        int i9 = i2 - 1;
        if (m31149h(0, i9, i, i2)) {
            i8 |= 1;
        }
        int i12 = i8 << 1;
        if (m31149h(1, i9, i, i2)) {
            return i12 | 1;
        }
        return i12;
    }

    /* renamed from: f */
    private int m31147f(int i, int i2) {
        int i3 = i - 1;
        int i4 = (m31149h(i3, 0, i, i2) ? 1 : 0) << true;
        int i5 = i2 - 1;
        if (m31149h(i3, i5, i, i2)) {
            i4 |= 1;
        }
        int i6 = i4 << 1;
        int i7 = i2 - 3;
        if (m31149h(0, i7, i, i2)) {
            i6 |= 1;
        }
        int i8 = i6 << 1;
        int i9 = i2 - 2;
        if (m31149h(0, i9, i, i2)) {
            i8 |= 1;
        }
        int i12 = i8 << 1;
        if (m31149h(0, i5, i, i2)) {
            i12 |= 1;
        }
        int i13 = i12 << 1;
        if (m31149h(1, i7, i, i2)) {
            i13 |= 1;
        }
        int i14 = i13 << 1;
        if (m31149h(1, i9, i, i2)) {
            i14 |= 1;
        }
        int i15 = i14 << 1;
        if (m31149h(1, i5, i, i2)) {
            return i15 | 1;
        }
        return i15;
    }

    /* renamed from: g */
    private int m31148g(int i, int i2) {
        int i3 = (m31149h(i + -3, 0, i, i2) ? 1 : 0) << true;
        if (m31149h(i - 2, 0, i, i2)) {
            i3 |= 1;
        }
        int i4 = i3 << 1;
        if (m31149h(i - 1, 0, i, i2)) {
            i4 |= 1;
        }
        int i5 = i4 << 1;
        if (m31149h(0, i2 - 2, i, i2)) {
            i5 |= 1;
        }
        int i6 = i5 << 1;
        int i7 = i2 - 1;
        if (m31149h(0, i7, i, i2)) {
            i6 |= 1;
        }
        int i8 = i6 << 1;
        if (m31149h(1, i7, i, i2)) {
            i8 |= 1;
        }
        int i9 = i8 << 1;
        if (m31149h(2, i7, i, i2)) {
            i9 |= 1;
        }
        int i12 = i9 << 1;
        if (m31149h(3, i7, i, i2)) {
            return i12 | 1;
        }
        return i12;
    }

    /* renamed from: h */
    private boolean m31149h(int i, int i2, int i3, int i4) {
        if (i < 0) {
            i += i3;
            i2 += 4 - ((i3 + 4) & 7);
        }
        if (i2 < 0) {
            i2 += i4;
            i += 4 - ((i4 + 4) & 7);
        }
        this.f23486b.mo21984n(i2, i);
        return this.f23485a.mo21974e(i2, i);
    }

    /* renamed from: i */
    private int m31150i(int i, int i2, int i3, int i4) {
        int i5 = i - 2;
        int i6 = i2 - 2;
        int i7 = (m31149h(i5, i6, i3, i4) ? 1 : 0) << true;
        int i8 = i2 - 1;
        if (m31149h(i5, i8, i3, i4)) {
            i7 |= 1;
        }
        int i9 = i7 << 1;
        int i12 = i - 1;
        if (m31149h(i12, i6, i3, i4)) {
            i9 |= 1;
        }
        int i13 = i9 << 1;
        if (m31149h(i12, i8, i3, i4)) {
            i13 |= 1;
        }
        int i14 = i13 << 1;
        if (m31149h(i12, i2, i3, i4)) {
            i14 |= 1;
        }
        int i15 = i14 << 1;
        if (m31149h(i, i6, i3, i4)) {
            i15 |= 1;
        }
        int i16 = i15 << 1;
        if (m31149h(i, i8, i3, i4)) {
            i16 |= 1;
        }
        int i17 = i16 << 1;
        if (m31149h(i, i2, i3, i4)) {
            return i17 | 1;
        }
        return i17;
    }

    /* renamed from: j */
    private static C8297e m31151j(C7508b bVar) {
        return C8297e.m31169h(bVar.mo21978h(), bVar.mo21982l());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C8297e mo23451b() {
        return this.f23487c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public byte[] mo23452c() {
        byte[] bArr = new byte[this.f23487c.mo23461g()];
        int h = this.f23485a.mo21978h();
        int l = this.f23485a.mo21982l();
        int i = 0;
        boolean z = false;
        int i2 = 0;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        int i3 = 4;
        while (true) {
            if (i3 == h && i == 0 && !z) {
                bArr[i2] = (byte) m31145d(h, l);
                i3 -= 2;
                i += 2;
                i2++;
                z = true;
            } else {
                int i4 = h - 2;
                if (i3 == i4 && i == 0 && (l & 3) != 0 && !z2) {
                    bArr[i2] = (byte) m31146e(h, l);
                    i3 -= 2;
                    i += 2;
                    i2++;
                    z2 = true;
                } else if (i3 == h + 4 && i == 2 && (l & 7) == 0 && !z3) {
                    bArr[i2] = (byte) m31147f(h, l);
                    i3 -= 2;
                    i += 2;
                    i2++;
                    z3 = true;
                } else if (i3 == i4 && i == 0 && (l & 7) == 4 && !z4) {
                    bArr[i2] = (byte) m31148g(h, l);
                    i3 -= 2;
                    i += 2;
                    i2++;
                    z4 = true;
                } else {
                    do {
                        if (i3 < h && i >= 0 && !this.f23486b.mo21974e(i, i3)) {
                            bArr[i2] = (byte) m31150i(i3, i, h, l);
                            i2++;
                        }
                        i3 -= 2;
                        i += 2;
                        if (i3 < 0) {
                            break;
                        }
                    } while (i < l);
                    int i5 = i3 + 1;
                    int i6 = i + 3;
                    do {
                        if (i5 >= 0 && i6 < l && !this.f23486b.mo21974e(i6, i5)) {
                            bArr[i2] = (byte) m31150i(i5, i6, h, l);
                            i2++;
                        }
                        i5 += 2;
                        i6 -= 2;
                        if (i5 >= h) {
                            break;
                        }
                    } while (i6 >= 0);
                    i3 = i5 + 3;
                    i = i6 + 1;
                }
            }
            if (i3 >= h && i >= l) {
                break;
            }
        }
        if (i2 == this.f23487c.mo23461g()) {
            return bArr;
        }
        throw FormatException.m23153a();
    }
}
