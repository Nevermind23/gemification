package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p182n6.C7258g;
import p182n6.C7264i;
import p183n7.C7315j0;
import p195o6.C7461a;

public class SleepSegmentEvent extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SleepSegmentEvent> CREATOR = new C7315j0();

    /* renamed from: d */
    private final long f13951d;

    /* renamed from: e */
    private final long f13952e;

    /* renamed from: f */
    private final int f13953f;

    /* renamed from: g */
    private final int f13954g;

    /* renamed from: h */
    private final int f13955h;

    public SleepSegmentEvent(long j, long j2, int i, int i2, int i3) {
        boolean z;
        if (j <= j2) {
            z = true;
        } else {
            z = false;
        }
        C7264i.m27893b(z, "endTimeMillis must be greater than or equal to startTimeMillis");
        this.f13951d = j;
        this.f13952e = j2;
        this.f13953f = i;
        this.f13954g = i2;
        this.f13955h = i3;
    }

    public boolean equals(Object obj) {
        if (obj instanceof SleepSegmentEvent) {
            SleepSegmentEvent sleepSegmentEvent = (SleepSegmentEvent) obj;
            if (this.f13951d == sleepSegmentEvent.mo13972w() && this.f13952e == sleepSegmentEvent.mo13971v() && this.f13953f == sleepSegmentEvent.mo13974x() && this.f13954g == sleepSegmentEvent.f13954g && this.f13955h == sleepSegmentEvent.f13955h) {
                return true;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return C7258g.m27881b(Long.valueOf(this.f13951d), Long.valueOf(this.f13952e), Integer.valueOf(this.f13953f));
    }

    public String toString() {
        long j = this.f13951d;
        long j2 = this.f13952e;
        int i = this.f13953f;
        StringBuilder sb = new StringBuilder(84);
        sb.append("startMillis=");
        sb.append(j);
        sb.append(", endMillis=");
        sb.append(j2);
        sb.append(", status=");
        sb.append(i);
        return sb.toString();
    }

    /* renamed from: v */
    public long mo13971v() {
        return this.f13952e;
    }

    /* renamed from: w */
    public long mo13972w() {
        return this.f13951d;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C7264i.m27902k(parcel);
        int a = C7461a.m28369a(parcel);
        C7461a.m28387s(parcel, 1, mo13972w());
        C7461a.m28387s(parcel, 2, mo13971v());
        C7461a.m28383o(parcel, 3, mo13974x());
        C7461a.m28383o(parcel, 4, this.f13954g);
        C7461a.m28383o(parcel, 5, this.f13955h);
        C7461a.m28370b(parcel, a);
    }

    /* renamed from: x */
    public int mo13974x() {
        return this.f13953f;
    }
}
