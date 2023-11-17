package com.medallia.digital.mobilesdk;

import com.salesforce.marketingcloud.storage.p385db.C11769i;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.medallia.digital.mobilesdk.g */
class C10819g {

    /* renamed from: a */
    private String f30973a;

    /* renamed from: b */
    private String f30974b;

    /* renamed from: c */
    private HashMap<String, String> f30975c;

    C10819g(JSONObject jSONObject) {
        try {
            if (jSONObject.has(C11769i.C11770a.f34149l) && !jSONObject.isNull(C11769i.C11770a.f34149l)) {
                this.f30973a = jSONObject.getString(C11769i.C11770a.f34149l);
            }
            if (jSONObject.has("requestType") && !jSONObject.isNull("requestType")) {
                this.f30974b = jSONObject.getString("requestType");
            }
            if (jSONObject.has("headers") && !jSONObject.isNull("headers")) {
                this.f30975c = ModelFactory.getInstance().getStringMap(jSONObject.getJSONObject("headers"));
            }
        } catch (JSONException e) {
            C10735b4.m39111c(e.getMessage());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public HashMap<String, String> mo28322a() {
        return this.f30975c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public String mo28323b() {
        return this.f30974b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public String mo28324c() {
        return this.f30973a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public String mo28325d() {
        try {
            return "{\"url\":" + C11051p3.m40518c(this.f30973a) + ",\"requestType\":" + C11051p3.m40518c(this.f30974b) + ",\"headers\":" + ModelFactory.getInstance().getStringMapAsJsonString(this.f30975c) + "}";
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
            return "";
        }
    }
}
