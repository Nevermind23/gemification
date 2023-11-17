package com.google.android.gms.internal.location;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.internal.location.m */
public final class C4085m implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m15126O(parcel);
        zzh zzh = null;
        int i = 1;
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m15116E(parcel);
            int w = SafeParcelReader.m15151w(E);
            if (w == 1) {
                i = SafeParcelReader.m15118G(parcel, E);
            } else if (w == 2) {
                zzh = (zzh) SafeParcelReader.m15143o(parcel, E, zzh.CREATOR);
            } else if (w == 3) {
                iBinder = SafeParcelReader.m15117F(parcel, E);
            } else if (w != 4) {
                SafeParcelReader.m15125N(parcel, E);
            } else {
                iBinder2 = SafeParcelReader.m15117F(parcel, E);
            }
        }
        SafeParcelReader.m15150v(parcel, O);
        return new zzj(i, zzh, iBinder, iBinder2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzj[i];
    }
}
