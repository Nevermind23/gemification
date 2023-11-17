package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p182n6.C7258g;
import p182n6.C7264i;
import p183n7.C7319l0;
import p195o6.C7461a;

public final class zzce extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzce> CREATOR = new C7319l0();

    /* renamed from: d */
    private final int f13980d;

    /* renamed from: e */
    private final int f13981e;

    /* renamed from: f */
    private final int f13982f;

    /* renamed from: g */
    private final int f13983g;

    public zzce(int i, int i2, int i3, int i4) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5 = true;
        if (i < 0 || i > 23) {
            z = false;
        } else {
            z = true;
        }
        C7264i.m27906o(z, "Start hour must be in range [0, 23].");
        if (i2 < 0 || i2 > 59) {
            z2 = false;
        } else {
            z2 = true;
        }
        C7264i.m27906o(z2, "Start minute must be in range [0, 59].");
        if (i3 < 0 || i3 > 23) {
            z3 = false;
        } else {
            z3 = true;
        }
        C7264i.m27906o(z3, "End hour must be in range [0, 23].");
        if (i4 < 0 || i4 > 59) {
            z4 = false;
        } else {
            z4 = true;
        }
        C7264i.m27906o(z4, "End minute must be in range [0, 59].");
        C7264i.m27906o(((i + i2) + i3) + i4 <= 0 ? false : z5, "Parameters can't be all 0.");
        this.f13980d = i;
        this.f13981e = i2;
        this.f13982f = i3;
        this.f13983g = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzce)) {
            return false;
        }
        zzce zzce = (zzce) obj;
        if (this.f13980d == zzce.f13980d && this.f13981e == zzce.f13981e && this.f13982f == zzce.f13982f && this.f13983g == zzce.f13983g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return C7258g.m27881b(Integer.valueOf(this.f13980d), Integer.valueOf(this.f13981e), Integer.valueOf(this.f13982f), Integer.valueOf(this.f13983g));
    }

    public final String toString() {
        int i = this.f13980d;
        int i2 = this.f13981e;
        int i3 = this.f13982f;
        int i4 = this.f13983g;
        StringBuilder sb = new StringBuilder(117);
        sb.append("UserPreferredSleepWindow [startHour=");
        sb.append(i);
        sb.append(", startMinute=");
        sb.append(i2);
        sb.append(", endHour=");
        sb.append(i3);
        sb.append(", endMinute=");
        sb.append(i4);
        sb.append(']');
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C7264i.m27902k(parcel);
        int a = C7461a.m28369a(parcel);
        C7461a.m28383o(parcel, 1, this.f13980d);
        C7461a.m28383o(parcel, 2, this.f13981e);
        C7461a.m28383o(parcel, 3, this.f13982f);
        C7461a.m28383o(parcel, 4, this.f13983g);
        C7461a.m28370b(parcel, a);
    }
}
