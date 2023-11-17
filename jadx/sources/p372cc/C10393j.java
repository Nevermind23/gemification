package p372cc;

import com.google.zxing.C5766o;
import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import p200ob.C7508b;
import p200ob.C7511e;
import p358bc.C10222a;
import p387dc.C12070a;

/* renamed from: cc.j */
public abstract class C10393j {

    /* renamed from: a */
    private static final C12070a f29600a = new C12070a();

    /* renamed from: a */
    private static C10384c m37774a(C10391h hVar) {
        int[] j;
        if (hVar == null || (j = hVar.mo27048j()) == null) {
            return null;
        }
        int p = m37789p(j);
        int i = 0;
        int i2 = 0;
        for (int i3 : j) {
            i2 += p - i3;
            if (i3 > 0) {
                break;
            }
        }
        C10385d[] d = hVar.mo27042d();
        int i4 = 0;
        while (i2 > 0 && d[i4] == null) {
            i2--;
            i4++;
        }
        for (int length = j.length - 1; length >= 0; length--) {
            int i5 = j[length];
            i += p - i5;
            if (i5 > 0) {
                break;
            }
        }
        int length2 = d.length - 1;
        while (i > 0 && d[length2] == null) {
            i--;
            length2--;
        }
        return hVar.mo27039a().mo27010a(i2, i, hVar.mo27049k());
    }

    /* renamed from: b */
    private static void m37775b(C10389f fVar, C10383b[][] bVarArr) {
        C10383b bVar = bVarArr[0][1];
        int[] a = bVar.mo27008a();
        int j = (fVar.mo27030j() * fVar.mo27032l()) - m37791r(fVar.mo27031k());
        if (a.length == 0) {
            if (j <= 0 || j > 928) {
                throw NotFoundException.m23155a();
            }
            bVar.mo27009b(j);
        } else if (a[0] != j && j > 0 && j <= 928) {
            bVar.mo27009b(j);
        }
    }

    /* renamed from: c */
    private static int m37776c(C7508b bVar, int i, int i2, boolean z, int i3, int i4) {
        int i5;
        if (z) {
            i5 = -1;
        } else {
            i5 = 1;
        }
        int i6 = i3;
        for (int i7 = 0; i7 < 2; i7++) {
            while (true) {
                if (!z) {
                    if (i6 >= i2) {
                        continue;
                        break;
                    }
                } else if (i6 < i) {
                    continue;
                    break;
                }
                if (z != bVar.mo21974e(i6, i4)) {
                    continue;
                    break;
                } else if (Math.abs(i3 - i6) > 2) {
                    return i3;
                } else {
                    i6 += i5;
                }
            }
            i5 = -i5;
            z = !z;
        }
        return i6;
    }

    /* renamed from: d */
    private static boolean m37777d(int i, int i2, int i3) {
        return i2 + -2 <= i && i <= i3 + 2;
    }

    /* renamed from: e */
    private static int m37778e(int[] iArr, int[] iArr2, int i) {
        if ((iArr2 == null || iArr2.length <= (i / 2) + 3) && i >= 0 && i <= 512) {
            return f29600a.mo32194a(iArr, i, iArr2);
        }
        throw ChecksumException.m23152a();
    }

    /* renamed from: f */
    private static C10383b[][] m37779f(C10389f fVar) {
        int c;
        int l = fVar.mo27032l();
        int[] iArr = new int[2];
        iArr[1] = fVar.mo27030j() + 2;
        iArr[0] = l;
        C10383b[][] bVarArr = (C10383b[][]) Array.newInstance(C10383b.class, iArr);
        for (C10383b[] bVarArr2 : bVarArr) {
            int i = 0;
            while (true) {
                if (i >= bVarArr2.length) {
                    break;
                }
                bVarArr2[i] = new C10383b();
                i++;
            }
        }
        int i2 = 0;
        for (C10390g gVar : fVar.mo27035o()) {
            if (gVar != null) {
                for (C10385d dVar : gVar.mo27042d()) {
                    if (dVar != null && (c = dVar.mo27021c()) >= 0 && c < bVarArr.length) {
                        bVarArr[c][i2].mo27009b(dVar.mo27023e());
                    }
                }
            }
            i2++;
        }
        return bVarArr;
    }

