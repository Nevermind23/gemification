package com.medallia.digital.mobilesdk;

import android.annotation.TargetApi;
import android.security.KeyPairGeneratorSpec;
import android.security.keystore.KeyGenParameterSpec;
import android.text.TextUtils;
import android.util.Base64;
import com.medallia.digital.mobilesdk.C11089s6;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.math.BigInteger;
import java.security.Key;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Calendar;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.KeyGenerator;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import javax.security.auth.x500.X500Principal;

/* renamed from: com.medallia.digital.mobilesdk.n4 */
final class C11016n4 implements C10769c8 {

    /* renamed from: b */
    private static final String f31657b = "AndroidKeyStore";

    /* renamed from: c */
    private static final String f31658c = "AES/GCM/NoPadding";

    /* renamed from: d */
    private static final String f31659d = "RSA/ECB/PKCS1Padding";

    /* renamed from: e */
    private static final String f31660e = "MD_SDK_KEYSTORE_V2";

    /* renamed from: f */
    private static final String f31661f = "MD_SDK_KEYSTORE";

    /* renamed from: g */
    private static final String f31662g = "CN=MD_SDK_KEYSTORE_V2";

    /* renamed from: h */
    private static final String f31663h = "AndroidOpenSSL";

    /* renamed from: i */
    private static final int f31664i = 30;

    /* renamed from: j */
    private static final int f31665j = 16;

    /* renamed from: k */
    private static final int f31666k = 12;

    /* renamed from: l */
    private static final int f31667l = 128;

    /* renamed from: m */
    private static final String f31668m = "AES";

    /* renamed from: n */
    private static final String f31669n = "RSA";

    /* renamed from: o */
    private static C11016n4 f31670o;

    /* renamed from: a */
    private KeyStore f31671a;

    private C11016n4() {
        m40372c();
        m40380k();
    }

    /* renamed from: c */
    private void m40372c() {
        C11089s6 b = C11089s6.m40668b();
        C11089s6.C11090a aVar = C11089s6.C11090a.LENNY;
        if (b.mo28975a(aVar, "").equals("")) {
            byte[] bArr = new byte[12];
            new SecureRandom().nextBytes(bArr);
            C11089s6.m40668b().mo28984b(aVar, Base64.encodeToString(bArr, 0));
        }
    }

    /* renamed from: d */
    private void m40373d() {
        C11089s6 b = C11089s6.m40668b();
        C11089s6.C11090a aVar = C11089s6.C11090a.NALA;
        if (b.mo28975a(aVar, (String) null) == null) {
            byte[] bArr = new byte[16];
            new SecureRandom().nextBytes(bArr);
            C11089s6.m40668b().mo28984b(aVar, Base64.encodeToString(m40371b(bArr), 0));
        }
    }

    /* renamed from: e */
    private byte[] m40374e() {
        return Base64.decode(C11089s6.m40668b().mo28975a(C11089s6.C11090a.LENNY, ""), 0);
    }

    /* renamed from: f */
    protected static C11016n4 m40375f() {
        if (f31670o == null) {
            f31670o = new C11016n4();
        }
        return f31670o;
    }

    /* renamed from: g */
    private Key m40376g() {
        return m40378i();
    }

    /* renamed from: h */
    private Key m40377h() {
        String a = C11089s6.m40668b().mo28975a(C11089s6.C11090a.NALA, (String) null);
        if (a == null) {
            m40373d();
        }
        return new SecretKeySpec(m40369a(Base64.decode(a, 0)), f31668m);
    }

    /* renamed from: i */
    private Key m40378i() {
        try {
            return this.f31671a.getKey(f31660e, (char[]) null);
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
            return null;
        }
    }

    @TargetApi(18)
    /* renamed from: j */
    private void m40379j() {
        try {
            KeyStore instance = KeyStore.getInstance(f31657b);
            this.f31671a = instance;
            instance.load((KeyStore.LoadStoreParameter) null);
            if (!this.f31671a.containsAlias(f31660e)) {
                m40368a();
                m40370b();
                Calendar instance2 = Calendar.getInstance();
                Calendar instance3 = Calendar.getInstance();
                instance3.add(1, 30);
                KeyPairGeneratorSpec build = new KeyPairGeneratorSpec.Builder(C10884i4.m39721c().mo28483b()).setAlias(f31660e).setSubject(new X500Principal(f31662g)).setSerialNumber(BigInteger.TEN).setStartDate(instance2.getTime()).setEndDate(instance3.getTime()).build();
                KeyPairGenerator instance4 = KeyPairGenerator.getInstance(f31669n, f31657b);
                instance4.initialize(build);
                instance4.generateKeyPair();
                m40373d();
            }
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
        }
    }

