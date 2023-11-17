package com.medallia.digital.mobilesdk;

import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.medallia.digital.mobilesdk.d1 */
class C10772d1 implements Serializable {

    /* renamed from: a */
    private String f30856a;

    /* renamed from: b */
    private String f30857b;

    public C10772d1(String str, String str2) {
        this.f30856a = str;
        this.f30857b = str2;
    }

    /* renamed from: a */
    public String mo28239a() {
        return this.f30856a;
    }

    /* renamed from: b */
    public String mo28240b() {
        return this.f30857b;
    }

    /* renamed from: c */
    public String mo28241c() {
        try {
            return "{\"canvas\":" + C11051p3.m40518c(this.f30856a) + ",\"header\":" + C11051p3.m40518c(this.f30857b) + "}";
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
            return "";
        }
    }

    public C10772d1(JSONObject jSONObject) {
        try {
            if (jSONObject.has("canvas") && !jSONObject.isNull("canvas")) {
                this.f30856a = jSONObject.getString("canvas");
            }
            if (jSONObject.has("header") && !jSONObject.isNull("header")) {
                this.f30857b = jSONObject.getString("header");
            }
        } catch (JSONException e) {
            C10735b4.m39111c(e.getMessage());
        }
    }
}
