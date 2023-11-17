package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.TokenBinding;

/* renamed from: com.google.android.gms.fido.fido2.api.common.h */
final class C4039h implements Parcelable.Creator {
    C4039h() {
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        try {
            return TokenBinding.TokenBindingStatus.m15374a(parcel.readString());
        } catch (TokenBinding.UnsupportedTokenBindingStatusException e) {
            throw new RuntimeException(e);
        }
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new TokenBinding.TokenBindingStatus[i];
    }
}
