package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import p182n6.C7273m0;

/* renamed from: com.google.android.gms.common.internal.t */
final class C3982t implements Parcelable.Creator {
    C3982t() {
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new BinderWrapper(parcel, (C7273m0) null);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new BinderWrapper[i];
    }
}
