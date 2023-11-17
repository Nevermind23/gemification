package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p195o6.C7461a;

public final class zzk extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzk> CREATOR = new C3983u();

    /* renamed from: d */
    Bundle f12736d;

    /* renamed from: e */
    Feature[] f12737e;

    /* renamed from: f */
    int f12738f;

    /* renamed from: g */
    ConnectionTelemetryConfiguration f12739g;

    zzk(Bundle bundle, Feature[] featureArr, int i, ConnectionTelemetryConfiguration connectionTelemetryConfiguration) {
        this.f12736d = bundle;
        this.f12737e = featureArr;
        this.f12738f = i;
        this.f12739g = connectionTelemetryConfiguration;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28374f(parcel, 1, this.f12736d, false);
        C7461a.m28363B(parcel, 2, this.f12737e, i, false);
        C7461a.m28383o(parcel, 3, this.f12738f);
        C7461a.m28390v(parcel, 4, this.f12739g, i, false);
        C7461a.m28370b(parcel, a);
    }

    public zzk() {
    }
}
