package com.salesforce.marketingcloud.events;

import com.salesforce.marketingcloud.MarketingCloudSdk;

/* renamed from: com.salesforce.marketingcloud.events.i */
public final /* synthetic */ class C11441i implements MarketingCloudSdk.WhenReadyListener {

    /* renamed from: a */
    public final /* synthetic */ Event f33290a;

    public /* synthetic */ C11441i(Event event) {
        this.f33290a = event;
    }

    public final void ready(MarketingCloudSdk marketingCloudSdk) {
        C11442j.m41840c(this.f33290a, marketingCloudSdk);
    }
}
