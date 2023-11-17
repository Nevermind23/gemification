package androidx.biometric;

import android.hardware.biometrics.BiometricPrompt;
import java.security.Signature;

/* renamed from: androidx.biometric.e */
public abstract /* synthetic */ class C0547e {
    /* renamed from: a */
    public static /* synthetic */ BiometricPrompt.CryptoObject m2160a(Signature signature) {
        return new BiometricPrompt.CryptoObject(signature);
    }
}
