package com.salesforce.marketingcloud.internal;

import com.salesforce.marketingcloud.MarketingCloudConfig;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: com.salesforce.marketingcloud.internal.e */
public final class C11501e {

    /* renamed from: a */
    public static final C11502a f33422a = new C11502a((DefaultConstructorMarker) null);

    /* renamed from: com.salesforce.marketingcloud.internal.e$a */
    public static final class C11502a {
        private C11502a() {
        }

        public /* synthetic */ C11502a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final boolean mo30066a(MarketingCloudConfig marketingCloudConfig, MarketingCloudConfig marketingCloudConfig2) {
            C41536l.m120489i(marketingCloudConfig, "self");
            C41536l.m120489i(marketingCloudConfig2, "other");
            return marketingCloudConfig.m124827applicationChanged(marketingCloudConfig2);
        }
    }

    /* renamed from: a */
    public static final boolean m42032a(MarketingCloudConfig marketingCloudConfig, MarketingCloudConfig marketingCloudConfig2) {
        return f33422a.mo30066a(marketingCloudConfig, marketingCloudConfig2);
    }
}
