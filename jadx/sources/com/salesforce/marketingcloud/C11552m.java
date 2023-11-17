package com.salesforce.marketingcloud;

import com.salesforce.marketingcloud.MarketingCloudSdk;
import com.salesforce.marketingcloud.sfmcsdk.modules.ModuleReadyListener;

/* renamed from: com.salesforce.marketingcloud.m */
public final /* synthetic */ class C11552m implements MarketingCloudSdk.InitializationListener {

    /* renamed from: a */
    public final /* synthetic */ ModuleReadyListener f33531a;

    public /* synthetic */ C11552m(ModuleReadyListener moduleReadyListener) {
        this.f33531a = moduleReadyListener;
    }

    public final void complete(InitializationStatus initializationStatus) {
        MarketingCloudConfig.m124825init$lambda1(this.f33531a, initializationStatus);
    }
}
