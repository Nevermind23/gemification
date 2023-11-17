package p457ic;

import com.github.mikephil.charting.utils.Utils;
import com.google.zxing.C5754d;
import com.google.zxing.C5766o;
import com.google.zxing.C5767p;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import p200ob.C7508b;

/* renamed from: ic.e */
public class C15595e {

    /* renamed from: f */
    private static final C15597b f44292f = new C15597b();

    /* renamed from: a */
    private final C7508b f44293a;

    /* renamed from: b */
    private final List f44294b = new ArrayList();

    /* renamed from: c */
    private boolean f44295c;

    /* renamed from: d */
    private final int[] f44296d = new int[5];

    /* renamed from: e */
    private final C5767p f44297e;

    /* renamed from: ic.e$b */
    private static final class C15597b implements Serializable, Comparator {
        private C15597b() {
        }

        /* renamed from: a */
        public int compare(C15594d dVar, C15594d dVar2) {
            return Float.compare(dVar.mo42860i(), dVar2.mo42860i());
        }
    }

    public C15595e(C7508b bVar, C5767p pVar) {
        this.f44293a = bVar;
        this.f44297e = pVar;
    }

    /* renamed from: a */
    private static float m56317a(int[] iArr, int i) {
        return ((float) ((i - iArr[4]) - iArr[3])) - (((float) iArr[2]) / 2.0f);
    }

    /* renamed from: b */
    private boolean m56318b(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int[] k = m56326k();
        int i6 = 0;
        while (i >= i6 && i2 >= i6 && this.f44293a.mo21974e(i2 - i6, i - i6)) {
            k[2] = k[2] + 1;
            i6++;
        }
        if (k[2] == 0) {
            return false;
        }
        while (i >= i6 && i2 >= i6 && !this.f44293a.mo21974e(i2 - i6, i - i6)) {
            k[1] = k[1] + 1;
            i6++;
        }
        if (k[1] == 0) {
            return false;
        }
        while (i >= i6 && i2 >= i6 && this.f44293a.mo21974e(i2 - i6, i - i6)) {
            k[0] = k[0] + 1;
            i6++;
        }
        if (k[0] == 0) {
            return false;
        }
        int h = this.f44293a.mo21978h();
        int l = this.f44293a.mo21982l();
        int i7 = 1;
        while (true) {
            int i8 = i + i7;
            if (i8 < h && (i5 = i2 + i7) < l && this.f44293a.mo21974e(i5, i8)) {
                k[2] = k[2] + 1;
                i7++;
            }
        }
        while (true) {
            int i9 = i + i7;
            if (i9 < h && (i4 = i2 + i7) < l && !this.f44293a.mo21974e(i4, i9)) {
                k[3] = k[3] + 1;
                i7++;
            }
        }
        if (k[3] == 0) {
            return false;
        }
        while (true) {
            int i12 = i + i7;
            if (i12 < h && (i3 = i2 + i7) < l && this.f44293a.mo21974e(i3, i12)) {
                k[4] = k[4] + 1;
                i7++;
            }
        }
        if (k[4] == 0) {
            return false;
        }
        return m56325j(k);
    }

    /* renamed from: c */
    private float m56319c(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        C7508b bVar = this.f44293a;
        int l = bVar.mo21982l();
        int[] k = m56326k();
        int i8 = i;
        while (i8 >= 0 && bVar.mo21974e(i8, i2)) {
            k[2] = k[2] + 1;
            i8--;
        }
        if (i8 < 0) {
            return Float.NaN;
        }
        while (i8 >= 0 && !bVar.mo21974e(i8, i2)) {
            int i9 = k[1];
            if (i9 > i3) {
                break;
            }
            k[1] = i9 + 1;
            i8--;
        }
        if (i8 >= 0 && k[1] <= i3) {
            while (i8 >= 0 && bVar.mo21974e(i8, i2) && (i7 = k[0]) <= i3) {
                k[0] = i7 + 1;
                i8--;
            }
            if (k[0] > i3) {
                return Float.NaN;
            }
            int i12 = i + 1;
            while (i12 < l && bVar.mo21974e(i12, i2)) {
                k[2] = k[2] + 1;
                i12++;
            }
            if (i12 == l) {
                return Float.NaN;
            }
            while (i12 < l && !bVar.mo21974e(i12, i2) && (i6 = k[3]) < i3) {
                k[3] = i6 + 1;
                i12++;
            }
            if (i12 != l && k[3] < i3) {
                while (i12 < l && bVar.mo21974e(i12, i2) && (i5 = k[4]) < i3) {
                    k[4] = i5 + 1;
                    i12++;
                }
                int i13 = k[4];
                if (i13 < i3 && Math.abs(((((k[0] + k[1]) + k[2]) + k[3]) + i13) - i4) * 5 < i4 && m56324i(k)) {
                    return m56317a(k, i12);
                }
            }
        }
        return Float.NaN;
    }

