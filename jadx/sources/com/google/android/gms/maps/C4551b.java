package com.google.android.gms.maps;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;
import com.google.android.gms.maps.model.StreetViewSource;

/* renamed from: com.google.android.gms.maps.b */
public final class C4551b implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m15126O(parcel);
        StreetViewPanoramaCamera streetViewPanoramaCamera = null;
        String str = null;
        LatLng latLng = null;
        Integer num = null;
        StreetViewSource streetViewSource = null;
        byte b = 0;
        byte b2 = 0;
        byte b3 = 0;
        byte b4 = 0;
        byte b5 = 0;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m15116E(parcel);
            switch (SafeParcelReader.m15151w(E)) {
                case 2:
                    streetViewPanoramaCamera = (StreetViewPanoramaCamera) SafeParcelReader.m15143o(parcel, E, StreetViewPanoramaCamera.CREATOR);
                    break;
                case 3:
                    str = SafeParcelReader.m15144p(parcel, E);
                    break;
                case 4:
                    latLng = (LatLng) SafeParcelReader.m15143o(parcel, E, LatLng.CREATOR);
                    break;
                case 5:
                    num = SafeParcelReader.m15119H(parcel, E);
                    break;
                case 6:
                    b = SafeParcelReader.m15154z(parcel, E);
                    break;
                case 7:
                    b2 = SafeParcelReader.m15154z(parcel, E);
                    break;
                case 8:
                    b3 = SafeParcelReader.m15154z(parcel, E);
                    break;
                case 9:
                    b4 = SafeParcelReader.m15154z(parcel, E);
                    break;
                case 10:
                    b5 = SafeParcelReader.m15154z(parcel, E);
                    break;
                case 11:
                    streetViewSource = (StreetViewSource) SafeParcelReader.m15143o(parcel, E, StreetViewSource.CREATOR);
                    break;
                default:
                    SafeParcelReader.m15125N(parcel, E);
                    break;
            }
        }
        SafeParcelReader.m15150v(parcel, O);
        return new StreetViewPanoramaOptions(streetViewPanoramaCamera, str, latLng, num, b, b2, b3, b4, b5, streetViewSource);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new StreetViewPanoramaOptions[i];
    }
}
