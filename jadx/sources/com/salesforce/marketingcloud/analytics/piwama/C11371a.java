package com.salesforce.marketingcloud.analytics.piwama;

import android.text.TextUtils;
import com.salesforce.marketingcloud.C11461g;
import com.salesforce.marketingcloud.MarketingCloudConfig;
import com.salesforce.marketingcloud.storage.C11751c;
import com.salesforce.marketingcloud.storage.C11800j;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.salesforce.marketingcloud.analytics.piwama.a */
class C11371a extends C11385j {

    /* renamed from: v */
    private static final Object[] f33043v = {""};

    C11371a(MarketingCloudConfig marketingCloudConfig, C11800j jVar) {
        super(marketingCloudConfig, jVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public JSONObject mo29809a(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("api_key", "849f26e2-2df6-11e4-ab12-14109fdc48df");
            jSONObject2.put("app_id", this.f33096b.applicationId());
            String b = this.f33095a.mo31606c().mo31112b(C11751c.f34087g, (String) null);
            if (!TextUtils.isEmpty(b)) {
                jSONObject2.put("user_id", b);
            }
            String b2 = this.f33095a.mo31606c().mo31112b(C11751c.f34086f, (String) null);
            if (!TextUtils.isEmpty(b2)) {
                jSONObject2.put("session_id", b2);
            }
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("app_name", this.f33096b.appPackageName());
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
        return f33043v;
    }
}
