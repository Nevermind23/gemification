package com.salesforce.marketingcloud.sfmcsdk.components.events;

import com.salesforce.marketingcloud.sfmcsdk.components.events.Event;
import com.salesforce.marketingcloud.storage.p385db.C11772k;
import java.util.Map;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class CustomEvent extends Event {
    private final Map<String, Object> attributes;
    private final Event.Category category;
    private final String name;
    private final Event.Producer producer;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CustomEvent(String str, Map map, Event.Producer producer2, Event.Category category2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, map, (i & 4) != 0 ? Event.Producer.SFMC_SDK : producer2, (i & 8) != 0 ? Event.Category.ENGAGEMENT : category2);
    }

    public Map<String, Object> attributes() {
        return this.attributes;
    }

    public Event.Category getCategory() {
        return this.category;
    }

    public Event.Producer getProducer() {
        return this.producer;
    }

    public String name() {
        return this.name;
    }

    public String toString() {
        return "CustomEvent(name='" + this.name + "', producer=" + getProducer() + ", category=" + getCategory() + ", attributes=" + this.attributes + ')';
    }

    public CustomEvent(String str, Map<String, ? extends Object> map, Event.Producer producer2, Event.Category category2) {
        C41536l.m120489i(str, "name");
        C41536l.m120489i(map, C11772k.C11773a.f34176h);
        C41536l.m120489i(producer2, "producer");
        C41536l.m120489i(category2, "category");
        this.name = str;
        this.attributes = map;
        this.producer = producer2;
        this.category = category2;
    }
}