    /* renamed from: d */
    private float m56320d(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        C7508b bVar = this.f44293a;
        int h = bVar.mo21978h();
        int[] k = m56326k();
        int i8 = i;
        while (i8 >= 0 && bVar.mo21974e(i2, i8)) {
            k[2] = k[2] + 1;
            i8--;
        }
        if (i8 < 0) {
            return Float.NaN;
        }
        while (i8 >= 0 && !bVar.mo21974e(i2, i8)) {
            int i9 = k[1];
            if (i9 > i3) {
                break;
            }
            k[1] = i9 + 1;
            i8--;
        }
        if (i8 >= 0 && k[1] <= i3) {
            while (i8 >= 0 && bVar.mo21974e(i2, i8) && (i7 = k[0]) <= i3) {
                k[0] = i7 + 1;
                i8--;
            }
            if (k[0] > i3) {
                return Float.NaN;
            }
            int i12 = i + 1;
            while (i12 < h && bVar.mo21974e(i2, i12)) {
                k[2] = k[2] + 1;
                i12++;
            }
            if (i12 == h) {
                return Float.NaN;
            }
            while (i12 < h && !bVar.mo21974e(i2, i12) && (i6 = k[3]) < i3) {
                k[3] = i6 + 1;
                i12++;
            }
            if (i12 != h && k[3] < i3) {
                while (i12 < h && bVar.mo21974e(i2, i12) && (i5 = k[4]) < i3) {
                    k[4] = i5 + 1;
                    i12++;
                }
                int i13 = k[4];
                if (i13 < i3 && Math.abs(((((k[0] + k[1]) + k[2]) + k[3]) + i13) - i4) * 5 < i4 * 2 && m56324i(k)) {
                    return m56317a(k, i12);
                }
            }
        }
        return Float.NaN;
    }

    /* renamed from: e */
    protected static void m56321e(int[] iArr) {
        Arrays.fill(iArr, 0);
    }

    /* renamed from: f */
    protected static void m56322f(int[] iArr) {
        iArr[0] = iArr[2];
        iArr[1] = iArr[3];
        iArr[2] = iArr[4];
        iArr[3] = 1;
        iArr[4] = 0;
    }

    /* renamed from: h */
    private int m56323h() {
        if (this.f44294b.size() <= 1) {
            return 0;
        }
        C15594d dVar = null;
        for (C15594d dVar2 : this.f44294b) {
            if (dVar2.mo42859h() >= 2) {
                if (dVar == null) {
                    dVar = dVar2;
                } else {
                    this.f44295c = true;
                    return ((int) (Math.abs(dVar.mo18901c() - dVar2.mo18901c()) - Math.abs(dVar.mo18902d() - dVar2.mo18902d()))) / 2;
                }
            }
        }
        return 0;
    }

