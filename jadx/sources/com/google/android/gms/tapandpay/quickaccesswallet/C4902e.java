package com.google.android.gms.tapandpay.quickaccesswallet;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.tapandpay.quickaccesswallet.e */
public final class C4902e implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m15126O(parcel);
        int i = 0;
        Account account = null;
        QuickAccessWalletCard[] quickAccessWalletCardArr = null;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m15116E(parcel);
            int w = SafeParcelReader.m15151w(E);
            if (w == 1) {
                i = SafeParcelReader.m15118G(parcel, E);
            } else if (w == 2) {
                account = (Account) SafeParcelReader.m15143o(parcel, E, Account.CREATOR);
            } else if (w != 3) {
                SafeParcelReader.m15125N(parcel, E);
            } else {
                quickAccessWalletCardArr = (QuickAccessWalletCard[]) SafeParcelReader.m15148t(parcel, E, QuickAccessWalletCard.CREATOR);
            }
        }
        SafeParcelReader.m15150v(parcel, O);
        return new SetQuickAccessWalletCardsRequest(i, account, quickAccessWalletCardArr);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new SetQuickAccessWalletCardsRequest[i];
    }
}
