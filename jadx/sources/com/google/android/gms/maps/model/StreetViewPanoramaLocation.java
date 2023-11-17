package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p182n6.C7258g;
import p195o6.C7461a;
import p222q7.C7911p;

public class StreetViewPanoramaLocation extends AbstractSafeParcelable {
    public static final Parcelable.Creator<StreetViewPanoramaLocation> CREATOR = new C7911p();

    /* renamed from: d */
    public final StreetViewPanoramaLink[] f14131d;

    /* renamed from: e */
    public final LatLng f14132e;

    /* renamed from: f */
    public final String f14133f;

    public StreetViewPanoramaLocation(StreetViewPanoramaLink[] streetViewPanoramaLinkArr, LatLng latLng, String str) {
        this.f14131d = streetViewPanoramaLinkArr;
        this.f14132e = latLng;
        this.f14133f = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreetViewPanoramaLocation)) {
            return false;
        }
        StreetViewPanoramaLocation streetViewPanoramaLocation = (StreetViewPanoramaLocation) obj;
        if (!this.f14133f.equals(streetViewPanoramaLocation.f14133f) || !this.f14132e.equals(streetViewPanoramaLocation.f14132e)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C7258g.m27881b(this.f14132e, this.f14133f);
    }

    public String toString() {
        return C7258g.m27882c(this).mo21632a("panoId", this.f14133f).mo21632a("position", this.f14132e.toString()).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28363B(parcel, 2, this.f14131d, i, false);
        C7461a.m28390v(parcel, 3, this.f14132e, i, false);
        C7461a.m28392x(parcel, 4, this.f14133f, false);
        C7461a.m28370b(parcel, a);
    }
}
