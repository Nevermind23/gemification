package p663xb;

import com.google.zxing.NotFoundException;
import p200ob.C7507a;

/* renamed from: xb.c */
public final class C18660c extends C18676r {

    /* renamed from: a */
    static final int[][] f52271a = {new int[]{2, 1, 2, 2, 2, 2}, new int[]{2, 2, 2, 1, 2, 2}, new int[]{2, 2, 2, 2, 2, 1}, new int[]{1, 2, 1, 2, 2, 3}, new int[]{1, 2, 1, 3, 2, 2}, new int[]{1, 3, 1, 2, 2, 2}, new int[]{1, 2, 2, 2, 1, 3}, new int[]{1, 2, 2, 3, 1, 2}, new int[]{1, 3, 2, 2, 1, 2}, new int[]{2, 2, 1, 2, 1, 3}, new int[]{2, 2, 1, 3, 1, 2}, new int[]{2, 3, 1, 2, 1, 2}, new int[]{1, 1, 2, 2, 3, 2}, new int[]{1, 2, 2, 1, 3, 2}, new int[]{1, 2, 2, 2, 3, 1}, new int[]{1, 1, 3, 2, 2, 2}, new int[]{1, 2, 3, 1, 2, 2}, new int[]{1, 2, 3, 2, 2, 1}, new int[]{2, 2, 3, 2, 1, 1}, new int[]{2, 2, 1, 1, 3, 2}, new int[]{2, 2, 1, 2, 3, 1}, new int[]{2, 1, 3, 2, 1, 2}, new int[]{2, 2, 3, 1, 1, 2}, new int[]{3, 1, 2, 1, 3, 1}, new int[]{3, 1, 1, 2, 2, 2}, new int[]{3, 2, 1, 1, 2, 2}, new int[]{3, 2, 1, 2, 2, 1}, new int[]{3, 1, 2, 2, 1, 2}, new int[]{3, 2, 2, 1, 1, 2}, new int[]{3, 2, 2, 2, 1, 1}, new int[]{2, 1, 2, 1, 2, 3}, new int[]{2, 1, 2, 3, 2, 1}, new int[]{2, 3, 2, 1, 2, 1}, new int[]{1, 1, 1, 3, 2, 3}, new int[]{1, 3, 1, 1, 2, 3}, new int[]{1, 3, 1, 3, 2, 1}, new int[]{1, 1, 2, 3, 1, 3}, new int[]{1, 3, 2, 1, 1, 3}, new int[]{1, 3, 2, 3, 1, 1}, new int[]{2, 1, 1, 3, 1, 3}, new int[]{2, 3, 1, 1, 1, 3}, new int[]{2, 3, 1, 3, 1, 1}, new int[]{1, 1, 2, 1, 3, 3}, new int[]{1, 1, 2, 3, 3, 1}, new int[]{1, 3, 2, 1, 3, 1}, new int[]{1, 1, 3, 1, 2, 3}, new int[]{1, 1, 3, 3, 2, 1}, new int[]{1, 3, 3, 1, 2, 1}, new int[]{3, 1, 3, 1, 2, 1}, new int[]{2, 1, 1, 3, 3, 1}, new int[]{2, 3, 1, 1, 3, 1}, new int[]{2, 1, 3, 1, 1, 3}, new int[]{2, 1, 3, 3, 1, 1}, new int[]{2, 1, 3, 1, 3, 1}, new int[]{3, 1, 1, 1, 2, 3}, new int[]{3, 1, 1, 3, 2, 1}, new int[]{3, 3, 1, 1, 2, 1}, new int[]{3, 1, 2, 1, 1, 3}, new int[]{3, 1, 2, 3, 1, 1}, new int[]{3, 3, 2, 1, 1, 1}, new int[]{3, 1, 4, 1, 1, 1}, new int[]{2, 2, 1, 4, 1, 1}, new int[]{4, 3, 1, 1, 1, 1}, new int[]{1, 1, 1, 2, 2, 4}, new int[]{1, 1, 1, 4, 2, 2}, new int[]{1, 2, 1, 1, 2, 4}, new int[]{1, 2, 1, 4, 2, 1}, new int[]{1, 4, 1, 1, 2, 2}, new int[]{1, 4, 1, 2, 2, 1}, new int[]{1, 1, 2, 2, 1, 4}, new int[]{1, 1, 2, 4, 1, 2}, new int[]{1, 2, 2, 1, 1, 4}, new int[]{1, 2, 2, 4, 1, 1}, new int[]{1, 4, 2, 1, 1, 2}, new int[]{1, 4, 2, 2, 1, 1}, new int[]{2, 4, 1, 2, 1, 1}, new int[]{2, 2, 1, 1, 1, 4}, new int[]{4, 1, 3, 1, 1, 1}, new int[]{2, 4, 1, 1, 1, 2}, new int[]{1, 3, 4, 1, 1, 1}, new int[]{1, 1, 1, 2, 4, 2}, new int[]{1, 2, 1, 1, 4, 2}, new int[]{1, 2, 1, 2, 4, 1}, new int[]{1, 1, 4, 2, 1, 2}, new int[]{1, 2, 4, 1, 1, 2}, new int[]{1, 2, 4, 2, 1, 1}, new int[]{4, 1, 1, 2, 1, 2}, new int[]{4, 2, 1, 1, 1, 2}, new int[]{4, 2, 1, 2, 1, 1}, new int[]{2, 1, 2, 1, 4, 1}, new int[]{2, 1, 4, 1, 2, 1}, new int[]{4, 1, 2, 1, 2, 1}, new int[]{1, 1, 1, 1, 4, 3}, new int[]{1, 1, 1, 3, 4, 1}, new int[]{1, 3, 1, 1, 4, 1}, new int[]{1, 1, 4, 1, 1, 3}, new int[]{1, 1, 4, 3, 1, 1}, new int[]{4, 1, 1, 1, 1, 3}, new int[]{4, 1, 1, 3, 1, 1}, new int[]{1, 1, 3, 1, 4, 1}, new int[]{1, 1, 4, 1, 3, 1}, new int[]{3, 1, 1, 1, 4, 1}, new int[]{4, 1, 1, 1, 3, 1}, new int[]{2, 1, 1, 4, 1, 2}, new int[]{2, 1, 1, 2, 1, 4}, new int[]{2, 1, 1, 2, 3, 2}, new int[]{2, 3, 3, 1, 1, 1, 2}};

