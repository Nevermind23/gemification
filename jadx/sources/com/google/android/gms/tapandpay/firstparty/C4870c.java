package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.tapandpay.firstparty.c */
public final class C4870c implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int O = SafeParcelReader.m15126O(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        String str14 = null;
        String str15 = null;
        String str16 = null;
        String str17 = null;
        String str18 = null;
        String str19 = null;
        String str20 = null;
        long j = 0;
        int i = 0;
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
                    str5 = SafeParcelReader.m15144p(parcel2, E);
                    break;
                case 7:
                    str6 = SafeParcelReader.m15144p(parcel2, E);
                    break;
                case 8:
                    str7 = SafeParcelReader.m15144p(parcel2, E);
                    break;
                case 9:
                    str8 = SafeParcelReader.m15144p(parcel2, E);
                    break;
                case 10:
                    str9 = SafeParcelReader.m15144p(parcel2, E);
                    break;
                case 11:
                    str10 = SafeParcelReader.m15144p(parcel2, E);
                    break;
                case 12:
                    str11 = SafeParcelReader.m15144p(parcel2, E);
                    break;
                case 13:
                    str12 = SafeParcelReader.m15144p(parcel2, E);
                    break;
                case 14:
                    str13 = SafeParcelReader.m15144p(parcel2, E);
                    break;
                case 15:
                    j = SafeParcelReader.m15121J(parcel2, E);
                    break;
                case 16:
                    str14 = SafeParcelReader.m15144p(parcel2, E);
                    break;
                case 17:
                    str15 = SafeParcelReader.m15144p(parcel2, E);
                    break;
                case 18:
                    str16 = SafeParcelReader.m15144p(parcel2, E);
                    break;
                case 20:
                    str17 = SafeParcelReader.m15144p(parcel2, E);
                    break;
                case 21:
                    str18 = SafeParcelReader.m15144p(parcel2, E);
                    break;
                case 22:
                    str19 = SafeParcelReader.m15144p(parcel2, E);
                    break;
                case 23:
                    str20 = SafeParcelReader.m15144p(parcel2, E);
                    break;
                case 24:
                    i = SafeParcelReader.m15118G(parcel2, E);
                    break;
                default:
                    SafeParcelReader.m15125N(parcel2, E);
                    break;
            }
        }
        SafeParcelReader.m15150v(parcel2, O);
        return new zzaj(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, j, str14, str15, str16, str17, str18, str19, str20, i);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzaj[i];
    }
}
