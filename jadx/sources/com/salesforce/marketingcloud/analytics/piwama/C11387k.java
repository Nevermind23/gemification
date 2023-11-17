package com.salesforce.marketingcloud.analytics.piwama;

import android.text.TextUtils;
import com.salesforce.marketingcloud.C11461g;
import com.salesforce.marketingcloud.MarketingCloudConfig;
import com.salesforce.marketingcloud.storage.C11751c;
import com.salesforce.marketingcloud.storage.C11800j;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.salesforce.marketingcloud.analytics.piwama.k */
class C11387k extends C11385j {
    C11387k(MarketingCloudConfig marketingCloudConfig, C11800j jVar) {
        super(marketingCloudConfig, jVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public JSONObject mo29809a(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("app_name", this.f33096b.appPackageName());
            jSONObject3.put("app_id", this.f33096b.applicationId());
            String b = this.f33095a.mo31606c().mo31112b(C11751c.f34087g, (String) null);
            if (!TextUtils.isEmpty(b)) {
                jSONObject.put("user_id", b);
            }
            jSONObject3.put("user_info", jSONObject);
            jSONObject2.put("payload", jSONObject3);
            return jSONObject2;
        } catch (JSONException e) {
            C11461g.m41885b(C11379i.f33063m, e, "Failed to construct PiWama payload JSON Object.", new Object[0]);
            return new JSONObject();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public Object[] mo29810b() {
        return new Object[]{"?session_id=" + this.f33095a.mo31606c().mo31112b(C11751c.f34086f, "")};
    }
}
