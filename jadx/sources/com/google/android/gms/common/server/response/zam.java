package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import p195o6.C7461a;

public final class zam extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zam> CREATOR = new C4004b();

    /* renamed from: d */
    final int f12784d;

    /* renamed from: e */
    final String f12785e;

    /* renamed from: f */
    final FastJsonResponse.Field f12786f;

    zam(int i, String str, FastJsonResponse.Field field) {
        this.f12784d = i;
        this.f12785e = str;
        this.f12786f = field;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28383o(parcel, 1, this.f12784d);
        C7461a.m28392x(parcel, 2, this.f12785e, false);
        C7461a.m28390v(parcel, 3, this.f12786f, i, false);
        C7461a.m28370b(parcel, a);
    }

    zam(String str, FastJsonResponse.Field field) {
        this.f12784d = 1;
        this.f12785e = str;
        this.f12786f = field;
    }
}
