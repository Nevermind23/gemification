package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.C10785e0;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.medallia.digital.mobilesdk.w4 */
class C11173w4 extends C10785e0 implements Serializable {

    /* renamed from: j */
    private static final int f32096j = 31;

    /* renamed from: a */
    private String f32097a;

    /* renamed from: b */
    private String f32098b;

    /* renamed from: c */
    private String f32099c;

    /* renamed from: d */
    private String f32100d;

    /* renamed from: e */
    private String f32101e;

    /* renamed from: f */
    private String f32102f;

    /* renamed from: g */
    private long f32103g;

    /* renamed from: h */
    private String f32104h;

    /* renamed from: i */
    private int f32105i;

    C11173w4(String str, String str2, String str3, String str4, String str5, String str6, long j, String str7, int i) {
        this.f32097a = str;
        this.f32098b = str2;
        this.f32099c = str3;
        this.f32100d = str4;
        this.f32101e = str5;
        this.f32102f = str6;
        this.f32103g = j;
        this.f32104h = str7;
        this.f32105i = i;
    }

    /* renamed from: a */
    public String mo29133a() {
        return this.f32104h;
    }

    /* renamed from: b */
    public String mo29135b() {
        return this.f32098b;
    }

    /* renamed from: c */
    public String mo29137c() {
        return this.f32101e;
    }

    /* renamed from: d */
    public String mo29138d() {
        return this.f32097a;
    }

    /* renamed from: e */
    public String mo29139e() {
        return this.f32099c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C11173w4 w4Var = (C11173w4) obj;
        String str = this.f32097a;
        if (str == null ? w4Var.f32097a != null : !str.equals(w4Var.f32097a)) {
            return false;
        }
        String str2 = this.f32098b;
        if (str2 == null ? w4Var.f32098b != null : !str2.equals(w4Var.f32098b)) {
            return false;
        }
        String str3 = this.f32099c;
        if (str3 == null ? w4Var.f32099c != null : !str3.equals(w4Var.f32099c)) {
            return false;
        }
        String str4 = this.f32100d;
        if (str4 == null ? w4Var.f32100d != null : !str4.equals(w4Var.f32100d)) {
            return false;
        }
        String str5 = this.f32101e;
        if (str5 == null ? w4Var.f32101e != null : !str5.equals(w4Var.f32101e)) {
            return false;
        }
        String str6 = this.f32102f;
        if (str6 == null ? w4Var.f32102f != null : !str6.equals(w4Var.f32102f)) {
            return false;
        }
        String str7 = this.f32104h;
        if (str7 == null ? w4Var.f32104h == null : str7.equals(w4Var.f32104h)) {
            return this.f32103g != w4Var.f32103g;
        }
        return false;
    }

    /* renamed from: f */
    public String mo29141f() {
        return this.f32102f;
    }

    /* renamed from: g */
    public int mo29142g() {
        return this.f32105i;
    }

    /* access modifiers changed from: protected */
    public C10785e0.C10786a getDataTableObjectType() {
        return C10785e0.C10786a.MediaFeedback;
    }

    public String getFormId() {
        return this.f32100d;
    }

    /* renamed from: h */
    public long mo29144h() {
        return this.f32103g;
    }

    public int hashCode() {
        String str = this.f32097a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f32098b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f32099c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f32100d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f32101e;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.f32102f;
        int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.f32104h;
        if (str7 != null) {
            i = str7.hashCode();
        }
        return (int) (((long) ((hashCode6 + i) * 31)) + this.f32103g);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo29146i() {
        this.f32105i++;
    }

    /* access modifiers changed from: package-private */
    public String toJsonString() {
        try {
            return "{\"mediaCaptureClientCorrelationId\":" + C11051p3.m40518c(this.f32097a) + ",\"feedbackClientCorrelationId\":" + C11051p3.m40518c(this.f32098b) + ",\"mediaPath\":" + C11051p3.m40518c(this.f32099c) + ",\"formId\":" + C11051p3.m40518c(this.f32100d) + ",\"formName\":" + C11051p3.m40518c(this.f32101e) + ",\"mediaType\":" + C11051p3.m40518c(this.f32102f) + ",\"ecId\":" + C11051p3.m40518c(this.f32104h) + ",\"timestamp\":" + this.f32103g + "}";
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
            return "";
        }
    }

    C11173w4(JSONObject jSONObject) {
        try {
            if (jSONObject.has("mediaCaptureClientCorrelationId") && !jSONObject.isNull("mediaCaptureClientCorrelationId")) {
                this.f32097a = jSONObject.getString("mediaCaptureClientCorrelationId");
            }
            if (jSONObject.has("feedbackClientCorrelationId") && !jSONObject.isNull("feedbackClientCorrelationId")) {
                this.f32098b = jSONObject.getString("feedbackClientCorrelationId");
            }
            if (jSONObject.has("mediaPath") && !jSONObject.isNull("mediaPath")) {
                this.f32099c = jSONObject.getString("mediaPath");
            }
            if (jSONObject.has("mediaType") && !jSONObject.isNull("mediaType")) {
                this.f32102f = jSONObject.getString("mediaType");
            }
            if (jSONObject.has("formId") && !jSONObject.isNull("formId")) {
                this.f32100d = jSONObject.getString("formId");
            }
            if (jSONObject.has("formName") && !jSONObject.isNull("formName")) {
                this.f32101e = jSONObject.getString("formName");
            }
            if (jSONObject.has("numberOfRetries") && !jSONObject.isNull("numberOfRetries")) {
                this.f32105i = jSONObject.getInt("numberOfRetries");
            }
            if (jSONObject.has("ecId") && !jSONObject.isNull("ecId")) {
                this.f32104h = jSONObject.getString("ecId");
            }
            if (jSONObject.has("timestamp") && !jSONObject.isNull("timestamp")) {
                this.f32103g = jSONObject.getLong("timestamp");
            }
        } catch (JSONException e) {
            C10735b4.m39111c(e.getMessage());
        }
    }

    /* renamed from: a */
    public void mo29134a(String str) {
        this.f32098b = str;
    }

    /* renamed from: b */
    public void mo29136b(String str) {
        this.f32099c = str;
    }
}
