package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p182n6.C7258g;
import p195o6.C7461a;
import p222q7.C7910o;

public class StreetViewPanoramaLink extends AbstractSafeParcelable {
    public static final Parcelable.Creator<StreetViewPanoramaLink> CREATOR = new C7910o();

    /* renamed from: d */
    public final String f14129d;

    /* renamed from: e */
    public final float f14130e;

    public StreetViewPanoramaLink(String str, float f) {
        this.f14129d = str;
        this.f14130e = (((double) f) <= Utils.DOUBLE_EPSILON ? (f % 360.0f) + 360.0f : f) % 360.0f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreetViewPanoramaLink)) {
            return false;
        }
        StreetViewPanoramaLink streetViewPanoramaLink = (StreetViewPanoramaLink) obj;
        if (!this.f14129d.equals(streetViewPanoramaLink.f14129d) || Float.floatToIntBits(this.f14130e) != Float.floatToIntBits(streetViewPanoramaLink.f14130e)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C7258g.m27881b(this.f14129d, Float.valueOf(this.f14130e));
    }

    public String toString() {
        return C7258g.m27882c(this).mo21632a("panoId", this.f14129d).mo21632a("bearing", Float.valueOf(this.f14130e)).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28392x(parcel, 2, this.f14129d, false);
        C7461a.m28380l(parcel, 3, this.f14130e);
        C7461a.m28370b(parcel, a);
    }
}
