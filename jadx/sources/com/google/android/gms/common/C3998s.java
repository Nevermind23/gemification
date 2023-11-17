package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.common.s */
public final class C3998s implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m15126O(parcel);
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        String str = null;
        IBinder iBinder = null;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m15116E(parcel);
            switch (SafeParcelReader.m15151w(E)) {
                case 1:
                    str = SafeParcelReader.m15144p(parcel, E);
                    break;
                case 2:
                    z = SafeParcelReader.m15152x(parcel, E);
                    break;
                case 3:
                    z2 = SafeParcelReader.m15152x(parcel, E);
                    break;
                case 4:
                    iBinder = SafeParcelReader.m15117F(parcel, E);
                    break;
                case 5:
                    z3 = SafeParcelReader.m15152x(parcel, E);
                    break;
                case 6:
                    z4 = SafeParcelReader.m15152x(parcel, E);
                    break;
                default:
                    SafeParcelReader.m15125N(parcel, E);
                    break;
            }
        }
        SafeParcelReader.m15150v(parcel, O);
        return new zzo(str, z, z2, iBinder, z3, z4);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzo[i];
    }
}
