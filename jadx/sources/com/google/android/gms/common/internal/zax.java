package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p195o6.C7461a;

public final class zax extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zax> CREATOR = new C3972j();

    /* renamed from: d */
    final int f12731d;

    /* renamed from: e */
    private final int f12732e;

    /* renamed from: f */
    private final int f12733f;

    /* renamed from: g */
    private final Scope[] f12734g;

    zax(int i, int i2, int i3, Scope[] scopeArr) {
        this.f12731d = i;
        this.f12732e = i2;
        this.f12733f = i3;
        this.f12734g = scopeArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28383o(parcel, 1, this.f12731d);
        C7461a.m28383o(parcel, 2, this.f12732e);
        C7461a.m28383o(parcel, 3, this.f12733f);
        C7461a.m28363B(parcel, 4, this.f12734g, i, false);
        C7461a.m28370b(parcel, a);
    }
}
