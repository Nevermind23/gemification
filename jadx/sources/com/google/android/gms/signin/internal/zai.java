package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zat;
import p195o6.C7461a;

public final class zai extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zai> CREATOR = new C4866d();

    /* renamed from: d */
    final int f15150d;

    /* renamed from: e */
    final zat f15151e;

    zai(int i, zat zat) {
        this.f15150d = i;
        this.f15151e = zat;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28383o(parcel, 1, this.f15150d);
        C7461a.m28390v(parcel, 2, this.f15151e, i, false);
        C7461a.m28370b(parcel, a);
    }
}
