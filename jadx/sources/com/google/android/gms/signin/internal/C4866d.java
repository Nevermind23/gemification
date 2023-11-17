package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.zat;

/* renamed from: com.google.android.gms.signin.internal.d */
public final class C4866d implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m15126O(parcel);
        int i = 0;
        zat zat = null;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m15116E(parcel);
            int w = SafeParcelReader.m15151w(E);
            if (w == 1) {
                i = SafeParcelReader.m15118G(parcel, E);
            } else if (w != 2) {
                SafeParcelReader.m15125N(parcel, E);
            } else {
                zat = (zat) SafeParcelReader.m15143o(parcel, E, zat.CREATOR);
            }
        }
        SafeParcelReader.m15150v(parcel, O);
        return new zai(i, zat);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zai[i];
    }
}
