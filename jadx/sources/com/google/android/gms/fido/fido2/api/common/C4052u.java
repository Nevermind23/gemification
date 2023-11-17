package com.google.android.gms.fido.fido2.api.common;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.fido.fido2.api.common.u */
public final class C4052u implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m15126O(parcel);
        PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions = null;
        Uri uri = null;
        byte[] bArr = null;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m15116E(parcel);
            int w = SafeParcelReader.m15151w(E);
            if (w == 2) {
                publicKeyCredentialRequestOptions = (PublicKeyCredentialRequestOptions) SafeParcelReader.m15143o(parcel, E, PublicKeyCredentialRequestOptions.CREATOR);
            } else if (w == 3) {
                uri = (Uri) SafeParcelReader.m15143o(parcel, E, Uri.CREATOR);
            } else if (w != 4) {
                SafeParcelReader.m15125N(parcel, E);
            } else {
                bArr = SafeParcelReader.m15135g(parcel, E);
            }
        }
        SafeParcelReader.m15150v(parcel, O);
        return new BrowserPublicKeyCredentialRequestOptions(publicKeyCredentialRequestOptions, uri, bArr);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new BrowserPublicKeyCredentialRequestOptions[i];
    }
}
