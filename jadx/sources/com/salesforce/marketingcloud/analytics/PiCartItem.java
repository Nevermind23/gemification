package com.salesforce.marketingcloud.analytics;

import android.os.Parcel;
import android.os.Parcelable;
import com.salesforce.marketingcloud.MCKeep;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;

@MCKeep
public final class PiCartItem implements Parcelable {
    public static final Parcelable.Creator<PiCartItem> CREATOR = new C11337b();
    public static final C11336a Companion = new C11336a((DefaultConstructorMarker) null);
    private final String item;
    private final double price;
    private final int quantity;
    private final String uniqueId;

    /* renamed from: com.salesforce.marketingcloud.analytics.PiCartItem$a */
    public static final class C11336a {
        private C11336a() {
        }

        public /* synthetic */ C11336a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final PiCartItem mo29730a(String str, int i, double d) {
            C41536l.m120489i(str, "item");
            return new PiCartItem(str, i, d);
        }

        /* renamed from: a */
        public final PiCartItem mo29731a(String str, int i, double d, String str2) {
            C41536l.m120489i(str, "item");
            return new PiCartItem(str, i, d, str2);
        }
    }

    /* renamed from: com.salesforce.marketingcloud.analytics.PiCartItem$b */
    public static final class C11337b implements Parcelable.Creator<PiCartItem> {
        /* renamed from: a */
        public final PiCartItem createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new PiCartItem(parcel.readString(), parcel.readInt(), parcel.readDouble(), parcel.readString());
        }

        /* renamed from: a */
        public final PiCartItem[] newArray(int i) {
            return new PiCartItem[i];
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PiCartItem(String str, int i, double d) {
        this(str, i, d, (String) null);
        C41536l.m120489i(str, "item");
    }

    public static /* synthetic */ PiCartItem copy$default(PiCartItem piCartItem, String str, int i, double d, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = piCartItem.item;
        }
        if ((i2 & 2) != 0) {
            i = piCartItem.quantity;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            d = piCartItem.price;
        }
        double d2 = d;
        if ((i2 & 8) != 0) {
            str2 = piCartItem.uniqueId;
        }
        return piCartItem.copy(str, i3, d2, str2);
    }

    public static final PiCartItem create(String str, int i, double d) {
        return Companion.mo29730a(str, i, d);
    }

    /* renamed from: -deprecated_item  reason: not valid java name */
    public final String m124846deprecated_item() {
        return this.item;
    }

    /* renamed from: -deprecated_price  reason: not valid java name */
    public final double m124847deprecated_price() {
        return this.price;
    }

    /* renamed from: -deprecated_quantity  reason: not valid java name */
    public final int m124848deprecated_quantity() {
        return this.quantity;
    }

    /* renamed from: -deprecated_uniqueId  reason: not valid java name */
    public final String m124849deprecated_uniqueId() {
        return this.uniqueId;
    }

    /* renamed from: -toJson  reason: not valid java name */
    public final JSONObject m124850toJson() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("item", item());
        jSONObject.put("quantity", quantity());
        jSONObject.put("price", price());
        if (uniqueId() != null) {
            jSONObject.put("unique_id", uniqueId());
        }
        return jSONObject;
    }

    public final String component1() {
        return this.item;
    }

    public final int component2() {
        return this.quantity;
    }

    public final double component3() {
        return this.price;
    }

    public final String component4() {
        return this.uniqueId;
    }

    public final PiCartItem copy(String str, int i, double d, String str2) {
        C41536l.m120489i(str, "item");
        return new PiCartItem(str, i, d, str2);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PiCartItem)) {
            return false;
        }
        PiCartItem piCartItem = (PiCartItem) obj;
        return C41536l.m120484d(this.item, piCartItem.item) && this.quantity == piCartItem.quantity && C41536l.m120484d(Double.valueOf(this.price), Double.valueOf(piCartItem.price)) && C41536l.m120484d(this.uniqueId, piCartItem.uniqueId);
    }

    public int hashCode() {
        int hashCode = ((((this.item.hashCode() * 31) + this.quantity) * 31) + Double.doubleToLongBits(this.price)) * 31;
        String str = this.uniqueId;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String item() {
        return this.item;
    }

    public final double price() {
        return this.price;
    }

    public final int quantity() {
        return this.quantity;
    }

    public String toString() {
        return "PiCartItem(item=" + this.item + ", quantity=" + this.quantity + ", price=" + this.price + ", uniqueId=" + this.uniqueId + ')';
    }

    public final String uniqueId() {
        return this.uniqueId;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeString(this.item);
        parcel.writeInt(this.quantity);
        parcel.writeDouble(this.price);
        parcel.writeString(this.uniqueId);
    }

    public PiCartItem(String str, int i, double d, String str2) {
        C41536l.m120489i(str, "item");
        this.item = str;
        this.quantity = i;
        this.price = d;
        this.uniqueId = str2;
    }

    public static final PiCartItem create(String str, int i, double d, String str2) {
        return Companion.mo29731a(str, i, d, str2);
    }
}
