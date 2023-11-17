package com.medallia.digital.mobilesdk;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.medallia.digital.mobilesdk.e2 */
class C10789e2 {

    /* renamed from: a */
    private String f30894a;

    protected C10789e2(String str) {
        this.f30894a = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo28258a() {
        return this.f30894a;
    }

    protected C10789e2(JSONObject jSONObject) {
        try {
            if (jSONObject.has("feedback") && !jSONObject.isNull("feedback")) {
                this.f30894a = jSONObject.getString("feedback");
            }
        } catch (JSONException e) {
            C10735b4.m39111c(e.getMessage());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo28259a(String str) {
        this.f30894a = str;
    }
}