    /* renamed from: i */
    private static int m63228i(C7507a aVar, int[] iArr, int i) {
        C18676r.m63284g(aVar, i, iArr);
        float f = 0.25f;
        int i2 = -1;
        int i3 = 0;
        while (true) {
            int[][] iArr2 = f52271a;
            if (i3 >= iArr2.length) {
                break;
            }
            float f2 = C18676r.m63283f(iArr, iArr2[i3], 0.7f);
            if (f2 < f) {
                i2 = i3;
                f = f2;
            }
            i3++;
        }
        if (i2 >= 0) {
            return i2;
        }
        throw NotFoundException.m23155a();
    }

    /* renamed from: j */
    private static int[] m63229j(C7507a aVar) {
        int l = aVar.mo21961l();
        int j = aVar.mo21959j(0);
        int[] iArr = new int[6];
        boolean z = false;
        int i = 0;
        int i2 = j;
        while (j < l) {
            if (aVar.mo21956g(j) != z) {
                iArr[i] = iArr[i] + 1;
            } else {
                if (i == 5) {
                    int i3 = -1;
                    float f = 0.25f;
                    for (int i4 = 103; i4 <= 105; i4++) {
                        float f2 = C18676r.m63283f(iArr, f52271a[i4], 0.7f);
                        if (f2 < f) {
                            i3 = i4;
                            f = f2;
                        }
                    }
                    if (i3 < 0 || !aVar.mo21963n(Math.max(0, i2 - ((j - i2) / 2)), i2, false)) {
                        i2 += iArr[0] + iArr[1];
                        int i5 = i - 1;
                        System.arraycopy(iArr, 2, iArr, 0, i5);
                        iArr[i5] = 0;
                        iArr[i] = 0;
                        i--;
                    } else {
                        return new int[]{i2, j, i3};
                    }
                } else {
                    i++;
                }
                iArr[i] = 1;
                z = !z;
            }
            j++;
        }
        throw NotFoundException.m23155a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0178, code lost:
        r5 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x017b, code lost:
        if (r18 == false) goto L_0x0182;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x017d, code lost:
        if (r14 != 'e') goto L_0x0181;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x017f, code lost:
        r14 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0181, code lost:
        r14 = 'e';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0182, code lost:
        r18 = r5;
        r15 = 6;
        r23 = r12;
        r12 = r8;
        r8 = r21;
        r21 = r19;
        r19 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00e2, code lost:
        if (r9 != false) goto L_0x012c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00e8, code lost:
        r10 = 'd';
        r14 = 'd';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0101, code lost:
        r5 = false;
        r9 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0126, code lost:
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x012a, code lost:
        if (r9 != false) goto L_0x012c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x012c, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x012e, code lost:
        r5 = false;
        r9 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0131, code lost:
        r5 = false;
        r10 = 'd';
        r14 = 'c';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0138, code lost:
        r10 = 'd';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x013b, code lost:
        r16 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x013d, code lost:
        r5 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x013e, code lost:
        r10 = 'd';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x016f, code lost:
        r14 = 'e';
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.zxing.C5764m mo46487d(int r25, p200ob.C7507a r26, java.util.Map r27) {
        /*
            r24 = this;
            r0 = r26
            r1 = r27
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0012
            com.google.zxing.d r4 = com.google.zxing.C5754d.ASSUME_GS1
            boolean r1 = r1.containsKey(r4)
            if (r1 == 0) goto L_0x0012
            r1 = r2
            goto L_0x0013
        L_0x0012:
            r1 = r3
        L_0x0013:
            int[] r4 = m63229j(r26)
            r5 = 2
            r6 = r4[r5]
            java.util.ArrayList r7 = new java.util.ArrayList
            r8 = 20
            r7.<init>(r8)
            byte r9 = (byte) r6
            java.lang.Byte r9 = java.lang.Byte.valueOf(r9)
            r7.add(r9)
            switch(r6) {
                case 103: goto L_0x0037;
                case 104: goto L_0x0034;
                case 105: goto L_0x0031;
                default: goto L_0x002c;
            }
        L_0x002c:
            com.google.zxing.FormatException r0 = com.google.zxing.FormatException.m23153a()
            throw r0
        L_0x0031:
            r12 = 99
            goto L_0x0039
        L_0x0034:
            r12 = 100
            goto L_0x0039
        L_0x0037:
            r12 = 101(0x65, float:1.42E-43)
        L_0x0039:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>(r8)
            r8 = r4[r3]
            r14 = r4[r2]
            r15 = 6
            int[] r2 = new int[r15]
            r9 = r3
            r16 = r9
            r18 = r16
            r19 = r18
            r20 = r19
            r21 = r20
            r17 = 1
            r23 = r12
            r12 = r8
            r8 = r14
            r14 = r23
        L_0x0058:
            if (r16 != 0) goto L_0x0191
            int r12 = m63228i(r0, r2, r8)
            byte r5 = (byte) r12
            java.lang.Byte r5 = java.lang.Byte.valueOf(r5)
            r7.add(r5)
            r5 = 106(0x6a, float:1.49E-43)
            if (r12 == r5) goto L_0x006c
            r17 = 1
        L_0x006c:
            if (r12 == r5) goto L_0x0074
            int r20 = r20 + 1
            int r21 = r20 * r12
            int r6 = r6 + r21
        L_0x0074:
            r21 = r8
            r11 = 0
        L_0x0077:
            if (r11 >= r15) goto L_0x0080
            r22 = r2[r11]
            int r21 = r21 + r22
            int r11 = r11 + 1
            goto L_0x0077
        L_0x0080:
            switch(r12) {
                case 103: goto L_0x008e;
                case 104: goto L_0x008e;
                case 105: goto L_0x008e;
                default: goto L_0x0083;
            }
        L_0x0083:
            r11 = 96
            java.lang.String r15 = "]C1"
            switch(r14) {
                case 99: goto L_0x0141;
                case 100: goto L_0x00ee;
                case 101: goto L_0x0093;
                default: goto L_0x008a;
            }
        L_0x008a:
            r10 = 100
            goto L_0x0178
        L_0x008e:
            com.google.zxing.FormatException r0 = com.google.zxing.FormatException.m23153a()
            throw r0
        L_0x0093:
            r10 = 64
            if (r12 >= r10) goto L_0x00aa
            if (r9 != r3) goto L_0x00a1
            int r5 = r12 + 32
            char r5 = (char) r5
            r13.append(r5)
            goto L_0x0101
        L_0x00a1:
            int r5 = r12 + 32
            int r5 = r5 + 128
            char r5 = (char) r5
            r13.append(r5)
            goto L_0x0101
        L_0x00aa:
            if (r12 >= r11) goto L_0x00bc
            if (r9 != r3) goto L_0x00b5
            int r5 = r12 + -64
            char r5 = (char) r5
            r13.append(r5)
            goto L_0x0101
        L_0x00b5:
            int r5 = r12 + 64
            char r5 = (char) r5
            r13.append(r5)
            goto L_0x0101
        L_0x00bc:
            if (r12 == r5) goto L_0x00c0
            r17 = 0
        L_0x00c0:
            if (r12 == r5) goto L_0x013b
            switch(r12) {
                case 96: goto L_0x013d;
                case 97: goto L_0x013d;
                case 98: goto L_0x00e7;
                case 99: goto L_0x0131;
                case 100: goto L_0x00e5;
                case 101: goto L_0x00db;
                case 102: goto L_0x00c7;
                default: goto L_0x00c5;
            }
        L_0x00c5:
            goto L_0x013d
        L_0x00c7:
            if (r1 == 0) goto L_0x013d
            int r5 = r13.length()
            if (r5 != 0) goto L_0x00d4
            r13.append(r15)
            goto L_0x013d
        L_0x00d4:
            r5 = 29
            r13.append(r5)
            goto L_0x013d
        L_0x00db:
            if (r3 != 0) goto L_0x00e0
            if (r9 == 0) goto L_0x00e0
            goto L_0x0126
        L_0x00e0:
            if (r3 == 0) goto L_0x012e
            if (r9 == 0) goto L_0x012e
            goto L_0x012c
        L_0x00e5:
            r5 = 0
            goto L_0x00e8
        L_0x00e7:
            r5 = 1
        L_0x00e8:
            r10 = 100
            r14 = 100
            goto L_0x0179
        L_0x00ee:
            if (r12 >= r11) goto L_0x0104
            if (r9 != r3) goto L_0x00f9
            int r5 = r12 + 32
            char r5 = (char) r5
            r13.append(r5)
            goto L_0x0101
        L_0x00f9:
            int r5 = r12 + 32
            int r5 = r5 + 128
            char r5 = (char) r5
            r13.append(r5)
        L_0x0101:
            r5 = 0
            r9 = 0
            goto L_0x013e
        L_0x0104:
            if (r12 == r5) goto L_0x0108
            r17 = 0
        L_0x0108:
            if (r12 == r5) goto L_0x013b
            switch(r12) {
                case 96: goto L_0x013d;
                case 97: goto L_0x013d;
                case 98: goto L_0x0137;
                case 99: goto L_0x0131;
                case 100: goto L_0x0122;
                case 101: goto L_0x0120;
                case 102: goto L_0x010e;
                default: goto L_0x010d;
            }
        L_0x010d:
            goto L_0x013d
        L_0x010e:
            if (r1 == 0) goto L_0x013d
            int r5 = r13.length()
            if (r5 != 0) goto L_0x011a
            r13.append(r15)
            goto L_0x013d
        L_0x011a:
            r5 = 29
            r13.append(r5)
            goto L_0x013d
        L_0x0120:
            r5 = 0
            goto L_0x0138
        L_0x0122:
            if (r3 != 0) goto L_0x0128
            if (r9 == 0) goto L_0x0128
        L_0x0126:
            r3 = 1
            goto L_0x0101
        L_0x0128:
            if (r3 == 0) goto L_0x012e
            if (r9 == 0) goto L_0x012e
        L_0x012c:
            r3 = 0
            goto L_0x0101
        L_0x012e:
            r5 = 0
            r9 = 1
            goto L_0x013e
        L_0x0131:
            r5 = 0
            r10 = 100
            r14 = 99
            goto L_0x0179
        L_0x0137:
            r5 = 1
        L_0x0138:
            r10 = 100
            goto L_0x016f
        L_0x013b:
            r16 = 1
        L_0x013d:
            r5 = 0
        L_0x013e:
            r10 = 100
            goto L_0x0179
        L_0x0141:
            r10 = 100
            if (r12 >= r10) goto L_0x0152
            r5 = 10
            if (r12 >= r5) goto L_0x014e
            r5 = 48
            r13.append(r5)
        L_0x014e:
            r13.append(r12)
            goto L_0x0178
        L_0x0152:
            if (r12 == r5) goto L_0x0156
            r17 = 0
        L_0x0156:
            if (r12 == r5) goto L_0x0174
            switch(r12) {
                case 100: goto L_0x0172;
                case 101: goto L_0x016e;
                case 102: goto L_0x015c;
                default: goto L_0x015b;
            }
        L_0x015b:
            goto L_0x0178
        L_0x015c:
            if (r1 == 0) goto L_0x0178
            int r5 = r13.length()
            if (r5 != 0) goto L_0x0168
            r13.append(r15)
            goto L_0x0178
        L_0x0168:
            r5 = 29
            r13.append(r5)
            goto L_0x0178
        L_0x016e:
            r5 = 0
        L_0x016f:
            r14 = 101(0x65, float:1.42E-43)
            goto L_0x0179
        L_0x0172:
            r14 = r10
            goto L_0x0178
        L_0x0174:
            r5 = 0
            r16 = 1
            goto L_0x0179
        L_0x0178:
            r5 = 0
        L_0x0179:
            r11 = 101(0x65, float:1.42E-43)
            if (r18 == 0) goto L_0x0182
            if (r14 != r11) goto L_0x0181
            r14 = r10
            goto L_0x0182
        L_0x0181:
            r14 = r11
        L_0x0182:
            r18 = r5
            r5 = 2
            r15 = 6
            r23 = r12
            r12 = r8
            r8 = r21
            r21 = r19
            r19 = r23
            goto L_0x0058
        L_0x0191:
            int r1 = r8 - r12
            int r2 = r0.mo21960k(r8)
            int r3 = r26.mo21961l()
            int r5 = r2 - r12
            r8 = 2
            int r5 = r5 / r8
            int r5 = r5 + r2
            int r3 = java.lang.Math.min(r3, r5)
            r5 = 0
            boolean r0 = r0.mo21963n(r2, r3, r5)
            if (r0 == 0) goto L_0x0221
            r3 = r21
            int r20 = r20 * r3
            int r6 = r6 - r20
            int r6 = r6 % 103
            if (r6 != r3) goto L_0x021c
            int r0 = r13.length()
            if (r0 == 0) goto L_0x0217
            if (r0 <= 0) goto L_0x01ce
            if (r17 == 0) goto L_0x01ce
            r2 = 99
            if (r14 != r2) goto L_0x01c9
            int r2 = r0 + -2
            r13.delete(r2, r0)
            goto L_0x01ce
        L_0x01c9:
            int r2 = r0 + -1
            r13.delete(r2, r0)
        L_0x01ce:
            r0 = 1
            r2 = r4[r0]
            r0 = 0
            r3 = r4[r0]
            int r2 = r2 + r3
            float r0 = (float) r2
            r2 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r2
            float r3 = (float) r12
            float r1 = (float) r1
            float r1 = r1 / r2
            float r3 = r3 + r1
            int r1 = r7.size()
            byte[] r2 = new byte[r1]
            r5 = 0
        L_0x01e4:
            if (r5 >= r1) goto L_0x01f5
            java.lang.Object r4 = r7.get(r5)
            java.lang.Byte r4 = (java.lang.Byte) r4
            byte r4 = r4.byteValue()
            r2[r5] = r4
            int r5 = r5 + 1
            goto L_0x01e4
        L_0x01f5:
            com.google.zxing.m r1 = new com.google.zxing.m
            java.lang.String r4 = r13.toString()
            r5 = 2
            com.google.zxing.o[] r5 = new com.google.zxing.C5766o[r5]
            com.google.zxing.o r6 = new com.google.zxing.o
            r7 = r25
            float r7 = (float) r7
            r6.<init>(r0, r7)
            r0 = 0
            r5[r0] = r6
            com.google.zxing.o r0 = new com.google.zxing.o
            r0.<init>(r3, r7)
            r3 = 1
            r5[r3] = r0
            com.google.zxing.a r0 = com.google.zxing.C5751a.CODE_128
            r1.<init>(r4, r2, r5, r0)
            return r1
        L_0x0217:
            com.google.zxing.NotFoundException r0 = com.google.zxing.NotFoundException.m23155a()
            throw r0
        L_0x021c:
            com.google.zxing.ChecksumException r0 = com.google.zxing.ChecksumException.m23152a()
            throw r0
        L_0x0221:
            com.google.zxing.NotFoundException r0 = com.google.zxing.NotFoundException.m23155a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p663xb.C18660c.mo46487d(int, ob.a, java.util.Map):com.google.zxing.m");
    }
}
