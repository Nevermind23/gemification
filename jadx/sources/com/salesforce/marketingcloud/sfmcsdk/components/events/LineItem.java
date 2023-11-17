package com.salesforce.marketingcloud.sfmcsdk.components.events;

import com.salesforce.marketingcloud.storage.p385db.C11772k;
import java.util.Map;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class LineItem {
    private Map<String, ? extends Object> attributes;
    private final String catalogObjectId;
    private final String catalogObjectType;
    private String currency;
    private Double price;
    private final int quantity;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public LineItem(String str, String str2, int i) {
        this(str, str2, i, (Double) null, (String) null, (Map) null, 56, (DefaultConstructorMarker) null);
        C41536l.m120489i(str, "catalogObjectType");
        C41536l.m120489i(str2, "catalogObjectId");
    }

    public static /* synthetic */ LineItem copy$default(LineItem lineItem, String str, String str2, int i, Double d, String str3, Map<String, ? extends Object> map, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = lineItem.catalogObjectType;
        }
        if ((i2 & 2) != 0) {
            str2 = lineItem.catalogObjectId;
        }
        String str4 = str2;
        if ((i2 & 4) != 0) {
            i = lineItem.quantity;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            d = lineItem.price;
        }
        Double d2 = d;
        if ((i2 & 16) != 0) {
            str3 = lineItem.currency;
        }
        String str5 = str3;
        if ((i2 & 32) != 0) {
            map = lineItem.attributes;
        }
        return lineItem.copy(str, str4, i3, d2, str5, map);
    }

    public final String component1() {
        return this.catalogObjectType;
    }

    public final String component2() {
        return this.catalogObjectId;
    }

    public final int component3() {
        return this.quantity;
    }

    public final Double component4() {
        return this.price;
    }

    public final String component5() {
        return this.currency;
    }

    public final Map<String, Object> component6() {
        return this.attributes;
    }

    public final LineItem copy(String str, String str2, int i, Double d, String str3, Map<String, ? extends Object> map) {
        C41536l.m120489i(str, "catalogObjectType");
        C41536l.m120489i(str2, "catalogObjectId");
        C41536l.m120489i(map, C11772k.C11773a.f34176h);
        return new LineItem(str, str2, i, d, str3, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LineItem)) {
            return false;
        }
        LineItem lineItem = (LineItem) obj;
        return C41536l.m120484d(this.catalogObjectType, lineItem.catalogObjectType) && C41536l.m120484d(this.catalogObjectId, lineItem.catalogObjectId) && this.quantity == lineItem.quantity && C41536l.m120484d(this.price, lineItem.price) && C41536l.m120484d(this.currency, lineItem.currency) && C41536l.m120484d(this.attributes, lineItem.attributes);
    }

    public final Map<String, Object> getAttributes() {
        return this.attributes;
    }

    public final String getCatalogObjectId() {
        return this.catalogObjectId;
    }

    public final String getCatalogObjectType() {
        return this.catalogObjectType;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final Double getPrice() {
        return this.price;
    }

    public final int getQuantity() {
        return this.quantity;
    }

    public int hashCode() {
        int hashCode = ((((this.catalogObjectType.hashCode() * 31) + this.catalogObjectId.hashCode()) * 31) + this.quantity) * 31;
        Double d = this.price;
        int i = 0;
        int hashCode2 = (hashCode + (d == null ? 0 : d.hashCode())) * 31;
        String str = this.currency;
        if (str != null) {
            i = str.hashCode();
        }
        return ((hashCode2 + i) * 31) + this.attributes.hashCode();
    }

    public final void setAttributes(Map<String, ? extends Object> map) {
        C41536l.m120489i(map, "<set-?>");
        this.attributes = map;
    }

    public final void setCurrency(String str) {
        this.currency = str;
    }

    public final void setPrice(Double d) {
        this.price = d;
    }

    public String toString() {
        return "LineItem(catalogObjectType=" + this.catalogObjectType + ", catalogObjectId=" + this.catalogObjectId + ", quantity=" + this.quantity + ", price=" + this.price + ", currency=" + this.currency + ", attributes=" + this.attributes + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public LineItem(String str, String str2, int i, Double d) {
        this(str, str2, i, d, (String) null, (Map) null, 48, (DefaultConstructorMarker) null);
        C41536l.m120489i(str, "catalogObjectType");
        C41536l.m120489i(str2, "catalogObjectId");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public LineItem(String str, String str2, int i, Double d, String str3) {
        this(str, str2, i, d, str3, (Map) null, 32, (DefaultConstructorMarker) null);
        C41536l.m120489i(str, "catalogObjectType");
        C41536l.m120489i(str2, "catalogObjectId");
    }

    public LineItem(String str, String str2, int i, Double d, String str3, Map<String, ? extends Object> map) {
        C41536l.m120489i(str, "catalogObjectType");
        C41536l.m120489i(str2, "catalogObjectId");
        C41536l.m120489i(map, C11772k.C11773a.f34176h);
        this.catalogObjectType = str;
        this.catalogObjectId = str2;
        this.quantity = i;
        this.price = d;
        this.currency = str3;
        this.attributes = map;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LineItem(String str, String str2, int i, Double d, String str3, Map map, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, i, (i2 & 8) != 0 ? null : d, (i2 & 16) != 0 ? null : str3, (i2 & 32) != 0 ? C41344r0.m119928j() : map);
    }
}
