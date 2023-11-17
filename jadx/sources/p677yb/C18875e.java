package p677yb;

import com.google.zxing.C5751a;
import com.google.zxing.C5754d;
import com.google.zxing.C5764m;
import com.google.zxing.C5766o;
import com.google.zxing.C5767p;
import com.google.zxing.NotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p200ob.C7507a;
import p213pb.C7798a;
import p663xb.C18676r;

/* renamed from: yb.e */
public final class C18875e extends C18871a {

    /* renamed from: i */
    private static final int[] f52819i = {1, 10, 34, 70, 126};

    /* renamed from: j */
    private static final int[] f52820j = {4, 20, 48, 81};

    /* renamed from: k */
    private static final int[] f52821k = {0, 161, 961, 2015, 2715};

    /* renamed from: l */
    private static final int[] f52822l = {0, 336, 1036, 1516};

    /* renamed from: m */
    private static final int[] f52823m = {8, 6, 4, 3, 1};

    /* renamed from: n */
    private static final int[] f52824n = {2, 4, 6, 8};

    /* renamed from: o */
    private static final int[][] f52825o = {new int[]{3, 8, 2, 1}, new int[]{3, 5, 5, 1}, new int[]{3, 3, 7, 1}, new int[]{3, 1, 9, 1}, new int[]{2, 7, 4, 1}, new int[]{2, 5, 6, 1}, new int[]{2, 3, 8, 1}, new int[]{1, 5, 7, 1}, new int[]{1, 3, 9, 1}};

    /* renamed from: g */
    private final List f52826g = new ArrayList();

    /* renamed from: h */
    private final List f52827h = new ArrayList();

