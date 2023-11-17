package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.fido.fido2.api.common.j */
final class C4041j implements Parcelable.Creator {
    C4041j() {
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        try {
            return zzay.m15381a(parcel.readString());
        } catch (zzax e) {
            throw new RuntimeException(e);
        }
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzay[i];
    }
}
