package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p182n6.C7264i;
import p195o6.C7461a;

public final class zzaq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaq> CREATOR = new C4067a();

    /* renamed from: d */
    final int f13071d = 1;

    /* renamed from: e */
    public final String f13072e;

    zzaq(int i, String str) {
        this.f13072e = (String) C7264i.m27902k(str);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28383o(parcel, 1, this.f13071d);
        C7461a.m28392x(parcel, 2, this.f13072e, false);
        C7461a.m28370b(parcel, a);
    }
}
