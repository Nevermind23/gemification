package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p195o6.C7461a;
import p325y7.C9092j;

public final class zzj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzj> CREATOR = new C9092j();

    /* renamed from: d */
    final AccountInfo f15278d;

    public zzj(AccountInfo accountInfo) {
        this.f15278d = accountInfo;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28390v(parcel, 2, this.f15278d, i, false);
        C7461a.m28370b(parcel, a);
    }
}
