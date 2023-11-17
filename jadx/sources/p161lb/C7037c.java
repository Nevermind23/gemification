package p161lb;

import p200ob.C7507a;
import p200ob.C7508b;
import p226qb.C8001a;
import p226qb.C8004d;

/* renamed from: lb.c */
public abstract class C7037c {

    /* renamed from: a */
    private static final int[] f20952a = {4, 6, 6, 8, 8, 8, 8, 8, 8, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12};

    /* renamed from: a */
    private static int[] m27250a(C7507a aVar, int i, int i2) {
        int i3;
        int[] iArr = new int[i2];
        int l = aVar.mo21961l() / i;
        for (int i4 = 0; i4 < l; i4++) {
            int i5 = 0;
            for (int i6 = 0; i6 < i; i6++) {
                if (aVar.mo21956g((i4 * i) + i6)) {
                    i3 = 1 << ((i - i6) - 1);
                } else {
                    i3 = 0;
                }
                i5 |= i3;
            }
            iArr[i4] = i5;
        }
        return iArr;
    }

    /* renamed from: b */
    private static void m27251b(C7508b bVar, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3 += 2) {
            int i4 = i - i3;
            int i5 = i4;
            while (true) {
                int i6 = i + i3;
                if (i5 > i6) {
                    break;
                }
                bVar.mo21984n(i5, i4);
                bVar.mo21984n(i5, i6);
                bVar.mo21984n(i4, i5);
                bVar.mo21984n(i6, i5);
                i5++;
            }
        }
        int i7 = i - i2;
        bVar.mo21984n(i7, i7);
        int i8 = i7 + 1;
        bVar.mo21984n(i8, i7);
        bVar.mo21984n(i7, i8);
        int i9 = i + i2;
        bVar.mo21984n(i9, i7);
        bVar.mo21984n(i9, i8);
        bVar.mo21984n(i9, i9 - 1);
    }

    /* renamed from: c */
    private static void m27252c(C7508b bVar, boolean z, int i, C7507a aVar) {
        int i2 = i / 2;
        int i3 = 0;
        if (z) {
            while (i3 < 7) {
                int i4 = (i2 - 3) + i3;
                if (aVar.mo21956g(i3)) {
                    bVar.mo21984n(i4, i2 - 5);
                }
                if (aVar.mo21956g(i3 + 7)) {
                    bVar.mo21984n(i2 + 5, i4);
                }
                if (aVar.mo21956g(20 - i3)) {
                    bVar.mo21984n(i4, i2 + 5);
                }
                if (aVar.mo21956g(27 - i3)) {
                    bVar.mo21984n(i2 - 5, i4);
                }
                i3++;
            }
            return;
        }
        while (i3 < 10) {
            int i5 = (i2 - 5) + i3 + (i3 / 5);
            if (aVar.mo21956g(i3)) {
                bVar.mo21984n(i5, i2 - 7);
            }
            if (aVar.mo21956g(i3 + 10)) {
                bVar.mo21984n(i2 + 7, i5);
            }
            if (aVar.mo21956g(29 - i3)) {
                bVar.mo21984n(i5, i2 + 7);
            }
            if (aVar.mo21956g(39 - i3)) {
                bVar.mo21984n(i2 - 7, i5);
            }
            i3++;
        }
    }

    /* renamed from: d */
    public static C7035a m27253d(byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        int i5;
        boolean z;
        C7507a aVar;
        int i6;
        int i7;
        boolean z2;
        int i8;
        C7507a a = new C7038d(bArr).mo21253a();
        int i9 = 11;
        int l = ((a.mo21961l() * i) / 100) + 11;
        int l2 = a.mo21961l() + l;
        int i12 = 32;
        boolean z3 = 0;
        boolean z4 = true;
        if (i2 != 0) {
            if (i2 < 0) {
                z = true;
            } else {
                z = false;
            }
            i4 = Math.abs(i2);
            if (z) {
                i12 = 4;
            }
            if (i4 <= i12) {
                i5 = m27258i(i4, z);
                i3 = f20952a[i4];
                int i13 = i5 - (i5 % i3);
                aVar = m27257h(a, i3);
                if (aVar.mo21961l() + l > i13) {
                    throw new IllegalArgumentException("Data to large for user specified layer");
                } else if (z && aVar.mo21961l() > (i3 << 6)) {
                    throw new IllegalArgumentException("Data to large for user specified layer");
                }
            } else {
                throw new IllegalArgumentException(String.format("Illegal value %s for layers", new Object[]{Integer.valueOf(i2)}));
            }
        } else {
            C7507a aVar2 = null;
            int i14 = 0;
            int i15 = 0;
            while (i14 <= 32) {
                if (i14 <= 3) {
                    z2 = z4;
                } else {
                    z2 = z3;
                }
                if (z2) {
                    i8 = i14 + 1;
                } else {
                    i8 = i14;
                }
                int i16 = m27258i(i8, z2);
                if (l2 <= i16) {
                    if (aVar2 == null || i15 != f20952a[i8]) {
                        int i17 = f20952a[i8];
                        i15 = i17;
                        aVar2 = m27257h(a, i17);
                    }
                    int i18 = i16 - (i16 % i15);
                    if ((!z2 || aVar2.mo21961l() <= (i15 << 6)) && aVar2.mo21961l() + l <= i18) {
                        aVar = aVar2;
                        i3 = i15;
                        z = z2;
                        i4 = i8;
                        i5 = i16;
                    }
                }
                i14++;
                z4 = z4;
                z3 = 0;
            }
            throw new IllegalArgumentException("Data too large for an Aztec code");
        }
        C7507a e = m27254e(aVar, i5, i3);
        int l3 = aVar.mo21961l() / i3;
        C7507a f = m27255f(z, i4, l3);
        if (!z) {
            i9 = 14;
        }
        int i19 = i9 + (i4 << 2);
        int[] iArr = new int[i19];
        int i22 = 2;
        if (z) {
            for (int i23 = z3; i23 < i19; i23++) {
                iArr[i23] = i23;
            }
            i6 = i19;
        } else {
            int i24 = i19 / 2;
            i6 = i19 + 1 + (((i24 - 1) / 15) * 2);
            int i25 = i6 / 2;
            for (int i26 = z3; i26 < i24; i26++) {
                int i27 = (i26 / 15) + i26;
                iArr[(i24 - i26) - (z4 ? 1 : 0)] = (i25 - i27) - 1;
                iArr[i24 + i26] = i27 + i25 + z4;
            }
        }
        C7508b bVar = new C7508b(i6);
        int i28 = z3;
        int i29 = i28;
        while (i28 < i4) {
            int i32 = (i4 - i28) << i22;
            if (z) {
                i7 = 9;
            } else {
                i7 = 12;
            }
            int i33 = i32 + i7;
            int i34 = z3;
            while (i34 < i33) {
                int i35 = i34 << 1;
                while (z3 < i22) {
                    if (e.mo21956g(i29 + i35 + z3)) {
                        int i36 = i28 << 1;
                        bVar.mo21984n(iArr[i36 + z3], iArr[i36 + i34]);
                    }
                    if (e.mo21956g((i33 << 1) + i29 + i35 + z3)) {
                        int i37 = i28 << 1;
                        bVar.mo21984n(iArr[i37 + i34], iArr[((i19 - 1) - i37) - z3]);
                    }
                    if (e.mo21956g((i33 << 2) + i29 + i35 + z3)) {
                        int i38 = (i19 - 1) - (i28 << 1);
                        bVar.mo21984n(iArr[i38 - z3], iArr[i38 - i34]);
                    }
                    if (e.mo21956g((i33 * 6) + i29 + i35 + z3)) {
                        int i39 = i28 << 1;
                        bVar.mo21984n(iArr[((i19 - 1) - i39) - i34], iArr[i39 + z3]);
                    }
                    z3++;
                    i22 = 2;
                }
                i34++;
                z3 = 0;
                i22 = 2;
            }
            i29 += i33 << 3;
            i28++;
            z3 = 0;
            i22 = 2;
        }
        m27252c(bVar, z, i6, f);
        if (z) {
            m27251b(bVar, i6 / 2, 5);
        } else {
            int i42 = i6 / 2;
            m27251b(bVar, i42, 7);
            int i43 = 0;
            int i44 = 0;
            while (i44 < (i19 / 2) - 1) {
                for (int i45 = i42 & 1; i45 < i6; i45 += 2) {
                    int i46 = i42 - i43;
                    bVar.mo21984n(i46, i45);
                    int i47 = i42 + i43;
                    bVar.mo21984n(i47, i45);
                    bVar.mo21984n(i45, i46);
                    bVar.mo21984n(i45, i47);
                }
                i44 += 15;
                i43 += 16;
            }
        }
        C7035a aVar3 = new C7035a();
        aVar3.mo21247c(z);
        aVar3.mo21250f(i6);
        aVar3.mo21248d(i4);
        aVar3.mo21246b(l3);
        aVar3.mo21249e(bVar);
        return aVar3;
    }

    /* renamed from: e */
    private static C7507a m27254e(C7507a aVar, int i, int i2) {
        C8004d dVar = new C8004d(m27256g(i2));
        int i3 = i / i2;
        int[] a = m27250a(aVar, i2, i3);
        dVar.mo23156b(a, i3 - (aVar.mo21961l() / i2));
        C7507a aVar2 = new C7507a();
        aVar2.mo21951c(0, i % i2);
        for (int c : a) {
            aVar2.mo21951c(c, i2);
        }
        return aVar2;
    }

    /* renamed from: f */
    static C7507a m27255f(boolean z, int i, int i2) {
        C7507a aVar = new C7507a();
        if (z) {
            aVar.mo21951c(i - 1, 2);
            aVar.mo21951c(i2 - 1, 6);
            return m27254e(aVar, 28, 4);
        }
        aVar.mo21951c(i - 1, 5);
        aVar.mo21951c(i2 - 1, 11);
        return m27254e(aVar, 40, 4);
    }

    /* renamed from: g */
    private static C8001a m27256g(int i) {
        if (i == 4) {
            return C8001a.f23054k;
        }
        if (i == 6) {
            return C8001a.f23053j;
        }
        if (i == 8) {
            return C8001a.f23057n;
        }
        if (i == 10) {
            return C8001a.f23052i;
        }
        if (i == 12) {
            return C8001a.f23051h;
        }
        throw new IllegalArgumentException("Unsupported word size ".concat(String.valueOf(i)));
    }

    /* renamed from: h */
    static C7507a m27257h(C7507a aVar, int i) {
        C7507a aVar2 = new C7507a();
        int l = aVar.mo21961l();
        int i2 = (1 << i) - 2;
        int i3 = 0;
        while (i3 < l) {
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                int i6 = i3 + i5;
                if (i6 >= l || aVar.mo21956g(i6)) {
                    i4 |= 1 << ((i - 1) - i5);
                }
            }
            int i7 = i4 & i2;
            if (i7 == i2) {
                aVar2.mo21951c(i7, i);
            } else if (i7 == 0) {
                aVar2.mo21951c(i4 | 1, i);
            } else {
                aVar2.mo21951c(i4, i);
                i3 += i;
            }
            i3--;
            i3 += i;
        }
        return aVar2;
    }

    /* renamed from: i */
    private static int m27258i(int i, boolean z) {
        return ((z ? 88 : 112) + (i << 4)) * i;
    }
}
