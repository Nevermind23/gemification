package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepName;
import p182n6.C7273m0;

@KeepName
public final class BinderWrapper implements Parcelable {
    public static final Parcelable.Creator<BinderWrapper> CREATOR = new C3982t();

    /* renamed from: d */
    private final IBinder f12603d;

    /* synthetic */ BinderWrapper(Parcel parcel, C7273m0 m0Var) {
        this.f12603d = parcel.readStrongBinder();
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStrongBinder(this.f12603d);
    }
}