    /* renamed from: s */
    private static void m63871s(Collection collection, C18874d dVar) {
        boolean z;
        if (dVar != null) {
            Iterator it = collection.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                C18874d dVar2 = (C18874d) it.next();
                if (dVar2.mo46849b() == dVar.mo46849b()) {
                    dVar2.mo46860e();
                    z = true;
                    break;
                }
            }
            if (!z) {
                collection.add(dVar);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003f, code lost:
        if (r1 < 4) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0041, code lost:
        r2 = true;
        r5 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0044, code lost:
        r2 = false;
        r5 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0026, code lost:
        if (r1 < 4) goto L_0x0041;
     */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m63872t(boolean r10, int r11) {
        /*
            r9 = this;
            int[] r0 = r9.mo46846n()
            int r0 = p213pb.C7798a.m29510d(r0)
            int[] r1 = r9.mo46844l()
            int r1 = p213pb.C7798a.m29510d(r1)
            r2 = 4
            r3 = 1
            r4 = 0
            if (r10 == 0) goto L_0x0029
            r5 = 12
            if (r0 <= r5) goto L_0x001c
            r7 = r3
            r6 = r4
            goto L_0x0023
        L_0x001c:
            if (r0 >= r2) goto L_0x0021
            r6 = r3
            r7 = r4
            goto L_0x0023
        L_0x0021:
            r6 = r4
            r7 = r6
        L_0x0023:
            if (r1 <= r5) goto L_0x0026
            goto L_0x003c
        L_0x0026:
            if (r1 >= r2) goto L_0x0044
            goto L_0x0041
        L_0x0029:
            r5 = 11
            if (r0 <= r5) goto L_0x0030
            r7 = r3
            r6 = r4
            goto L_0x0038
        L_0x0030:
            r5 = 5
            if (r0 >= r5) goto L_0x0036
            r6 = r3
            r7 = r4
            goto L_0x0038
        L_0x0036:
            r6 = r4
            r7 = r6
        L_0x0038:
            r5 = 10
            if (r1 <= r5) goto L_0x003f
        L_0x003c:
            r5 = r3
            r2 = r4
            goto L_0x0046
        L_0x003f:
            if (r1 >= r2) goto L_0x0044
        L_0x0041:
            r2 = r3
            r5 = r4
            goto L_0x0046
        L_0x0044:
            r2 = r4
            r5 = r2
        L_0x0046:
            int r8 = r0 + r1
            int r8 = r8 - r11
            r11 = r0 & 1
            if (r11 != r10) goto L_0x004f
            r10 = r3
            goto L_0x0050
        L_0x004f:
            r10 = r4
        L_0x0050:
            r11 = r1 & 1
            if (r11 != r3) goto L_0x0055
            r4 = r3
        L_0x0055:
            r11 = -1
            if (r8 == r11) goto L_0x008e
            if (r8 == 0) goto L_0x0075
            if (r8 != r3) goto L_0x0070
            if (r10 == 0) goto L_0x0067
            if (r4 != 0) goto L_0x0062
            r7 = r3
            goto L_0x0087
        L_0x0062:
            com.google.zxing.NotFoundException r10 = com.google.zxing.NotFoundException.m23155a()
            throw r10
        L_0x0067:
            if (r4 == 0) goto L_0x006b
            r5 = r3
            goto L_0x0087
        L_0x006b:
            com.google.zxing.NotFoundException r10 = com.google.zxing.NotFoundException.m23155a()
            throw r10
        L_0x0070:
            com.google.zxing.NotFoundException r10 = com.google.zxing.NotFoundException.m23155a()
            throw r10
        L_0x0075:
            if (r10 == 0) goto L_0x0085
            if (r4 == 0) goto L_0x0080
            if (r0 >= r1) goto L_0x007d
            r5 = r3
            goto L_0x009c
        L_0x007d:
            r2 = r3
            r7 = r2
            goto L_0x0087
        L_0x0080:
            com.google.zxing.NotFoundException r10 = com.google.zxing.NotFoundException.m23155a()
            throw r10
        L_0x0085:
            if (r4 != 0) goto L_0x0089
        L_0x0087:
            r3 = r6
            goto L_0x009c
        L_0x0089:
            com.google.zxing.NotFoundException r10 = com.google.zxing.NotFoundException.m23155a()
            throw r10
        L_0x008e:
            if (r10 == 0) goto L_0x0098
            if (r4 != 0) goto L_0x0093
            goto L_0x009c
        L_0x0093:
            com.google.zxing.NotFoundException r10 = com.google.zxing.NotFoundException.m23155a()
            throw r10
        L_0x0098:
            if (r4 == 0) goto L_0x00e1
            r2 = r3
            goto L_0x0087
        L_0x009c:
            if (r3 == 0) goto L_0x00b1
            if (r7 != 0) goto L_0x00ac
            int[] r10 = r9.mo46846n()
            float[] r11 = r9.mo46847o()
            p677yb.C18871a.m63854p(r10, r11)
            goto L_0x00b1
        L_0x00ac:
            com.google.zxing.NotFoundException r10 = com.google.zxing.NotFoundException.m23155a()
            throw r10
        L_0x00b1:
            if (r7 == 0) goto L_0x00be
            int[] r10 = r9.mo46846n()
            float[] r11 = r9.mo46847o()
            p677yb.C18871a.m63853i(r10, r11)
        L_0x00be:
            if (r2 == 0) goto L_0x00d3
            if (r5 != 0) goto L_0x00ce
            int[] r10 = r9.mo46844l()
            float[] r11 = r9.mo46847o()
            p677yb.C18871a.m63854p(r10, r11)
            goto L_0x00d3
        L_0x00ce:
            com.google.zxing.NotFoundException r10 = com.google.zxing.NotFoundException.m23155a()
            throw r10
        L_0x00d3:
            if (r5 == 0) goto L_0x00e0
            int[] r10 = r9.mo46844l()
            float[] r11 = r9.mo46845m()
            p677yb.C18871a.m63853i(r10, r11)
        L_0x00e0:
            return
        L_0x00e1:
            com.google.zxing.NotFoundException r10 = com.google.zxing.NotFoundException.m23155a()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p677yb.C18875e.m63872t(boolean, int):void");
    }

    /* renamed from: u */
    private static boolean m63873u(C18874d dVar, C18874d dVar2) {
        int a = (dVar.mo46848a() + (dVar2.mo46848a() * 16)) % 79;
        int c = (dVar.mo46859d().mo46855c() * 9) + dVar2.mo46859d().mo46855c();
        if (c > 72) {
            c--;
        }
        if (c > 8) {
            c--;
        }
        if (a == c) {
            return true;
        }
        return false;
    }

    /* renamed from: v */
    private static C5764m m63874v(C18874d dVar, C18874d dVar2) {
        String valueOf = String.valueOf((((long) dVar.mo46849b()) * 4537077) + ((long) dVar2.mo46849b()));
        StringBuilder sb = new StringBuilder(14);
        for (int length = 13 - valueOf.length(); length > 0; length--) {
            sb.append('0');
        }
        sb.append(valueOf);
        int i = 0;
        for (int i2 = 0; i2 < 13; i2++) {
            int charAt = sb.charAt(i2) - '0';
            if ((i2 & 1) == 0) {
                charAt *= 3;
            }
            i += charAt;
        }
        int i3 = 10 - (i % 10);
        if (i3 == 10) {
            i3 = 0;
        }
        sb.append(i3);
        C5766o[] a = dVar.mo46859d().mo46853a();
        C5766o[] a2 = dVar2.mo46859d().mo46853a();
        return new C5764m(sb.toString(), (byte[]) null, new C5766o[]{a[0], a[1], a2[0], a2[1]}, C5751a.RSS_14);
    }

    /* renamed from: w */
    private C18872b m63875w(C7507a aVar, C18873c cVar, boolean z) {
        int i;
        int[] j = mo46842j();
        Arrays.fill(j, 0);
        if (z) {
            C18676r.m63285h(aVar, cVar.mo46854b()[0], j);
        } else {
            C18676r.m63284g(aVar, cVar.mo46854b()[1], j);
            int i2 = 0;
            for (int length = j.length - 1; i2 < length; length--) {
                int i3 = j[i2];
                j[i2] = j[length];
                j[length] = i3;
                i2++;
            }
        }
        if (z) {
            i = 16;
        } else {
            i = 15;
        }
        float d = ((float) C7798a.m29510d(j)) / ((float) i);
        int[] n = mo46846n();
        int[] l = mo46844l();
        float[] o = mo46847o();
        float[] m = mo46845m();
        for (int i4 = 0; i4 < j.length; i4++) {
            float f = ((float) j[i4]) / d;
            int i5 = (int) (0.5f + f);
            if (i5 <= 0) {
                i5 = 1;
            } else if (i5 > 8) {
                i5 = 8;
            }
            int i6 = i4 / 2;
            if ((i4 & 1) == 0) {
                n[i6] = i5;
                o[i6] = f - ((float) i5);
            } else {
                l[i6] = i5;
                m[i6] = f - ((float) i5);
            }
        }
        m63872t(z, i);
        int i7 = 0;
        int i8 = 0;
        for (int length2 = n.length - 1; length2 >= 0; length2--) {
            int i9 = n[length2];
            i7 = (i7 * 9) + i9;
            i8 += i9;
        }
        int i12 = 0;
        int i13 = 0;
        for (int length3 = l.length - 1; length3 >= 0; length3--) {
            int i14 = l[length3];
            i12 = (i12 * 9) + i14;
            i13 += i14;
        }
        int i15 = i7 + (i12 * 3);
        if (z) {
            if ((i8 & 1) != 0 || i8 > 12 || i8 < 4) {
                throw NotFoundException.m23155a();
            }
            int i16 = (12 - i8) / 2;
            int i17 = f52823m[i16];
            int i18 = 9 - i17;
            return new C18872b((C18876f.m63882b(n, i17, false) * f52819i[i16]) + C18876f.m63882b(l, i18, true) + f52821k[i16], i15);
        } else if ((i13 & 1) != 0 || i13 > 10 || i13 < 4) {
            throw NotFoundException.m23155a();
        } else {
            int i19 = (10 - i13) / 2;
            int i22 = f52824n[i19];
            return new C18872b((C18876f.m63882b(l, 9 - i22, false) * f52820j[i19]) + C18876f.m63882b(n, i22, true) + f52822l[i19], i15);
        }
    }

    /* renamed from: x */
    private C18874d m63876x(C7507a aVar, boolean z, int i, Map map) {
        C5767p pVar;
        try {
            C18873c z2 = m63878z(aVar, i, z, m63877y(aVar, z));
            if (map == null) {
                pVar = null;
            } else {
                pVar = (C5767p) map.get(C5754d.NEED_RESULT_POINT_CALLBACK);
            }
            if (pVar != null) {
                int[] b = z2.mo46854b();
                float f = ((float) ((b[0] + b[1]) - 1)) / 2.0f;
                if (z) {
                    f = ((float) (aVar.mo21961l() - 1)) - f;
                }
                pVar.mo18906a(new C5766o(f, (float) i));
            }
            C18872b w = m63875w(aVar, z2, true);
            C18872b w2 = m63875w(aVar, z2, false);
            return new C18874d((w.mo46849b() * 1597) + w2.mo46849b(), w.mo46848a() + (w2.mo46848a() * 4), z2);
        } catch (NotFoundException unused) {
            return null;
        }
    }

    /* renamed from: y */
    private int[] m63877y(C7507a aVar, boolean z) {
        int[] k = mo46843k();
        k[0] = 0;
        k[1] = 0;
        k[2] = 0;
        k[3] = 0;
        int l = aVar.mo21961l();
        int i = 0;
        boolean z2 = false;
        while (i < l) {
            z2 = !aVar.mo21956g(i);
            if (z == z2) {
                break;
            }
            i++;
        }
        int i2 = 0;
        int i3 = i;
        while (i < l) {
            if (aVar.mo21956g(i) != z2) {
                k[i2] = k[i2] + 1;
            } else {
                if (i2 != 3) {
                    i2++;
                } else if (C18871a.m63855q(k)) {
                    return new int[]{i3, i};
                } else {
                    i3 += k[0] + k[1];
                    k[0] = k[2];
                    k[1] = k[3];
                    k[2] = 0;
                    k[3] = 0;
                    i2--;
                }
                k[i2] = 1;
                z2 = !z2;
            }
            i++;
        }
        throw NotFoundException.m23155a();
    }

    /* renamed from: z */
    private C18873c m63878z(C7507a aVar, int i, boolean z, int[] iArr) {
        int i2;
        int i3;
        boolean g = aVar.mo21956g(iArr[0]);
        int i4 = iArr[0] - 1;
        while (i4 >= 0 && g != aVar.mo21956g(i4)) {
            i4--;
        }
        int i5 = i4 + 1;
        int[] k = mo46843k();
        System.arraycopy(k, 0, k, 1, k.length - 1);
        k[0] = iArr[0] - i5;
        int r = C18871a.m63856r(k, f52825o);
        int i6 = iArr[1];
        if (z) {
            i2 = (aVar.mo21961l() - 1) - i6;
            i3 = (aVar.mo21961l() - 1) - i5;
        } else {
            i2 = i6;
            i3 = i5;
        }
        return new C18873c(r, new int[]{i5, iArr[1]}, i3, i2, i);
    }

    /* renamed from: a */
    public void mo18886a() {
        this.f52826g.clear();
        this.f52827h.clear();
    }

    /* renamed from: d */
    public C5764m mo46487d(int i, C7507a aVar, Map map) {
        m63871s(this.f52826g, m63876x(aVar, false, i, map));
        aVar.mo21964p();
        m63871s(this.f52827h, m63876x(aVar, true, i, map));
        aVar.mo21964p();
        for (C18874d dVar : this.f52826g) {
            if (dVar.mo46858c() > 1) {
                for (C18874d dVar2 : this.f52827h) {
                    if (dVar2.mo46858c() > 1 && m63873u(dVar, dVar2)) {
                        return m63874v(dVar, dVar2);
                    }
                }
                continue;
            }
        }
        throw NotFoundException.m23155a();
    }
}
