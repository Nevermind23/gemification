package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.maps.model.j */
public final class C4568j implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m15126O(parcel);
        float f = 0.0f;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        StampStyle stampStyle = null;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m15116E(parcel);
            int w = SafeParcelReader.m15151w(E);
            if (w == 2) {
                f = SafeParcelReader.m15114C(parcel, E);
            } else if (w == 3) {
                i = SafeParcelReader.m15118G(parcel, E);
            } else if (w == 4) {
                i2 = SafeParcelReader.m15118G(parcel, E);
            } else if (w == 5) {
                z = SafeParcelReader.m15152x(parcel, E);
            } else if (w != 6) {
                SafeParcelReader.m15125N(parcel, E);
            } else {
                stampStyle = (StampStyle) SafeParcelReader.m15143o(parcel, E, StampStyle.CREATOR);
            }
        }
        SafeParcelReader.m15150v(parcel, O);
        return new StrokeStyle(f, i, i2, z, stampStyle);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new StrokeStyle[i];
    }
}
