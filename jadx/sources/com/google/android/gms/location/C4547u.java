package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.location.u */
public final class C4547u implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int O = SafeParcelReader.m15126O(parcel);
        WorkSource workSource = new WorkSource();
        long j = Long.MAX_VALUE;
        long j2 = Long.MAX_VALUE;
        int i = 0;
        boolean z = false;
        int i2 = 102;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m15116E(parcel);
            switch (SafeParcelReader.m15151w(E)) {
                case 1:
                    j = SafeParcelReader.m15121J(parcel2, E);
                    break;
                case 2:
                    i = SafeParcelReader.m15118G(parcel2, E);
                    break;
                case 3:
                    i2 = SafeParcelReader.m15118G(parcel2, E);
                    break;
                case 4:
                    j2 = SafeParcelReader.m15121J(parcel2, E);
                    break;
                case 5:
                    z = SafeParcelReader.m15152x(parcel2, E);
                    break;
                case 6:
                    workSource = (WorkSource) SafeParcelReader.m15143o(parcel2, E, WorkSource.CREATOR);
                    break;
                default:
                    SafeParcelReader.m15125N(parcel2, E);
                    break;
            }
        }
        SafeParcelReader.m15150v(parcel2, O);
        return new CurrentLocationRequest(j, i, i2, j2, z, workSource);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new CurrentLocationRequest[i];
    }
}
