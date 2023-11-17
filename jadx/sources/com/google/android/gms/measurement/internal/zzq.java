package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
import p182n6.C7264i;
import p195o6.C7461a;

public final class zzq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzq> CREATOR = new C4840x9();

    /* renamed from: A */
    public final String f15114A;

    /* renamed from: B */
    public final boolean f15115B;

    /* renamed from: C */
    public final long f15116C;

    /* renamed from: d */
    public final String f15117d;

    /* renamed from: e */
    public final String f15118e;

    /* renamed from: f */
    public final String f15119f;

    /* renamed from: g */
    public final String f15120g;

    /* renamed from: h */
    public final long f15121h;

    /* renamed from: i */
    public final long f15122i;

    /* renamed from: j */
    public final String f15123j;

    /* renamed from: k */
    public final boolean f15124k;

    /* renamed from: l */
    public final boolean f15125l;

    /* renamed from: m */
    public final long f15126m;

    /* renamed from: n */
    public final String f15127n;

    /* renamed from: o */
    public final long f15128o;

    /* renamed from: p */
    public final long f15129p;

    /* renamed from: q */
    public final int f15130q;

    /* renamed from: r */
    public final boolean f15131r;

    /* renamed from: s */
    public final boolean f15132s;

    /* renamed from: t */
    public final String f15133t;

    /* renamed from: u */
    public final Boolean f15134u;

    /* renamed from: v */
    public final long f15135v;

    /* renamed from: w */
    public final List f15136w;

    /* renamed from: x */
    public final String f15137x;

    /* renamed from: y */
    public final String f15138y;

    /* renamed from: z */
    public final String f15139z;

    zzq(String str, String str2, String str3, long j, String str4, long j2, long j3, String str5, boolean z, boolean z2, String str6, long j4, long j5, int i, boolean z3, boolean z4, String str7, Boolean bool, long j6, List list, String str8, String str9, String str10, String str11, boolean z5, long j7) {
        C7264i.m27898g(str);
        this.f15117d = str;
        this.f15118e = true == TextUtils.isEmpty(str2) ? null : str2;
        this.f15119f = str3;
        this.f15126m = j;
        this.f15120g = str4;
        this.f15121h = j2;
        this.f15122i = j3;
        this.f15123j = str5;
        this.f15124k = z;
        this.f15125l = z2;
        this.f15127n = str6;
        this.f15128o = 0;
        this.f15129p = j5;
        this.f15130q = i;
        this.f15131r = z3;
        this.f15132s = z4;
        this.f15133t = str7;
        this.f15134u = bool;
        this.f15135v = j6;
        this.f15136w = list;
        this.f15137x = null;
        this.f15138y = str9;
        this.f15139z = str10;
        this.f15114A = str11;
        this.f15115B = z5;
        this.f15116C = j7;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28392x(parcel, 2, this.f15117d, false);
        C7461a.m28392x(parcel, 3, this.f15118e, false);
        C7461a.m28392x(parcel, 4, this.f15119f, false);
        C7461a.m28392x(parcel, 5, this.f15120g, false);
        C7461a.m28387s(parcel, 6, this.f15121h);
        C7461a.m28387s(parcel, 7, this.f15122i);
        C7461a.m28392x(parcel, 8, this.f15123j, false);
        C7461a.m28372d(parcel, 9, this.f15124k);
        C7461a.m28372d(parcel, 10, this.f15125l);
        C7461a.m28387s(parcel, 11, this.f15126m);
        C7461a.m28392x(parcel, 12, this.f15127n, false);
        C7461a.m28387s(parcel, 13, this.f15128o);
        C7461a.m28387s(parcel, 14, this.f15129p);
        C7461a.m28383o(parcel, 15, this.f15130q);
        C7461a.m28372d(parcel, 16, this.f15131r);
        C7461a.m28372d(parcel, 18, this.f15132s);
        C7461a.m28392x(parcel, 19, this.f15133t, false);
        C7461a.m28373e(parcel, 21, this.f15134u, false);
        C7461a.m28387s(parcel, 22, this.f15135v);
        C7461a.m28394z(parcel, 23, this.f15136w, false);
        C7461a.m28392x(parcel, 24, this.f15137x, false);
        C7461a.m28392x(parcel, 25, this.f15138y, false);
        C7461a.m28392x(parcel, 26, this.f15139z, false);
        C7461a.m28392x(parcel, 27, this.f15114A, false);
        C7461a.m28372d(parcel, 28, this.f15115B);
        C7461a.m28387s(parcel, 29, this.f15116C);
        C7461a.m28370b(parcel, a);
    }

    zzq(String str, String str2, String str3, String str4, long j, long j2, String str5, boolean z, boolean z2, long j3, String str6, long j4, long j5, int i, boolean z3, boolean z4, String str7, Boolean bool, long j6, List list, String str8, String str9, String str10, String str11, boolean z5, long j7) {
        this.f15117d = str;
        this.f15118e = str2;
        this.f15119f = str3;
        this.f15126m = j3;
        this.f15120g = str4;
        this.f15121h = j;
        this.f15122i = j2;
        this.f15123j = str5;
        this.f15124k = z;
        this.f15125l = z2;
        this.f15127n = str6;
        this.f15128o = j4;
        this.f15129p = j5;
        this.f15130q = i;
        this.f15131r = z3;
        this.f15132s = z4;
        this.f15133t = str7;
        this.f15134u = bool;
        this.f15135v = j6;
        this.f15136w = list;
        this.f15137x = str8;
        this.f15138y = str9;
        this.f15139z = str10;
        this.f15114A = str11;
        this.f15115B = z5;
        this.f15116C = j7;
    }
}
