package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.location.k */
public final class C4537k implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m15126O(parcel);
        long j = Long.MAX_VALUE;
        int i = 0;
        boolean z = false;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m15116E(parcel);
            int w = SafeParcelReader.m15151w(E);
            if (w == 1) {
                j = SafeParcelReader.m15121J(parcel, E);
            } else if (w == 2) {
                i = SafeParcelReader.m15118G(parcel, E);
            } else if (w != 3) {
                SafeParcelReader.m15125N(parcel, E);
            } else {
                z = SafeParcelReader.m15152x(parcel, E);
            }
        }
        SafeParcelReader.m15150v(parcel, O);
        return new LastLocationRequest(j, i, z);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new LastLocationRequest[i];
    }
}
