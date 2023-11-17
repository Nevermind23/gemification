package p200ob;

import com.google.zxing.C5752b;
import com.google.zxing.C5758h;

/* renamed from: ob.j */
public final class C7516j extends C7514h {

    /* renamed from: e */
    private C7508b f21928e;

    public C7516j(C5758h hVar) {
        super(hVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v20, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int[][] m28584i(byte[] r17, int r18, int r19, int r20, int r21) {
        /*
            r0 = r18
            r1 = r19
            r2 = 8
            int r3 = r21 + -8
            int r4 = r20 + -8
            r5 = 2
            int[] r6 = new int[r5]
            r7 = 1
            r6[r7] = r0
            r8 = 0
            r6[r8] = r1
            java.lang.Class r9 = java.lang.Integer.TYPE
            java.lang.Object r6 = java.lang.reflect.Array.newInstance(r9, r6)
            int[][] r6 = (int[][]) r6
            r9 = r8
        L_0x001c:
            if (r9 >= r1) goto L_0x00b1
            int r10 = r9 << 3
            if (r10 <= r3) goto L_0x0023
            r10 = r3
        L_0x0023:
            r11 = r8
        L_0x0024:
            if (r11 >= r0) goto L_0x00a8
            int r12 = r11 << 3
            if (r12 <= r4) goto L_0x002b
            r12 = r4
        L_0x002b:
            int r13 = r10 * r20
            int r13 = r13 + r12
            r12 = 255(0xff, float:3.57E-43)
            r14 = r8
            r15 = r14
            r16 = r15
            r8 = r12
        L_0x0035:
            if (r14 >= r2) goto L_0x0073
            r7 = r16
            r5 = 0
        L_0x003a:
            if (r5 >= r2) goto L_0x004d
            int r16 = r13 + r5
            byte r2 = r17[r16]
            r2 = r2 & r12
            int r15 = r15 + r2
            if (r2 >= r8) goto L_0x0045
            r8 = r2
        L_0x0045:
            if (r2 <= r7) goto L_0x0048
            r7 = r2
        L_0x0048:
            int r5 = r5 + 1
            r2 = 8
            goto L_0x003a
        L_0x004d:
            int r2 = r7 - r8
            r5 = 24
            if (r2 <= r5) goto L_0x0069
        L_0x0053:
            int r14 = r14 + 1
            int r13 = r13 + r20
            r2 = 8
            if (r14 >= r2) goto L_0x0069
            r5 = 0
        L_0x005c:
            if (r5 >= r2) goto L_0x0053
            int r16 = r13 + r5
            byte r2 = r17[r16]
            r2 = r2 & r12
            int r15 = r15 + r2
            int r5 = r5 + 1
            r2 = 8
            goto L_0x005c
        L_0x0069:
            r2 = 1
            int r14 = r14 + r2
            int r13 = r13 + r20
            r16 = r7
            r7 = r2
            r2 = 8
            goto L_0x0035
        L_0x0073:
            r2 = r7
            int r5 = r15 >> 6
            int r7 = r16 - r8
            r12 = 24
            if (r7 > r12) goto L_0x009a
            int r5 = r8 / 2
            if (r9 <= 0) goto L_0x009a
            if (r11 <= 0) goto L_0x009a
            int r7 = r9 + -1
            r7 = r6[r7]
            r12 = r7[r11]
            r13 = r6[r9]
            int r14 = r11 + -1
            r13 = r13[r14]
            r15 = 2
            int r13 = r13 * r15
            int r12 = r12 + r13
            r7 = r7[r14]
            int r12 = r12 + r7
            int r7 = r12 / 4
            if (r8 >= r7) goto L_0x009b
            r5 = r7
            goto L_0x009b
        L_0x009a:
            r15 = 2
        L_0x009b:
            r7 = r6[r9]
            r7[r11] = r5
            int r11 = r11 + 1
            r7 = r2
            r5 = r15
            r2 = 8
            r8 = 0
            goto L_0x0024
        L_0x00a8:
            r15 = r5
            r2 = r7
            int r9 = r9 + 1
            r2 = 8
            r8 = 0
            goto L_0x001c
        L_0x00b1:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p200ob.C7516j.m28584i(byte[], int, int, int, int):int[][]");
    }

    /* renamed from: j */
    private static void m28585j(byte[] bArr, int i, int i2, int i3, int i4, int[][] iArr, C7508b bVar) {
        int i5;
        int i6;
        int i7 = i;
        int i8 = i2;
        int i9 = i4 - 8;
        int i12 = i3 - 8;
        for (int i13 = 0; i13 < i8; i13++) {
            int i14 = i13 << 3;
            if (i14 > i9) {
                i5 = i9;
            } else {
                i5 = i14;
            }
            int k = m28586k(i13, i8 - 3);
            for (int i15 = 0; i15 < i7; i15++) {
                int i16 = i15 << 3;
                if (i16 > i12) {
                    i6 = i12;
                } else {
                    i6 = i16;
                }
                int k2 = m28586k(i15, i7 - 3);
                int i17 = 0;
                for (int i18 = -2; i18 <= 2; i18++) {
                    int[] iArr2 = iArr[k + i18];
                    i17 += iArr2[k2 - 2] + iArr2[k2 - 1] + iArr2[k2] + iArr2[k2 + 1] + iArr2[2 + k2];
                }
                m28587l(bArr, i6, i5, i17 / 25, i3, bVar);
            }
        }
    }

    /* renamed from: k */
    private static int m28586k(int i, int i2) {
        if (i < 2) {
            return 2;
        }
        return Math.min(i, i2);
    }

    /* renamed from: l */
    private static void m28587l(byte[] bArr, int i, int i2, int i3, int i4, C7508b bVar) {
        int i5 = (i2 * i4) + i;
        int i6 = 0;
        while (i6 < 8) {
            for (int i7 = 0; i7 < 8; i7++) {
                if ((bArr[i5 + i7] & 255) <= i3) {
                    bVar.mo21984n(i + i7, i2 + i6);
                }
            }
            i6++;
            i5 += i4;
        }
    }

    /* renamed from: a */
    public C5752b mo18864a(C5758h hVar) {
        return new C7516j(hVar);
    }

    /* renamed from: b */
    public C7508b mo18865b() {
        C7508b bVar = this.f21928e;
        if (bVar != null) {
            return bVar;
        }
        C5758h e = mo18868e();
        int d = e.mo18884d();
        int a = e.mo18883a();
        if (d < 40 || a < 40) {
            this.f21928e = super.mo18865b();
        } else {
            byte[] b = e.mo18878b();
            int i = d >> 3;
            if ((d & 7) != 0) {
                i++;
            }
            int i2 = i;
            int i3 = a >> 3;
            if ((a & 7) != 0) {
                i3++;
            }
            int i4 = i3;
            int[][] i5 = m28584i(b, i2, i4, d, a);
            C7508b bVar2 = new C7508b(d, a);
            m28585j(b, i2, i4, d, a, i5, bVar2);
            this.f21928e = bVar2;
        }
        return this.f21928e;
    }
}
