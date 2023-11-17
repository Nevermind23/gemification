package com.google.android.gms.auth.api.proxy;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p195o6.C7461a;

public class ProxyRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ProxyRequest> CREATOR = new C3818a();

    /* renamed from: j */
    public static final int f12123j = 0;

    /* renamed from: k */
    public static final int f12124k = 1;

    /* renamed from: l */
    public static final int f12125l = 2;

    /* renamed from: m */
    public static final int f12126m = 3;

    /* renamed from: n */
    public static final int f12127n = 4;

    /* renamed from: o */
    public static final int f12128o = 5;

    /* renamed from: p */
    public static final int f12129p = 6;

    /* renamed from: q */
    public static final int f12130q = 7;

    /* renamed from: r */
    public static final int f12131r = 7;

    /* renamed from: d */
    public final String f12132d;

    /* renamed from: e */
    public final int f12133e;

    /* renamed from: f */
    public final long f12134f;

    /* renamed from: g */
    public final byte[] f12135g;

    /* renamed from: h */
    final int f12136h;

    /* renamed from: i */
    Bundle f12137i;

    ProxyRequest(int i, String str, int i2, long j, byte[] bArr, Bundle bundle) {
        this.f12136h = i;
        this.f12132d = str;
        this.f12133e = i2;
        this.f12134f = j;
        this.f12135g = bArr;
        this.f12137i = bundle;
    }

    public String toString() {
        String str = this.f12132d;
        int i = this.f12133e;
        return "ProxyRequest[ url: " + str + ", method: " + i + " ]";
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28392x(parcel, 1, this.f12132d, false);
        C7461a.m28383o(parcel, 2, this.f12133e);
        C7461a.m28387s(parcel, 3, this.f12134f);
        C7461a.m28376h(parcel, 4, this.f12135g, false);
        C7461a.m28374f(parcel, 5, this.f12137i, false);
        C7461a.m28383o(parcel, 1000, this.f12136h);
        C7461a.m28370b(parcel, a);
    }
}
