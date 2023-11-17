package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.location.m */
public final class C4539m implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int O = SafeParcelReader.m15126O(parcel);
        int i = 102;
        long j = 3600000;
        long j2 = 600000;
        boolean z = false;
        boolean z2 = false;
        long j3 = Long.MAX_VALUE;
        int i2 = Integer.MAX_VALUE;
        float f = 0.0f;
        long j4 = 0;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m15116E(parcel);
            switch (SafeParcelReader.m15151w(E)) {
                case 1:
                    i = SafeParcelReader.m15118G(parcel2, E);
                    break;
                case 2:
                    j = SafeParcelReader.m15121J(parcel2, E);
                    break;
                case 3:
                    j2 = SafeParcelReader.m15121J(parcel2, E);
                    break;
                case 4:
                    z = SafeParcelReader.m15152x(parcel2, E);
                    break;
                case 5:
                    j3 = SafeParcelReader.m15121J(parcel2, E);
                    break;
                case 6:
                    i2 = SafeParcelReader.m15118G(parcel2, E);
                    break;
                case 7:
                    f = SafeParcelReader.m15114C(parcel2, E);
                    break;
                case 8:
                    j4 = SafeParcelReader.m15121J(parcel2, E);
                    break;
                case 9:
                    z2 = SafeParcelReader.m15152x(parcel2, E);
                    break;
                default:
                    SafeParcelReader.m15125N(parcel2, E);
                    break;
            }
        }
        SafeParcelReader.m15150v(parcel2, O);
        return new LocationRequest(i, j, j2, z, j3, i2, f, j4, z2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new LocationRequest[i];
    }
}
