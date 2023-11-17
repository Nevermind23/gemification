package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.u2f.api.common.ChannelIdValue;

/* renamed from: com.google.android.gms.fido.u2f.api.common.a */
final class C4057a implements Parcelable.Creator {
    C4057a() {
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        try {
            return ChannelIdValue.m15382R(parcel.readInt());
        } catch (ChannelIdValue.UnsupportedChannelIdValueTypeException e) {
            throw new RuntimeException(e);
        }
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ChannelIdValue.ChannelIdValueType[i];
    }
}
