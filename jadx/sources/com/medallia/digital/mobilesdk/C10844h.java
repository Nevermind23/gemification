package com.medallia.digital.mobilesdk;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.medallia.digital.mobilesdk.h */
class C10844h {

    /* renamed from: a */
    private C10757c2 f31057a;

    /* renamed from: b */
    private JSONObject f31058b;

    /* renamed from: c */
    private JSONObject f31059c;

    /* renamed from: d */
    private JSONObject f31060d;

    C10844h(JSONObject jSONObject) {
        try {
            if (jSONObject.has("extraData") && !jSONObject.isNull("extraData")) {
                this.f31058b = jSONObject.getJSONObject("extraData");
            }
            if (jSONObject.has("eventDynamicStructure") && !jSONObject.isNull("eventDynamicStructure")) {
                this.f31059c = jSONObject.getJSONObject("eventDynamicStructure");
            }
            if (jSONObject.has("events") && !jSONObject.isNull("events")) {
                this.f31057a = new C10757c2(jSONObject.getJSONObject("events"));
            }
            if (jSONObject.has("externalData") && !jSONObject.isNull("externalData")) {
                this.f31060d = jSONObject.getJSONObject("externalData");
            }
        } catch (JSONException e) {
            C10735b4.m39111c(e.getMessage());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public JSONObject mo28382a() {
        return this.f31059c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C10757c2 mo28383b() {
        return this.f31057a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public JSONObject mo28384c() {
        return this.f31060d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public JSONObject mo28385d() {
        return this.f31058b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public String mo28386e() {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("{\"events\":");
            C10757c2 c2Var = this.f31057a;
            String str = "null";
            sb.append(c2Var == null ? str : c2Var.mo28202m0());
            sb.append(",\"extraData\":");
            JSONObject jSONObject = this.f31058b;
            sb.append(jSONObject == null ? str : jSONObject.toString());
            sb.append(",\"externalData\":");
            JSONObject jSONObject2 = this.f31060d;
            sb.append(jSONObject2 == null ? str : jSONObject2.toString());
            sb.append(",\"eventDynamicStructure\":");
            JSONObject jSONObject3 = this.f31059c;
            if (jSONObject3 != null) {
                str = jSONObject3.toString();
            }
            sb.append(str);
            sb.append("}");
            return sb.toString();
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
            return "";
        }
    }
}
