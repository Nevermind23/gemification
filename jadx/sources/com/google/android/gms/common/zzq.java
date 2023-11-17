package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p195o6.C7461a;

public final class zzq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzq> CREATOR = new C4009t();

    /* renamed from: d */
    private final boolean f12817d;

    /* renamed from: e */
    private final String f12818e;

    /* renamed from: f */
    private final int f12819f;

    /* renamed from: g */
    private final int f12820g;

    zzq(boolean z, String str, int i, int i2) {
        this.f12817d = z;
        this.f12818e = str;
        this.f12819f = C4013x.m15251a(i) - 1;
        this.f12820g = C3951h.m14981a(i2) - 1;
    }

    /* renamed from: R */
    public final int mo12390R() {
        return C4013x.m15251a(this.f12819f);
    }

    /* renamed from: v */
    public final String mo12391v() {
        return this.f12818e;
    }

    /* renamed from: w */
    public final boolean mo12392w() {
        return this.f12817d;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28372d(parcel, 1, this.f12817d);
        C7461a.m28392x(parcel, 2, this.f12818e, false);
        C7461a.m28383o(parcel, 3, this.f12819f);
        C7461a.m28383o(parcel, 4, this.f12820g);
        C7461a.m28370b(parcel, a);
    }

    /* renamed from: x */
    public final int mo12394x() {
        return C3951h.m14981a(this.f12820g);
    }
}
