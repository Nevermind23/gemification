package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.fido.fido2.api.common.q */
public final class C4048q implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m15126O(parcel);
        byte[] bArr = null;
        byte[] bArr2 = null;
        byte[] bArr3 = null;
        String[] strArr = null;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m15116E(parcel);
            int w = SafeParcelReader.m15151w(E);
            if (w == 2) {
                bArr = SafeParcelReader.m15135g(parcel, E);
            } else if (w == 3) {
                bArr2 = SafeParcelReader.m15135g(parcel, E);
            } else if (w == 4) {
                bArr3 = SafeParcelReader.m15135g(parcel, E);
            } else if (w != 5) {
                SafeParcelReader.m15125N(parcel, E);
            } else {
                strArr = SafeParcelReader.m15145q(parcel, E);
            }
        }
        SafeParcelReader.m15150v(parcel, O);
        return new AuthenticatorAttestationResponse(bArr, bArr2, bArr3, strArr);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AuthenticatorAttestationResponse[i];
    }
}
