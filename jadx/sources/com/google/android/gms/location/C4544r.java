package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.location.r */
public final class C4544r implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int O = SafeParcelReader.m15126O(parcel);
        long j = 0;
        long j2 = 0;
        boolean z = false;
        boolean z2 = false;
        WorkSource workSource = null;
        String str = null;
        int[] iArr = null;
        String str2 = null;
        String str3 = null;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m15116E(parcel);
            switch (SafeParcelReader.m15151w(E)) {
                case 1:
                    j = SafeParcelReader.m15121J(parcel2, E);
                    break;
                case 2:
                    z = SafeParcelReader.m15152x(parcel2, E);
                    break;
                case 3:
                    workSource = (WorkSource) SafeParcelReader.m15143o(parcel2, E, WorkSource.CREATOR);
                    break;
                case 4:
                    str = SafeParcelReader.m15144p(parcel2, E);
                    break;
                case 5:
                    iArr = SafeParcelReader.m15139k(parcel2, E);
                    break;
                case 6:
                    z2 = SafeParcelReader.m15152x(parcel2, E);
                    break;
                case 7:
                    str2 = SafeParcelReader.m15144p(parcel2, E);
                    break;
                case 8:
                    j2 = SafeParcelReader.m15121J(parcel2, E);
                    break;
                case 9:
                    str3 = SafeParcelReader.m15144p(parcel2, E);
                    break;
                default:
                    SafeParcelReader.m15125N(parcel2, E);
                    break;
            }
        }
        SafeParcelReader.m15150v(parcel2, O);
        return new zzl(j, z, workSource, str, iArr, z2, str2, j2, str3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzl[i];
    }
}
