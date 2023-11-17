package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p182n6.C7258g;
import p195o6.C7461a;

@Deprecated
public final class zzbv extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbv> CREATOR = new C4542p();

    /* renamed from: d */
    public final int f13973d;

    /* renamed from: e */
    public final int f13974e;

    /* renamed from: f */
    public final long f13975f;

    /* renamed from: g */
    public final long f13976g;

    zzbv(int i, int i2, long j, long j2) {
        this.f13973d = i;
        this.f13974e = i2;
        this.f13975f = j;
        this.f13976g = j2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzbv) {
            zzbv zzbv = (zzbv) obj;
            if (this.f13973d == zzbv.f13973d && this.f13974e == zzbv.f13974e && this.f13975f == zzbv.f13975f && this.f13976g == zzbv.f13976g) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return C7258g.m27881b(Integer.valueOf(this.f13974e), Integer.valueOf(this.f13973d), Long.valueOf(this.f13976g), Long.valueOf(this.f13975f));
    }

    public final String toString() {
        int i = this.f13973d;
        int i2 = this.f13974e;
        long j = this.f13976g;
        long j2 = this.f13975f;
        StringBuilder sb = new StringBuilder(147);
        sb.append("NetworkLocationStatus: Wifi status: ");
        sb.append(i);
        sb.append(" Cell status: ");
        sb.append(i2);
        sb.append(" elapsed time NS: ");
        sb.append(j);
        sb.append(" system time ms: ");
        sb.append(j2);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28383o(parcel, 1, this.f13973d);
        C7461a.m28383o(parcel, 2, this.f13974e);
        C7461a.m28387s(parcel, 3, this.f13975f);
        C7461a.m28387s(parcel, 4, this.f13976g);
        C7461a.m28370b(parcel, a);
    }
}
