package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.medallia.digital.mobilesdk.C10749b8;
import p182n6.C7258g;
import p182n6.C7264i;
import p195o6.C7461a;

public final class LocationRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationRequest> CREATOR = new C4539m();

    /* renamed from: d */
    int f13917d;

    /* renamed from: e */
    long f13918e;

    /* renamed from: f */
    long f13919f;

    /* renamed from: g */
    boolean f13920g;

    /* renamed from: h */
    long f13921h;

    /* renamed from: i */
    int f13922i;

    /* renamed from: j */
    float f13923j;

    /* renamed from: k */
    long f13924k;

    /* renamed from: l */
    boolean f13925l;

    @Deprecated
    public LocationRequest() {
        this(102, C10749b8.C10751b.f30744c, 600000, false, Long.MAX_VALUE, Integer.MAX_VALUE, Utils.FLOAT_EPSILON, 0, false);
    }

    /* renamed from: v */
    public static LocationRequest m17356v() {
        return new LocationRequest(102, C10749b8.C10751b.f30744c, 600000, false, Long.MAX_VALUE, Integer.MAX_VALUE, Utils.FLOAT_EPSILON, 0, true);
    }

    /* renamed from: R */
    public LocationRequest mo13934R(long j) {
        boolean z;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        C7264i.m27894c(z, "illegal interval: %d", Long.valueOf(j));
        this.f13918e = j;
        if (!this.f13920g) {
            this.f13919f = (long) (((double) j) / 6.0d);
        }
        return this;
    }

    public boolean equals(Object obj) {
        if (obj instanceof LocationRequest) {
            LocationRequest locationRequest = (LocationRequest) obj;
            if (this.f13917d == locationRequest.f13917d && this.f13918e == locationRequest.f13918e && this.f13919f == locationRequest.f13919f && this.f13920g == locationRequest.f13920g && this.f13921h == locationRequest.f13921h && this.f13922i == locationRequest.f13922i && this.f13923j == locationRequest.f13923j && mo13940w() == locationRequest.mo13940w() && this.f13925l == locationRequest.f13925l) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: f0 */
    public LocationRequest mo13936f0(int i) {
        if (i > 0) {
            this.f13922i = i;
            return this;
        }
        StringBuilder sb = new StringBuilder(31);
        sb.append("invalid numUpdates: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    public int hashCode() {
        return C7258g.m27881b(Integer.valueOf(this.f13917d), Long.valueOf(this.f13918e), Float.valueOf(this.f13923j), Long.valueOf(this.f13924k));
    }

    /* renamed from: q0 */
    public LocationRequest mo13938q0(int i) {
        boolean z;
        if (!(i == 100 || i == 102 || i == 104)) {
            if (i == 105) {
                i = 105;
            } else {
                z = false;
                C7264i.m27894c(z, "illegal priority: %d", Integer.valueOf(i));
                this.f13917d = i;
                return this;
            }
        }
        z = true;
        C7264i.m27894c(z, "illegal priority: %d", Integer.valueOf(i));
        this.f13917d = i;
        return this;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("Request[");
        int i = this.f13917d;
        if (i == 100) {
            str = "PRIORITY_HIGH_ACCURACY";
        } else if (i == 102) {
            str = "PRIORITY_BALANCED_POWER_ACCURACY";
        } else if (i == 104) {
            str = "PRIORITY_LOW_POWER";
        } else if (i != 105) {
            str = "???";
        } else {
            str = "PRIORITY_NO_POWER";
        }
        sb.append(str);
        if (this.f13917d != 105) {
            sb.append(" requested=");
            sb.append(this.f13918e);
            sb.append("ms");
        }
        sb.append(" fastest=");
        sb.append(this.f13919f);
        sb.append("ms");
        if (this.f13924k > this.f13918e) {
            sb.append(" maxWait=");
            sb.append(this.f13924k);
            sb.append("ms");
        }
        if (this.f13923j > Utils.FLOAT_EPSILON) {
            sb.append(" smallestDisplacement=");
            sb.append(this.f13923j);
            sb.append("m");
        }
        long j = this.f13921h;
        if (j != Long.MAX_VALUE) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            sb.append(" expireIn=");
            sb.append(j - elapsedRealtime);
            sb.append("ms");
        }
        if (this.f13922i != Integer.MAX_VALUE) {
            sb.append(" num=");
            sb.append(this.f13922i);
        }
        sb.append(']');
        return sb.toString();
    }

    /* renamed from: w */
    public long mo13940w() {
        long j = this.f13924k;
        long j2 = this.f13918e;
        return j < j2 ? j2 : j;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28383o(parcel, 1, this.f13917d);
        C7461a.m28387s(parcel, 2, this.f13918e);
        C7461a.m28387s(parcel, 3, this.f13919f);
        C7461a.m28372d(parcel, 4, this.f13920g);
        C7461a.m28387s(parcel, 5, this.f13921h);
        C7461a.m28383o(parcel, 6, this.f13922i);
        C7461a.m28380l(parcel, 7, this.f13923j);
        C7461a.m28387s(parcel, 8, this.f13924k);
        C7461a.m28372d(parcel, 9, this.f13925l);
        C7461a.m28370b(parcel, a);
    }

    /* renamed from: x */
    public LocationRequest mo13942x(long j) {
        boolean z;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        C7264i.m27894c(z, "illegal fastest interval: %d", Long.valueOf(j));
        this.f13920g = true;
        this.f13919f = j;
        return this;
    }

    LocationRequest(int i, long j, long j2, boolean z, long j3, int i2, float f, long j4, boolean z2) {
        this.f13917d = i;
        this.f13918e = j;
        this.f13919f = j2;
        this.f13920g = z;
        this.f13921h = j3;
        this.f13922i = i2;
        this.f13923j = f;
        this.f13924k = j4;
        this.f13925l = z2;
    }
}
