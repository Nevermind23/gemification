package org.bouncycastle.util.encoders;

import gg1.C41123a;
import gg1.C41124b;
import java.io.ByteArrayOutputStream;

/* renamed from: org.bouncycastle.util.encoders.a */
public abstract class C41955a {

    /* renamed from: a */
    private static final C41124b f98743a = new C41123a();

    /* renamed from: a */
    public static byte[] m121932a(byte[] bArr) {
        return m121933b(bArr, 0, bArr.length);
    }

    /* renamed from: b */
    public static byte[] m121933b(byte[] bArr, int i, int i2) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(((i2 + 2) / 3) * 4);
        try {
            f98743a.mo95553a(bArr, i, i2, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            throw new EncoderException("exception encoding base64 string: " + e.getMessage(), e);
        }
    }
}
