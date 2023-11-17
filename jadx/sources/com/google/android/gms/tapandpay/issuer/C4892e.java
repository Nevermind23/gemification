package com.google.android.gms.tapandpay.issuer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.tapandpay.issuer.e */
public final class C4892e implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m15126O(parcel);
        int i = 0;
        int i2 = 0;
        boolean z = false;
        byte[] bArr = null;
        String str = null;
        String str2 = null;
        UserAddress userAddress = null;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m15116E(parcel);
            switch (SafeParcelReader.m15151w(E)) {
                case 2:
                    i = SafeParcelReader.m15118G(parcel, E);
                    break;
                case 3:
                    i2 = SafeParcelReader.m15118G(parcel, E);
                    break;
                case 4:
                    bArr = SafeParcelReader.m15135g(parcel, E);
                    break;
                case 5:
                    str = SafeParcelReader.m15144p(parcel, E);
                    break;
                case 6:
                    str2 = SafeParcelReader.m15144p(parcel, E);
                    break;
                case 7:
                    userAddress = (UserAddress) SafeParcelReader.m15143o(parcel, E, UserAddress.CREATOR);
                    break;
                case 8:
                    z = SafeParcelReader.m15152x(parcel, E);
                    break;
                default:
                    SafeParcelReader.m15125N(parcel, E);
                    break;
            }
        }
        SafeParcelReader.m15150v(parcel, O);
        return new PushTokenizeRequest(i, i2, bArr, str, str2, userAddress, z);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new PushTokenizeRequest[i];
    }
}
