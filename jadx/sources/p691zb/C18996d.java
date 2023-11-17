package p691zb;

import com.google.zxing.C5751a;
import com.google.zxing.C5764m;
import com.google.zxing.C5766o;
import com.google.zxing.NotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p200ob.C7507a;
import p213pb.C7798a;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogInputLayout;
import p341ge.bog.mobilebank.p975ui.views.widgets.cropview.subscaleview.SubsamplingScaleImageView;
import p344ac.C9771j;
import p663xb.C18676r;
import p677yb.C18871a;
import p677yb.C18872b;
import p677yb.C18873c;
import p677yb.C18876f;

/* renamed from: zb.d */
public final class C18996d extends C18871a {

    /* renamed from: k */
    private static final int[] f53010k = {7, 5, 4, 3, 1};

    /* renamed from: l */
    private static final int[] f53011l = {4, 20, 52, 104, 204};

    /* renamed from: m */
    private static final int[] f53012m = {0, 348, 1388, 2948, 3988};

    /* renamed from: n */
    private static final int[][] f53013n = {new int[]{1, 8, 4, 1}, new int[]{3, 6, 4, 1}, new int[]{3, 4, 6, 1}, new int[]{3, 2, 8, 1}, new int[]{2, 6, 5, 1}, new int[]{2, 2, 9, 1}};

    /* renamed from: o */
    private static final int[][] f53014o = {new int[]{1, 3, 9, 27, 81, 32, 96, 77}, new int[]{20, 60, SubsamplingScaleImageView.ORIENTATION_180, 118, 143, 7, 21, 63}, new int[]{189, 145, 13, 39, 117, 140, 209, 205}, new int[]{193, 157, 49, 147, 19, 57, 171, 91}, new int[]{62, 186, 136, 197, 169, 85, 44, 132}, new int[]{185, 133, 188, 142, 4, 12, 36, 108}, new int[]{113, 128, 173, 97, 80, 29, 87, 50}, new int[]{150, 28, 84, 41, 123, 158, 52, 156}, new int[]{46, 138, 203, 187, 139, 206, 196, 166}, new int[]{76, 17, 51, 153, 37, 111, 122, 155}, new int[]{43, 129, 176, 106, 107, 110, 119, 146}, new int[]{16, 48, 144, 10, 30, 90, 59, 177}, new int[]{109, 116, 137, BogInputLayout.INPUT_NORMAL_STATE, 178, 112, 125, 164}, new int[]{70, 210, 208, 202, 184, 130, 179, 115}, new int[]{134, 191, 151, 31, 93, 68, 204, 190}, new int[]{148, 22, 66, 198, 172, 94, 71, 2}, new int[]{6, 18, 54, 162, 64, 192, 154, 40}, new int[]{120, 149, 25, 75, 14, 42, 126, 167}, new int[]{79, 26, 78, 23, 69, 207, 199, 175}, new int[]{103, 98, 83, 38, 114, 131, 182, 124}, new int[]{161, 61, 183, C11051p3.f31760d, 170, 88, 53, 159}, new int[]{55, 165, 73, 8, 24, 72, 5, 15}, new int[]{45, 135, 194, 160, 58, 174, 100, 89}};

