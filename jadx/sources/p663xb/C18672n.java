package p663xb;

import com.google.zxing.C5751a;
import com.google.zxing.C5754d;
import com.google.zxing.C5764m;
import com.google.zxing.C5766o;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import java.util.Map;
import p200ob.C7507a;

/* renamed from: xb.n */
public final class C18672n extends C18676r {

    /* renamed from: b */
    private static final int[] f52292b = {6, 8, 10, 12, 14};

    /* renamed from: c */
    private static final int[] f52293c = {1, 1, 1, 1};

    /* renamed from: d */
    private static final int[][] f52294d = {new int[]{1, 1, 2}, new int[]{1, 1, 3}};

    /* renamed from: e */
    private static final int[][] f52295e = {new int[]{1, 1, 2, 2, 1}, new int[]{2, 1, 1, 1, 2}, new int[]{1, 2, 1, 1, 2}, new int[]{2, 2, 1, 1, 1}, new int[]{1, 1, 2, 1, 2}, new int[]{2, 1, 2, 1, 1}, new int[]{1, 2, 2, 1, 1}, new int[]{1, 1, 1, 2, 2}, new int[]{2, 1, 1, 2, 1}, new int[]{1, 2, 1, 2, 1}, new int[]{1, 1, 3, 3, 1}, new int[]{3, 1, 1, 1, 3}, new int[]{1, 3, 1, 1, 3}, new int[]{3, 3, 1, 1, 1}, new int[]{1, 1, 3, 1, 3}, new int[]{3, 1, 3, 1, 1}, new int[]{1, 3, 3, 1, 1}, new int[]{1, 1, 1, 3, 3}, new int[]{3, 1, 1, 3, 1}, new int[]{1, 3, 1, 3, 1}};

    /* renamed from: a */
    private int f52296a = -1;

