package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.maps.model.h */
public final class C4566h implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int O = SafeParcelReader.m15126O(parcel);
        ArrayList arrayList = null;
        Cap cap = null;
        Cap cap2 = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        float f = 0.0f;
        float f2 = 0.0f;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        int i2 = 0;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m15116E(parcel);
            switch (SafeParcelReader.m15151w(E)) {
                case 2:
                    arrayList = SafeParcelReader.m15149u(parcel2, E, LatLng.CREATOR);
                    break;
                case 3:
                    f = SafeParcelReader.m15114C(parcel2, E);
                    break;
                case 4:
                    i = SafeParcelReader.m15118G(parcel2, E);
                    break;
                case 5:
                    f2 = SafeParcelReader.m15114C(parcel2, E);
                    break;
                case 6:
                    z = SafeParcelReader.m15152x(parcel2, E);
                    break;
                case 7:
                    z2 = SafeParcelReader.m15152x(parcel2, E);
                    break;
                case 8:
                    z3 = SafeParcelReader.m15152x(parcel2, E);
                    break;
                case 9:
                    cap = (Cap) SafeParcelReader.m15143o(parcel2, E, Cap.CREATOR);
                    break;
                case 10:
                    cap2 = (Cap) SafeParcelReader.m15143o(parcel2, E, Cap.CREATOR);
                    break;
                case 11:
                    i2 = SafeParcelReader.m15118G(parcel2, E);
                    break;
                case 12:
                    arrayList2 = SafeParcelReader.m15149u(parcel2, E, PatternItem.CREATOR);
                    break;
                case 13:
                    arrayList3 = SafeParcelReader.m15149u(parcel2, E, StyleSpan.CREATOR);
                    break;
                default:
                    SafeParcelReader.m15125N(parcel2, E);
                    break;
            }
        }
        SafeParcelReader.m15150v(parcel2, O);
        return new PolylineOptions(arrayList, f, i, f2, z, z2, z3, cap, cap2, i2, arrayList2, arrayList3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new PolylineOptions[i];
    }
}
