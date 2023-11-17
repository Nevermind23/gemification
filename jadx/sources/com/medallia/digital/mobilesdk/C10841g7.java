package com.medallia.digital.mobilesdk;

import com.salesforce.marketingcloud.storage.p385db.C11769i;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.medallia.digital.mobilesdk.g7 */
public class C10841g7 implements Serializable {

    /* renamed from: t */
    private static final int f31033t = 31;

    /* renamed from: a */
    private String f31034a;

    /* renamed from: b */
    private String f31035b;

    /* renamed from: c */
    private String f31036c;

    /* renamed from: d */
    private String f31037d;

    /* renamed from: e */
    private String f31038e;

    /* renamed from: f */
    private String f31039f;

    /* renamed from: g */
    private String f31040g;

    /* renamed from: h */
    private String f31041h;

    /* renamed from: i */
    private String f31042i;

    /* renamed from: j */
    private boolean f31043j;

    /* renamed from: k */
    private String f31044k;

    /* renamed from: l */
    private String f31045l;

    /* renamed from: m */
    private String f31046m;

    /* renamed from: n */
    private boolean f31047n;

    /* renamed from: o */
    private boolean f31048o;

    /* renamed from: p */
    private boolean f31049p;

    /* renamed from: q */
    private long f31050q;

    /* renamed from: r */
    private String f31051r;

    /* renamed from: s */
    private String f31052s;

    protected C10841g7() {
    }

