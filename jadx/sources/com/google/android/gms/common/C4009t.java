package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.common.t */
public final class C4009t implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m15126O(parcel);
        boolean z = false;
        int i = 0;
        String str = null;
        int i2 = 0;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m15116E(parcel);
            int w = SafeParcelReader.m15151w(E);
            if (w == 1) {
                z = SafeParcelReader.m15152x(parcel, E);
            } else if (w == 2) {
                str = SafeParcelReader.m15144p(parcel, E);
            } else if (w == 3) {
                i2 = SafeParcelReader.m15118G(parcel, E);
            } else if (w != 4) {
                SafeParcelReader.m15125N(parcel, E);
            } else {
                i = SafeParcelReader.m15118G(parcel, E);
            }
        }
        SafeParcelReader.m15150v(parcel, O);
        return new zzq(z, str, i2, i);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzq[i];
    }
}
