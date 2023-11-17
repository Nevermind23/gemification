package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p182n6.C7258g;
import p195o6.C7461a;

public final class zzw extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzw> CREATOR = new C4549w();

    /* renamed from: d */
    boolean f13993d;

    /* renamed from: e */
    long f13994e;

    /* renamed from: f */
    float f13995f;

    /* renamed from: g */
    long f13996g;

    /* renamed from: h */
    int f13997h;

    public zzw() {
        this(true, 50, Utils.FLOAT_EPSILON, Long.MAX_VALUE, Integer.MAX_VALUE);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzw)) {
            return false;
        }
        zzw zzw = (zzw) obj;
        if (this.f13993d == zzw.f13993d && this.f13994e == zzw.f13994e && Float.compare(this.f13995f, zzw.f13995f) == 0 && this.f13996g == zzw.f13996g && this.f13997h == zzw.f13997h) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return C7258g.m27881b(Boolean.valueOf(this.f13993d), Long.valueOf(this.f13994e), Float.valueOf(this.f13995f), Long.valueOf(this.f13996g), Integer.valueOf(this.f13997h));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DeviceOrientationRequest[mShouldUseMag=");
        sb.append(this.f13993d);
        sb.append(" mMinimumSamplingPeriodMs=");
        sb.append(this.f13994e);
        sb.append(" mSmallestAngleChangeRadians=");
        sb.append(this.f13995f);
        long j = this.f13996g;
        if (j != Long.MAX_VALUE) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            sb.append(" expireIn=");
            sb.append(j - elapsedRealtime);
            sb.append("ms");
        }
        if (this.f13997h != Integer.MAX_VALUE) {
            sb.append(" num=");
            sb.append(this.f13997h);
        }
        sb.append(']');
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28372d(parcel, 1, this.f13993d);
        C7461a.m28387s(parcel, 2, this.f13994e);
        C7461a.m28380l(parcel, 3, this.f13995f);
        C7461a.m28387s(parcel, 4, this.f13996g);
        C7461a.m28383o(parcel, 5, this.f13997h);
        C7461a.m28370b(parcel, a);
    }

    zzw(boolean z, long j, float f, long j2, int i) {
        this.f13993d = z;
        this.f13994e = j;
        this.f13995f = f;
        this.f13996g = j2;
        this.f13997h = i;
    }
}
