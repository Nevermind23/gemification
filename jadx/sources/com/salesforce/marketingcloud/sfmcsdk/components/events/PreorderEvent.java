package com.salesforce.marketingcloud.sfmcsdk.components.events;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class PreorderEvent extends OrderEvent {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PreorderEvent(Order order) {
        super("Preorder", order, (DefaultConstructorMarker) null);
        C41536l.m120489i(order, "order");
    }
}
