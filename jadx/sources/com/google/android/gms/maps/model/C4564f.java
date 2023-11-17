package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.maps.model.f */
public final class C4564f implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int O = SafeParcelReader.m15126O(parcel);
        LatLng latLng = null;
        String str = null;
        String str2 = null;
        IBinder iBinder = null;
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        float f6 = 0.5f;
        float f7 = 1.0f;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m15116E(parcel);
            switch (SafeParcelReader.m15151w(E)) {
                case 2:
                    latLng = (LatLng) SafeParcelReader.m15143o(parcel2, E, LatLng.CREATOR);
                    break;
                case 3:
                    str = SafeParcelReader.m15144p(parcel2, E);
                    break;
                case 4:
                    str2 = SafeParcelReader.m15144p(parcel2, E);
                    break;
                case 5:
                    iBinder = SafeParcelReader.m15117F(parcel2, E);
                    break;
                case 6:
                    f = SafeParcelReader.m15114C(parcel2, E);
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
                    z3 = SafeParcelReader.m15152x(parcel2, E);
                    break;
                case 11:
                    f3 = SafeParcelReader.m15114C(parcel2, E);
                    break;
                case 12:
                    f6 = SafeParcelReader.m15114C(parcel2, E);
                    break;
                case 13:
                    f4 = SafeParcelReader.m15114C(parcel2, E);
                    break;
                case 14:
                    f7 = SafeParcelReader.m15114C(parcel2, E);
                    break;
                case 15:
                    f5 = SafeParcelReader.m15114C(parcel2, E);
                    break;
                default:
                    SafeParcelReader.m15125N(parcel2, E);
                    break;
            }
        }
        SafeParcelReader.m15150v(parcel2, O);
        return new MarkerOptions(latLng, str, str2, iBinder, f, f2, z, z2, z3, f3, f6, f4, f7, f5);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new MarkerOptions[i];
    }
}
