package p260t6;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import p286v6.C8708e;

/* renamed from: t6.a */
public abstract class C8399a {
    /* renamed from: a */
    public static byte[] m31523a(Context context, String str) {
        MessageDigest b;
        PackageInfo e = C8708e.m32461a(context).mo24091e(str, 64);
        Signature[] signatureArr = e.signatures;
        if (signatureArr == null || signatureArr.length != 1 || (b = m31524b("SHA1")) == null) {
            return null;
        }
        return b.digest(e.signatures[0].toByteArray());
    }

    /* renamed from: b */
    public static MessageDigest m31524b(String str) {
        int i = 0;
        while (i < 2) {
            try {
                MessageDigest instance = MessageDigest.getInstance(str);
                if (instance != null) {
                    return instance;
                }
                i++;
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return null;
    }
}
