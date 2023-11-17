package com.salesforce.marketingcloud.sfmcsdk.components.events;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class DeliverOrderEvent extends OrderEvent {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeliverOrderEvent(Order order) {
        super("Deliver", order, (DefaultConstructorMarker) null);
        C41536l.m120489i(order, "order");
    }
}
