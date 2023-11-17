package p471jc;

/* renamed from: jc.d */
abstract class C15741d {
    /* renamed from: a */
    static int m56692a(C15738b bVar) {
        return m56693b(bVar, true) + m56693b(bVar, false);
    }

    /* renamed from: b */
    private static int m56693b(C15738b bVar, boolean z) {
        int i;
        int i2;
        byte b;
        if (z) {
            i = bVar.mo43121d();
        } else {
            i = bVar.mo43122e();
        }
        if (z) {
            i2 = bVar.mo43122e();
        } else {
            i2 = bVar.mo43121d();
        }
        byte[][] c = bVar.mo43120c();
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            byte b2 = -1;
            int i5 = 0;
            for (int i6 = 0; i6 < i2; i6++) {
                if (z) {
                    b = c[i4][i6];
                } else {
                    b = c[i6][i4];
                }
                if (b == b2) {
                    i5++;
                } else {
                    if (i5 >= 5) {
                        i3 += (i5 - 5) + 3;
                    }
                    i5 = 1;
                    b2 = b;
                }
            }
            if (i5 >= 5) {
                i3 += (i5 - 5) + 3;
            }
        }
        return i3;
    }

    /* renamed from: c */
    static int m56694c(C15738b bVar) {
        byte[][] c = bVar.mo43120c();
        int e = bVar.mo43122e();
        int d = bVar.mo43121d();
        int i = 0;
        for (int i2 = 0; i2 < d - 1; i2++) {
            byte[] bArr = c[i2];
            int i3 = 0;
            while (i3 < e - 1) {
                byte b = bArr[i3];
                int i4 = i3 + 1;
                if (b == bArr[i4]) {
                    byte[] bArr2 = c[i2 + 1];
                    if (b == bArr2[i3] && b == bArr2[i4]) {
                        i++;
                    }
                }
                i3 = i4;
            }
        }
        return i * 3;
    }

    /* renamed from: d */
    static int m56695d(C15738b bVar) {
        byte[][] c = bVar.mo43120c();
        int e = bVar.mo43122e();
        int d = bVar.mo43121d();
        int i = 0;
        for (int i2 = 0; i2 < d; i2++) {
            for (int i3 = 0; i3 < e; i3++) {
                byte[] bArr = c[i2];
                int i4 = i3 + 6;
                if (i4 < e && bArr[i3] == 1 && bArr[i3 + 1] == 0 && bArr[i3 + 2] == 1 && bArr[i3 + 3] == 1 && bArr[i3 + 4] == 1 && bArr[i3 + 5] == 0 && bArr[i4] == 1 && (m56698g(bArr, i3 - 4, i3) || m56698g(bArr, i3 + 7, i3 + 11))) {
                    i++;
                }
                int i5 = i2 + 6;
                if (i5 < d && c[i2][i3] == 1 && c[i2 + 1][i3] == 0 && c[i2 + 2][i3] == 1 && c[i2 + 3][i3] == 1 && c[i2 + 4][i3] == 1 && c[i2 + 5][i3] == 0 && c[i5][i3] == 1 && (m56699h(c, i3, i2 - 4, i2) || m56699h(c, i3, i2 + 7, i2 + 11))) {
                    i++;
                }
            }
        }
        return i * 40;
    }

    /* renamed from: e */
    static int m56696e(C15738b bVar) {
        byte[][] c = bVar.mo43120c();
        int e = bVar.mo43122e();
        int d = bVar.mo43121d();
        int i = 0;
        for (int i2 = 0; i2 < d; i2++) {
            byte[] bArr = c[i2];
            for (int i3 = 0; i3 < e; i3++) {
                if (bArr[i3] == 1) {
                    i++;
                }
            }
        }
        int d2 = bVar.mo43121d() * bVar.mo43122e();
        return ((Math.abs((i << 1) - d2) * 10) / d2) * 10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0038, code lost:
        r3 = r3 + r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0039, code lost:
        r1 = r3 & 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003b, code lost:
        if (r1 != 0) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003d, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003e, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0023, code lost:
        r1 = r1 & 1;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static boolean m56697f(int r1, int r2, int r3) {
        /*
            r0 = 1
            switch(r1) {
                case 0: goto L_0x0038;
                case 1: goto L_0x0039;
                case 2: goto L_0x0035;
                case 3: goto L_0x0031;
                case 4: goto L_0x002c;
                case 5: goto L_0x0025;
                case 6: goto L_0x001d;
                case 7: goto L_0x0014;
                default: goto L_0x0004;
            }
        L_0x0004:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Invalid mask pattern: "
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r1 = r3.concat(r1)
            r2.<init>(r1)
            throw r2
        L_0x0014:
            int r1 = r3 * r2
            int r1 = r1 % 3
            int r3 = r3 + r2
            r2 = r3 & 1
            int r1 = r1 + r2
            goto L_0x0023
        L_0x001d:
            int r3 = r3 * r2
            r1 = r3 & 1
            int r3 = r3 % 3
            int r1 = r1 + r3
        L_0x0023:
            r1 = r1 & r0
            goto L_0x003b
        L_0x0025:
            int r3 = r3 * r2
            r1 = r3 & 1
            int r3 = r3 % 3
            int r1 = r1 + r3
            goto L_0x003b
        L_0x002c:
            int r3 = r3 / 2
            int r2 = r2 / 3
            goto L_0x0038
        L_0x0031:
            int r3 = r3 + r2
            int r1 = r3 % 3
            goto L_0x003b
        L_0x0035:
            int r1 = r2 % 3
            goto L_0x003b
        L_0x0038:
            int r3 = r3 + r2
        L_0x0039:
            r1 = r3 & 1
        L_0x003b:
            if (r1 != 0) goto L_0x003e
            return r0
        L_0x003e:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p471jc.C15741d.m56697f(int, int, int):boolean");
    }

    /* renamed from: g */
    private static boolean m56698g(byte[] bArr, int i, int i2) {
        int min = Math.min(i2, bArr.length);
        for (int max = Math.max(i, 0); max < min; max++) {
            if (bArr[max] == 1) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: h */
    private static boolean m56699h(byte[][] bArr, int i, int i2, int i3) {
        int min = Math.min(i3, bArr.length);
        for (int max = Math.max(i2, 0); max < min; max++) {
            if (bArr[max][i] == 1) {
                return false;
            }
        }
        return true;
    }
}
