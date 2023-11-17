package p401ec;

import com.github.mikephil.charting.utils.Utils;
import com.google.zxing.C5753c;
import com.google.zxing.C5766o;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import p200ob.C7508b;

/* renamed from: ec.a */
public abstract class C12421a {

    /* renamed from: a */
    private static final int[] f37086a = {0, 4, 1, 5};

    /* renamed from: b */
    private static final int[] f37087b = {6, 2, 7, 3};

    /* renamed from: c */
    private static final int[] f37088c = {8, 1, 1, 1, 1, 1, 1, 3};

    /* renamed from: d */
    private static final int[] f37089d = {7, 1, 1, 3, 1, 1, 1, 2, 1};

    /* renamed from: a */
    private static void m47432a(C5766o[] oVarArr, C5766o[] oVarArr2, int[] iArr) {
        for (int i = 0; i < iArr.length; i++) {
            oVarArr[iArr[i]] = oVarArr2[i];
        }
    }

    /* renamed from: b */
    public static C12422b m47433b(C5753c cVar, Map map, boolean z) {
        C7508b a = cVar.mo18870a();
        List c = m47434c(z, a);
        if (c.isEmpty()) {
            a = a.clone();
            a.mo21983m();
            c = m47434c(z, a);
        }
        return new C12422b(a, c);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0027, code lost:
        if (r3.hasNext() == false) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0029, code lost:
        r4 = (com.google.zxing.C5766o[]) r3.next();
        r7 = r4[1];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0031, code lost:
        if (r7 == null) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0033, code lost:
        r2 = (int) java.lang.Math.max((float) r2, r7.mo18902d());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003d, code lost:
        r4 = r4[3];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003f, code lost:
        if (r4 == null) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0041, code lost:
        r2 = java.lang.Math.max(r2, (int) r4.mo18902d());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001d, code lost:
        if (r4 == 0) goto L_0x0077;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001f, code lost:
        r3 = r0.iterator();
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.List m47434c(boolean r8, p200ob.C7508b r9) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            r2 = r1
            r3 = r2
        L_0x0008:
            r4 = r3
        L_0x0009:
            int r5 = r9.mo21978h()
            if (r2 >= r5) goto L_0x0077
            com.google.zxing.o[] r3 = m47437f(r9, r2, r3)
            r5 = r3[r1]
            r6 = 1
            if (r5 != 0) goto L_0x004f
            r5 = 3
            r7 = r3[r5]
            if (r7 != 0) goto L_0x004f
            if (r4 == 0) goto L_0x0077
            java.util.Iterator r3 = r0.iterator()
        L_0x0023:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x004b
            java.lang.Object r4 = r3.next()
            com.google.zxing.o[] r4 = (com.google.zxing.C5766o[]) r4
            r7 = r4[r6]
            if (r7 == 0) goto L_0x003d
            float r2 = (float) r2
            float r7 = r7.mo18902d()
            float r2 = java.lang.Math.max(r2, r7)
            int r2 = (int) r2
        L_0x003d:
            r4 = r4[r5]
            if (r4 == 0) goto L_0x0023
            float r4 = r4.mo18902d()
            int r4 = (int) r4
            int r2 = java.lang.Math.max(r2, r4)
            goto L_0x0023
        L_0x004b:
            int r2 = r2 + 5
            r3 = r1
            goto L_0x0008
        L_0x004f:
            r0.add(r3)
            if (r8 == 0) goto L_0x0077
            r2 = 2
            r4 = r3[r2]
            if (r4 == 0) goto L_0x0065
            float r4 = r4.mo18901c()
            int r4 = (int) r4
            r2 = r3[r2]
            float r2 = r2.mo18902d()
            goto L_0x0073
        L_0x0065:
            r2 = 4
            r4 = r3[r2]
            float r4 = r4.mo18901c()
            int r4 = (int) r4
            r2 = r3[r2]
            float r2 = r2.mo18902d()
        L_0x0073:
            int r2 = (int) r2
            r3 = r4
            r4 = r6
            goto L_0x0009
        L_0x0077:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p401ec.C12421a.m47434c(boolean, ob.b):java.util.List");
    }

