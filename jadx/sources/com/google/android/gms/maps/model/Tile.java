package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p195o6.C7461a;
import p222q7.C7915t;

public final class Tile extends AbstractSafeParcelable {
    public static final Parcelable.Creator<Tile> CREATOR = new C7915t();

    /* renamed from: d */
    public final int f14153d;

    /* renamed from: e */
    public final int f14154e;

    /* renamed from: f */
    public final byte[] f14155f;

    public Tile(int i, int i2, byte[] bArr) {
        this.f14153d = i;
        this.f14154e = i2;
        this.f14155f = bArr;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28383o(parcel, 2, this.f14153d);
        C7461a.m28383o(parcel, 3, this.f14154e);
        C7461a.m28376h(parcel, 4, this.f14155f, false);
        C7461a.m28370b(parcel, a);
    }
}
