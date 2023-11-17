package com.salesforce.marketingcloud.sfmcsdk.components.events;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class ShareCatalogEvent extends CatalogEvent {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShareCatalogEvent(CatalogObject catalogObject) {
        super("Share Catalog Object", catalogObject, (DefaultConstructorMarker) null);
        C41536l.m120489i(catalogObject, "catalogObject");
    }
}
