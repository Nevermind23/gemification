package com.medallia.digital.mobilesdk;

import com.salesforce.marketingcloud.UrlHandler;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.medallia.digital.mobilesdk.y7 */
class C11230y7 implements Serializable {

    /* renamed from: a */
    private String f32551a;

    /* renamed from: b */
    private String f32552b;

    /* renamed from: c */
    private C10770d f32553c;

    public C11230y7(String str, String str2, C10770d dVar) {
        this.f32551a = str;
        this.f32552b = str2;
        this.f32553c = dVar;
    }

    /* renamed from: a */
    public String mo29234a() {
        C10770d dVar = this.f32553c;
        if (dVar == null || dVar.mo28236a() == null) {
            return null;
        }
        return this.f32553c.mo28236a();
    }

    /* renamed from: b */
    public String mo29235b() {
        return this.f32552b;
    }

    /* renamed from: c */
    public String mo29236c() {
        return this.f32551a;
    }

    /* renamed from: d */
    public String mo29237d() {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("{\"headline\":");
            sb.append(C11051p3.m40518c(this.f32551a));
            sb.append(",\"header\":");
            sb.append(C11051p3.m40518c(this.f32552b));
            sb.append(",\"action\":");
            C10770d dVar = this.f32553c;
            sb.append(dVar == null ? "null" : dVar.mo28238c());
            sb.append("}");
            return sb.toString();
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
            return "";
        }
    }

    public C11230y7(JSONObject jSONObject) {
        try {
            if (jSONObject.has("headline") && !jSONObject.isNull("headline")) {
                this.f32551a = jSONObject.getString("headline");
            }
            if (jSONObject.has("header") && !jSONObject.isNull("header")) {
                this.f32552b = jSONObject.getString("header");
            }
            if (jSONObject.has(UrlHandler.ACTION) && !jSONObject.isNull(UrlHandler.ACTION)) {
                this.f32553c = new C10770d(jSONObject.getJSONObject(UrlHandler.ACTION));
            }
        } catch (JSONException e) {
            C10735b4.m39111c(e.getMessage());
        }
    }
}
