package com.facetec.sdk;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facetec.sdk.gn */
public final class C3172gn implements C3175gq {

    /* renamed from: a */
    private static final Map<String, Integer> f10464a;

    /* renamed from: b */
    public static final int f10465b = 0;

    /* renamed from: c */
    private static byte[] f10466c;

    static {
        m12975e();
        HashMap hashMap = new HashMap();
        byte[] bArr = f10466c;
        byte b = (byte) bArr[18];
        Object[] objArr = new Object[1];
        m12974d(b, (byte) (b + 4), (byte) bArr[45], objArr);
        hashMap.put((String) objArr[0], 1);
        int i = f10465b;
        byte[] bArr2 = f10466c;
        Object[] objArr2 = new Object[1];
        m12974d((byte) (i >>> 1), (byte) bArr2[70], (byte) bArr2[18], objArr2);
        hashMap.put((String) objArr2[0], 9);
        byte[] bArr3 = f10466c;
        byte b2 = (byte) (-bArr3[50]);
        Object[] objArr3 = new Object[1];
        m12974d(b2, (byte) (b2 & 116), (byte) (-bArr3[97]), objArr3);
        hashMap.put((String) objArr3[0], 5);
        byte[] bArr4 = f10466c;
        Object[] objArr4 = new Object[1];
        m12974d((byte) bArr4[12], (byte) bArr4[70], (byte) (i | 22), objArr4);
        hashMap.put((String) objArr4[0], 0);
        byte b3 = (byte) (-f10466c[127]);
        byte b4 = (byte) (b3 - 1);
        Object[] objArr5 = new Object[1];
        m12974d(b3, b4, (byte) (b4 | 40), objArr5);
        hashMap.put((String) objArr5[0], 2);
        byte[] bArr5 = f10466c;
        Object[] objArr6 = new Object[1];
        m12974d((byte) bArr5[12], (byte) bArr5[70], 74, objArr6);
        hashMap.put((String) objArr6[0], 8);
        Object[] objArr7 = new Object[1];
        m12974d((byte) f10466c[13], (byte) (i >>> 1), 76, objArr7);
        hashMap.put((String) objArr7[0], 7);
        byte[] bArr6 = f10466c;
        Object[] objArr8 = new Object[1];
        m12974d((byte) bArr6[13], (byte) (-bArr6[59]), 87, objArr8);
        hashMap.put((String) objArr8[0], 11);
        byte[] bArr7 = f10466c;
        Object[] objArr9 = new Object[1];
        m12974d((byte) bArr7[57], (byte) bArr7[13], (byte) (i | 66), objArr9);
        hashMap.put((String) objArr9[0], 10);
        byte[] bArr8 = f10466c;
        Object[] objArr10 = new Object[1];
        m12974d((byte) (-bArr8[127]), (byte) (-bArr8[59]), (byte) (i | 69), objArr10);
        hashMap.put((String) objArr10[0], 4);
        byte[] bArr9 = f10466c;
        Object[] objArr11 = new Object[1];
        m12974d((byte) bArr9[17], (byte) bArr9[125], (byte) (i | 87), objArr11);
        hashMap.put((String) objArr11[0], 3);
        byte[] bArr10 = f10466c;
        byte b5 = (byte) bArr10[17];
        Object[] objArr12 = new Object[1];
        m12974d((byte) bArr10[57], b5, (byte) (b5 | 120), objArr12);
        hashMap.put((String) objArr12[0], 6);
        f10464a = hashMap;
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m12974d(short r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = 116 - r7
            byte[] r0 = f10466c
            int r8 = r8 + 4
            int r6 = r6 + 2
            byte[] r1 = new byte[r6]
            int r6 = r6 + -1
            r2 = 0
            if (r0 != 0) goto L_0x0015
            r3 = r1
            r4 = r2
            r1 = r0
            r0 = r9
            r9 = r8
            goto L_0x002f
        L_0x0015:
            r3 = r2
        L_0x0016:
            int r8 = r8 + 1
            byte r4 = (byte) r7
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L_0x0027
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L_0x0027:
            byte r3 = r0[r8]
            r5 = r9
            r9 = r8
            r8 = r3
            r3 = r1
            r1 = r0
            r0 = r5
        L_0x002f:
            int r7 = r7 - r8
            int r7 = r7 + -5
            r8 = r9
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C3172gn.m12974d(short, int, short, java.lang.Object[]):void");
    }

    /* renamed from: e */
    static void m12975e() {
        f10466c = new byte[]{20, 33, -53, -26, -10, 3, -11, -12, -6, -9, -6, 6, 1, 10, -42, 4, 6, 0, 12, -21, -3, -18, 37, -42, 3, -11, -12, -6, -9, -6, 6, 1, 21, -32, -10, 3, -11, -12, -6, -9, -6, 6, 1, 9, -32, -1, -8, 9, -8, 13, -24, -20, -3, -12, 49, -49, -11, 2, -11, -15, 1, -10, 3, -11, -12, -6, -9, -6, 6, 1, 11, -23, -19, -5, 5, -11, -4, 32, -32, -15, -1, -10, 3, -11, -12, -6, -9, -6, 6, 1, 21, -32, -18, -5, -2, -8, 32, -29, -19, -5, 13, -11, -3, -14, -1, -4, -14, -9, -2, -2, -5, -6, 3, -14, -11, 28, -23, -19, -5, 5, -11, -4, 32, -32, -18, 14, -11, -17};
        f10465b = 32;
    }

    /* renamed from: a */
    public final int mo9362a(C3143fx fxVar) {
        Integer num = f10464a.get(fxVar.mo9295i());
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    /* renamed from: e */
    public final int mo9363e(C3143fx fxVar) {
        Integer num = f10464a.get(fxVar.mo9293g());
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }
}
