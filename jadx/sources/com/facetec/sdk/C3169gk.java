package com.facetec.sdk;

/* renamed from: com.facetec.sdk.gk */
public final class C3169gk {

    /* renamed from: a */
    public int f10460a;

    /* renamed from: b */
    public int f10461b;

    /* renamed from: b */
    public static char[] m12973b(long j, char[] cArr, int i) {
        int length = cArr.length;
        char[] cArr2 = new char[length];
        int i2 = 0;
        int i3 = 4;
        for (int i4 = 0; i4 < cArr.length; i4++) {
            if (((j >>> i4) & 1) == ((long) i) && i2 < 4) {
                cArr2[i2] = cArr[i4];
            } else if (i3 < length) {
                cArr2[i3] = cArr[i4];
                i3++;
            } else {
                cArr2[i2] = cArr[i4];
            }
            i2++;
        }
        return cArr2;
    }
}
