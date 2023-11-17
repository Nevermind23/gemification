package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p195o6.C7461a;
import p325y7.C9093k;

public final class zzl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzl> CREATOR = new C9093k();

    /* renamed from: d */
    final CardInfo[] f15279d;

    public zzl(CardInfo[] cardInfoArr) {
        this.f15279d = cardInfoArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28363B(parcel, 2, this.f15279d, i, false);
        C7461a.m28370b(parcel, a);
    }
}
