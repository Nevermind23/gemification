package ba1;

import android.content.Context;
import android.security.keystore.KeyGenParameterSpec;
import hg1.C41263a;
import hg1.C41265c;
import java.io.StringWriter;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.ECGenParameterSpec;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: ba1.h */
public final class C10196h {

    /* renamed from: b */
    public static final C10197a f28251b = new C10197a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final Context f28252a;

    /* renamed from: ba1.h$a */
    public static final class C10197a {
        private C10197a() {
        }

        public /* synthetic */ C10197a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C10196h(Context context) {
        C41536l.m120489i(context, "context");
        this.f28252a = context;
    }

    /* renamed from: b */
    private final KeyPair m37266b() {
        KeyPairGenerator instance = KeyPairGenerator.getInstance("EC", "AndroidKeyStore");
        instance.initialize(new KeyGenParameterSpec.Builder("sso_device_public_key", 12).setDigests(new String[]{"SHA-256"}).setAlgorithmParameterSpec(new ECGenParameterSpec("secp256r1")).build());
        KeyPair generateKeyPair = instance.generateKeyPair();
        C41536l.m120488h(generateKeyPair, "keyPairGenerator.generateKeyPair()");
        return generateKeyPair;
    }

    /* renamed from: c */
    private final KeyStore m37267c() {
        KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
        instance.load((KeyStore.LoadStoreParameter) null);
        C41536l.m120488h(instance, "keyStore");
        return instance;
    }

    /* renamed from: d */
    private final KeyStore.Entry m37268d() {
        KeyStore c = m37267c();
        if (c.containsAlias("sso_device_public_key")) {
            return c.getEntry("sso_device_public_key", (KeyStore.ProtectionParameter) null);
        }
        return null;
    }

    /* renamed from: f */
    private final String m37269f(PublicKey publicKey) {
        StringWriter stringWriter = new StringWriter();
        C41265c cVar = new C41265c(stringWriter);
        cVar.mo95728c(new C41263a("PUBLIC KEY", publicKey.getEncoded()));
        cVar.flush();
        cVar.close();
        String stringWriter2 = stringWriter.toString();
        C41536l.m120488h(stringWriter2, "writer.toString()");
        return stringWriter2;
    }

    /* renamed from: a */
    public final String mo26764a() {
        KeyStore c = m37267c();
        if (c.containsAlias("sso_device_public_key")) {
            c.deleteEntry("sso_device_public_key");
        }
        PublicKey publicKey = m37266b().getPublic();
        C41536l.m120488h(publicKey, "key.public");
        return m37269f(publicKey);
    }

    /* renamed from: e */
    public final byte[] mo26765e(byte[] bArr) {
        C41536l.m120489i(bArr, "data");
        KeyStore.Entry d = m37268d();
        if (d != null) {
            Signature instance = Signature.getInstance("SHA256withECDSA");
            instance.initSign(((KeyStore.PrivateKeyEntry) d).getPrivateKey());
            instance.update(bArr);
            byte[] sign = instance.sign();
            C41536l.m120488h(sign, "getInstance(SIGN_ALGORIT…         sign()\n        }");
            return sign;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.security.KeyStore.PrivateKeyEntry");
    }
}
