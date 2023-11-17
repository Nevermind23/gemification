package com.salesforce.marketingcloud.analytics;

import android.os.Parcel;
import android.os.Parcelable;
import com.salesforce.marketingcloud.C11461g;
import com.salesforce.marketingcloud.MCKeep;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONArray;
import org.json.JSONException;
import ue1.C43064a;

@MCKeep
public final class PiCart implements Parcelable {
    public static final Parcelable.Creator<PiCart> CREATOR = new C11334b();
    public static final C11333a Companion = new C11333a((DefaultConstructorMarker) null);
    private final List<PiCartItem> cartItems;

    /* renamed from: com.salesforce.marketingcloud.analytics.PiCart$a */
    public static final class C11333a {
        private C11333a() {
        }

        public /* synthetic */ C11333a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final PiCart mo29705a(List<PiCartItem> list) {
            C41536l.m120489i(list, "cartItems");
            return new PiCart(list);
        }
    }

    /* renamed from: com.salesforce.marketingcloud.analytics.PiCart$b */
    public static final class C11334b implements Parcelable.Creator<PiCart> {
        /* renamed from: a */
        public final PiCart createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(PiCartItem.CREATOR.createFromParcel(parcel));
            }
            return new PiCart(arrayList);
        }

        /* renamed from: a */
        public final PiCart[] newArray(int i) {
            return new PiCart[i];
        }
    }

    /* renamed from: com.salesforce.marketingcloud.analytics.PiCart$c */
    static final class C11335c extends C41537m implements C43064a {

        /* renamed from: a */
        public static final C11335c f32958a = new C11335c();

        C11335c() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Failed to convert List<PiCartItem> into JSONArray for PiCart payload.";
        }
    }

    public PiCart(List<PiCartItem> list) {
        C41536l.m120489i(list, "cartItems");
        this.cartItems = list;
    }

    public static /* synthetic */ PiCart copy$default(PiCart piCart, List<PiCartItem> list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = piCart.cartItems;
        }
        return piCart.copy(list);
    }

    public static final PiCart create(List<PiCartItem> list) {
        return Companion.mo29705a(list);
    }

    /* renamed from: -deprecated_cartItems  reason: not valid java name */
    public final List<PiCartItem> m124844deprecated_cartItems() {
        return this.cartItems;
    }

    /* renamed from: -toJson  reason: not valid java name */
    public final JSONArray m124845toJson() {
        JSONArray jSONArray = new JSONArray();
        try {
            for (PiCartItem r2 : cartItems()) {
                jSONArray.put(r2.m124850toJson());
            }
        } catch (JSONException e) {
            C11461g gVar = C11461g.f33306a;
            String str = AnalyticsManager.TAG;
            C41536l.m120488h(str, "TAG");
            gVar.mo29962b(str, (Throwable) e, (C43064a) C11335c.f32958a);
        }
        return jSONArray;
    }

    public final List<PiCartItem> cartItems() {
        return this.cartItems;
    }

    public final List<PiCartItem> component1() {
        return this.cartItems;
    }

    public final PiCart copy(List<PiCartItem> list) {
        C41536l.m120489i(list, "cartItems");
        return new PiCart(list);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PiCart) && C41536l.m120484d(this.cartItems, ((PiCart) obj).cartItems);
    }

    public int hashCode() {
        return this.cartItems.hashCode();
    }

    public String toString() {
        return "PiCart(cartItems=" + this.cartItems + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        List<PiCartItem> list = this.cartItems;
        parcel.writeInt(list.size());
        for (PiCartItem writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, i);
        }
    }
}
