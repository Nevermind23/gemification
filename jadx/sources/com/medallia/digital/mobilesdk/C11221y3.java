package com.medallia.digital.mobilesdk;

import android.util.Pair;
import com.medallia.digital.mobilesdk.C11089s6;
import com.medallia.digital.mobilesdk.MDExternalError;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import org.json.JSONObject;

/* renamed from: com.medallia.digital.mobilesdk.y3 */
class C11221y3 {

    /* renamed from: c */
    protected static final String f32302c = "Language not available. Language fallback logic applied";

    /* renamed from: d */
    private static final String f32303d = "^[a-zA-Z]{2,3}";

    /* renamed from: e */
    private static final String f32304e = "^[a-zA-Z]{2,3}_[a-zA-Z]{2,3}";

    /* renamed from: f */
    private static final String f32305f = "^[a-zA-Z]{2,3}-[a-zA-Z]{2,3}";

    /* renamed from: g */
    private static C11221y3 f32306g;

    /* renamed from: a */
    private boolean f32307a;

    /* renamed from: b */
    private Pair<Boolean, String> f32308b = new Pair<>(Boolean.FALSE, (Object) null);

    /* renamed from: com.medallia.digital.mobilesdk.y3$a */
    public enum C11222a {
        CANCEL("cancel"),
        ALERT_TITLE_DELETE_MEDIA_CAPTURE("alertTitleDeleteMediaCapture"),
        DELETE("delete"),
        ALERT_TITLE_REPLACE_MEDIA_CAPTURE("alertTitleReplaceMediaCapture"),
        ALERT_BODY_REPLACE_MEDIA_CAPTURE("alertBodyReplaceMediaCapture"),
        REPLACE("replace"),
        WIFI_ALERT_TITLE("wifiAlertTitle"),
        WIFI_ALERT_BODY("wifiAlertBody"),
        GOT_IT("gotIt"),
        VIDEO_LIMITATION_ALERT_TITLE("videoLimitationAlertTitle"),
        VIDEO_LIMITATION_ALERT_BODY("videoLimitationAlertBody"),
        PERMISSION_DENY_TITLE("permissionDenyTitle"),
        PERMISSION_DENY_BODY("permissionDenyBody");
        

        /* renamed from: a */
        private final String f32323a;

        private C11222a(String str) {
            this.f32323a = str;
        }

