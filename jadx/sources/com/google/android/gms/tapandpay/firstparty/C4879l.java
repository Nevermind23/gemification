package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.tapandpay.firstparty.l */
public final class C4879l implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m15126O(parcel);
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m15116E(parcel);
            int w = SafeParcelReader.m15151w(E);
            if (w == 1) {
                z = SafeParcelReader.m15152x(parcel, E);
            } else if (w != 2) {
                SafeParcelReader.m15125N(parcel, E);
            } else {
                z2 = SafeParcelReader.m15152x(parcel, E);
            }
        }
        SafeParcelReader.m15150v(parcel, O);
        return new zzg(z, z2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzg[i];
    }
}