    /* renamed from: i */
    protected static boolean m56324i(int[] iArr) {
        int i = 0;
        for (int i2 = 0; i2 < 5; i2++) {
            int i3 = iArr[i2];
            if (i3 == 0) {
                return false;
            }
            i += i3;
        }
        if (i < 7) {
            return false;
        }
        float f = ((float) i) / 7.0f;
        float f2 = f / 2.0f;
        if (Math.abs(f - ((float) iArr[0])) >= f2 || Math.abs(f - ((float) iArr[1])) >= f2 || Math.abs((f * 3.0f) - ((float) iArr[2])) >= 3.0f * f2 || Math.abs(f - ((float) iArr[3])) >= f2 || Math.abs(f - ((float) iArr[4])) >= f2) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    protected static boolean m56325j(int[] iArr) {
        int i = 0;
        for (int i2 = 0; i2 < 5; i2++) {
            int i3 = iArr[i2];
            if (i3 == 0) {
                return false;
            }
            i += i3;
        }
        if (i < 7) {
            return false;
        }
        float f = ((float) i) / 7.0f;
        float f2 = f / 1.333f;
        if (Math.abs(f - ((float) iArr[0])) >= f2 || Math.abs(f - ((float) iArr[1])) >= f2 || Math.abs((f * 3.0f) - ((float) iArr[2])) >= 3.0f * f2 || Math.abs(f - ((float) iArr[3])) >= f2 || Math.abs(f - ((float) iArr[4])) >= f2) {
            return false;
        }
        return true;
    }

    /* renamed from: k */
    private int[] m56326k() {
        m56321e(this.f44296d);
        return this.f44296d;
    }

    /* renamed from: m */
    private boolean m56327m() {
        int size = this.f44294b.size();
        float f = Utils.FLOAT_EPSILON;
        int i = 0;
        float f2 = 0.0f;
        for (C15594d dVar : this.f44294b) {
            if (dVar.mo42859h() >= 2) {
                i++;
                f2 += dVar.mo42860i();
            }
        }
        if (i < 3) {
            return false;
        }
        float f3 = f2 / ((float) size);
        for (C15594d i2 : this.f44294b) {
            f += Math.abs(i2.mo42860i() - f3);
        }
        if (f <= f2 * 0.05f) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00c5 A[SYNTHETIC] */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private p457ic.C15594d[] m56328n() {
        /*
            r26 = this;
            r0 = r26
            java.util.List r1 = r0.f44294b
            int r1 = r1.size()
            r2 = 3
            if (r1 < r2) goto L_0x00d7
            java.util.List r1 = r0.f44294b
            ic.e$b r3 = f44292f
            p342j$.util.List$EL.sort(r1, r3)
            ic.d[] r1 = new p457ic.C15594d[r2]
            r2 = 0
            r5 = r2
            r6 = 9218868437227405311(0x7fefffffffffffff, double:1.7976931348623157E308)
        L_0x001b:
            java.util.List r8 = r0.f44294b
            int r8 = r8.size()
            r9 = 2
            int r8 = r8 - r9
            if (r5 >= r8) goto L_0x00c8
            java.util.List r8 = r0.f44294b
            java.lang.Object r8 = r8.get(r5)
            ic.d r8 = (p457ic.C15594d) r8
            float r10 = r8.mo42860i()
            int r5 = r5 + 1
            r11 = r5
        L_0x0034:
            java.util.List r12 = r0.f44294b
            int r12 = r12.size()
            r13 = 1
            int r12 = r12 - r13
            if (r11 >= r12) goto L_0x001b
            java.util.List r12 = r0.f44294b
            java.lang.Object r12 = r12.get(r11)
            ic.d r12 = (p457ic.C15594d) r12
            double r14 = m56329o(r8, r12)
            int r11 = r11 + 1
            r3 = r11
        L_0x004d:
            java.util.List r4 = r0.f44294b
            int r4 = r4.size()
            if (r3 >= r4) goto L_0x0034
            java.util.List r4 = r0.f44294b
            java.lang.Object r4 = r4.get(r3)
            ic.d r4 = (p457ic.C15594d) r4
            float r16 = r4.mo42860i()
            r17 = 1068708659(0x3fb33333, float:1.4)
            float r17 = r17 * r10
            int r16 = (r16 > r17 ? 1 : (r16 == r17 ? 0 : -1))
            if (r16 > 0) goto L_0x00c5
            double r16 = m56329o(r12, r4)
            double r18 = m56329o(r8, r4)
            int r20 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r20 >= 0) goto L_0x008d
            int r20 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r20 <= 0) goto L_0x0084
            int r20 = (r14 > r18 ? 1 : (r14 == r18 ? 0 : -1))
            if (r20 >= 0) goto L_0x0081
            r20 = r14
            goto L_0x00a5
        L_0x0081:
            r20 = r18
            goto L_0x0099
        L_0x0084:
            r20 = r14
            r24 = r16
            r16 = r18
            r18 = r24
            goto L_0x00a5
        L_0x008d:
            int r20 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r20 >= 0) goto L_0x009f
            int r20 = (r14 > r18 ? 1 : (r14 == r18 ? 0 : -1))
            if (r20 >= 0) goto L_0x009c
            r20 = r16
            r16 = r18
        L_0x0099:
            r18 = r14
            goto L_0x00a5
        L_0x009c:
            r20 = r16
            goto L_0x00a3
        L_0x009f:
            r20 = r18
            r18 = r16
        L_0x00a3:
            r16 = r14
        L_0x00a5:
            r22 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r18 = r18 * r22
            double r18 = r16 - r18
            double r18 = java.lang.Math.abs(r18)
            double r20 = r20 * r22
            double r16 = r16 - r20
            double r16 = java.lang.Math.abs(r16)
            double r18 = r18 + r16
            int r16 = (r18 > r6 ? 1 : (r18 == r6 ? 0 : -1))
            if (r16 >= 0) goto L_0x00c5
            r1[r2] = r8
            r1[r13] = r12
            r1[r9] = r4
            r6 = r18
        L_0x00c5:
            int r3 = r3 + 1
            goto L_0x004d
        L_0x00c8:
            r3 = 9218868437227405311(0x7fefffffffffffff, double:1.7976931348623157E308)
            int r2 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x00d2
            return r1
        L_0x00d2:
            com.google.zxing.NotFoundException r1 = com.google.zxing.NotFoundException.m23155a()
            throw r1
        L_0x00d7:
            com.google.zxing.NotFoundException r1 = com.google.zxing.NotFoundException.m23155a()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p457ic.C15595e.m56328n():ic.d[]");
    }

    /* renamed from: o */
    private static double m56329o(C15594d dVar, C15594d dVar2) {
        double c = (double) (dVar.mo18901c() - dVar2.mo18901c());
        double d = (double) (dVar.mo18902d() - dVar2.mo18902d());
        return (c * c) + (d * d);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final C15598f mo42861g(Map map) {
        boolean z;
        if (map == null || !map.containsKey(C5754d.TRY_HARDER)) {
            z = false;
        } else {
            z = true;
        }
        int h = this.f44293a.mo21978h();
        int l = this.f44293a.mo21982l();
        int i = (h * 3) / 388;
        if (i < 3 || z) {
            i = 3;
        }
        int[] iArr = new int[5];
        int i2 = i - 1;
        boolean z2 = false;
        while (i2 < h && !z2) {
            m56321e(iArr);
            int i3 = 0;
            int i4 = 0;
            while (i3 < l) {
                if (this.f44293a.mo21974e(i3, i2)) {
                    if ((i4 & 1) == 1) {
                        i4++;
                    }
                    iArr[i4] = iArr[i4] + 1;
                } else if ((i4 & 1) != 0) {
                    iArr[i4] = iArr[i4] + 1;
                } else if (i4 == 4) {
                    if (!m56324i(iArr)) {
                        m56322f(iArr);
                    } else if (mo42862l(iArr, i2, i3)) {
                        if (this.f44295c) {
                            z2 = m56327m();
                        } else {
                            int h2 = m56323h();
                            int i5 = iArr[2];
                            if (h2 > i5) {
                                i2 += (h2 - i5) - 2;
                                i3 = l - 1;
                            }
                        }
                        m56321e(iArr);
                        i = 2;
                        i4 = 0;
                    } else {
                        m56322f(iArr);
                    }
                    i4 = 3;
                } else {
                    i4++;
                    iArr[i4] = iArr[i4] + 1;
                }
                i3++;
            }
            if (m56324i(iArr) && mo42862l(iArr, i2, l)) {
                i = iArr[0];
                if (this.f44295c) {
                    z2 = m56327m();
                }
            }
            i2 += i;
        }
        C15594d[] n = m56328n();
        C5766o.m23204e(n);
        return new C15598f(n);
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final boolean mo42862l(int[] iArr, int i, int i2) {
        boolean z = false;
        int i3 = iArr[0] + iArr[1] + iArr[2] + iArr[3] + iArr[4];
        int a = (int) m56317a(iArr, i2);
        float d = m56320d(i, a, iArr[2], i3);
        if (!Float.isNaN(d)) {
            int i4 = (int) d;
            float c = m56319c(a, i4, iArr[2], i3);
            if (!Float.isNaN(c) && m56318b(i4, (int) c)) {
                float f = ((float) i3) / 7.0f;
                int i5 = 0;
                while (true) {
                    if (i5 >= this.f44294b.size()) {
                        break;
                    }
                    C15594d dVar = (C15594d) this.f44294b.get(i5);
                    if (dVar.mo42857f(f, d, c)) {
                        this.f44294b.set(i5, dVar.mo42858g(d, c, f));
                        z = true;
                        break;
                    }
                    i5++;
                }
                if (!z) {
                    C15594d dVar2 = new C15594d(c, d, f);
                    this.f44294b.add(dVar2);
                    C5767p pVar = this.f44297e;
                    if (pVar != null) {
                        pVar.mo18906a(dVar2);
                    }
                }
                return true;
            }
        }
        return false;
    }
}
