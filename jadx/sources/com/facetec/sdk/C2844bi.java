package com.facetec.sdk;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.facetec.sdk.bi */
public final class C2844bi {

    /* renamed from: d */
    private static final char[] f9226d = "0123456789ABCDEF".toCharArray();

    C2844bi() {
    }

    /* renamed from: a */
    private static byte[] m11415a(byte[] bArr, byte[]... bArr2) {
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "HmacSHA256");
        Mac instance = Mac.getInstance("HmacSHA256");
        instance.init(secretKeySpec);
        return instance.doFinal(m11420d(bArr2));
    }

    /* renamed from: b */
    static byte[] m11417b(String str) {
        return m11418b(str.getBytes(StandardCharsets.UTF_8));
    }

    /* renamed from: d */
    static String m11419d(String str) {
        return m11421e(m11418b(str.getBytes(StandardCharsets.UTF_8)));
    }

    /* renamed from: e */
    public static byte[] m11422e(byte[] bArr, String str) {
        return m11415a(bArr, str.getBytes(StandardCharsets.UTF_8));
    }

    /* renamed from: b */
    static byte[] m11418b(byte[]... bArr) {
        return MessageDigest.getInstance("SHA-256").digest(m11420d(bArr));
    }

    /* renamed from: e */
    static String m11421e(byte[] bArr) {
        char[] cArr = new char[(bArr.length << 1)];
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i] & 255;
            int i2 = i << 1;
            char[] cArr2 = f9226d;
            cArr[i2] = cArr2[b >>> 4];
            cArr[i2 + 1] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    /* renamed from: d */
    private static byte[] m11420d(byte[]... bArr) {
        int i = 0;
        for (byte[] length : bArr) {
            i += length.length;
        }
        byte[] bArr2 = new byte[i];
        int i2 = 0;
        for (byte[] bArr3 : bArr) {
            System.arraycopy(bArr3, 0, bArr2, i2, bArr3.length);
            i2 += bArr3.length;
        }
        return bArr2;
    }

    /* renamed from: b */
    static String m11416b(byte[] bArr, String str) {
        return m11421e(m11415a(bArr, str.getBytes(StandardCharsets.UTF_8)));
    }
}
