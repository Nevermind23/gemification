package com.facetec.sdk;

/* renamed from: com.facetec.sdk.gc */
public final class C3161gc {
    /* renamed from: a */
    private static void m12968a(int[] iArr) {
        for (int i = 0; i < iArr.length / 2; i++) {
            int i2 = iArr[i];
            iArr[i] = iArr[(iArr.length - i) - 1];
            iArr[(iArr.length - i) - 1] = i2;
        }
    }

    /* renamed from: b */
    private static int m12969b(int i, int[][] iArr) {
        return ((iArr[0][i >>> 24] + iArr[1][(i >>> 16) & C11051p3.f31759c]) ^ iArr[2][(i >>> 8) & C11051p3.f31759c]) + iArr[3][i & C11051p3.f31759c];
    }

    /* renamed from: c */
    public static void m12970c(int i, int i2, boolean z, int i3, int[] iArr, int[][] iArr2, int[] iArr3) {
        if (!z) {
            m12968a(iArr);
        }
        int i4 = 0;
        while (i4 < i3) {
            int i5 = i ^ iArr[i4];
            i4++;
            int b = i2 ^ m12969b(i5, iArr2);
            i2 = i5;
            i = b;
        }
        int i6 = i ^ iArr[iArr.length - 2];
        int i7 = i2 ^ iArr[iArr.length - 1];
        if (!z) {
            m12968a(iArr);
        }
        iArr3[0] = i7;
        iArr3[1] = i6;
    }
}
