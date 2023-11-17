package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.fido.fido2.api.common.p */
public final class C4047p implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m15126O(parcel);
        byte[] bArr = null;
        byte[] bArr2 = null;
        byte[] bArr3 = null;
        byte[] bArr4 = null;
        byte[] bArr5 = null;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m15116E(parcel);
            int w = SafeParcelReader.m15151w(E);
            if (w == 2) {
                bArr = SafeParcelReader.m15135g(parcel, E);
            } else if (w == 3) {
                bArr2 = SafeParcelReader.m15135g(parcel, E);
            } else if (w == 4) {
                bArr3 = SafeParcelReader.m15135g(parcel, E);
            } else if (w == 5) {
                bArr4 = SafeParcelReader.m15135g(parcel, E);
            } else if (w != 6) {
                SafeParcelReader.m15125N(parcel, E);
            } else {
                bArr5 = SafeParcelReader.m15135g(parcel, E);
            }
        }
        SafeParcelReader.m15150v(parcel, O);
        return new AuthenticatorAssertionResponse(bArr, bArr2, bArr3, bArr4, bArr5);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AuthenticatorAssertionResponse[i];
    }
}
