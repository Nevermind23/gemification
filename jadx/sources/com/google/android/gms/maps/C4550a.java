package com.google.android.gms.maps;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLngBounds;

/* renamed from: com.google.android.gms.maps.a */
public final class C4550a implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int O = SafeParcelReader.m15126O(parcel);
        byte b = -1;
        byte b2 = -1;
        byte b3 = -1;
        byte b4 = -1;
        byte b5 = -1;
        byte b6 = -1;
        byte b7 = -1;
        byte b8 = -1;
        byte b9 = -1;
        byte b12 = -1;
        byte b13 = -1;
        byte b14 = -1;
        int i = 0;
        CameraPosition cameraPosition = null;
        Float f = null;
        Float f2 = null;
        LatLngBounds latLngBounds = null;
        Integer num = null;
        String str = null;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m15116E(parcel);
            switch (SafeParcelReader.m15151w(E)) {
                case 2:
                    b = SafeParcelReader.m15154z(parcel2, E);
                    break;
                case 3:
                    b2 = SafeParcelReader.m15154z(parcel2, E);
                    break;
                case 4:
                    i = SafeParcelReader.m15118G(parcel2, E);
                    break;
                case 5:
                    cameraPosition = (CameraPosition) SafeParcelReader.m15143o(parcel2, E, CameraPosition.CREATOR);
                    break;
                case 6:
                    b3 = SafeParcelReader.m15154z(parcel2, E);
                    break;
                case 7:
                    b4 = SafeParcelReader.m15154z(parcel2, E);
                    break;
                case 8:
                    b5 = SafeParcelReader.m15154z(parcel2, E);
                    break;
                case 9:
                    b6 = SafeParcelReader.m15154z(parcel2, E);
                    break;
                case 10:
                    b7 = SafeParcelReader.m15154z(parcel2, E);
                    break;
                case 11:
                    b8 = SafeParcelReader.m15154z(parcel2, E);
                    break;
                case 12:
                    b9 = SafeParcelReader.m15154z(parcel2, E);
                    break;
                case 14:
                    b12 = SafeParcelReader.m15154z(parcel2, E);
                    break;
                case 15:
                    b13 = SafeParcelReader.m15154z(parcel2, E);
                    break;
                case 16:
                    f = SafeParcelReader.m15115D(parcel2, E);
                    break;
                case 17:
                    f2 = SafeParcelReader.m15115D(parcel2, E);
                    break;
                case 18:
                    latLngBounds = (LatLngBounds) SafeParcelReader.m15143o(parcel2, E, LatLngBounds.CREATOR);
                    break;
                case 19:
                    b14 = SafeParcelReader.m15154z(parcel2, E);
                    break;
                case 20:
                    num = SafeParcelReader.m15119H(parcel2, E);
                    break;
                case 21:
                    str = SafeParcelReader.m15144p(parcel2, E);
                    break;
                default:
                    SafeParcelReader.m15125N(parcel2, E);
                    break;
            }
        }
        SafeParcelReader.m15150v(parcel2, O);
        return new GoogleMapOptions(b, b2, i, cameraPosition, b3, b4, b5, b6, b7, b8, b9, b12, b13, f, f2, latLngBounds, b14, num, str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new GoogleMapOptions[i];
    }
}
