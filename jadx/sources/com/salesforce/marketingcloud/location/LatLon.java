package com.salesforce.marketingcloud.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.salesforce.marketingcloud.MCKeep;
import com.salesforce.marketingcloud.storage.p385db.C11767h;
import kotlin.jvm.internal.C41536l;
import org.json.JSONObject;

@MCKeep
public final class LatLon implements Parcelable {
    public static final Parcelable.Creator<LatLon> CREATOR = new C11537a();
    private final double latitude;
    private final double longitude;

    /* renamed from: com.salesforce.marketingcloud.location.LatLon$a */
    public static final class C11537a implements Parcelable.Creator<LatLon> {
        /* renamed from: a */
        public final LatLon createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new LatLon(parcel.readDouble(), parcel.readDouble());
        }

        /* renamed from: a */
        public final LatLon[] newArray(int i) {
            return new LatLon[i];
        }
    }

    public LatLon(double d, double d2) {
        this.latitude = d;
        this.longitude = d2;
    }

    public static /* synthetic */ LatLon copy$default(LatLon latLon, double d, double d2, int i, Object obj) {
        if ((i & 1) != 0) {
            d = latLon.latitude;
        }
        if ((i & 2) != 0) {
            d2 = latLon.longitude;
        }
        return latLon.copy(d, d2);
    }

    /* renamed from: -deprecated_latitude  reason: not valid java name */
    public final double m124856deprecated_latitude() {
        return this.latitude;
    }

    /* renamed from: -deprecated_longitude  reason: not valid java name */
    public final double m124857deprecated_longitude() {
        return this.longitude;
    }

    public final double component1() {
        return this.latitude;
    }

    public final double component2() {
        return this.longitude;
    }

    public final LatLon copy(double d, double d2) {
        return new LatLon(d, d2);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLon)) {
            return false;
        }
        LatLon latLon = (LatLon) obj;
        return C41536l.m120484d(Double.valueOf(this.latitude), Double.valueOf(latLon.latitude)) && C41536l.m120484d(Double.valueOf(this.longitude), Double.valueOf(latLon.longitude));
    }

    public int hashCode() {
        return (Double.doubleToLongBits(this.latitude) * 31) + Double.doubleToLongBits(this.longitude);
    }

    public final double latitude() {
        return this.latitude;
    }

    public final double longitude() {
        return this.longitude;
    }

    public String toString() {
        return "LatLon(latitude=" + this.latitude + ", longitude=" + this.longitude + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeDouble(this.latitude);
        parcel.writeDouble(this.longitude);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public LatLon(JSONObject jSONObject) {
        this(jSONObject.getDouble(C11767h.C11768a.f34132b), jSONObject.getDouble(C11767h.C11768a.f34133c));
        C41536l.m120489i(jSONObject, "json");
    }
}
