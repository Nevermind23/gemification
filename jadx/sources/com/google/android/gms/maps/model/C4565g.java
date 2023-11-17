package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.maps.model.g */
public final class C4565g implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m15126O(parcel);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = null;
        float f = 0.0f;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        int i3 = 0;
        float f2 = 0.0f;
        ArrayList arrayList3 = null;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m15116E(parcel);
            switch (SafeParcelReader.m15151w(E)) {
                case 2:
                    arrayList3 = SafeParcelReader.m15149u(parcel, E, LatLng.CREATOR);
                    break;
                case 3:
                    SafeParcelReader.m15120I(parcel, E, arrayList, C4565g.class.getClassLoader());
                    break;
                case 4:
                    f2 = SafeParcelReader.m15114C(parcel, E);
                    break;
                case 5:
                    i = SafeParcelReader.m15118G(parcel, E);
                    break;
                case 6:
                    i2 = SafeParcelReader.m15118G(parcel, E);
                    break;
                case 7:
                    f = SafeParcelReader.m15114C(parcel, E);
                    break;
                case 8:
                    z = SafeParcelReader.m15152x(parcel, E);
                    break;
                case 9:
                    z2 = SafeParcelReader.m15152x(parcel, E);
                    break;
                case 10:
                    z3 = SafeParcelReader.m15152x(parcel, E);
                    break;
                case 11:
                    i3 = SafeParcelReader.m15118G(parcel, E);
                    break;
                case 12:
                    arrayList2 = SafeParcelReader.m15149u(parcel, E, PatternItem.CREATOR);
                    break;
                default:
                    SafeParcelReader.m15125N(parcel, E);
                    break;
            }
        }
        SafeParcelReader.m15150v(parcel, O);
        return new PolygonOptions(arrayList3, arrayList, f2, i, i2, f, z, z2, z3, i3, arrayList2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new PolygonOptions[i];
    }
}
