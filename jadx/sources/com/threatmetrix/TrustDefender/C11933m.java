package com.threatmetrix.TrustDefender;

import android.content.SharedPreferences;
import com.threatmetrix.TrustDefender.C11969r1;
import p585re.C17595l;
import p585re.C17603t;

/* renamed from: com.threatmetrix.TrustDefender.m */
public abstract class C11933m {

    /* renamed from: a */
    private static final String f34973a = C11907h.m43615j(C11933m.class);

    /* renamed from: a */
    public static void m43788a(C17603t tVar, String str, C17595l lVar) {
        if (!C11969r1.C11980k.m43988c() || tVar == null) {
            C11907h.m43622q(f34973a, "Invalid state, failed to access pref");
            return;
        }
        SharedPreferences.Editor j = C11969r1.C11980k.m43995j(tVar.f49314a.getSharedPreferences(str, 0));
        if (j != null) {
            C11969r1.C11980k.m43992g("enableOptions", lVar.mo45159d(), j);
            C11969r1.C11980k.m43992g("disableOptions", lVar.mo45164i(), j);
            C11969r1.C11980k.m43986a("sdkVersion", "6.3-81", j);
            C11969r1.C11980k.m43989d("quietPeriod", lVar.mo45161f(), j);
            j.apply();
        }
    }

    /* renamed from: b */
    public static C17595l m43789b(C17603t tVar, String str) {
        if (!C11969r1.C11980k.m43988c() || tVar == null) {
            C11907h.m43622q(f34973a, "Invalid state, failed to access pref");
            return null;
        }
        SharedPreferences sharedPreferences = tVar.f49314a.getSharedPreferences(str, 0);
        try {
            C17595l lVar = new C17595l();
            lVar.mo45158c(C11969r1.C11980k.m43987b(sharedPreferences, "enableOptions", 0));
            lVar.mo45162g(C11969r1.C11980k.m43987b(sharedPreferences, "disableOptions", 0));
            lVar.mo45156a(C11969r1.C11980k.m43991f(sharedPreferences, "sdkVersion", ""));
            lVar.mo45160e(C11969r1.C11980k.m43990e(sharedPreferences, "quietPeriod", 0));
            return lVar;
        } catch (ClassCastException e) {
            C11907h.m43620o(f34973a, "Found preference of different type", e);
            return null;
        }
    }
}
