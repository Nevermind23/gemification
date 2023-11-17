package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p143k6.C6823e;
import p183n7.C7305e0;
import p195o6.C7461a;

public final class LocationSettingsResult extends AbstractSafeParcelable implements C6823e {
    public static final Parcelable.Creator<LocationSettingsResult> CREATOR = new C7305e0();

    /* renamed from: d */
    private final Status f13934d;

    /* renamed from: e */
    private final LocationSettingsStates f13935e;

    public LocationSettingsResult(Status status, LocationSettingsStates locationSettingsStates) {
        this.f13934d = status;
        this.f13935e = locationSettingsStates;
    }

    public Status getStatus() {
        return this.f13934d;
    }

    /* renamed from: v */
    public LocationSettingsStates mo13952v() {
        return this.f13935e;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28390v(parcel, 1, getStatus(), i, false);
        C7461a.m28390v(parcel, 2, mo13952v(), i, false);
        C7461a.m28370b(parcel, a);
    }
}
