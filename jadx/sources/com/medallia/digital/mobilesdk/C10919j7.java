package com.medallia.digital.mobilesdk;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.medallia.digital.mobilesdk.j7 */
public class C10919j7 {

    /* renamed from: a */
    private C10939k7 f31362a;

    public C10919j7(JSONObject jSONObject) {
        try {
            if (jSONObject.has("themeData") && !jSONObject.isNull("themeData")) {
                this.f31362a = new C10939k7(jSONObject.getJSONObject("themeData"));
            }
        } catch (JSONException e) {
            C10735b4.m39111c(e.getMessage());
        }
    }

    /* renamed from: a */
    public C10939k7 mo28548a() {
        return this.f31362a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public String mo28549b() {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("{\"themeData\":");
            C10939k7 k7Var = this.f31362a;
            sb.append(k7Var == null ? "null" : k7Var.mo28638c());
            sb.append("}");
            return sb.toString();
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
            return "";
        }
    }
}
