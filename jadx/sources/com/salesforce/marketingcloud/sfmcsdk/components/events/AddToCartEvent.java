package com.salesforce.marketingcloud.sfmcsdk.components.events;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class AddToCartEvent extends CartEvent {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddToCartEvent(LineItem lineItem) {
        super("Add To Cart", C41339p.m119900e(lineItem), (DefaultConstructorMarker) null);
        C41536l.m120489i(lineItem, "lineItem");
    }
}
