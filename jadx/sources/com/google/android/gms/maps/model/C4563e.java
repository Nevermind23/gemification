package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.maps.model.e */
public final class C4563e implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int O = SafeParcelReader.m15126O(parcel);
        IBinder iBinder = null;
        LatLng latLng = null;
        LatLngBounds latLngBounds = null;
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        float f7 = 0.0f;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m15116E(parcel);
            switch (SafeParcelReader.m15151w(E)) {
                case 2:
                    iBinder = SafeParcelReader.m15117F(parcel2, E);
                    break;
                case 3:
                    latLng = (LatLng) SafeParcelReader.m15143o(parcel2, E, LatLng.CREATOR);
                    break;
                case 4:
                    f = SafeParcelReader.m15114C(parcel2, E);
                    break;
                case 5:
                    f2 = SafeParcelReader.m15114C(parcel2, E);
                    break;
                case 6:
                    latLngBounds = (LatLngBounds) SafeParcelReader.m15143o(parcel2, E, LatLngBounds.CREATOR);
                    break;
                case 7:
                    f3 = SafeParcelReader.m15114C(parcel2, E);
                    break;
                case 8:
                    f4 = SafeParcelReader.m15114C(parcel2, E);
                    break;
                case 9:
                    z = SafeParcelReader.m15152x(parcel2, E);
                    break;
                case 10:
                    f5 = SafeParcelReader.m15114C(parcel2, E);
                    break;
                case 11:
                    f6 = SafeParcelReader.m15114C(parcel2, E);
                    break;
                case 12:
                    f7 = SafeParcelReader.m15114C(parcel2, E);
                    break;
                case 13:
                    z2 = SafeParcelReader.m15152x(parcel2, E);
                    break;
                default:
                    SafeParcelReader.m15125N(parcel2, E);
                    break;
            }
        }
        SafeParcelReader.m15150v(parcel2, O);
        return new GroundOverlayOptions(iBinder, latLng, f, f2, latLngBounds, f3, f4, z, f5, f6, f7, z2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new GroundOverlayOptions[i];
    }
}
