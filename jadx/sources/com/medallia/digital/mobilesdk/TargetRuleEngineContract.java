package com.medallia.digital.mobilesdk;

import com.salesforce.marketingcloud.storage.p385db.C11769i;
import org.json.JSONException;
import org.json.JSONObject;

class TargetRuleEngineContract extends C10875i0 {
    private String url;
    private String version;

    protected TargetRuleEngineContract(String str, String str2) {
        this.url = str;
        this.version = str2;
    }

    /* access modifiers changed from: protected */
    public String getUrl() {
        return this.url;
    }

    /* access modifiers changed from: protected */
    public String getVersion() {
        return this.version;
    }

    /* access modifiers changed from: protected */
    public String toJsonString() {
        try {
            return "{\"url\":" + C11051p3.m40518c(this.url) + ",\"version\":" + C11051p3.m40518c(this.version) + "}";
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
            return "";
        }
    }

    protected TargetRuleEngineContract(JSONObject jSONObject) {
        try {
            if (jSONObject.has(C11769i.C11770a.f34149l) && !jSONObject.isNull(C11769i.C11770a.f34149l)) {
                this.url = jSONObject.getString(C11769i.C11770a.f34149l);
            }
            if (jSONObject.has("version") && !jSONObject.isNull("version")) {
                this.version = jSONObject.getString("version");
            }
        } catch (JSONException e) {
            C10735b4.m39111c(e.getMessage());
        }
    }
}
