package p677yb;

/* renamed from: yb.f */
public abstract class C18876f {
    /* renamed from: a */
    private static int m63881a(int i, int i2) {
        int i3 = i - i2;
        if (i3 <= i2) {
            int i4 = i3;
            i3 = i2;
            i2 = i4;
        }
        int i5 = 1;
        int i6 = 1;
        while (i > i3) {
            i5 *= i;
            if (i6 <= i2) {
                i5 /= i6;
                i6++;
            }
            i--;
        }
        while (i6 <= i2) {
            i5 /= i6;
            i6++;
        }
        return i5;
    }

    /* renamed from: b */
    public static int m63882b(int[] iArr, int i, boolean z) {
        int[] iArr2 = iArr;
        int i2 = i;
        int i3 = 0;
        for (int i4 : iArr2) {
            i3 += i4;
        }
        int length = iArr2.length;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            int i8 = length - 1;
            if (i5 >= i8) {
                return i6;
            }
            int i9 = 1 << i5;
            i7 |= i9;
            int i12 = 1;
            while (i12 < iArr2[i5]) {
                int i13 = i3 - i12;
                int i14 = length - i5;
                int i15 = i14 - 2;
                int a = m63881a(i13 - 1, i15);
                if (z && i7 == 0) {
                    int i16 = i14 - 1;
                    if (i13 - i16 >= i16) {
                        a -= m63881a(i13 - i14, i15);
                    }
                }
                if (i14 - 1 > 1) {
                    int i17 = i13 - i15;
                    int i18 = 0;
                    while (i17 > i2) {
                        i18 += m63881a((i13 - i17) - 1, i14 - 3);
                        i17--;
                        int[] iArr3 = iArr;
                    }
                    a -= i18 * (i8 - i5);
                } else if (i13 > i2) {
                    a--;
                }
                i6 += a;
                i12++;
                i7 &= ~i9;
                iArr2 = iArr;
            }
            i3 -= i12;
            i5++;
            iArr2 = iArr;
        }
    }
}
