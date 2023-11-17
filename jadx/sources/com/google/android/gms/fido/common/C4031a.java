package com.google.android.gms.fido.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.common.Transport;

/* renamed from: com.google.android.gms.fido.common.a */
final class C4031a implements Parcelable.Creator {
    C4031a() {
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        try {
            return Transport.m15291a(parcel.readString());
        } catch (Transport.UnsupportedTransportException e) {
            throw new RuntimeException(e);
        }
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Transport[i];
    }
}
