package com.salesforce.marketingcloud.sfmcsdk.components.events;

import com.salesforce.marketingcloud.sfmcsdk.components.events.Event;
import java.util.Map;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

public abstract class EngagementEvent extends Event {
    private Event.Category category;
    private final String name;

    public /* synthetic */ EngagementEvent(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public Map<String, Object> attributes() {
        return C41344r0.m119928j();
    }

    public Event.Category getCategory() {
        return this.category;
    }

    public String name() {
        return this.name;
    }

    public void setCategory(Event.Category category2) {
        C41536l.m120489i(category2, "<set-?>");
        this.category = category2;
    }

    private EngagementEvent(String str) {
        this.name = str;
        this.category = Event.Category.ENGAGEMENT;
    }
}
