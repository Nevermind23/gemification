package com.google.android.gms.tapandpay.issuer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p195o6.C7461a;

public final class TokenStatus extends AbstractSafeParcelable {
    public static final Parcelable.Creator<TokenStatus> CREATOR = new C4895h();

    /* renamed from: d */
    String f15345d;

    /* renamed from: e */
    int f15346e;

    /* renamed from: f */
    boolean f15347f;

    public TokenStatus(String str, int i, boolean z) {
        this.f15345d = str;
        this.f15346e = i;
        this.f15347f = z;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28392x(parcel, 2, this.f15345d, false);
        C7461a.m28383o(parcel, 3, this.f15346e);
        C7461a.m28372d(parcel, 4, this.f15347f);
        C7461a.m28370b(parcel, a);
    }
}
