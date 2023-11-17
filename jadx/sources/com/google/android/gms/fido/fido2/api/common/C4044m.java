package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.fido.fido2.api.common.m */
public final class C4044m implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m15126O(parcel);
        int i = 0;
        short s = 0;
        short s2 = 0;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m15116E(parcel);
            int w = SafeParcelReader.m15151w(E);
            if (w == 1) {
                i = SafeParcelReader.m15118G(parcel, E);
            } else if (w == 2) {
                s = SafeParcelReader.m15123L(parcel, E);
            } else if (w != 3) {
                SafeParcelReader.m15125N(parcel, E);
            } else {
                s2 = SafeParcelReader.m15123L(parcel, E);
            }
        }
        SafeParcelReader.m15150v(parcel, O);
        return new UvmEntry(i, s, s2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new UvmEntry[i];
    }
}
