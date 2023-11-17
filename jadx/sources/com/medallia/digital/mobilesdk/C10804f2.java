package com.medallia.digital.mobilesdk;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.medallia.digital.mobilesdk.f2 */
class C10804f2 {

    /* renamed from: a */
    private String f30941a;

    /* renamed from: b */
    private DynamicData f30942b;

    protected C10804f2(JSONObject jSONObject) {
        try {
            if (jSONObject.has("uuid") && !jSONObject.isNull("uuid")) {
                this.f30941a = jSONObject.getString("uuid");
            }
            if (jSONObject.has("dynamicData") && !jSONObject.isNull("dynamicData")) {
                this.f30942b = new DynamicData(jSONObject.getJSONObject("dynamicData"));
            }
        } catch (JSONException e) {
            C10735b4.m39111c(e.getMessage());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public DynamicData mo28296a() {
        return this.f30942b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public String mo28298b() {
        return this.f30941a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo28297a(String str) {
        this.f30941a = str;
    }
}
