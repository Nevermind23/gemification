package com.salesforce.marketingcloud.analytics;

import org.json.JSONObject;

/* renamed from: com.salesforce.marketingcloud.analytics.l */
public interface C11366l {

    /* renamed from: com.salesforce.marketingcloud.analytics.l$a */
    public enum C11367a {
        SYNC_API("deviceSyncCallTimeMs"),
        TRIGGER_PROCESS("inAppMsgProcessingTimeMs");
        

        /* renamed from: a */
        private final String f33042a;

        private C11367a(String str) {
            this.f33042a = str;
        }

        /* renamed from: a */
        public String mo29808a() {
            return this.f33042a;
        }
    }

    /* renamed from: a */
    void mo29801a(C11367a aVar, JSONObject jSONObject);
}
