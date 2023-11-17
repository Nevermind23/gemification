package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p195o6.C7461a;
import p325y7.C9096n;

public final class zzr extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzr> CREATOR = new C9096n();

    /* renamed from: d */
    final int[] f15287d;

    public zzr(int[] iArr) {
        this.f15287d = iArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28384p(parcel, 1, this.f15287d, false);
        C7461a.m28370b(parcel, a);
    }
}
