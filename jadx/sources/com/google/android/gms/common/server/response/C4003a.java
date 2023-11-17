package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.server.converter.zaa;
import com.google.android.gms.common.server.response.FastJsonResponse;

/* renamed from: com.google.android.gms.common.server.response.a */
public final class C4003a implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m15126O(parcel);
        int i = 0;
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        boolean z2 = false;
        int i4 = 0;
        String str = null;
        String str2 = null;
        zaa zaa = null;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m15116E(parcel);
            switch (SafeParcelReader.m15151w(E)) {
                case 1:
                    i = SafeParcelReader.m15118G(parcel, E);
                    break;
                case 2:
                    i2 = SafeParcelReader.m15118G(parcel, E);
                    break;
                case 3:
                    z = SafeParcelReader.m15152x(parcel, E);
                    break;
                case 4:
                    i3 = SafeParcelReader.m15118G(parcel, E);
                    break;
                case 5:
                    z2 = SafeParcelReader.m15152x(parcel, E);
                    break;
                case 6:
                    str = SafeParcelReader.m15144p(parcel, E);
                    break;
                case 7:
                    i4 = SafeParcelReader.m15118G(parcel, E);
                    break;
                case 8:
                    str2 = SafeParcelReader.m15144p(parcel, E);
                    break;
                case 9:
                    zaa = (zaa) SafeParcelReader.m15143o(parcel, E, zaa.CREATOR);
                    break;
                default:
                    SafeParcelReader.m15125N(parcel, E);
                    break;
            }
        }
        SafeParcelReader.m15150v(parcel, O);
        return new FastJsonResponse.Field(i, i2, z, i3, z2, str, i4, str2, zaa);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new FastJsonResponse.Field[i];
    }
}
