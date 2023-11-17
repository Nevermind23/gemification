package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p182n6.C7264i;
import p195o6.C7461a;

public final class zzl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzl> CREATOR = new C4544r();

    /* renamed from: d */
    private final long f13984d;

    /* renamed from: e */
    private final boolean f13985e;

    /* renamed from: f */
    private final WorkSource f13986f;

    /* renamed from: g */
    private final String f13987g;

    /* renamed from: h */
    private final int[] f13988h;

    /* renamed from: i */
    private final boolean f13989i;

    /* renamed from: j */
    private final String f13990j;

    /* renamed from: k */
    private final long f13991k;

    /* renamed from: l */
    private String f13992l;

    zzl(long j, boolean z, WorkSource workSource, String str, int[] iArr, boolean z2, String str2, long j2, String str3) {
        this.f13984d = j;
        this.f13985e = z;
        this.f13986f = workSource;
        this.f13987g = str;
        this.f13988h = iArr;
        this.f13989i = z2;
        this.f13990j = str2;
        this.f13991k = j2;
        this.f13992l = str3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C7264i.m27902k(parcel);
        int a = C7461a.m28369a(parcel);
        C7461a.m28387s(parcel, 1, this.f13984d);
        C7461a.m28372d(parcel, 2, this.f13985e);
        C7461a.m28390v(parcel, 3, this.f13986f, i, false);
        C7461a.m28392x(parcel, 4, this.f13987g, false);
        C7461a.m28384p(parcel, 5, this.f13988h, false);
        C7461a.m28372d(parcel, 6, this.f13989i);
        C7461a.m28392x(parcel, 7, this.f13990j, false);
        C7461a.m28387s(parcel, 8, this.f13991k);
        C7461a.m28392x(parcel, 9, this.f13992l, false);
        C7461a.m28370b(parcel, a);
    }
}
