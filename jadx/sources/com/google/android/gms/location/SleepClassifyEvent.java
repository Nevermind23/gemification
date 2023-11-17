package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p182n6.C7258g;
import p182n6.C7264i;
import p183n7.C7313i0;
import p195o6.C7461a;

public class SleepClassifyEvent extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SleepClassifyEvent> CREATOR = new C7313i0();

    /* renamed from: d */
    private final int f13942d;

    /* renamed from: e */
    private final int f13943e;

    /* renamed from: f */
    private final int f13944f;

    /* renamed from: g */
    private final int f13945g;

    /* renamed from: h */
    private final int f13946h;

    /* renamed from: i */
    private final int f13947i;

    /* renamed from: j */
    private final int f13948j;

    /* renamed from: k */
    private final boolean f13949k;

    /* renamed from: l */
    private final int f13950l;

    public SleepClassifyEvent(int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z, int i8) {
        this.f13942d = i;
        this.f13943e = i2;
        this.f13944f = i3;
        this.f13945g = i4;
        this.f13946h = i5;
        this.f13947i = i6;
        this.f13948j = i7;
        this.f13949k = z;
        this.f13950l = i8;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SleepClassifyEvent)) {
            return false;
        }
        SleepClassifyEvent sleepClassifyEvent = (SleepClassifyEvent) obj;
        if (this.f13942d == sleepClassifyEvent.f13942d && this.f13943e == sleepClassifyEvent.f13943e) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return C7258g.m27881b(Integer.valueOf(this.f13942d), Integer.valueOf(this.f13943e));
    }

    public String toString() {
        int i = this.f13942d;
        int i2 = this.f13943e;
        int i3 = this.f13944f;
        int i4 = this.f13945g;
        StringBuilder sb = new StringBuilder(65);
        sb.append(i);
        sb.append(" Conf:");
        sb.append(i2);
        sb.append(" Motion:");
        sb.append(i3);
        sb.append(" Light:");
        sb.append(i4);
        return sb.toString();
    }

    /* renamed from: v */
    public int mo13964v() {
        return this.f13943e;
    }

    /* renamed from: w */
    public int mo13965w() {
        return this.f13945g;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C7264i.m27902k(parcel);
        int a = C7461a.m28369a(parcel);
        C7461a.m28383o(parcel, 1, this.f13942d);
        C7461a.m28383o(parcel, 2, mo13964v());
        C7461a.m28383o(parcel, 3, mo13967x());
        C7461a.m28383o(parcel, 4, mo13965w());
        C7461a.m28383o(parcel, 5, this.f13946h);
        C7461a.m28383o(parcel, 6, this.f13947i);
        C7461a.m28383o(parcel, 7, this.f13948j);
        C7461a.m28372d(parcel, 8, this.f13949k);
        C7461a.m28383o(parcel, 9, this.f13950l);
        C7461a.m28370b(parcel, a);
    }

    /* renamed from: x */
    public int mo13967x() {
        return this.f13944f;
    }
}
