package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p182n6.C7294z;
import p195o6.C7461a;

public class MethodInvocation extends AbstractSafeParcelable {
    public static final Parcelable.Creator<MethodInvocation> CREATOR = new C7294z();

    /* renamed from: d */
    private final int f12630d;

    /* renamed from: e */
    private final int f12631e;

    /* renamed from: f */
    private final int f12632f;

    /* renamed from: g */
    private final long f12633g;

    /* renamed from: h */
    private final long f12634h;

    /* renamed from: i */
    private final String f12635i;

    /* renamed from: j */
    private final String f12636j;

    /* renamed from: k */
    private final int f12637k;

    /* renamed from: l */
    private final int f12638l;

    public MethodInvocation(int i, int i2, int i3, long j, long j2, String str, String str2, int i4, int i5) {
        this.f12630d = i;
        this.f12631e = i2;
        this.f12632f = i3;
        this.f12633g = j;
        this.f12634h = j2;
        this.f12635i = str;
        this.f12636j = str2;
        this.f12637k = i4;
        this.f12638l = i5;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28383o(parcel, 1, this.f12630d);
        C7461a.m28383o(parcel, 2, this.f12631e);
        C7461a.m28383o(parcel, 3, this.f12632f);
        C7461a.m28387s(parcel, 4, this.f12633g);
        C7461a.m28387s(parcel, 5, this.f12634h);
        C7461a.m28392x(parcel, 6, this.f12635i, false);
        C7461a.m28392x(parcel, 7, this.f12636j, false);
        C7461a.m28383o(parcel, 8, this.f12637k);
        C7461a.m28383o(parcel, 9, this.f12638l);
        C7461a.m28370b(parcel, a);
    }
}
