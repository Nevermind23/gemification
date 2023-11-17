package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p182n6.C7258g;
import p195o6.C7461a;

public final class zzaz extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaz> CREATOR = new C4875h();

    /* renamed from: d */
    final int f15261d;

    /* renamed from: e */
    final int f15262e;

    /* renamed from: f */
    final int f15263f;

    /* renamed from: g */
    final int f15264g;

    zzaz(int i, int i2, int i3, int i4) {
        this.f15261d = i;
        this.f15262e = i2;
        this.f15263f = i3;
        this.f15264g = i4;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzaz) {
            zzaz zzaz = (zzaz) obj;
            if (this.f15261d == zzaz.f15261d && this.f15262e == zzaz.f15262e && this.f15263f == zzaz.f15263f && this.f15264g == zzaz.f15264g) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return C7258g.m27881b(Integer.valueOf(this.f15261d), Integer.valueOf(this.f15262e), Integer.valueOf(this.f15263f), Integer.valueOf(this.f15264g));
    }

    public final String toString() {
        return C7258g.m27882c(this).mo21632a("transactionDelivery", Integer.valueOf(this.f15261d)).mo21632a("transactionLimit", Integer.valueOf(this.f15262e)).mo21632a("supportedTransactions", Integer.valueOf(this.f15263f)).mo21632a("deliveryPreference", Integer.valueOf(this.f15264g)).toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28383o(parcel, 2, this.f15261d);
        C7461a.m28383o(parcel, 3, this.f15262e);
        C7461a.m28383o(parcel, 4, this.f15263f);
        C7461a.m28383o(parcel, 5, this.f15264g);
        C7461a.m28370b(parcel, a);
    }
}
