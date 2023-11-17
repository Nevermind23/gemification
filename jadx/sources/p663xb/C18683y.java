package p663xb;

import com.google.zxing.C5751a;
import com.google.zxing.C5764m;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import java.util.Arrays;
import java.util.Map;
import p200ob.C7507a;

/* renamed from: xb.y */
public abstract class C18683y extends C18676r {

    /* renamed from: d */
    static final int[] f52315d = {1, 1, 1};

    /* renamed from: e */
    static final int[] f52316e = {1, 1, 1, 1, 1};

    /* renamed from: f */
    static final int[] f52317f = {1, 1, 1, 1, 1, 1};

    /* renamed from: g */
    static final int[][] f52318g;

    /* renamed from: h */
    static final int[][] f52319h;

    /* renamed from: a */
    private final StringBuilder f52320a = new StringBuilder(20);

    /* renamed from: b */
    private final C18682x f52321b = new C18682x();

    /* renamed from: c */
    private final C18671m f52322c = new C18671m();

    static {
        int[][] iArr = {new int[]{3, 2, 1, 1}, new int[]{2, 2, 2, 1}, new int[]{2, 1, 2, 2}, new int[]{1, 4, 1, 1}, new int[]{1, 1, 3, 2}, new int[]{1, 2, 3, 1}, new int[]{1, 1, 1, 4}, new int[]{1, 3, 1, 2}, new int[]{1, 2, 1, 3}, new int[]{3, 1, 1, 2}};
        f52318g = iArr;
        int[][] iArr2 = new int[20][];
        f52319h = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, 10);
        for (int i = 10; i < 20; i++) {
            int[] iArr3 = f52318g[i - 10];
            int[] iArr4 = new int[iArr3.length];
            for (int i2 = 0; i2 < iArr3.length; i2++) {
                iArr4[i2] = iArr3[(iArr3.length - i2) - 1];
            }
            f52319h[i] = iArr4;
        }
    }

    protected C18683y() {
    }

    /* renamed from: j */
    static boolean m63315j(CharSequence charSequence) {
        int length = charSequence.length();
        if (length == 0) {
            return false;
        }
        int i = length - 1;
        if (m63320s(charSequence.subSequence(0, i)) == Character.digit(charSequence.charAt(i), 10)) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    static int m63316k(C7507a aVar, int[] iArr, int i, int[][] iArr2) {
        C18676r.m63284g(aVar, i, iArr);
        int length = iArr2.length;
        float f = 0.48f;
        int i2 = -1;
        for (int i3 = 0; i3 < length; i3++) {
            float f2 = C18676r.m63283f(iArr, iArr2[i3], 0.7f);
            if (f2 < f) {
                i2 = i3;
                f = f2;
            }
        }
        if (i2 >= 0) {
            return i2;
        }
        throw NotFoundException.m23155a();
    }

    /* renamed from: o */
    static int[] m63317o(C7507a aVar, int i, boolean z, int[] iArr) {
        return m63318p(aVar, i, z, iArr, new int[iArr.length]);
    }

    /* renamed from: p */
    private static int[] m63318p(C7507a aVar, int i, boolean z, int[] iArr, int[] iArr2) {
        int i2;
        int l = aVar.mo21961l();
        if (z) {
            i2 = aVar.mo21960k(i);
        } else {
            i2 = aVar.mo21959j(i);
        }
        int length = iArr.length;
        boolean z2 = z;
        int i3 = 0;
        int i4 = i2;
        while (i2 < l) {
            if (aVar.mo21956g(i2) != z2) {
                iArr2[i3] = iArr2[i3] + 1;
            } else {
                if (i3 != length - 1) {
                    i3++;
                } else if (C18676r.m63283f(iArr2, iArr, 0.7f) < 0.48f) {
                    return new int[]{i4, i2};
                } else {
                    i4 += iArr2[0] + iArr2[1];
                    int i5 = i3 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i5);
                    iArr2[i5] = 0;
                    iArr2[i3] = 0;
                    i3--;
                }
                iArr2[i3] = 1;
                z2 = !z2;
            }
            i2++;
        }
        throw NotFoundException.m23155a();
    }

    /* renamed from: q */
    static int[] m63319q(C7507a aVar) {
        int[] iArr = new int[f52315d.length];
        int[] iArr2 = null;
        boolean z = false;
        int i = 0;
        while (!z) {
            int[] iArr3 = f52315d;
            Arrays.fill(iArr, 0, iArr3.length, 0);
            iArr2 = m63318p(aVar, i, false, iArr3, iArr);
            int i2 = iArr2[0];
            int i3 = iArr2[1];
            int i4 = i2 - (i3 - i2);
            if (i4 >= 0) {
                z = aVar.mo21963n(i4, i2, false);
            }
            i = i3;
        }
        return iArr2;
    }

    /* renamed from: s */
    static int m63320s(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        for (int i2 = length - 1; i2 >= 0; i2 -= 2) {
            int charAt = charSequence.charAt(i2) - '0';
            if (charAt < 0 || charAt > 9) {
                throw FormatException.m23153a();
            }
            i += charAt;
        }
        int i3 = i * 3;
        for (int i4 = length - 2; i4 >= 0; i4 -= 2) {
            int charAt2 = charSequence.charAt(i4) - '0';
            if (charAt2 < 0 || charAt2 > 9) {
                throw FormatException.m23153a();
            }
            i3 += charAt2;
        }
        return (1000 - i3) % 10;
    }

    /* renamed from: d */
    public C5764m mo46487d(int i, C7507a aVar, Map map) {
        return mo46496n(i, aVar, m63319q(aVar), map);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public boolean mo46488i(String str) {
        return m63315j(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public int[] mo46489l(C7507a aVar, int i) {
        return m63317o(aVar, i, false, f52315d);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public abstract int mo46490m(C7507a aVar, int[] iArr, StringBuilder sb);

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: int[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.zxing.C5764m mo46496n(int r12, p200ob.C7507a r13, int[] r14, java.util.Map r15) {
        /*
            r11 = this;
            r0 = 0
            if (r15 != 0) goto L_0x0005
            r1 = r0
            goto L_0x000d
        L_0x0005:
            com.google.zxing.d r1 = com.google.zxing.C5754d.NEED_RESULT_POINT_CALLBACK
            java.lang.Object r1 = r15.get(r1)
            com.google.zxing.p r1 = (com.google.zxing.C5767p) r1
        L_0x000d:
            r2 = 1073741824(0x40000000, float:2.0)
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L_0x0023
            com.google.zxing.o r5 = new com.google.zxing.o
            r6 = r14[r4]
            r7 = r14[r3]
            int r6 = r6 + r7
            float r6 = (float) r6
            float r6 = r6 / r2
            float r7 = (float) r12
            r5.<init>(r6, r7)
            r1.mo18906a(r5)
        L_0x0023:
            java.lang.StringBuilder r5 = r11.f52320a
            r5.setLength(r4)
            int r6 = r11.mo46490m(r13, r14, r5)
            if (r1 == 0) goto L_0x0038
            com.google.zxing.o r7 = new com.google.zxing.o
            float r8 = (float) r6
            float r9 = (float) r12
            r7.<init>(r8, r9)
            r1.mo18906a(r7)
        L_0x0038:
            int[] r6 = r11.mo46489l(r13, r6)
            if (r1 == 0) goto L_0x004e
            com.google.zxing.o r7 = new com.google.zxing.o
            r8 = r6[r4]
            r9 = r6[r3]
            int r8 = r8 + r9
            float r8 = (float) r8
            float r8 = r8 / r2
            float r9 = (float) r12
            r7.<init>(r8, r9)
            r1.mo18906a(r7)
        L_0x004e:
            r1 = r6[r3]
            r7 = r6[r4]
            int r7 = r1 - r7
            int r7 = r7 + r1
            int r8 = r13.mo21961l()
            if (r7 >= r8) goto L_0x0108
            boolean r1 = r13.mo21963n(r1, r7, r4)
            if (r1 == 0) goto L_0x0108
            java.lang.String r1 = r5.toString()
            int r5 = r1.length()
            r7 = 8
            if (r5 < r7) goto L_0x0103
            boolean r5 = r11.mo46488i(r1)
            if (r5 == 0) goto L_0x00fe
            r5 = r14[r3]
            r14 = r14[r4]
            int r5 = r5 + r14
            float r14 = (float) r5
            float r14 = r14 / r2
            r5 = r6[r3]
            r7 = r6[r4]
            int r5 = r5 + r7
            float r5 = (float) r5
            float r5 = r5 / r2
            com.google.zxing.a r2 = r11.mo46491r()
            com.google.zxing.m r7 = new com.google.zxing.m
            r8 = 2
            com.google.zxing.o[] r8 = new com.google.zxing.C5766o[r8]
            com.google.zxing.o r9 = new com.google.zxing.o
            float r10 = (float) r12
            r9.<init>(r14, r10)
            r8[r4] = r9
            com.google.zxing.o r14 = new com.google.zxing.o
            r14.<init>(r5, r10)
            r8[r3] = r14
            r7.<init>(r1, r0, r8, r2)
            xb.x r14 = r11.f52321b     // Catch:{ ReaderException -> 0x00c4 }
            r5 = r6[r3]     // Catch:{ ReaderException -> 0x00c4 }
            com.google.zxing.m r12 = r14.mo46499a(r12, r13, r5)     // Catch:{ ReaderException -> 0x00c4 }
            com.google.zxing.n r13 = com.google.zxing.C5765n.UPC_EAN_EXTENSION     // Catch:{ ReaderException -> 0x00c4 }
            java.lang.String r14 = r12.mo18897f()     // Catch:{ ReaderException -> 0x00c4 }
            r7.mo18899h(r13, r14)     // Catch:{ ReaderException -> 0x00c4 }
            java.util.Map r13 = r12.mo18895d()     // Catch:{ ReaderException -> 0x00c4 }
            r7.mo18898g(r13)     // Catch:{ ReaderException -> 0x00c4 }
            com.google.zxing.o[] r13 = r12.mo18896e()     // Catch:{ ReaderException -> 0x00c4 }
            r7.mo18892a(r13)     // Catch:{ ReaderException -> 0x00c4 }
            java.lang.String r12 = r12.mo18897f()     // Catch:{ ReaderException -> 0x00c4 }
            int r12 = r12.length()     // Catch:{ ReaderException -> 0x00c4 }
            goto L_0x00c5
        L_0x00c4:
            r12 = r4
        L_0x00c5:
            if (r15 != 0) goto L_0x00c8
            goto L_0x00d1
        L_0x00c8:
            com.google.zxing.d r13 = com.google.zxing.C5754d.ALLOWED_EAN_EXTENSIONS
            java.lang.Object r13 = r15.get(r13)
            r0 = r13
            int[] r0 = (int[]) r0
        L_0x00d1:
            if (r0 == 0) goto L_0x00e8
            int r13 = r0.length
            r14 = r4
        L_0x00d5:
            if (r14 >= r13) goto L_0x00df
            r15 = r0[r14]
            if (r12 != r15) goto L_0x00dc
            goto L_0x00e0
        L_0x00dc:
            int r14 = r14 + 1
            goto L_0x00d5
        L_0x00df:
            r3 = r4
        L_0x00e0:
            if (r3 == 0) goto L_0x00e3
            goto L_0x00e8
        L_0x00e3:
            com.google.zxing.NotFoundException r12 = com.google.zxing.NotFoundException.m23155a()
            throw r12
        L_0x00e8:
            com.google.zxing.a r12 = com.google.zxing.C5751a.EAN_13
            if (r2 == r12) goto L_0x00f0
            com.google.zxing.a r12 = com.google.zxing.C5751a.UPC_A
            if (r2 != r12) goto L_0x00fd
        L_0x00f0:
            xb.m r12 = r11.f52322c
            java.lang.String r12 = r12.mo46494c(r1)
            if (r12 == 0) goto L_0x00fd
            com.google.zxing.n r13 = com.google.zxing.C5765n.POSSIBLE_COUNTRY
            r7.mo18899h(r13, r12)
        L_0x00fd:
            return r7
        L_0x00fe:
            com.google.zxing.ChecksumException r12 = com.google.zxing.ChecksumException.m23152a()
            throw r12
        L_0x0103:
            com.google.zxing.FormatException r12 = com.google.zxing.FormatException.m23153a()
            throw r12
        L_0x0108:
            com.google.zxing.NotFoundException r12 = com.google.zxing.NotFoundException.m23155a()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p663xb.C18683y.mo46496n(int, ob.a, int[], java.util.Map):com.google.zxing.m");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public abstract C5751a mo46491r();
}
