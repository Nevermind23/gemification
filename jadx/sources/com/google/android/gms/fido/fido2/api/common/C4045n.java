package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.fido.fido2.api.common.n */
public final class C4045n implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m15126O(parcel);
        UvmEntries uvmEntries = null;
        zzf zzf = null;
        AuthenticationExtensionsCredPropsOutputs authenticationExtensionsCredPropsOutputs = null;
        zzh zzh = null;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m15116E(parcel);
            int w = SafeParcelReader.m15151w(E);
            if (w == 1) {
                uvmEntries = (UvmEntries) SafeParcelReader.m15143o(parcel, E, UvmEntries.CREATOR);
            } else if (w == 2) {
                zzf = (zzf) SafeParcelReader.m15143o(parcel, E, zzf.CREATOR);
            } else if (w == 3) {
                authenticationExtensionsCredPropsOutputs = (AuthenticationExtensionsCredPropsOutputs) SafeParcelReader.m15143o(parcel, E, AuthenticationExtensionsCredPropsOutputs.CREATOR);
            } else if (w != 4) {
                SafeParcelReader.m15125N(parcel, E);
            } else {
                zzh = (zzh) SafeParcelReader.m15143o(parcel, E, zzh.CREATOR);
            }
        }
        SafeParcelReader.m15150v(parcel, O);
        return new AuthenticationExtensionsClientOutputs(uvmEntries, zzf, authenticationExtensionsCredPropsOutputs, zzh);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AuthenticationExtensionsClientOutputs[i];
    }
}
