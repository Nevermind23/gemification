package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.tapandpay.firstparty.h */
public final class C4875h implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m15126O(parcel);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m15116E(parcel);
            int w = SafeParcelReader.m15151w(E);
            if (w == 2) {
                i = SafeParcelReader.m15118G(parcel, E);
            } else if (w == 3) {
                i2 = SafeParcelReader.m15118G(parcel, E);
            } else if (w == 4) {
                i3 = SafeParcelReader.m15118G(parcel, E);
            } else if (w != 5) {
                SafeParcelReader.m15125N(parcel, E);
            } else {
                i4 = SafeParcelReader.m15118G(parcel, E);
            }
        }
        SafeParcelReader.m15150v(parcel, O);
        return new zzaz(i, i2, i3, i4);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzaz[i];
    }
}
