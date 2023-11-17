package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.List;
import p195o6.C7461a;

@Deprecated
public final class WakeLockEvent extends StatsEvent {
    public static final Parcelable.Creator<WakeLockEvent> CREATOR = new C4008a();

    /* renamed from: d */
    final int f12790d;

    /* renamed from: e */
    private final long f12791e;

    /* renamed from: f */
    private final int f12792f;

    /* renamed from: g */
    private final String f12793g;

    /* renamed from: h */
    private final String f12794h;

    /* renamed from: i */
    private final String f12795i;

    /* renamed from: j */
    private final int f12796j;

    /* renamed from: k */
    private final List f12797k;

    /* renamed from: l */
    private final String f12798l;

    /* renamed from: m */
    private final long f12799m;

    /* renamed from: n */
    private final int f12800n;

    /* renamed from: o */
    private final String f12801o;

    /* renamed from: p */
    private final float f12802p;

    /* renamed from: q */
    private final long f12803q;

    /* renamed from: r */
    private final boolean f12804r;

    WakeLockEvent(int i, long j, int i2, String str, int i3, List list, String str2, long j2, int i4, String str3, String str4, float f, long j3, String str5, boolean z) {
        this.f12790d = i;
        this.f12791e = j;
        this.f12792f = i2;
        this.f12793g = str;
        this.f12794h = str3;
        this.f12795i = str5;
        this.f12796j = i3;
        this.f12797k = list;
        this.f12798l = str2;
        this.f12799m = j2;
        this.f12800n = i4;
        this.f12801o = str4;
        this.f12802p = f;
        this.f12803q = j3;
        this.f12804r = z;
    }

    /* renamed from: v */
    public final int mo12377v() {
        return this.f12792f;
    }

    /* renamed from: w */
    public final long mo12378w() {
        return this.f12791e;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28383o(parcel, 1, this.f12790d);
        C7461a.m28387s(parcel, 2, this.f12791e);
        C7461a.m28392x(parcel, 4, this.f12793g, false);
        C7461a.m28383o(parcel, 5, this.f12796j);
        C7461a.m28394z(parcel, 6, this.f12797k, false);
        C7461a.m28387s(parcel, 8, this.f12799m);
        C7461a.m28392x(parcel, 10, this.f12794h, false);
        C7461a.m28383o(parcel, 11, this.f12792f);
        C7461a.m28392x(parcel, 12, this.f12798l, false);
        C7461a.m28392x(parcel, 13, this.f12801o, false);
        C7461a.m28383o(parcel, 14, this.f12800n);
        C7461a.m28380l(parcel, 15, this.f12802p);
        C7461a.m28387s(parcel, 16, this.f12803q);
        C7461a.m28392x(parcel, 17, this.f12795i, false);
        C7461a.m28372d(parcel, 18, this.f12804r);
        C7461a.m28370b(parcel, a);
    }

    /* renamed from: x */
    public final String mo12379x() {
        String str;
        List list = this.f12797k;
        String str2 = this.f12793g;
        int i = this.f12796j;
        String str3 = "";
        if (list == null) {
            str = str3;
        } else {
            str = TextUtils.join(",", list);
        }
        int i2 = this.f12800n;
        String str4 = this.f12794h;
        if (str4 == null) {
            str4 = str3;
        }
        String str5 = this.f12801o;
        if (str5 == null) {
            str5 = str3;
        }
        float f = this.f12802p;
        String str6 = this.f12795i;
        if (str6 != null) {
            str3 = str6;
        }
        boolean z = this.f12804r;
        return "\t" + str2 + "\t" + i + "\t" + str + "\t" + i2 + "\t" + str4 + "\t" + str5 + "\t" + f + "\t" + str3 + "\t" + z;
    }
}
