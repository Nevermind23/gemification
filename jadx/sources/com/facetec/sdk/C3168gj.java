package com.facetec.sdk;

/* renamed from: com.facetec.sdk.gj */
public final class C3168gj {

    /* renamed from: a */
    public int f10457a;

    /* renamed from: d */
    public int f10458d;

    /* renamed from: e */
    public int f10459e;

    /* renamed from: b */
    public static void m12972b(int[] iArr) {
        for (int i = 0; i < iArr.length / 2; i++) {
            int i2 = iArr[i];
            iArr[i] = iArr[(iArr.length - i) - 1];
            iArr[(iArr.length - i) - 1] = i2;
        }
    }

    /* renamed from: b */
    public static int m12971b(int i) {
        C3146fz fzVar = C3146fz.f10395c;
        int i2 = (i >>> 24) & C11051p3.f31759c;
        int i3 = (i >>> 16) & C11051p3.f31759c;
        int i4 = (i >>> 8) & C11051p3.f31759c;
        int i5 = i & C11051p3.f31759c;
        int[][] iArr = fzVar.f10398e;
        return ((iArr[0][i2] + iArr[1][i3]) ^ iArr[2][i4]) + iArr[3][i5];
    }
}
