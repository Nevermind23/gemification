package com.medallia.digital.mobilesdk;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.medallia.digital.mobilesdk.b2 */
class C10733b2 {

    /* renamed from: a */
    private String f30685a;

    /* renamed from: b */
    private boolean f30686b;

    /* renamed from: c */
    private ArrayList<String> f30687c;

    /* renamed from: d */
    private boolean f30688d;

    public C10733b2(String str, boolean z, ArrayList<String> arrayList, boolean z2) {
        this.f30685a = str;
        this.f30686b = z;
        this.f30687c = arrayList;
        this.f30688d = z2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo28111a() {
        return this.f30685a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public ArrayList<String> mo28112b() {
        return this.f30687c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo28113c() {
        return this.f30686b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo28114d() {
        return this.f30688d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public String mo28115e() {
        try {
            return "{\"eventName\":" + C11051p3.m40518c(this.f30685a) + ",\"analyticsEnabled\":" + this.f30686b + ",\"extraData\":" + ModelFactory.getInstance().getStringArrayAsJsonString(this.f30687c) + ",\"isSampling\":" + this.f30688d + "}";
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
            return "";
        }
    }

    C10733b2(JSONObject jSONObject) {
        try {
            if (jSONObject.has("eventName") && !jSONObject.isNull("eventName")) {
                this.f30685a = jSONObject.getString("eventName");
            }
            if (jSONObject.has("analyticsEnabled") && !jSONObject.isNull("analyticsEnabled")) {
                this.f30686b = jSONObject.getBoolean("analyticsEnabled");
            }
            if (jSONObject.has("extraData") && !jSONObject.isNull("extraData") && (jSONObject.get("extraData") instanceof JSONArray)) {
                this.f30687c = ModelFactory.getInstance().getStringArray(jSONObject.getJSONArray("extraData"));
            }
            if (jSONObject.has("isSampling") && !jSONObject.isNull("isSampling")) {
                this.f30688d = jSONObject.getBoolean("isSampling");
            }
        } catch (JSONException e) {
            C10735b4.m39111c(e.getMessage());
        }
    }
}
