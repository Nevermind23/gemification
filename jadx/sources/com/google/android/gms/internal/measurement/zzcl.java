package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p195o6.C7461a;

public final class zzcl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcl> CREATOR = new C4326o1();

    /* renamed from: d */
    public final long f13863d;

    /* renamed from: e */
    public final long f13864e;

    /* renamed from: f */
    public final boolean f13865f;

    /* renamed from: g */
    public final String f13866g;

    /* renamed from: h */
    public final String f13867h;

    /* renamed from: i */
    public final String f13868i;

    /* renamed from: j */
    public final Bundle f13869j;

    /* renamed from: k */
    public final String f13870k;

    public zzcl(long j, long j2, boolean z, String str, String str2, String str3, Bundle bundle, String str4) {
        this.f13863d = j;
        this.f13864e = j2;
        this.f13865f = z;
        this.f13866g = str;
        this.f13867h = str2;
        this.f13868i = str3;
        this.f13869j = bundle;
        this.f13870k = str4;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28387s(parcel, 1, this.f13863d);
        C7461a.m28387s(parcel, 2, this.f13864e);
        C7461a.m28372d(parcel, 3, this.f13865f);
        C7461a.m28392x(parcel, 4, this.f13866g, false);
        C7461a.m28392x(parcel, 5, this.f13867h, false);
        C7461a.m28392x(parcel, 6, this.f13868i, false);
        C7461a.m28374f(parcel, 7, this.f13869j, false);
        C7461a.m28392x(parcel, 8, this.f13870k, false);
        C7461a.m28370b(parcel, a);
    }
}
