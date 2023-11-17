package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p195o6.C7461a;
import p325y7.C9086d;

public final class zzad extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzad> CREATOR = new C9086d();

    /* renamed from: d */
    final boolean f15207d;

    /* renamed from: e */
    final boolean f15208e;

    /* renamed from: f */
    final boolean f15209f;

    public zzad(boolean z, boolean z2, boolean z3) {
        this.f15207d = z;
        this.f15208e = z2;
        this.f15209f = z3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28372d(parcel, 2, this.f15207d);
        C7461a.m28372d(parcel, 3, this.f15208e);
        C7461a.m28372d(parcel, 4, this.f15209f);
        C7461a.m28370b(parcel, a);
    }
}
