package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.location.zzw;
import java.util.List;

/* renamed from: com.google.android.gms.internal.location.l */
public final class C4084l implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m15126O(parcel);
        zzw zzw = zzh.f13127h;
        List list = zzh.f13126g;
        String str = null;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m15116E(parcel);
            int w = SafeParcelReader.m15151w(E);
            if (w == 1) {
                zzw = (zzw) SafeParcelReader.m15143o(parcel, E, zzw.CREATOR);
            } else if (w == 2) {
                list = SafeParcelReader.m15149u(parcel, E, ClientIdentity.CREATOR);
            } else if (w != 3) {
                SafeParcelReader.m15125N(parcel, E);
            } else {
                str = SafeParcelReader.m15144p(parcel, E);
            }
        }
        SafeParcelReader.m15150v(parcel, O);
        return new zzh(zzw, list, str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzh[i];
    }
}