    /* renamed from: i */
    private static int m63268i(int[] iArr) {
        int length = f52295e.length;
        float f = 0.38f;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            float f2 = C18676r.m63283f(iArr, f52295e[i2], 0.5f);
            if (f2 < f) {
                i = i2;
                f = f2;
            } else if (f2 == f) {
                i = -1;
            }
        }
        if (i >= 0) {
            return i % 10;
        }
        throw NotFoundException.m23155a();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:6|7) */
    /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
        r0 = m63272m(r7, r0, f52294d[1]);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0012 */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int[] m63269j(p200ob.C7507a r7) {
        /*
            r6 = this;
            r7.mo21964p()
            int r0 = m63273n(r7)     // Catch:{ all -> 0x0035 }
            r1 = 1
            r2 = 0
            int[][] r3 = f52294d     // Catch:{ NotFoundException -> 0x0012 }
            r3 = r3[r2]     // Catch:{ NotFoundException -> 0x0012 }
            int[] r0 = m63272m(r7, r0, r3)     // Catch:{ NotFoundException -> 0x0012 }
            goto L_0x001a
        L_0x0012:
            int[][] r3 = f52294d     // Catch:{ all -> 0x0035 }
            r3 = r3[r1]     // Catch:{ all -> 0x0035 }
            int[] r0 = m63272m(r7, r0, r3)     // Catch:{ all -> 0x0035 }
        L_0x001a:
            r3 = r0[r2]     // Catch:{ all -> 0x0035 }
            r6.m63274o(r7, r3)     // Catch:{ all -> 0x0035 }
            r3 = r0[r2]     // Catch:{ all -> 0x0035 }
            int r4 = r7.mo21961l()     // Catch:{ all -> 0x0035 }
            r5 = r0[r1]     // Catch:{ all -> 0x0035 }
            int r4 = r4 - r5
            r0[r2] = r4     // Catch:{ all -> 0x0035 }
            int r2 = r7.mo21961l()     // Catch:{ all -> 0x0035 }
            int r2 = r2 - r3
            r0[r1] = r2     // Catch:{ all -> 0x0035 }
            r7.mo21964p()
            return r0
        L_0x0035:
            r0 = move-exception
            r7.mo21964p()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p663xb.C18672n.m63269j(ob.a):int[]");
    }

    /* renamed from: k */
    private static void m63270k(C7507a aVar, int i, int i2, StringBuilder sb) {
        int[] iArr = new int[10];
        int[] iArr2 = new int[5];
        int[] iArr3 = new int[5];
        while (i < i2) {
            C18676r.m63284g(aVar, i, iArr);
            for (int i3 = 0; i3 < 5; i3++) {
                int i4 = i3 * 2;
                iArr2[i3] = iArr[i4];
                iArr3[i3] = iArr[i4 + 1];
            }
            sb.append((char) (m63268i(iArr2) + 48));
            sb.append((char) (m63268i(iArr3) + 48));
            for (int i5 = 0; i5 < 10; i5++) {
                i += iArr[i5];
            }
        }
    }

    /* renamed from: l */
    private int[] m63271l(C7507a aVar) {
        int[] m = m63272m(aVar, m63273n(aVar), f52293c);
        int i = m[1];
        int i2 = m[0];
        this.f52296a = (i - i2) / 4;
        m63274o(aVar, i2);
        return m;
    }

    /* renamed from: m */
    private static int[] m63272m(C7507a aVar, int i, int[] iArr) {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        int l = aVar.mo21961l();
        int i2 = i;
        boolean z = false;
        int i3 = 0;
        while (i < l) {
            if (aVar.mo21956g(i) != z) {
                iArr2[i3] = iArr2[i3] + 1;
            } else {
                if (i3 != length - 1) {
                    i3++;
                } else if (C18676r.m63283f(iArr2, iArr, 0.5f) < 0.38f) {
                    return new int[]{i2, i};
                } else {
                    i2 += iArr2[0] + iArr2[1];
                    int i4 = i3 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i4);
                    iArr2[i4] = 0;
                    iArr2[i3] = 0;
                    i3--;
                }
                iArr2[i3] = 1;
                z = !z;
            }
            i++;
        }
        throw NotFoundException.m23155a();
    }

    /* renamed from: n */
    private static int m63273n(C7507a aVar) {
        int l = aVar.mo21961l();
        int j = aVar.mo21959j(0);
        if (j != l) {
            return j;
        }
        throw NotFoundException.m23155a();
    }

    /* renamed from: o */
    private void m63274o(C7507a aVar, int i) {
        int min = Math.min(this.f52296a * 10, i);
        int i2 = i - 1;
        while (min > 0 && i2 >= 0 && !aVar.mo21956g(i2)) {
            min--;
            i2--;
        }
        if (min != 0) {
            throw NotFoundException.m23155a();
        }
    }

    /* renamed from: d */
    public C5764m mo46487d(int i, C7507a aVar, Map map) {
        int[] iArr;
        boolean z;
        int[] l = m63271l(aVar);
        int[] j = m63269j(aVar);
        StringBuilder sb = new StringBuilder(20);
        m63270k(aVar, l[1], j[0], sb);
        String sb2 = sb.toString();
        if (map != null) {
            iArr = (int[]) map.get(C5754d.ALLOWED_LENGTHS);
        } else {
            iArr = null;
        }
        if (iArr == null) {
            iArr = f52292b;
        }
        int length = sb2.length();
        int length2 = iArr.length;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= length2) {
                z = false;
                break;
            }
            int i4 = iArr[i2];
            if (length == i4) {
                z = true;
                break;
            }
            if (i4 > i3) {
                i3 = i4;
            }
            i2++;
        }
        if (!z && length > i3) {
            z = true;
        }
        if (z) {
            float f = (float) i;
            return new C5764m(sb2, (byte[]) null, new C5766o[]{new C5766o((float) l[1], f), new C5766o((float) j[0], f)}, C5751a.ITF);
        }
        throw FormatException.m23153a();
    }
}
