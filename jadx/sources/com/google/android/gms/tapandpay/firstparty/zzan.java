package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p182n6.C7258g;
import p195o6.C7461a;

public final class zzan extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzan> CREATOR = new C4871d();

    /* renamed from: d */
    final int f15242d;

    /* renamed from: e */
    final int f15243e;

    zzan(int i, int i2) {
        this.f15242d = i;
        this.f15243e = i2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzan) {
            zzan zzan = (zzan) obj;
            if (!C7258g.m27880a(Integer.valueOf(this.f15242d), Integer.valueOf(zzan.f15242d)) || !C7258g.m27880a(Integer.valueOf(this.f15243e), Integer.valueOf(zzan.f15243e))) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return C7258g.m27881b(Integer.valueOf(this.f15242d), Integer.valueOf(this.f15243e));
    }

    public final String toString() {
        return C7258g.m27882c(this).mo21632a("accountType", Integer.valueOf(this.f15242d)).mo21632a("status", Integer.valueOf(this.f15243e)).toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28383o(parcel, 1, this.f15242d);
        C7461a.m28383o(parcel, 2, this.f15243e);
        C7461a.m28370b(parcel, a);
    }
}
