package com.google.android.gms.tapandpay.quickaccesswallet;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.tapandpay.quickaccesswallet.b */
public final class C4899b implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m15126O(parcel);
        int i = 0;
        Account account = null;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m15116E(parcel);
            int w = SafeParcelReader.m15151w(E);
            if (w == 1) {
                i = SafeParcelReader.m15118G(parcel, E);
            } else if (w != 2) {
                SafeParcelReader.m15125N(parcel, E);
            } else {
                account = (Account) SafeParcelReader.m15143o(parcel, E, Account.CREATOR);
            }
        }
        SafeParcelReader.m15150v(parcel, O);
        return new GetQuickAccessWalletConfigRequest(i, account);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new GetQuickAccessWalletConfigRequest[i];
    }
}
