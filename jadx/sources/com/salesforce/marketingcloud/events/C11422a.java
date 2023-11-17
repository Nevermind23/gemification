package com.salesforce.marketingcloud.events;

import com.salesforce.marketingcloud.sfmcsdk.components.events.Event;
import java.util.Map;

/* renamed from: com.salesforce.marketingcloud.events.a */
public final class C11422a implements Event {
    public Map<String, Object> attributes() {
        return C41344r0.m119928j();
    }

    public /* synthetic */ Event.Producer getProducer() {
        return C11442j.m41838a(this);
    }

    public String name() {
        return "$appOpen";
    }

    public /* synthetic */ void track() {
        C11442j.m41839b(this);
    }
}
