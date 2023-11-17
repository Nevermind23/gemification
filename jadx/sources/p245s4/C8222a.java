package p245s4;

import android.util.Patterns;
import com.github.mikephil.charting.utils.Utils;
import java.io.File;
import java.io.FileInputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p334z4.C9207a;
import p341ge.bog.mobilebank.eventbus.events.AgreementTemplateEventKt;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;

/* renamed from: s4.a */
abstract class C8222a {

    /* renamed from: a */
    private static Map f23395a = null;

    /* renamed from: b */
    private static Map f23396b = null;

    /* renamed from: c */
    private static Map f23397c = null;

    /* renamed from: d */
    private static JSONObject f23398d = null;

    /* renamed from: e */
    private static boolean f23399e = false;

    /* renamed from: a */
    static float[] m30980a(JSONObject jSONObject, String str) {
        Class<C8222a> cls = C8222a.class;
        if (C9207a.m34024c(cls)) {
            return null;
        }
        try {
            if (!f23399e) {
                return null;
            }
            float[] fArr = new float[30];
            Arrays.fill(fArr, Utils.FLOAT_EPSILON);
            try {
                String lowerCase = str.toLowerCase();
                JSONObject jSONObject2 = new JSONObject(jSONObject.optJSONObject("view").toString());
                String optString = jSONObject.optString("screenname");
                JSONArray jSONArray = new JSONArray();
                m30989j(jSONObject2, jSONArray);
                m30992m(fArr, m30988i(jSONObject2));
                JSONObject b = m30981b(jSONObject2);
                if (b == null) {
                    return null;
                }
                m30992m(fArr, m30987h(b, jSONArray, optString, jSONObject2.toString(), lowerCase));
                return fArr;
            } catch (JSONException unused) {
            }
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return null;
        }
    }

    /* renamed from: b */
    private static JSONObject m30981b(JSONObject jSONObject) {
        Class<C8222a> cls = C8222a.class;
        if (C9207a.m34024c(cls)) {
            return null;
        }
        try {
            if (jSONObject.optBoolean("is_interacted")) {
                return jSONObject;
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("childviews");
            if (optJSONArray == null) {
                return null;
            }
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject b = m30981b(optJSONArray.getJSONObject(i));
                if (b != null) {
                    return b;
                }
            }
            return null;
        } catch (JSONException unused) {
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
        }
    }

    /* renamed from: c */
    static String m30982c(String str, String str2, String str3) {
        Class<C8222a> cls = C8222a.class;
        if (C9207a.m34024c(cls)) {
            return null;
        }
        try {
            return (str3 + " | " + str2 + ", " + str).toLowerCase();
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return null;
        }
    }

