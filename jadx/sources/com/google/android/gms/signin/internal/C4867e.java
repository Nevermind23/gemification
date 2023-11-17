package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.zav;

/* renamed from: com.google.android.gms.signin.internal.e */
public final class C4867e implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m15126O(parcel);
        int i = 0;
        ConnectionResult connectionResult = null;
        zav zav = null;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m15116E(parcel);
            int w = SafeParcelReader.m15151w(E);
            if (w == 1) {
                i = SafeParcelReader.m15118G(parcel, E);
            } else if (w == 2) {
                connectionResult = (ConnectionResult) SafeParcelReader.m15143o(parcel, E, ConnectionResult.CREATOR);
            } else if (w != 3) {
                SafeParcelReader.m15125N(parcel, E);
            } else {
                zav = (zav) SafeParcelReader.m15143o(parcel, E, zav.CREATOR);
            }
        }
        SafeParcelReader.m15150v(parcel, O);
        return new zak(i, connectionResult, zav);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zak[i];
    }
}
