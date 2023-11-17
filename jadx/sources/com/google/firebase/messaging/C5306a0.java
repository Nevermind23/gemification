package com.google.firebase.messaging;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import androidx.profileinstaller.C1694g;
import com.google.firebase.C5270e;
import com.google.firebase.installations.C5288f;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;
import p117i6.C6573b;
import p238ra.C8087i;
import p302w9.C8896j;
import p327y9.C9142b;
import p337z7.C9231i;
import p337z7.Task;
import p339z9.C9270e;

/* renamed from: com.google.firebase.messaging.a0 */
class C5306a0 {

    /* renamed from: a */
    private final C5270e f17014a;

    /* renamed from: b */
    private final C5325f0 f17015b;

    /* renamed from: c */
    private final C6573b f17016c;

    /* renamed from: d */
    private final C9142b f17017d;

    /* renamed from: e */
    private final C9142b f17018e;

    /* renamed from: f */
    private final C9270e f17019f;

    C5306a0(C5270e eVar, C5325f0 f0Var, C9142b bVar, C9142b bVar2, C9270e eVar2) {
        this(eVar, f0Var, new C6573b(eVar.mo17481j()), bVar, bVar2, eVar2);
    }

    /* renamed from: b */
    private static String m20976b(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    /* renamed from: c */
    private Task m20977c(Task task) {
        return task.mo24865j(new C1694g(), new C5371z(this));
    }

    /* renamed from: d */
    private String m20978d() {
        try {
            return m20976b(MessageDigest.getInstance("SHA-1").digest(this.f17014a.mo17482m().getBytes()));
        } catch (NoSuchAlgorithmException unused) {
            return "[HASH-ERROR]";
        }
    }

    /* renamed from: f */
    private String m20979f(Bundle bundle) {
        if (bundle != null) {
            String string = bundle.getString("registration_id");
            if (string != null) {
                return string;
            }
            String string2 = bundle.getString("unregistered");
            if (string2 != null) {
                return string2;
            }
            String string3 = bundle.getString("error");
            if ("RST".equals(string3)) {
                throw new IOException("INSTANCE_ID_RESET");
            } else if (string3 != null) {
                throw new IOException(string3);
            } else {
                Log.w("FirebaseMessaging", "Unexpected response: " + bundle, new Throwable());
                throw new IOException("SERVICE_NOT_AVAILABLE");
            }
        } else {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
    }

    /* renamed from: g */
    static boolean m20980g(String str) {
        if ("SERVICE_NOT_AVAILABLE".equals(str) || "INTERNAL_SERVER_ERROR".equals(str) || "InternalServerError".equals(str)) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ String m20981h(Task task) {
        return m20979f((Bundle) task.mo24870o(IOException.class));
    }

    /* renamed from: i */
    private void m20982i(String str, String str2, Bundle bundle) {
        C8896j.C8897a b;
        bundle.putString("scope", str2);
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        bundle.putString("gmp_app_id", this.f17014a.mo17483n().mo17517c());
        bundle.putString("gmsv", Integer.toString(this.f17015b.mo17577d()));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", this.f17015b.mo17575a());
        bundle.putString("app_ver_name", this.f17015b.mo17576b());
        bundle.putString("firebase-app-name-hash", m20978d());
        try {
            String b2 = ((C5288f) C9231i.m34107a(this.f17019f.mo17505b(false))).mo17493b();
            if (!TextUtils.isEmpty(b2)) {
                bundle.putString("Goog-Firebase-Installations-Auth", b2);
            } else {
                Log.w("FirebaseMessaging", "FIS auth token is empty");
            }
        } catch (InterruptedException | ExecutionException e) {
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
        }
        bundle.putString("appid", (String) C9231i.m34107a(this.f17019f.mo17504a()));
        bundle.putString("cliv", "fcm-" + "23.1.2");
        C8896j jVar = (C8896j) this.f17018e.get();
        C8087i iVar = (C8087i) this.f17017d.get();
        if (jVar != null && iVar != null && (b = jVar.mo24318b("fire-iid")) != C8896j.C8897a.NONE) {
            bundle.putString("Firebase-Client-Log-Type", Integer.toString(b.mo24320a()));
            bundle.putString("Firebase-Client", iVar.mo23265a());
        }
    }

    /* renamed from: j */
    private Task m20983j(String str, String str2, Bundle bundle) {
        try {
            m20982i(str, str2, bundle);
            return this.f17016c.mo20568a(bundle);
        } catch (InterruptedException | ExecutionException e) {
            return C9231i.m34112f(e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public Task mo17556e() {
        return m20977c(m20983j(C5325f0.m21063c(this.f17014a), "*", new Bundle()));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public Task mo17557k(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str2);
        return m20977c(m20983j(str, "/topics/" + str2, bundle));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public Task mo17558l(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str2);
        bundle.putString("delete", "1");
        return m20977c(m20983j(str, "/topics/" + str2, bundle));
    }

    C5306a0(C5270e eVar, C5325f0 f0Var, C6573b bVar, C9142b bVar2, C9142b bVar3, C9270e eVar2) {
        this.f17014a = eVar;
        this.f17015b = f0Var;
        this.f17016c = bVar;
        this.f17017d = bVar2;
        this.f17018e = bVar3;
        this.f17019f = eVar2;
    }
}
