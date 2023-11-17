package com.salesforce.marketingcloud.sfmcsdk.components.events;

import com.salesforce.marketingcloud.storage.p385db.C11772k;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class CatalogObject {
    private final Map<String, Object> attributes;

    /* renamed from: id */
    private final String f34059id;
    private final Map<String, List<String>> relatedCatalogObjects;
    private final String type;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CatalogObject(String str, String str2) {
        this(str, str2, (Map) null, (Map) null, 12, (DefaultConstructorMarker) null);
        C41536l.m120489i(str, "type");
        C41536l.m120489i(str2, "id");
    }

    public final Map<String, Object> getAttributes() {
        return this.attributes;
    }

    public final String getId() {
        return this.f34059id;
    }

    public final Map<String, List<String>> getRelatedCatalogObjects() {
        return this.relatedCatalogObjects;
    }

    public final String getType() {
        return this.type;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CatalogObject(String str, String str2, Map<String, ? extends Object> map) {
        this(str, str2, map, (Map) null, 8, (DefaultConstructorMarker) null);
        C41536l.m120489i(str, "type");
        C41536l.m120489i(str2, "id");
        C41536l.m120489i(map, C11772k.C11773a.f34176h);
    }

    public CatalogObject(String str, String str2, Map<String, ? extends Object> map, Map<String, ? extends List<String>> map2) {
        C41536l.m120489i(str, "type");
        C41536l.m120489i(str2, "id");
        C41536l.m120489i(map, C11772k.C11773a.f34176h);
        C41536l.m120489i(map2, "relatedCatalogObjects");
        this.type = str;
        this.f34059id = str2;
        this.attributes = map;
        this.relatedCatalogObjects = map2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CatalogObject(String str, String str2, Map map, Map map2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? C41344r0.m119928j() : map, (i & 8) != 0 ? C41344r0.m119928j() : map2);
    }
}
