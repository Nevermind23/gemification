package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.fido.u2f.api.common.b */
public final class C4058b implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m15126O(parcel);
        String str = null;
        int i = 0;
        String str2 = null;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m15116E(parcel);
            int w = SafeParcelReader.m15151w(E);
            if (w == 2) {
                i = SafeParcelReader.m15118G(parcel, E);
            } else if (w == 3) {
                str = SafeParcelReader.m15144p(parcel, E);
            } else if (w != 4) {
                SafeParcelReader.m15125N(parcel, E);
            } else {
                str2 = SafeParcelReader.m15144p(parcel, E);
            }
        }
        SafeParcelReader.m15150v(parcel, O);
        return new ChannelIdValue(i, str, str2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ChannelIdValue[i];
    }
}
