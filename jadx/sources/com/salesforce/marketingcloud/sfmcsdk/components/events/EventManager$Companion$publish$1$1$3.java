package com.salesforce.marketingcloud.sfmcsdk.components.events;

import kotlin.jvm.internal.C41537m;
import ue1.C43064a;

final class EventManager$Companion$publish$1$1$3 extends C41537m implements C43064a {
    final /* synthetic */ Event[] $events;
    final /* synthetic */ EventSubscriber $subscriber;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    EventManager$Companion$publish$1$1$3(Event[] eventArr, EventSubscriber eventSubscriber) {
        super(0);
        this.$events = eventArr;
        this.$subscriber = eventSubscriber;
    }

    public final String invoke() {
        return "Failed to publish event(s) " + this.$events + " to subscriber " + this.$subscriber + '.';
    }
}