        /* renamed from: a */
        public String mo29224a() {
            return this.f32323a;
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.y3$b */
    protected enum C11223b {
        SQ,
        AR,
        AR_DZ,
        AR_BH,
        AR_EG,
        AR_IQ,
        AR_JO,
        AR_KW,
        AR_LB,
        AR_LY,
        AR_MA,
        AR_OM,
        AR_QA,
        AR_SA,
        AR_SY,
        AR_TN,
        AR_AE,
        AR_YE,
        HY,
        AS,
        AST,
        AZ,
        EU,
        BG,
        BE,
        BN,
        BS,
        BR,
        MY,
        CA,
        CH,
        CE,
        ZH,
        ZH_HK,
        ZH_CN,
        ZH_SG,
        ZH_TW,
        CV,
        CO,
        CR,
        HR,
        CS,
        DA,
        NL,
        NL_BE,
        EN,
        EN_AU,
        EN_BZ,
        EN_CA,
        EN_IE,
        EN_JM,
        EN_NZ,
        EN_PH,
        EN_ZA,
        EN_TT,
        EN_GB,
        EN_US,
        EN_ZW,
        EN_IN,
        EN_SG,
        EN_HK,
        EN_MY,
        EO,
        ET,
        FO,
        FA,
        FJ,
        FI,
        FR,
        FR_BE,
        FR_CA,
        FR_FR,
        FR_LU,
        FR_MC,
        FR_CH,
        FY,
        FUR,
        GD,
        GD_IE,
        GL,
        KA,
        DE,
        DE_AT,
        DE_DE,
        DE_LI,
        DE_LU,
        DE_CH,
        EL,
        GU,
        HT,
        HE,
        HI,
        HU,
        IS,
        ID,
        IU,
        GA,
        IT,
        IT_CH,
        JA,
        KN,
        KS,
        KK,
        KM,
        KY,
        TLH,
        KO,
        KO_KP,
        KO_KR,
        LA,
        LV,
        LT,
        LB,
        MK,
        MS,
        ML,
        MT,
        MI,
        MR,
        MO,
        NV,
        NG,
        NE,
        NO,
        NB,
        NN,
        OC,
        OR,
        OM,
        FA_IR,
        PL,
        PT,
        PT_BR,
        PA,
        PA_IN,
        PA_PK,
        QU,
        RM,
        RO,
        RO_MO,
        RU,
        RU_MO,
        RU_UA,
        SZ,
        SG,
        SA,
        SC,
        SD,
        SI,
        SR,
        SK,
        SL,
        SO,
        SB,
        ES,
        ES_AR,
        ES_BO,
        ES_CL,
        ES_CO,
        ES_CR,
        ES_DO,
        ES_EC,
        ES_SV,
        ES_GT,
        ES_HN,
        ES_MX,
        ES_NI,
        ES_PA,
        ES_PY,
        ES_PE,
        ES_PR,
        ES_ES,
        ES_UY,
        ES_VE,
        SX,
        SW,
        SV,
        SV_FI,
        SV_SV,
        TA,
        TT,
        TE,
        TH,
        TIG,
        TS,
        TN,
        TR,
        TK,
        UK,
        UZ,
        HSB,
        UR,
        VE,
        VI,
        VO,
        WA,
        CY,
        XH,
        JI,
        ZU
    }

    /* renamed from: com.medallia.digital.mobilesdk.y3$c */
    public enum C11224c {
        SUBMIT("feedbackSubmitted"),
        CLOSE("close"),
        RATE_APP("rateApp"),
        PROVIDE_FEEDBACK("provideFeedback"),
        MAYBE_LATER("noThanks"),
        NO_THANKS("maybeLater"),
        BACK("back"),
        ALERT("alert");
        

        /* renamed from: a */
        private final String f32534a;

        private C11224c(String str) {
            this.f32534a = str;
        }

        /* renamed from: a */
        public String mo29225a() {
            return this.f32534a;
        }
    }

    protected C11221y3() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo29209a() {
        String country = Locale.getDefault().getCountry();
        return country != null ? country : "";
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public String mo29215b() {
        String c = mo29217c();
        return c != null ? c : mo29221g();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo29217c() {
        return (this.f32307a || !((Boolean) this.f32308b.first).booleanValue()) ? C11089s6.m40668b().mo28975a(C11089s6.C11090a.CUSTOM_LOCALE, (String) null) : (String) this.f32308b.second;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public MDExternalError mo29218d(String str) {
        if (str == null) {
            C11089s6.m40668b().mo28984b(C11089s6.C11090a.CUSTOM_LOCALE, (String) null);
            return null;
        } else if (str.matches(f32303d)) {
            if (this.f32307a) {
                C11089s6.m40668b().mo28984b(C11089s6.C11090a.CUSTOM_LOCALE, str);
            } else {
                this.f32308b = new Pair<>(Boolean.TRUE, str);
            }
            return null;
        } else {
            if (str.matches(f32304e)) {
                str = str.replace("_", "-");
            }
            if (str.matches(f32305f)) {
                C11089s6 b = C11089s6.m40668b();
                C11089s6.C11090a aVar = C11089s6.C11090a.CUSTOM_LOCALE;
                b.mo28984b(aVar, str);
                if (this.f32307a) {
                    C11089s6.m40668b().mo28984b(aVar, str);
                } else {
                    this.f32308b = new Pair<>(Boolean.TRUE, str);
                }
                return null;
            }
            if (this.f32307a) {
                C11089s6.m40668b().mo28984b(C11089s6.C11090a.CUSTOM_LOCALE, (String) null);
            } else {
                this.f32308b = new Pair<>(Boolean.TRUE, (Object) null);
            }
            return new MDExternalError(MDExternalError.ExternalError.TRANSLATION_INVALID_FORMAT);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public String mo29219e() {
        String upperCase = mo29215b() != null ? mo29215b().toUpperCase() : null;
        return upperCase != null ? upperCase : "";
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public String mo29220f() {
        return (String) this.f32308b.second;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public String mo29221g() {
        return C11089s6.m40668b().mo28975a(C11089s6.C11090a.OS_LOCALE, (String) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public boolean mo29222h() {
        String g = mo29221g();
        return g == null || !g.equals(Locale.getDefault().toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public boolean mo29223i() {
        return ((Boolean) this.f32308b.first).booleanValue();
    }

    /* renamed from: a */
    private String m41125a(C11224c cVar, C11222a aVar, JSONObject jSONObject, String str) {
        try {
            if (!jSONObject.has(str)) {
                return null;
            }
            String string = jSONObject.getJSONObject(str).getString(aVar != null ? aVar.mo29224a() : cVar.mo29225a());
            if (string != null) {
                return string;
            }
            return null;
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
            return null;
        }
    }

    /* renamed from: c */
    private String m41126c(String str) {
        if (!str.contains("-")) {
            return str;
        }
        String[] split = str.split("-");
        return split.length > 0 ? split[0] : str;
    }

    /* renamed from: d */
    public static C11221y3 m41127d() {
        if (f32306g == null) {
            f32306g = new C11221y3();
        }
        return f32306g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo29216b(String str) {
        if (str == null) {
            return false;
        }
        String upperCase = str.toUpperCase();
        if (str.contains("-")) {
            upperCase = upperCase.replace("-", "_");
        }
        for (C11223b bVar : C11223b.values()) {
            if (bVar.toString().equals(upperCase)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo29210a(String str, String str2, C11224c cVar, C11222a aVar) {
        if (str == null || str2 == null) {
            return "";
        }
        try {
            String e = C10930k2.m39989e(C10930k2.m39984d(str));
            if (e == null) {
                C10735b4.m39109b("staticFieldsString loaded from file is null");
                return "";
            }
            JSONObject jSONObject = new JSONObject(e);
            String a = m41125a(cVar, aVar, jSONObject, str2);
            if (a != null) {
                return a;
            }
            String a2 = m41125a(cVar, aVar, jSONObject, m41126c(str2));
            if (a2 != null) {
                return a2;
            }
            String b = mo29215b();
            String a3 = m41125a(cVar, aVar, jSONObject, b);
            if (a3 != null) {
                return a3;
            }
            String a4 = m41125a(cVar, aVar, jSONObject, m41126c(b));
            if (a4 != null) {
                return a4;
            }
            return aVar != null ? "" : "Feedback Submitted Successfully";
        } catch (Exception e2) {
            C10735b4.m39111c(e2.getMessage());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo29211a(String str, ArrayList<String> arrayList) {
        if (str == null || arrayList == null) {
            return null;
        }
        String replaceAll = str.toLowerCase().replaceAll("_", "-");
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (next.equals(replaceAll)) {
                return next;
            }
        }
        if (replaceAll.contains("-")) {
            String[] split = replaceAll.split("-");
            if (split.length > 0) {
                replaceAll = split[0];
            }
        }
        if (replaceAll.contains("_")) {
            String[] split2 = replaceAll.split("_");
            if (split2.length > 0) {
                replaceAll = split2[0];
            }
        }
        Iterator<String> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            String next2 = it2.next();
            if (next2.equals(replaceAll)) {
                return next2;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo29212a(Locale locale) {
        if (locale != null) {
            C11089s6.m40668b().mo28984b(C11089s6.C11090a.OS_LOCALE, Locale.getDefault().toString());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo29213a(boolean z) {
        this.f32307a = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo29214a(String str) {
        String c = mo29217c();
        if (str == null && c == null) {
            return false;
        }
        return str == null || !str.equals(c);
    }
}
