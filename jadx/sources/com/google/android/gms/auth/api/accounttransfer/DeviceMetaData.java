package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p195o6.C7461a;

public class DeviceMetaData extends AbstractSafeParcelable {
    public static final Parcelable.Creator<DeviceMetaData> CREATOR = new C3800e();

    /* renamed from: d */
    final int f12002d;

    /* renamed from: e */
    private boolean f12003e;

    /* renamed from: f */
    private long f12004f;

    /* renamed from: g */
    private final boolean f12005g;

    DeviceMetaData(int i, boolean z, long j, boolean z2) {
        this.f12002d = i;
        this.f12003e = z;
        this.f12004f = j;
        this.f12005g = z2;
    }

    /* renamed from: v */
    public long mo11585v() {
        return this.f12004f;
    }

    /* renamed from: w */
    public boolean mo11586w() {
        return this.f12005g;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28383o(parcel, 1, this.f12002d);
        C7461a.m28372d(parcel, 2, mo11588x());
        C7461a.m28387s(parcel, 3, mo11585v());
        C7461a.m28372d(parcel, 4, mo11586w());
        C7461a.m28370b(parcel, a);
    }

    /* renamed from: x */
    public boolean mo11588x() {
        return this.f12003e;
    }
}
