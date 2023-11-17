package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
import p195o6.C7461a;
import p325y7.C9085c;

public final class zzab extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzab> CREATOR = new C9085c();

    /* renamed from: d */
    final List f15206d;

    public zzab(List list) {
        this.f15206d = list;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28364C(parcel, 1, this.f15206d, false);
        C7461a.m28370b(parcel, a);
    }
}
