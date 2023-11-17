package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p182n6.C7258g;
import p182n6.C7264i;
import p195o6.C7461a;

public class ActivityTransition extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ActivityTransition> CREATOR = new C4545s();

    /* renamed from: d */
    private final int f13876d;

    /* renamed from: e */
    private final int f13877e;

    ActivityTransition(int i, int i2) {
        this.f13876d = i;
        this.f13877e = i2;
    }

    /* renamed from: x */
    public static void m17334x(int i) {
        boolean z = false;
        if (i >= 0 && i <= 1) {
            z = true;
        }
        StringBuilder sb = new StringBuilder(41);
        sb.append("Transition type ");
        sb.append(i);
        sb.append(" is not valid.");
        C7264i.m27893b(z, sb.toString());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityTransition)) {
            return false;
        }
        ActivityTransition activityTransition = (ActivityTransition) obj;
        if (this.f13876d == activityTransition.f13876d && this.f13877e == activityTransition.f13877e) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return C7258g.m27881b(Integer.valueOf(this.f13876d), Integer.valueOf(this.f13877e));
    }

    public String toString() {
        int i = this.f13876d;
        int i2 = this.f13877e;
        StringBuilder sb = new StringBuilder(75);
        sb.append("ActivityTransition [mActivityType=");
        sb.append(i);
        sb.append(", mTransitionType=");
        sb.append(i2);
        sb.append(']');
        return sb.toString();
    }

    /* renamed from: v */
    public int mo13883v() {
        return this.f13876d;
    }

    /* renamed from: w */
    public int mo13884w() {
        return this.f13877e;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C7264i.m27902k(parcel);
        int a = C7461a.m28369a(parcel);
        C7461a.m28383o(parcel, 1, mo13883v());
        C7461a.m28383o(parcel, 2, mo13884w());
        C7461a.m28370b(parcel, a);
    }
}
