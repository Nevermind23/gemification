package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p118i7.C6605p;
import p182n6.C7258g;
import p183n7.C7333t;
import p195o6.C7461a;
import p260t6.C8417s;

public final class CurrentLocationRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CurrentLocationRequest> CREATOR = new C4547u();

    /* renamed from: d */
    private final long f13888d;

    /* renamed from: e */
    private final int f13889e;

    /* renamed from: f */
    private final int f13890f;

    /* renamed from: g */
    private final long f13891g;

    /* renamed from: h */
    private final boolean f13892h;

    /* renamed from: i */
    private final WorkSource f13893i;

    CurrentLocationRequest(long j, int i, int i2, long j2, boolean z, WorkSource workSource) {
        this.f13888d = j;
        this.f13889e = i;
        this.f13890f = i2;
        this.f13891g = j2;
        this.f13892h = z;
        this.f13893i = workSource;
    }

    /* renamed from: R */
    public int mo13901R() {
        return this.f13890f;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof CurrentLocationRequest)) {
            return false;
        }
        CurrentLocationRequest currentLocationRequest = (CurrentLocationRequest) obj;
        if (this.f13888d == currentLocationRequest.f13888d && this.f13889e == currentLocationRequest.f13889e && this.f13890f == currentLocationRequest.f13890f && this.f13891g == currentLocationRequest.f13891g && this.f13892h == currentLocationRequest.f13892h && C7258g.m27880a(this.f13893i, currentLocationRequest.f13893i)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return C7258g.m27881b(Long.valueOf(this.f13888d), Integer.valueOf(this.f13889e), Integer.valueOf(this.f13890f), Long.valueOf(this.f13891g));
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("CurrentLocationRequest[");
        int i = this.f13890f;
        if (i == 100) {
            str = "HIGH_ACCURACY";
        } else if (i == 102) {
            str = "BALANCED_POWER_ACCURACY";
        } else if (i == 104) {
            str = "LOW_POWER";
        } else if (i == 105) {
            str = "PASSIVE";
        } else {
            throw new IllegalArgumentException();
        }
        sb.append(str);
        if (this.f13888d != Long.MAX_VALUE) {
            sb.append(", maxAge=");
            C6605p.m25967a(this.f13888d, sb);
        }
        if (this.f13891g != Long.MAX_VALUE) {
            sb.append(", duration=");
            sb.append(this.f13891g);
            sb.append("ms");
        }
        if (this.f13889e != 0) {
            sb.append(", ");
            sb.append(C7333t.m27986a(this.f13889e));
        }
        if (this.f13892h) {
            sb.append(", bypass");
        }
        if (!C8417s.m31582d(this.f13893i)) {
            sb.append(", workSource=");
            sb.append(this.f13893i);
        }
        sb.append(']');
        return sb.toString();
    }

    /* renamed from: v */
    public long mo13905v() {
        return this.f13891g;
    }

    /* renamed from: w */
    public int mo13906w() {
        return this.f13889e;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28387s(parcel, 1, mo13908x());
        C7461a.m28383o(parcel, 2, mo13906w());
        C7461a.m28383o(parcel, 3, mo13901R());
        C7461a.m28387s(parcel, 4, mo13905v());
        C7461a.m28372d(parcel, 5, this.f13892h);
        C7461a.m28390v(parcel, 6, this.f13893i, i, false);
        C7461a.m28370b(parcel, a);
    }

    /* renamed from: x */
    public long mo13908x() {
        return this.f13888d;
    }
}
