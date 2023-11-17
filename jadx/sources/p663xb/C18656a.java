package p663xb;

import com.google.zxing.NotFoundException;
import p200ob.C7507a;

/* renamed from: xb.a */
public final class C18656a extends C18676r {

    /* renamed from: d */
    static final char[] f52258d = "0123456789-$:/.+ABCD".toCharArray();

    /* renamed from: e */
    static final int[] f52259e = {3, 6, 9, 96, 18, 66, 33, 36, 48, 72, 12, 24, 69, 81, 84, 21, 26, 41, 11, 14};

    /* renamed from: f */
    private static final char[] f52260f = {'A', 'B', 'C', 'D'};

    /* renamed from: a */
    private final StringBuilder f52261a = new StringBuilder(20);

    /* renamed from: b */
    private int[] f52262b = new int[80];

    /* renamed from: c */
    private int f52263c = 0;

    /* renamed from: i */
    static boolean m63211i(char[] cArr, char c) {
        if (cArr != null) {
            for (char c2 : cArr) {
                if (c2 == c) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: j */
    private void m63212j(int i) {
        int[] iArr = this.f52262b;
        int i2 = this.f52263c;
        iArr[i2] = i;
        int i3 = i2 + 1;
        this.f52263c = i3;
        if (i3 >= iArr.length) {
            int[] iArr2 = new int[(i3 << 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i3);
            this.f52262b = iArr2;
        }
    }

    /* renamed from: k */
    private int m63213k() {
        for (int i = 1; i < this.f52263c; i += 2) {
            int m = m63215m(i);
            if (m != -1 && m63211i(f52260f, f52258d[m])) {
                int i2 = 0;
                for (int i3 = i; i3 < i + 7; i3++) {
                    i2 += this.f52262b[i3];
                }
                if (i == 1 || this.f52262b[i - 1] >= i2 / 2) {
                    return i;
                }
            }
        }
        throw NotFoundException.m23155a();
    }

    /* renamed from: l */
    private void m63214l(C7507a aVar) {
        int i = 0;
        this.f52263c = 0;
        int k = aVar.mo21960k(0);
        int l = aVar.mo21961l();
        if (k < l) {
            boolean z = true;
            while (k < l) {
                if (aVar.mo21956g(k) != z) {
                    i++;
                } else {
                    m63212j(i);
                    z = !z;
                    i = 1;
                }
                k++;
            }
            m63212j(i);
            return;
        }
        throw NotFoundException.m23155a();
    }

    /* renamed from: m */
    private int m63215m(int i) {
        int i2;
        int i3 = i + 7;
        if (i3 >= this.f52263c) {
            return -1;
        }
        int[] iArr = this.f52262b;
        int i4 = Integer.MAX_VALUE;
        int i5 = 0;
        int i6 = Integer.MAX_VALUE;
        int i7 = 0;
        for (int i8 = i; i8 < i3; i8 += 2) {
            int i9 = iArr[i8];
            if (i9 < i6) {
                i6 = i9;
            }
            if (i9 > i7) {
                i7 = i9;
            }
        }
        int i12 = (i6 + i7) / 2;
        int i13 = 0;
        for (int i14 = i + 1; i14 < i3; i14 += 2) {
            int i15 = iArr[i14];
            if (i15 < i4) {
                i4 = i15;
            }
            if (i15 > i13) {
                i13 = i15;
            }
        }
        int i16 = (i4 + i13) / 2;
        int i17 = 128;
        int i18 = 0;
        for (int i19 = 0; i19 < 7; i19++) {
            if ((i19 & 1) == 0) {
                i2 = i12;
            } else {
                i2 = i16;
            }
            i17 >>= 1;
            if (iArr[i + i19] > i2) {
                i18 |= i17;
            }
        }
        while (true) {
            int[] iArr2 = f52259e;
            if (i5 >= iArr2.length) {
                return -1;
            }
            if (iArr2[i5] == i18) {
                return i5;
            }
            i5++;
        }
    }

    /* renamed from: n */
    private void m63216n(int i) {
        int[] iArr = {0, 0, 0, 0};
        int[] iArr2 = {0, 0, 0, 0};
        int length = this.f52261a.length() - 1;
        int i2 = 0;
        int i3 = i;
        int i4 = 0;
        while (true) {
            int i5 = f52259e[this.f52261a.charAt(i4)];
            for (int i6 = 6; i6 >= 0; i6--) {
                int i7 = (i6 & 1) + ((i5 & 1) << 1);
                iArr[i7] = iArr[i7] + this.f52262b[i3 + i6];
                iArr2[i7] = iArr2[i7] + 1;
                i5 >>= 1;
            }
            if (i4 >= length) {
                break;
            }
            i3 += 8;
            i4++;
        }
        float[] fArr = new float[4];
        float[] fArr2 = new float[4];
        for (int i8 = 0; i8 < 2; i8++) {
            fArr2[i8] = 0.0f;
            int i9 = i8 + 2;
            float f = ((float) iArr[i8]) / ((float) iArr2[i8]);
            int i12 = iArr[i9];
            int i13 = iArr2[i9];
            float f2 = (f + (((float) i12) / ((float) i13))) / 2.0f;
            fArr2[i9] = f2;
            fArr[i8] = f2;
            fArr[i9] = ((((float) i12) * 2.0f) + 1.5f) / ((float) i13);
        }
        loop3:
        while (true) {
            int i14 = f52259e[this.f52261a.charAt(i2)];
            int i15 = 6;
            while (i15 >= 0) {
                int i16 = (i15 & 1) + ((i14 & 1) << 1);
                float f3 = (float) this.f52262b[i + i15];
                if (f3 >= fArr2[i16] && f3 <= fArr[i16]) {
                    i14 >>= 1;
                    i15--;
                }
            }
            if (i2 < length) {
                i += 8;
                i2++;
            } else {
                return;
            }
        }
        throw NotFoundException.m23155a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x001a  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0101 A[SYNTHETIC] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.zxing.C5764m mo46487d(int r11, p200ob.C7507a r12, java.util.Map r13) {
        /*
            r10 = this;
            int[] r0 = r10.f52262b
            r1 = 0
            java.util.Arrays.fill(r0, r1)
            r10.m63214l(r12)
            int r12 = r10.m63213k()
            java.lang.StringBuilder r0 = r10.f52261a
            r0.setLength(r1)
            r0 = r12
        L_0x0013:
            int r2 = r10.m63215m(r0)
            r3 = -1
            if (r2 == r3) goto L_0x0101
            java.lang.StringBuilder r4 = r10.f52261a
            char r5 = (char) r2
            r4.append(r5)
            int r0 = r0 + 8
            java.lang.StringBuilder r4 = r10.f52261a
            int r4 = r4.length()
            r5 = 1
            if (r4 <= r5) goto L_0x0037
            char[] r4 = f52260f
            char[] r6 = f52258d
            char r2 = r6[r2]
            boolean r2 = m63211i(r4, r2)
            if (r2 != 0) goto L_0x003b
        L_0x0037:
            int r2 = r10.f52263c
            if (r0 < r2) goto L_0x0013
        L_0x003b:
            int[] r2 = r10.f52262b
            int r4 = r0 + -1
            r2 = r2[r4]
            r6 = -8
            r7 = r1
        L_0x0043:
            if (r6 >= r3) goto L_0x004f
            int[] r8 = r10.f52262b
            int r9 = r0 + r6
            r8 = r8[r9]
            int r7 = r7 + r8
            int r6 = r6 + 1
            goto L_0x0043
        L_0x004f:
            int r3 = r10.f52263c
            r6 = 2
            if (r0 >= r3) goto L_0x005d
            int r7 = r7 / r6
            if (r2 < r7) goto L_0x0058
            goto L_0x005d
        L_0x0058:
            com.google.zxing.NotFoundException r11 = com.google.zxing.NotFoundException.m23155a()
            throw r11
        L_0x005d:
            r10.m63216n(r12)
            r0 = r1
        L_0x0061:
            java.lang.StringBuilder r2 = r10.f52261a
            int r2 = r2.length()
            if (r0 >= r2) goto L_0x0079
            java.lang.StringBuilder r2 = r10.f52261a
            char[] r3 = f52258d
            char r7 = r2.charAt(r0)
            char r3 = r3[r7]
            r2.setCharAt(r0, r3)
            int r0 = r0 + 1
            goto L_0x0061
        L_0x0079:
            java.lang.StringBuilder r0 = r10.f52261a
            char r0 = r0.charAt(r1)
            char[] r2 = f52260f
            boolean r0 = m63211i(r2, r0)
            if (r0 == 0) goto L_0x00fc
            java.lang.StringBuilder r0 = r10.f52261a
            int r3 = r0.length()
            int r3 = r3 - r5
            char r0 = r0.charAt(r3)
            boolean r0 = m63211i(r2, r0)
            if (r0 == 0) goto L_0x00f7
            java.lang.StringBuilder r0 = r10.f52261a
            int r0 = r0.length()
            r2 = 3
            if (r0 <= r2) goto L_0x00f2
            if (r13 == 0) goto L_0x00ab
            com.google.zxing.d r0 = com.google.zxing.C5754d.RETURN_CODABAR_START_END
            boolean r13 = r13.containsKey(r0)
            if (r13 != 0) goto L_0x00ba
        L_0x00ab:
            java.lang.StringBuilder r13 = r10.f52261a
            int r0 = r13.length()
            int r0 = r0 - r5
            r13.deleteCharAt(r0)
            java.lang.StringBuilder r13 = r10.f52261a
            r13.deleteCharAt(r1)
        L_0x00ba:
            r13 = r1
            r0 = r13
        L_0x00bc:
            if (r13 >= r12) goto L_0x00c6
            int[] r2 = r10.f52262b
            r2 = r2[r13]
            int r0 = r0 + r2
            int r13 = r13 + 1
            goto L_0x00bc
        L_0x00c6:
            float r13 = (float) r0
        L_0x00c7:
            if (r12 >= r4) goto L_0x00d1
            int[] r2 = r10.f52262b
            r2 = r2[r12]
            int r0 = r0 + r2
            int r12 = r12 + 1
            goto L_0x00c7
        L_0x00d1:
            float r12 = (float) r0
            com.google.zxing.m r0 = new com.google.zxing.m
            java.lang.StringBuilder r2 = r10.f52261a
            java.lang.String r2 = r2.toString()
            com.google.zxing.o[] r3 = new com.google.zxing.C5766o[r6]
            com.google.zxing.o r4 = new com.google.zxing.o
            float r11 = (float) r11
            r4.<init>(r13, r11)
            r3[r1] = r4
            com.google.zxing.o r13 = new com.google.zxing.o
            r13.<init>(r12, r11)
            r3[r5] = r13
            com.google.zxing.a r11 = com.google.zxing.C5751a.CODABAR
            r12 = 0
            r0.<init>(r2, r12, r3, r11)
            return r0
        L_0x00f2:
            com.google.zxing.NotFoundException r11 = com.google.zxing.NotFoundException.m23155a()
            throw r11
        L_0x00f7:
            com.google.zxing.NotFoundException r11 = com.google.zxing.NotFoundException.m23155a()
            throw r11
        L_0x00fc:
            com.google.zxing.NotFoundException r11 = com.google.zxing.NotFoundException.m23155a()
            throw r11
        L_0x0101:
            com.google.zxing.NotFoundException r11 = com.google.zxing.NotFoundException.m23155a()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p663xb.C18656a.mo46487d(int, ob.a, java.util.Map):com.google.zxing.m");
    }
}
