package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p182n6.C7258g;
import p195o6.C7461a;
import p222q7.C7913r;

public final class StreetViewSource extends AbstractSafeParcelable {
    public static final Parcelable.Creator<StreetViewSource> CREATOR = new C7913r();

    /* renamed from: e */
    public static final StreetViewSource f14138e = new StreetViewSource(0);

    /* renamed from: f */
    public static final StreetViewSource f14139f = new StreetViewSource(1);

    /* renamed from: d */
    private final int f14140d;

    public StreetViewSource(int i) {
        this.f14140d = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof StreetViewSource) && this.f14140d == ((StreetViewSource) obj).f14140d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return C7258g.m27881b(Integer.valueOf(this.f14140d));
    }

    public String toString() {
        String str;
        int i = this.f14140d;
        if (i == 0) {
            str = "DEFAULT";
        } else if (i != 1) {
            str = String.format("UNKNOWN(%s)", new Object[]{Integer.valueOf(i)});
        } else {
            str = "OUTDOOR";
        }
        return String.format("StreetViewSource:%s", new Object[]{str});
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28383o(parcel, 2, this.f14140d);
        C7461a.m28370b(parcel, a);
    }
}
