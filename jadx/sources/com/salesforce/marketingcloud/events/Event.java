package com.salesforce.marketingcloud.events;

import com.salesforce.marketingcloud.MCKeep;
import com.salesforce.marketingcloud.sfmcsdk.components.events.Event;
import java.util.Map;

@MCKeep
public interface Event {
    Map<String, Object> attributes();

    Event.Producer getProducer();

    String name();

    void track();
}
