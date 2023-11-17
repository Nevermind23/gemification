package com.threatmetrix.TrustDefender;

import android.content.SharedPreferences;
import com.threatmetrix.TrustDefender.C11907h;
import com.threatmetrix.TrustDefender.C11969r1;
import java.util.Locale;
import java.util.UUID;
import p585re.C17603t;

/* renamed from: com.threatmetrix.TrustDefender.a0 */
public abstract class C11876a0 {

    /* renamed from: a */
    private static final String f34680a = C11907h.m43615j(C11876a0.class);

    /* renamed from: a */
    public static String m43516a(C17603t tVar) {
        if (!C11969r1.C11980k.m43988c()) {
            C11907h.C11908a.m43624b(f34680a, "SharedPreferences wasn't found, generating GUID");
            return UUID.randomUUID().toString().replace("-", "").toLowerCase(Locale.US);
        }
        SharedPreferences sharedPreferences = tVar.f49314a.getSharedPreferences("ThreatMetrixMobileSDK", 0);
        String str = null;
        try {
            str = C11969r1.C11980k.m43991f(sharedPreferences, "ThreatMetrixMobileSDK", (String) null);
            if (!Thread.interrupted()) {
                if (str == null) {
                    C11907h.C11908a.m43624b(f34680a, "Found nothing in shared prefs, generating GUID");
                    str = UUID.randomUUID().toString().replace("-", "").toLowerCase(Locale.US);
                    SharedPreferences.Editor j = C11969r1.C11980k.m43995j(sharedPreferences);
                    if (j != null) {
                        C11969r1.C11980k.m43986a("ThreatMetrixMobileSDK", str, j);
                        j.apply();
                    }
                }
                return str;
            }
            throw new InterruptedException();
        } catch (ClassCastException unused) {
            C11907h.C11908a.m43624b(f34680a, "Incompatible type for GUID");
        }
    }

    /* renamed from: b */
    public static String m43517b(String str, String str2) {
        return C11921k0.m43728k(m43524i(str, str2));
    }

    /* renamed from: c */
    public static String m43518c(C17603t tVar) {
        return C11969r1.C11973d.m43956a(tVar.f49314a.getContentResolver(), "android_id");
    }

    /* renamed from: d */
    public static String m43519d(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        if (str.length() == 32) {
            return str;
        }
        if (str.length() >= 32) {
            return C11921k0.m43728k(str);
        }
        String k = C11921k0.m43728k(str);
        if (k == null) {
            return null;
        }
        int length = 32 - str.length();
        if (length > k.length()) {
            length = k.length();
        }
        return str + k.substring(0, length);
    }

    /* renamed from: e */
    public static void m43520e(C17603t tVar, String str, String str2, String str3) {
        C11969r1.C11980k.m43996k(tVar, str, str2, str3);
    }

    /* renamed from: f */
    public static String m43521f(String str) {
        String str2 = f34680a;
        C11907h.C11908a.m43624b(str2, "using generated ID for LSC:" + str);
        return m43519d(str);
    }

    /* renamed from: g */
    public static String m43522g(String str) {
        if (m43525j(str)) {
            return null;
        }
        String str2 = f34680a;
        C11907h.C11908a.m43624b(str2, "using ANDROID_ID for TPC:" + str);
        return m43519d(str);
    }

    /* renamed from: h */
    public static String m43523h(C17603t tVar, String str, String str2) {
        try {
            return C11969r1.C11980k.m43993h(tVar, str, str2, (String) null);
        } catch (ClassCastException e) {
            C11907h.m43620o(f34680a, "Found preference of different type", e);
            return null;
        }
    }

    /* renamed from: i */
    private static String m43524i(String str, String str2) {
        return !m43525j(str) ? str : C11921k0.m43732o(str2) ? str2 : "";
    }

    /* renamed from: j */
    private static boolean m43525j(String str) {
        if (str != null && !str.equals("9774d56d682e549c") && str.length() >= 15) {
            return false;
        }
        String str2 = f34680a;
        C11907h.C11908a.m43624b(str2, "ANDROID_ID contains nothing useful: " + str);
        return true;
    }
}
