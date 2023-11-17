package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.maps.model.i */
public final class C4567i implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m15126O(parcel);
        IBinder iBinder = null;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m15116E(parcel);
            if (SafeParcelReader.m15151w(E) != 2) {
                SafeParcelReader.m15125N(parcel, E);
            } else {
                iBinder = SafeParcelReader.m15117F(parcel, E);
            }
        }
        SafeParcelReader.m15150v(parcel, O);
        return new StampStyle(iBinder);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new StampStyle[i];
    }
}
