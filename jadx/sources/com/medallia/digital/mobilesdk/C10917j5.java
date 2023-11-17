package com.medallia.digital.mobilesdk;

import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.medallia.digital.mobilesdk.j5 */
class C10917j5 {

    /* renamed from: a */
    private ArrayList<Component> f31361a = new ArrayList<>();

    protected C10917j5(JSONObject jSONObject) {
        try {
            if (jSONObject.has("components") && !jSONObject.isNull("components")) {
                this.f31361a = ModelFactory.getInstance().getComponentsArray(jSONObject.getJSONArray("components"));
            }
        } catch (JSONException e) {
            C10735b4.m39111c(e.getMessage());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public ArrayList<Component> mo28547a() {
        return this.f31361a;
    }
}
