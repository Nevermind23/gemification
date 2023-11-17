package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.internal.measurement.o1 */
public final class C4326o1 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int O = SafeParcelReader.m15126O(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        Bundle bundle = null;
        String str4 = null;
        boolean z = false;
        long j = 0;
        long j2 = 0;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m15116E(parcel);
            switch (SafeParcelReader.m15151w(E)) {
                case 1:
                    j = SafeParcelReader.m15121J(parcel2, E);
                    break;
                case 2:
                    j2 = SafeParcelReader.m15121J(parcel2, E);
                    break;
                case 3:
                    z = SafeParcelReader.m15152x(parcel2, E);
                    break;
                case 4:
                    str = SafeParcelReader.m15144p(parcel2, E);
                    break;
                case 5:
                    str2 = SafeParcelReader.m15144p(parcel2, E);
                    break;
                case 6:
                    str3 = SafeParcelReader.m15144p(parcel2, E);
                    break;
                case 7:
                    bundle = SafeParcelReader.m15134f(parcel2, E);
                    break;
                case 8:
                    str4 = SafeParcelReader.m15144p(parcel2, E);
                    break;
                default:
                    SafeParcelReader.m15125N(parcel2, E);
                    break;
            }
        }
        SafeParcelReader.m15150v(parcel2, O);
        return new zzcl(j, j2, z, str, str2, str3, bundle, str4);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzcl[i];
    }
}