    /* renamed from: g */
    private static C7511e m37780g(C10389f fVar) {
        C10383b[][] f = m37779f(fVar);
        m37775b(fVar, f);
        ArrayList arrayList = new ArrayList();
        int[] iArr = new int[(fVar.mo27032l() * fVar.mo27030j())];
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (int i = 0; i < fVar.mo27032l(); i++) {
            int i2 = 0;
            while (i2 < fVar.mo27030j()) {
                int i3 = i2 + 1;
                int[] a = f[i][i3].mo27008a();
                int j = (fVar.mo27030j() * i) + i2;
                if (a.length == 0) {
                    arrayList.add(Integer.valueOf(j));
                } else if (a.length == 1) {
                    iArr[j] = a[0];
                } else {
                    arrayList3.add(Integer.valueOf(j));
                    arrayList2.add(a);
                }
                i2 = i3;
            }
        }
        int size = arrayList2.size();
        int[][] iArr2 = new int[size][];
        for (int i4 = 0; i4 < size; i4++) {
            iArr2[i4] = (int[]) arrayList2.get(i4);
        }
        return m37781h(fVar.mo27031k(), iArr, C10222a.m37297b(arrayList), C10222a.m37297b(arrayList3), iArr2);
    }

    /* renamed from: h */
    private static C7511e m37781h(int i, int[] iArr, int[] iArr2, int[] iArr3, int[][] iArr4) {
        int length = iArr3.length;
        int[] iArr5 = new int[length];
        int i2 = 100;
        while (true) {
            int i3 = i2 - 1;
            if (i2 > 0) {
                for (int i4 = 0; i4 < length; i4++) {
                    iArr[iArr3[i4]] = iArr4[i4][iArr5[i4]];
                }
                try {
                    return m37783j(iArr, i, iArr2);
                } catch (ChecksumException unused) {
                    if (length != 0) {
                        int i5 = 0;
                        while (true) {
                            if (i5 >= length) {
                                break;
                            }
                            int i6 = iArr5[i5];
                            if (i6 < iArr4[i5].length - 1) {
                                iArr5[i5] = i6 + 1;
                                break;
                            }
                            iArr5[i5] = 0;
                            if (i5 != length - 1) {
                                i5++;
                            } else {
                                throw ChecksumException.m23152a();
                            }
                        }
                        i2 = i3;
                    } else {
                        throw ChecksumException.m23152a();
                    }
                }
            } else {
                throw ChecksumException.m23152a();
            }
        }
    }

    /* renamed from: i */
    public static C7511e m37782i(C7508b bVar, C5766o oVar, C5766o oVar2, C5766o oVar3, C5766o oVar4, int i, int i2) {
        C10384c cVar;
        C10389f v;
        boolean z;
        int i3;
        C10390g hVar;
        boolean z2;
        int i4;
        int i5;
        C10390g gVar;
        int i6;
        int i7;
        C10384c cVar2 = new C10384c(bVar, oVar, oVar2, oVar3, oVar4);
        C10391h hVar2 = null;
        boolean z3 = true;
        C10391h hVar3 = null;
        boolean z4 = true;
        while (true) {
            cVar = cVar2;
            if (oVar != null) {
                hVar2 = m37792s(bVar, cVar, oVar, true, i, i2);
            }
            if (oVar3 != null) {
                hVar3 = m37792s(bVar, cVar, oVar3, false, i, i2);
            }
            v = m37795v(hVar2, hVar3);
            if (v != null) {
                cVar2 = v.mo27033m();
                if (!z4 || cVar2 == null || (cVar2.mo27016g() >= cVar.mo27016g() && cVar2.mo27014e() <= cVar.mo27014e())) {
                    v.mo27036p(cVar);
                    int j = v.mo27030j() + 1;
                    v.mo27037q(0, hVar2);
                    v.mo27037q(j, hVar3);
                } else {
                    z4 = false;
                }
            } else {
                throw NotFoundException.m23155a();
            }
        }
        v.mo27036p(cVar);
        int j2 = v.mo27030j() + 1;
        v.mo27037q(0, hVar2);
        v.mo27037q(j2, hVar3);
        if (hVar2 != null) {
            z = true;
        } else {
            z = false;
        }
        int i8 = i;
        int i9 = i2;
        int i12 = 1;
        while (i12 <= j2) {
            if (z) {
                i3 = i12;
            } else {
                i3 = j2 - i12;
            }
            if (v.mo27034n(i3) == null) {
                if (i3 == 0 || i3 == j2) {
                    if (i3 == 0) {
                        z2 = z3;
                    } else {
                        z2 = false;
                    }
                    hVar = new C10391h(cVar, z2);
                } else {
                    hVar = new C10390g(cVar);
                }
                C10390g gVar2 = hVar;
                v.mo27037q(i3, gVar2);
                int i13 = -1;
                int g = cVar.mo27016g();
                int i14 = -1;
                while (g <= cVar.mo27014e()) {
                    int t = m37793t(v, i3, g, z);
                    if (t >= 0 && t <= cVar.mo27013d()) {
                        i7 = t;
                    } else if (i14 != i13) {
                        i7 = i14;
                    } else {
                        i6 = i14;
                        i5 = g;
                        i4 = i13;
                        gVar = gVar2;
                        i14 = i6;
                        g = i5 + 1;
                        gVar2 = gVar;
                        i13 = i4;
                    }
                    i6 = i14;
                    int i15 = g;
                    i4 = i13;
                    gVar = gVar2;
                    C10385d k = m37784k(bVar, cVar.mo27015f(), cVar.mo27013d(), z, i7, i15, i8, i9);
                    i5 = i15;
                    if (k != null) {
                        gVar.mo27044f(i5, k);
                        i8 = Math.min(i8, k.mo27024f());
                        i9 = Math.max(i9, k.mo27024f());
                        i14 = i7;
                        g = i5 + 1;
                        gVar2 = gVar;
                        i13 = i4;
                    }
                    i14 = i6;
                    g = i5 + 1;
                    gVar2 = gVar;
                    i13 = i4;
                }
            }
            i12++;
            z3 = true;
        }
        return m37780g(v);
    }

