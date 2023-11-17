package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p182n6.C7271l0;
import p195o6.C7461a;

public class RootTelemetryConfiguration extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RootTelemetryConfiguration> CREATOR = new C7271l0();

    /* renamed from: d */
    private final int f12639d;

    /* renamed from: e */
    private final boolean f12640e;

    /* renamed from: f */
    private final boolean f12641f;

    /* renamed from: g */
    private final int f12642g;

    /* renamed from: h */
    private final int f12643h;

    public RootTelemetryConfiguration(int i, boolean z, boolean z2, int i2, int i3) {
        this.f12639d = i;
        this.f12640e = z;
        this.f12641f = z2;
        this.f12642g = i2;
        this.f12643h = i3;
    }

    /* renamed from: R */
    public boolean mo12205R() {
        return this.f12641f;
    }

    /* renamed from: f0 */
    public int mo12206f0() {
        return this.f12639d;
    }

    /* renamed from: v */
    public int mo12207v() {
        return this.f12642g;
    }

    /* renamed from: w */
    public int mo12208w() {
        return this.f12643h;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28383o(parcel, 1, mo12206f0());
        C7461a.m28372d(parcel, 2, mo12210x());
        C7461a.m28372d(parcel, 3, mo12205R());
        C7461a.m28383o(parcel, 4, mo12207v());
        C7461a.m28383o(parcel, 5, mo12208w());
        C7461a.m28370b(parcel, a);
    }

    /* renamed from: x */
    public boolean mo12210x() {
        return this.f12640e;
    }
}
