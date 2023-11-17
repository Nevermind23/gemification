package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import p182n6.C7258g;
import p195o6.C7461a;

public final class LocationAvailability extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationAvailability> CREATOR = new C4538l();

    /* renamed from: i */
    public static final LocationAvailability f13910i = new LocationAvailability(0, 1, 1, 0, (zzbv[]) null, true);

    /* renamed from: j */
    public static final LocationAvailability f13911j = new LocationAvailability(1000, 1, 1, 0, (zzbv[]) null, false);

    /* renamed from: d */
    private final int f13912d;

    /* renamed from: e */
    private final int f13913e;

    /* renamed from: f */
    private final long f13914f;

    /* renamed from: g */
    int f13915g;

    /* renamed from: h */
    private final zzbv[] f13916h;

    LocationAvailability(int i, int i2, int i3, long j, zzbv[] zzbvArr, boolean z) {
        this.f13915g = i < 1000 ? 0 : 1000;
        this.f13912d = i2;
        this.f13913e = i3;
        this.f13914f = j;
        this.f13916h = zzbvArr;
    }

    public boolean equals(Object obj) {
        if (obj instanceof LocationAvailability) {
            LocationAvailability locationAvailability = (LocationAvailability) obj;
            if (this.f13912d == locationAvailability.f13912d && this.f13913e == locationAvailability.f13913e && this.f13914f == locationAvailability.f13914f && this.f13915g == locationAvailability.f13915g && Arrays.equals(this.f13916h, locationAvailability.f13916h)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return C7258g.m27881b(Integer.valueOf(this.f13915g));
    }

    public String toString() {
        boolean v = mo13932v();
        StringBuilder sb = new StringBuilder(27);
        sb.append("LocationAvailability[");
        sb.append(v);
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: v */
    public boolean mo13932v() {
        return this.f13915g < 1000;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28383o(parcel, 1, this.f13912d);
        C7461a.m28383o(parcel, 2, this.f13913e);
        C7461a.m28387s(parcel, 3, this.f13914f);
        C7461a.m28383o(parcel, 4, this.f13915g);
        C7461a.m28363B(parcel, 5, this.f13916h, i, false);
        C7461a.m28372d(parcel, 6, mo13932v());
        C7461a.m28370b(parcel, a);
    }
}
