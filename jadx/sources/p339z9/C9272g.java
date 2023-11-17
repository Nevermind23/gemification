package p339z9;

import android.util.Base64;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.UUID;

/* renamed from: z9.g */
public class C9272g {

    /* renamed from: a */
    private static final byte f25728a = Byte.parseByte("01110000", 2);

    /* renamed from: b */
    private static final byte f25729b = Byte.parseByte("00001111", 2);

    /* renamed from: b */
    private static String m34170b(byte[] bArr) {
        return new String(Base64.encode(bArr, 11), Charset.defaultCharset()).substring(0, 22);
    }

    /* renamed from: c */
    private static byte[] m34171c(UUID uuid, byte[] bArr) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.putLong(uuid.getMostSignificantBits());
        wrap.putLong(uuid.getLeastSignificantBits());
        return wrap.array();
    }

    /* renamed from: a */
    public String mo24914a() {
        byte[] c = m34171c(UUID.randomUUID(), new byte[17]);
        byte b = c[0];
        c[16] = b;
        c[0] = (byte) ((b & f25729b) | f25728a);
        return m34170b(c);
    }
}