    public C10841g7(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, String str8, String str9, String str10, boolean z2, boolean z3, boolean z4, long j, String str11, String str12, String str13) {
        this.f31034a = str;
        this.f31035b = str2;
        this.f31036c = str3;
        this.f31037d = str4;
        this.f31038e = str5;
        this.f31040g = str6;
        this.f31042i = str7;
        this.f31043j = z;
        this.f31044k = str8;
        this.f31045l = str9;
        this.f31046m = str10;
        this.f31047n = z2;
        this.f31048o = z3;
        this.f31049p = z4;
        this.f31050q = j;
        this.f31051r = str11;
        this.f31052s = str12;
        this.f31039f = str13;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo28358a() {
        return this.f31036c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public String mo28359b() {
        return this.f31046m;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo28360c() {
        return this.f31044k;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public String mo28361d() {
        return this.f31045l;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public String mo28362e() {
        return this.f31037d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C10841g7 g7Var = (C10841g7) obj;
        String str = this.f31034a;
        if (str == null ? g7Var.f31034a != null : !str.equals(g7Var.f31034a)) {
            return false;
        }
        String str2 = this.f31035b;
        if (str2 == null ? g7Var.f31035b != null : !str2.equals(g7Var.f31035b)) {
            return false;
        }
        String str3 = this.f31036c;
        if (str3 == null ? g7Var.f31036c != null : !str3.equals(g7Var.f31036c)) {
            return false;
        }
        String str4 = this.f31037d;
        if (str4 == null ? g7Var.f31037d != null : !str4.equals(g7Var.f31037d)) {
            return false;
        }
        String str5 = this.f31038e;
        if (str5 == null ? g7Var.f31038e != null : !str5.equals(g7Var.f31038e)) {
            return false;
        }
        String str6 = this.f31040g;
        if (str6 == null ? g7Var.f31040g != null : !str6.equals(g7Var.f31040g)) {
            return false;
        }
        String str7 = this.f31041h;
        if (str7 == null ? g7Var.f31041h != null : !str7.equals(g7Var.f31041h)) {
            return false;
        }
        String str8 = this.f31042i;
        if (str8 == null ? g7Var.f31042i != null : !str8.equals(g7Var.f31042i)) {
            return false;
        }
        if (this.f31043j != g7Var.f31043j) {
            return false;
        }
        String str9 = this.f31044k;
        if (str9 == null ? g7Var.f31044k != null : !str9.equals(g7Var.f31044k)) {
            return false;
        }
        String str10 = this.f31045l;
        if (str10 == null ? g7Var.f31045l != null : !str10.equals(g7Var.f31045l)) {
            return false;
        }
        String str11 = this.f31046m;
        if (str11 == null ? g7Var.f31046m != null : !str11.equals(g7Var.f31046m)) {
            return false;
        }
        if (this.f31047n != g7Var.f31047n || this.f31048o != g7Var.f31048o || this.f31049p != g7Var.f31049p || this.f31050q != g7Var.f31050q) {
            return false;
        }
        String str12 = this.f31051r;
        if (str12 == null ? g7Var.f31051r != null : !str12.equals(g7Var.f31051r)) {
            return false;
        }
        String str13 = this.f31039f;
        if (str13 == null ? g7Var.f31039f != null : !str13.equals(g7Var.f31039f)) {
            return false;
        }
        String str14 = this.f31052s;
        String str15 = g7Var.f31052s;
        if (str14 != null) {
            if (!str14.equals(str15)) {
                return true;
            }
        } else if (str15 != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public String mo28364f() {
        return this.f31041h;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public String mo28365g() {
        return this.f31038e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public String mo28366h() {
        return this.f31052s;
    }

    public int hashCode() {
        String str = this.f31034a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f31035b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f31036c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f31037d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f31038e;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.f31040g;
        int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.f31041h;
        int hashCode7 = (hashCode6 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.f31042i;
        int hashCode8 = (((hashCode7 + (str8 != null ? str8.hashCode() : 0)) * 31) + Boolean.valueOf(this.f31043j).hashCode()) * 31;
        String str9 = this.f31044k;
        int hashCode9 = (hashCode8 + (str9 != null ? str9.hashCode() : 0)) * 31;
        String str10 = this.f31045l;
        int hashCode10 = (hashCode9 + (str10 != null ? str10.hashCode() : 0)) * 31;
        String str11 = this.f31046m;
        int hashCode11 = (((((((((hashCode10 + (str11 != null ? str11.hashCode() : 0)) * 31) + Boolean.valueOf(this.f31047n).hashCode()) * 31) + Boolean.valueOf(this.f31048o).hashCode()) * 31) + Boolean.valueOf(this.f31049p).hashCode()) * 31) + Long.valueOf(this.f31050q).hashCode()) * 31;
        String str12 = this.f31051r;
        int hashCode12 = (hashCode11 + (str12 != null ? str12.hashCode() : 0)) * 31;
        String str13 = this.f31052s;
        int hashCode13 = (hashCode12 + (str13 != null ? str13.hashCode() : 0)) * 31;
        String str14 = this.f31039f;
        if (str14 != null) {
            i = str14.hashCode();
        }
        return hashCode13 + i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public String mo28368i() {
        return this.f31040g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public String mo28369j() {
        return this.f31042i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public long mo28370k() {
        return this.f31050q;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public String mo28371l() {
        return this.f31035b;
    }

    /* renamed from: m */
    public String mo28372m() {
        return this.f31039f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public String mo28373n() {
        return this.f31034a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public String mo28374o() {
        return this.f31051r;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public boolean mo28375p() {
        return this.f31047n;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public boolean mo28376q() {
        return this.f31043j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public boolean mo28377r() {
        return this.f31049p;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public boolean mo28378s() {
        return this.f31048o;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public String mo28379t() {
        try {
            return "{\"showThankYouPrompt\":" + this.f31049p + ",\"promptDuration\":" + this.f31050q + ",\"isStickyPrompt\":" + this.f31048o + ",\"isImageDisplay\":" + this.f31043j + ",\"selectedTheme\":" + C11051p3.m40518c(this.f31039f) + ",\"mobileThankYouPromptImageDataContract\":{\"url\":" + C11051p3.m40518c(this.f31040g) + "},\"mobileThankYouPromptDarkImageDataContract\":{\"url\":" + C11051p3.m40518c(this.f31041h) + "},\"mobileThankYouPromptGeneralSettingsSectionContract\":{\"textContent\":" + C11051p3.m40518c(C11051p3.m40515a(this.f31034a)) + ",\"bodyContent\":" + C11051p3.m40518c(C11051p3.m40515a(this.f31035b)) + ",\"promptContentFontColor\":" + C11051p3.m40518c(this.f31037d) + ",\"promptContentFontType\":" + C11051p3.m40518c(this.f31038e) + ",\"backgroundColor\":" + C11051p3.m40518c(this.f31036c) + "},\"mobileThankYouPromptButtonSectionContract\":{\"buttonDisplayed\":" + this.f31047n + ",\"buttonText\":" + C11051p3.m40518c(this.f31044k) + ",\"buttonTextColor\":" + C11051p3.m40518c(this.f31045l) + ",\"buttonColor\":" + C11051p3.m40518c(this.f31046m) + "},\"mobileThankYouAccessibilitySectionContract\":{\"imageAltText\":" + C11051p3.m40518c(this.f31052s) + ",\"closeButtonAltText\":" + C11051p3.m40518c(this.f31051r) + "}}";
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
            return "";
        }
    }

    public C10841g7(JSONObject jSONObject) {
        String str;
        JSONObject jSONObject2 = jSONObject;
        String str2 = "closeButtonAltText";
        String str3 = "imageAltText";
        String str4 = "mobileThankYouAccessibilitySectionContract";
        String str5 = "buttonColor";
        String str6 = "buttonTextColor";
        String str7 = "buttonText";
        String str8 = "buttonDisplayed";
        try {
            if (jSONObject2.has("showThankYouPrompt") && !jSONObject2.isNull("showThankYouPrompt")) {
                this.f31049p = jSONObject2.getBoolean("showThankYouPrompt");
            }
            if (!jSONObject2.has("promptDuration") || jSONObject2.isNull("promptDuration")) {
                str = "promptContentFontColor";
            } else {
                str = "promptContentFontColor";
                this.f31050q = jSONObject2.getLong("promptDuration");
            }
            if (jSONObject2.has("isStickyPrompt") && !jSONObject2.isNull("isStickyPrompt")) {
                this.f31048o = jSONObject2.getBoolean("isStickyPrompt");
            }
            if (jSONObject2.has("isImageDisplay") && !jSONObject2.isNull("isImageDisplay")) {
                this.f31043j = jSONObject2.getBoolean("isImageDisplay");
            }
            if (jSONObject2.has("selectedTheme") && !jSONObject2.isNull("selectedTheme")) {
                this.f31039f = jSONObject2.getString("selectedTheme");
            }
            if (jSONObject2.has("mobileThankYouPromptImageDataContract")) {
                if (!jSONObject2.isNull("mobileThankYouPromptImageDataContract")) {
                    JSONObject jSONObject3 = jSONObject2.getJSONObject("mobileThankYouPromptImageDataContract");
                    if (jSONObject3.has(C11769i.C11770a.f34149l) && !jSONObject3.isNull(C11769i.C11770a.f34149l)) {
                        this.f31040g = jSONObject3.getString(C11769i.C11770a.f34149l);
                    }
                }
            }
            if (jSONObject2.has("mobileThankYouPromptDarkImageDataContract") && !jSONObject2.isNull("mobileThankYouPromptDarkImageDataContract")) {
                JSONObject jSONObject4 = jSONObject2.getJSONObject("mobileThankYouPromptDarkImageDataContract");
                if (jSONObject4.has(C11769i.C11770a.f34149l) && !jSONObject4.isNull(C11769i.C11770a.f34149l)) {
                    this.f31041h = jSONObject4.getString(C11769i.C11770a.f34149l);
                }
            }
            if (jSONObject2.has("mobileThankYouPromptGeneralSettingsSectionContract") && !jSONObject2.isNull("mobileThankYouPromptGeneralSettingsSectionContract")) {
                JSONObject jSONObject5 = jSONObject2.getJSONObject("mobileThankYouPromptGeneralSettingsSectionContract");
                if (jSONObject5.has("textContent") && !jSONObject5.isNull("textContent")) {
                    this.f31034a = jSONObject5.getString("textContent");
                }
                if (jSONObject5.has("bodyContent") && !jSONObject5.isNull("bodyContent")) {
                    this.f31035b = jSONObject5.getString("bodyContent");
                }
                if (jSONObject5.has(str) && !jSONObject5.isNull(str)) {
                    this.f31037d = jSONObject5.getString(str);
                }
                if (jSONObject5.has("promptContentFontType") && !jSONObject5.isNull("promptContentFontType")) {
                    this.f31038e = jSONObject5.getString("promptContentFontType");
                }
                if (jSONObject5.has("backgroundColor") && !jSONObject5.isNull("backgroundColor")) {
                    this.f31036c = jSONObject5.getString("backgroundColor");
                }
            }
            if (jSONObject2.has("mobileThankYouPromptButtonSectionContract") && !jSONObject2.isNull("mobileThankYouPromptButtonSectionContract")) {
                JSONObject jSONObject6 = jSONObject2.getJSONObject("mobileThankYouPromptButtonSectionContract");
                String str9 = str8;
                if (jSONObject6.has(str9) && !jSONObject6.isNull(str9)) {
                    this.f31047n = jSONObject6.getBoolean(str9);
                }
                String str10 = str7;
                if (jSONObject6.has(str10) && !jSONObject6.isNull(str10)) {
                    this.f31044k = jSONObject6.getString(str10);
                }
                String str11 = str6;
                if (jSONObject6.has(str11) && !jSONObject6.isNull(str11)) {
                    this.f31045l = jSONObject6.getString(str11);
                }
                String str12 = str5;
                if (jSONObject6.has(str12) && !jSONObject6.isNull(str12)) {
                    this.f31046m = jSONObject6.getString(str12);
                }
            }
            String str13 = str4;
            if (jSONObject2.has(str13) && !jSONObject2.isNull(str13)) {
                JSONObject jSONObject7 = jSONObject2.getJSONObject(str13);
                String str14 = str3;
                if (jSONObject7.has(str14) && !jSONObject7.isNull(str14)) {
                    this.f31052s = jSONObject7.getString(str14);
                }
                String str15 = str2;
                if (jSONObject7.has(str15) && !jSONObject7.isNull(str15)) {
                    this.f31051r = jSONObject7.getString(str15);
                }
            }
        } catch (JSONException e) {
            C10735b4.m39111c(e.getMessage());
        }
    }
}
