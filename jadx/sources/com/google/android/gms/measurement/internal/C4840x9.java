package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.measurement.internal.x9 */
public final class C4840x9 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int O = SafeParcelReader.m15126O(parcel);
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        long j5 = 0;
        long j6 = 0;
        boolean z = false;
        int i = 0;
        boolean z2 = false;
        boolean z3 = false;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        Boolean bool = null;
        ArrayList arrayList = null;
        String str8 = null;
        String str9 = null;
        String str10 = "";
        String str11 = str10;
        boolean z4 = true;
        boolean z5 = true;
        long j7 = -2147483648L;
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
                    str3 = SafeParcelReader.m15144p(parcel2, E);
                    break;
                case 5:
                    str4 = SafeParcelReader.m15144p(parcel2, E);
                    break;
                case 6:
                    j = SafeParcelReader.m15121J(parcel2, E);
                    break;
                case 7:
                    j2 = SafeParcelReader.m15121J(parcel2, E);
                    break;
                case 8:
                    str5 = SafeParcelReader.m15144p(parcel2, E);
                    break;
                case 9:
                    z4 = SafeParcelReader.m15152x(parcel2, E);
                    break;
                case 10:
                    z = SafeParcelReader.m15152x(parcel2, E);
                    break;
                case 11:
                    j7 = SafeParcelReader.m15121J(parcel2, E);
                    break;
                case 12:
                    str6 = SafeParcelReader.m15144p(parcel2, E);
                    break;
                case 13:
                    j3 = SafeParcelReader.m15121J(parcel2, E);
                    break;
                case 14:
                    j4 = SafeParcelReader.m15121J(parcel2, E);
                    break;
                case 15:
                    i = SafeParcelReader.m15118G(parcel2, E);
                    break;
                case 16:
                    z5 = SafeParcelReader.m15152x(parcel2, E);
                    break;
                case 18:
                    z2 = SafeParcelReader.m15152x(parcel2, E);
                    break;
                case 19:
                    str7 = SafeParcelReader.m15144p(parcel2, E);
                    break;
                case 21:
                    bool = SafeParcelReader.m15153y(parcel2, E);
                    break;
                case 22:
                    j5 = SafeParcelReader.m15121J(parcel2, E);
                    break;
                case 23:
                    arrayList = SafeParcelReader.m15146r(parcel2, E);
                    break;
                case 24:
                    str8 = SafeParcelReader.m15144p(parcel2, E);
                    break;
                case 25:
                    str10 = SafeParcelReader.m15144p(parcel2, E);
                    break;
                case 26:
                    str11 = SafeParcelReader.m15144p(parcel2, E);
                    break;
                case 27:
                    str9 = SafeParcelReader.m15144p(parcel2, E);
                    break;
                case 28:
                    z3 = SafeParcelReader.m15152x(parcel2, E);
                    break;
                case 29:
                    j6 = SafeParcelReader.m15121J(parcel2, E);
                    break;
                default:
                    SafeParcelReader.m15125N(parcel2, E);
                    break;
            }
        }
        SafeParcelReader.m15150v(parcel2, O);
        return new zzq(str, str2, str3, str4, j, j2, str5, z4, z, j7, str6, j3, j4, i, z5, z2, str7, bool, j5, (List) arrayList, str8, str10, str11, str9, z3, j6);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzq[i];
    }
}
