package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.measurement.internal.d */
public final class C4609d implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int O = SafeParcelReader.m15126O(parcel);
        String str = null;
        String str2 = null;
        zzlj zzlj = null;
        String str3 = null;
        zzaw zzaw = null;
        zzaw zzaw2 = null;
        zzaw zzaw3 = null;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        boolean z = false;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m15116E(parcel);
            switch (SafeParcelReader.m15151w(E)) {
                case 2:
                    str = SafeParcelReader.m15144p(parcel2, E);
                    break;
                case 3:
                    str2 = SafeParcelReader.m15144p(parcel2, E);
                    break;
                case 4:
                    zzlj = (zzlj) SafeParcelReader.m15143o(parcel2, E, zzlj.CREATOR);
                    break;
                case 5:
                    j = SafeParcelReader.m15121J(parcel2, E);
                    break;
                case 6:
                    z = SafeParcelReader.m15152x(parcel2, E);
                    break;
                case 7:
                    str3 = SafeParcelReader.m15144p(parcel2, E);
                    break;
                case 8:
                    zzaw = (zzaw) SafeParcelReader.m15143o(parcel2, E, zzaw.CREATOR);
                    break;
                case 9:
                    j2 = SafeParcelReader.m15121J(parcel2, E);
                    break;
                case 10:
                    zzaw2 = (zzaw) SafeParcelReader.m15143o(parcel2, E, zzaw.CREATOR);
                    break;
                case 11:
                    j3 = SafeParcelReader.m15121J(parcel2, E);
                    break;
                case 12:
                    zzaw3 = (zzaw) SafeParcelReader.m15143o(parcel2, E, zzaw.CREATOR);
                    break;
                default:
                    SafeParcelReader.m15125N(parcel2, E);
                    break;
            }
        }
        SafeParcelReader.m15150v(parcel2, O);
        return new zzac(str, str2, zzlj, j, z, str3, zzaw, j2, zzaw2, j3, zzaw3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzac[i];
    }
}
