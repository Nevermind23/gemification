package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p182n6.C7276n0;
import p195o6.C7461a;

public class ConnectionTelemetryConfiguration extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ConnectionTelemetryConfiguration> CREATOR = new C7276n0();

    /* renamed from: d */
    private final RootTelemetryConfiguration f12606d;

    /* renamed from: e */
    private final boolean f12607e;

    /* renamed from: f */
    private final boolean f12608f;

    /* renamed from: g */
    private final int[] f12609g;

    /* renamed from: h */
    private final int f12610h;

    /* renamed from: i */
    private final int[] f12611i;

    public ConnectionTelemetryConfiguration(RootTelemetryConfiguration rootTelemetryConfiguration, boolean z, boolean z2, int[] iArr, int i, int[] iArr2) {
        this.f12606d = rootTelemetryConfiguration;
        this.f12607e = z;
        this.f12608f = z2;
        this.f12609g = iArr;
        this.f12610h = i;
        this.f12611i = iArr2;
    }

    /* renamed from: R */
    public boolean mo12195R() {
        return this.f12607e;
    }

    /* renamed from: f0 */
    public boolean mo12196f0() {
        return this.f12608f;
    }

    /* renamed from: q0 */
    public final RootTelemetryConfiguration mo12197q0() {
        return this.f12606d;
    }

    /* renamed from: v */
    public int mo12198v() {
        return this.f12610h;
    }

    /* renamed from: w */
    public int[] mo12199w() {
        return this.f12609g;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28390v(parcel, 1, this.f12606d, i, false);
        C7461a.m28372d(parcel, 2, mo12195R());
        C7461a.m28372d(parcel, 3, mo12196f0());
        C7461a.m28384p(parcel, 4, mo12199w(), false);
        C7461a.m28383o(parcel, 5, mo12198v());
        C7461a.m28384p(parcel, 6, mo12201x(), false);
        C7461a.m28370b(parcel, a);
    }

    /* renamed from: x */
    public int[] mo12201x() {
        return this.f12611i;
    }
}
