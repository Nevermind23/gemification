package com.google.android.gms.tapandpay.issuer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.tapandpay.issuer.g */
public final class C4894g implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m15126O(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m15116E(parcel);
            switch (SafeParcelReader.m15151w(E)) {
                case 1:
                    str = SafeParcelReader.m15144p(parcel, E);
                    break;
                case 2:
                    str2 = SafeParcelReader.m15144p(parcel, E);
                    break;
                case 3:
                    str3 = SafeParcelReader.m15144p(parcel, E);
                    break;
                case 4:
                    str4 = SafeParcelReader.m15144p(parcel, E);
                    break;
                case 5:
                    i = SafeParcelReader.m15118G(parcel, E);
                    break;
                case 6:
                    i2 = SafeParcelReader.m15118G(parcel, E);
                    break;
                case 7:
                    i3 = SafeParcelReader.m15118G(parcel, E);
                    break;
                case 8:
                    z = SafeParcelReader.m15152x(parcel, E);
                    break;
                case 9:
                    str5 = SafeParcelReader.m15144p(parcel, E);
                    break;
                default:
                    SafeParcelReader.m15125N(parcel, E);
                    break;
            }
        }
        SafeParcelReader.m15150v(parcel, O);
        return new TokenInfo(str, str2, str3, str4, i, i2, i3, z, str5);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new TokenInfo[i];
    }
}