    /* renamed from: p */
    private static final int[][] f53015p = {new int[]{0, 0}, new int[]{0, 1, 1}, new int[]{0, 2, 1, 3}, new int[]{0, 4, 1, 3, 2}, new int[]{0, 4, 1, 3, 3, 5}, new int[]{0, 4, 1, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 2, 3, 3}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 4}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 3, 3, 4, 4, 5, 5}};

    /* renamed from: g */
    private final List f53016g = new ArrayList(11);

    /* renamed from: h */
    private final List f53017h = new ArrayList();

    /* renamed from: i */
    private final int[] f53018i = new int[2];

    /* renamed from: j */
    private boolean f53019j;

    /* renamed from: A */
    private static int m64126A(C7507a aVar, int i) {
        if (aVar.mo21956g(i)) {
            return aVar.mo21959j(aVar.mo21960k(i));
        }
        return aVar.mo21960k(aVar.mo21959j(i));
    }

    /* renamed from: B */
    private static boolean m64127B(C18873c cVar, boolean z, boolean z2) {
        return cVar.mo46855c() != 0 || !z || !z2;
    }

    /* renamed from: C */
    private static boolean m64128C(Iterable iterable, Iterable iterable2) {
        boolean z;
        boolean z2;
        Iterator it = iterable2.iterator();
        do {
            z = false;
            if (it.hasNext()) {
                C18995c cVar = (C18995c) it.next();
                Iterator it2 = iterable.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        z = true;
                        continue;
                        break;
                    }
                    C18994b bVar = (C18994b) it2.next();
                    Iterator it3 = cVar.mo47040a().iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            if (bVar.equals((C18994b) it3.next())) {
                                z2 = true;
                                continue;
                                break;
                            }
                        } else {
                            z2 = false;
                            continue;
                            break;
                        }
                    }
                    if (!z2) {
                        continue;
                        break;
                    }
                }
            } else {
                return false;
            }
        } while (!z);
        return true;
    }

    /* renamed from: D */
    private static boolean m64129D(List list) {
        boolean z;
        for (int[] iArr : f53015p) {
            if (list.size() <= iArr.length) {
                int i = 0;
                while (true) {
                    if (i >= list.size()) {
                        z = true;
                        break;
                    } else if (((C18994b) list.get(i)).mo47033a().mo46855c() != iArr[i]) {
                        z = false;
                        break;
                    } else {
                        i++;
                    }
                }
                if (z) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: E */
    private C18873c m64130E(C7507a aVar, int i, boolean z) {
        int i2;
        int i3;
        int i4;
        if (z) {
            int i5 = this.f53018i[0] - 1;
            while (i5 >= 0 && !aVar.mo21956g(i5)) {
                i5--;
            }
            int i6 = i5 + 1;
            int[] iArr = this.f53018i;
            i4 = iArr[0] - i6;
            i2 = iArr[1];
            i3 = i6;
        } else {
            int[] iArr2 = this.f53018i;
            int i7 = iArr2[0];
            int k = aVar.mo21960k(iArr2[1] + 1);
            i2 = k;
            i3 = i7;
            i4 = k - this.f53018i[1];
        }
        int[] k2 = mo46843k();
        System.arraycopy(k2, 0, k2, 1, k2.length - 1);
        k2[0] = i4;
        try {
            return new C18873c(C18871a.m63856r(k2, f53013n), new int[]{i3, i2}, i3, i2, i);
        } catch (NotFoundException unused) {
            return null;
        }
    }

    /* renamed from: F */
    private static void m64131F(Collection collection, Collection collection2) {
        boolean z;
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            C18995c cVar = (C18995c) it.next();
            if (cVar.mo47040a().size() != collection.size()) {
                Iterator it2 = cVar.mo47040a().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (!collection.contains((C18994b) it2.next())) {
                            z = false;
                            break;
                        }
                    } else {
                        z = true;
                        break;
                    }
                }
                if (z) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: H */
    private static void m64132H(int[] iArr) {
        int length = iArr.length;
        for (int i = 0; i < length / 2; i++) {
            int i2 = iArr[i];
            int i3 = (length - i) - 1;
            iArr[i] = iArr[i3];
            iArr[i3] = i2;
        }
    }

    /* renamed from: I */
    private void m64133I(int i) {
        boolean z;
        int i2 = 0;
        boolean z2 = false;
        while (true) {
            if (i2 >= this.f53017h.size()) {
                z = false;
                break;
            }
            C18995c cVar = (C18995c) this.f53017h.get(i2);
            if (cVar.mo47041b() > i) {
                z = cVar.mo47042c(this.f53016g);
                break;
            } else {
                z2 = cVar.mo47042c(this.f53016g);
                i2++;
            }
        }
        if (!z && !z2 && !m64128C(this.f53016g, this.f53017h)) {
            this.f53017h.add(i2, new C18995c(this.f53016g, i, false));
            m64131F(this.f53016g, this.f53017h);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:51:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m64134s(int r11) {
        /*
            r10 = this;
            int[] r0 = r10.mo46846n()
            int r0 = p213pb.C7798a.m29510d(r0)
            int[] r1 = r10.mo46844l()
            int r1 = p213pb.C7798a.m29510d(r1)
            r2 = 4
            r3 = 1
            r4 = 0
            r5 = 13
            if (r0 <= r5) goto L_0x001a
            r7 = r3
            r6 = r4
            goto L_0x0021
        L_0x001a:
            if (r0 >= r2) goto L_0x001f
            r6 = r3
            r7 = r4
            goto L_0x0021
        L_0x001f:
            r6 = r4
            r7 = r6
        L_0x0021:
            if (r1 <= r5) goto L_0x0026
            r5 = r3
            r2 = r4
            goto L_0x002d
        L_0x0026:
            if (r1 >= r2) goto L_0x002b
            r2 = r3
            r5 = r4
            goto L_0x002d
        L_0x002b:
            r2 = r4
            r5 = r2
        L_0x002d:
            int r8 = r0 + r1
            int r8 = r8 - r11
            r11 = r0 & 1
            if (r11 != r3) goto L_0x0036
            r11 = r3
            goto L_0x0037
        L_0x0036:
            r11 = r4
        L_0x0037:
            r9 = r1 & 1
            if (r9 != 0) goto L_0x003c
            r4 = r3
        L_0x003c:
            r9 = -1
            if (r8 == r9) goto L_0x0075
            if (r8 == 0) goto L_0x005c
            if (r8 != r3) goto L_0x0057
            if (r11 == 0) goto L_0x004e
            if (r4 != 0) goto L_0x0049
            r7 = r3
            goto L_0x006e
        L_0x0049:
            com.google.zxing.NotFoundException r11 = com.google.zxing.NotFoundException.m23155a()
            throw r11
        L_0x004e:
            if (r4 == 0) goto L_0x0052
            r5 = r3
            goto L_0x006e
        L_0x0052:
            com.google.zxing.NotFoundException r11 = com.google.zxing.NotFoundException.m23155a()
            throw r11
        L_0x0057:
            com.google.zxing.NotFoundException r11 = com.google.zxing.NotFoundException.m23155a()
            throw r11
        L_0x005c:
            if (r11 == 0) goto L_0x006c
            if (r4 == 0) goto L_0x0067
            if (r0 >= r1) goto L_0x0064
            r5 = r3
            goto L_0x0083
        L_0x0064:
            r2 = r3
            r7 = r2
            goto L_0x006e
        L_0x0067:
            com.google.zxing.NotFoundException r11 = com.google.zxing.NotFoundException.m23155a()
            throw r11
        L_0x006c:
            if (r4 != 0) goto L_0x0070
        L_0x006e:
            r3 = r6
            goto L_0x0083
        L_0x0070:
            com.google.zxing.NotFoundException r11 = com.google.zxing.NotFoundException.m23155a()
            throw r11
        L_0x0075:
            if (r11 == 0) goto L_0x007f
            if (r4 != 0) goto L_0x007a
            goto L_0x0083
        L_0x007a:
            com.google.zxing.NotFoundException r11 = com.google.zxing.NotFoundException.m23155a()
            throw r11
        L_0x007f:
            if (r4 == 0) goto L_0x00c8
            r2 = r3
            goto L_0x006e
        L_0x0083:
            if (r3 == 0) goto L_0x0098
            if (r7 != 0) goto L_0x0093
            int[] r11 = r10.mo46846n()
            float[] r0 = r10.mo46847o()
            p677yb.C18871a.m63854p(r11, r0)
            goto L_0x0098
        L_0x0093:
            com.google.zxing.NotFoundException r11 = com.google.zxing.NotFoundException.m23155a()
            throw r11
        L_0x0098:
            if (r7 == 0) goto L_0x00a5
            int[] r11 = r10.mo46846n()
            float[] r0 = r10.mo46847o()
            p677yb.C18871a.m63853i(r11, r0)
        L_0x00a5:
            if (r2 == 0) goto L_0x00ba
            if (r5 != 0) goto L_0x00b5
            int[] r11 = r10.mo46844l()
            float[] r0 = r10.mo46847o()
            p677yb.C18871a.m63854p(r11, r0)
            goto L_0x00ba
        L_0x00b5:
            com.google.zxing.NotFoundException r11 = com.google.zxing.NotFoundException.m23155a()
            throw r11
        L_0x00ba:
            if (r5 == 0) goto L_0x00c7
            int[] r11 = r10.mo46844l()
            float[] r0 = r10.mo46845m()
            p677yb.C18871a.m63853i(r11, r0)
        L_0x00c7:
            return
        L_0x00c8:
            com.google.zxing.NotFoundException r11 = com.google.zxing.NotFoundException.m23155a()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p691zb.C18996d.m64134s(int):void");
    }

    /* renamed from: t */
    private boolean m64135t() {
        C18994b bVar = (C18994b) this.f53016g.get(0);
        C18872b b = bVar.mo47034b();
        C18872b c = bVar.mo47035c();
        if (c == null) {
            return false;
        }
        int a = c.mo46848a();
        int i = 2;
        for (int i2 = 1; i2 < this.f53016g.size(); i2++) {
            C18994b bVar2 = (C18994b) this.f53016g.get(i2);
            a += bVar2.mo47034b().mo46848a();
            i++;
            C18872b c2 = bVar2.mo47035c();
            if (c2 != null) {
                a += c2.mo46848a();
                i++;
            }
        }
        if (((i - 4) * 211) + (a % 211) == b.mo46849b()) {
            return true;
        }
        return false;
    }

    /* renamed from: u */
    private List m64136u(List list, int i) {
        while (i < this.f53017h.size()) {
            C18995c cVar = (C18995c) this.f53017h.get(i);
            this.f53016g.clear();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.f53016g.addAll(((C18995c) it.next()).mo47040a());
            }
            this.f53016g.addAll(cVar.mo47040a());
            if (!m64129D(this.f53016g)) {
                i++;
            } else if (m64135t()) {
                return this.f53016g;
            } else {
                ArrayList arrayList = new ArrayList(list);
                arrayList.add(cVar);
                try {
                    return m64136u(arrayList, i + 1);
                } catch (NotFoundException unused) {
                }
            }
        }
        throw NotFoundException.m23155a();
    }

    /* renamed from: v */
    private List m64137v(boolean z) {
        List list = null;
        if (this.f53017h.size() > 25) {
            this.f53017h.clear();
            return null;
        }
        this.f53016g.clear();
        if (z) {
            Collections.reverse(this.f53017h);
        }
        try {
            list = m64136u(new ArrayList(), 0);
        } catch (NotFoundException unused) {
        }
        if (z) {
            Collections.reverse(this.f53017h);
        }
        return list;
    }

    /* renamed from: w */
    static C5764m m64138w(List list) {
        String d = C9771j.m35929a(C18993a.m64118a(list)).mo26218d();
        C5766o[] a = ((C18994b) list.get(0)).mo47033a().mo46853a();
        C5766o[] a2 = ((C18994b) list.get(list.size() - 1)).mo47033a().mo46853a();
        return new C5764m(d, (byte[]) null, new C5766o[]{a[0], a[1], a2[0], a2[1]}, C5751a.RSS_EXPANDED);
    }

    /* renamed from: z */
    private void m64139z(C7507a aVar, List list, int i) {
        boolean z;
        int[] k = mo46843k();
        k[0] = 0;
        k[1] = 0;
        k[2] = 0;
        k[3] = 0;
        int l = aVar.mo21961l();
        if (i < 0) {
            if (list.isEmpty()) {
                i = 0;
            } else {
                i = ((C18994b) list.get(list.size() - 1)).mo47033a().mo46854b()[1];
            }
        }
        if (list.size() % 2 != 0) {
            z = true;
        } else {
            z = false;
        }
        if (this.f53019j) {
            z = !z;
        }
        boolean z2 = false;
        while (i < l) {
            z2 = !aVar.mo21956g(i);
            if (!z2) {
                break;
            }
            i++;
        }
        int i2 = 0;
        boolean z3 = z2;
        int i3 = i;
        while (i < l) {
            if (aVar.mo21956g(i) != z3) {
                k[i2] = k[i2] + 1;
            } else {
                if (i2 == 3) {
                    if (z) {
                        m64132H(k);
                    }
                    if (C18871a.m63855q(k)) {
                        int[] iArr = this.f53018i;
                        iArr[0] = i3;
                        iArr[1] = i;
                        return;
                    }
                    if (z) {
                        m64132H(k);
                    }
                    i3 += k[0] + k[1];
                    k[0] = k[2];
                    k[1] = k[3];
                    k[2] = 0;
                    k[3] = 0;
                    i2--;
                } else {
                    i2++;
                }
                k[i2] = 1;
                z3 = !z3;
            }
            i++;
        }
        throw NotFoundException.m23155a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public C18994b mo47046G(C7507a aVar, List list, int i) {
        boolean z;
        C18873c E;
        C18872b bVar;
        if (list.size() % 2 == 0) {
            z = true;
        } else {
            z = false;
        }
        if (this.f53019j) {
            z = !z;
        }
        int i2 = -1;
        boolean z2 = true;
        do {
            m64139z(aVar, list, i2);
            E = m64130E(aVar, i, z);
            if (E == null) {
                i2 = m64126A(aVar, this.f53018i[0]);
                continue;
            } else {
                z2 = false;
                continue;
            }
        } while (z2);
        C18872b x = mo47047x(aVar, E, z, true);
        if (list.isEmpty() || !((C18994b) list.get(list.size() - 1)).mo47036d()) {
            try {
                bVar = mo47047x(aVar, E, z, false);
            } catch (NotFoundException unused) {
                bVar = null;
            }
            return new C18994b(x, bVar, E);
        }
        throw NotFoundException.m23155a();
    }

    /* renamed from: a */
    public void mo18886a() {
        this.f53016g.clear();
        this.f53017h.clear();
    }

    /* renamed from: d */
    public C5764m mo46487d(int i, C7507a aVar, Map map) {
        this.f53016g.clear();
        this.f53019j = false;
        try {
            return m64138w(mo47048y(i, aVar));
        } catch (NotFoundException unused) {
            this.f53016g.clear();
            this.f53019j = true;
            return m64138w(mo47048y(i, aVar));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public C18872b mo47047x(C7507a aVar, C18873c cVar, boolean z, boolean z2) {
        int i;
        C7507a aVar2 = aVar;
        int[] j = mo46842j();
        Arrays.fill(j, 0);
        if (z2) {
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
        float d = ((float) C7798a.m29510d(j)) / 17.0f;
        float f = ((float) (cVar.mo46854b()[1] - cVar.mo46854b()[0])) / 15.0f;
        if (Math.abs(d - f) / f <= 0.3f) {
            int[] n = mo46846n();
            int[] l = mo46844l();
            float[] o = mo46847o();
            float[] m = mo46845m();
            for (int i4 = 0; i4 < j.length; i4++) {
                float f2 = (((float) j[i4]) * 1.0f) / d;
                int i5 = (int) (0.5f + f2);
                if (i5 <= 0) {
                    if (f2 >= 0.3f) {
                        i5 = 1;
                    } else {
                        throw NotFoundException.m23155a();
                    }
                } else if (i5 > 8) {
                    if (f2 <= 8.7f) {
                        i5 = 8;
                    } else {
                        throw NotFoundException.m23155a();
                    }
                }
                int i6 = i4 / 2;
                if ((i4 & 1) == 0) {
                    n[i6] = i5;
                    o[i6] = f2 - ((float) i5);
                } else {
                    l[i6] = i5;
                    m[i6] = f2 - ((float) i5);
                }
            }
            m64134s(17);
            int c = cVar.mo46855c() * 4;
            if (z) {
                i = 0;
            } else {
                i = 2;
            }
            int i7 = ((c + i) + (z2 ^ true ? 1 : 0)) - 1;
            int i8 = 0;
            int i9 = 0;
            for (int length2 = n.length - 1; length2 >= 0; length2--) {
                if (m64127B(cVar, z, z2)) {
                    i8 += n[length2] * f53014o[i7][length2 * 2];
                }
                i9 += n[length2];
            }
            int i12 = 0;
            for (int length3 = l.length - 1; length3 >= 0; length3--) {
                if (m64127B(cVar, z, z2)) {
                    i12 += l[length3] * f53014o[i7][(length3 * 2) + 1];
                }
            }
            int i13 = i8 + i12;
            if ((i9 & 1) != 0 || i9 > 13 || i9 < 4) {
                throw NotFoundException.m23155a();
            }
            int i14 = (13 - i9) / 2;
            int i15 = f53010k[i14];
            return new C18872b((C18876f.m63882b(n, i15, true) * f53011l[i14]) + C18876f.m63882b(l, 9 - i15, false) + f53012m[i14], i13);
        }
        throw NotFoundException.m23155a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public List mo47048y(int i, C7507a aVar) {
        boolean z = false;
        while (!z) {
            try {
                List list = this.f53016g;
                list.add(mo47046G(aVar, list, i));
            } catch (NotFoundException e) {
                if (!this.f53016g.isEmpty()) {
                    z = true;
                } else {
                    throw e;
                }
            }
        }
        if (m64135t()) {
            return this.f53016g;
        }
        boolean z2 = !this.f53017h.isEmpty();
        m64133I(i);
        if (z2) {
            List v = m64137v(false);
            if (v != null) {
                return v;
            }
            List v2 = m64137v(true);
            if (v2 != null) {
                return v2;
            }
        }
        throw NotFoundException.m23155a();
    }
}
