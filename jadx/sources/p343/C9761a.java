package p343;

import android.security.keystore.KeyGenParameterSpec;
import android.security.keystore.KeyPermanentlyInvalidatedException;
import com.salesforce.marketingcloud.C11398b;
import java.security.Key;
import java.security.KeyStore;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import kotlin.jvm.internal.C41536l;

/* renamed from: a */
public final class C9761a {

    /* renamed from: a */
    public static final C9761a f26541a = new C9761a();

    /* renamed from: b */
    private static final int f26542b = C11398b.f33139r;

    /* renamed from: c */
    private static final String f26543c = "AndroidKeyStore";

    /* renamed from: d */
    private static final String f26544d = "keyName";

    /* renamed from: e */
    private static final String f26545e = "GCM";

    /* renamed from: f */
    private static final String f26546f = "NoPadding";

    /* renamed from: g */
    private static final String f26547g = "AES";

    private C9761a() {
    }

    /* renamed from: a */
    private final Cipher m35906a() {
        Cipher instance = Cipher.getInstance(f26547g + '/' + f26545e + '/' + f26546f);
        C41536l.m120488h(instance, "getInstance(transformation)");
        return instance;
    }

    /* renamed from: c */
    private final SecretKey m35907c() {
        String str = f26543c;
        KeyStore instance = KeyStore.getInstance(str);
        instance.load((KeyStore.LoadStoreParameter) null);
        String str2 = f26544d;
        Key key = instance.getKey(str2, (char[]) null);
        if (key != null) {
            return (SecretKey) key;
        }
        KeyGenParameterSpec.Builder builder = new KeyGenParameterSpec.Builder(str2, 3);
        builder.setBlockModes(new String[]{f26545e});
        builder.setEncryptionPaddings(new String[]{f26546f});
        builder.setKeySize(f26542b);
        builder.setUserAuthenticationRequired(true);
        KeyGenParameterSpec build = builder.build();
        C41536l.m120488h(build, "paramsBuilder.build()");
        KeyGenerator instance2 = KeyGenerator.getInstance("AES", str);
        instance2.init(build);
        SecretKey generateKey = instance2.generateKey();
        C41536l.m120488h(generateKey, "keyGenerator.generateKey()");
        return generateKey;
    }

    /* renamed from: d */
    private final Cipher m35908d(boolean z) {
        Cipher a = m35906a();
        try {
            a.init(1, m35907c());
            return a;
        } catch (KeyPermanentlyInvalidatedException e) {
            if (!z) {
                m35909e();
                return m35908d(true);
            }
            throw e;
        }
    }

    /* renamed from: e */
    private final void m35909e() {
        KeyStore instance = KeyStore.getInstance(f26543c);
        instance.load((KeyStore.LoadStoreParameter) null);
        String str = f26544d;
        if (instance.containsAlias(str)) {
            instance.deleteEntry(str);
        }
    }

    /* renamed from: b */
    public final Cipher mo26215b() {
        return m35908d(false);
    }
}
