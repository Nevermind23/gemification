package com.google.android.gms.common;

import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p195o6.C7461a;
import p299w6.C8859b;
import p299w6.C8862d;

public final class zzo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzo> CREATOR = new C3998s();

    /* renamed from: d */
    private final String f12811d;

    /* renamed from: e */
    private final boolean f12812e;

    /* renamed from: f */
    private final boolean f12813f;

    /* renamed from: g */
    private final Context f12814g;

    /* renamed from: h */
    private final boolean f12815h;

    /* renamed from: i */
    private final boolean f12816i;

    zzo(String str, boolean z, boolean z2, IBinder iBinder, boolean z3, boolean z4) {
        this.f12811d = str;
        this.f12812e = z;
        this.f12813f = z2;
        this.f12814g = (Context) C8862d.m32985y(C8859b.C8860a.m32974x(iBinder));
        this.f12815h = z3;
        this.f12816i = z4;
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [w6.b, android.os.IBinder] */
    public final void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28392x(parcel, 1, this.f12811d, false);
        C7461a.m28372d(parcel, 2, this.f12812e);
        C7461a.m28372d(parcel, 3, this.f12813f);
        C7461a.m28382n(parcel, 4, C8862d.m32984T1(this.f12814g), false);
        C7461a.m28372d(parcel, 5, this.f12815h);
        C7461a.m28372d(parcel, 6, this.f12816i);
        C7461a.m28370b(parcel, a);
    }
}
