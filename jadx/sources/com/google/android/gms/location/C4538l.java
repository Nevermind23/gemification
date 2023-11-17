package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.location.l */
public final class C4538l implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int O = SafeParcelReader.m15126O(parcel);
        int i = 1000;
        int i2 = 1;
        int i3 = 1;
        long j = 0;
        zzbv[] zzbvArr = null;
        boolean z = false;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m15116E(parcel);
            switch (SafeParcelReader.m15151w(E)) {
                case 1:
                    i2 = SafeParcelReader.m15118G(parcel2, E);
                    break;
                case 2:
                    i3 = SafeParcelReader.m15118G(parcel2, E);
                    break;
                case 3:
                    j = SafeParcelReader.m15121J(parcel2, E);
                    break;
                case 4:
                    i = SafeParcelReader.m15118G(parcel2, E);
                    break;
                case 5:
                    zzbvArr = (zzbv[]) SafeParcelReader.m15148t(parcel2, E, zzbv.CREATOR);
                    break;
                case 6:
                    z = SafeParcelReader.m15152x(parcel2, E);
                    break;
                default:
                    SafeParcelReader.m15125N(parcel2, E);
                    break;
            }
        }
        SafeParcelReader.m15150v(parcel2, O);
        return new LocationAvailability(i, i2, i3, j, zzbvArr, z);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new LocationAvailability[i];
    }
}
