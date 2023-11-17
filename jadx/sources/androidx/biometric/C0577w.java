package androidx.biometric;

import android.content.Context;
import android.hardware.biometrics.BiometricManager;
import android.os.Build;
import androidx.core.hardware.fingerprint.C0895a;

/* renamed from: androidx.biometric.w */
public class C0577w {

    /* renamed from: a */
    private final C0895a f2375a;

    /* renamed from: b */
    private final BiometricManager f2376b;

    /* renamed from: androidx.biometric.w$a */
    private static class C0578a {
        /* renamed from: a */
        static int m2202a(BiometricManager biometricManager) {
            return biometricManager.canAuthenticate();
        }

        /* renamed from: b */
        static BiometricManager m2203b(Context context) {
            return C0575u.m2198a(context.getSystemService(BiometricManager.class));
        }
    }

    private C0577w(Context context) {
        if (Build.VERSION.SDK_INT >= 29) {
            this.f2376b = C0578a.m2203b(context);
            this.f2375a = null;
            return;
        }
        this.f2376b = null;
        this.f2375a = C0895a.m3303b(context);
    }

    /* renamed from: b */
    public static C0577w m2200b(Context context) {
        return new C0577w(context);
    }

    /* renamed from: a */
    public int mo2453a() {
        if (Build.VERSION.SDK_INT >= 29) {
            return C0578a.m2202a(this.f2376b);
        }
        if (!this.f2375a.mo3350e()) {
            return 12;
        }
        if (!this.f2375a.mo3349d()) {
            return 11;
        }
        return 0;
    }
}
