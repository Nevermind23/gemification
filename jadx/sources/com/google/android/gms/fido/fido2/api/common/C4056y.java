package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.fido.fido2.api.common.y */
public final class C4056y implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m15126O(parcel);
        boolean z = false;
        boolean z2 = false;
        String str = null;
        String str2 = null;
        byte[] bArr = null;
        byte[] bArr2 = null;
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
                    bArr = SafeParcelReader.m15135g(parcel, E);
                    break;
                case 4:
                    bArr2 = SafeParcelReader.m15135g(parcel, E);
                    break;
                case 5:
                    z = SafeParcelReader.m15152x(parcel, E);
                    break;
                case 6:
                    z2 = SafeParcelReader.m15152x(parcel, E);
                    break;
                default:
                    SafeParcelReader.m15125N(parcel, E);
                    break;
            }
        }
        SafeParcelReader.m15150v(parcel, O);
        return new FidoCredentialDetails(str, str2, bArr, bArr2, z, z2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new FidoCredentialDetails[i];
    }
}
