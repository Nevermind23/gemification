package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.maps.model.d */
public final class C4562d implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int O = SafeParcelReader.m15126O(parcel);
        LatLng latLng = null;
        ArrayList arrayList = null;
        double d = 0.0d;
        float f = 0.0f;
        float f2 = 0.0f;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m15116E(parcel);
            switch (SafeParcelReader.m15151w(E)) {
                case 2:
                    latLng = (LatLng) SafeParcelReader.m15143o(parcel2, E, LatLng.CREATOR);
                    break;
                case 3:
                    d = SafeParcelReader.m15112A(parcel2, E);
                    break;
                case 4:
                    f = SafeParcelReader.m15114C(parcel2, E);
                    break;
                case 5:
                    i = SafeParcelReader.m15118G(parcel2, E);
                    break;
                case 6:
                    i2 = SafeParcelReader.m15118G(parcel2, E);
                    break;
                case 7:
                    f2 = SafeParcelReader.m15114C(parcel2, E);
                    break;
                case 8:
                    z = SafeParcelReader.m15152x(parcel2, E);
                    break;
                case 9:
                    z2 = SafeParcelReader.m15152x(parcel2, E);
                    break;
                case 10:
                    arrayList = SafeParcelReader.m15149u(parcel2, E, PatternItem.CREATOR);
                    break;
                default:
                    SafeParcelReader.m15125N(parcel2, E);
                    break;
            }
        }
        SafeParcelReader.m15150v(parcel2, O);
        return new CircleOptions(latLng, d, f, i, i2, f2, z, z2, arrayList);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new CircleOptions[i];
    }
}
