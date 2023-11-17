package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p182n6.C7258g;
import p195o6.C7461a;
import p222q7.C7903h;

public final class VisibleRegion extends AbstractSafeParcelable {
    public static final Parcelable.Creator<VisibleRegion> CREATOR = new C7903h();

    /* renamed from: d */
    public final LatLng f14162d;

    /* renamed from: e */
    public final LatLng f14163e;

    /* renamed from: f */
    public final LatLng f14164f;

    /* renamed from: g */
    public final LatLng f14165g;

    /* renamed from: h */
    public final LatLngBounds f14166h;

    public VisibleRegion(LatLng latLng, LatLng latLng2, LatLng latLng3, LatLng latLng4, LatLngBounds latLngBounds) {
        this.f14162d = latLng;
        this.f14163e = latLng2;
        this.f14164f = latLng3;
        this.f14165g = latLng4;
        this.f14166h = latLngBounds;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VisibleRegion)) {
            return false;
        }
        VisibleRegion visibleRegion = (VisibleRegion) obj;
        if (!this.f14162d.equals(visibleRegion.f14162d) || !this.f14163e.equals(visibleRegion.f14163e) || !this.f14164f.equals(visibleRegion.f14164f) || !this.f14165g.equals(visibleRegion.f14165g) || !this.f14166h.equals(visibleRegion.f14166h)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C7258g.m27881b(this.f14162d, this.f14163e, this.f14164f, this.f14165g, this.f14166h);
    }

    public String toString() {
        return C7258g.m27882c(this).mo21632a("nearLeft", this.f14162d).mo21632a("nearRight", this.f14163e).mo21632a("farLeft", this.f14164f).mo21632a("farRight", this.f14165g).mo21632a("latLngBounds", this.f14166h).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28390v(parcel, 2, this.f14162d, i, false);
        C7461a.m28390v(parcel, 3, this.f14163e, i, false);
        C7461a.m28390v(parcel, 4, this.f14164f, i, false);
        C7461a.m28390v(parcel, 5, this.f14165g, i, false);
        C7461a.m28390v(parcel, 6, this.f14166h, i, false);
        C7461a.m28370b(parcel, a);
    }
}
