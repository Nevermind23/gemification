package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zav;
import p195o6.C7461a;

public final class zak extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zak> CREATOR = new C4867e();

    /* renamed from: d */
    final int f15152d;

    /* renamed from: e */
    private final ConnectionResult f15153e;

    /* renamed from: f */
    private final zav f15154f;

    zak(int i, ConnectionResult connectionResult, zav zav) {
        this.f15152d = i;
        this.f15153e = connectionResult;
        this.f15154f = zav;
    }

    /* renamed from: v */
    public final ConnectionResult mo15013v() {
        return this.f15153e;
    }

    /* renamed from: w */
    public final zav mo15014w() {
        return this.f15154f;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28383o(parcel, 1, this.f15152d);
        C7461a.m28390v(parcel, 2, this.f15153e, i, false);
        C7461a.m28390v(parcel, 3, this.f15154f, i, false);
        C7461a.m28370b(parcel, a);
    }
}
