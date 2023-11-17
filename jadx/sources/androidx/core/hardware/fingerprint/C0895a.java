package androidx.core.hardware.fingerprint;

import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.core.p016os.C0909f;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* renamed from: androidx.core.hardware.fingerprint.a */
public class C0895a {

    /* renamed from: a */
    private final Context f3519a;

    /* renamed from: androidx.core.hardware.fingerprint.a$a */
    class C0896a extends FingerprintManager.AuthenticationCallback {

        /* renamed from: a */
        final /* synthetic */ C0898c f3520a;

        C0896a(C0898c cVar) {
            this.f3520a = cVar;
        }

        public void onAuthenticationError(int i, CharSequence charSequence) {
            this.f3520a.mo2487a(i, charSequence);
        }

        public void onAuthenticationFailed() {
            this.f3520a.mo2488b();
        }

        public void onAuthenticationHelp(int i, CharSequence charSequence) {
            this.f3520a.mo2489c(i, charSequence);
        }

        public void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult authenticationResult) {
            this.f3520a.mo2490d(new C0899d(C0895a.m3305f(C0897b.m3312b(authenticationResult))));
        }
    }

    /* renamed from: androidx.core.hardware.fingerprint.a$b */
    static class C0897b {
        /* renamed from: a */
        static void m3311a(Object obj, Object obj2, CancellationSignal cancellationSignal, int i, Object obj3, Handler handler) {
            ((FingerprintManager) obj).authenticate((FingerprintManager.CryptoObject) obj2, cancellationSignal, i, (FingerprintManager.AuthenticationCallback) obj3, handler);
        }

        /* renamed from: b */
        static FingerprintManager.CryptoObject m3312b(Object obj) {
            return ((FingerprintManager.AuthenticationResult) obj).getCryptoObject();
        }

        /* renamed from: c */
        public static FingerprintManager m3313c(Context context) {
            int i = Build.VERSION.SDK_INT;
            Class cls = FingerprintManager.class;
            if (i == 23) {
                return (FingerprintManager) context.getSystemService(cls);
            }
            if (i <= 23 || !context.getPackageManager().hasSystemFeature("android.hardware.fingerprint")) {
                return null;
            }
            return (FingerprintManager) context.getSystemService(cls);
        }

        /* renamed from: d */
        static boolean m3314d(Object obj) {
            return ((FingerprintManager) obj).hasEnrolledFingerprints();
        }

        /* renamed from: e */
        static boolean m3315e(Object obj) {
            return ((FingerprintManager) obj).isHardwareDetected();
        }

        /* renamed from: f */
        public static C0900e m3316f(Object obj) {
            FingerprintManager.CryptoObject cryptoObject = (FingerprintManager.CryptoObject) obj;
            if (cryptoObject == null) {
                return null;
            }
            if (cryptoObject.getCipher() != null) {
                return new C0900e(cryptoObject.getCipher());
            }
            if (cryptoObject.getSignature() != null) {
                return new C0900e(cryptoObject.getSignature());
            }
            if (cryptoObject.getMac() != null) {
                return new C0900e(cryptoObject.getMac());
            }
            return null;
        }

        /* renamed from: g */
        public static FingerprintManager.CryptoObject m3317g(C0900e eVar) {
            if (eVar == null) {
                return null;
            }
            if (eVar.mo3356a() != null) {
                return new FingerprintManager.CryptoObject(eVar.mo3356a());
            }
            if (eVar.mo3358c() != null) {
                return new FingerprintManager.CryptoObject(eVar.mo3358c());
            }
            if (eVar.mo3357b() != null) {
                return new FingerprintManager.CryptoObject(eVar.mo3357b());
            }
            return null;
        }
    }

    /* renamed from: androidx.core.hardware.fingerprint.a$c */
    public static abstract class C0898c {
        /* renamed from: a */
        public abstract void mo2487a(int i, CharSequence charSequence);

        /* renamed from: b */
        public abstract void mo2488b();

        /* renamed from: c */
        public abstract void mo2489c(int i, CharSequence charSequence);

        /* renamed from: d */
        public abstract void mo2490d(C0899d dVar);
    }

    /* renamed from: androidx.core.hardware.fingerprint.a$d */
    public static final class C0899d {

        /* renamed from: a */
        private final C0900e f3521a;

        public C0899d(C0900e eVar) {
            this.f3521a = eVar;
        }

        /* renamed from: a */
        public C0900e mo3355a() {
            return this.f3521a;
        }
    }

    private C0895a(Context context) {
        this.f3519a = context;
    }

    /* renamed from: b */
    public static C0895a m3303b(Context context) {
        return new C0895a(context);
    }

    /* renamed from: c */
    private static FingerprintManager m3304c(Context context) {
        return C0897b.m3313c(context);
    }

    /* renamed from: f */
    static C0900e m3305f(FingerprintManager.CryptoObject cryptoObject) {
        return C0897b.m3316f(cryptoObject);
    }

    /* renamed from: g */
    private static FingerprintManager.AuthenticationCallback m3306g(C0898c cVar) {
        return new C0896a(cVar);
    }

    /* renamed from: h */
    private static FingerprintManager.CryptoObject m3307h(C0900e eVar) {
        return C0897b.m3317g(eVar);
    }

    /* renamed from: a */
    public void mo3348a(C0900e eVar, int i, C0909f fVar, C0898c cVar, Handler handler) {
        CancellationSignal cancellationSignal;
        FingerprintManager c = m3304c(this.f3519a);
        if (c != null) {
            if (fVar != null) {
                cancellationSignal = (CancellationSignal) fVar.mo3360b();
            } else {
                cancellationSignal = null;
            }
            C0897b.m3311a(c, m3307h(eVar), cancellationSignal, i, m3306g(cVar), handler);
        }
    }

    /* renamed from: d */
    public boolean mo3349d() {
        FingerprintManager c = m3304c(this.f3519a);
        if (c == null || !C0897b.m3314d(c)) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public boolean mo3350e() {
        FingerprintManager c = m3304c(this.f3519a);
        if (c == null || !C0897b.m3315e(c)) {
            return false;
        }
        return true;
    }

    /* renamed from: androidx.core.hardware.fingerprint.a$e */
    public static class C0900e {

        /* renamed from: a */
        private final Signature f3522a;

        /* renamed from: b */
        private final Cipher f3523b;

        /* renamed from: c */
        private final Mac f3524c;

        public C0900e(Signature signature) {
            this.f3522a = signature;
            this.f3523b = null;
            this.f3524c = null;
        }

        /* renamed from: a */
        public Cipher mo3356a() {
            return this.f3523b;
        }

        /* renamed from: b */
        public Mac mo3357b() {
            return this.f3524c;
        }

        /* renamed from: c */
        public Signature mo3358c() {
            return this.f3522a;
        }

        public C0900e(Cipher cipher) {
            this.f3523b = cipher;
            this.f3522a = null;
            this.f3524c = null;
        }

        public C0900e(Mac mac) {
            this.f3524c = mac;
            this.f3523b = null;
            this.f3522a = null;
        }
    }
}
