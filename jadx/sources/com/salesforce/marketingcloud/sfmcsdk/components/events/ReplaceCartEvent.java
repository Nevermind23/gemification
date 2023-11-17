package com.salesforce.marketingcloud.sfmcsdk.components.events;

import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class ReplaceCartEvent extends CartEvent {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReplaceCartEvent(List<LineItem> list) {
        super("Replace Cart", list, (DefaultConstructorMarker) null);
        C41536l.m120489i(list, "lineItems");
    }
}
