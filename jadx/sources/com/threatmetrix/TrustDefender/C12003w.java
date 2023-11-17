package com.threatmetrix.TrustDefender;

import android.util.Base64;
import com.threatmetrix.TrustDefender.C11907h;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.UUID;
import java.util.zip.CRC32;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.threatmetrix.TrustDefender.w */
public abstract class C12003w {

    /* renamed from: a */
    private static final String f35342a = C11907h.m43615j(C12003w.class);

    /* renamed from: a */
    public static String m44097a(String str, String str2, String str3) {
        if (!C11921k0.m43739v(str) && !C11921k0.m43739v(str2) && !C11921k0.m43739v(str3)) {
            try {
                byte[] w = C11921k0.m43740w((str3 + str2).getBytes(StandardCharsets.UTF_8));
                if (w == null) {
                    return null;
                }
                byte[] bytes = str3.getBytes(StandardCharsets.UTF_8);
                byte[] b = m44098b(str.getBytes(StandardCharsets.UTF_8), Arrays.copyOfRange(w, 0, 16), Arrays.copyOfRange(w, 16, w.length));
                if (b == null) {
                    C11907h.C11908a.m43623a(f35342a, "Failure: failed to encrypt the payload");
                    return null;
                }
                byte[] encode = Base64.encode(m44104h(b, bytes), 2);
                if (encode != null) {
                    return new String(encode, StandardCharsets.UTF_8);
                }
                C11907h.C11908a.m43623a(f35342a, "Failure: Base64 failed");
                return null;
            } catch (IllegalArgumentException e) {
                C11907h.C11908a.m43629g(f35342a, "Obfuscation Error", e);
            }
        }
        return null;
    }

    /* renamed from: b */
    public static byte[] m44098b(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (!(bArr == null || bArr2 == null || bArr3 == null)) {
            try {
                SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, "AES");
                Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
                instance.init(1, secretKeySpec, new IvParameterSpec(bArr3));
                return instance.doFinal(bArr);
            } catch (IllegalArgumentException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e) {
                C11907h.C11908a.m43629g(f35342a, "Obfuscation Error", e);
            }
        }
        return null;
    }

    /* renamed from: c */
    public static String m44099c(byte[] bArr, String str, String str2) {
        if (bArr != null && !C11921k0.m43739v(str) && !C11921k0.m43739v(str2)) {
            try {
                byte[] decode = Base64.decode(bArr, 0);
                if (decode != null) {
                    if (decode.length >= 32) {
                        ByteBuffer allocate = ByteBuffer.allocate(decode.length - 16);
                        ByteBuffer allocate2 = ByteBuffer.allocate(16);
                        if (m44105i(decode, 16, allocate, allocate2) && allocate.hasArray()) {
                            if (allocate2.hasArray()) {
                                byte[] d = m44100d(allocate.array(), m44106j(allocate2.array(), str, str2));
                                if (d == null) {
                                    C11907h.C11908a.m43623a(f35342a, "failed to decrypt the conf response");
                                    return null;
                                }
                                String str3 = new String(d, StandardCharsets.UTF_8);
                                String str4 = f35342a;
                                C11907h.C11908a.m43624b(str4, "conf response " + str3);
                                return str3;
                            }
                        }
                        C11907h.C11908a.m43623a(f35342a, "Failure: failed to deinterlace nonce from input");
                    }
                }
                return null;
            } catch (IOException | IllegalArgumentException e) {
                C11907h.C11908a.m43629g(f35342a, "Deobfuscate Error", e);
            }
        }
        return null;
    }

    /* renamed from: d */
    public static byte[] m44100d(byte[] bArr, byte[] bArr2) {
        return m44103g(bArr, bArr2, new byte[16]);
    }

    /* renamed from: e */
    public static int m44101e(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr2 == null) {
            throw new IllegalArgumentException("Illegal argument for CRC32 key");
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(bArr);
        byteArrayOutputStream.write(bArr2);
        CRC32 crc32 = new CRC32();
        crc32.update(byteArrayOutputStream.toByteArray());
        return (int) crc32.getValue();
    }

    /* renamed from: f */
    public static String m44102f(String str, String str2) {
        return m44097a(str, str2, UUID.randomUUID().toString());
    }

    /* renamed from: g */
    public static byte[] m44103g(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (!(bArr == null || bArr2 == null || bArr3 == null)) {
            try {
                SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, "AES");
                Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
                instance.init(2, secretKeySpec, new IvParameterSpec(bArr3));
                return instance.doFinal(bArr);
            } catch (IllegalArgumentException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e) {
                C11907h.m43619n(f35342a, "decrypt error: ", e);
            }
        }
        return null;
    }

    /* renamed from: h */
    public static byte[] m44104h(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int length2 = bArr2.length;
        boolean z = length >= length2;
        int i = z ? length2 * 2 : length * 2;
        int i2 = z ? length : length2;
        ByteBuffer allocate = ByteBuffer.allocate(length + length2);
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4 += 2) {
            allocate.put(bArr[i3]);
            allocate.put(bArr2[i3]);
            i3++;
        }
        while (i3 < i2) {
            allocate.put(z ? bArr[i3] : bArr2[i3]);
            i3++;
        }
        return allocate.array();
    }

    /* renamed from: i */
    public static boolean m44105i(byte[] bArr, int i, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        boolean z;
        int i2 = 0;
        if (bArr == null || bArr.length < i) {
            return false;
        }
        int i3 = i * 2;
        if (bArr.length < i3) {
            i3 = (bArr.length - i) * 2;
            z = true;
        } else {
            z = false;
        }
        while (i2 < i3) {
            byteBuffer.put(bArr[i2]);
            byteBuffer2.put(bArr[i2 + 1]);
            i2 += 2;
        }
        while (i2 < bArr.length) {
            if (z) {
                byteBuffer2.put(bArr[i2]);
            } else {
                byteBuffer.put(bArr[i2]);
            }
            i2++;
        }
        return true;
    }

    /* renamed from: j */
    public static byte[] m44106j(byte[] bArr, String str, String str2) {
        ByteBuffer allocate = ByteBuffer.allocate(16);
        allocate.putInt(m44101e(bArr, str2.getBytes(StandardCharsets.UTF_8)));
        allocate.putInt(m44101e(bArr, str.getBytes(StandardCharsets.UTF_8)));
        allocate.putInt(m44101e(str2.getBytes(StandardCharsets.UTF_8), bArr));
        allocate.putInt(m44101e(str.getBytes(StandardCharsets.UTF_8), bArr));
        return allocate.array();
    }
}
