package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p195o6.C7461a;
import p325y7.C9094l;

public final class zzn extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzn> CREATOR = new C9094l();

    /* renamed from: d */
    final zzau[] f15280d;

    public zzn(zzau[] zzauArr) {
        this.f15280d = zzauArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28363B(parcel, 1, this.f15280d, i, false);
        C7461a.m28370b(parcel, a);
    }
}
