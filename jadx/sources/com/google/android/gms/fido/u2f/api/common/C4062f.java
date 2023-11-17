package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.u2f.api.common.ProtocolVersion;

/* renamed from: com.google.android.gms.fido.u2f.api.common.f */
final class C4062f implements Parcelable.Creator {
    C4062f() {
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        try {
            return ProtocolVersion.m15395a(parcel.readString());
        } catch (ProtocolVersion.UnsupportedProtocolException e) {
            throw new RuntimeException(e);
        }
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ProtocolVersion[i];
    }
}
