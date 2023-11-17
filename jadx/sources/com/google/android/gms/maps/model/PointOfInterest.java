package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p195o6.C7461a;
import p222q7.C7908m;

public final class PointOfInterest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PointOfInterest> CREATOR = new C7908m();

    /* renamed from: d */
    public final LatLng f14098d;

    /* renamed from: e */
    public final String f14099e;

    /* renamed from: f */
    public final String f14100f;

    public PointOfInterest(LatLng latLng, String str, String str2) {
        this.f14098d = latLng;
        this.f14099e = str;
        this.f14100f = str2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28390v(parcel, 2, this.f14098d, i, false);
        C7461a.m28392x(parcel, 3, this.f14099e, false);
        C7461a.m28392x(parcel, 4, this.f14100f, false);
        C7461a.m28370b(parcel, a);
    }
}
