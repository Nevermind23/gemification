package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.common.internal.m */
public final class C3975m implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m15126O(parcel);
        int i = 0;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m15116E(parcel);
            if (SafeParcelReader.m15151w(E) != 1) {
                SafeParcelReader.m15125N(parcel, E);
            } else {
                i = SafeParcelReader.m15118G(parcel, E);
            }
        }
        SafeParcelReader.m15150v(parcel, O);
        return new zzak(i);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzak[i];
    }
}
