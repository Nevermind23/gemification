package com.salesforce.marketingcloud.sfmcsdk.components.events;

import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

public abstract class CartEvent extends EngagementEvent {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final List<LineItem> lineItems;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AddToCartEvent add(LineItem lineItem) {
            C41536l.m120489i(lineItem, "lineItem");
            try {
                return new AddToCartEvent(lineItem);
            } catch (Exception unused) {
                return null;
            }
        }

        public final RemoveFromCartEvent remove(LineItem lineItem) {
            C41536l.m120489i(lineItem, "lineItem");
            try {
                return new RemoveFromCartEvent(lineItem);
            } catch (Exception unused) {
                return null;
            }
        }

        public final ReplaceCartEvent replace(List<LineItem> list) {
            C41536l.m120489i(list, "lineItems");
            try {
                return new ReplaceCartEvent(list);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    public /* synthetic */ CartEvent(String str, List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list);
    }

    public static final AddToCartEvent add(LineItem lineItem) {
        return Companion.add(lineItem);
    }

    public static final RemoveFromCartEvent remove(LineItem lineItem) {
        return Companion.remove(lineItem);
    }

    public static final ReplaceCartEvent replace(List<LineItem> list) {
        return Companion.replace(list);
    }

    public final List<LineItem> getLineItems() {
        return this.lineItems;
    }

    private CartEvent(String str, List<LineItem> list) {
        super(str, (DefaultConstructorMarker) null);
        this.lineItems = list;
    }
}
