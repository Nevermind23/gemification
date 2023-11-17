package com.salesforce.marketingcloud.sfmcsdk;

import com.salesforce.marketingcloud.sfmcsdk.SFMCSdk;
import com.salesforce.marketingcloud.sfmcsdk.components.events.Event;

/* renamed from: com.salesforce.marketingcloud.sfmcsdk.b */
public final /* synthetic */ class C11738b implements SFMCSdkReadyListener {

    /* renamed from: a */
    public final /* synthetic */ Event[] f34052a;

    public /* synthetic */ C11738b(Event[] eventArr) {
        this.f34052a = eventArr;
    }

    public final void ready(SFMCSdk sFMCSdk) {
        SFMCSdk.Companion.m125022track$lambda20(this.f34052a, sFMCSdk);
    }
}
