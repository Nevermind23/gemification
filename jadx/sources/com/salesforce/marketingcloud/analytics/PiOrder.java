package com.salesforce.marketingcloud.analytics;

import android.os.Parcel;
import android.os.Parcelable;
import com.salesforce.marketingcloud.MCKeep;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;

@MCKeep
public final class PiOrder implements Parcelable {
    public static final Parcelable.Creator<PiOrder> CREATOR = new C11339b();
    public static final C11338a Companion = new C11338a((DefaultConstructorMarker) null);
    private final PiCart cart;
    private final double discount;
    private final String orderNumber;
    private final double shipping;

    /* renamed from: com.salesforce.marketingcloud.analytics.PiOrder$a */
    public static final class C11338a {
        private C11338a() {
        }

        public /* synthetic */ C11338a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final PiOrder mo29755a(PiCart piCart, String str, double d, double d2) {
            C41536l.m120489i(piCart, "cart");
            C41536l.m120489i(str, "orderNumber");
            return new PiOrder(piCart, str, d, d2);
        }
    }

    /* renamed from: com.salesforce.marketingcloud.analytics.PiOrder$b */
    public static final class C11339b implements Parcelable.Creator<PiOrder> {
        /* renamed from: a */
        public final PiOrder createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new PiOrder(PiCart.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readDouble(), parcel.readDouble());
        }

        /* renamed from: a */
        public final PiOrder[] newArray(int i) {
            return new PiOrder[i];
        }
    }

    public PiOrder(PiCart piCart, String str, double d, double d2) {
        C41536l.m120489i(piCart, "cart");
        C41536l.m120489i(str, "orderNumber");
        this.cart = piCart;
        this.orderNumber = str;
        this.shipping = d;
        this.discount = d2;
    }

    public static /* synthetic */ PiOrder copy$default(PiOrder piOrder, PiCart piCart, String str, double d, double d2, int i, Object obj) {
        if ((i & 1) != 0) {
            piCart = piOrder.cart;
        }
        if ((i & 2) != 0) {
            str = piOrder.orderNumber;
        }
        String str2 = str;
        if ((i & 4) != 0) {
            d = piOrder.shipping;
        }
        double d3 = d;
        if ((i & 8) != 0) {
            d2 = piOrder.discount;
        }
        return piOrder.copy(piCart, str2, d3, d2);
    }

    public static final PiOrder create(PiCart piCart, String str, double d, double d2) {
        return Companion.mo29755a(piCart, str, d, d2);
    }

    /* renamed from: -deprecated_cart  reason: not valid java name */
    public final PiCart m124851deprecated_cart() {
        return this.cart;
    }

    /* renamed from: -deprecated_discount  reason: not valid java name */
    public final double m124852deprecated_discount() {
        return this.discount;
    }

    /* renamed from: -deprecated_orderNumber  reason: not valid java name */
    public final String m124853deprecated_orderNumber() {
        return this.orderNumber;
    }

    /* renamed from: -deprecated_shipping  reason: not valid java name */
    public final double m124854deprecated_shipping() {
        return this.shipping;
    }

    /* renamed from: -toJson  reason: not valid java name */
    public final JSONObject m124855toJson() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("cart", cart().m124845toJson());
        jSONObject.put("order_number", orderNumber());
        jSONObject.put("shipping", shipping());
        jSONObject.put("discount", discount());
        return jSONObject;
    }

    public final PiCart cart() {
        return this.cart;
    }

    public final PiCart component1() {
        return this.cart;
    }

    public final String component2() {
        return this.orderNumber;
    }

    public final double component3() {
        return this.shipping;
    }

    public final double component4() {
        return this.discount;
    }

    public final PiOrder copy(PiCart piCart, String str, double d, double d2) {
        C41536l.m120489i(piCart, "cart");
        C41536l.m120489i(str, "orderNumber");
        return new PiOrder(piCart, str, d, d2);
    }

    public int describeContents() {
        return 0;
    }

    public final double discount() {
        return this.discount;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PiOrder)) {
            return false;
        }
        PiOrder piOrder = (PiOrder) obj;
        return C41536l.m120484d(this.cart, piOrder.cart) && C41536l.m120484d(this.orderNumber, piOrder.orderNumber) && C41536l.m120484d(Double.valueOf(this.shipping), Double.valueOf(piOrder.shipping)) && C41536l.m120484d(Double.valueOf(this.discount), Double.valueOf(piOrder.discount));
    }

    public int hashCode() {
        return (((((this.cart.hashCode() * 31) + this.orderNumber.hashCode()) * 31) + Double.doubleToLongBits(this.shipping)) * 31) + Double.doubleToLongBits(this.discount);
    }

    public final String orderNumber() {
        return this.orderNumber;
    }

    public final double shipping() {
        return this.shipping;
    }

    public String toString() {
        return "PiOrder(cart=" + this.cart + ", orderNumber=" + this.orderNumber + ", shipping=" + this.shipping + ", discount=" + this.discount + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        this.cart.writeToParcel(parcel, i);
        parcel.writeString(this.orderNumber);
        parcel.writeDouble(this.shipping);
        parcel.writeDouble(this.discount);
    }
}
