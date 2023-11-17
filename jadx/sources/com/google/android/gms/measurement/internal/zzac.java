package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p182n6.C7264i;
import p195o6.C7461a;

public final class zzac extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzac> CREATOR = new C4609d();

    /* renamed from: d */
    public String f15091d;

    /* renamed from: e */
    public String f15092e;

    /* renamed from: f */
    public zzlj f15093f;

    /* renamed from: g */
    public long f15094g;

    /* renamed from: h */
    public boolean f15095h;

    /* renamed from: i */
    public String f15096i;

    /* renamed from: j */
    public final zzaw f15097j;

    /* renamed from: k */
    public long f15098k;

    /* renamed from: l */
    public zzaw f15099l;

    /* renamed from: m */
    public final long f15100m;

    /* renamed from: n */
    public final zzaw f15101n;

    zzac(zzac zzac) {
        C7264i.m27902k(zzac);
        this.f15091d = zzac.f15091d;
        this.f15092e = zzac.f15092e;
        this.f15093f = zzac.f15093f;
        this.f15094g = zzac.f15094g;
        this.f15095h = zzac.f15095h;
        this.f15096i = zzac.f15096i;
        this.f15097j = zzac.f15097j;
        this.f15098k = zzac.f15098k;
        this.f15099l = zzac.f15099l;
        this.f15100m = zzac.f15100m;
        this.f15101n = zzac.f15101n;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28392x(parcel, 2, this.f15091d, false);
        C7461a.m28392x(parcel, 3, this.f15092e, false);
        C7461a.m28390v(parcel, 4, this.f15093f, i, false);
        C7461a.m28387s(parcel, 5, this.f15094g);
        C7461a.m28372d(parcel, 6, this.f15095h);
        C7461a.m28392x(parcel, 7, this.f15096i, false);
        C7461a.m28390v(parcel, 8, this.f15097j, i, false);
        C7461a.m28387s(parcel, 9, this.f15098k);
        C7461a.m28390v(parcel, 10, this.f15099l, i, false);
        C7461a.m28387s(parcel, 11, this.f15100m);
        C7461a.m28390v(parcel, 12, this.f15101n, i, false);
        C7461a.m28370b(parcel, a);
    }

    zzac(String str, String str2, zzlj zzlj, long j, boolean z, String str3, zzaw zzaw, long j2, zzaw zzaw2, long j3, zzaw zzaw3) {
        this.f15091d = str;
        this.f15092e = str2;
        this.f15093f = zzlj;
        this.f15094g = j;
        this.f15095h = z;
        this.f15096i = str3;
        this.f15097j = zzaw;
        this.f15098k = j2;
        this.f15099l = zzaw2;
        this.f15100m = j3;
        this.f15101n = zzaw3;
    }
}
