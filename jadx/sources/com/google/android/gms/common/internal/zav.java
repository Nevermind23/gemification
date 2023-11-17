package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.C3966e;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p182n6.C7258g;
import p195o6.C7461a;

public final class zav extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zav> CREATOR = new C3971i();

    /* renamed from: d */
    final int f12726d;

    /* renamed from: e */
    final IBinder f12727e;

    /* renamed from: f */
    private final ConnectionResult f12728f;

    /* renamed from: g */
    private final boolean f12729g;

    /* renamed from: h */
    private final boolean f12730h;

    zav(int i, IBinder iBinder, ConnectionResult connectionResult, boolean z, boolean z2) {
        this.f12726d = i;
        this.f12727e = iBinder;
        this.f12728f = connectionResult;
        this.f12729g = z;
        this.f12730h = z2;
    }

    /* renamed from: R */
    public final boolean mo12312R() {
        return this.f12730h;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zav)) {
            return false;
        }
        zav zav = (zav) obj;
        if (!this.f12728f.equals(zav.f12728f) || !C7258g.m27880a(mo12315w(), zav.mo12315w())) {
            return false;
        }
        return true;
    }

    /* renamed from: v */
    public final ConnectionResult mo12314v() {
        return this.f12728f;
    }

    /* renamed from: w */
    public final C3966e mo12315w() {
        IBinder iBinder = this.f12727e;
        if (iBinder == null) {
            return null;
        }
        return C3966e.C3967a.m15089x(iBinder);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28383o(parcel, 1, this.f12726d);
        C7461a.m28382n(parcel, 2, this.f12727e, false);
        C7461a.m28390v(parcel, 3, this.f12728f, i, false);
        C7461a.m28372d(parcel, 4, this.f12729g);
        C7461a.m28372d(parcel, 5, this.f12730h);
        C7461a.m28370b(parcel, a);
    }

    /* renamed from: x */
    public final boolean mo12317x() {
        return this.f12729g;
    }
}
