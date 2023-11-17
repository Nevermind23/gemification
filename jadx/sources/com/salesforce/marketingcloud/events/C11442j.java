package com.salesforce.marketingcloud.events;

import com.salesforce.marketingcloud.MarketingCloudSdk;
import com.salesforce.marketingcloud.sfmcsdk.components.events.Event;
import kotlin.jvm.internal.C41536l;

/* renamed from: com.salesforce.marketingcloud.events.j */
public abstract /* synthetic */ class C11442j {
    /* renamed from: a */
    public static Event.Producer m41838a(Event event) {
        return Event.Producer.PUSH;
    }

    /* renamed from: b */
    public static void m41839b(Event event) {
        MarketingCloudSdk.requestSdk(new C11441i(event));
    }

    /* renamed from: c */
    public static void m41840c(Event event, MarketingCloudSdk marketingCloudSdk) {
        C41536l.m120489i(event, "this$0");
        C41536l.m120489i(marketingCloudSdk, "it");
        marketingCloudSdk.getEventManager().track(event);
    }
}
