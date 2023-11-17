package com.google.android.gms.tapandpay.issuer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.tapandpay.issuer.h */
public final class C4895h implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m15126O(parcel);
        String str = null;
        int i = 0;
        boolean z = false;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m15116E(parcel);
            int w = SafeParcelReader.m15151w(E);
            if (w == 2) {
                str = SafeParcelReader.m15144p(parcel, E);
            } else if (w == 3) {
                i = SafeParcelReader.m15118G(parcel, E);
            } else if (w != 4) {
                SafeParcelReader.m15125N(parcel, E);
            } else {
                z = SafeParcelReader.m15152x(parcel, E);
            }
        }
        SafeParcelReader.m15150v(parcel, O);
        return new TokenStatus(str, i, z);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new TokenStatus[i];
    }
}
