package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p182n6.C7264i;
import p195o6.C7461a;

public final class zzav extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzav> CREATOR = new C4068b();

    /* renamed from: d */
    final int f13073d = 1;

    /* renamed from: e */
    public final String f13074e;

    /* renamed from: f */
    public final int f13075f;

    zzav(int i, String str, int i2) {
        this.f13074e = (String) C7264i.m27902k(str);
        this.f13075f = i2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28383o(parcel, 1, this.f13073d);
        C7461a.m28392x(parcel, 2, this.f13074e, false);
        C7461a.m28383o(parcel, 3, this.f13075f);
        C7461a.m28370b(parcel, a);
    }
}