    /* renamed from: d */
    static void m30983d(File file) {
        Class<C8222a> cls = C8222a.class;
        if (!C9207a.m34024c(cls)) {
            try {
                f23398d = new JSONObject();
                FileInputStream fileInputStream = new FileInputStream(file);
                byte[] bArr = new byte[fileInputStream.available()];
                fileInputStream.read(bArr);
                fileInputStream.close();
                f23398d = new JSONObject(new String(bArr, "UTF-8"));
                try {
                    HashMap hashMap = new HashMap();
                    f23395a = hashMap;
                    hashMap.put("ENGLISH", "1");
                    f23395a.put("GERMAN", AgreementTemplateEventKt.CONTRACT_TYPE_CREFIT_INFO_CHECK_PERMISSION_OFFERS_ID);
                    f23395a.put("SPANISH", "3");
                    f23395a.put("JAPANESE", AgreementTemplateEventKt.CONTRACT_TYPE_MBANK_PENSION_CONTRACT_ANDROID_ID);
                    HashMap hashMap2 = new HashMap();
                    f23396b = hashMap2;
                    hashMap2.put("VIEW_CONTENT", BankApiResponse.SUCCESSFUL_RESPONSE_CODE);
                    f23396b.put("SEARCH", "1");
                    f23396b.put("ADD_TO_CART", AgreementTemplateEventKt.CONTRACT_TYPE_CREFIT_INFO_CHECK_PERMISSION_OFFERS_ID);
                    f23396b.put("ADD_TO_WISHLIST", "3");
                    f23396b.put("INITIATE_CHECKOUT", AgreementTemplateEventKt.CONTRACT_TYPE_MBANK_PENSION_CONTRACT_ANDROID_ID);
                    f23396b.put("ADD_PAYMENT_INFO", "5");
                    f23396b.put("PURCHASE", AgreementTemplateEventKt.CONTRACT_TYPE_CREFIT_INFO_CHECK_PERMISSION_APPL_ID);
                    f23396b.put("LEAD", "7");
                    f23396b.put("COMPLETE_REGISTRATION", "8");
                    HashMap hashMap3 = new HashMap();
                    f23397c = hashMap3;
                    hashMap3.put("BUTTON_TEXT", "1");
                    f23397c.put("PAGE_TITLE", AgreementTemplateEventKt.CONTRACT_TYPE_CREFIT_INFO_CHECK_PERMISSION_OFFERS_ID);
                    f23397c.put("RESOLVED_DOCUMENT_LINK", "3");
                    f23397c.put("BUTTON_ID", AgreementTemplateEventKt.CONTRACT_TYPE_MBANK_PENSION_CONTRACT_ANDROID_ID);
                    f23399e = true;
                } catch (Throwable th) {
                    C9207a.m34023b(th, cls);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: e */
    private static boolean m30984e(JSONObject jSONObject) {
        Class<C8222a> cls = C8222a.class;
        if (C9207a.m34024c(cls)) {
            return false;
        }
        try {
            if ((jSONObject.optInt("classtypebitmask") & 32) > 0) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return false;
        }
    }

    /* renamed from: f */
    static boolean m30985f() {
        Class<C8222a> cls = C8222a.class;
        if (C9207a.m34024c(cls)) {
            return false;
        }
        try {
            return f23399e;
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return false;
        }
    }

    /* renamed from: g */
    private static boolean m30986g(String[] strArr, String[] strArr2) {
        Class<C8222a> cls = C8222a.class;
        if (C9207a.m34024c(cls)) {
            return false;
        }
        try {
            for (String str : strArr) {
                for (String contains : strArr2) {
                    if (contains.contains(str)) {
                        return true;
                    }
                }
            }
            return false;
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return false;
        }
    }

    /* renamed from: h */
    private static float[] m30987h(JSONObject jSONObject, JSONArray jSONArray, String str, String str2, String str3) {
        int i;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f12;
        float f13;
        float f14;
        String str4 = str2;
        Class<C8222a> cls = C8222a.class;
        if (C9207a.m34024c(cls)) {
            return null;
        }
        try {
            float[] fArr = new float[30];
            float f15 = Utils.FLOAT_EPSILON;
            Arrays.fill(fArr, Utils.FLOAT_EPSILON);
            int length = jSONArray.length();
            int i2 = 0;
            if (length > 1) {
                i = length - 1;
            } else {
                i = 0;
            }
            fArr[3] = (float) i;
            while (i2 < jSONArray.length()) {
                try {
                    if (m30984e(jSONArray.getJSONObject(i2))) {
                        fArr[9] = fArr[9] + 1.0f;
                    }
                    i2++;
                } catch (JSONException unused) {
                }
            }
            fArr[13] = -1.0f;
            fArr[14] = -1.0f;
            String str5 = str + '|' + str3;
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            m30993n(jSONObject, sb2, sb);
            String sb3 = sb.toString();
            String sb4 = sb2.toString();
            if (m30991l("ENGLISH", "COMPLETE_REGISTRATION", "BUTTON_TEXT", sb4)) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            fArr[15] = f;
            if (m30991l("ENGLISH", "COMPLETE_REGISTRATION", "PAGE_TITLE", str5)) {
                f2 = 1.0f;
            } else {
                f2 = 0.0f;
            }
            fArr[16] = f2;
            if (m30991l("ENGLISH", "COMPLETE_REGISTRATION", "BUTTON_ID", sb3)) {
                f3 = 1.0f;
            } else {
                f3 = 0.0f;
            }
            fArr[17] = f3;
            if (str4.contains("password")) {
                f4 = 1.0f;
            } else {
                f4 = 0.0f;
            }
            fArr[18] = f4;
            if (m30990k("(?i)(confirm.*password)|(password.*(confirmation|confirm)|confirmation)", str4)) {
                f5 = 1.0f;
            } else {
                f5 = 0.0f;
            }
            fArr[19] = f5;
            if (m30990k("(?i)(sign in)|login|signIn", str4)) {
                f6 = 1.0f;
            } else {
                f6 = 0.0f;
            }
            fArr[20] = f6;
            if (m30990k("(?i)(sign.*(up|now)|registration|register|(create|apply).*(profile|account)|open.*account|account.*(open|creation|application)|enroll|join.*now)", str4)) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            fArr[21] = f7;
            if (m30991l("ENGLISH", "PURCHASE", "BUTTON_TEXT", sb4)) {
                f8 = 1.0f;
            } else {
                f8 = 0.0f;
            }
            fArr[22] = f8;
            if (m30991l("ENGLISH", "PURCHASE", "PAGE_TITLE", str5)) {
                f9 = 1.0f;
            } else {
                f9 = 0.0f;
            }
            fArr[24] = f9;
            if (m30990k("(?i)add to(\\s|\\Z)|update(\\s|\\Z)|cart", sb4)) {
                f12 = 1.0f;
            } else {
                f12 = 0.0f;
            }
            fArr[25] = f12;
            if (m30990k("(?i)add to(\\s|\\Z)|update(\\s|\\Z)|cart|shop|buy", str5)) {
                f13 = 1.0f;
            } else {
                f13 = 0.0f;
            }
            fArr[27] = f13;
            if (m30991l("ENGLISH", "LEAD", "BUTTON_TEXT", sb4)) {
                f14 = 1.0f;
            } else {
                f14 = 0.0f;
            }
            fArr[28] = f14;
            if (m30991l("ENGLISH", "LEAD", "PAGE_TITLE", str5)) {
                f15 = 1.0f;
            }
            fArr[29] = f15;
            return fArr;
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return null;
        }
    }

    /* renamed from: i */
    private static float[] m30988i(JSONObject jSONObject) {
        Class<C8222a> cls = C8222a.class;
        if (C9207a.m34024c(cls)) {
            return null;
        }
        try {
            float[] fArr = new float[30];
            Arrays.fill(fArr, Utils.FLOAT_EPSILON);
            String lowerCase = jSONObject.optString("text").toLowerCase();
            String lowerCase2 = jSONObject.optString("hint").toLowerCase();
            String lowerCase3 = jSONObject.optString("classname").toLowerCase();
            int optInt = jSONObject.optInt("inputtype", -1);
            String[] strArr = {lowerCase, lowerCase2};
            if (m30986g(new String[]{"$", "amount", "price", "total"}, strArr)) {
                fArr[0] = (float) (((double) fArr[0]) + 1.0d);
            }
            if (m30986g(new String[]{"password", "pwd"}, strArr)) {
                fArr[1] = (float) (((double) fArr[1]) + 1.0d);
            }
            if (m30986g(new String[]{"tel", "phone"}, strArr)) {
                fArr[2] = (float) (((double) fArr[2]) + 1.0d);
            }
            if (m30986g(new String[]{"search"}, strArr)) {
                fArr[4] = (float) (((double) fArr[4]) + 1.0d);
            }
            if (optInt >= 0) {
                fArr[5] = (float) (((double) fArr[5]) + 1.0d);
            }
            if (optInt == 3 || optInt == 2) {
                fArr[6] = (float) (((double) fArr[6]) + 1.0d);
            }
            if (optInt == 32 || Patterns.EMAIL_ADDRESS.matcher(lowerCase).matches()) {
                fArr[7] = (float) (((double) fArr[7]) + 1.0d);
            }
            if (lowerCase3.contains("checkbox")) {
                fArr[8] = (float) (((double) fArr[8]) + 1.0d);
            }
            if (m30986g(new String[]{"complete", "confirm", "done", "submit"}, new String[]{lowerCase})) {
                fArr[10] = (float) (((double) fArr[10]) + 1.0d);
            }
            if (lowerCase3.contains("radio") && lowerCase3.contains("button")) {
                fArr[12] = (float) (((double) fArr[12]) + 1.0d);
            }
            try {
                JSONArray optJSONArray = jSONObject.optJSONArray("childviews");
                int length = optJSONArray.length();
                for (int i = 0; i < length; i++) {
                    m30992m(fArr, m30988i(optJSONArray.getJSONObject(i)));
                }
            } catch (JSONException unused) {
            }
            return fArr;
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return null;
        }
    }

    /* renamed from: j */
    private static boolean m30989j(JSONObject jSONObject, JSONArray jSONArray) {
        boolean z;
        Class<C8222a> cls = C8222a.class;
        if (C9207a.m34024c(cls)) {
            return false;
        }
        try {
            if (jSONObject.optBoolean("is_interacted")) {
                return true;
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("childviews");
            int i = 0;
            while (true) {
                if (i >= optJSONArray.length()) {
                    z = false;
                    break;
                } else if (optJSONArray.getJSONObject(i).optBoolean("is_interacted")) {
                    z = true;
                    break;
                } else {
                    i++;
                }
            }
            boolean z2 = z;
            JSONArray jSONArray2 = new JSONArray();
            if (z) {
                for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                    jSONArray.put(optJSONArray.getJSONObject(i2));
                }
            } else {
                for (int i3 = 0; i3 < optJSONArray.length(); i3++) {
                    JSONObject jSONObject2 = optJSONArray.getJSONObject(i3);
                    if (m30989j(jSONObject2, jSONArray)) {
                        jSONArray2.put(jSONObject2);
                        z2 = true;
                    }
                }
                jSONObject.put("childviews", jSONArray2);
            }
            return z2;
        } catch (JSONException unused) {
            return false;
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return false;
        }
    }

    /* renamed from: k */
    private static boolean m30990k(String str, String str2) {
        Class<C8222a> cls = C8222a.class;
        if (C9207a.m34024c(cls)) {
            return false;
        }
        try {
            return Pattern.compile(str).matcher(str2).find();
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return false;
        }
    }

    /* renamed from: l */
    private static boolean m30991l(String str, String str2, String str3, String str4) {
        Class<C8222a> cls = C8222a.class;
        if (C9207a.m34024c(cls)) {
            return false;
        }
        try {
            return m30990k(f23398d.optJSONObject("rulesForLanguage").optJSONObject((String) f23395a.get(str)).optJSONObject("rulesForEvent").optJSONObject((String) f23396b.get(str2)).optJSONObject("positiveRules").optString((String) f23397c.get(str3)), str4);
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return false;
        }
    }

    /* renamed from: m */
    private static void m30992m(float[] fArr, float[] fArr2) {
        Class<C8222a> cls = C8222a.class;
        if (!C9207a.m34024c(cls)) {
            int i = 0;
            while (i < fArr.length) {
                try {
                    fArr[i] = fArr[i] + fArr2[i];
                    i++;
                } catch (Throwable th) {
                    C9207a.m34023b(th, cls);
                    return;
                }
            }
        }
    }

    /* renamed from: n */
    private static void m30993n(JSONObject jSONObject, StringBuilder sb, StringBuilder sb2) {
        Class<C8222a> cls = C8222a.class;
        if (!C9207a.m34024c(cls)) {
            try {
                String lowerCase = jSONObject.optString("text", "").toLowerCase();
                String lowerCase2 = jSONObject.optString("hint", "").toLowerCase();
                if (!lowerCase.isEmpty()) {
                    sb.append(lowerCase);
                    sb.append(" ");
                }
                if (!lowerCase2.isEmpty()) {
                    sb2.append(lowerCase2);
                    sb2.append(" ");
                }
                JSONArray optJSONArray = jSONObject.optJSONArray("childviews");
                if (optJSONArray != null) {
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        try {
                            m30993n(optJSONArray.getJSONObject(i), sb, sb2);
                        } catch (JSONException unused) {
                        }
                    }
                }
            } catch (Throwable th) {
                C9207a.m34023b(th, cls);
            }
        }
    }
}
