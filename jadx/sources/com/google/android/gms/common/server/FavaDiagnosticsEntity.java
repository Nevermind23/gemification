package com.google.android.gms.common.server;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p195o6.C7461a;
import p234r6.C8066a;

public class FavaDiagnosticsEntity extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<FavaDiagnosticsEntity> CREATOR = new C8066a();

    /* renamed from: d */
    final int f12752d;

    /* renamed from: e */
    public final String f12753e;

    /* renamed from: f */
    public final int f12754f;

    public FavaDiagnosticsEntity(int i, String str, int i2) {
        this.f12752d = i;
        this.f12753e = str;
        this.f12754f = i2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28383o(parcel, 1, this.f12752d);
        C7461a.m28392x(parcel, 2, this.f12753e, false);
        C7461a.m28383o(parcel, 3, this.f12754f);
        C7461a.m28370b(parcel, a);
    }
}
