package p613te;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.regex.Pattern;
import p613te.C17952j;

/* renamed from: te.i */
public abstract class C17951i {

    /* renamed from: a */
    private static final String f51120a = C17952j.m61850c(C17951i.class);

    /* renamed from: b */
    private static final char[] f51121b = C17931a.m61768c("\u0015\u0015\u0015\u0015\u0015\u0015\u0015\u0015\u0015\u0015<<<<<<", 154, 2).toCharArray();

    /* renamed from: c */
    private static final MessageDigest f51122c;

    /* renamed from: d */
    private static final Pattern f51123d;

    /* renamed from: e */
    public static int f51124e = m61847e();

    /* renamed from: f */
    public static int f51125f = m61847e();

    /* renamed from: g */
    public static int f51126g = 1;

    /* renamed from: h */
    public static int f51127h = 2;

    static {
        MessageDigest messageDigest;
        String c = C17931a.m61768c("\u0011\u000f\u0016b\u001dxejhu\u001b:ut?f", '2', 0);
        int i = f51124e;
        if ((i * (f51126g + i)) % m61846d() != 0) {
        }
        f51123d = Pattern.compile(c);
        try {
            messageDigest = MessageDigest.getInstance(C17931a.m61768c("@4,\u0017\u001b\u001d\u001d", 200, 5));
        } catch (NoSuchAlgorithmException e) {
            C17952j.C17953a.m61859d(f51120a, C17931a.m61768c("\u0019\r\u0005tvv_#'$!..X\u001e\u0018\u001f!\u0019\u0017", ':', 2), e);
            messageDigest = null;
        }
        f51122c = messageDigest;
    }

    /* renamed from: a */
    public static boolean m61843a(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        int i = f51124e;
        if (((f51126g + i) * i) % f51127h != f51125f) {
            f51124e = m61847e();
            f51125f = m61847e();
        }
        return true;
    }

    /* renamed from: b */
    public static String m61844b(byte[] bArr) {
        char[] cArr = new char[(bArr.length * 2)];
        int i = 0;
        while (true) {
            int i2 = f51124e;
            if (((f51126g + i2) * i2) % f51127h != f51125f) {
                f51124e = m61847e();
                f51125f = m61847e();
            }
            if (i >= bArr.length) {
                return new String(cArr);
            }
            byte b = bArr[i] & 255;
            int i3 = i * 2;
            char[] cArr2 = f51121b;
            cArr[i3] = cArr2[b >>> 4];
            cArr[i3 + 1] = cArr2[b & 15];
            i++;
        }
    }

    /* renamed from: c */
    public static byte[] m61845c(byte[] bArr) {
        MessageDigest messageDigest;
        byte[] digest;
        if (bArr == null || bArr.length == 0 || (messageDigest = f51122c) == null) {
            return null;
        }
        synchronized (messageDigest) {
            messageDigest.update(bArr);
            digest = messageDigest.digest();
            messageDigest.reset();
        }
        return digest;
    }

    /* renamed from: d */
    public static int m61846d() {
        return 2;
    }

    /* renamed from: e */
    public static int m61847e() {
        return 98;
    }
}
