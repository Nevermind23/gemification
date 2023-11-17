package com.salesforce.marketingcloud;

import com.salesforce.marketingcloud.MarketingCloudSdk;
import com.salesforce.marketingcloud.sfmcsdk.modules.ModuleReadyListener;

/* renamed from: com.salesforce.marketingcloud.l */
public final /* synthetic */ class C11536l implements MarketingCloudSdk.WhenReadyListener {

    /* renamed from: a */
    public final /* synthetic */ ModuleReadyListener f33481a;

    public /* synthetic */ C11536l(ModuleReadyListener moduleReadyListener) {
        this.f33481a = moduleReadyListener;
    }

    public final void ready(MarketingCloudSdk marketingCloudSdk) {
        MarketingCloudConfig.m124826init$lambda1$lambda0(this.f33481a, marketingCloudSdk);
    }
}
