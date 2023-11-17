package com.facetec.sdk;

import java.nio.charset.Charset;

/* renamed from: com.facetec.sdk.nb */
public final class C3460nb {

    /* renamed from: a */
    public static final Charset f11312a = Charset.forName("UTF-8");

    /* renamed from: b */
    public static short m13837b(short s) {
        short s2 = s & 65535;
        return (short) (((s2 & 255) << 8) | ((s2 >>> 8) & C11051p3.f31759c));
    }

    /* renamed from: c */
    public static void m13838c(Throwable th) {
        throw th;
    }

    /* renamed from: d */
    public static int m13839d(int i) {
        return ((i & C11051p3.f31759c) << 24) | ((-16777216 & i) >>> 24) | ((16711680 & i) >>> 8) | ((65280 & i) << 8);
    }

    /* renamed from: e */
    public static void m13841e(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException(String.format("size=%s offset=%s byteCount=%s", new Object[]{Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3)}));
        }
    }

    /* renamed from: d */
    public static boolean m13840d(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            if (bArr[i4 + i] != bArr2[i4 + i2]) {
                return false;
            }
        }
        return true;
    }
}
