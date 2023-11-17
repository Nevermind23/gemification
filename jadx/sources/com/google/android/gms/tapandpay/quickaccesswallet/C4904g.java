package com.google.android.gms.tapandpay.quickaccesswallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.tapandpay.quickaccesswallet.g */
public final class C4904g implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m15126O(parcel);
        String str = null;
        String str2 = null;
        byte[] bArr = null;
        int i = 0;
        boolean z = false;
        int i2 = 0;
        long j = 0;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m15116E(parcel);
            switch (SafeParcelReader.m15151w(E)) {
                case 1:
                    str = SafeParcelReader.m15144p(parcel, E);
                    break;
                case 2:
                    i = SafeParcelReader.m15118G(parcel, E);
                    break;
                case 3:
                    str2 = SafeParcelReader.m15144p(parcel, E);
                    break;
                case 4:
                    bArr = SafeParcelReader.m15135g(parcel, E);
                    break;
                case 5:
                    z = SafeParcelReader.m15152x(parcel, E);
                    break;
                case 6:
                    i2 = SafeParcelReader.m15118G(parcel, E);
                    break;
                case 7:
                    j = SafeParcelReader.m15121J(parcel, E);
                    break;
                default:
                    SafeParcelReader.m15125N(parcel, E);
                    break;
            }
        }
        SafeParcelReader.m15150v(parcel, O);
        return new WalletCardIntentExtra(str, i, str2, bArr, z, i2, j);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new WalletCardIntentExtra[i];
    }
}
