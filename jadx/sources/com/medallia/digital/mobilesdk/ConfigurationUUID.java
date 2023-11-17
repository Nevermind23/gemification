package com.medallia.digital.mobilesdk;

import com.salesforce.marketingcloud.storage.p385db.C11769i;
import org.json.JSONException;
import org.json.JSONObject;

class ConfigurationUUID {
    private String ocqUuid;
    private String url;
    private String uuid;

    ConfigurationUUID(JSONObject jSONObject) {
        try {
            if (jSONObject.has(C11769i.C11770a.f34149l)) {
                this.url = jSONObject.getString(C11769i.C11770a.f34149l);
            }
            if (jSONObject.has("uuid")) {
                this.uuid = jSONObject.getString("uuid");
            }
            if (jSONObject.has("ocqUUID")) {
                this.ocqUuid = jSONObject.getString("ocqUUID");
            }
        } catch (JSONException e) {
            C10735b4.m39111c(e.getMessage());
        }
    }

    /* access modifiers changed from: protected */
    public String getOcqUuid() {
        return this.ocqUuid;
    }

    /* access modifiers changed from: protected */
    public String getUrl() {
        return this.url;
    }

    /* access modifiers changed from: protected */
    public String getUuid() {
        return this.uuid;
    }

    /* access modifiers changed from: protected */
    public String toJsonString() {
        try {
            return "{\"url\":" + C11051p3.m40518c(this.url) + ",\"uuid\":" + C11051p3.m40518c(this.uuid) + ",\"ocqUUID\":" + C11051p3.m40518c(this.ocqUuid) + "}";
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
            return "";
        }
    }
}
