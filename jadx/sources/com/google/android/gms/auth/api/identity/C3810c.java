package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.auth.api.identity.c */
public final class C3810c implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m15126O(parcel);
        boolean z = false;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m15116E(parcel);
            switch (SafeParcelReader.m15151w(E)) {
                case 1:
                    str = SafeParcelReader.m15144p(parcel, E);
                    break;
                case 2:
                    str2 = SafeParcelReader.m15144p(parcel, E);
                    break;
                case 3:
                    str3 = SafeParcelReader.m15144p(parcel, E);
                    break;
                case 4:
                    str4 = SafeParcelReader.m15144p(parcel, E);
                    break;
                case 5:
                    z = SafeParcelReader.m15152x(parcel, E);
                    break;
                case 6:
                    i = SafeParcelReader.m15118G(parcel, E);
                    break;
                default:
                    SafeParcelReader.m15125N(parcel, E);
                    break;
            }
        }
        SafeParcelReader.m15150v(parcel, O);
        return new GetSignInIntentRequest(str, str2, str3, str4, z, i);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new GetSignInIntentRequest[i];
    }
}
