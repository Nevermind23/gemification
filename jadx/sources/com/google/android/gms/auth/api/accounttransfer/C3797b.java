package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.auth.api.accounttransfer.b */
public final class C3797b implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m15126O(parcel);
        int i = 0;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        ArrayList arrayList4 = null;
        ArrayList arrayList5 = null;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m15116E(parcel);
            switch (SafeParcelReader.m15151w(E)) {
                case 1:
                    i = SafeParcelReader.m15118G(parcel, E);
                    break;
                case 2:
                    arrayList = SafeParcelReader.m15146r(parcel, E);
                    break;
                case 3:
                    arrayList2 = SafeParcelReader.m15146r(parcel, E);
                    break;
                case 4:
                    arrayList3 = SafeParcelReader.m15146r(parcel, E);
                    break;
                case 5:
                    arrayList4 = SafeParcelReader.m15146r(parcel, E);
                    break;
                case 6:
                    arrayList5 = SafeParcelReader.m15146r(parcel, E);
                    break;
                default:
                    SafeParcelReader.m15125N(parcel, E);
                    break;
            }
        }
        SafeParcelReader.m15150v(parcel, O);
        return new zzs(i, arrayList, arrayList2, arrayList3, arrayList4, arrayList5);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzs[i];
    }
}
