package androidx.biometric;

import android.hardware.biometrics.BiometricPrompt;
import javax.crypto.Mac;

/* renamed from: androidx.biometric.f */
public abstract /* synthetic */ class C0549f {
    /* renamed from: a */
    public static /* synthetic */ BiometricPrompt.CryptoObject m2161a(Mac mac) {
        return new BiometricPrompt.CryptoObject(mac);
    }
}
