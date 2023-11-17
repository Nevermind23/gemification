package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p183n7.C7307f0;
import p195o6.C7461a;

public final class LocationSettingsStates extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LocationSettingsStates> CREATOR = new C7307f0();

    /* renamed from: d */
    private final boolean f13936d;

    /* renamed from: e */
    private final boolean f13937e;

    /* renamed from: f */
    private final boolean f13938f;

    /* renamed from: g */
    private final boolean f13939g;

    /* renamed from: h */
    private final boolean f13940h;

    /* renamed from: i */
    private final boolean f13941i;

    public LocationSettingsStates(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.f13936d = z;
        this.f13937e = z2;
        this.f13938f = z3;
        this.f13939g = z4;
        this.f13940h = z5;
        this.f13941i = z6;
    }

    /* renamed from: R */
    public boolean mo13954R() {
        return this.f13936d;
    }

    /* renamed from: f0 */
    public boolean mo13955f0() {
        return this.f13940h;
    }

    /* renamed from: q0 */
    public boolean mo13956q0() {
        return this.f13937e;
    }

    /* renamed from: v */
    public boolean mo13957v() {
        return this.f13941i;
    }

    /* renamed from: w */
    public boolean mo13958w() {
        return this.f13938f;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28372d(parcel, 1, mo13954R());
        C7461a.m28372d(parcel, 2, mo13956q0());
        C7461a.m28372d(parcel, 3, mo13958w());
        C7461a.m28372d(parcel, 4, mo13960x());
        C7461a.m28372d(parcel, 5, mo13955f0());
        C7461a.m28372d(parcel, 6, mo13957v());
        C7461a.m28370b(parcel, a);
    }

    /* renamed from: x */
    public boolean mo13960x() {
        return this.f13939g;
    }
}
