package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p195o6.C7461a;

public final class zzbw extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbw> CREATOR = new C4072f();

    /* renamed from: d */
    final int f13084d;

    /* renamed from: e */
    String f13085e;

    public zzbw() {
        this.f13084d = 1;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28383o(parcel, 1, this.f13084d);
        C7461a.m28392x(parcel, 2, this.f13085e, false);
        C7461a.m28370b(parcel, a);
    }

    zzbw(int i, String str) {
        this.f13084d = i;
        this.f13085e = str;
    }
}
