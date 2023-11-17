package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p182n6.C7258g;
import p195o6.C7461a;
import p325y7.C9098p;

public final class zzx extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzx> CREATOR = new C9098p();

    /* renamed from: d */
    final int f15290d;

    /* renamed from: e */
    final long f15291e;

    public zzx(int i, long j) {
        this.f15290d = i;
        this.f15291e = j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzx) {
            zzx zzx = (zzx) obj;
            if (this.f15290d == zzx.f15290d && this.f15291e == zzx.f15291e) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return C7258g.m27881b(Integer.valueOf(this.f15290d), Long.valueOf(this.f15291e));
    }

    public final String toString() {
        return C7258g.m27882c(this).mo21632a("result", Integer.valueOf(this.f15290d)).mo21632a("timeMillis", Long.valueOf(this.f15291e)).toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28383o(parcel, 1, this.f15290d);
        C7461a.m28387s(parcel, 2, this.f15291e);
        C7461a.m28370b(parcel, a);
    }
}
