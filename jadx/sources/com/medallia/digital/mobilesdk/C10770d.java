package com.medallia.digital.mobilesdk;

import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.medallia.digital.mobilesdk.d */
class C10770d implements Serializable {

    /* renamed from: a */
    private String f30848a;

    /* renamed from: b */
    private String f30849b;

    public C10770d(String str, String str2) {
        this.f30848a = str;
        this.f30849b = str2;
    }

    /* renamed from: a */
    public String mo28236a() {
        return this.f30848a;
    }

    /* renamed from: b */
    public String mo28237b() {
        return this.f30849b;
    }

    /* renamed from: c */
    public String mo28238c() {
        try {
            return "{\"primary\":" + C11051p3.m40518c(this.f30848a) + ",\"auxiliary\":" + C11051p3.m40518c(this.f30849b) + "}";
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
            return "";
        }
    }

    public C10770d(JSONObject jSONObject) {
        try {
            if (jSONObject.has("primary") && !jSONObject.isNull("primary")) {
                this.f30848a = jSONObject.getString("primary");
            }
            if (jSONObject.has("auxiliary") && !jSONObject.isNull("auxiliary")) {
                this.f30849b = jSONObject.getString("auxiliary");
            }
        } catch (JSONException e) {
            C10735b4.m39111c(e.getMessage());
        }
    }
}