    /* renamed from: d */
    private static int[] m47435d(C7508b bVar, int i, int i2, int i3, int[] iArr, int[] iArr2) {
        Arrays.fill(iArr2, 0, iArr2.length, 0);
        int i4 = 0;
        while (bVar.mo21974e(i, i2) && i > 0) {
            int i5 = i4 + 1;
            if (i4 >= 3) {
                break;
            }
            i--;
            i4 = i5;
        }
        int length = iArr.length;
        int i6 = i;
        int i7 = 0;
        boolean z = false;
        while (i < i3) {
            if (bVar.mo21974e(i, i2) != z) {
                iArr2[i7] = iArr2[i7] + 1;
            } else {
                if (i7 != length - 1) {
                    i7++;
                } else if (m47438g(iArr2, iArr) < 0.42f) {
                    return new int[]{i6, i};
                } else {
                    i6 += iArr2[0] + iArr2[1];
                    int i8 = i7 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i8);
                    iArr2[i8] = 0;
                    iArr2[i7] = 0;
                    i7--;
                }
                iArr2[i7] = 1;
                z = !z;
            }
            i++;
        }
        if (i7 != length - 1 || m47438g(iArr2, iArr) >= 0.42f) {
            return null;
        }
        return new int[]{i6, i - 1};
    }

    /* renamed from: e */
    private static C5766o[] m47436e(C7508b bVar, int i, int i2, int i3, int i4, int[] iArr) {
        boolean z;
        int i5;
        int i6;
        int i7 = i;
        C5766o[] oVarArr = new C5766o[4];
        int[] iArr2 = new int[iArr.length];
        int i8 = i3;
        while (true) {
            if (i8 >= i7) {
                z = false;
                break;
            }
            int[] d = m47435d(bVar, i4, i8, i2, iArr, iArr2);
            if (d != null) {
                int i9 = i8;
                int[] iArr3 = d;
                int i12 = i9;
                while (true) {
                    if (i12 <= 0) {
                        i6 = i12;
                        break;
                    }
                    int i13 = i12 - 1;
                    int[] d2 = m47435d(bVar, i4, i13, i2, iArr, iArr2);
                    if (d2 == null) {
                        i6 = i13 + 1;
                        break;
                    }
                    iArr3 = d2;
                    i12 = i13;
                }
                float f = (float) i6;
                oVarArr[0] = new C5766o((float) iArr3[0], f);
                oVarArr[1] = new C5766o((float) iArr3[1], f);
                z = true;
                i8 = i6;
            } else {
                i8 += 5;
            }
        }
        int i14 = i8 + 1;
        if (z) {
            int[] iArr4 = {(int) oVarArr[0].mo18901c(), (int) oVarArr[1].mo18901c()};
            int i15 = i14;
            int i16 = 0;
            while (true) {
                if (i15 >= i7) {
                    i5 = i16;
                    break;
                }
                i5 = i16;
                int[] d3 = m47435d(bVar, iArr4[0], i15, i2, iArr, iArr2);
                if (d3 == null || Math.abs(iArr4[0] - d3[0]) >= 5 || Math.abs(iArr4[1] - d3[1]) >= 5) {
                    if (i5 > 25) {
                        break;
                    }
                    i16 = i5 + 1;
                } else {
                    iArr4 = d3;
                    i16 = 0;
                }
                i15++;
            }
            i14 = i15 - (i5 + 1);
            float f2 = (float) i14;
            oVarArr[2] = new C5766o((float) iArr4[0], f2);
            oVarArr[3] = new C5766o((float) iArr4[1], f2);
        }
        if (i14 - i8 < 10) {
            Arrays.fill(oVarArr, (Object) null);
        }
        return oVarArr;
    }

    /* renamed from: f */
    private static C5766o[] m47437f(C7508b bVar, int i, int i2) {
        int h = bVar.mo21978h();
        int l = bVar.mo21982l();
        C5766o[] oVarArr = new C5766o[8];
        m47432a(oVarArr, m47436e(bVar, h, l, i, i2, f37088c), f37086a);
        C5766o oVar = oVarArr[4];
        if (oVar != null) {
            i2 = (int) oVar.mo18901c();
            i = (int) oVarArr[4].mo18902d();
        }
        m47432a(oVarArr, m47436e(bVar, h, l, i, i2, f37089d), f37087b);
        return oVarArr;
    }

    /* renamed from: g */
    private static float m47438g(int[] iArr, int[] iArr2) {
        float f;
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            i += iArr[i3];
            i2 += iArr2[i3];
        }
        if (i < i2) {
            return Float.POSITIVE_INFINITY;
        }
        float f2 = (float) i;
        float f3 = f2 / ((float) i2);
        float f4 = 0.8f * f3;
        float f5 = Utils.FLOAT_EPSILON;
        for (int i4 = 0; i4 < length; i4++) {
            int i5 = iArr[i4];
            float f6 = ((float) iArr2[i4]) * f3;
            float f7 = (float) i5;
            if (f7 > f6) {
                f = f7 - f6;
            } else {
                f = f6 - f7;
            }
            if (f > f4) {
                return Float.POSITIVE_INFINITY;
            }
            f5 += f;
        }
        return f5 / f2;
    }
}
