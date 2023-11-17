package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p195o6.C7461a;
import p222q7.C7905j;

public final class LatLng extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<LatLng> CREATOR = new C7905j();

    /* renamed from: d */
    public final double f14073d;

    /* renamed from: e */
    public final double f14074e;

    public LatLng(double d, double d2) {
        if (d2 < -180.0d || d2 >= 180.0d) {
            this.f14074e = ((((d2 - 0.02490234375d) % 360.0d) + 360.0d) % 360.0d) - 0.02490234375d;
        } else {
            this.f14074e = d2;
        }
        this.f14073d = Math.max(-90.0d, Math.min(90.0d, d));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLng)) {
            return false;
        }
        LatLng latLng = (LatLng) obj;
        if (Double.doubleToLongBits(this.f14073d) == Double.doubleToLongBits(latLng.f14073d) && Double.doubleToLongBits(this.f14074e) == Double.doubleToLongBits(latLng.f14074e)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f14073d);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f14074e);
        return ((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) + 31) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
    }

    public String toString() {
        double d = this.f14073d;
        double d2 = this.f14074e;
        return "lat/lng: (" + d + "," + d2 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28378j(parcel, 2, this.f14073d);
        C7461a.m28378j(parcel, 3, this.f14074e);
        C7461a.m28370b(parcel, a);
    }
}
