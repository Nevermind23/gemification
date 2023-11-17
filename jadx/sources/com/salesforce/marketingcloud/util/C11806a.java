package com.salesforce.marketingcloud.util;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import com.salesforce.marketingcloud.tozny.AesCbcWithIntegrity;
import java.security.GeneralSecurityException;

@SuppressLint({"UnknownNullness"})
/* renamed from: com.salesforce.marketingcloud.util.a */
public class C11806a extends AesCbcWithIntegrity implements C11808c {

    /* renamed from: b */
    private static final String f34263b = "F6389234-1024-481F-9173-37D9D7F5051F";

    /* renamed from: c */
    private static final String f34264c = "com.salesforce.marketingcloud.storagePrefs";

    /* renamed from: d */
    private static final String f34265d = "install_date_enc";

    /* renamed from: e */
    private static final int f34266e = 500;

    /* renamed from: a */
    private final AesCbcWithIntegrity.SecretKeys f34267a;

    public C11806a(Context context, String str, String str2, String str3) {
        this(context, str, str2, str3, f34266e);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo31643a(Context context, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(f34264c, 0);
        String string = sharedPreferences.getString(f34265d, (String) null);
        if (string != null) {
            return string;
        }
        String saltString = AesCbcWithIntegrity.saltString(AesCbcWithIntegrity.generateSalt());
        sharedPreferences.edit().putString(f34265d, saltString).apply();
        return saltString;
    }

    /* renamed from: b */
    public String mo31645b(String str) {
        if (str == null) {
            return null;
        }
        return AesCbcWithIntegrity.encrypt(str, this.f34267a).toString();
    }

    protected C11806a(Context context, String str, String str2, String str3, int i) {
        this.f34267a = AesCbcWithIntegrity.generateKeyFromPassword(m43200a(str, str2, str3), mo31643a(context, str), i);
        m43201a();
    }

    /* renamed from: a */
    public String mo31644a(String str) {
        if (str == null) {
            return null;
        }
        return AesCbcWithIntegrity.decryptString(new AesCbcWithIntegrity.CipherTextIvMac(str), this.f34267a);
    }

    /* renamed from: a */
    private String m43200a(String str, String str2, String str3) {
        return Base64.encodeToString(C11824l.m43298e(str + "--" + C11824l.m43298e(str2) + "__" + C11824l.m43298e(str3)).getBytes(C11824l.f34334b), 2);
    }

    /* renamed from: a */
    private void m43201a() {
        if (!f34263b.equals(mo31644a(mo31645b(f34263b)))) {
            throw new GeneralSecurityException("Encryption/decryption test failed");
        }
    }
}
