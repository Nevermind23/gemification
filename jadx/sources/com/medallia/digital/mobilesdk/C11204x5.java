package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.C10785e0;
import org.json.JSONObject;

/* renamed from: com.medallia.digital.mobilesdk.x5 */
public class C11204x5 extends C10785e0 {

    /* renamed from: a */
    String f32240a;

    /* renamed from: b */
    Long f32241b;

    /* renamed from: c */
    Boolean f32242c;

    public C11204x5(String str, Long l, Boolean bool) {
        this.f32240a = str;
        this.f32241b = l;
        this.f32242c = bool;
    }

    /* renamed from: a */
    public Long mo29195a() {
        return this.f32241b;
    }

    /* renamed from: b */
    public String mo29196b() {
        return this.f32240a;
    }

    /* renamed from: c */
    public Boolean mo29197c() {
        return this.f32242c;
    }

    /* access modifiers changed from: protected */
    public C10785e0.C10786a getDataTableObjectType() {
        return C10785e0.C10786a.QuarantineRule;
    }

    public String toJsonString() {
        try {
            return "{,\"id\":" + C11051p3.m40518c(this.f32240a) + ",\"expirationTime\":" + this.f32241b + ",\"status\":" + this.f32242c + "}";
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
            return "";
        }
    }

    public C11204x5(JSONObject jSONObject) {
        try {
            if (jSONObject.has("id") && !jSONObject.isNull("id")) {
                this.f32240a = jSONObject.getString("id");
            }
            if (jSONObject.has("status") && !jSONObject.isNull("status")) {
                this.f32242c = Boolean.valueOf(jSONObject.getBoolean("status"));
            }
            if (jSONObject.has("expirationTime") && !jSONObject.isNull("expirationTime")) {
                this.f32241b = Long.valueOf(jSONObject.getLong("expirationTime"));
            }
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
        }
    }
}
