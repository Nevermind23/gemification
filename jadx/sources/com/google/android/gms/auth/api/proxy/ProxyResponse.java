package com.google.android.gms.auth.api.proxy;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p195o6.C7461a;

public class ProxyResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ProxyResponse> CREATOR = new C3819b();

    /* renamed from: d */
    public final int f12138d;

    /* renamed from: e */
    public final PendingIntent f12139e;

    /* renamed from: f */
    public final int f12140f;

    /* renamed from: g */
    public final byte[] f12141g;

    /* renamed from: h */
    final int f12142h;

    /* renamed from: i */
    final Bundle f12143i;

    ProxyResponse(int i, int i2, PendingIntent pendingIntent, int i3, Bundle bundle, byte[] bArr) {
        this.f12142h = i;
        this.f12138d = i2;
        this.f12140f = i3;
        this.f12143i = bundle;
        this.f12141g = bArr;
        this.f12139e = pendingIntent;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28383o(parcel, 1, this.f12138d);
        C7461a.m28390v(parcel, 2, this.f12139e, i, false);
        C7461a.m28383o(parcel, 3, this.f12140f);
        C7461a.m28374f(parcel, 4, this.f12143i, false);
        C7461a.m28376h(parcel, 5, this.f12141g, false);
        C7461a.m28383o(parcel, 1000, this.f12142h);
        C7461a.m28370b(parcel, a);
    }
}