    /* renamed from: j */
    private static C7511e m37783j(int[] iArr, int i, int[] iArr2) {
        if (iArr.length != 0) {
            int i2 = 1 << (i + 1);
            int e = m37778e(iArr, iArr2, i2);
            m37796w(iArr, i2);
            C7511e b = C10386e.m37733b(iArr, String.valueOf(i));
            b.mo22004k(Integer.valueOf(e));
            b.mo22003j(Integer.valueOf(iArr2.length));
            return b;
        }
        throw FormatException.m23153a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0040, code lost:
        r7 = p372cc.C10392i.m37772d(r7);
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static p372cc.C10385d m37784k(p200ob.C7508b r7, int r8, int r9, boolean r10, int r11, int r12, int r13, int r14) {
        /*
            int r11 = m37776c(r7, r8, r9, r10, r11, r12)
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            int[] r7 = m37790q(r0, r1, r2, r3, r4, r5)
            r8 = 0
            if (r7 != 0) goto L_0x0012
            return r8
        L_0x0012:
            int r9 = p213pb.C7798a.m29510d(r7)
            if (r10 == 0) goto L_0x001b
            int r10 = r11 + r9
            goto L_0x0039
        L_0x001b:
            r10 = 0
        L_0x001c:
            int r12 = r7.length
            int r12 = r12 / 2
            if (r10 >= r12) goto L_0x0034
            r12 = r7[r10]
            int r0 = r7.length
            int r0 = r0 + -1
            int r0 = r0 - r10
            r0 = r7[r0]
            r7[r10] = r0
            int r0 = r7.length
            int r0 = r0 + -1
            int r0 = r0 - r10
            r7[r0] = r12
            int r10 = r10 + 1
            goto L_0x001c
        L_0x0034:
            int r10 = r11 - r9
            r6 = r11
            r11 = r10
            r10 = r6
        L_0x0039:
            boolean r9 = m37777d(r9, r13, r14)
            if (r9 != 0) goto L_0x0040
            return r8
        L_0x0040:
            int r7 = p372cc.C10392i.m37772d(r7)
            int r9 = p358bc.C10222a.m37296a(r7)
            r12 = -1
            if (r9 != r12) goto L_0x004c
            return r8
        L_0x004c:
            cc.d r8 = new cc.d
            int r7 = m37787n(r7)
            r8.<init>(r11, r10, r7, r9)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p372cc.C10393j.m37784k(ob.b, int, int, boolean, int, int, int, int):cc.d");
    }

    /* renamed from: l */
    private static C10382a m37785l(C10391h hVar, C10391h hVar2) {
        C10382a i;
        C10382a i2;
        if (hVar == null || (i = hVar.mo27047i()) == null) {
            if (hVar2 == null) {
                return null;
            }
            return hVar2.mo27047i();
        } else if (hVar2 == null || (i2 = hVar2.mo27047i()) == null || i.mo27003a() == i2.mo27003a() || i.mo27004b() == i2.mo27004b() || i.mo27005c() == i2.mo27005c()) {
            return i;
        } else {
            return null;
        }
    }

    /* renamed from: m */
    private static int[] m37786m(int i) {
        int[] iArr = new int[8];
        int i2 = 0;
        int i3 = 7;
        while (true) {
            int i4 = i & 1;
            if (i4 != i2) {
                i3--;
                if (i3 < 0) {
                    return iArr;
                }
                i2 = i4;
            }
            iArr[i3] = iArr[i3] + 1;
            i >>= 1;
        }
    }

    /* renamed from: n */
    private static int m37787n(int i) {
        return m37788o(m37786m(i));
    }

    /* renamed from: o */
    private static int m37788o(int[] iArr) {
        return ((((iArr[0] - iArr[2]) + iArr[4]) - iArr[6]) + 9) % 9;
    }

    /* renamed from: p */
    private static int m37789p(int[] iArr) {
        int i = -1;
        for (int max : iArr) {
            i = Math.max(i, max);
        }
        return i;
    }

    /* renamed from: q */
    private static int[] m37790q(C7508b bVar, int i, int i2, boolean z, int i3, int i4) {
        int i5;
        int[] iArr = new int[8];
        if (z) {
            i5 = 1;
        } else {
            i5 = -1;
        }
        int i6 = 0;
        boolean z2 = z;
        while (true) {
            if (!z) {
                if (i3 < i) {
                    break;
                }
            } else if (i3 >= i2) {
                break;
            }
            if (i6 >= 8) {
                break;
            } else if (bVar.mo21974e(i3, i4) == z2) {
                iArr[i6] = iArr[i6] + 1;
                i3 += i5;
            } else {
                i6++;
                z2 = !z2;
            }
        }
        if (i6 != 8) {
            if (z) {
                i = i2;
            }
            if (!(i3 == i && i6 == 7)) {
                return null;
            }
        }
        return iArr;
    }

    /* renamed from: r */
    private static int m37791r(int i) {
        return 2 << i;
    }

    /* renamed from: s */
    private static C10391h m37792s(C7508b bVar, C10384c cVar, C5766o oVar, boolean z, int i, int i2) {
        int i3;
        int i4;
        boolean z2 = z;
        C10391h hVar = new C10391h(cVar, z2);
        for (int i5 = 0; i5 < 2; i5++) {
            if (i5 == 0) {
                i3 = 1;
            } else {
                i3 = -1;
            }
            int i6 = i3;
            int c = (int) oVar.mo18901c();
            int d = (int) oVar.mo18902d();
            while (d <= cVar.mo27014e() && d >= cVar.mo27016g()) {
                C10385d k = m37784k(bVar, 0, bVar.mo21982l(), z, c, d, i, i2);
                if (k != null) {
                    hVar.mo27044f(d, k);
                    if (z2) {
                        i4 = k.mo27022d();
                    } else {
                        i4 = k.mo27020b();
                    }
                    c = i4;
                }
                d += i6;
            }
        }
        return hVar;
    }

    /* renamed from: t */
    private static int m37793t(C10389f fVar, int i, int i2, boolean z) {
        int i3;
        C10385d dVar;
        int i4;
        if (z) {
            i3 = 1;
        } else {
            i3 = -1;
        }
        int i5 = i - i3;
        if (m37794u(fVar, i5)) {
            dVar = fVar.mo27034n(i5).mo27040b(i2);
        } else {
            dVar = null;
        }
        if (dVar == null) {
            C10385d c = fVar.mo27034n(i).mo27041c(i2);
            if (c == null) {
                if (m37794u(fVar, i5)) {
                    c = fVar.mo27034n(i5).mo27041c(i2);
                }
                if (c == null) {
                    int i6 = 0;
                    while (true) {
                        i -= i3;
                        if (m37794u(fVar, i)) {
                            for (C10385d dVar2 : fVar.mo27034n(i).mo27042d()) {
                                if (dVar2 != null) {
                                    if (z) {
                                        i4 = dVar2.mo27020b();
                                    } else {
                                        i4 = dVar2.mo27022d();
                                    }
                                    return i4 + (i3 * i6 * (dVar2.mo27020b() - dVar2.mo27022d()));
                                }
                            }
                            i6++;
                        } else {
                            C10384c m = fVar.mo27033m();
                            if (z) {
                                return m.mo27015f();
                            }
                            return m.mo27013d();
                        }
                    }
                } else if (z) {
                    return c.mo27020b();
                } else {
                    return c.mo27022d();
                }
            } else if (z) {
                return c.mo27022d();
            } else {
                return c.mo27020b();
            }
        } else if (z) {
            return dVar.mo27020b();
        } else {
            return dVar.mo27022d();
        }
    }

    /* renamed from: u */
    private static boolean m37794u(C10389f fVar, int i) {
        return i >= 0 && i <= fVar.mo27030j() + 1;
    }

    /* renamed from: v */
    private static C10389f m37795v(C10391h hVar, C10391h hVar2) {
        C10382a l;
        if ((hVar == null && hVar2 == null) || (l = m37785l(hVar, hVar2)) == null) {
            return null;
        }
        return new C10389f(l, C10384c.m37712j(m37774a(hVar), m37774a(hVar2)));
    }

    /* renamed from: w */
    private static void m37796w(int[] iArr, int i) {
        if (iArr.length >= 4) {
            int i2 = iArr[0];
            if (i2 > iArr.length) {
                throw FormatException.m23153a();
            } else if (i2 != 0) {
            } else {
                if (i < iArr.length) {
                    iArr[0] = iArr.length - i;
                    return;
                }
                throw FormatException.m23153a();
            }
        } else {
            throw FormatException.m23153a();
        }
    }
}
