package com.google.android.gms.tapandpay.quickaccesswallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.tapandpay.quickaccesswallet.a */
public final class C4898a implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m15126O(parcel);
        int[] iArr = null;
        int i = 0;
        String str = null;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m15116E(parcel);
            int w = SafeParcelReader.m15151w(E);
            if (w == 1) {
                iArr = SafeParcelReader.m15139k(parcel, E);
            } else if (w == 2) {
                i = SafeParcelReader.m15118G(parcel, E);
            } else if (w != 3) {
                SafeParcelReader.m15125N(parcel, E);
            } else {
                str = SafeParcelReader.m15144p(parcel, E);
            }
        }
        SafeParcelReader.m15150v(parcel, O);
        return new CardIconMessage(iArr, i, str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new CardIconMessage[i];
    }
}
