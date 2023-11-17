package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.maps.model.b */
public final class C4560b implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m15126O(parcel);
        IBinder iBinder = null;
        boolean z = false;
        float f = 0.0f;
        float f2 = 0.0f;
        boolean z2 = true;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m15116E(parcel);
            int w = SafeParcelReader.m15151w(E);
            if (w == 2) {
                iBinder = SafeParcelReader.m15117F(parcel, E);
            } else if (w == 3) {
                z = SafeParcelReader.m15152x(parcel, E);
            } else if (w == 4) {
                f = SafeParcelReader.m15114C(parcel, E);
            } else if (w == 5) {
                z2 = SafeParcelReader.m15152x(parcel, E);
            } else if (w != 6) {
                SafeParcelReader.m15125N(parcel, E);
            } else {
                f2 = SafeParcelReader.m15114C(parcel, E);
            }
        }
        SafeParcelReader.m15150v(parcel, O);
        return new TileOverlayOptions(iBinder, z, f, z2, f2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new TileOverlayOptions[i];
    }
}
