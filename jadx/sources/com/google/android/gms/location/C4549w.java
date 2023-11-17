package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.location.w */
public final class C4549w implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int O = SafeParcelReader.m15126O(parcel);
        boolean z = true;
        long j = 50;
        float f = 0.0f;
        long j2 = Long.MAX_VALUE;
        int i = Integer.MAX_VALUE;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m15116E(parcel);
            int w = SafeParcelReader.m15151w(E);
            if (w == 1) {
                z = SafeParcelReader.m15152x(parcel2, E);
            } else if (w == 2) {
                j = SafeParcelReader.m15121J(parcel2, E);
            } else if (w == 3) {
                f = SafeParcelReader.m15114C(parcel2, E);
            } else if (w == 4) {
                j2 = SafeParcelReader.m15121J(parcel2, E);
            } else if (w != 5) {
                SafeParcelReader.m15125N(parcel2, E);
            } else {
                i = SafeParcelReader.m15118G(parcel2, E);
            }
        }
        SafeParcelReader.m15150v(parcel2, O);
        return new zzw(z, j, f, j2, i);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzw[i];
    }
}
