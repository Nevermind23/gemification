package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p182n6.C7258g;
import p182n6.C7264i;
import p183n7.C7323n0;
import p195o6.C7461a;

public class ActivityTransitionEvent extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ActivityTransitionEvent> CREATOR = new C7323n0();

    /* renamed from: d */
    private final int f13878d;

    /* renamed from: e */
    private final int f13879e;

    /* renamed from: f */
    private final long f13880f;

    public ActivityTransitionEvent(int i, int i2, long j) {
        ActivityTransition.m17334x(i2);
        this.f13878d = i;
        this.f13879e = i2;
        this.f13880f = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityTransitionEvent)) {
            return false;
        }
        ActivityTransitionEvent activityTransitionEvent = (ActivityTransitionEvent) obj;
        if (this.f13878d == activityTransitionEvent.f13878d && this.f13879e == activityTransitionEvent.f13879e && this.f13880f == activityTransitionEvent.f13880f) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return C7258g.m27881b(Integer.valueOf(this.f13878d), Integer.valueOf(this.f13879e), Long.valueOf(this.f13880f));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.f13878d;
        StringBuilder sb2 = new StringBuilder(24);
        sb2.append("ActivityType ");
        sb2.append(i);
        sb.append(sb2.toString());
        sb.append(" ");
        int i2 = this.f13879e;
        StringBuilder sb3 = new StringBuilder(26);
        sb3.append("TransitionType ");
        sb3.append(i2);
        sb.append(sb3.toString());
        sb.append(" ");
        long j = this.f13880f;
        StringBuilder sb4 = new StringBuilder(41);
        sb4.append("ElapsedRealTimeNanos ");
        sb4.append(j);
        sb.append(sb4.toString());
        return sb.toString();
    }

    /* renamed from: v */
    public int mo13889v() {
        return this.f13878d;
    }

    /* renamed from: w */
    public long mo13890w() {
        return this.f13880f;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C7264i.m27902k(parcel);
        int a = C7461a.m28369a(parcel);
        C7461a.m28383o(parcel, 1, mo13889v());
        C7461a.m28383o(parcel, 2, mo13892x());
        C7461a.m28387s(parcel, 3, mo13890w());
        C7461a.m28370b(parcel, a);
    }

    /* renamed from: x */
    public int mo13892x() {
        return this.f13879e;
    }
}
