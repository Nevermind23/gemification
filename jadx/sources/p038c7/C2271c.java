package p038c7;

import android.util.Base64;
import java.util.Random;

/* renamed from: c7.c */
public abstract class C2271c {

    /* renamed from: a */
    private static final Random f7078a = new Random();

    /* renamed from: a */
    public static String m8732a() {
        byte[] bArr = new byte[16];
        f7078a.nextBytes(bArr);
        return Base64.encodeToString(bArr, 11);
    }
}
