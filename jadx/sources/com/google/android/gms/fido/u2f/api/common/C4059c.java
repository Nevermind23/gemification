package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.fido.u2f.api.common.c */
final class C4059c implements Parcelable.Creator {
    C4059c() {
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return ErrorCode.m15387b(parcel.readInt());
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ErrorCode[i];
    }
}
