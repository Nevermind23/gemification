package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p182n6.C7264i;
import p195o6.C7461a;

public final class zzax extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzax> CREATOR = new C4069c();

    /* renamed from: d */
    final int f13076d = 1;

    /* renamed from: e */
    public final String f13077e;

    zzax(int i, String str) {
        this.f13077e = (String) C7264i.m27902k(str);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28383o(parcel, 1, this.f13076d);
        C7461a.m28392x(parcel, 2, this.f13077e, false);
        C7461a.m28370b(parcel, a);
    }
}
