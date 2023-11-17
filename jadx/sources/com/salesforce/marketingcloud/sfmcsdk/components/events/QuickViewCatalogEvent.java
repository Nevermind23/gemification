package com.salesforce.marketingcloud.sfmcsdk.components.events;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class QuickViewCatalogEvent extends CatalogEvent {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public QuickViewCatalogEvent(CatalogObject catalogObject) {
        super("Quick View Catalog Object", catalogObject, (DefaultConstructorMarker) null);
        C41536l.m120489i(catalogObject, "catalogObject");
    }
}
