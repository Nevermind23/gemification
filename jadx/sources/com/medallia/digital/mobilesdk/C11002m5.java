package com.medallia.digital.mobilesdk;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.medallia.digital.mobilesdk.m5 */
public class C11002m5 {

    /* renamed from: a */
    private C10984l5 f31604a;

    public C11002m5(C10984l5 l5Var) {
        this.f31604a = l5Var;
    }

    /* renamed from: a */
    public C10984l5 mo28760a() {
        return this.f31604a;
    }

    /* renamed from: b */
    public String mo28761b() {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("{\"palette\":");
            C10984l5 l5Var = this.f31604a;
            sb.append(l5Var == null ? "null" : l5Var.mo28700d());
            sb.append("}");
            return sb.toString();
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
            return "";
        }
    }

    public C11002m5(JSONObject jSONObject) {
        try {
            if (jSONObject.has("palette") && !jSONObject.isNull("palette")) {
                this.f31604a = new C10984l5(jSONObject.getJSONObject("palette"));
            }
        } catch (JSONException e) {
            C10735b4.m39111c(e.getMessage());
        }
    }
}
