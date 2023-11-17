package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.auth.d */
public final class C3832d implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m15126O(parcel);
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        String str = null;
        Long l = null;
        ArrayList arrayList = null;
        String str2 = null;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m15116E(parcel);
            switch (SafeParcelReader.m15151w(E)) {
                case 1:
                    i = SafeParcelReader.m15118G(parcel, E);
                    break;
                case 2:
                    str = SafeParcelReader.m15144p(parcel, E);
                    break;
                case 3:
                    l = SafeParcelReader.m15122K(parcel, E);
                    break;
                case 4:
                    z = SafeParcelReader.m15152x(parcel, E);
                    break;
                case 5:
                    z2 = SafeParcelReader.m15152x(parcel, E);
                    break;
                case 6:
                    arrayList = SafeParcelReader.m15146r(parcel, E);
                    break;
                case 7:
                    str2 = SafeParcelReader.m15144p(parcel, E);
                    break;
                default:
                    SafeParcelReader.m15125N(parcel, E);
                    break;
            }
        }
        SafeParcelReader.m15150v(parcel, O);
        return new TokenData(i, str, l, z, z2, arrayList, str2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new TokenData[i];
    }
}
