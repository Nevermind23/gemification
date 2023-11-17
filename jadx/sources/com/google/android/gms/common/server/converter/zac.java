package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p195o6.C7461a;

public final class zac extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zac> CREATOR = new C4001c();

    /* renamed from: d */
    final int f12760d;

    /* renamed from: e */
    final String f12761e;

    /* renamed from: f */
    final int f12762f;

    zac(int i, String str, int i2) {
        this.f12760d = i;
        this.f12761e = str;
        this.f12762f = i2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28383o(parcel, 1, this.f12760d);
        C7461a.m28392x(parcel, 2, this.f12761e, false);
        C7461a.m28383o(parcel, 3, this.f12762f);
        C7461a.m28370b(parcel, a);
    }

    zac(String str, int i) {
        this.f12760d = 1;
        this.f12761e = str;
        this.f12762f = i;
    }
}
