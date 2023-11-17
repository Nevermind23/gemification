package androidx.biometric;

import android.hardware.biometrics.BiometricPrompt;
import javax.crypto.Cipher;

/* renamed from: androidx.biometric.d */
public abstract /* synthetic */ class C0545d {
    /* renamed from: a */
    public static /* synthetic */ BiometricPrompt.CryptoObject m2159a(Cipher cipher) {
        return new BiometricPrompt.CryptoObject(cipher);
    }
}
