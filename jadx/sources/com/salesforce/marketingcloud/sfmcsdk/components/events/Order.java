package com.salesforce.marketingcloud.sfmcsdk.components.events;

import com.salesforce.marketingcloud.storage.p385db.C11772k;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class Order {
    private final Map<String, Object> attributes;
    private final String currency;

    /* renamed from: id */
    private final String f34061id;
    private final List<LineItem> lineItems;
    private final Double totalValue;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public Order(String str) {
        this(str, (List) null, (Double) null, (String) null, (Map) null, 30, (DefaultConstructorMarker) null);
        C41536l.m120489i(str, "id");
    }

    public static /* synthetic */ Order copy$default(Order order, String str, List<LineItem> list, Double d, String str2, Map<String, Object> map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = order.f34061id;
        }
        if ((i & 2) != 0) {
            list = order.lineItems;
        }
        List<LineItem> list2 = list;
        if ((i & 4) != 0) {
            d = order.totalValue;
        }
        Double d2 = d;
        if ((i & 8) != 0) {
            str2 = order.currency;
        }
        String str3 = str2;
        if ((i & 16) != 0) {
            map = order.attributes;
        }
        return order.copy(str, list2, d2, str3, map);
    }

    public final String component1() {
        return this.f34061id;
    }

    public final List<LineItem> component2() {
        return this.lineItems;
    }

    public final Double component3() {
        return this.totalValue;
    }

    public final String component4() {
        return this.currency;
    }

    public final Map<String, Object> component5() {
        return this.attributes;
    }

    public final Order copy(String str, List<LineItem> list, Double d, String str2, Map<String, ? extends Object> map) {
        C41536l.m120489i(str, "id");
        C41536l.m120489i(list, "lineItems");
        C41536l.m120489i(map, C11772k.C11773a.f34176h);
        return new Order(str, list, d, str2, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Order)) {
            return false;
        }
        Order order = (Order) obj;
        return C41536l.m120484d(this.f34061id, order.f34061id) && C41536l.m120484d(this.lineItems, order.lineItems) && C41536l.m120484d(this.totalValue, order.totalValue) && C41536l.m120484d(this.currency, order.currency) && C41536l.m120484d(this.attributes, order.attributes);
    }

    public final Map<String, Object> getAttributes() {
        return this.attributes;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getId() {
        return this.f34061id;
    }

    public final List<LineItem> getLineItems() {
        return this.lineItems;
    }

    public final Double getTotalValue() {
        return this.totalValue;
    }

    public int hashCode() {
        int hashCode = ((this.f34061id.hashCode() * 31) + this.lineItems.hashCode()) * 31;
        Double d = this.totalValue;
        int i = 0;
        int hashCode2 = (hashCode + (d == null ? 0 : d.hashCode())) * 31;
        String str = this.currency;
        if (str != null) {
            i = str.hashCode();
        }
        return ((hashCode2 + i) * 31) + this.attributes.hashCode();
    }

    public String toString() {
        return "Order(id=" + this.f34061id + ", lineItems=" + this.lineItems + ", totalValue=" + this.totalValue + ", currency=" + this.currency + ", attributes=" + this.attributes + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public Order(String str, List<LineItem> list) {
        this(str, list, (Double) null, (String) null, (Map) null, 28, (DefaultConstructorMarker) null);
        C41536l.m120489i(str, "id");
        C41536l.m120489i(list, "lineItems");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public Order(String str, List<LineItem> list, Double d) {
        this(str, list, d, (String) null, (Map) null, 24, (DefaultConstructorMarker) null);
        C41536l.m120489i(str, "id");
        C41536l.m120489i(list, "lineItems");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public Order(String str, List<LineItem> list, Double d, String str2) {
        this(str, list, d, str2, (Map) null, 16, (DefaultConstructorMarker) null);
        C41536l.m120489i(str, "id");
        C41536l.m120489i(list, "lineItems");
    }

    public Order(String str, List<LineItem> list, Double d, String str2, Map<String, ? extends Object> map) {
        C41536l.m120489i(str, "id");
        C41536l.m120489i(list, "lineItems");
        C41536l.m120489i(map, C11772k.C11773a.f34176h);
        this.f34061id = str;
        this.lineItems = list;
        this.totalValue = d;
        this.currency = str2;
        this.attributes = map;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Order(String str, List list, Double d, String str2, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? C41341q.m119907j() : list, (i & 4) != 0 ? null : d, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? C41344r0.m119928j() : map);
    }
}
