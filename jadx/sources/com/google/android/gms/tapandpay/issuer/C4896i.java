package com.google.android.gms.tapandpay.issuer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.tapandpay.issuer.i */
public final class C4896i implements Parcelable.Creator {
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
                    z = SafeParcelReader.m15152x(parcel2, E);
                    break;
                case 15:
                    str13 = SafeParcelReader.m15144p(parcel2, E);
                    break;
                case 16:
                    str14 = SafeParcelReader.m15144p(parcel2, E);
                    break;
                default:
                    SafeParcelReader.m15125N(parcel2, E);
                    break;
            }
        }
        SafeParcelReader.m15150v(parcel2, O);
        return new UserAddress(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, z, str13, str14);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new UserAddress[i];
    }
}
