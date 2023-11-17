package com.google.android.gms.tapandpay.issuer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p195o6.C7461a;

public class IsTokenizedRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<IsTokenizedRequest> CREATOR = new C4890c();

    /* renamed from: d */
    final String f15310d;

    /* renamed from: e */
    final int f15311e;

    /* renamed from: f */
    final int f15312f;

    /* renamed from: g */
    final String f15313g;

    IsTokenizedRequest(String str, int i, int i2, String str2) {
        this.f15310d = str;
        this.f15311e = i;
        this.f15312f = i2;
        this.f15313g = str2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28392x(parcel, 1, this.f15310d, false);
        C7461a.m28383o(parcel, 2, this.f15311e);
        C7461a.m28383o(parcel, 3, this.f15312f);
        C7461a.m28392x(parcel, 4, this.f15313g, false);
        C7461a.m28370b(parcel, a);
    }
}
