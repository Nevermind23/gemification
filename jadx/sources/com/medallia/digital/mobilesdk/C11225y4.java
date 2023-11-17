package com.medallia.digital.mobilesdk;

import com.salesforce.marketingcloud.UrlHandler;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.medallia.digital.mobilesdk.y4 */
class C11225y4 {

    /* renamed from: a */
    private String f32535a;

    /* renamed from: b */
    private String f32536b;

    /* renamed from: c */
    private String f32537c;

    /* renamed from: d */
    private String f32538d;

    /* renamed from: e */
    private int f32539e;

    C11225y4(JSONObject jSONObject) {
        try {
            if (jSONObject.has("componentId") && !jSONObject.isNull("componentId")) {
                this.f32535a = jSONObject.getString("componentId");
            }
            if (jSONObject.has("mediaType") && !jSONObject.isNull("mediaType")) {
                this.f32536b = jSONObject.getString("mediaType");
            }
            if (jSONObject.has(UrlHandler.ACTION) && !jSONObject.isNull(UrlHandler.ACTION)) {
                this.f32537c = jSONObject.getString(UrlHandler.ACTION);
            }
            if (jSONObject.has("ecId") && !jSONObject.isNull("ecId")) {
                this.f32538d = jSONObject.getString("ecId");
            }
            if (jSONObject.has("maxMediaLength") && !jSONObject.isNull("maxMediaLength")) {
                this.f32539e = jSONObject.getInt("maxMediaLength");
            }
        } catch (JSONException e) {
            C10735b4.m39111c(e.getMessage());
        }
    }

    /* renamed from: a */
    public String mo29226a() {
        return this.f32537c;
    }

    /* renamed from: b */
    public String mo29227b() {
        return this.f32535a;
    }

    /* renamed from: c */
    public String mo29228c() {
        return this.f32538d;
    }

    /* renamed from: d */
    public String mo29229d() {
        String str = this.f32536b;
        if (str != null) {
            return str.toLowerCase();
        }
        return null;
    }

    /* renamed from: e */
    public int mo29230e() {
        return this.f32539e;
    }
}
