package com.google.android.gms.tapandpay.quickaccesswallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.tapandpay.quickaccesswallet.f */
public final class C4903f implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m15126O(parcel);
        String str = null;
        String str2 = null;
        WalletCardIntentExtra[] walletCardIntentExtraArr = null;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m15116E(parcel);
            int w = SafeParcelReader.m15151w(E);
            if (w == 1) {
                str = SafeParcelReader.m15144p(parcel, E);
            } else if (w == 2) {
                str2 = SafeParcelReader.m15144p(parcel, E);
            } else if (w != 3) {
                SafeParcelReader.m15125N(parcel, E);
            } else {
                walletCardIntentExtraArr = (WalletCardIntentExtra[]) SafeParcelReader.m15148t(parcel, E, WalletCardIntentExtra.CREATOR);
            }
        }
        SafeParcelReader.m15150v(parcel, O);
        return new WalletCardIntent(str, str2, walletCardIntentExtraArr);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new WalletCardIntent[i];
    }
}
