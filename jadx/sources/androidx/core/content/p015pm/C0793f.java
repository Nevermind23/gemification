package androidx.core.content.p015pm;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;

/* renamed from: androidx.core.content.pm.f */
public abstract class C0793f {

    /* renamed from: androidx.core.content.pm.f$a */
    private static class C0794a {
        /* renamed from: a */
        static Signature[] m2950a(SigningInfo signingInfo) {
            return signingInfo.getApkContentsSigners();
        }

        /* renamed from: b */
        static long m2951b(PackageInfo packageInfo) {
            return packageInfo.getLongVersionCode();
        }

        /* renamed from: c */
        static Signature[] m2952c(SigningInfo signingInfo) {
            return signingInfo.getSigningCertificateHistory();
        }

        /* renamed from: d */
        static boolean m2953d(SigningInfo signingInfo) {
            return signingInfo.hasMultipleSigners();
        }

        /* renamed from: e */
        static boolean m2954e(PackageManager packageManager, String str, byte[] bArr, int i) {
            return packageManager.hasSigningCertificate(str, bArr, i);
        }
    }

    /* renamed from: a */
    public static long m2949a(PackageInfo packageInfo) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C0794a.m2951b(packageInfo);
        }
        return (long) packageInfo.versionCode;
    }
}
