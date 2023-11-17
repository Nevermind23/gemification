package com.google.android.gms.tapandpay.quickaccesswallet;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.tapandpay.quickaccesswallet.c */
public final class C4900c implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int O = SafeParcelReader.m15126O(parcel);
        String str = null;
        Bitmap bitmap = null;
        String str2 = null;
        WalletCardIntent[] walletCardIntentArr = null;
        CardIconMessage[] cardIconMessageArr = null;
        String str3 = null;
        long j = 0;
        long j2 = 0;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m15116E(parcel);
            switch (SafeParcelReader.m15151w(E)) {
                case 1:
                    str = SafeParcelReader.m15144p(parcel2, E);
                    break;
                case 2:
                    bitmap = (Bitmap) SafeParcelReader.m15143o(parcel2, E, Bitmap.CREATOR);
                    break;
                case 3:
                    str2 = SafeParcelReader.m15144p(parcel2, E);
                    break;
                case 4:
                    walletCardIntentArr = (WalletCardIntent[]) SafeParcelReader.m15148t(parcel2, E, WalletCardIntent.CREATOR);
                    break;
                case 5:
                    cardIconMessageArr = (CardIconMessage[]) SafeParcelReader.m15148t(parcel2, E, CardIconMessage.CREATOR);
                    break;
                case 6:
                    j = SafeParcelReader.m15121J(parcel2, E);
                    break;
                case 7:
                    j2 = SafeParcelReader.m15121J(parcel2, E);
                    break;
                case 8:
                    str3 = SafeParcelReader.m15144p(parcel2, E);
                    break;
                default:
                    SafeParcelReader.m15125N(parcel2, E);
                    break;
            }
        }
        SafeParcelReader.m15150v(parcel2, O);
        return new QuickAccessWalletCard(str, bitmap, str2, walletCardIntentArr, cardIconMessageArr, j, j2, str3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new QuickAccessWalletCard[i];
    }
}