    @TargetApi(23)
    /* renamed from: k */
    private void m40380k() {
        try {
            KeyStore instance = KeyStore.getInstance(f31657b);
            this.f31671a = instance;
            instance.load((KeyStore.LoadStoreParameter) null);
            if (!this.f31671a.containsAlias(f31660e)) {
                m40368a();
                m40370b();
                KeyGenerator instance2 = KeyGenerator.getInstance(f31668m, f31657b);
                instance2.init(new KeyGenParameterSpec.Builder(f31660e, 3).setBlockModes(new String[]{"GCM"}).setEncryptionPaddings(new String[]{"NoPadding"}).setRandomizedEncryptionRequired(false).build());
                instance2.generateKey();
            }
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo28829a(C11089s6.C11090a aVar) {
        String a = C11089s6.m40668b().mo28975a(aVar, (String) null);
        if (!TextUtils.isEmpty(a)) {
            return mo28830a(a);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public String mo28832b(String str) {
        try {
            Cipher instance = Cipher.getInstance(f31658c);
            instance.init(1, m40376g(), new GCMParameterSpec(128, m40374e()));
            return Base64.encodeToString(instance.doFinal(str.getBytes()), 0);
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
            return "";
        }
    }

    public void clearAndDisconnect() {
        f31670o = null;
    }

    /* renamed from: b */
    private void m40370b() {
        try {
            C11089s6.m40668b().mo28986c().edit().remove("MD_KEY_IV").commit();
            C11089s6.m40668b().mo28986c().edit().remove("MD_KEY_AES").commit();
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo28830a(String str) {
        try {
            Cipher instance = Cipher.getInstance(f31658c);
            instance.init(2, m40376g(), new GCMParameterSpec(128, m40374e()));
            return new String(instance.doFinal(Base64.decode(str, 0)));
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
            return "";
        }
    }

    /* renamed from: a */
    private void m40368a() {
        try {
            if (this.f31671a.containsAlias(f31661f)) {
                this.f31671a.deleteEntry(f31661f);
            }
        } catch (KeyStoreException e) {
            C10735b4.m39111c(e.getMessage());
        }
    }

    /* renamed from: b */
    private byte[] m40371b(byte[] bArr) {
        try {
            Cipher instance = Cipher.getInstance(f31659d, f31663h);
            instance.init(1, ((KeyStore.PrivateKeyEntry) this.f31671a.getEntry(f31660e, (KeyStore.ProtectionParameter) null)).getCertificate().getPublicKey());
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            CipherOutputStream cipherOutputStream = new CipherOutputStream(byteArrayOutputStream, instance);
            cipherOutputStream.write(bArr);
            cipherOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
            return new byte[0];
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo28831a(C11089s6.C11090a aVar, String str) {
        C11089s6.m40668b().mo28984b(aVar, !TextUtils.isEmpty(str) ? mo28832b(str) : null);
    }

    /* renamed from: a */
    private byte[] m40369a(byte[] bArr) {
        try {
            Cipher instance = Cipher.getInstance(f31659d, f31663h);
            instance.init(2, ((KeyStore.PrivateKeyEntry) this.f31671a.getEntry(f31660e, (KeyStore.ProtectionParameter) null)).getPrivateKey());
            CipherInputStream cipherInputStream = new CipherInputStream(new ByteArrayInputStream(bArr), instance);
            ArrayList arrayList = new ArrayList();
            while (true) {
                int read = cipherInputStream.read();
                if (read == -1) {
                    break;
                }
                arrayList.add(Byte.valueOf((byte) read));
            }
            cipherInputStream.close();
            int size = arrayList.size();
            byte[] bArr2 = new byte[size];
            for (int i = 0; i < size; i++) {
                bArr2[i] = ((Byte) arrayList.get(i)).byteValue();
            }
            return bArr2;
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
            return new byte[0];
        }
    }
}
