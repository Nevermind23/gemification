package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.List;
import p182n6.C7279p;
import p195o6.C7461a;

public class TelemetryData extends AbstractSafeParcelable {
    public static final Parcelable.Creator<TelemetryData> CREATOR = new C7279p();

    /* renamed from: d */
    private final int f12644d;

    /* renamed from: e */
    private List f12645e;

    public TelemetryData(int i, List list) {
        this.f12644d = i;
        this.f12645e = list;
    }

    /* renamed from: v */
    public final int mo12211v() {
        return this.f12644d;
    }

    /* renamed from: w */
    public final List mo12212w() {
        return this.f12645e;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28383o(parcel, 1, this.f12644d);
        C7461a.m28364C(parcel, 2, this.f12645e, false);
        C7461a.m28370b(parcel, a);
    }

    /* renamed from: x */
    public final void mo12214x(MethodInvocation methodInvocation) {
        if (this.f12645e == null) {
            this.f12645e = new ArrayList();
        }
        this.f12645e.add(methodInvocation);
    }
}
